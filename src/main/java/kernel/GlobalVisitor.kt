package kernel

import Errors
import MyError
import kernel.antlr.kernelBaseVisitor
import kernel.antlr.kernelParser
import org.apache.commons.lang3.StringUtils
import symboltable.ClassSymbol
import symboltable.MethodSymbol
import symboltable.Scope
import symboltable.Symbol
import typesystem.ExpressionTypeChecker
import typesystem.MethodParameter
import typesystem.TSType
import typesystem.TypeSystem

class GlobalVisitor : kernelBaseVisitor<Any>() {

    val globalScope = Scope(parent = null, name = "GLOBAL")
    val errors = Errors()
    val typeSystem = TypeSystem()
    var expressionTypeChecker = ExpressionTypeChecker(typeSystem, errors)

    override fun visitProgram(ctx: kernelParser.ProgramContext?) {
        globalScope["print"] = MethodSymbol("void", "print", TSType("void"))
        globalScope["initOpenCL"] = MethodSymbol("void", "initOpenCL", TSType("void"))
        super.visitProgram(ctx)

        print(errors.getErrors())
    }

    override fun visitDeclaration(ctx: kernelParser.DeclarationContext?) {
        val isBuiltInType = !StringUtils.isBlank(ctx?.typeName()?.text)
        val type = ctx?.typeName()?.text ?: throw RuntimeException("No variable type given!")
        val varName = ctx?.variable()?.text ?: throw RuntimeException("No variable name given!")
        val tType = TSType(type)
        val rhs: String? =
            ctx?.expression()?.literal()?.variable()?.text ?: ctx?.expression()?.literal()?.text ?: ctx?.expression()?.literal()?.text ?: ctx?.expression()?.literal()?.text
            ?: ctx?.expression()?.text ?: ctx?.expression()?.literal()?.text

        if (/*ctx?.WORD()?.size == 2 && */isBuiltInType) {
            if (!isCorrectType(tType, rhs)) {
//                errors.add(
//                    MyError(
//                        "Variable on right side of assignment to ${varName} is of incorrect type! (type ${
//                            getType(
//                                varName
//                            )
//                        })",
//                        ctx.start.line, ctx.start.charPositionInLine
//                    )
//                )
            }
        } else if (/*ctx?.WORD()?.size == 2 && */!isBuiltInType) {
            if (!isCorrectType(tType, ctx?.expression()?.literal()?.methodCall()?.methodCallParameter(0)?.text)) {
                errors.add(
                    MyError(
                        "Variable on right side of assignment" +
                                " to $varName is of incorrect type! (type ${getType(varName)})",
                        ctx.start.line,
                        ctx.start.charPositionInLine
                    )
                )
            }
        }

        if (!StringUtils.isBlank(ctx?.MEMORY_QUALIFIER()?.text)) {
            if (globalScope[varName] != null) {
                if (ctx != null) { // TODO
                    errors.add(MyError("GlobalVisitor: Variable already defined!", ctx.start.line, ctx.start.charPositionInLine))
                }
            }
        }

        globalScope[varName] = Symbol(varName!!, tType)

        super.visitDeclaration(ctx)
    }

    override fun visitClass(ctx: kernelParser.ClassContext?) {
        val className = ctx?.className(0)?.text ?: throw RuntimeException("No class name given!")
        val parentClass = if (ctx.EXTENDS()?.text == "extends") ctx.className(1).text else null

        if (globalScope[className] != null) {
            errors.add(MyError("Class already defined!", ctx.start.line, ctx.start.charPositionInLine))
        }

        val type = TSType(className)
        if (parentClass != null) {
            if (globalScope[parentClass] != null) {
                type.parents.add(TSType(parentClass))
            } else {
                errors.add(MyError("No such parent class defined!", ctx.start.line, ctx.start.charPositionInLine))
            }
        }
        typeSystem.addType(type)

        val clazz = ClassSymbol(className, parentClass)
        val properties = ctx.WORD()
        val methods = ctx.method()

        val types = ctx?.typeName()!!.subList(0, ctx?.typeName()!!.size)

        if (types.size != properties.size) {
            errors.add(MyError("Property - Type mismatch!", ctx.start.line, ctx.start.charPositionInLine))
        }

        properties.forEachIndexed { i, p -> clazz.properties[p.text] = TSType(types[i].text) }
        methods.forEach { m ->

            val methodSymbol = MethodSymbol(
                m.methodHeader()?.KERNEL()?.text ?: "",
                m.methodHeader().WORD().text,
                TSType(m.methodHeader().typeName().text ?: "void")
            )

            m.methodHeader().parameter()
                .forEach {
                    methodSymbol.parameters.add(
                        MethodParameter(
                            it.MEMORY_QUALIFIER()?.text ?: "",
                            TSType(it.typeName().text),
                            it.WORD().text
                        )
                    )

                    clazz.methods.add(methodSymbol)
                }
            globalScope[className] = clazz
        }
        super.visitClass(ctx)
    }

    override fun visitMethod(ctx: kernelParser.MethodContext) {
        val kernel = ctx.methodHeader()?.KERNEL()?.text ?: ""
        val retType = ctx.methodHeader().typeName()?.text ?: "void"
        val retVal = ctx.methodBody().statementList().statement().filter { it.returnExpression() != null }
        val name = ctx.methodHeader()?.WORD()?.text
        val params = ctx.methodHeader().parameter();

        if (globalScope[name] != null) {
            errors.add(MyError("Method already defined!", ctx.start.line, ctx.start.charPositionInLine))
        }

        if (retVal.isNotEmpty()) {
            retVal.forEach {
                if (retType != expressionTypeChecker.getType(globalScope, it.returnExpression().text).type) {
                    errors.add(MyError("Incorrect return type!", ctx.start.line, ctx.start.charPositionInLine))
                }
            }
        }

        if (name == null) {
            errors.add(MyError("No method name given!", ctx.start.line, ctx.start.charPositionInLine))
            return // TODO
        }

        val method = MethodSymbol(kernel, name, TSType(retType))
        params.forEach { p ->
            method.parameters.add(
                MethodParameter(
                    p.MEMORY_QUALIFIER()?.text ?: "",
                    TSType(p.typeName().text),
                    p.WORD().text
                )
            )
        }

        globalScope[name] = method

    }

    private fun isCorrectType(lhs: TSType, rhs: String?): Boolean {
        return lhs.type == globalScope[rhs]?.type?.type ||
                globalScope[rhs]?.type?.parents?.contains(lhs) == true ||
                lhs.type == getType(rhs)?.type
    }

    fun isCorrectType(lhs: String, rhs: String): Boolean {
        return globalScope[lhs]?.type == globalScope[rhs]?.type ||
                globalScope[rhs]?.type?.parents?.contains(globalScope[lhs]?.type) == true
    }

    fun getType(variable: String?): TSType? {

        if (variable?.toIntOrNull() != null) {
            return typeSystem.types["int"]
        } else if (variable?.toFloatOrNull() != null) {
            return typeSystem.types["float"]
        } else if (variable == "true" || variable == "false") {
            return typeSystem.types["bool"]
        } else if (variable?.startsWith("\"") == true && variable.endsWith("\"")) {
            return typeSystem.types["string"]
        }

        return typeSystem.types[variable]
    }
}
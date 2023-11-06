import kernel.DetailedVisitor
import kernel.GlobalVisitor
import kernel.SyntaxTreeVisitor
import kernel.antlr.kernelLexer
import kernel.antlr.kernelParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import typesystem.ExpressionTypeChecker
import java.io.File

fun main() {
    println("main start")

    val filePath = "C:\\Users\\Roland\\Documents\\OpenCLPP2\\src\\main\\resources\\codegen_test.txt"
//    val filePath = "C:\\Users\\Roland\\Documents\\OpenCLPP2\\src\\main\\resources\\parsing_test.txt"
    val fileContent = File(filePath).inputStream().bufferedReader().use { it.readText() }

    val lexer = kernelLexer(CharStreams.fromString(fileContent))
    val tokens = CommonTokenStream(lexer)
    val program = kernelParser(tokens).program()

    val globalVisitor = GlobalVisitor()

    globalVisitor.visitProgram(program)
    val detailedVisitor = DetailedVisitor()
    detailedVisitor.globalScope = globalVisitor.globalScope
    detailedVisitor.typeSystem = globalVisitor.typeSystem
    detailedVisitor.expressionTypeChecker = ExpressionTypeChecker(globalVisitor.typeSystem) // not needed here

    detailedVisitor.visitProgram(program)

    val syntaxTreeVisitor = SyntaxTreeVisitor(detailedVisitor.globalScope)
    syntaxTreeVisitor.visitProgram(program)
    println(syntaxTreeVisitor.generateCode())

    println("main end")
}
import kernel.DetailedVisitor
import kernel.GlobalVisitor
import kernel.antlr.kernelLexer
import kernel.antlr.kernelParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.mock
import symboltable.MethodSymbol
import symboltable.Scope
import typesystem.ExpressionTypeChecker
import typesystem.TSType
import typesystem.TypeSystem

class DetailedVisitorTest {

    private val globalVisitor = mock<GlobalVisitor> {
        on { globalScope } doReturn Scope(parent = null, name = "GLOBAL", map = mutableMapOf(
            "print" to MethodSymbol("print", TSType("void"))
        ))
        on { typeSystem } doReturn TypeSystem()
        on { expressionTypeChecker } doReturn ExpressionTypeChecker(TypeSystem())
        on { errors } doReturn Errors()
    }
    private val detailedVisitor = DetailedVisitor()

    private fun `init`(content: String): kernelParser.ProgramContext {
        val lexer = kernelLexer(CharStreams.fromString(content))
        val tokens = CommonTokenStream(lexer)
        val program = kernelParser(tokens).program()
        globalVisitor.visitProgram(program)
        detailedVisitor.globalScope = globalVisitor.globalScope
        detailedVisitor.typeSystem = globalVisitor.typeSystem
        detailedVisitor.expressionTypeChecker = ExpressionTypeChecker(globalVisitor.typeSystem)

        return program
    }

    @Test
    fun `test builtin functions`(){
        /* GIVEN */
        val program = init(
            """
            """.trimIndent()
        )

        /* WHEN */
        detailedVisitor.visitProgram(program)
        val detailedSymbolTable = detailedVisitor.currentScope
        /* THEN */
        Assertions.assertEquals(1, detailedSymbolTable.size)
        Assertions.assertTrue(detailedSymbolTable.containsKey("print"))
        Assertions.assertNotNull(detailedSymbolTable["print"])
        Assertions.assertEquals("print", detailedSymbolTable["print"]!!.name)
        Assertions.assertEquals("void", detailedSymbolTable["print"]!!.type.type)
        Assertions.assertEquals(0, globalVisitor.errors.getErrors().length)
    }

    @Test
    fun `test`() {
        /* GIVEN */
        val program = init(
            """
                int testMethod(int a) {
                    int b = 3 * 2
                    return b
                }
            """.trimIndent()
        )

        /* WHEN */
        detailedVisitor.visitProgram(program)
        val detailedSymbolTable = detailedVisitor.currentScope
        /* THEN */
    }
}
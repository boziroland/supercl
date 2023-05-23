import kernel.DetailedVisitor
import kernel.GlobalVisitor
import kernel.antlr.kernelLexer
import kernel.antlr.kernelParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import symboltable.Scope
import typesystem.ExpressionTypeChecker

class DetailedVisitorTest {

    val globalVisitor = Mockito.mock(GlobalVisitor::class.java)
    val detailedVisitor = DetailedVisitor()

    private fun `init`(content: String) {
        val lexer = kernelLexer(CharStreams.fromString(content))
        val tokens = CommonTokenStream(lexer)
        val program = kernelParser(tokens).program()

        detailedVisitor.globalScope = globalVisitor.visitProgram(program) as Scope
        detailedVisitor.typeSystem = globalVisitor.typeSystem
        detailedVisitor.expressionTypeChecker = ExpressionTypeChecker(globalVisitor.typeSystem)
    }

    @Test
    fun `test builtin functions`(){
        /* GIVEN */
        val program = init(
            """
            """.trimIndent()
        )

        /* WHEN */
//        val detailedSymbolTable = detailedVisitor.visitProgram(detailedVisitor.globalScope) as Scope

        /* THEN */
//        Assertions.assertEquals(1, detailedSymbolTable.size)
//        Assertions.assertTrue(detailedSymbolTable.containsKey("print"))
//        Assertions.assertNotNull(detailedSymbolTable["print"])
//        Assertions.assertEquals("print", detailedSymbolTable["print"]!!.name)
//        Assertions.assertEquals("void", detailedSymbolTable["print"]!!.type.type)
//        Assertions.assertEquals(0, globalVisitor.errors.getErrors().length)
    }

}
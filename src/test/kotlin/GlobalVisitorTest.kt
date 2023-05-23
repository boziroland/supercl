import kernel.GlobalVisitor
import kernel.antlr.kernelLexer
import kernel.antlr.kernelParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import symboltable.Scope

class GlobalVisitorTest {

    val globalVisitor = GlobalVisitor()

    private fun `init`(content: String): kernelParser.ProgramContext {
        val lexer = kernelLexer(CharStreams.fromString(content))
        val tokens = CommonTokenStream(lexer)
        return kernelParser(tokens).program()
    }

    @Test
    fun `test builtin functions`(){
        /* GIVEN */
        val program = init(
            """
            """.trimIndent()
        )

        /* WHEN */
        val globalSymbolTable = globalVisitor.visitProgram(program) as Scope

        /* THEN */
        Assertions.assertEquals(1, globalSymbolTable.size)
        Assertions.assertTrue(globalSymbolTable.containsKey("print"))
        Assertions.assertNotNull(globalSymbolTable["print"])
        Assertions.assertEquals("print", globalSymbolTable["print"]!!.name)
        Assertions.assertEquals("void", globalSymbolTable["print"]!!.type.type)
        Assertions.assertEquals(0, globalVisitor.errors.getErrors().length)
    }

    @Test
    fun `test global float variable declaration`(){
        /* GIVEN */
        val program = init(
            """
                float testFloat = 3.14159
            """.trimIndent()
        )

        /* WHEN */
        val globalSymbolTable = globalVisitor.visitProgram(program) as Scope

        /* THEN */
        Assertions.assertEquals(2, globalSymbolTable.size)
        Assertions.assertTrue(globalSymbolTable.containsKey("testFloat"))
        Assertions.assertNotNull(globalSymbolTable["testFloat"])
        Assertions.assertEquals("3.14159", globalSymbolTable["testFloat"]!!.name)
        Assertions.assertEquals("float", globalSymbolTable["testFloat"]!!.type.type)
        Assertions.assertEquals(0, globalVisitor.errors.getErrors().length)
    }

    @Test
    fun `test global string variable declaration`(){
        /* GIVEN */
        val program = init(
            """
                string testString = "test"
            """.trimIndent()
        )

        /* WHEN */
        val globalSymbolTable = globalVisitor.visitProgram(program) as Scope

        /* THEN */
        Assertions.assertEquals(2, globalSymbolTable.size)
        Assertions.assertTrue(globalSymbolTable.containsKey("testString"))
        Assertions.assertNotNull(globalSymbolTable["testString"])
        Assertions.assertEquals("\"test\"", globalSymbolTable["testString"]!!.name)
        Assertions.assertEquals("string", globalSymbolTable["testString"]!!.type.type)
        Assertions.assertEquals(0, globalVisitor.errors.getErrors().length)
    }

    @Test
    fun `test global boolean variable declaration`(){
        /* GIVEN */
        val program = init(
            """
                bool testBool = true
            """.trimIndent()
        )

        /* WHEN */
        val globalSymbolTable = globalVisitor.visitProgram(program) as Scope

        /* THEN */
        Assertions.assertEquals(2, globalSymbolTable.size)
        Assertions.assertTrue(globalSymbolTable.containsKey("testBool"))
        Assertions.assertNotNull(globalSymbolTable["testBool"])
        Assertions.assertEquals("true", globalSymbolTable["testBool"]!!.name)
        Assertions.assertEquals("bool", globalSymbolTable["testBool"]!!.type.type)
        Assertions.assertEquals(0, globalVisitor.errors.getErrors().length)
    }

    @Test
    fun `test global int variable declaration`(){
        /* GIVEN */
        val program = init(
            """
                int testInt = 5
            """.trimIndent()
        )

        /* WHEN */
        val globalSymbolTable = globalVisitor.visitProgram(program) as Scope

        /* THEN */
        Assertions.assertEquals(2, globalSymbolTable.size)
        Assertions.assertTrue(globalSymbolTable.containsKey("testInt"))
        Assertions.assertNotNull(globalSymbolTable["testInt"])
        Assertions.assertEquals("5", globalSymbolTable["testInt"]!!.name)
        Assertions.assertEquals("int", globalSymbolTable["testInt"]!!.type.type)
        Assertions.assertEquals(0, globalVisitor.errors.getErrors().length)
    }

    @Test
    fun `test global incorrect variable declaration`(){
        /* GIVEN */
        val program = init(
            """
                string testInt = 5
            """.trimIndent()
        )

        /* WHEN */
        val globalSymbolTable = globalVisitor.visitProgram(program) as Scope

        /* THEN */
        Assertions.assertNotEquals(0, globalVisitor.errors.getErrors().length)
    }

    @Test
    fun `test global data class declaration`(){
        /* GIVEN */
        val program = init(
            """
                class BasicClass {
                    int data
                }
            """.trimIndent()
        )

        /* WHEN */
        val globalSymbolTable = globalVisitor.visitProgram(program) as Scope

        /* THEN */
        Assertions.assertTrue(globalVisitor.typeSystem.types.containsKey("BasicClass"))
        Assertions.assertEquals(0, globalVisitor.errors.getErrors().length)
    }

    @Test
    fun `test global basic class declaration`(){
        /* GIVEN */
        val program = init(
            """
                class BasicClass {
                    int data
                    
                    void testClassMethod(int test) {}
                }
            """.trimIndent()
        )

        /* WHEN */
        val globalSymbolTable = globalVisitor.visitProgram(program) as Scope

        /* THEN */
        Assertions.assertTrue(globalVisitor.typeSystem.types.containsKey("BasicClass"))
        Assertions.assertEquals(0, globalVisitor.errors.getErrors().length)
    }

    @Test
    fun `test global child class declaration should fail`(){
        /* GIVEN */
        val program = init(
            """
                class ChildClass extends ParentClass{
                    int data
                }
            """.trimIndent()
        )

        /* WHEN */
        val globalSymbolTable = globalVisitor.visitProgram(program) as Scope

        /* THEN */
        Assertions.assertNotEquals(0, globalVisitor.errors.getErrors().length)
    }

    @Test
    fun `test global child class declaration`(){
        /* GIVEN */
        val program = init(
            """
                class ParentClass{int parentData}
                
                class ChildClass extends ParentClass{
                    int data
                }
            """.trimIndent()
        )

        /* WHEN */
        val globalSymbolTable = globalVisitor.visitProgram(program) as Scope

        /* THEN */
        Assertions.assertEquals(0, globalVisitor.errors.getErrors().length)
    }

    @Test
    fun `test global method declaration`() {
        /* GIVEN */
        val program = init(
            """
                void testMethod() {}
            """.trimIndent()
        )

        /* WHEN */
        val globalSymbolTable = globalVisitor.visitProgram(program) as Scope

        /* THEN */
        Assertions.assertEquals(0, globalVisitor.errors.getErrors().length)
    }

    @Test
    fun `test global redefined method declaration`() {
        /* GIVEN */
        val program = init(
            """
                void testMethod() {}
                void testMethod() {}
            """.trimIndent()
        )

        /* WHEN */
        val globalSymbolTable = globalVisitor.visitProgram(program) as Scope

        /* THEN */
        Assertions.assertNotEquals(0, globalVisitor.errors.getErrors().length)
    }

    @Test
    fun `test global kernel method declaration`(){
        /* GIVEN */
        val program = init(
            """
                __kernel testMethod() {}
            """.trimIndent()
        )

        /* WHEN */
        val globalSymbolTable = globalVisitor.visitProgram(program) as Scope

        /* THEN */
        Assertions.assertEquals(0, globalVisitor.errors.getErrors().length)
    }

    @Test
    fun `test global method with return value declaration`(){
        /* GIVEN */
        val program = init(
            """
                int testMethod() {return 5}
            """.trimIndent()
        )

        /* WHEN */
        val globalSymbolTable = globalVisitor.visitProgram(program) as Scope

        /* THEN */
        Assertions.assertEquals(0, globalVisitor.errors.getErrors().length)
    }

    @Test
    fun `test global method with incorrect return value declaration`(){
        /* GIVEN */
        val program = init(
            """
                int testMethod() {return "5"}
            """.trimIndent()
        )

        /* WHEN */
        val globalSymbolTable = globalVisitor.visitProgram(program) as Scope

        /* THEN */
        Assertions.assertNotEquals(0, globalVisitor.errors.getErrors().length)
    }
}
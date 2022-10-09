import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.File

fun main(args: Array<String>) {
    println("main start")

    //val method = "__kernel add(__global a, __local b, out){ out = a + b }"
    val filePath = "C:\\Users\\Roland\\Documents\\OpenCLPP2\\src\\main\\resources\\parsing_test.txt"
    val fileContent = File(filePath).inputStream().bufferedReader().use { it.readText() }

    val lexer = kernelLexer(CharStreams.fromString(fileContent))
    val tokens = CommonTokenStream(lexer)
    val program = kernelParser(tokens).program()

    println("main end")
}
import kernel.DetailedVisitor
import kernel.GlobalVisitor
import kernel.antlr.kernelLexer
import kernel.antlr.kernelParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import symboltable.Scope
import typesystem.TypeSystem
import java.io.File

fun main() {
    println("main start")

    val filePath = "C:\\Users\\Roland\\Documents\\OpenCLPP2\\src\\main\\resources\\parsing_test.txt"
    val fileContent = File(filePath).inputStream().bufferedReader().use { it.readText() }

    val lexer = kernelLexer(CharStreams.fromString(fileContent))
    val tokens = CommonTokenStream(lexer)
    val program = kernelParser(tokens).program()

    val globalVisitor = GlobalVisitor()

    val globalSymbolTable = globalVisitor.visitProgram(program)
    val detailedVisitor = DetailedVisitor()
    detailedVisitor.globalScope = globalSymbolTable as Scope

    detailedVisitor.visitProgram(program);


    println("main end")
}

fun initTypeSystem() {
    TypeSystem.types["NullType"]?.parents?.add(TypeSystem.types["string"]!!)
    TypeSystem.types["ErrorType"]?.parents?.add(TypeSystem.types["int"]!!)
    TypeSystem.types["ErrorType"]?.parents?.add(TypeSystem.types["bool"]!!)
    TypeSystem.types["ErrorType"]?.parents?.add(TypeSystem.types["float"]!!)
    TypeSystem.types["ErrorType"]?.parents?.add(TypeSystem.types["NullType"]!!)
}
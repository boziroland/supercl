// Generated from C:/Users/Roland/Documents/OpenCLPP2/src/main/antlr\kernel.g4 by ANTLR 4.10.1
package kernel;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link kernelParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface kernelVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link kernelParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(kernelParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernelParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(kernelParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernelParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(kernelParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernelParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(kernelParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernelParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(kernelParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernelParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(kernelParser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernelParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(kernelParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernelParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(kernelParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernelParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(kernelParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernelParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(kernelParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernelParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(kernelParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernelParser#singleLineComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleLineComment(kernelParser.SingleLineCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernelParser#multiLineComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiLineComment(kernelParser.MultiLineCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernelParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(kernelParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernelParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(kernelParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(kernelParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernelParser#prefixOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixOperator(kernelParser.PrefixOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernelParser#postfixOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixOperator(kernelParser.PostfixOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernelParser#binaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperator(kernelParser.BinaryOperatorContext ctx);
}
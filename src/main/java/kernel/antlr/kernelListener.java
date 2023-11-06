// Generated from kernel.g4 by ANTLR 4.10.1
package kernel.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link kernelParser}.
 */
public interface kernelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link kernelParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(kernelParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernelParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(kernelParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernelParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(kernelParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernelParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(kernelParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernelParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(kernelParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernelParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(kernelParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernelParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(kernelParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernelParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(kernelParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernelParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(kernelParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernelParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(kernelParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernelParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(kernelParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernelParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(kernelParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernelParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(kernelParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernelParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(kernelParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernelParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(kernelParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernelParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(kernelParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernelParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(kernelParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernelParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(kernelParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernelParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(kernelParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernelParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(kernelParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernelParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(kernelParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernelParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(kernelParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernelParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(kernelParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernelParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(kernelParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernelParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(kernelParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernelParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(kernelParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernelParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(kernelParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernelParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(kernelParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernelParser#singleLineComment}.
	 * @param ctx the parse tree
	 */
	void enterSingleLineComment(kernelParser.SingleLineCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernelParser#singleLineComment}.
	 * @param ctx the parse tree
	 */
	void exitSingleLineComment(kernelParser.SingleLineCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernelParser#multiLineComment}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineComment(kernelParser.MultiLineCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernelParser#multiLineComment}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineComment(kernelParser.MultiLineCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernelParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(kernelParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernelParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(kernelParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernelParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(kernelParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernelParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(kernelParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernelParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(kernelParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernelParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(kernelParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(kernelParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(kernelParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernelParser#prefixOperator}.
	 * @param ctx the parse tree
	 */
	void enterPrefixOperator(kernelParser.PrefixOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernelParser#prefixOperator}.
	 * @param ctx the parse tree
	 */
	void exitPrefixOperator(kernelParser.PrefixOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernelParser#postfixOperator}.
	 * @param ctx the parse tree
	 */
	void enterPostfixOperator(kernelParser.PostfixOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernelParser#postfixOperator}.
	 * @param ctx the parse tree
	 */
	void exitPostfixOperator(kernelParser.PostfixOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernelParser#expressionWithReturnValue}.
	 * @param ctx the parse tree
	 */
	void enterExpressionWithReturnValue(kernelParser.ExpressionWithReturnValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernelParser#expressionWithReturnValue}.
	 * @param ctx the parse tree
	 */
	void exitExpressionWithReturnValue(kernelParser.ExpressionWithReturnValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernelParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator(kernelParser.BinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernelParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator(kernelParser.BinaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernelParser#specialAssign}.
	 * @param ctx the parse tree
	 */
	void enterSpecialAssign(kernelParser.SpecialAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernelParser#specialAssign}.
	 * @param ctx the parse tree
	 */
	void exitSpecialAssign(kernelParser.SpecialAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernelParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(kernelParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernelParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(kernelParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernelParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(kernelParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernelParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(kernelParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernelParser#cast}.
	 * @param ctx the parse tree
	 */
	void enterCast(kernelParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernelParser#cast}.
	 * @param ctx the parse tree
	 */
	void exitCast(kernelParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernelParser#andandoror}.
	 * @param ctx the parse tree
	 */
	void enterAndandoror(kernelParser.AndandororContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernelParser#andandoror}.
	 * @param ctx the parse tree
	 */
	void exitAndandoror(kernelParser.AndandororContext ctx);
}
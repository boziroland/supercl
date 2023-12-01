// Generated from simple.g4 by ANTLR 4.10.1
package kernel.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simpleParser}.
 */
public interface simpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simpleParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(simpleParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(simpleParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(simpleParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(simpleParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(simpleParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(simpleParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#lessThan}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(simpleParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#lessThan}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(simpleParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#postFix}.
	 * @param ctx the parse tree
	 */
	void enterPostFix(simpleParser.PostFixContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#postFix}.
	 * @param ctx the parse tree
	 */
	void exitPostFix(simpleParser.PostFixContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(simpleParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(simpleParser.IfStatementContext ctx);
}
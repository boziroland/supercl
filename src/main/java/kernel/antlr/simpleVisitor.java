// Generated from simple.g4 by ANTLR 4.10.1
package kernel.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link simpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface simpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link simpleParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(simpleParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(simpleParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(simpleParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#lessThan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(simpleParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#postFix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostFix(simpleParser.PostFixContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(simpleParser.IfStatementContext ctx);
}
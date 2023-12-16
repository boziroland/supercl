// Generated from kernel.g4 by ANTLR 4.10.1
package kernel.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class kernelParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, SINGLELINECOMMENT=2, MULTILINECOMMENT=3, CONNECTIVE=4, TYPE=5, 
		REALNUMBER=6, FLOAT=7, MEMORY_QUALIFIER=8, BARRIER_OPERATOR=9, KERNEL=10, 
		STRING=11, LPARENT=12, RPARENT=13, BLOCKBEGIN=14, BLOCKEND=15, LEFTBRACKET=16, 
		RIGHTBRACKET=17, PLUS=18, PLUSPLUS=19, MINUS=20, MINUSMINUS=21, STAR=22, 
		DIV=23, MOD=24, AND=25, OR=26, CONJUNCTION=27, DISJUNCTION=28, CARET=29, 
		NOT=30, TILDE=31, QUESTION=32, COLON=33, SEMI=34, COMMA=35, ASSIGN=36, 
		STARASSIGN=37, DIVASSIGN=38, MODASSIGN=39, PLUSASSIGN=40, MINUSASSIGN=41, 
		ANDASSIGN=42, XORASSIGN=43, ORASSIGN=44, EQUAL=45, NOTEQUAL=46, INLINECOMMENT=47, 
		BLOCKCOMMENTSTART=48, BLOCKCOMMENTEND=49, TRUE=50, FALSE=51, LESS=52, 
		LESSEQUAL=53, GREATER=54, GREATEREQUAL=55, CLASS=56, IF=57, ELSE=58, FOR=59, 
		WHILE=60, DEF=61, EXTENDS=62, PRIVATE=63, PUBLIC=64, PROTECTED=65, RETURN=66, 
		WS=67, WORD=68;
	public static final int
		RULE_program = 0, RULE_statementList = 1, RULE_statement = 2, RULE_for = 3, 
		RULE_className = 4, RULE_class = 5, RULE_parameter = 6, RULE_methodHeader = 7, 
		RULE_method = 8, RULE_while = 9, RULE_if = 10, RULE_else = 11, RULE_block = 12, 
		RULE_returnExpression = 13, RULE_methodBody = 14, RULE_methodCallParameter = 15, 
		RULE_methodCall = 16, RULE_declaration = 17, RULE_assignment = 18, RULE_expression = 19, 
		RULE_literal = 20, RULE_prefixOperator = 21, RULE_postfixOperator = 22, 
		RULE_expressionWithReturnValue = 23, RULE_binaryOperator = 24, RULE_specialAssign = 25, 
		RULE_variable = 26, RULE_typeName = 27, RULE_cast = 28, RULE_realNumberVec2D = 29, 
		RULE_realNumberVec3D = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statementList", "statement", "for", "className", "class", 
			"parameter", "methodHeader", "method", "while", "if", "else", "block", 
			"returnExpression", "methodBody", "methodCallParameter", "methodCall", 
			"declaration", "assignment", "expression", "literal", "prefixOperator", 
			"postfixOperator", "expressionWithReturnValue", "binaryOperator", "specialAssign", 
			"variable", "typeName", "cast", "realNumberVec2D", "realNumberVec3D"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", null, null, null, null, null, null, null, "'synchronized'", 
			"'__kernel'", null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'+'", 
			"'++'", "'-'", "'--'", "'*'", "'/'", "'%'", "'&'", "'|'", "'&&'", "'||'", 
			"'^'", "'!'", "'~'", "'?'", "':'", "';'", "','", "'='", "'*='", "'/='", 
			"'%='", "'+='", "'-='", "'&='", "'^='", "'|='", "'=='", "'!='", "'//'", 
			"'/*'", "'*/'", "'true'", "'false'", "'<'", "'<='", "'>'", "'>='", "'class '", 
			"'if'", "'else'", "'for'", "'while'", "'def'", "'extends'", "'private'", 
			"'public'", "'protected'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "SINGLELINECOMMENT", "MULTILINECOMMENT", "CONNECTIVE", "TYPE", 
			"REALNUMBER", "FLOAT", "MEMORY_QUALIFIER", "BARRIER_OPERATOR", "KERNEL", 
			"STRING", "LPARENT", "RPARENT", "BLOCKBEGIN", "BLOCKEND", "LEFTBRACKET", 
			"RIGHTBRACKET", "PLUS", "PLUSPLUS", "MINUS", "MINUSMINUS", "STAR", "DIV", 
			"MOD", "AND", "OR", "CONJUNCTION", "DISJUNCTION", "CARET", "NOT", "TILDE", 
			"QUESTION", "COLON", "SEMI", "COMMA", "ASSIGN", "STARASSIGN", "DIVASSIGN", 
			"MODASSIGN", "PLUSASSIGN", "MINUSASSIGN", "ANDASSIGN", "XORASSIGN", "ORASSIGN", 
			"EQUAL", "NOTEQUAL", "INLINECOMMENT", "BLOCKCOMMENTSTART", "BLOCKCOMMENTEND", 
			"TRUE", "FALSE", "LESS", "LESSEQUAL", "GREATER", "GREATEREQUAL", "CLASS", 
			"IF", "ELSE", "FOR", "WHILE", "DEF", "EXTENDS", "PRIVATE", "PUBLIC", 
			"PROTECTED", "RETURN", "WS", "WORD"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "kernel.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public kernelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			statementList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SINGLELINECOMMENT) | (1L << MULTILINECOMMENT) | (1L << TYPE) | (1L << MEMORY_QUALIFIER) | (1L << KERNEL) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << CLASS) | (1L << IF) | (1L << FOR) | (1L << WHILE))) != 0) || _la==RETURN || _la==WORD) {
				{
				{
				setState(64);
				statement();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode MULTILINECOMMENT() { return getToken(kernelParser.MULTILINECOMMENT, 0); }
		public TerminalNode SINGLELINECOMMENT() { return getToken(kernelParser.SINGLELINECOMMENT, 0); }
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public PrefixOperatorContext prefixOperator() {
			return getRuleContext(PrefixOperatorContext.class,0);
		}
		public PostfixOperatorContext postfixOperator() {
			return getRuleContext(PostfixOperatorContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ReturnExpressionContext returnExpression() {
			return getRuleContext(ReturnExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				if_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				for_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				while_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				methodHeader();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				method();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(76);
				methodCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(77);
				match(MULTILINECOMMENT);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(78);
				match(SINGLELINECOMMENT);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(79);
				class_();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(80);
				prefixOperator();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(81);
				postfixOperator();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(82);
				assignment();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(83);
				returnExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(kernelParser.FOR, 0); }
		public TerminalNode LPARENT() { return getToken(kernelParser.LPARENT, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(kernelParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(kernelParser.SEMI, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPARENT() { return getToken(kernelParser.RPARENT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(FOR);
			setState(87);
			match(LPARENT);
			setState(88);
			declaration();
			setState(89);
			match(SEMI);
			setState(90);
			expression();
			setState(91);
			match(SEMI);
			setState(92);
			expression();
			setState(93);
			match(RPARENT);
			setState(94);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(kernelParser.WORD, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(kernelParser.CLASS, 0); }
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public TerminalNode BLOCKBEGIN() { return getToken(kernelParser.BLOCKBEGIN, 0); }
		public TerminalNode BLOCKEND() { return getToken(kernelParser.BLOCKEND, 0); }
		public TerminalNode EXTENDS() { return getToken(kernelParser.EXTENDS, 0); }
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public List<TypeNameContext> typeName() {
			return getRuleContexts(TypeNameContext.class);
		}
		public TypeNameContext typeName(int i) {
			return getRuleContext(TypeNameContext.class,i);
		}
		public List<TerminalNode> WORD() { return getTokens(kernelParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(kernelParser.WORD, i);
		}
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(CLASS);
			setState(99);
			className();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(100);
				match(EXTENDS);
				setState(101);
				className();
				}
			}

			setState(104);
			match(BLOCKBEGIN);
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(109);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					{
					setState(105);
					typeName();
					setState(106);
					match(WORD);
					}
					}
					break;
				case 2:
					{
					setState(108);
					method();
					}
					break;
				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (TYPE - 5)) | (1L << (KERNEL - 5)) | (1L << (WORD - 5)))) != 0) );
			setState(113);
			match(BLOCKEND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode WORD() { return getToken(kernelParser.WORD, 0); }
		public TerminalNode MEMORY_QUALIFIER() { return getToken(kernelParser.MEMORY_QUALIFIER, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MEMORY_QUALIFIER) {
				{
				setState(115);
				match(MEMORY_QUALIFIER);
				}
			}

			setState(118);
			typeName();
			setState(119);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodHeaderContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(kernelParser.WORD, 0); }
		public TerminalNode LPARENT() { return getToken(kernelParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(kernelParser.RPARENT, 0); }
		public TerminalNode KERNEL() { return getToken(kernelParser.KERNEL, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(kernelParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(kernelParser.COMMA, i);
		}
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterMethodHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitMethodHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitMethodHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KERNEL:
				{
				setState(121);
				match(KERNEL);
				}
				break;
			case TYPE:
			case WORD:
				{
				setState(122);
				typeName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(125);
			match(WORD);
			setState(126);
			match(LPARENT);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (TYPE - 5)) | (1L << (MEMORY_QUALIFIER - 5)) | (1L << (WORD - 5)))) != 0)) {
				{
				setState(127);
				parameter();
				}
			}

			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(130);
				match(COMMA);
				setState(131);
				parameter();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			match(RPARENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			methodHeader();
			setState(140);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(kernelParser.WHILE, 0); }
		public TerminalNode LPARENT() { return getToken(kernelParser.LPARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(kernelParser.RPARENT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(WHILE);
			setState(143);
			match(LPARENT);
			setState(144);
			expression();
			setState(145);
			match(RPARENT);
			setState(146);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(kernelParser.IF, 0); }
		public TerminalNode LPARENT() { return getToken(kernelParser.LPARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(kernelParser.RPARENT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ElseContext> else_() {
			return getRuleContexts(ElseContext.class);
		}
		public ElseContext else_(int i) {
			return getRuleContext(ElseContext.class,i);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(IF);
			setState(149);
			match(LPARENT);
			setState(150);
			expression();
			setState(151);
			match(RPARENT);
			setState(152);
			block();
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(153);
					else_();
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(kernelParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(ELSE);
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLOCKBEGIN:
				{
				setState(160);
				block();
				}
				break;
			case IF:
				{
				setState(161);
				if_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BLOCKBEGIN() { return getToken(kernelParser.BLOCKBEGIN, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode BLOCKEND() { return getToken(kernelParser.BLOCKEND, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(BLOCKBEGIN);
			setState(165);
			statementList();
			setState(166);
			match(BLOCKEND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnExpressionContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(kernelParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterReturnExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitReturnExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitReturnExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnExpressionContext returnExpression() throws RecognitionException {
		ReturnExpressionContext _localctx = new ReturnExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_returnExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(RETURN);
			setState(169);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public TerminalNode BLOCKBEGIN() { return getToken(kernelParser.BLOCKBEGIN, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode BLOCKEND() { return getToken(kernelParser.BLOCKEND, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(BLOCKBEGIN);
			setState(172);
			statementList();
			setState(173);
			match(BLOCKEND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallParameterContext extends ParserRuleContext {
		public RealNumberVec2DContext realNumberVec2D() {
			return getRuleContext(RealNumberVec2DContext.class,0);
		}
		public RealNumberVec3DContext realNumberVec3D() {
			return getRuleContext(RealNumberVec3DContext.class,0);
		}
		public TerminalNode REALNUMBER() { return getToken(kernelParser.REALNUMBER, 0); }
		public TerminalNode STRING() { return getToken(kernelParser.STRING, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public MethodCallParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterMethodCallParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitMethodCallParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitMethodCallParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallParameterContext methodCallParameter() throws RecognitionException {
		MethodCallParameterContext _localctx = new MethodCallParameterContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_methodCallParameter);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				realNumberVec2D();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				realNumberVec3D();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				match(REALNUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(179);
				methodCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(180);
				variable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(kernelParser.WORD, 0); }
		public TerminalNode LPARENT() { return getToken(kernelParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(kernelParser.RPARENT, 0); }
		public List<MethodCallParameterContext> methodCallParameter() {
			return getRuleContexts(MethodCallParameterContext.class);
		}
		public MethodCallParameterContext methodCallParameter(int i) {
			return getRuleContext(MethodCallParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(kernelParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(kernelParser.COMMA, i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(WORD);
			setState(184);
			match(LPARENT);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (REALNUMBER - 6)) | (1L << (STRING - 6)) | (1L << (LPARENT - 6)) | (1L << (WORD - 6)))) != 0)) {
				{
				setState(185);
				methodCallParameter();
				}
			}

			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(188);
				match(COMMA);
				setState(189);
				methodCallParameter();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			match(RPARENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode MEMORY_QUALIFIER() { return getToken(kernelParser.MEMORY_QUALIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(kernelParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastContext cast() {
			return getRuleContext(CastContext.class,0);
		}
		public List<TerminalNode> LPARENT() { return getTokens(kernelParser.LPARENT); }
		public TerminalNode LPARENT(int i) {
			return getToken(kernelParser.LPARENT, i);
		}
		public List<TerminalNode> RPARENT() { return getTokens(kernelParser.RPARENT); }
		public TerminalNode RPARENT(int i) {
			return getToken(kernelParser.RPARENT, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MEMORY_QUALIFIER) {
				{
				setState(197);
				match(MEMORY_QUALIFIER);
				}
			}

			setState(200);
			typeName();
			setState(201);
			variable();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(202);
				match(ASSIGN);
				setState(204);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(203);
					cast();
					}
					break;
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(206);
						match(LPARENT);
						}
						} 
					}
					setState(211);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(212);
				expression();
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RPARENT) {
					{
					{
					setState(213);
					match(RPARENT);
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(kernelParser.ASSIGN, 0); }
		public SpecialAssignContext specialAssign() {
			return getRuleContext(SpecialAssignContext.class,0);
		}
		public TerminalNode WORD() { return getToken(kernelParser.WORD, 0); }
		public TerminalNode REALNUMBER() { return getToken(kernelParser.REALNUMBER, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode STRING() { return getToken(kernelParser.STRING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastContext cast() {
			return getRuleContext(CastContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			variable();
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(222);
				match(ASSIGN);
				}
				break;
			case STARASSIGN:
			case DIVASSIGN:
			case MODASSIGN:
			case PLUSASSIGN:
			case MINUSASSIGN:
			case ANDASSIGN:
			case XORASSIGN:
			case ORASSIGN:
				{
				setState(223);
				specialAssign();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(226);
				cast();
				}
				break;
			}
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(229);
				match(WORD);
				}
				break;
			case 2:
				{
				setState(230);
				match(REALNUMBER);
				}
				break;
			case 3:
				{
				setState(231);
				methodCall();
				}
				break;
			case 4:
				{
				setState(232);
				match(STRING);
				}
				break;
			case 5:
				{
				setState(233);
				expression();
				}
				break;
			case 6:
				{
				setState(234);
				variable();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public PrefixOperatorContext prefixOperator() {
			return getRuleContext(PrefixOperatorContext.class,0);
		}
		public PostfixOperatorContext postfixOperator() {
			return getRuleContext(PostfixOperatorContext.class,0);
		}
		public BinaryOperatorContext binaryOperator() {
			return getRuleContext(BinaryOperatorContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<TerminalNode> LPARENT() { return getTokens(kernelParser.LPARENT); }
		public TerminalNode LPARENT(int i) {
			return getToken(kernelParser.LPARENT, i);
		}
		public List<TerminalNode> CONNECTIVE() { return getTokens(kernelParser.CONNECTIVE); }
		public TerminalNode CONNECTIVE(int i) {
			return getToken(kernelParser.CONNECTIVE, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RPARENT() { return getTokens(kernelParser.RPARENT); }
		public TerminalNode RPARENT(int i) {
			return getToken(kernelParser.RPARENT, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPARENT) {
				{
				{
				setState(237);
				match(LPARENT);
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(243);
				prefixOperator();
				}
				break;
			case 2:
				{
				setState(244);
				postfixOperator();
				}
				break;
			case 3:
				{
				setState(245);
				binaryOperator();
				}
				break;
			case 4:
				{
				setState(246);
				literal();
				}
				break;
			}
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(249);
					match(CONNECTIVE);
					setState(250);
					expression();
					}
					} 
				}
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(256);
					match(RPARENT);
					}
					} 
				}
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(kernelParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(kernelParser.FALSE, 0); }
		public TerminalNode WORD() { return getToken(kernelParser.WORD, 0); }
		public TerminalNode REALNUMBER() { return getToken(kernelParser.REALNUMBER, 0); }
		public TerminalNode STRING() { return getToken(kernelParser.STRING, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_literal);
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				match(WORD);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				match(REALNUMBER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(266);
				match(STRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(267);
				variable();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(268);
				methodCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixOperatorContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode PLUSPLUS() { return getToken(kernelParser.PLUSPLUS, 0); }
		public TerminalNode MINUSMINUS() { return getToken(kernelParser.MINUSMINUS, 0); }
		public PrefixOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterPrefixOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitPrefixOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitPrefixOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixOperatorContext prefixOperator() throws RecognitionException {
		PrefixOperatorContext _localctx = new PrefixOperatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_prefixOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !(_la==PLUSPLUS || _la==MINUSMINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(272);
			variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixOperatorContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode PLUSPLUS() { return getToken(kernelParser.PLUSPLUS, 0); }
		public TerminalNode MINUSMINUS() { return getToken(kernelParser.MINUSMINUS, 0); }
		public PostfixOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterPostfixOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitPostfixOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitPostfixOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixOperatorContext postfixOperator() throws RecognitionException {
		PostfixOperatorContext _localctx = new PostfixOperatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_postfixOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			variable();
			setState(275);
			_la = _input.LA(1);
			if ( !(_la==PLUSPLUS || _la==MINUSMINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionWithReturnValueContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode WORD() { return getToken(kernelParser.WORD, 0); }
		public TerminalNode REALNUMBER() { return getToken(kernelParser.REALNUMBER, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode STRING() { return getToken(kernelParser.STRING, 0); }
		public BinaryOperatorContext binaryOperator() {
			return getRuleContext(BinaryOperatorContext.class,0);
		}
		public List<TerminalNode> LPARENT() { return getTokens(kernelParser.LPARENT); }
		public TerminalNode LPARENT(int i) {
			return getToken(kernelParser.LPARENT, i);
		}
		public List<TerminalNode> RPARENT() { return getTokens(kernelParser.RPARENT); }
		public TerminalNode RPARENT(int i) {
			return getToken(kernelParser.RPARENT, i);
		}
		public ExpressionWithReturnValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionWithReturnValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterExpressionWithReturnValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitExpressionWithReturnValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitExpressionWithReturnValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionWithReturnValueContext expressionWithReturnValue() throws RecognitionException {
		ExpressionWithReturnValueContext _localctx = new ExpressionWithReturnValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expressionWithReturnValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPARENT) {
				{
				{
				setState(277);
				match(LPARENT);
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(283);
				variable();
				}
				break;
			case 2:
				{
				setState(284);
				match(WORD);
				}
				break;
			case 3:
				{
				setState(285);
				match(REALNUMBER);
				}
				break;
			case 4:
				{
				setState(286);
				methodCall();
				}
				break;
			case 5:
				{
				setState(287);
				match(STRING);
				}
				break;
			case 6:
				{
				setState(288);
				binaryOperator();
				}
				break;
			}
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RPARENT) {
				{
				{
				setState(291);
				match(RPARENT);
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryOperatorContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode STAR() { return getToken(kernelParser.STAR, 0); }
		public TerminalNode MOD() { return getToken(kernelParser.MOD, 0); }
		public TerminalNode DIV() { return getToken(kernelParser.DIV, 0); }
		public BinaryOperatorContext binaryOperator() {
			return getRuleContext(BinaryOperatorContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(kernelParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(kernelParser.MINUS, 0); }
		public TerminalNode EQUAL() { return getToken(kernelParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(kernelParser.NOTEQUAL, 0); }
		public TerminalNode LESS() { return getToken(kernelParser.LESS, 0); }
		public TerminalNode LESSEQUAL() { return getToken(kernelParser.LESSEQUAL, 0); }
		public TerminalNode GREATER() { return getToken(kernelParser.GREATER, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(kernelParser.GREATEREQUAL, 0); }
		public BinaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterBinaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitBinaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitBinaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOperatorContext binaryOperator() throws RecognitionException {
		BinaryOperatorContext _localctx = new BinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_binaryOperator);
		int _la;
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				literal();
				setState(298);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(301);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(299);
					literal();
					}
					break;
				case 2:
					{
					setState(300);
					binaryOperator();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				literal();
				setState(304);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(307);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(305);
					literal();
					}
					break;
				case 2:
					{
					setState(306);
					binaryOperator();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				literal();
				setState(310);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << LESS) | (1L << LESSEQUAL) | (1L << GREATER) | (1L << GREATEREQUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(313);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(311);
					literal();
					}
					break;
				case 2:
					{
					setState(312);
					binaryOperator();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecialAssignContext extends ParserRuleContext {
		public TerminalNode STARASSIGN() { return getToken(kernelParser.STARASSIGN, 0); }
		public TerminalNode DIVASSIGN() { return getToken(kernelParser.DIVASSIGN, 0); }
		public TerminalNode MODASSIGN() { return getToken(kernelParser.MODASSIGN, 0); }
		public TerminalNode PLUSASSIGN() { return getToken(kernelParser.PLUSASSIGN, 0); }
		public TerminalNode MINUSASSIGN() { return getToken(kernelParser.MINUSASSIGN, 0); }
		public TerminalNode ANDASSIGN() { return getToken(kernelParser.ANDASSIGN, 0); }
		public TerminalNode XORASSIGN() { return getToken(kernelParser.XORASSIGN, 0); }
		public TerminalNode ORASSIGN() { return getToken(kernelParser.ORASSIGN, 0); }
		public SpecialAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterSpecialAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitSpecialAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitSpecialAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialAssignContext specialAssign() throws RecognitionException {
		SpecialAssignContext _localctx = new SpecialAssignContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_specialAssign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STARASSIGN) | (1L << DIVASSIGN) | (1L << MODASSIGN) | (1L << PLUSASSIGN) | (1L << MINUSASSIGN) | (1L << ANDASSIGN) | (1L << XORASSIGN) | (1L << ORASSIGN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(kernelParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(kernelParser.WORD, i);
		}
		public TerminalNode LEFTBRACKET() { return getToken(kernelParser.LEFTBRACKET, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(kernelParser.RIGHTBRACKET, 0); }
		public TerminalNode REALNUMBER() { return getToken(kernelParser.REALNUMBER, 0); }
		public List<MethodCallContext> methodCall() {
			return getRuleContexts(MethodCallContext.class);
		}
		public MethodCallContext methodCall(int i) {
			return getRuleContext(MethodCallContext.class,i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(WORD);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(320);
				match(T__0);
				setState(323);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(321);
					match(WORD);
					}
					break;
				case 2:
					{
					setState(322);
					methodCall();
					}
					break;
				}
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTBRACKET) {
				{
				setState(330);
				match(LEFTBRACKET);
				setState(331);
				_la = _input.LA(1);
				if ( !(_la==REALNUMBER || _la==WORD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(332);
				match(RIGHTBRACKET);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(kernelParser.TYPE, 0); }
		public TerminalNode WORD() { return getToken(kernelParser.WORD, 0); }
		public TerminalNode LEFTBRACKET() { return getToken(kernelParser.LEFTBRACKET, 0); }
		public TerminalNode REALNUMBER() { return getToken(kernelParser.REALNUMBER, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(kernelParser.RIGHTBRACKET, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_la = _input.LA(1);
			if ( !(_la==TYPE || _la==WORD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTBRACKET) {
				{
				setState(336);
				match(LEFTBRACKET);
				setState(337);
				match(REALNUMBER);
				setState(338);
				match(RIGHTBRACKET);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastContext extends ParserRuleContext {
		public TerminalNode LPARENT() { return getToken(kernelParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(kernelParser.RPARENT, 0); }
		public TerminalNode TYPE() { return getToken(kernelParser.TYPE, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public CastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastContext cast() throws RecognitionException {
		CastContext _localctx = new CastContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(LPARENT);
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				{
				setState(342);
				match(TYPE);
				}
				break;
			case WORD:
				{
				setState(343);
				className();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(346);
			match(RPARENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RealNumberVec2DContext extends ParserRuleContext {
		public TerminalNode LPARENT() { return getToken(kernelParser.LPARENT, 0); }
		public List<TerminalNode> REALNUMBER() { return getTokens(kernelParser.REALNUMBER); }
		public TerminalNode REALNUMBER(int i) {
			return getToken(kernelParser.REALNUMBER, i);
		}
		public TerminalNode COMMA() { return getToken(kernelParser.COMMA, 0); }
		public TerminalNode RPARENT() { return getToken(kernelParser.RPARENT, 0); }
		public RealNumberVec2DContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realNumberVec2D; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterRealNumberVec2D(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitRealNumberVec2D(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitRealNumberVec2D(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealNumberVec2DContext realNumberVec2D() throws RecognitionException {
		RealNumberVec2DContext _localctx = new RealNumberVec2DContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_realNumberVec2D);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(LPARENT);
			setState(349);
			match(REALNUMBER);
			setState(350);
			match(COMMA);
			setState(351);
			match(REALNUMBER);
			setState(352);
			match(RPARENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RealNumberVec3DContext extends ParserRuleContext {
		public TerminalNode LPARENT() { return getToken(kernelParser.LPARENT, 0); }
		public List<TerminalNode> REALNUMBER() { return getTokens(kernelParser.REALNUMBER); }
		public TerminalNode REALNUMBER(int i) {
			return getToken(kernelParser.REALNUMBER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(kernelParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(kernelParser.COMMA, i);
		}
		public TerminalNode RPARENT() { return getToken(kernelParser.RPARENT, 0); }
		public RealNumberVec3DContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realNumberVec3D; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterRealNumberVec3D(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitRealNumberVec3D(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitRealNumberVec3D(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealNumberVec3DContext realNumberVec3D() throws RecognitionException {
		RealNumberVec3DContext _localctx = new RealNumberVec3DContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_realNumberVec3D);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(LPARENT);
			setState(355);
			match(REALNUMBER);
			setState(356);
			match(COMMA);
			setState(357);
			match(REALNUMBER);
			setState(358);
			match(COMMA);
			setState(359);
			match(REALNUMBER);
			setState(360);
			match(RPARENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001D\u016b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001B\b\u0001\n\u0001\f\u0001"+
		"E\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002U\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005g\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005n\b\u0005"+
		"\u000b\u0005\f\u0005o\u0001\u0005\u0001\u0005\u0001\u0006\u0003\u0006"+
		"u\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0003\u0007|\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0081\b\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0085\b\u0007\n\u0007"+
		"\f\u0007\u0088\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\n\u009b\b\n\n\n\f\n\u009e\t\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00a3\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00b6\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00bb\b\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00bf\b"+
		"\u0010\n\u0010\f\u0010\u00c2\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0003\u0011\u00c7\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00cd\b\u0011\u0001\u0011\u0005\u0011\u00d0\b\u0011\n\u0011"+
		"\f\u0011\u00d3\t\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00d7\b\u0011"+
		"\n\u0011\f\u0011\u00da\t\u0011\u0003\u0011\u00dc\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u00e1\b\u0012\u0001\u0012\u0003\u0012\u00e4"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u00ec\b\u0012\u0001\u0013\u0005\u0013\u00ef\b\u0013"+
		"\n\u0013\f\u0013\u00f2\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u00f8\b\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00fc"+
		"\b\u0013\n\u0013\f\u0013\u00ff\t\u0013\u0001\u0013\u0005\u0013\u0102\b"+
		"\u0013\n\u0013\f\u0013\u0105\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u010e\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0005\u0017\u0117\b\u0017\n\u0017\f\u0017\u011a\t\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u0122\b\u0017\u0001\u0017\u0005\u0017\u0125\b\u0017\n\u0017\f\u0017"+
		"\u0128\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u012e\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u0134\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u013a\b\u0018\u0003\u0018\u013c\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0144\b\u001a\u0005"+
		"\u001a\u0146\b\u001a\n\u001a\f\u001a\u0149\t\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u014e\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u0154\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u0159\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0000\u0000\u001f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<\u0000\u0007"+
		"\u0002\u0000\u0013\u0013\u0015\u0015\u0001\u0000\u0016\u0018\u0002\u0000"+
		"\u0012\u0012\u0014\u0014\u0002\u0000-.47\u0001\u0000%,\u0002\u0000\u0006"+
		"\u0006DD\u0002\u0000\u0005\u0005DD\u0192\u0000>\u0001\u0000\u0000\u0000"+
		"\u0002C\u0001\u0000\u0000\u0000\u0004T\u0001\u0000\u0000\u0000\u0006V"+
		"\u0001\u0000\u0000\u0000\b`\u0001\u0000\u0000\u0000\nb\u0001\u0000\u0000"+
		"\u0000\ft\u0001\u0000\u0000\u0000\u000e{\u0001\u0000\u0000\u0000\u0010"+
		"\u008b\u0001\u0000\u0000\u0000\u0012\u008e\u0001\u0000\u0000\u0000\u0014"+
		"\u0094\u0001\u0000\u0000\u0000\u0016\u009f\u0001\u0000\u0000\u0000\u0018"+
		"\u00a4\u0001\u0000\u0000\u0000\u001a\u00a8\u0001\u0000\u0000\u0000\u001c"+
		"\u00ab\u0001\u0000\u0000\u0000\u001e\u00b5\u0001\u0000\u0000\u0000 \u00b7"+
		"\u0001\u0000\u0000\u0000\"\u00c6\u0001\u0000\u0000\u0000$\u00dd\u0001"+
		"\u0000\u0000\u0000&\u00f0\u0001\u0000\u0000\u0000(\u010d\u0001\u0000\u0000"+
		"\u0000*\u010f\u0001\u0000\u0000\u0000,\u0112\u0001\u0000\u0000\u0000."+
		"\u0118\u0001\u0000\u0000\u00000\u013b\u0001\u0000\u0000\u00002\u013d\u0001"+
		"\u0000\u0000\u00004\u013f\u0001\u0000\u0000\u00006\u014f\u0001\u0000\u0000"+
		"\u00008\u0155\u0001\u0000\u0000\u0000:\u015c\u0001\u0000\u0000\u0000<"+
		"\u0162\u0001\u0000\u0000\u0000>?\u0003\u0002\u0001\u0000?\u0001\u0001"+
		"\u0000\u0000\u0000@B\u0003\u0004\u0002\u0000A@\u0001\u0000\u0000\u0000"+
		"BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000D\u0003\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FU\u0003"+
		"\u0014\n\u0000GU\u0003\u0006\u0003\u0000HU\u0003\u0012\t\u0000IU\u0003"+
		"\u000e\u0007\u0000JU\u0003\u0010\b\u0000KU\u0003\"\u0011\u0000LU\u0003"+
		" \u0010\u0000MU\u0005\u0003\u0000\u0000NU\u0005\u0002\u0000\u0000OU\u0003"+
		"\n\u0005\u0000PU\u0003*\u0015\u0000QU\u0003,\u0016\u0000RU\u0003$\u0012"+
		"\u0000SU\u0003\u001a\r\u0000TF\u0001\u0000\u0000\u0000TG\u0001\u0000\u0000"+
		"\u0000TH\u0001\u0000\u0000\u0000TI\u0001\u0000\u0000\u0000TJ\u0001\u0000"+
		"\u0000\u0000TK\u0001\u0000\u0000\u0000TL\u0001\u0000\u0000\u0000TM\u0001"+
		"\u0000\u0000\u0000TN\u0001\u0000\u0000\u0000TO\u0001\u0000\u0000\u0000"+
		"TP\u0001\u0000\u0000\u0000TQ\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000"+
		"\u0000TS\u0001\u0000\u0000\u0000U\u0005\u0001\u0000\u0000\u0000VW\u0005"+
		";\u0000\u0000WX\u0005\f\u0000\u0000XY\u0003\"\u0011\u0000YZ\u0005\"\u0000"+
		"\u0000Z[\u0003&\u0013\u0000[\\\u0005\"\u0000\u0000\\]\u0003&\u0013\u0000"+
		"]^\u0005\r\u0000\u0000^_\u0003\u0018\f\u0000_\u0007\u0001\u0000\u0000"+
		"\u0000`a\u0005D\u0000\u0000a\t\u0001\u0000\u0000\u0000bc\u00058\u0000"+
		"\u0000cf\u0003\b\u0004\u0000de\u0005>\u0000\u0000eg\u0003\b\u0004\u0000"+
		"fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000hm\u0005\u000e\u0000\u0000ij\u00036\u001b\u0000jk\u0005D\u0000\u0000"+
		"kn\u0001\u0000\u0000\u0000ln\u0003\u0010\b\u0000mi\u0001\u0000\u0000\u0000"+
		"ml\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0005\u000f"+
		"\u0000\u0000r\u000b\u0001\u0000\u0000\u0000su\u0005\b\u0000\u0000ts\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000"+
		"vw\u00036\u001b\u0000wx\u0005D\u0000\u0000x\r\u0001\u0000\u0000\u0000"+
		"y|\u0005\n\u0000\u0000z|\u00036\u001b\u0000{y\u0001\u0000\u0000\u0000"+
		"{z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0005D\u0000\u0000"+
		"~\u0080\u0005\f\u0000\u0000\u007f\u0081\u0003\f\u0006\u0000\u0080\u007f"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0086"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0005#\u0000\u0000\u0083\u0085\u0003"+
		"\f\u0006\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000"+
		"\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000"+
		"\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0005\r\u0000\u0000\u008a\u000f\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0003\u000e\u0007\u0000\u008c\u008d\u0003\u001c\u000e"+
		"\u0000\u008d\u0011\u0001\u0000\u0000\u0000\u008e\u008f\u0005<\u0000\u0000"+
		"\u008f\u0090\u0005\f\u0000\u0000\u0090\u0091\u0003&\u0013\u0000\u0091"+
		"\u0092\u0005\r\u0000\u0000\u0092\u0093\u0003\u0018\f\u0000\u0093\u0013"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u00059\u0000\u0000\u0095\u0096\u0005"+
		"\f\u0000\u0000\u0096\u0097\u0003&\u0013\u0000\u0097\u0098\u0005\r\u0000"+
		"\u0000\u0098\u009c\u0003\u0018\f\u0000\u0099\u009b\u0003\u0016\u000b\u0000"+
		"\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000"+
		"\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u0015\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009f\u00a2\u0005:\u0000\u0000\u00a0\u00a3\u0003\u0018\f\u0000\u00a1"+
		"\u00a3\u0003\u0014\n\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a3\u0017\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0005\u000e\u0000\u0000\u00a5\u00a6\u0003\u0002\u0001\u0000\u00a6\u00a7"+
		"\u0005\u000f\u0000\u0000\u00a7\u0019\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0005B\u0000\u0000\u00a9\u00aa\u0003&\u0013\u0000\u00aa\u001b\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0005\u000e\u0000\u0000\u00ac\u00ad\u0003\u0002"+
		"\u0001\u0000\u00ad\u00ae\u0005\u000f\u0000\u0000\u00ae\u001d\u0001\u0000"+
		"\u0000\u0000\u00af\u00b6\u0003:\u001d\u0000\u00b0\u00b6\u0003<\u001e\u0000"+
		"\u00b1\u00b6\u0005\u0006\u0000\u0000\u00b2\u00b6\u0005\u000b\u0000\u0000"+
		"\u00b3\u00b6\u0003 \u0010\u0000\u00b4\u00b6\u00034\u001a\u0000\u00b5\u00af"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b0\u0001\u0000\u0000\u0000\u00b5\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u001f"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005D\u0000\u0000\u00b8\u00ba\u0005"+
		"\f\u0000\u0000\u00b9\u00bb\u0003\u001e\u000f\u0000\u00ba\u00b9\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00c0\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0005#\u0000\u0000\u00bd\u00bf\u0003\u001e\u000f"+
		"\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0005\r\u0000\u0000\u00c4!\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c7\u0005\b\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u00036\u001b\u0000\u00c9\u00db\u00034\u001a\u0000\u00ca\u00cc\u0005"+
		"$\u0000\u0000\u00cb\u00cd\u00038\u001c\u0000\u00cc\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00d1\u0001\u0000\u0000"+
		"\u0000\u00ce\u00d0\u0005\f\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d8\u0003&\u0013\u0000\u00d5"+
		"\u00d7\u0005\r\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00da"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8"+
		"\u0001\u0000\u0000\u0000\u00db\u00ca\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0001\u0000\u0000\u0000\u00dc#\u0001\u0000\u0000\u0000\u00dd\u00e0\u0003"+
		"4\u001a\u0000\u00de\u00e1\u0005$\u0000\u0000\u00df\u00e1\u00032\u0019"+
		"\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00df\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e3\u0001\u0000\u0000\u0000\u00e2\u00e4\u00038\u001c\u0000"+
		"\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e4\u00eb\u0001\u0000\u0000\u0000\u00e5\u00ec\u0005D\u0000\u0000\u00e6"+
		"\u00ec\u0005\u0006\u0000\u0000\u00e7\u00ec\u0003 \u0010\u0000\u00e8\u00ec"+
		"\u0005\u000b\u0000\u0000\u00e9\u00ec\u0003&\u0013\u0000\u00ea\u00ec\u0003"+
		"4\u001a\u0000\u00eb\u00e5\u0001\u0000\u0000\u0000\u00eb\u00e6\u0001\u0000"+
		"\u0000\u0000\u00eb\u00e7\u0001\u0000\u0000\u0000\u00eb\u00e8\u0001\u0000"+
		"\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ec%\u0001\u0000\u0000\u0000\u00ed\u00ef\u0005\f\u0000"+
		"\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f7\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f8\u0003*\u0015\u0000\u00f4\u00f8\u0003,\u0016\u0000\u00f5"+
		"\u00f8\u00030\u0018\u0000\u00f6\u00f8\u0003(\u0014\u0000\u00f7\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f4\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8\u00fd\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0005\u0004\u0000\u0000\u00fa\u00fc\u0003"+
		"&\u0013\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00ff\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fe\u0103\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000"+
		"\u0000\u0000\u0100\u0102\u0005\r\u0000\u0000\u0101\u0100\u0001\u0000\u0000"+
		"\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\'\u0001\u0000\u0000\u0000"+
		"\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u010e\u00052\u0000\u0000\u0107"+
		"\u010e\u00053\u0000\u0000\u0108\u010e\u0005D\u0000\u0000\u0109\u010e\u0005"+
		"\u0006\u0000\u0000\u010a\u010e\u0005\u000b\u0000\u0000\u010b\u010e\u0003"+
		"4\u001a\u0000\u010c\u010e\u0003 \u0010\u0000\u010d\u0106\u0001\u0000\u0000"+
		"\u0000\u010d\u0107\u0001\u0000\u0000\u0000\u010d\u0108\u0001\u0000\u0000"+
		"\u0000\u010d\u0109\u0001\u0000\u0000\u0000\u010d\u010a\u0001\u0000\u0000"+
		"\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010c\u0001\u0000\u0000"+
		"\u0000\u010e)\u0001\u0000\u0000\u0000\u010f\u0110\u0007\u0000\u0000\u0000"+
		"\u0110\u0111\u00034\u001a\u0000\u0111+\u0001\u0000\u0000\u0000\u0112\u0113"+
		"\u00034\u001a\u0000\u0113\u0114\u0007\u0000\u0000\u0000\u0114-\u0001\u0000"+
		"\u0000\u0000\u0115\u0117\u0005\f\u0000\u0000\u0116\u0115\u0001\u0000\u0000"+
		"\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000"+
		"\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u0121\u0001\u0000\u0000"+
		"\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011b\u0122\u00034\u001a\u0000"+
		"\u011c\u0122\u0005D\u0000\u0000\u011d\u0122\u0005\u0006\u0000\u0000\u011e"+
		"\u0122\u0003 \u0010\u0000\u011f\u0122\u0005\u000b\u0000\u0000\u0120\u0122"+
		"\u00030\u0018\u0000\u0121\u011b\u0001\u0000\u0000\u0000\u0121\u011c\u0001"+
		"\u0000\u0000\u0000\u0121\u011d\u0001\u0000\u0000\u0000\u0121\u011e\u0001"+
		"\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0120\u0001"+
		"\u0000\u0000\u0000\u0122\u0126\u0001\u0000\u0000\u0000\u0123\u0125\u0005"+
		"\r\u0000\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125\u0128\u0001\u0000"+
		"\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000"+
		"\u0000\u0000\u0127/\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000"+
		"\u0000\u0129\u012a\u0003(\u0014\u0000\u012a\u012d\u0007\u0001\u0000\u0000"+
		"\u012b\u012e\u0003(\u0014\u0000\u012c\u012e\u00030\u0018\u0000\u012d\u012b"+
		"\u0001\u0000\u0000\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012e\u013c"+
		"\u0001\u0000\u0000\u0000\u012f\u0130\u0003(\u0014\u0000\u0130\u0133\u0007"+
		"\u0002\u0000\u0000\u0131\u0134\u0003(\u0014\u0000\u0132\u0134\u00030\u0018"+
		"\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0132\u0001\u0000\u0000"+
		"\u0000\u0134\u013c\u0001\u0000\u0000\u0000\u0135\u0136\u0003(\u0014\u0000"+
		"\u0136\u0139\u0007\u0003\u0000\u0000\u0137\u013a\u0003(\u0014\u0000\u0138"+
		"\u013a\u00030\u0018\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u0138"+
		"\u0001\u0000\u0000\u0000\u013a\u013c\u0001\u0000\u0000\u0000\u013b\u0129"+
		"\u0001\u0000\u0000\u0000\u013b\u012f\u0001\u0000\u0000\u0000\u013b\u0135"+
		"\u0001\u0000\u0000\u0000\u013c1\u0001\u0000\u0000\u0000\u013d\u013e\u0007"+
		"\u0004\u0000\u0000\u013e3\u0001\u0000\u0000\u0000\u013f\u0147\u0005D\u0000"+
		"\u0000\u0140\u0143\u0005\u0001\u0000\u0000\u0141\u0144\u0005D\u0000\u0000"+
		"\u0142\u0144\u0003 \u0010\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143"+
		"\u0142\u0001\u0000\u0000\u0000\u0144\u0146\u0001\u0000\u0000\u0000\u0145"+
		"\u0140\u0001\u0000\u0000\u0000\u0146\u0149\u0001\u0000\u0000\u0000\u0147"+
		"\u0145\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148"+
		"\u014d\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u014a"+
		"\u014b\u0005\u0010\u0000\u0000\u014b\u014c\u0007\u0005\u0000\u0000\u014c"+
		"\u014e\u0005\u0011\u0000\u0000\u014d\u014a\u0001\u0000\u0000\u0000\u014d"+
		"\u014e\u0001\u0000\u0000\u0000\u014e5\u0001\u0000\u0000\u0000\u014f\u0153"+
		"\u0007\u0006\u0000\u0000\u0150\u0151\u0005\u0010\u0000\u0000\u0151\u0152"+
		"\u0005\u0006\u0000\u0000\u0152\u0154\u0005\u0011\u0000\u0000\u0153\u0150"+
		"\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u01547\u0001"+
		"\u0000\u0000\u0000\u0155\u0158\u0005\f\u0000\u0000\u0156\u0159\u0005\u0005"+
		"\u0000\u0000\u0157\u0159\u0003\b\u0004\u0000\u0158\u0156\u0001\u0000\u0000"+
		"\u0000\u0158\u0157\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000"+
		"\u0000\u015a\u015b\u0005\r\u0000\u0000\u015b9\u0001\u0000\u0000\u0000"+
		"\u015c\u015d\u0005\f\u0000\u0000\u015d\u015e\u0005\u0006\u0000\u0000\u015e"+
		"\u015f\u0005#\u0000\u0000\u015f\u0160\u0005\u0006\u0000\u0000\u0160\u0161"+
		"\u0005\r\u0000\u0000\u0161;\u0001\u0000\u0000\u0000\u0162\u0163\u0005"+
		"\f\u0000\u0000\u0163\u0164\u0005\u0006\u0000\u0000\u0164\u0165\u0005#"+
		"\u0000\u0000\u0165\u0166\u0005\u0006\u0000\u0000\u0166\u0167\u0005#\u0000"+
		"\u0000\u0167\u0168\u0005\u0006\u0000\u0000\u0168\u0169\u0005\r\u0000\u0000"+
		"\u0169=\u0001\u0000\u0000\u0000\'CTfmot{\u0080\u0086\u009c\u00a2\u00b5"+
		"\u00ba\u00c0\u00c6\u00cc\u00d1\u00d8\u00db\u00e0\u00e3\u00eb\u00f0\u00f7"+
		"\u00fd\u0103\u010d\u0118\u0121\u0126\u012d\u0133\u0139\u013b\u0143\u0147"+
		"\u014d\u0153\u0158";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
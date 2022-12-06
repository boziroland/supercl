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
		TYPE=1, REALNUMBER=2, FLOAT=3, MEMORY_QUALIFIER=4, BARRIER_OPERATOR=5, 
		KERNEL=6, STRING=7, LPARENT=8, RPARENT=9, BLOCKBEGIN=10, BLOCKEND=11, 
		LEFTBRACKET=12, RIGHTBRACKET=13, PLUS=14, PLUSPLUS=15, MINUS=16, MINUSMINUS=17, 
		STAR=18, DIV=19, MOD=20, AND=21, OR=22, ANDAND=23, OROR=24, CARET=25, 
		NOT=26, TILDE=27, QUESTION=28, COLON=29, SEMI=30, COMMA=31, ASSIGN=32, 
		STARASSIGN=33, DIVASSIGN=34, MODASSIGN=35, PLUSASSIGN=36, MINUSASSIGN=37, 
		ANDASSIGN=38, XORASSIGN=39, ORASSIGN=40, EQUAL=41, NOTEQUAL=42, INLINECOMMENT=43, 
		BLOCKCOMMENTSTART=44, BLOCKCOMMENTEND=45, TRUE=46, FALSE=47, LESS=48, 
		LESSEQUAL=49, GREATER=50, GREATEREQUAL=51, CLASS=52, IF=53, ELSE=54, FOR=55, 
		WHILE=56, DEF=57, WS=58, WORD=59;
	public static final int
		RULE_program = 0, RULE_statementList = 1, RULE_statement = 2, RULE_for = 3, 
		RULE_class = 4, RULE_parameter = 5, RULE_methodHeader = 6, RULE_method = 7, 
		RULE_while = 8, RULE_if = 9, RULE_block = 10, RULE_singleLineComment = 11, 
		RULE_multiLineComment = 12, RULE_methodCall = 13, RULE_declaration = 14, 
		RULE_assignment = 15, RULE_expression = 16, RULE_prefixOperator = 17, 
		RULE_postfixOperator = 18, RULE_binaryOperator = 19, RULE_specialAssign = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statementList", "statement", "for", "class", "parameter", 
			"methodHeader", "method", "while", "if", "block", "singleLineComment", 
			"multiLineComment", "methodCall", "declaration", "assignment", "expression", 
			"prefixOperator", "postfixOperator", "binaryOperator", "specialAssign"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'synchronized'", "'__kernel'", null, "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "'+'", "'++'", "'-'", "'--'", "'*'", 
			"'/'", "'%'", "'&'", "'|'", "'&&'", "'||'", "'^'", "'!'", "'~'", "'?'", 
			"':'", "';'", "','", "'='", "'*='", "'/='", "'%='", "'+='", "'-='", "'&='", 
			"'^='", "'|='", "'=='", "'!='", "'//'", "'/*'", "'*/'", "'true'", "'false'", 
			"'<'", "'<='", "'>'", "'>='", "'class '", "'if'", "'else'", "'for'", 
			"'while'", "'def'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TYPE", "REALNUMBER", "FLOAT", "MEMORY_QUALIFIER", "BARRIER_OPERATOR", 
			"KERNEL", "STRING", "LPARENT", "RPARENT", "BLOCKBEGIN", "BLOCKEND", "LEFTBRACKET", 
			"RIGHTBRACKET", "PLUS", "PLUSPLUS", "MINUS", "MINUSMINUS", "STAR", "DIV", 
			"MOD", "AND", "OR", "ANDAND", "OROR", "CARET", "NOT", "TILDE", "QUESTION", 
			"COLON", "SEMI", "COMMA", "ASSIGN", "STARASSIGN", "DIVASSIGN", "MODASSIGN", 
			"PLUSASSIGN", "MINUSASSIGN", "ANDASSIGN", "XORASSIGN", "ORASSIGN", "EQUAL", 
			"NOTEQUAL", "INLINECOMMENT", "BLOCKCOMMENTSTART", "BLOCKCOMMENTEND", 
			"TRUE", "FALSE", "LESS", "LESSEQUAL", "GREATER", "GREATEREQUAL", "CLASS", 
			"IF", "ELSE", "FOR", "WHILE", "DEF", "WS", "WORD"
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
			setState(42);
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
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << MEMORY_QUALIFIER) | (1L << KERNEL) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << INLINECOMMENT) | (1L << BLOCKCOMMENTSTART) | (1L << CLASS) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << WORD))) != 0)) {
				{
				{
				setState(44);
				statement();
				}
				}
				setState(49);
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
		public SingleLineCommentContext singleLineComment() {
			return getRuleContext(SingleLineCommentContext.class,0);
		}
		public MultiLineCommentContext multiLineComment() {
			return getRuleContext(MultiLineCommentContext.class,0);
		}
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
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				if_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				for_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				while_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				methodHeader();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				method();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(56);
				methodCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(57);
				singleLineComment();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(58);
				multiLineComment();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(59);
				class_();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(60);
				prefixOperator();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(61);
				postfixOperator();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(62);
				assignment();
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
			setState(65);
			match(FOR);
			setState(66);
			match(LPARENT);
			setState(67);
			declaration();
			setState(68);
			match(SEMI);
			setState(69);
			expression();
			setState(70);
			match(SEMI);
			setState(71);
			expression();
			setState(72);
			match(RPARENT);
			setState(73);
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

	public static class ClassContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(kernelParser.CLASS, 0); }
		public List<TerminalNode> WORD() { return getTokens(kernelParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(kernelParser.WORD, i);
		}
		public TerminalNode BLOCKBEGIN() { return getToken(kernelParser.BLOCKBEGIN, 0); }
		public TerminalNode BLOCKEND() { return getToken(kernelParser.BLOCKEND, 0); }
		public List<TerminalNode> TYPE() { return getTokens(kernelParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(kernelParser.TYPE, i);
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
		enterRule(_localctx, 8, RULE_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(CLASS);
			setState(76);
			match(WORD);
			setState(77);
			match(BLOCKBEGIN);
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(78);
				match(TYPE);
				setState(79);
				match(WORD);
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TYPE );
			setState(84);
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
		public TerminalNode TYPE() { return getToken(kernelParser.TYPE, 0); }
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
		enterRule(_localctx, 10, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MEMORY_QUALIFIER) {
				{
				setState(86);
				match(MEMORY_QUALIFIER);
				}
			}

			setState(89);
			match(TYPE);
			setState(90);
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
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public TerminalNode RPARENT() { return getToken(kernelParser.RPARENT, 0); }
		public TerminalNode KERNEL() { return getToken(kernelParser.KERNEL, 0); }
		public TerminalNode TYPE() { return getToken(kernelParser.TYPE, 0); }
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
		enterRule(_localctx, 12, RULE_methodHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !(_la==TYPE || _la==KERNEL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(93);
			match(WORD);
			setState(94);
			match(LPARENT);
			setState(95);
			parameter();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(96);
				match(COMMA);
				setState(97);
				parameter();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 14, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			methodHeader();
			setState(106);
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
		enterRule(_localctx, 16, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(WHILE);
			setState(109);
			match(LPARENT);
			setState(110);
			expression();
			setState(111);
			match(RPARENT);
			setState(112);
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
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(kernelParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(kernelParser.ELSE, i);
		}
		public List<IfContext> if_() {
			return getRuleContexts(IfContext.class);
		}
		public IfContext if_(int i) {
			return getRuleContext(IfContext.class,i);
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
		enterRule(_localctx, 18, RULE_if);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(IF);
			setState(115);
			match(LPARENT);
			setState(116);
			expression();
			setState(117);
			match(RPARENT);
			setState(118);
			block();
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(119);
					match(ELSE);
					setState(122);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case BLOCKBEGIN:
						{
						setState(120);
						block();
						}
						break;
					case IF:
						{
						setState(121);
						if_();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		public TerminalNode BLOCKEND() { return getToken(kernelParser.BLOCKEND, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
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
		enterRule(_localctx, 20, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(BLOCKBEGIN);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << MEMORY_QUALIFIER) | (1L << KERNEL) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << INLINECOMMENT) | (1L << BLOCKCOMMENTSTART) | (1L << CLASS) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << WORD))) != 0)) {
				{
				{
				setState(130);
				statement();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
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

	public static class SingleLineCommentContext extends ParserRuleContext {
		public TerminalNode INLINECOMMENT() { return getToken(kernelParser.INLINECOMMENT, 0); }
		public List<TerminalNode> WORD() { return getTokens(kernelParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(kernelParser.WORD, i);
		}
		public SingleLineCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleLineComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterSingleLineComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitSingleLineComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitSingleLineComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleLineCommentContext singleLineComment() throws RecognitionException {
		SingleLineCommentContext _localctx = new SingleLineCommentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_singleLineComment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(INLINECOMMENT);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(139);
					match(WORD);
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class MultiLineCommentContext extends ParserRuleContext {
		public TerminalNode BLOCKCOMMENTSTART() { return getToken(kernelParser.BLOCKCOMMENTSTART, 0); }
		public TerminalNode BLOCKCOMMENTEND() { return getToken(kernelParser.BLOCKCOMMENTEND, 0); }
		public List<TerminalNode> WORD() { return getTokens(kernelParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(kernelParser.WORD, i);
		}
		public MultiLineCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiLineComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterMultiLineComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitMultiLineComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitMultiLineComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiLineCommentContext multiLineComment() throws RecognitionException {
		MultiLineCommentContext _localctx = new MultiLineCommentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_multiLineComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(BLOCKCOMMENTSTART);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD) {
				{
				{
				setState(146);
				match(WORD);
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			match(BLOCKCOMMENTEND);
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
		public List<TerminalNode> WORD() { return getTokens(kernelParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(kernelParser.WORD, i);
		}
		public TerminalNode LPARENT() { return getToken(kernelParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(kernelParser.RPARENT, 0); }
		public List<TerminalNode> REALNUMBER() { return getTokens(kernelParser.REALNUMBER); }
		public TerminalNode REALNUMBER(int i) {
			return getToken(kernelParser.REALNUMBER, i);
		}
		public List<TerminalNode> STRING() { return getTokens(kernelParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(kernelParser.STRING, i);
		}
		public List<MethodCallContext> methodCall() {
			return getRuleContexts(MethodCallContext.class);
		}
		public MethodCallContext methodCall(int i) {
			return getRuleContext(MethodCallContext.class,i);
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
		enterRule(_localctx, 26, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(WORD);
			setState(155);
			match(LPARENT);
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(156);
				match(WORD);
				}
				break;
			case 2:
				{
				setState(157);
				match(REALNUMBER);
				}
				break;
			case 3:
				{
				setState(158);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(159);
				methodCall();
				}
				break;
			}
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(162);
				match(COMMA);
				setState(167);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(163);
					match(WORD);
					}
					break;
				case 2:
					{
					setState(164);
					match(REALNUMBER);
					}
					break;
				case 3:
					{
					setState(165);
					match(STRING);
					}
					break;
				case 4:
					{
					setState(166);
					methodCall();
					}
					break;
				}
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
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
		public List<TerminalNode> WORD() { return getTokens(kernelParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(kernelParser.WORD, i);
		}
		public TerminalNode ASSIGN() { return getToken(kernelParser.ASSIGN, 0); }
		public TerminalNode TYPE() { return getToken(kernelParser.TYPE, 0); }
		public TerminalNode REALNUMBER() { return getToken(kernelParser.REALNUMBER, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode STRING() { return getToken(kernelParser.STRING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MEMORY_QUALIFIER() { return getToken(kernelParser.MEMORY_QUALIFIER, 0); }
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
		enterRule(_localctx, 28, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MEMORY_QUALIFIER) {
				{
				setState(176);
				match(MEMORY_QUALIFIER);
				}
			}

			setState(179);
			_la = _input.LA(1);
			if ( !(_la==TYPE || _la==WORD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(180);
			match(WORD);
			setState(181);
			match(ASSIGN);
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(182);
				match(WORD);
				}
				break;
			case 2:
				{
				setState(183);
				match(REALNUMBER);
				}
				break;
			case 3:
				{
				setState(184);
				methodCall();
				}
				break;
			case 4:
				{
				setState(185);
				match(STRING);
				}
				break;
			case 5:
				{
				setState(186);
				expression();
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

	public static class AssignmentContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(kernelParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(kernelParser.WORD, i);
		}
		public TerminalNode ASSIGN() { return getToken(kernelParser.ASSIGN, 0); }
		public SpecialAssignContext specialAssign() {
			return getRuleContext(SpecialAssignContext.class,0);
		}
		public TerminalNode REALNUMBER() { return getToken(kernelParser.REALNUMBER, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode STRING() { return getToken(kernelParser.STRING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 30, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(WORD);
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(190);
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
				setState(191);
				specialAssign();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(194);
				match(WORD);
				}
				break;
			case 2:
				{
				setState(195);
				match(REALNUMBER);
				}
				break;
			case 3:
				{
				setState(196);
				methodCall();
				}
				break;
			case 4:
				{
				setState(197);
				match(STRING);
				}
				break;
			case 5:
				{
				setState(198);
				expression();
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
		public TerminalNode TRUE() { return getToken(kernelParser.TRUE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(kernelParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(kernelParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(kernelParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(kernelParser.OR, i);
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
		enterRule(_localctx, 32, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(201);
				prefixOperator();
				}
				break;
			case 2:
				{
				setState(202);
				postfixOperator();
				}
				break;
			case 3:
				{
				setState(203);
				binaryOperator();
				}
				break;
			case 4:
				{
				setState(204);
				match(TRUE);
				}
				break;
			}
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(207);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(208);
					expression();
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class PrefixOperatorContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(kernelParser.WORD, 0); }
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
		enterRule(_localctx, 34, RULE_prefixOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_la = _input.LA(1);
			if ( !(_la==PLUSPLUS || _la==MINUSMINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(215);
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

	public static class PostfixOperatorContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(kernelParser.WORD, 0); }
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
		enterRule(_localctx, 36, RULE_postfixOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(WORD);
			setState(218);
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

	public static class BinaryOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(kernelParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(kernelParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(kernelParser.STAR, 0); }
		public TerminalNode MOD() { return getToken(kernelParser.MOD, 0); }
		public TerminalNode DIV() { return getToken(kernelParser.DIV, 0); }
		public TerminalNode EQUAL() { return getToken(kernelParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(kernelParser.NOTEQUAL, 0); }
		public TerminalNode LESS() { return getToken(kernelParser.LESS, 0); }
		public TerminalNode LESSEQUAL() { return getToken(kernelParser.LESSEQUAL, 0); }
		public TerminalNode GREATER() { return getToken(kernelParser.GREATER, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(kernelParser.GREATEREQUAL, 0); }
		public List<TerminalNode> WORD() { return getTokens(kernelParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(kernelParser.WORD, i);
		}
		public List<TerminalNode> REALNUMBER() { return getTokens(kernelParser.REALNUMBER); }
		public TerminalNode REALNUMBER(int i) {
			return getToken(kernelParser.REALNUMBER, i);
		}
		public List<MethodCallContext> methodCall() {
			return getRuleContexts(MethodCallContext.class);
		}
		public MethodCallContext methodCall(int i) {
			return getRuleContext(MethodCallContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(kernelParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(kernelParser.STRING, i);
		}
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
		enterRule(_localctx, 38, RULE_binaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(220);
				match(WORD);
				}
				break;
			case 2:
				{
				setState(221);
				match(REALNUMBER);
				}
				break;
			case 3:
				{
				setState(222);
				methodCall();
				}
				break;
			case 4:
				{
				setState(223);
				match(STRING);
				}
				break;
			}
			setState(226);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << DIV) | (1L << MOD) | (1L << EQUAL) | (1L << NOTEQUAL) | (1L << LESS) | (1L << LESSEQUAL) | (1L << GREATER) | (1L << GREATEREQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(227);
				match(WORD);
				}
				break;
			case 2:
				{
				setState(228);
				match(REALNUMBER);
				}
				break;
			case 3:
				{
				setState(229);
				methodCall();
				}
				break;
			case 4:
				{
				setState(230);
				match(STRING);
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
		enterRule(_localctx, 40, RULE_specialAssign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
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

	public static final String _serializedATN =
		"\u0004\u0001;\u00ec\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0005\u0001.\b\u0001\n\u0001\f\u00011\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002@\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004"+
		"Q\b\u0004\u000b\u0004\f\u0004R\u0001\u0004\u0001\u0004\u0001\u0005\u0003"+
		"\u0005X\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006c\b"+
		"\u0006\n\u0006\f\u0006f\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t{\b"+
		"\t\u0005\t}\b\t\n\t\f\t\u0080\t\t\u0001\n\u0001\n\u0005\n\u0084\b\n\n"+
		"\n\f\n\u0087\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b\u008d"+
		"\b\u000b\n\u000b\f\u000b\u0090\t\u000b\u0001\f\u0001\f\u0005\f\u0094\b"+
		"\f\n\f\f\f\u0097\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00a1\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00a8\b\r\u0005\r\u00aa\b\r\n\r\f\r\u00ad\t\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0003\u000e\u00b2\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00bc"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00c1\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00c8\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00ce\b\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00d2\b\u0010\n\u0010"+
		"\f\u0010\u00d5\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u00e1\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u00e8\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0000\u0000\u0015\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(\u0000\u0006\u0002\u0000\u0001\u0001"+
		"\u0006\u0006\u0002\u0000\u0001\u0001;;\u0001\u0000\u0015\u0016\u0002\u0000"+
		"\u000f\u000f\u0011\u0011\u0005\u0000\u000e\u000e\u0010\u0010\u0012\u0014"+
		")*03\u0001\u0000!(\u0106\u0000*\u0001\u0000\u0000\u0000\u0002/\u0001\u0000"+
		"\u0000\u0000\u0004?\u0001\u0000\u0000\u0000\u0006A\u0001\u0000\u0000\u0000"+
		"\bK\u0001\u0000\u0000\u0000\nW\u0001\u0000\u0000\u0000\f\\\u0001\u0000"+
		"\u0000\u0000\u000ei\u0001\u0000\u0000\u0000\u0010l\u0001\u0000\u0000\u0000"+
		"\u0012r\u0001\u0000\u0000\u0000\u0014\u0081\u0001\u0000\u0000\u0000\u0016"+
		"\u008a\u0001\u0000\u0000\u0000\u0018\u0091\u0001\u0000\u0000\u0000\u001a"+
		"\u009a\u0001\u0000\u0000\u0000\u001c\u00b1\u0001\u0000\u0000\u0000\u001e"+
		"\u00bd\u0001\u0000\u0000\u0000 \u00cd\u0001\u0000\u0000\u0000\"\u00d6"+
		"\u0001\u0000\u0000\u0000$\u00d9\u0001\u0000\u0000\u0000&\u00e0\u0001\u0000"+
		"\u0000\u0000(\u00e9\u0001\u0000\u0000\u0000*+\u0003\u0002\u0001\u0000"+
		"+\u0001\u0001\u0000\u0000\u0000,.\u0003\u0004\u0002\u0000-,\u0001\u0000"+
		"\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001"+
		"\u0000\u0000\u00000\u0003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000"+
		"\u00002@\u0003\u0012\t\u00003@\u0003\u0006\u0003\u00004@\u0003\u0010\b"+
		"\u00005@\u0003\f\u0006\u00006@\u0003\u000e\u0007\u00007@\u0003\u001c\u000e"+
		"\u00008@\u0003\u001a\r\u00009@\u0003\u0016\u000b\u0000:@\u0003\u0018\f"+
		"\u0000;@\u0003\b\u0004\u0000<@\u0003\"\u0011\u0000=@\u0003$\u0012\u0000"+
		">@\u0003\u001e\u000f\u0000?2\u0001\u0000\u0000\u0000?3\u0001\u0000\u0000"+
		"\u0000?4\u0001\u0000\u0000\u0000?5\u0001\u0000\u0000\u0000?6\u0001\u0000"+
		"\u0000\u0000?7\u0001\u0000\u0000\u0000?8\u0001\u0000\u0000\u0000?9\u0001"+
		"\u0000\u0000\u0000?:\u0001\u0000\u0000\u0000?;\u0001\u0000\u0000\u0000"+
		"?<\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?>\u0001\u0000\u0000"+
		"\u0000@\u0005\u0001\u0000\u0000\u0000AB\u00057\u0000\u0000BC\u0005\b\u0000"+
		"\u0000CD\u0003\u001c\u000e\u0000DE\u0005\u001e\u0000\u0000EF\u0003 \u0010"+
		"\u0000FG\u0005\u001e\u0000\u0000GH\u0003 \u0010\u0000HI\u0005\t\u0000"+
		"\u0000IJ\u0003\u0014\n\u0000J\u0007\u0001\u0000\u0000\u0000KL\u00054\u0000"+
		"\u0000LM\u0005;\u0000\u0000MP\u0005\n\u0000\u0000NO\u0005\u0001\u0000"+
		"\u0000OQ\u0005;\u0000\u0000PN\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0001\u0000"+
		"\u0000\u0000TU\u0005\u000b\u0000\u0000U\t\u0001\u0000\u0000\u0000VX\u0005"+
		"\u0004\u0000\u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000YZ\u0005\u0001\u0000\u0000Z[\u0005;\u0000\u0000"+
		"[\u000b\u0001\u0000\u0000\u0000\\]\u0007\u0000\u0000\u0000]^\u0005;\u0000"+
		"\u0000^_\u0005\b\u0000\u0000_d\u0003\n\u0005\u0000`a\u0005\u001f\u0000"+
		"\u0000ac\u0003\n\u0005\u0000b`\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000"+
		"\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eg\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000gh\u0005\t\u0000\u0000h\r\u0001"+
		"\u0000\u0000\u0000ij\u0003\f\u0006\u0000jk\u0003\u0014\n\u0000k\u000f"+
		"\u0001\u0000\u0000\u0000lm\u00058\u0000\u0000mn\u0005\b\u0000\u0000no"+
		"\u0003 \u0010\u0000op\u0005\t\u0000\u0000pq\u0003\u0014\n\u0000q\u0011"+
		"\u0001\u0000\u0000\u0000rs\u00055\u0000\u0000st\u0005\b\u0000\u0000tu"+
		"\u0003 \u0010\u0000uv\u0005\t\u0000\u0000v~\u0003\u0014\n\u0000wz\u0005"+
		"6\u0000\u0000x{\u0003\u0014\n\u0000y{\u0003\u0012\t\u0000zx\u0001\u0000"+
		"\u0000\u0000zy\u0001\u0000\u0000\u0000{}\u0001\u0000\u0000\u0000|w\u0001"+
		"\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0013\u0001\u0000\u0000\u0000"+
		"\u0080~\u0001\u0000\u0000\u0000\u0081\u0085\u0005\n\u0000\u0000\u0082"+
		"\u0084\u0003\u0004\u0002\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084"+
		"\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0001\u0000\u0000\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087"+
		"\u0085\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u000b\u0000\u0000\u0089"+
		"\u0015\u0001\u0000\u0000\u0000\u008a\u008e\u0005+\u0000\u0000\u008b\u008d"+
		"\u0005;\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u0090\u0001"+
		"\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u0017\u0001\u0000\u0000\u0000\u0090\u008e\u0001"+
		"\u0000\u0000\u0000\u0091\u0095\u0005,\u0000\u0000\u0092\u0094\u0005;\u0000"+
		"\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000"+
		"\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000"+
		"\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0005-\u0000\u0000\u0099\u0019\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0005;\u0000\u0000\u009b\u00a0\u0005\b\u0000\u0000\u009c"+
		"\u00a1\u0005;\u0000\u0000\u009d\u00a1\u0005\u0002\u0000\u0000\u009e\u00a1"+
		"\u0005\u0007\u0000\u0000\u009f\u00a1\u0003\u001a\r\u0000\u00a0\u009c\u0001"+
		"\u0000\u0000\u0000\u00a0\u009d\u0001\u0000\u0000\u0000\u00a0\u009e\u0001"+
		"\u0000\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u00ab\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a7\u0005\u001f\u0000\u0000\u00a3\u00a8\u0005"+
		";\u0000\u0000\u00a4\u00a8\u0005\u0002\u0000\u0000\u00a5\u00a8\u0005\u0007"+
		"\u0000\u0000\u00a6\u00a8\u0003\u001a\r\u0000\u00a7\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00aa\u0001\u0000\u0000"+
		"\u0000\u00a9\u00a2\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0005\t\u0000\u0000\u00af\u001b\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b2\u0005\u0004\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0007\u0001\u0000\u0000\u00b4\u00b5\u0005;\u0000\u0000\u00b5"+
		"\u00bb\u0005 \u0000\u0000\u00b6\u00bc\u0005;\u0000\u0000\u00b7\u00bc\u0005"+
		"\u0002\u0000\u0000\u00b8\u00bc\u0003\u001a\r\u0000\u00b9\u00bc\u0005\u0007"+
		"\u0000\u0000\u00ba\u00bc\u0003 \u0010\u0000\u00bb\u00b6\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b7\u0001\u0000\u0000\u0000\u00bb\u00b8\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bc\u001d\u0001\u0000\u0000\u0000\u00bd\u00c0\u0005;\u0000\u0000"+
		"\u00be\u00c1\u0005 \u0000\u0000\u00bf\u00c1\u0003(\u0014\u0000\u00c0\u00be"+
		"\u0001\u0000\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c8\u0005;\u0000\u0000\u00c3\u00c8\u0005"+
		"\u0002\u0000\u0000\u00c4\u00c8\u0003\u001a\r\u0000\u00c5\u00c8\u0005\u0007"+
		"\u0000\u0000\u00c6\u00c8\u0003 \u0010\u0000\u00c7\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c3\u0001\u0000\u0000\u0000\u00c7\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c8\u001f\u0001\u0000\u0000\u0000\u00c9\u00ce\u0003\"\u0011\u0000"+
		"\u00ca\u00ce\u0003$\u0012\u0000\u00cb\u00ce\u0003&\u0013\u0000\u00cc\u00ce"+
		"\u0005.\u0000\u0000\u00cd\u00c9\u0001\u0000\u0000\u0000\u00cd\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ce\u00d3\u0001\u0000\u0000\u0000\u00cf\u00d0\u0007"+
		"\u0002\u0000\u0000\u00d0\u00d2\u0003 \u0010\u0000\u00d1\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4!\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d7\u0007\u0003\u0000"+
		"\u0000\u00d7\u00d8\u0005;\u0000\u0000\u00d8#\u0001\u0000\u0000\u0000\u00d9"+
		"\u00da\u0005;\u0000\u0000\u00da\u00db\u0007\u0003\u0000\u0000\u00db%\u0001"+
		"\u0000\u0000\u0000\u00dc\u00e1\u0005;\u0000\u0000\u00dd\u00e1\u0005\u0002"+
		"\u0000\u0000\u00de\u00e1\u0003\u001a\r\u0000\u00df\u00e1\u0005\u0007\u0000"+
		"\u0000\u00e0\u00dc\u0001\u0000\u0000\u0000\u00e0\u00dd\u0001\u0000\u0000"+
		"\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00df\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e7\u0007\u0004\u0000"+
		"\u0000\u00e3\u00e8\u0005;\u0000\u0000\u00e4\u00e8\u0005\u0002\u0000\u0000"+
		"\u00e5\u00e8\u0003\u001a\r\u0000\u00e6\u00e8\u0005\u0007\u0000\u0000\u00e7"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e7\u00e4\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8"+
		"\'\u0001\u0000\u0000\u0000\u00e9\u00ea\u0007\u0005\u0000\u0000\u00ea)"+
		"\u0001\u0000\u0000\u0000\u0015/?RWdz~\u0085\u008e\u0095\u00a0\u00a7\u00ab"+
		"\u00b1\u00bb\u00c0\u00c7\u00cd\u00d3\u00e0\u00e7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
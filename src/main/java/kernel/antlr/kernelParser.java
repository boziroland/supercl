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
		T__0=1, TYPE=2, REALNUMBER=3, FLOAT=4, MEMORY_QUALIFIER=5, BARRIER_OPERATOR=6, 
		KERNEL=7, STRING=8, LPARENT=9, RPARENT=10, BLOCKBEGIN=11, BLOCKEND=12, 
		LEFTBRACKET=13, RIGHTBRACKET=14, PLUS=15, PLUSPLUS=16, MINUS=17, MINUSMINUS=18, 
		STAR=19, DIV=20, MOD=21, AND=22, OR=23, ANDAND=24, OROR=25, CARET=26, 
		NOT=27, TILDE=28, QUESTION=29, COLON=30, SEMI=31, COMMA=32, ASSIGN=33, 
		STARASSIGN=34, DIVASSIGN=35, MODASSIGN=36, PLUSASSIGN=37, MINUSASSIGN=38, 
		ANDASSIGN=39, XORASSIGN=40, ORASSIGN=41, EQUAL=42, NOTEQUAL=43, INLINECOMMENT=44, 
		BLOCKCOMMENTSTART=45, BLOCKCOMMENTEND=46, TRUE=47, FALSE=48, LESS=49, 
		LESSEQUAL=50, GREATER=51, GREATEREQUAL=52, CLASS=53, IF=54, ELSE=55, FOR=56, 
		WHILE=57, DEF=58, EXTENDS=59, PRIVATE=60, PUBLIC=61, PROTECTED=62, RETURN=63, 
		WS=64, WORD=65;
	public static final int
		RULE_program = 0, RULE_statementList = 1, RULE_statement = 2, RULE_for = 3, 
		RULE_className = 4, RULE_class = 5, RULE_parameter = 6, RULE_methodHeader = 7, 
		RULE_method = 8, RULE_while = 9, RULE_if = 10, RULE_block = 11, RULE_methodBody = 12, 
		RULE_singleLineComment = 13, RULE_multiLineComment = 14, RULE_methodCall = 15, 
		RULE_declaration = 16, RULE_assignment = 17, RULE_expression = 18, RULE_prefixOperator = 19, 
		RULE_postfixOperator = 20, RULE_expressionWithReturnValue = 21, RULE_binaryOperator = 22, 
		RULE_specialAssign = 23, RULE_variable = 24, RULE_typeName = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statementList", "statement", "for", "className", "class", 
			"parameter", "methodHeader", "method", "while", "if", "block", "methodBody", 
			"singleLineComment", "multiLineComment", "methodCall", "declaration", 
			"assignment", "expression", "prefixOperator", "postfixOperator", "expressionWithReturnValue", 
			"binaryOperator", "specialAssign", "variable", "typeName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", null, null, null, null, "'synchronized'", "'__kernel'", 
			null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'+'", "'++'", "'-'", 
			"'--'", "'*'", "'/'", "'%'", "'&'", "'|'", "'&&'", "'||'", "'^'", "'!'", 
			"'~'", "'?'", "':'", "';'", "','", "'='", "'*='", "'/='", "'%='", "'+='", 
			"'-='", "'&='", "'^='", "'|='", "'=='", "'!='", "'//'", "'/*'", "'*/'", 
			"'true'", "'false'", "'<'", "'<='", "'>'", "'>='", "'class '", "'if'", 
			"'else'", "'for'", "'while'", "'def'", "'extends'", "'private'", "'public'", 
			"'protected'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "TYPE", "REALNUMBER", "FLOAT", "MEMORY_QUALIFIER", "BARRIER_OPERATOR", 
			"KERNEL", "STRING", "LPARENT", "RPARENT", "BLOCKBEGIN", "BLOCKEND", "LEFTBRACKET", 
			"RIGHTBRACKET", "PLUS", "PLUSPLUS", "MINUS", "MINUSMINUS", "STAR", "DIV", 
			"MOD", "AND", "OR", "ANDAND", "OROR", "CARET", "NOT", "TILDE", "QUESTION", 
			"COLON", "SEMI", "COMMA", "ASSIGN", "STARASSIGN", "DIVASSIGN", "MODASSIGN", 
			"PLUSASSIGN", "MINUSASSIGN", "ANDASSIGN", "XORASSIGN", "ORASSIGN", "EQUAL", 
			"NOTEQUAL", "INLINECOMMENT", "BLOCKCOMMENTSTART", "BLOCKCOMMENTEND", 
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
			setState(52);
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
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (TYPE - 2)) | (1L << (MEMORY_QUALIFIER - 2)) | (1L << (KERNEL - 2)) | (1L << (PLUSPLUS - 2)) | (1L << (MINUSMINUS - 2)) | (1L << (INLINECOMMENT - 2)) | (1L << (BLOCKCOMMENTSTART - 2)) | (1L << (CLASS - 2)) | (1L << (IF - 2)) | (1L << (FOR - 2)) | (1L << (WHILE - 2)) | (1L << (WORD - 2)))) != 0)) {
				{
				{
				setState(54);
				statement();
				}
				}
				setState(59);
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
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				if_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				for_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				while_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				methodHeader();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				method();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(66);
				methodCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(67);
				singleLineComment();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(68);
				multiLineComment();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(69);
				class_();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(70);
				prefixOperator();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(71);
				postfixOperator();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(72);
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
			setState(75);
			match(FOR);
			setState(76);
			match(LPARENT);
			setState(77);
			declaration();
			setState(78);
			match(SEMI);
			setState(79);
			expression();
			setState(80);
			match(SEMI);
			setState(81);
			expression();
			setState(82);
			match(RPARENT);
			setState(83);
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
			setState(85);
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
			setState(87);
			match(CLASS);
			setState(88);
			className();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(89);
				match(EXTENDS);
				setState(90);
				className();
				}
			}

			setState(93);
			match(BLOCKBEGIN);
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(98);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					{
					setState(94);
					typeName();
					setState(95);
					match(WORD);
					}
					}
					break;
				case 2:
					{
					setState(97);
					method();
					}
					break;
				}
				}
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (TYPE - 2)) | (1L << (KERNEL - 2)) | (1L << (WORD - 2)))) != 0) );
			setState(102);
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
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MEMORY_QUALIFIER) {
				{
				setState(104);
				match(MEMORY_QUALIFIER);
				}
			}

			setState(107);
			typeName();
			setState(108);
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
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
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
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KERNEL:
				{
				setState(110);
				match(KERNEL);
				}
				break;
			case TYPE:
			case WORD:
				{
				setState(111);
				typeName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(114);
			match(WORD);
			setState(115);
			match(LPARENT);
			setState(116);
			parameter();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(117);
				match(COMMA);
				setState(118);
				parameter();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
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
			setState(126);
			methodHeader();
			setState(127);
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
			setState(129);
			match(WHILE);
			setState(130);
			match(LPARENT);
			setState(131);
			expression();
			setState(132);
			match(RPARENT);
			setState(133);
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
		enterRule(_localctx, 20, RULE_if);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(IF);
			setState(136);
			match(LPARENT);
			setState(137);
			expression();
			setState(138);
			match(RPARENT);
			setState(139);
			block();
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(140);
					match(ELSE);
					setState(143);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case BLOCKBEGIN:
						{
						setState(141);
						block();
						}
						break;
					case IF:
						{
						setState(142);
						if_();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(149);
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
		enterRule(_localctx, 22, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(BLOCKBEGIN);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (TYPE - 2)) | (1L << (MEMORY_QUALIFIER - 2)) | (1L << (KERNEL - 2)) | (1L << (PLUSPLUS - 2)) | (1L << (MINUSMINUS - 2)) | (1L << (INLINECOMMENT - 2)) | (1L << (BLOCKCOMMENTSTART - 2)) | (1L << (CLASS - 2)) | (1L << (IF - 2)) | (1L << (FOR - 2)) | (1L << (WHILE - 2)) | (1L << (WORD - 2)))) != 0)) {
				{
				{
				setState(151);
				statement();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
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

	public static class MethodBodyContext extends ParserRuleContext {
		public TerminalNode BLOCKBEGIN() { return getToken(kernelParser.BLOCKBEGIN, 0); }
		public TerminalNode BLOCKEND() { return getToken(kernelParser.BLOCKEND, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(kernelParser.RETURN, 0); }
		public ExpressionWithReturnValueContext expressionWithReturnValue() {
			return getRuleContext(ExpressionWithReturnValueContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(BLOCKBEGIN);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (TYPE - 2)) | (1L << (MEMORY_QUALIFIER - 2)) | (1L << (KERNEL - 2)) | (1L << (PLUSPLUS - 2)) | (1L << (MINUSMINUS - 2)) | (1L << (INLINECOMMENT - 2)) | (1L << (BLOCKCOMMENTSTART - 2)) | (1L << (CLASS - 2)) | (1L << (IF - 2)) | (1L << (FOR - 2)) | (1L << (WHILE - 2)) | (1L << (WORD - 2)))) != 0)) {
				{
				{
				setState(160);
				statement();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(166);
				match(RETURN);
				setState(167);
				expressionWithReturnValue();
				}
			}

			setState(170);
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
		enterRule(_localctx, 26, RULE_singleLineComment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(INLINECOMMENT);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(173);
					match(WORD);
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 28, RULE_multiLineComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(BLOCKCOMMENTSTART);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD) {
				{
				{
				setState(180);
				match(WORD);
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
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
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
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
		enterRule(_localctx, 30, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(WORD);
			setState(189);
			match(LPARENT);
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(190);
				match(WORD);
				}
				break;
			case 2:
				{
				setState(191);
				match(REALNUMBER);
				}
				break;
			case 3:
				{
				setState(192);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(193);
				methodCall();
				}
				break;
			case 5:
				{
				setState(194);
				variable();
				}
				break;
			}
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(197);
				match(COMMA);
				setState(203);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(198);
					match(WORD);
					}
					break;
				case 2:
					{
					setState(199);
					match(REALNUMBER);
					}
					break;
				case 3:
					{
					setState(200);
					match(STRING);
					}
					break;
				case 4:
					{
					setState(201);
					methodCall();
					}
					break;
				case 5:
					{
					setState(202);
					variable();
					}
					break;
				}
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
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
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(kernelParser.ASSIGN, 0); }
		public TerminalNode WORD() { return getToken(kernelParser.WORD, 0); }
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
		enterRule(_localctx, 32, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MEMORY_QUALIFIER) {
				{
				setState(212);
				match(MEMORY_QUALIFIER);
				}
			}

			setState(215);
			typeName();
			setState(216);
			variable();
			setState(217);
			match(ASSIGN);
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(218);
				match(WORD);
				}
				break;
			case 2:
				{
				setState(219);
				match(REALNUMBER);
				}
				break;
			case 3:
				{
				setState(220);
				methodCall();
				}
				break;
			case 4:
				{
				setState(221);
				match(STRING);
				}
				break;
			case 5:
				{
				setState(222);
				expression();
				}
				break;
			case 6:
				{
				setState(223);
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
		enterRule(_localctx, 34, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			variable();
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(227);
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
				setState(228);
				specialAssign();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(231);
				match(WORD);
				}
				break;
			case 2:
				{
				setState(232);
				match(REALNUMBER);
				}
				break;
			case 3:
				{
				setState(233);
				methodCall();
				}
				break;
			case 4:
				{
				setState(234);
				match(STRING);
				}
				break;
			case 5:
				{
				setState(235);
				expression();
				}
				break;
			case 6:
				{
				setState(236);
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
		enterRule(_localctx, 36, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(239);
				prefixOperator();
				}
				break;
			case 2:
				{
				setState(240);
				postfixOperator();
				}
				break;
			case 3:
				{
				setState(241);
				binaryOperator();
				}
				break;
			case 4:
				{
				setState(242);
				match(TRUE);
				}
				break;
			}
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(245);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(246);
					expression();
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		public TerminalNode PLUSPLUS() { return getToken(kernelParser.PLUSPLUS, 0); }
		public TerminalNode MINUSMINUS() { return getToken(kernelParser.MINUSMINUS, 0); }
		public TerminalNode WORD() { return getToken(kernelParser.WORD, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
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
		enterRule(_localctx, 38, RULE_prefixOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_la = _input.LA(1);
			if ( !(_la==PLUSPLUS || _la==MINUSMINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(253);
				match(WORD);
				}
				break;
			case 2:
				{
				setState(254);
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

	public static class PostfixOperatorContext extends ParserRuleContext {
		public TerminalNode PLUSPLUS() { return getToken(kernelParser.PLUSPLUS, 0); }
		public TerminalNode MINUSMINUS() { return getToken(kernelParser.MINUSMINUS, 0); }
		public TerminalNode WORD() { return getToken(kernelParser.WORD, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
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
		enterRule(_localctx, 40, RULE_postfixOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(257);
				match(WORD);
				}
				break;
			case 2:
				{
				setState(258);
				variable();
				}
				break;
			}
			setState(261);
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
		enterRule(_localctx, 42, RULE_expressionWithReturnValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(263);
				variable();
				}
				break;
			case 2:
				{
				setState(264);
				match(WORD);
				}
				break;
			case 3:
				{
				setState(265);
				match(REALNUMBER);
				}
				break;
			case 4:
				{
				setState(266);
				methodCall();
				}
				break;
			case 5:
				{
				setState(267);
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

	public static class BinaryOperatorContext extends ParserRuleContext {
		public ExpressionWithReturnValueContext expressionWithReturnValue() {
			return getRuleContext(ExpressionWithReturnValueContext.class,0);
		}
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode WORD() { return getToken(kernelParser.WORD, 0); }
		public TerminalNode REALNUMBER() { return getToken(kernelParser.REALNUMBER, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode STRING() { return getToken(kernelParser.STRING, 0); }
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
		enterRule(_localctx, 44, RULE_binaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(270);
				variable();
				}
				break;
			case 2:
				{
				setState(271);
				match(WORD);
				}
				break;
			case 3:
				{
				setState(272);
				match(REALNUMBER);
				}
				break;
			case 4:
				{
				setState(273);
				methodCall();
				}
				break;
			case 5:
				{
				setState(274);
				match(STRING);
				}
				break;
			}
			setState(277);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << DIV) | (1L << MOD) | (1L << EQUAL) | (1L << NOTEQUAL) | (1L << LESS) | (1L << LESSEQUAL) | (1L << GREATER) | (1L << GREATEREQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(278);
			expressionWithReturnValue();
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
		enterRule(_localctx, 46, RULE_specialAssign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
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
		enterRule(_localctx, 48, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(WORD);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(283);
				match(T__0);
				setState(286);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(284);
					match(WORD);
					}
					break;
				case 2:
					{
					setState(285);
					methodCall();
					}
					break;
				}
				}
				}
				setState(292);
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

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(kernelParser.TYPE, 0); }
		public TerminalNode WORD() { return getToken(kernelParser.WORD, 0); }
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
		enterRule(_localctx, 50, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_la = _input.LA(1);
			if ( !(_la==TYPE || _la==WORD) ) {
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
		"\u0004\u0001A\u0128\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001"+
		"8\b\u0001\n\u0001\f\u0001;\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002J\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\\\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005"+
		"c\b\u0005\u000b\u0005\f\u0005d\u0001\u0005\u0001\u0005\u0001\u0006\u0003"+
		"\u0006j\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0003\u0007q\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007x\b\u0007\n\u0007\f\u0007{\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0090\b\n\u0005\n\u0092\b\n\n\n\f\n\u0095\t\n\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u0099\b\u000b\n\u000b\f\u000b\u009c\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0005\f\u00a2\b\f\n\f\f\f\u00a5"+
		"\t\f\u0001\f\u0001\f\u0003\f\u00a9\b\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0005\r\u00af\b\r\n\r\f\r\u00b2\t\r\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u00b6\b\u000e\n\u000e\f\u000e\u00b9\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00c4\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00cc\b\u000f\u0005\u000f\u00ce"+
		"\b\u000f\n\u000f\f\u000f\u00d1\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0003\u0010\u00d6\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00e1\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00e6\b"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00ee\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u00f4\b\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00f8"+
		"\b\u0012\n\u0012\f\u0012\u00fb\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0100\b\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u0104\b"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u010d\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0114\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u011f\b\u0018\u0005\u0018\u0121\b\u0018"+
		"\n\u0018\f\u0018\u0124\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0000"+
		"\u0000\u001a\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02\u0000\u0005\u0001\u0000\u0016\u0017"+
		"\u0002\u0000\u0010\u0010\u0012\u0012\u0005\u0000\u000f\u000f\u0011\u0011"+
		"\u0013\u0015*+14\u0001\u0000\")\u0002\u0000\u0002\u0002AA\u014c\u0000"+
		"4\u0001\u0000\u0000\u0000\u00029\u0001\u0000\u0000\u0000\u0004I\u0001"+
		"\u0000\u0000\u0000\u0006K\u0001\u0000\u0000\u0000\bU\u0001\u0000\u0000"+
		"\u0000\nW\u0001\u0000\u0000\u0000\fi\u0001\u0000\u0000\u0000\u000ep\u0001"+
		"\u0000\u0000\u0000\u0010~\u0001\u0000\u0000\u0000\u0012\u0081\u0001\u0000"+
		"\u0000\u0000\u0014\u0087\u0001\u0000\u0000\u0000\u0016\u0096\u0001\u0000"+
		"\u0000\u0000\u0018\u009f\u0001\u0000\u0000\u0000\u001a\u00ac\u0001\u0000"+
		"\u0000\u0000\u001c\u00b3\u0001\u0000\u0000\u0000\u001e\u00bc\u0001\u0000"+
		"\u0000\u0000 \u00d5\u0001\u0000\u0000\u0000\"\u00e2\u0001\u0000\u0000"+
		"\u0000$\u00f3\u0001\u0000\u0000\u0000&\u00fc\u0001\u0000\u0000\u0000("+
		"\u0103\u0001\u0000\u0000\u0000*\u010c\u0001\u0000\u0000\u0000,\u0113\u0001"+
		"\u0000\u0000\u0000.\u0118\u0001\u0000\u0000\u00000\u011a\u0001\u0000\u0000"+
		"\u00002\u0125\u0001\u0000\u0000\u000045\u0003\u0002\u0001\u00005\u0001"+
		"\u0001\u0000\u0000\u000068\u0003\u0004\u0002\u000076\u0001\u0000\u0000"+
		"\u00008;\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000"+
		"\u0000\u0000:\u0003\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000"+
		"<J\u0003\u0014\n\u0000=J\u0003\u0006\u0003\u0000>J\u0003\u0012\t\u0000"+
		"?J\u0003\u000e\u0007\u0000@J\u0003\u0010\b\u0000AJ\u0003 \u0010\u0000"+
		"BJ\u0003\u001e\u000f\u0000CJ\u0003\u001a\r\u0000DJ\u0003\u001c\u000e\u0000"+
		"EJ\u0003\n\u0005\u0000FJ\u0003&\u0013\u0000GJ\u0003(\u0014\u0000HJ\u0003"+
		"\"\u0011\u0000I<\u0001\u0000\u0000\u0000I=\u0001\u0000\u0000\u0000I>\u0001"+
		"\u0000\u0000\u0000I?\u0001\u0000\u0000\u0000I@\u0001\u0000\u0000\u0000"+
		"IA\u0001\u0000\u0000\u0000IB\u0001\u0000\u0000\u0000IC\u0001\u0000\u0000"+
		"\u0000ID\u0001\u0000\u0000\u0000IE\u0001\u0000\u0000\u0000IF\u0001\u0000"+
		"\u0000\u0000IG\u0001\u0000\u0000\u0000IH\u0001\u0000\u0000\u0000J\u0005"+
		"\u0001\u0000\u0000\u0000KL\u00058\u0000\u0000LM\u0005\t\u0000\u0000MN"+
		"\u0003 \u0010\u0000NO\u0005\u001f\u0000\u0000OP\u0003$\u0012\u0000PQ\u0005"+
		"\u001f\u0000\u0000QR\u0003$\u0012\u0000RS\u0005\n\u0000\u0000ST\u0003"+
		"\u0016\u000b\u0000T\u0007\u0001\u0000\u0000\u0000UV\u0005A\u0000\u0000"+
		"V\t\u0001\u0000\u0000\u0000WX\u00055\u0000\u0000X[\u0003\b\u0004\u0000"+
		"YZ\u0005;\u0000\u0000Z\\\u0003\b\u0004\u0000[Y\u0001\u0000\u0000\u0000"+
		"[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]b\u0005\u000b\u0000"+
		"\u0000^_\u00032\u0019\u0000_`\u0005A\u0000\u0000`c\u0001\u0000\u0000\u0000"+
		"ac\u0003\u0010\b\u0000b^\u0001\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000ef\u0001\u0000\u0000\u0000fg\u0005\f\u0000\u0000g\u000b\u0001\u0000"+
		"\u0000\u0000hj\u0005\u0005\u0000\u0000ih\u0001\u0000\u0000\u0000ij\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u00032\u0019\u0000lm\u0005"+
		"A\u0000\u0000m\r\u0001\u0000\u0000\u0000nq\u0005\u0007\u0000\u0000oq\u0003"+
		"2\u0019\u0000pn\u0001\u0000\u0000\u0000po\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000rs\u0005A\u0000\u0000st\u0005\t\u0000\u0000ty\u0003"+
		"\f\u0006\u0000uv\u0005 \u0000\u0000vx\u0003\f\u0006\u0000wu\u0001\u0000"+
		"\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000"+
		"|}\u0005\n\u0000\u0000}\u000f\u0001\u0000\u0000\u0000~\u007f\u0003\u000e"+
		"\u0007\u0000\u007f\u0080\u0003\u0018\f\u0000\u0080\u0011\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u00059\u0000\u0000\u0082\u0083\u0005\t\u0000\u0000"+
		"\u0083\u0084\u0003$\u0012\u0000\u0084\u0085\u0005\n\u0000\u0000\u0085"+
		"\u0086\u0003\u0016\u000b\u0000\u0086\u0013\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u00056\u0000\u0000\u0088\u0089\u0005\t\u0000\u0000\u0089\u008a"+
		"\u0003$\u0012\u0000\u008a\u008b\u0005\n\u0000\u0000\u008b\u0093\u0003"+
		"\u0016\u000b\u0000\u008c\u008f\u00057\u0000\u0000\u008d\u0090\u0003\u0016"+
		"\u000b\u0000\u008e\u0090\u0003\u0014\n\u0000\u008f\u008d\u0001\u0000\u0000"+
		"\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000"+
		"\u0000\u0091\u008c\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000"+
		"\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u0015\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000"+
		"\u0000\u0096\u009a\u0005\u000b\u0000\u0000\u0097\u0099\u0003\u0004\u0002"+
		"\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000"+
		"\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000"+
		"\u0000\u009b\u009d\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0005\f\u0000\u0000\u009e\u0017\u0001\u0000\u0000\u0000"+
		"\u009f\u00a3\u0005\u000b\u0000\u0000\u00a0\u00a2\u0003\u0004\u0002\u0000"+
		"\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a8\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0005?\u0000\u0000\u00a7\u00a9\u0003*\u0015\u0000\u00a8\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\f\u0000\u0000\u00ab\u0019\u0001"+
		"\u0000\u0000\u0000\u00ac\u00b0\u0005,\u0000\u0000\u00ad\u00af\u0005A\u0000"+
		"\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b1\u001b\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b7\u0005-\u0000\u0000\u00b4\u00b6\u0005A\u0000\u0000\u00b5"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8"+
		"\u00ba\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0005.\u0000\u0000\u00bb\u001d\u0001\u0000\u0000\u0000\u00bc\u00bd"+
		"\u0005A\u0000\u0000\u00bd\u00c3\u0005\t\u0000\u0000\u00be\u00c4\u0005"+
		"A\u0000\u0000\u00bf\u00c4\u0005\u0003\u0000\u0000\u00c0\u00c4\u0005\b"+
		"\u0000\u0000\u00c1\u00c4\u0003\u001e\u000f\u0000\u00c2\u00c4\u00030\u0018"+
		"\u0000\u00c3\u00be\u0001\u0000\u0000\u0000\u00c3\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u00cf\u0001\u0000\u0000"+
		"\u0000\u00c5\u00cb\u0005 \u0000\u0000\u00c6\u00cc\u0005A\u0000\u0000\u00c7"+
		"\u00cc\u0005\u0003\u0000\u0000\u00c8\u00cc\u0005\b\u0000\u0000\u00c9\u00cc"+
		"\u0003\u001e\u000f\u0000\u00ca\u00cc\u00030\u0018\u0000\u00cb\u00c6\u0001"+
		"\u0000\u0000\u0000\u00cb\u00c7\u0001\u0000\u0000\u0000\u00cb\u00c8\u0001"+
		"\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd\u00c5\u0001"+
		"\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005"+
		"\n\u0000\u0000\u00d3\u001f\u0001\u0000\u0000\u0000\u00d4\u00d6\u0005\u0005"+
		"\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u00032\u0019"+
		"\u0000\u00d8\u00d9\u00030\u0018\u0000\u00d9\u00e0\u0005!\u0000\u0000\u00da"+
		"\u00e1\u0005A\u0000\u0000\u00db\u00e1\u0005\u0003\u0000\u0000\u00dc\u00e1"+
		"\u0003\u001e\u000f\u0000\u00dd\u00e1\u0005\b\u0000\u0000\u00de\u00e1\u0003"+
		"$\u0012\u0000\u00df\u00e1\u00030\u0018\u0000\u00e0\u00da\u0001\u0000\u0000"+
		"\u0000\u00e0\u00db\u0001\u0000\u0000\u0000\u00e0\u00dc\u0001\u0000\u0000"+
		"\u0000\u00e0\u00dd\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000"+
		"\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1!\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e5\u00030\u0018\u0000\u00e3\u00e6\u0005!\u0000\u0000\u00e4\u00e6"+
		"\u0003.\u0017\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e6\u00ed\u0001\u0000\u0000\u0000\u00e7\u00ee\u0005"+
		"A\u0000\u0000\u00e8\u00ee\u0005\u0003\u0000\u0000\u00e9\u00ee\u0003\u001e"+
		"\u000f\u0000\u00ea\u00ee\u0005\b\u0000\u0000\u00eb\u00ee\u0003$\u0012"+
		"\u0000\u00ec\u00ee\u00030\u0018\u0000\u00ed\u00e7\u0001\u0000\u0000\u0000"+
		"\u00ed\u00e8\u0001\u0000\u0000\u0000\u00ed\u00e9\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ea\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee#\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f4\u0003&\u0013\u0000\u00f0\u00f4\u0003(\u0014\u0000\u00f1\u00f4\u0003"+
		",\u0016\u0000\u00f2\u00f4\u0005/\u0000\u0000\u00f3\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f9\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0007\u0000\u0000\u0000\u00f6\u00f8\u0003$\u0012\u0000"+
		"\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000"+
		"\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fa%\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc"+
		"\u00ff\u0007\u0001\u0000\u0000\u00fd\u0100\u0005A\u0000\u0000\u00fe\u0100"+
		"\u00030\u0018\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u00fe\u0001"+
		"\u0000\u0000\u0000\u0100\'\u0001\u0000\u0000\u0000\u0101\u0104\u0005A"+
		"\u0000\u0000\u0102\u0104\u00030\u0018\u0000\u0103\u0101\u0001\u0000\u0000"+
		"\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0007\u0001\u0000\u0000\u0106)\u0001\u0000\u0000\u0000"+
		"\u0107\u010d\u00030\u0018\u0000\u0108\u010d\u0005A\u0000\u0000\u0109\u010d"+
		"\u0005\u0003\u0000\u0000\u010a\u010d\u0003\u001e\u000f\u0000\u010b\u010d"+
		"\u0005\b\u0000\u0000\u010c\u0107\u0001\u0000\u0000\u0000\u010c\u0108\u0001"+
		"\u0000\u0000\u0000\u010c\u0109\u0001\u0000\u0000\u0000\u010c\u010a\u0001"+
		"\u0000\u0000\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010d+\u0001\u0000"+
		"\u0000\u0000\u010e\u0114\u00030\u0018\u0000\u010f\u0114\u0005A\u0000\u0000"+
		"\u0110\u0114\u0005\u0003\u0000\u0000\u0111\u0114\u0003\u001e\u000f\u0000"+
		"\u0112\u0114\u0005\b\u0000\u0000\u0113\u010e\u0001\u0000\u0000\u0000\u0113"+
		"\u010f\u0001\u0000\u0000\u0000\u0113\u0110\u0001\u0000\u0000\u0000\u0113"+
		"\u0111\u0001\u0000\u0000\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0114"+
		"\u0115\u0001\u0000\u0000\u0000\u0115\u0116\u0007\u0002\u0000\u0000\u0116"+
		"\u0117\u0003*\u0015\u0000\u0117-\u0001\u0000\u0000\u0000\u0118\u0119\u0007"+
		"\u0003\u0000\u0000\u0119/\u0001\u0000\u0000\u0000\u011a\u0122\u0005A\u0000"+
		"\u0000\u011b\u011e\u0005\u0001\u0000\u0000\u011c\u011f\u0005A\u0000\u0000"+
		"\u011d\u011f\u0003\u001e\u000f\u0000\u011e\u011c\u0001\u0000\u0000\u0000"+
		"\u011e\u011d\u0001\u0000\u0000\u0000\u011f\u0121\u0001\u0000\u0000\u0000"+
		"\u0120\u011b\u0001\u0000\u0000\u0000\u0121\u0124\u0001\u0000\u0000\u0000"+
		"\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000"+
		"\u01231\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0125"+
		"\u0126\u0007\u0004\u0000\u0000\u01263\u0001\u0000\u0000\u0000\u001e9I"+
		"[bdipy\u008f\u0093\u009a\u00a3\u00a8\u00b0\u00b7\u00c3\u00cb\u00cf\u00d5"+
		"\u00e0\u00e5\u00ed\u00f3\u00f9\u00ff\u0103\u010c\u0113\u011e\u0122";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
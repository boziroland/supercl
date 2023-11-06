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
		RULE_method = 8, RULE_while = 9, RULE_if = 10, RULE_else = 11, RULE_block = 12, 
		RULE_methodBody = 13, RULE_singleLineComment = 14, RULE_multiLineComment = 15, 
		RULE_methodCall = 16, RULE_declaration = 17, RULE_assignment = 18, RULE_expression = 19, 
		RULE_prefixOperator = 20, RULE_postfixOperator = 21, RULE_expressionWithReturnValue = 22, 
		RULE_binaryOperator = 23, RULE_specialAssign = 24, RULE_variable = 25, 
		RULE_typeName = 26, RULE_cast = 27, RULE_andandoror = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statementList", "statement", "for", "className", "class", 
			"parameter", "methodHeader", "method", "while", "if", "else", "block", 
			"methodBody", "singleLineComment", "multiLineComment", "methodCall", 
			"declaration", "assignment", "expression", "prefixOperator", "postfixOperator", 
			"expressionWithReturnValue", "binaryOperator", "specialAssign", "variable", 
			"typeName", "cast", "andandoror"
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
			setState(58);
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
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (TYPE - 2)) | (1L << (MEMORY_QUALIFIER - 2)) | (1L << (KERNEL - 2)) | (1L << (PLUSPLUS - 2)) | (1L << (MINUSMINUS - 2)) | (1L << (INLINECOMMENT - 2)) | (1L << (BLOCKCOMMENTSTART - 2)) | (1L << (CLASS - 2)) | (1L << (IF - 2)) | (1L << (FOR - 2)) | (1L << (WHILE - 2)) | (1L << (WORD - 2)))) != 0)) {
				{
				{
				setState(60);
				statement();
				}
				}
				setState(65);
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
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				if_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				for_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				while_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				methodHeader();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				method();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(72);
				methodCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(73);
				singleLineComment();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(74);
				multiLineComment();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(75);
				class_();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(76);
				prefixOperator();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(77);
				postfixOperator();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(78);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(kernelParser.SEMI, 0); }
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
			setState(81);
			match(FOR);
			setState(82);
			match(LPARENT);
			setState(83);
			declaration();
			setState(84);
			expression();
			setState(85);
			match(SEMI);
			setState(86);
			expression();
			setState(87);
			match(RPARENT);
			setState(88);
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
		public List<TerminalNode> SEMI() { return getTokens(kernelParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(kernelParser.SEMI, i);
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
			setState(92);
			match(CLASS);
			setState(93);
			className();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(94);
				match(EXTENDS);
				setState(95);
				className();
				}
			}

			setState(98);
			match(BLOCKBEGIN);
			setState(104); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					{
					setState(99);
					typeName();
					setState(100);
					match(WORD);
					setState(101);
					match(SEMI);
					}
					}
					break;
				case 2:
					{
					setState(103);
					method();
					}
					break;
				}
				}
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (TYPE - 2)) | (1L << (KERNEL - 2)) | (1L << (WORD - 2)))) != 0) );
			setState(108);
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
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MEMORY_QUALIFIER) {
				{
				setState(110);
				match(MEMORY_QUALIFIER);
				}
			}

			setState(113);
			typeName();
			setState(114);
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
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KERNEL:
				{
				setState(116);
				match(KERNEL);
				}
				break;
			case TYPE:
			case WORD:
				{
				setState(117);
				typeName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(120);
			match(WORD);
			setState(121);
			match(LPARENT);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (TYPE - 2)) | (1L << (MEMORY_QUALIFIER - 2)) | (1L << (WORD - 2)))) != 0)) {
				{
				setState(122);
				parameter();
				}
			}

			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(125);
				match(COMMA);
				setState(126);
				parameter();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
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
			setState(134);
			methodHeader();
			setState(135);
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
			setState(137);
			match(WHILE);
			setState(138);
			match(LPARENT);
			setState(139);
			expression();
			setState(140);
			match(RPARENT);
			setState(141);
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
			setState(143);
			match(IF);
			setState(144);
			match(LPARENT);
			setState(145);
			expression();
			setState(146);
			match(RPARENT);
			setState(147);
			block();
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(148);
					else_();
					}
					} 
				}
				setState(153);
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
			setState(154);
			match(ELSE);
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLOCKBEGIN:
				{
				setState(155);
				block();
				}
				break;
			case IF:
				{
				setState(156);
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
			setState(159);
			match(BLOCKBEGIN);
			setState(160);
			statementList();
			setState(161);
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
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode BLOCKEND() { return getToken(kernelParser.BLOCKEND, 0); }
		public TerminalNode RETURN() { return getToken(kernelParser.RETURN, 0); }
		public ExpressionWithReturnValueContext expressionWithReturnValue() {
			return getRuleContext(ExpressionWithReturnValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(kernelParser.SEMI, 0); }
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
		enterRule(_localctx, 26, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(BLOCKBEGIN);
			setState(164);
			statementList();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(165);
				match(RETURN);
				setState(166);
				expressionWithReturnValue();
				setState(167);
				match(SEMI);
				}
			}

			setState(171);
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
		enterRule(_localctx, 28, RULE_singleLineComment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(INLINECOMMENT);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(174);
					match(WORD);
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 30, RULE_multiLineComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(BLOCKCOMMENTSTART);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD) {
				{
				{
				setState(181);
				match(WORD);
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
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
		enterRule(_localctx, 32, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(WORD);
			setState(190);
			match(LPARENT);
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(191);
				match(WORD);
				}
				break;
			case 2:
				{
				setState(192);
				match(REALNUMBER);
				}
				break;
			case 3:
				{
				setState(193);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(194);
				methodCall();
				}
				break;
			case 5:
				{
				setState(195);
				variable();
				}
				break;
			}
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(198);
				match(COMMA);
				setState(204);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(199);
					match(WORD);
					}
					break;
				case 2:
					{
					setState(200);
					match(REALNUMBER);
					}
					break;
				case 3:
					{
					setState(201);
					match(STRING);
					}
					break;
				case 4:
					{
					setState(202);
					methodCall();
					}
					break;
				case 5:
					{
					setState(203);
					variable();
					}
					break;
				}
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
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
		public TerminalNode SEMI() { return getToken(kernelParser.SEMI, 0); }
		public TerminalNode MEMORY_QUALIFIER() { return getToken(kernelParser.MEMORY_QUALIFIER, 0); }
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
		public CastContext cast() {
			return getRuleContext(CastContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MEMORY_QUALIFIER) {
				{
				setState(213);
				match(MEMORY_QUALIFIER);
				}
			}

			setState(216);
			typeName();
			setState(217);
			variable();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(218);
				match(ASSIGN);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPARENT) {
					{
					setState(219);
					cast();
					}
				}

				setState(228);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(222);
					match(WORD);
					}
					break;
				case 2:
					{
					setState(223);
					match(REALNUMBER);
					}
					break;
				case 3:
					{
					setState(224);
					methodCall();
					}
					break;
				case 4:
					{
					setState(225);
					match(STRING);
					}
					break;
				case 5:
					{
					setState(226);
					expression();
					}
					break;
				case 6:
					{
					setState(227);
					variable();
					}
					break;
				}
				}
			}

			setState(232);
			match(SEMI);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			variable();
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(235);
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
				setState(236);
				specialAssign();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPARENT) {
				{
				setState(239);
				cast();
				}
			}

			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(242);
				match(WORD);
				}
				break;
			case 2:
				{
				setState(243);
				match(REALNUMBER);
				}
				break;
			case 3:
				{
				setState(244);
				methodCall();
				}
				break;
			case 4:
				{
				setState(245);
				match(STRING);
				}
				break;
			case 5:
				{
				setState(246);
				expression();
				}
				break;
			case 6:
				{
				setState(247);
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
		public List<AndandororContext> andandoror() {
			return getRuleContexts(AndandororContext.class);
		}
		public AndandororContext andandoror(int i) {
			return getRuleContext(AndandororContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(250);
				prefixOperator();
				}
				break;
			case 2:
				{
				setState(251);
				postfixOperator();
				}
				break;
			case 3:
				{
				setState(252);
				binaryOperator();
				}
				break;
			case 4:
				{
				setState(253);
				match(TRUE);
				}
				break;
			}
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(256);
					andandoror();
					setState(257);
					expression();
					}
					} 
				}
				setState(263);
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
		enterRule(_localctx, 40, RULE_prefixOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_la = _input.LA(1);
			if ( !(_la==PLUSPLUS || _la==MINUSMINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(265);
				match(WORD);
				}
				break;
			case 2:
				{
				setState(266);
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
		enterRule(_localctx, 42, RULE_postfixOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(269);
				match(WORD);
				}
				break;
			case 2:
				{
				setState(270);
				variable();
				}
				break;
			}
			setState(273);
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
		enterRule(_localctx, 44, RULE_expressionWithReturnValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(275);
				variable();
				}
				break;
			case 2:
				{
				setState(276);
				match(WORD);
				}
				break;
			case 3:
				{
				setState(277);
				match(REALNUMBER);
				}
				break;
			case 4:
				{
				setState(278);
				methodCall();
				}
				break;
			case 5:
				{
				setState(279);
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
		enterRule(_localctx, 46, RULE_binaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(282);
				variable();
				}
				break;
			case 2:
				{
				setState(283);
				match(WORD);
				}
				break;
			case 3:
				{
				setState(284);
				match(REALNUMBER);
				}
				break;
			case 4:
				{
				setState(285);
				methodCall();
				}
				break;
			case 5:
				{
				setState(286);
				match(STRING);
				}
				break;
			}
			setState(289);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << DIV) | (1L << MOD) | (1L << EQUAL) | (1L << NOTEQUAL) | (1L << LESS) | (1L << LESSEQUAL) | (1L << GREATER) | (1L << GREATEREQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(290);
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
		enterRule(_localctx, 48, RULE_specialAssign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
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
		enterRule(_localctx, 50, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(WORD);
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(295);
				match(T__0);
				setState(298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(296);
					match(WORD);
					}
					break;
				case 2:
					{
					setState(297);
					methodCall();
					}
					break;
				}
				}
				}
				setState(304);
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
		enterRule(_localctx, 52, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
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
		enterRule(_localctx, 54, RULE_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(LPARENT);
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				{
				setState(308);
				match(TYPE);
				}
				break;
			case WORD:
				{
				setState(309);
				className();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(312);
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

	public static class AndandororContext extends ParserRuleContext {
		public TerminalNode ANDAND() { return getToken(kernelParser.ANDAND, 0); }
		public TerminalNode OROR() { return getToken(kernelParser.OROR, 0); }
		public AndandororContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andandoror; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).enterAndandoror(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernelListener ) ((kernelListener)listener).exitAndandoror(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kernelVisitor ) return ((kernelVisitor<? extends T>)visitor).visitAndandoror(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndandororContext andandoror() throws RecognitionException {
		AndandororContext _localctx = new AndandororContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_andandoror);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_la = _input.LA(1);
			if ( !(_la==ANDAND || _la==OROR) ) {
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
		"\u0004\u0001A\u013d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001"+
		">\b\u0001\n\u0001\f\u0001A\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002P\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005a\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005"+
		"i\b\u0005\u000b\u0005\f\u0005j\u0001\u0005\u0001\u0005\u0001\u0006\u0003"+
		"\u0006p\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0003\u0007w\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007|\b\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0080\b\u0007\n\u0007"+
		"\f\u0007\u0083\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\n\u0096\b\n\n\n\f\n\u0099\t\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u009e\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00aa"+
		"\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0005\u000e\u00b0\b\u000e"+
		"\n\u000e\f\u000e\u00b3\t\u000e\u0001\u000f\u0001\u000f\u0005\u000f\u00b7"+
		"\b\u000f\n\u000f\f\u000f\u00ba\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00c5\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u00cd\b\u0010\u0005\u0010\u00cf\b"+
		"\u0010\n\u0010\f\u0010\u00d2\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0003\u0011\u00d7\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00dd\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u00e5\b\u0011\u0003\u0011\u00e7\b"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u00ee\b\u0012\u0001\u0012\u0003\u0012\u00f1\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00f9\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u00ff\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0104\b"+
		"\u0013\n\u0013\f\u0013\u0107\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u010c\b\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u0110\b"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u0119\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0120\b\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u012b\b\u0019\u0005\u0019\u012d\b\u0019"+
		"\n\u0019\f\u0019\u0130\t\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u0137\b\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0000\u0000\u001d\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468\u0000\u0005\u0002\u0000\u0010\u0010\u0012\u0012\u0005\u0000\u000f"+
		"\u000f\u0011\u0011\u0013\u0015*+14\u0001\u0000\")\u0002\u0000\u0002\u0002"+
		"AA\u0001\u0000\u0018\u0019\u0161\u0000:\u0001\u0000\u0000\u0000\u0002"+
		"?\u0001\u0000\u0000\u0000\u0004O\u0001\u0000\u0000\u0000\u0006Q\u0001"+
		"\u0000\u0000\u0000\bZ\u0001\u0000\u0000\u0000\n\\\u0001\u0000\u0000\u0000"+
		"\fo\u0001\u0000\u0000\u0000\u000ev\u0001\u0000\u0000\u0000\u0010\u0086"+
		"\u0001\u0000\u0000\u0000\u0012\u0089\u0001\u0000\u0000\u0000\u0014\u008f"+
		"\u0001\u0000\u0000\u0000\u0016\u009a\u0001\u0000\u0000\u0000\u0018\u009f"+
		"\u0001\u0000\u0000\u0000\u001a\u00a3\u0001\u0000\u0000\u0000\u001c\u00ad"+
		"\u0001\u0000\u0000\u0000\u001e\u00b4\u0001\u0000\u0000\u0000 \u00bd\u0001"+
		"\u0000\u0000\u0000\"\u00d6\u0001\u0000\u0000\u0000$\u00ea\u0001\u0000"+
		"\u0000\u0000&\u00fe\u0001\u0000\u0000\u0000(\u0108\u0001\u0000\u0000\u0000"+
		"*\u010f\u0001\u0000\u0000\u0000,\u0118\u0001\u0000\u0000\u0000.\u011f"+
		"\u0001\u0000\u0000\u00000\u0124\u0001\u0000\u0000\u00002\u0126\u0001\u0000"+
		"\u0000\u00004\u0131\u0001\u0000\u0000\u00006\u0133\u0001\u0000\u0000\u0000"+
		"8\u013a\u0001\u0000\u0000\u0000:;\u0003\u0002\u0001\u0000;\u0001\u0001"+
		"\u0000\u0000\u0000<>\u0003\u0004\u0002\u0000=<\u0001\u0000\u0000\u0000"+
		">A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000"+
		"\u0000@\u0003\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BP\u0003"+
		"\u0014\n\u0000CP\u0003\u0006\u0003\u0000DP\u0003\u0012\t\u0000EP\u0003"+
		"\u000e\u0007\u0000FP\u0003\u0010\b\u0000GP\u0003\"\u0011\u0000HP\u0003"+
		" \u0010\u0000IP\u0003\u001c\u000e\u0000JP\u0003\u001e\u000f\u0000KP\u0003"+
		"\n\u0005\u0000LP\u0003(\u0014\u0000MP\u0003*\u0015\u0000NP\u0003$\u0012"+
		"\u0000OB\u0001\u0000\u0000\u0000OC\u0001\u0000\u0000\u0000OD\u0001\u0000"+
		"\u0000\u0000OE\u0001\u0000\u0000\u0000OF\u0001\u0000\u0000\u0000OG\u0001"+
		"\u0000\u0000\u0000OH\u0001\u0000\u0000\u0000OI\u0001\u0000\u0000\u0000"+
		"OJ\u0001\u0000\u0000\u0000OK\u0001\u0000\u0000\u0000OL\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000ON\u0001\u0000\u0000\u0000P\u0005\u0001"+
		"\u0000\u0000\u0000QR\u00058\u0000\u0000RS\u0005\t\u0000\u0000ST\u0003"+
		"\"\u0011\u0000TU\u0003&\u0013\u0000UV\u0005\u001f\u0000\u0000VW\u0003"+
		"&\u0013\u0000WX\u0005\n\u0000\u0000XY\u0003\u0018\f\u0000Y\u0007\u0001"+
		"\u0000\u0000\u0000Z[\u0005A\u0000\u0000[\t\u0001\u0000\u0000\u0000\\]"+
		"\u00055\u0000\u0000]`\u0003\b\u0004\u0000^_\u0005;\u0000\u0000_a\u0003"+
		"\b\u0004\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001"+
		"\u0000\u0000\u0000bh\u0005\u000b\u0000\u0000cd\u00034\u001a\u0000de\u0005"+
		"A\u0000\u0000ef\u0005\u001f\u0000\u0000fi\u0001\u0000\u0000\u0000gi\u0003"+
		"\u0010\b\u0000hc\u0001\u0000\u0000\u0000hg\u0001\u0000\u0000\u0000ij\u0001"+
		"\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000lm\u0005\f\u0000\u0000m\u000b\u0001\u0000\u0000"+
		"\u0000np\u0005\u0005\u0000\u0000on\u0001\u0000\u0000\u0000op\u0001\u0000"+
		"\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u00034\u001a\u0000rs\u0005A\u0000"+
		"\u0000s\r\u0001\u0000\u0000\u0000tw\u0005\u0007\u0000\u0000uw\u00034\u001a"+
		"\u0000vt\u0001\u0000\u0000\u0000vu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000xy\u0005A\u0000\u0000y{\u0005\t\u0000\u0000z|\u0003\f\u0006"+
		"\u0000{z\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u0081\u0001"+
		"\u0000\u0000\u0000}~\u0005 \u0000\u0000~\u0080\u0003\f\u0006\u0000\u007f"+
		"}\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0084"+
		"\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0005\n\u0000\u0000\u0085\u000f\u0001\u0000\u0000\u0000\u0086\u0087\u0003"+
		"\u000e\u0007\u0000\u0087\u0088\u0003\u001a\r\u0000\u0088\u0011\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u00059\u0000\u0000\u008a\u008b\u0005\t\u0000"+
		"\u0000\u008b\u008c\u0003&\u0013\u0000\u008c\u008d\u0005\n\u0000\u0000"+
		"\u008d\u008e\u0003\u0018\f\u0000\u008e\u0013\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u00056\u0000\u0000\u0090\u0091\u0005\t\u0000\u0000\u0091\u0092"+
		"\u0003&\u0013\u0000\u0092\u0093\u0005\n\u0000\u0000\u0093\u0097\u0003"+
		"\u0018\f\u0000\u0094\u0096\u0003\u0016\u000b\u0000\u0095\u0094\u0001\u0000"+
		"\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0015\u0001\u0000"+
		"\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009d\u00057\u0000"+
		"\u0000\u009b\u009e\u0003\u0018\f\u0000\u009c\u009e\u0003\u0014\n\u0000"+
		"\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000"+
		"\u009e\u0017\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u000b\u0000\u0000"+
		"\u00a0\u00a1\u0003\u0002\u0001\u0000\u00a1\u00a2\u0005\f\u0000\u0000\u00a2"+
		"\u0019\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u000b\u0000\u0000\u00a4"+
		"\u00a9\u0003\u0002\u0001\u0000\u00a5\u00a6\u0005?\u0000\u0000\u00a6\u00a7"+
		"\u0003,\u0016\u0000\u00a7\u00a8\u0005\u001f\u0000\u0000\u00a8\u00aa\u0001"+
		"\u0000\u0000\u0000\u00a9\u00a5\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005"+
		"\f\u0000\u0000\u00ac\u001b\u0001\u0000\u0000\u0000\u00ad\u00b1\u0005,"+
		"\u0000\u0000\u00ae\u00b0\u0005A\u0000\u0000\u00af\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u001d\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b8\u0005-\u0000\u0000"+
		"\u00b5\u00b7\u0005A\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7"+
		"\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b8\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005.\u0000\u0000\u00bc\u001f"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u0005A\u0000\u0000\u00be\u00c4\u0005"+
		"\t\u0000\u0000\u00bf\u00c5\u0005A\u0000\u0000\u00c0\u00c5\u0005\u0003"+
		"\u0000\u0000\u00c1\u00c5\u0005\b\u0000\u0000\u00c2\u00c5\u0003 \u0010"+
		"\u0000\u00c3\u00c5\u00032\u0019\u0000\u00c4\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c0\u0001\u0000\u0000\u0000\u00c4\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c5\u00d0\u0001\u0000\u0000\u0000\u00c6\u00cc\u0005 \u0000\u0000\u00c7"+
		"\u00cd\u0005A\u0000\u0000\u00c8\u00cd\u0005\u0003\u0000\u0000\u00c9\u00cd"+
		"\u0005\b\u0000\u0000\u00ca\u00cd\u0003 \u0010\u0000\u00cb\u00cd\u0003"+
		"2\u0019\u0000\u00cc\u00c7\u0001\u0000\u0000\u0000\u00cc\u00c8\u0001\u0000"+
		"\u0000\u0000\u00cc\u00c9\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd\u00cf\u0001\u0000"+
		"\u0000\u0000\u00ce\u00c6\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0005\n\u0000\u0000\u00d4!\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d7\u0005\u0005\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u00034\u001a\u0000\u00d9\u00e6\u00032\u0019\u0000\u00da"+
		"\u00dc\u0005!\u0000\u0000\u00db\u00dd\u00036\u001b\u0000\u00dc\u00db\u0001"+
		"\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00e4\u0001"+
		"\u0000\u0000\u0000\u00de\u00e5\u0005A\u0000\u0000\u00df\u00e5\u0005\u0003"+
		"\u0000\u0000\u00e0\u00e5\u0003 \u0010\u0000\u00e1\u00e5\u0005\b\u0000"+
		"\u0000\u00e2\u00e5\u0003&\u0013\u0000\u00e3\u00e5\u00032\u0019\u0000\u00e4"+
		"\u00de\u0001\u0000\u0000\u0000\u00e4\u00df\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e4\u00e1\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e6\u00da\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0005\u001f\u0000\u0000\u00e9#\u0001\u0000\u0000\u0000\u00ea\u00ed"+
		"\u00032\u0019\u0000\u00eb\u00ee\u0005!\u0000\u0000\u00ec\u00ee\u00030"+
		"\u0018\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef\u00f1\u00036\u001b"+
		"\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f8\u0001\u0000\u0000\u0000\u00f2\u00f9\u0005A\u0000\u0000"+
		"\u00f3\u00f9\u0005\u0003\u0000\u0000\u00f4\u00f9\u0003 \u0010\u0000\u00f5"+
		"\u00f9\u0005\b\u0000\u0000\u00f6\u00f9\u0003&\u0013\u0000\u00f7\u00f9"+
		"\u00032\u0019\u0000\u00f8\u00f2\u0001\u0000\u0000\u0000\u00f8\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f4\u0001\u0000\u0000\u0000\u00f8\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f9%\u0001\u0000\u0000\u0000\u00fa\u00ff\u0003(\u0014"+
		"\u0000\u00fb\u00ff\u0003*\u0015\u0000\u00fc\u00ff\u0003.\u0017\u0000\u00fd"+
		"\u00ff\u0005/\u0000\u0000\u00fe\u00fa\u0001\u0000\u0000\u0000\u00fe\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00fd"+
		"\u0001\u0000\u0000\u0000\u00ff\u0105\u0001\u0000\u0000\u0000\u0100\u0101"+
		"\u00038\u001c\u0000\u0101\u0102\u0003&\u0013\u0000\u0102\u0104\u0001\u0000"+
		"\u0000\u0000\u0103\u0100\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000"+
		"\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000"+
		"\u0000\u0000\u0106\'\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000"+
		"\u0000\u0108\u010b\u0007\u0000\u0000\u0000\u0109\u010c\u0005A\u0000\u0000"+
		"\u010a\u010c\u00032\u0019\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b"+
		"\u010a\u0001\u0000\u0000\u0000\u010c)\u0001\u0000\u0000\u0000\u010d\u0110"+
		"\u0005A\u0000\u0000\u010e\u0110\u00032\u0019\u0000\u010f\u010d\u0001\u0000"+
		"\u0000\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000"+
		"\u0000\u0000\u0111\u0112\u0007\u0000\u0000\u0000\u0112+\u0001\u0000\u0000"+
		"\u0000\u0113\u0119\u00032\u0019\u0000\u0114\u0119\u0005A\u0000\u0000\u0115"+
		"\u0119\u0005\u0003\u0000\u0000\u0116\u0119\u0003 \u0010\u0000\u0117\u0119"+
		"\u0005\b\u0000\u0000\u0118\u0113\u0001\u0000\u0000\u0000\u0118\u0114\u0001"+
		"\u0000\u0000\u0000\u0118\u0115\u0001\u0000\u0000\u0000\u0118\u0116\u0001"+
		"\u0000\u0000\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0119-\u0001\u0000"+
		"\u0000\u0000\u011a\u0120\u00032\u0019\u0000\u011b\u0120\u0005A\u0000\u0000"+
		"\u011c\u0120\u0005\u0003\u0000\u0000\u011d\u0120\u0003 \u0010\u0000\u011e"+
		"\u0120\u0005\b\u0000\u0000\u011f\u011a\u0001\u0000\u0000\u0000\u011f\u011b"+
		"\u0001\u0000\u0000\u0000\u011f\u011c\u0001\u0000\u0000\u0000\u011f\u011d"+
		"\u0001\u0000\u0000\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120\u0121"+
		"\u0001\u0000\u0000\u0000\u0121\u0122\u0007\u0001\u0000\u0000\u0122\u0123"+
		"\u0003,\u0016\u0000\u0123/\u0001\u0000\u0000\u0000\u0124\u0125\u0007\u0002"+
		"\u0000\u0000\u01251\u0001\u0000\u0000\u0000\u0126\u012e\u0005A\u0000\u0000"+
		"\u0127\u012a\u0005\u0001\u0000\u0000\u0128\u012b\u0005A\u0000\u0000\u0129"+
		"\u012b\u0003 \u0010\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u0129"+
		"\u0001\u0000\u0000\u0000\u012b\u012d\u0001\u0000\u0000\u0000\u012c\u0127"+
		"\u0001\u0000\u0000\u0000\u012d\u0130\u0001\u0000\u0000\u0000\u012e\u012c"+
		"\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f3\u0001"+
		"\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0131\u0132\u0007"+
		"\u0003\u0000\u0000\u01325\u0001\u0000\u0000\u0000\u0133\u0136\u0005\t"+
		"\u0000\u0000\u0134\u0137\u0005\u0002\u0000\u0000\u0135\u0137\u0003\b\u0004"+
		"\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0136\u0135\u0001\u0000\u0000"+
		"\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u0139\u0005\n\u0000\u0000"+
		"\u01397\u0001\u0000\u0000\u0000\u013a\u013b\u0007\u0004\u0000\u0000\u013b"+
		"9\u0001\u0000\u0000\u0000!?O`hjov{\u0081\u0097\u009d\u00a9\u00b1\u00b8"+
		"\u00c4\u00cc\u00d0\u00d6\u00dc\u00e4\u00e6\u00ed\u00f0\u00f8\u00fe\u0105"+
		"\u010b\u010f\u0118\u011f\u012a\u012e\u0136";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
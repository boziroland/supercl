// Generated from C:/Users/Roland/Documents/OpenCLPP2/src/main/antlr\kernel.g4 by ANTLR 4.10.1
package kernel;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class kernelParser extends Parser
{
    static
    {
        RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
        new PredictionContextCache();
    public static final int
        WORD = 1, REALNUMBER = 2, FLOAT = 3, MEMORY_QUALIFIER = 4, BARRIER_OPERATOR = 5,
        KERNEL = 6, STRING = 7, LPARENT = 8, RPARENT = 9, BLOCKBEGIN = 10, BLOCKEND = 11,
        LEFTBRACKET = 12, RIGHTBRACKET = 13, PLUS = 14, PLUSPLUS = 15, MINUS = 16, MINUSMINUS = 17,
        STAR = 18, DIV = 19, MOD = 20, AND = 21, OR = 22, ANDAND = 23, OROR = 24, CARET = 25,
        NOT = 26, TILDE = 27, QUESTION = 28, COLON = 29, SEMI = 30, COMMA = 31, ASSIGN = 32,
        STARASSIGN = 33, DIVASSIGN = 34, MODASSIGN = 35, PLUSASSIGN = 36, MINUSASSIGN = 37,
        ANDASSIGN = 38, XORASSIGN = 39, ORASSIGN = 40, EQUAL = 41, NOTEQUAL = 42, INLINECOMMENT = 43,
        BLOCKCOMMENTSTART = 44, BLOCKCOMMENTEND = 45, TRUE = 46, FALSE = 47, LESS = 48,
        LESSEQUAL = 49, GREATER = 50, GREATEREQUAL = 51, CLASS = 52, IF = 53, ELSE = 54, FOR = 55,
        WHILE = 56, DEF = 57, WS = 58;
    public static final int
        RULE_program = 0, RULE_statementList = 1, RULE_statement = 2, RULE_class = 3,
        RULE_parameter = 4, RULE_methodHeader = 5, RULE_method = 6, RULE_for = 7,
        RULE_while = 8, RULE_if = 9, RULE_block = 10, RULE_singleLineComment = 11,
        RULE_multiLineComment = 12, RULE_methodCall = 13, RULE_assignment = 14,
        RULE_expression = 15, RULE_prefixOperator = 16, RULE_postfixOperator = 17,
        RULE_binaryOperator = 18;

    private static String[] makeRuleNames()
    {
        return new String[]{
            "program", "statementList", "statement", "class", "parameter", "methodHeader",
            "method", "for", "while", "if", "block", "singleLineComment", "multiLineComment",
            "methodCall", "assignment", "expression", "prefixOperator", "postfixOperator",
            "binaryOperator"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames()
    {
        return new String[]{
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

    private static String[] makeSymbolicNames()
    {
        return new String[]{
            null, "WORD", "REALNUMBER", "FLOAT", "MEMORY_QUALIFIER", "BARRIER_OPERATOR",
            "KERNEL", "STRING", "LPARENT", "RPARENT", "BLOCKBEGIN", "BLOCKEND", "LEFTBRACKET",
            "RIGHTBRACKET", "PLUS", "PLUSPLUS", "MINUS", "MINUSMINUS", "STAR", "DIV",
            "MOD", "AND", "OR", "ANDAND", "OROR", "CARET", "NOT", "TILDE", "QUESTION",
            "COLON", "SEMI", "COMMA", "ASSIGN", "STARASSIGN", "DIVASSIGN", "MODASSIGN",
            "PLUSASSIGN", "MINUSASSIGN", "ANDASSIGN", "XORASSIGN", "ORASSIGN", "EQUAL",
            "NOTEQUAL", "INLINECOMMENT", "BLOCKCOMMENTSTART", "BLOCKCOMMENTEND",
            "TRUE", "FALSE", "LESS", "LESSEQUAL", "GREATER", "GREATEREQUAL", "CLASS",
            "IF", "ELSE", "FOR", "WHILE", "DEF", "WS"
        };
    }

    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;

    static
    {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++)
        {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null)
            {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null)
            {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    @Override
    @Deprecated
    public String[] getTokenNames()
    {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary()
    {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName()
    {
        return "kernel.g4";
    }

    @Override
    public String[] getRuleNames()
    {
        return ruleNames;
    }

    @Override
    public String getSerializedATN()
    {
        return _serializedATN;
    }

    @Override
    public ATN getATN()
    {
        return _ATN;
    }

    public kernelParser(TokenStream input)
    {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class ProgramContext extends ParserRuleContext
    {
        public StatementListContext statementList()
        {
            return getRuleContext(StatementListContext.class, 0);
        }

        public ProgramContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex()
        {
            return RULE_program;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).enterProgram(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).exitProgram(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof kernelVisitor)
                return ((kernelVisitor<? extends T>) visitor).visitProgram(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final ProgramContext program() throws RecognitionException
    {
        ProgramContext _localctx = new ProgramContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_program);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(38);
                statementList();
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class StatementListContext extends ParserRuleContext
    {
        public List<StatementContext> statement()
        {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i)
        {
            return getRuleContext(StatementContext.class, i);
        }

        public StatementListContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex()
        {
            return RULE_statementList;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).enterStatementList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).exitStatementList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof kernelVisitor)
                return ((kernelVisitor<? extends T>) visitor).visitStatementList(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final StatementListContext statementList() throws RecognitionException
    {
        StatementListContext _localctx = new StatementListContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_statementList);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(43);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 &&
                    ((1L << _la) & ((1L << WORD) | (1L << MEMORY_QUALIFIER) | (1L << KERNEL) | (1L << PLUSPLUS) | (1L
                        << MINUSMINUS) | (1L << INLINECOMMENT) | (1L << BLOCKCOMMENTSTART) | (1L << CLASS) | (1L << IF)
                        | (1L << FOR) | (1L << WHILE) | (1L << DEF))) != 0))
                {
                    {
                        {
                            setState(40);
                            statement();
                        }
                    }
                    setState(45);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class StatementContext extends ParserRuleContext
    {
        public ForContext for_()
        {
            return getRuleContext(ForContext.class, 0);
        }

        public WhileContext while_()
        {
            return getRuleContext(WhileContext.class, 0);
        }

        public IfContext if_()
        {
            return getRuleContext(IfContext.class, 0);
        }

        public MethodHeaderContext methodHeader()
        {
            return getRuleContext(MethodHeaderContext.class, 0);
        }

        public MethodContext method()
        {
            return getRuleContext(MethodContext.class, 0);
        }

        public AssignmentContext assignment()
        {
            return getRuleContext(AssignmentContext.class, 0);
        }

        public MethodCallContext methodCall()
        {
            return getRuleContext(MethodCallContext.class, 0);
        }

        public SingleLineCommentContext singleLineComment()
        {
            return getRuleContext(SingleLineCommentContext.class, 0);
        }

        public MultiLineCommentContext multiLineComment()
        {
            return getRuleContext(MultiLineCommentContext.class, 0);
        }

        public ClassContext class_()
        {
            return getRuleContext(ClassContext.class, 0);
        }

        public PrefixOperatorContext prefixOperator()
        {
            return getRuleContext(PrefixOperatorContext.class, 0);
        }

        public PostfixOperatorContext postfixOperator()
        {
            return getRuleContext(PostfixOperatorContext.class, 0);
        }

        public StatementContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex()
        {
            return RULE_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).enterStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).exitStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof kernelVisitor)
                return ((kernelVisitor<? extends T>) visitor).visitStatement(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final StatementContext statement() throws RecognitionException
    {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_statement);
        try
        {
            setState(59);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx))
            {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(46);
                    for_();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(47);
                    while_();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(48);
                    if_();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(49);
                    methodHeader();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(50);
                    method();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(51);
                    assignment();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(52);
                    methodCall();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(53);
                    singleLineComment();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(54);
                    multiLineComment();
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(55);
                    class_();
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(56);
                    prefixOperator();
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(57);
                    postfixOperator();
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(58);
                    if_();
                }
                break;
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class ClassContext extends ParserRuleContext
    {
        public TerminalNode CLASS()
        {
            return getToken(kernelParser.CLASS, 0);
        }

        public List<TerminalNode> WORD()
        {
            return getTokens(kernelParser.WORD);
        }

        public TerminalNode WORD(int i)
        {
            return getToken(kernelParser.WORD, i);
        }

        public TerminalNode BLOCKBEGIN()
        {
            return getToken(kernelParser.BLOCKBEGIN, 0);
        }

        public TerminalNode BLOCKEND()
        {
            return getToken(kernelParser.BLOCKEND, 0);
        }

        public ClassContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex()
        {
            return RULE_class;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).enterClass(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).exitClass(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof kernelVisitor)
                return ((kernelVisitor<? extends T>) visitor).visitClass(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final ClassContext class_() throws RecognitionException
    {
        ClassContext _localctx = new ClassContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_class);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(61);
                match(CLASS);
                setState(62);
                match(WORD);
                setState(63);
                match(BLOCKBEGIN);
                setState(65);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do
                {
                    {
                        {
                            setState(64);
                            match(WORD);
                        }
                    }
                    setState(67);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == WORD);
                setState(69);
                match(BLOCKEND);
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class ParameterContext extends ParserRuleContext
    {
        public TerminalNode WORD()
        {
            return getToken(kernelParser.WORD, 0);
        }

        public TerminalNode MEMORY_QUALIFIER()
        {
            return getToken(kernelParser.MEMORY_QUALIFIER, 0);
        }

        public ParameterContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex()
        {
            return RULE_parameter;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).enterParameter(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).exitParameter(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof kernelVisitor)
                return ((kernelVisitor<? extends T>) visitor).visitParameter(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final ParameterContext parameter() throws RecognitionException
    {
        ParameterContext _localctx = new ParameterContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_parameter);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(72);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == MEMORY_QUALIFIER)
                {
                    {
                        setState(71);
                        match(MEMORY_QUALIFIER);
                    }
                }

                setState(74);
                match(WORD);
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class MethodHeaderContext extends ParserRuleContext
    {
        public TerminalNode WORD()
        {
            return getToken(kernelParser.WORD, 0);
        }

        public TerminalNode LPARENT()
        {
            return getToken(kernelParser.LPARENT, 0);
        }

        public List<ParameterContext> parameter()
        {
            return getRuleContexts(ParameterContext.class);
        }

        public ParameterContext parameter(int i)
        {
            return getRuleContext(ParameterContext.class, i);
        }

        public TerminalNode RPARENT()
        {
            return getToken(kernelParser.RPARENT, 0);
        }

        public TerminalNode KERNEL()
        {
            return getToken(kernelParser.KERNEL, 0);
        }

        public TerminalNode DEF()
        {
            return getToken(kernelParser.DEF, 0);
        }

        public List<TerminalNode> COMMA()
        {
            return getTokens(kernelParser.COMMA);
        }

        public TerminalNode COMMA(int i)
        {
            return getToken(kernelParser.COMMA, i);
        }

        public MethodHeaderContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex()
        {
            return RULE_methodHeader;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).enterMethodHeader(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).exitMethodHeader(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof kernelVisitor)
                return ((kernelVisitor<? extends T>) visitor).visitMethodHeader(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final MethodHeaderContext methodHeader() throws RecognitionException
    {
        MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_methodHeader);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(76);
                _la = _input.LA(1);
                if (!(_la == KERNEL || _la == DEF))
                {
                    _errHandler.recoverInline(this);
                }
                else
                {
                    if (_input.LA(1) == Token.EOF)
                        matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
                setState(77);
                match(WORD);
                setState(78);
                match(LPARENT);
                setState(79);
                parameter();
                setState(84);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA)
                {
                    {
                        {
                            setState(80);
                            match(COMMA);
                            setState(81);
                            parameter();
                        }
                    }
                    setState(86);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(87);
                match(RPARENT);
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class MethodContext extends ParserRuleContext
    {
        public MethodHeaderContext methodHeader()
        {
            return getRuleContext(MethodHeaderContext.class, 0);
        }

        public TerminalNode BLOCKBEGIN()
        {
            return getToken(kernelParser.BLOCKBEGIN, 0);
        }

        public BlockContext block()
        {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode BLOCKEND()
        {
            return getToken(kernelParser.BLOCKEND, 0);
        }

        public MethodContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex()
        {
            return RULE_method;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).enterMethod(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).exitMethod(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof kernelVisitor)
                return ((kernelVisitor<? extends T>) visitor).visitMethod(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final MethodContext method() throws RecognitionException
    {
        MethodContext _localctx = new MethodContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_method);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(89);
                methodHeader();
                setState(90);
                match(BLOCKBEGIN);
                setState(91);
                block();
                setState(92);
                match(BLOCKEND);
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class ForContext extends ParserRuleContext
    {
        public TerminalNode FOR()
        {
            return getToken(kernelParser.FOR, 0);
        }

        public TerminalNode LPARENT()
        {
            return getToken(kernelParser.LPARENT, 0);
        }

        public AssignmentContext assignment()
        {
            return getRuleContext(AssignmentContext.class, 0);
        }

        public List<TerminalNode> COLON()
        {
            return getTokens(kernelParser.COLON);
        }

        public TerminalNode COLON(int i)
        {
            return getToken(kernelParser.COLON, i);
        }

        public List<ExpressionContext> expression()
        {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i)
        {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode RPARENT()
        {
            return getToken(kernelParser.RPARENT, 0);
        }

        public BlockContext block()
        {
            return getRuleContext(BlockContext.class, 0);
        }

        public ForContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex()
        {
            return RULE_for;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).enterFor(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).exitFor(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof kernelVisitor)
                return ((kernelVisitor<? extends T>) visitor).visitFor(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final ForContext for_() throws RecognitionException
    {
        ForContext _localctx = new ForContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_for);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(94);
                match(FOR);
                setState(95);
                match(LPARENT);
                setState(96);
                assignment();
                setState(97);
                match(COLON);
                setState(98);
                expression();
                setState(99);
                match(COLON);
                setState(100);
                expression();
                setState(101);
                match(RPARENT);
                setState(102);
                block();
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class WhileContext extends ParserRuleContext
    {
        public TerminalNode WHILE()
        {
            return getToken(kernelParser.WHILE, 0);
        }

        public TerminalNode LPARENT()
        {
            return getToken(kernelParser.LPARENT, 0);
        }

        public ExpressionContext expression()
        {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode RPARENT()
        {
            return getToken(kernelParser.RPARENT, 0);
        }

        public BlockContext block()
        {
            return getRuleContext(BlockContext.class, 0);
        }

        public WhileContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex()
        {
            return RULE_while;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).enterWhile(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).exitWhile(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof kernelVisitor)
                return ((kernelVisitor<? extends T>) visitor).visitWhile(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final WhileContext while_() throws RecognitionException
    {
        WhileContext _localctx = new WhileContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_while);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(104);
                match(WHILE);
                setState(105);
                match(LPARENT);
                setState(106);
                expression();
                setState(107);
                match(RPARENT);
                setState(108);
                block();
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class IfContext extends ParserRuleContext
    {
        public TerminalNode IF()
        {
            return getToken(kernelParser.IF, 0);
        }

        public TerminalNode LPARENT()
        {
            return getToken(kernelParser.LPARENT, 0);
        }

        public ExpressionContext expression()
        {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode RPARENT()
        {
            return getToken(kernelParser.RPARENT, 0);
        }

        public List<BlockContext> block()
        {
            return getRuleContexts(BlockContext.class);
        }

        public BlockContext block(int i)
        {
            return getRuleContext(BlockContext.class, i);
        }

        public List<TerminalNode> ELSE()
        {
            return getTokens(kernelParser.ELSE);
        }

        public TerminalNode ELSE(int i)
        {
            return getToken(kernelParser.ELSE, i);
        }

        public List<IfContext> if_()
        {
            return getRuleContexts(IfContext.class);
        }

        public IfContext if_(int i)
        {
            return getRuleContext(IfContext.class, i);
        }

        public IfContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex()
        {
            return RULE_if;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).enterIf(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).exitIf(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof kernelVisitor)
                return ((kernelVisitor<? extends T>) visitor).visitIf(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final IfContext if_() throws RecognitionException
    {
        IfContext _localctx = new IfContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_if);
        try
        {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(110);
                match(IF);
                setState(111);
                match(LPARENT);
                setState(112);
                expression();
                setState(113);
                match(RPARENT);
                setState(114);
                block();
                setState(122);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER)
                {
                    if (_alt == 1)
                    {
                        {
                            {
                                setState(115);
                                match(ELSE);
                                setState(118);
                                _errHandler.sync(this);
                                switch (_input.LA(1))
                                {
                                    case BLOCKBEGIN:
                                    {
                                        setState(116);
                                        block();
                                    }
                                    break;
                                    case IF:
                                    {
                                        setState(117);
                                        if_();
                                    }
                                    break;
                                    default:
                                        throw new NoViableAltException(this);
                                }
                            }
                        }
                    }
                    setState(124);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
                }
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class BlockContext extends ParserRuleContext
    {
        public TerminalNode BLOCKBEGIN()
        {
            return getToken(kernelParser.BLOCKBEGIN, 0);
        }

        public TerminalNode BLOCKEND()
        {
            return getToken(kernelParser.BLOCKEND, 0);
        }

        public List<IfContext> if_()
        {
            return getRuleContexts(IfContext.class);
        }

        public IfContext if_(int i)
        {
            return getRuleContext(IfContext.class, i);
        }

        public List<AssignmentContext> assignment()
        {
            return getRuleContexts(AssignmentContext.class);
        }

        public AssignmentContext assignment(int i)
        {
            return getRuleContext(AssignmentContext.class, i);
        }

        public List<PrefixOperatorContext> prefixOperator()
        {
            return getRuleContexts(PrefixOperatorContext.class);
        }

        public PrefixOperatorContext prefixOperator(int i)
        {
            return getRuleContext(PrefixOperatorContext.class, i);
        }

        public List<PostfixOperatorContext> postfixOperator()
        {
            return getRuleContexts(PostfixOperatorContext.class);
        }

        public PostfixOperatorContext postfixOperator(int i)
        {
            return getRuleContext(PostfixOperatorContext.class, i);
        }

        public List<MethodCallContext> methodCall()
        {
            return getRuleContexts(MethodCallContext.class);
        }

        public MethodCallContext methodCall(int i)
        {
            return getRuleContext(MethodCallContext.class, i);
        }

        public List<SingleLineCommentContext> singleLineComment()
        {
            return getRuleContexts(SingleLineCommentContext.class);
        }

        public SingleLineCommentContext singleLineComment(int i)
        {
            return getRuleContext(SingleLineCommentContext.class, i);
        }

        public List<MultiLineCommentContext> multiLineComment()
        {
            return getRuleContexts(MultiLineCommentContext.class);
        }

        public MultiLineCommentContext multiLineComment(int i)
        {
            return getRuleContext(MultiLineCommentContext.class, i);
        }

        public BlockContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex()
        {
            return RULE_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).enterBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).exitBlock(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof kernelVisitor)
                return ((kernelVisitor<? extends T>) visitor).visitBlock(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final BlockContext block() throws RecognitionException
    {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_block);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(125);
                match(BLOCKBEGIN);
                setState(135);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 &&
                    ((1L << _la) & ((1L << WORD) | (1L << MEMORY_QUALIFIER) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (
                        1L << INLINECOMMENT) | (1L << BLOCKCOMMENTSTART) | (1L << IF))) != 0))
                {
                    {
                        setState(133);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 7, _ctx))
                        {
                            case 1:
                            {
                                setState(126);
                                if_();
                            }
                            break;
                            case 2:
                            {
                                setState(127);
                                assignment();
                            }
                            break;
                            case 3:
                            {
                                setState(128);
                                prefixOperator();
                            }
                            break;
                            case 4:
                            {
                                setState(129);
                                postfixOperator();
                            }
                            break;
                            case 5:
                            {
                                setState(130);
                                methodCall();
                            }
                            break;
                            case 6:
                            {
                                setState(131);
                                singleLineComment();
                            }
                            break;
                            case 7:
                            {
                                setState(132);
                                multiLineComment();
                            }
                            break;
                        }
                    }
                    setState(137);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(138);
                match(BLOCKEND);
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class SingleLineCommentContext extends ParserRuleContext
    {
        public TerminalNode INLINECOMMENT()
        {
            return getToken(kernelParser.INLINECOMMENT, 0);
        }

        public List<TerminalNode> WORD()
        {
            return getTokens(kernelParser.WORD);
        }

        public TerminalNode WORD(int i)
        {
            return getToken(kernelParser.WORD, i);
        }

        public SingleLineCommentContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex()
        {
            return RULE_singleLineComment;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).enterSingleLineComment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).exitSingleLineComment(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof kernelVisitor)
                return ((kernelVisitor<? extends T>) visitor).visitSingleLineComment(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final SingleLineCommentContext singleLineComment() throws RecognitionException
    {
        SingleLineCommentContext _localctx = new SingleLineCommentContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_singleLineComment);
        try
        {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(140);
                match(INLINECOMMENT);
                setState(144);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER)
                {
                    if (_alt == 1)
                    {
                        {
                            {
                                setState(141);
                                match(WORD);
                            }
                        }
                    }
                    setState(146);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
                }
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class MultiLineCommentContext extends ParserRuleContext
    {
        public TerminalNode BLOCKCOMMENTSTART()
        {
            return getToken(kernelParser.BLOCKCOMMENTSTART, 0);
        }

        public TerminalNode BLOCKCOMMENTEND()
        {
            return getToken(kernelParser.BLOCKCOMMENTEND, 0);
        }

        public List<TerminalNode> WORD()
        {
            return getTokens(kernelParser.WORD);
        }

        public TerminalNode WORD(int i)
        {
            return getToken(kernelParser.WORD, i);
        }

        public MultiLineCommentContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex()
        {
            return RULE_multiLineComment;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).enterMultiLineComment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).exitMultiLineComment(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof kernelVisitor)
                return ((kernelVisitor<? extends T>) visitor).visitMultiLineComment(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final MultiLineCommentContext multiLineComment() throws RecognitionException
    {
        MultiLineCommentContext _localctx = new MultiLineCommentContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_multiLineComment);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(147);
                match(BLOCKCOMMENTSTART);
                setState(151);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == WORD)
                {
                    {
                        {
                            setState(148);
                            match(WORD);
                        }
                    }
                    setState(153);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(154);
                match(BLOCKCOMMENTEND);
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class MethodCallContext extends ParserRuleContext
    {
        public List<TerminalNode> WORD()
        {
            return getTokens(kernelParser.WORD);
        }

        public TerminalNode WORD(int i)
        {
            return getToken(kernelParser.WORD, i);
        }

        public TerminalNode LPARENT()
        {
            return getToken(kernelParser.LPARENT, 0);
        }

        public TerminalNode RPARENT()
        {
            return getToken(kernelParser.RPARENT, 0);
        }

        public List<AssignmentContext> assignment()
        {
            return getRuleContexts(AssignmentContext.class);
        }

        public AssignmentContext assignment(int i)
        {
            return getRuleContext(AssignmentContext.class, i);
        }

        public List<TerminalNode> REALNUMBER()
        {
            return getTokens(kernelParser.REALNUMBER);
        }

        public TerminalNode REALNUMBER(int i)
        {
            return getToken(kernelParser.REALNUMBER, i);
        }

        public List<TerminalNode> STRING()
        {
            return getTokens(kernelParser.STRING);
        }

        public TerminalNode STRING(int i)
        {
            return getToken(kernelParser.STRING, i);
        }

        public List<TerminalNode> COMMA()
        {
            return getTokens(kernelParser.COMMA);
        }

        public TerminalNode COMMA(int i)
        {
            return getToken(kernelParser.COMMA, i);
        }

        public MethodCallContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex()
        {
            return RULE_methodCall;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).enterMethodCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).exitMethodCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof kernelVisitor)
                return ((kernelVisitor<? extends T>) visitor).visitMethodCall(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final MethodCallContext methodCall() throws RecognitionException
    {
        MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_methodCall);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(156);
                match(WORD);
                setState(157);
                match(LPARENT);
                setState(162);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 11, _ctx))
                {
                    case 1:
                    {
                        setState(158);
                        assignment();
                    }
                    break;
                    case 2:
                    {
                        setState(159);
                        match(WORD);
                    }
                    break;
                    case 3:
                    {
                        setState(160);
                        match(REALNUMBER);
                    }
                    break;
                    case 4:
                    {
                        setState(161);
                        match(STRING);
                    }
                    break;
                }
                setState(173);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA)
                {
                    {
                        {
                            setState(164);
                            match(COMMA);
                            setState(169);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 12, _ctx))
                            {
                                case 1:
                                {
                                    setState(165);
                                    assignment();
                                }
                                break;
                                case 2:
                                {
                                    setState(166);
                                    match(WORD);
                                }
                                break;
                                case 3:
                                {
                                    setState(167);
                                    match(REALNUMBER);
                                }
                                break;
                                case 4:
                                {
                                    setState(168);
                                    match(STRING);
                                }
                                break;
                            }
                        }
                    }
                    setState(175);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(176);
                match(RPARENT);
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class AssignmentContext extends ParserRuleContext
    {
        public List<TerminalNode> WORD()
        {
            return getTokens(kernelParser.WORD);
        }

        public TerminalNode WORD(int i)
        {
            return getToken(kernelParser.WORD, i);
        }

        public TerminalNode ASSIGN()
        {
            return getToken(kernelParser.ASSIGN, 0);
        }

        public TerminalNode REALNUMBER()
        {
            return getToken(kernelParser.REALNUMBER, 0);
        }

        public MethodCallContext methodCall()
        {
            return getRuleContext(MethodCallContext.class, 0);
        }

        public TerminalNode STRING()
        {
            return getToken(kernelParser.STRING, 0);
        }

        public ExpressionContext expression()
        {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode MEMORY_QUALIFIER()
        {
            return getToken(kernelParser.MEMORY_QUALIFIER, 0);
        }

        public AssignmentContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex()
        {
            return RULE_assignment;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).enterAssignment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).exitAssignment(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof kernelVisitor)
                return ((kernelVisitor<? extends T>) visitor).visitAssignment(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final AssignmentContext assignment() throws RecognitionException
    {
        AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_assignment);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(179);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == MEMORY_QUALIFIER)
                {
                    {
                        setState(178);
                        match(MEMORY_QUALIFIER);
                    }
                }

                setState(181);
                match(WORD);
                setState(182);
                match(ASSIGN);
                setState(188);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 15, _ctx))
                {
                    case 1:
                    {
                        setState(183);
                        match(WORD);
                    }
                    break;
                    case 2:
                    {
                        setState(184);
                        match(REALNUMBER);
                    }
                    break;
                    case 3:
                    {
                        setState(185);
                        methodCall();
                    }
                    break;
                    case 4:
                    {
                        setState(186);
                        match(STRING);
                    }
                    break;
                    case 5:
                    {
                        setState(187);
                        expression();
                    }
                    break;
                }
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class ExpressionContext extends ParserRuleContext
    {
        public PrefixOperatorContext prefixOperator()
        {
            return getRuleContext(PrefixOperatorContext.class, 0);
        }

        public PostfixOperatorContext postfixOperator()
        {
            return getRuleContext(PostfixOperatorContext.class, 0);
        }

        public BinaryOperatorContext binaryOperator()
        {
            return getRuleContext(BinaryOperatorContext.class, 0);
        }

        public TerminalNode TRUE()
        {
            return getToken(kernelParser.TRUE, 0);
        }

        public List<ExpressionContext> expression()
        {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i)
        {
            return getRuleContext(ExpressionContext.class, i);
        }

        public List<TerminalNode> AND()
        {
            return getTokens(kernelParser.AND);
        }

        public TerminalNode AND(int i)
        {
            return getToken(kernelParser.AND, i);
        }

        public List<TerminalNode> OR()
        {
            return getTokens(kernelParser.OR);
        }

        public TerminalNode OR(int i)
        {
            return getToken(kernelParser.OR, i);
        }

        public ExpressionContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex()
        {
            return RULE_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).enterExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).exitExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof kernelVisitor)
                return ((kernelVisitor<? extends T>) visitor).visitExpression(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final ExpressionContext expression() throws RecognitionException
    {
        ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_expression);
        int _la;
        try
        {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(194);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 16, _ctx))
                {
                    case 1:
                    {
                        setState(190);
                        prefixOperator();
                    }
                    break;
                    case 2:
                    {
                        setState(191);
                        postfixOperator();
                    }
                    break;
                    case 3:
                    {
                        setState(192);
                        binaryOperator();
                    }
                    break;
                    case 4:
                    {
                        setState(193);
                        match(TRUE);
                    }
                    break;
                }
                setState(200);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 17, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER)
                {
                    if (_alt == 1)
                    {
                        {
                            {
                                setState(196);
                                _la = _input.LA(1);
                                if (!(_la == AND || _la == OR))
                                {
                                    _errHandler.recoverInline(this);
                                }
                                else
                                {
                                    if (_input.LA(1) == Token.EOF)
                                        matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                                setState(197);
                                expression();
                            }
                        }
                    }
                    setState(202);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 17, _ctx);
                }
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class PrefixOperatorContext extends ParserRuleContext
    {
        public TerminalNode WORD()
        {
            return getToken(kernelParser.WORD, 0);
        }

        public TerminalNode PLUSPLUS()
        {
            return getToken(kernelParser.PLUSPLUS, 0);
        }

        public TerminalNode MINUSMINUS()
        {
            return getToken(kernelParser.MINUSMINUS, 0);
        }

        public PrefixOperatorContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex()
        {
            return RULE_prefixOperator;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).enterPrefixOperator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).exitPrefixOperator(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof kernelVisitor)
                return ((kernelVisitor<? extends T>) visitor).visitPrefixOperator(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final PrefixOperatorContext prefixOperator() throws RecognitionException
    {
        PrefixOperatorContext _localctx = new PrefixOperatorContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_prefixOperator);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(203);
                _la = _input.LA(1);
                if (!(_la == PLUSPLUS || _la == MINUSMINUS))
                {
                    _errHandler.recoverInline(this);
                }
                else
                {
                    if (_input.LA(1) == Token.EOF)
                        matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
                setState(204);
                match(WORD);
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class PostfixOperatorContext extends ParserRuleContext
    {
        public TerminalNode WORD()
        {
            return getToken(kernelParser.WORD, 0);
        }

        public TerminalNode PLUSPLUS()
        {
            return getToken(kernelParser.PLUSPLUS, 0);
        }

        public TerminalNode MINUSMINUS()
        {
            return getToken(kernelParser.MINUSMINUS, 0);
        }

        public PostfixOperatorContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex()
        {
            return RULE_postfixOperator;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).enterPostfixOperator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).exitPostfixOperator(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof kernelVisitor)
                return ((kernelVisitor<? extends T>) visitor).visitPostfixOperator(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final PostfixOperatorContext postfixOperator() throws RecognitionException
    {
        PostfixOperatorContext _localctx = new PostfixOperatorContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_postfixOperator);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(206);
                match(WORD);
                setState(207);
                _la = _input.LA(1);
                if (!(_la == PLUSPLUS || _la == MINUSMINUS))
                {
                    _errHandler.recoverInline(this);
                }
                else
                {
                    if (_input.LA(1) == Token.EOF)
                        matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class BinaryOperatorContext extends ParserRuleContext
    {
        public TerminalNode PLUS()
        {
            return getToken(kernelParser.PLUS, 0);
        }

        public TerminalNode MINUS()
        {
            return getToken(kernelParser.MINUS, 0);
        }

        public TerminalNode STAR()
        {
            return getToken(kernelParser.STAR, 0);
        }

        public TerminalNode MOD()
        {
            return getToken(kernelParser.MOD, 0);
        }

        public TerminalNode DIV()
        {
            return getToken(kernelParser.DIV, 0);
        }

        public TerminalNode EQUAL()
        {
            return getToken(kernelParser.EQUAL, 0);
        }

        public TerminalNode NOTEQUAL()
        {
            return getToken(kernelParser.NOTEQUAL, 0);
        }

        public TerminalNode LESS()
        {
            return getToken(kernelParser.LESS, 0);
        }

        public TerminalNode LESSEQUAL()
        {
            return getToken(kernelParser.LESSEQUAL, 0);
        }

        public TerminalNode GREATER()
        {
            return getToken(kernelParser.GREATER, 0);
        }

        public TerminalNode GREATEREQUAL()
        {
            return getToken(kernelParser.GREATEREQUAL, 0);
        }

        public List<TerminalNode> WORD()
        {
            return getTokens(kernelParser.WORD);
        }

        public TerminalNode WORD(int i)
        {
            return getToken(kernelParser.WORD, i);
        }

        public List<TerminalNode> REALNUMBER()
        {
            return getTokens(kernelParser.REALNUMBER);
        }

        public TerminalNode REALNUMBER(int i)
        {
            return getToken(kernelParser.REALNUMBER, i);
        }

        public List<MethodCallContext> methodCall()
        {
            return getRuleContexts(MethodCallContext.class);
        }

        public MethodCallContext methodCall(int i)
        {
            return getRuleContext(MethodCallContext.class, i);
        }

        public List<TerminalNode> STRING()
        {
            return getTokens(kernelParser.STRING);
        }

        public TerminalNode STRING(int i)
        {
            return getToken(kernelParser.STRING, i);
        }

        public BinaryOperatorContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex()
        {
            return RULE_binaryOperator;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).enterBinaryOperator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof kernelListener)
                ((kernelListener) listener).exitBinaryOperator(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof kernelVisitor)
                return ((kernelVisitor<? extends T>) visitor).visitBinaryOperator(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final BinaryOperatorContext binaryOperator() throws RecognitionException
    {
        BinaryOperatorContext _localctx = new BinaryOperatorContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_binaryOperator);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(213);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 18, _ctx))
                {
                    case 1:
                    {
                        setState(209);
                        match(WORD);
                    }
                    break;
                    case 2:
                    {
                        setState(210);
                        match(REALNUMBER);
                    }
                    break;
                    case 3:
                    {
                        setState(211);
                        methodCall();
                    }
                    break;
                    case 4:
                    {
                        setState(212);
                        match(STRING);
                    }
                    break;
                }
                setState(215);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 &&
                    ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << DIV) | (1L << MOD) | (1L
                        << EQUAL) | (1L << NOTEQUAL) | (1L << LESS) | (1L << LESSEQUAL) | (1L << GREATER) | (1L
                        << GREATEREQUAL))) != 0)))
                {
                    _errHandler.recoverInline(this);
                }
                else
                {
                    if (_input.LA(1) == Token.EOF)
                        matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
                setState(220);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 19, _ctx))
                {
                    case 1:
                    {
                        setState(216);
                        match(WORD);
                    }
                    break;
                    case 2:
                    {
                        setState(217);
                        match(REALNUMBER);
                    }
                    break;
                    case 3:
                    {
                        setState(218);
                        methodCall();
                    }
                    break;
                    case 4:
                    {
                        setState(219);
                        match(STRING);
                    }
                    break;
                }
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static final String _serializedATN =
        "\u0004\u0001:\u00df\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
            "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002" +
            "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002" +
            "\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002" +
            "\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f" +
            "\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012" +
            "\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001*\b\u0001\n\u0001\f\u0001" +
            "-\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002" +
            "\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002" +
            "\u0001\u0002\u0001\u0002\u0003\u0002<\b\u0002\u0001\u0003\u0001\u0003" +
            "\u0001\u0003\u0001\u0003\u0004\u0003B\b\u0003\u000b\u0003\f\u0003C\u0001" +
            "\u0003\u0001\u0003\u0001\u0004\u0003\u0004I\b\u0004\u0001\u0004\u0001" +
            "\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001" +
            "\u0005\u0005\u0005S\b\u0005\n\u0005\f\u0005V\t\u0005\u0001\u0005\u0001" +
            "\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001" +
            "\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001" +
            "\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001" +
            "\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001" +
            "\t\u0001\t\u0003\tw\b\t\u0005\ty\b\t\n\t\f\t|\t\t\u0001\n\u0001\n\u0001" +
            "\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0086\b\n\n\n\f\n\u0089" +
            "\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b\u008f\b\u000b" +
            "\n\u000b\f\u000b\u0092\t\u000b\u0001\f\u0001\f\u0005\f\u0096\b\f\n\f\f" +
            "\f\u0099\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001" +
            "\r\u0003\r\u00a3\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00aa" +
            "\b\r\u0005\r\u00ac\b\r\n\r\f\r\u00af\t\r\u0001\r\u0001\r\u0001\u000e\u0003" +
            "\u000e\u00b4\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001" +
            "\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00bd\b\u000e\u0001\u000f\u0001" +
            "\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00c3\b\u000f\u0001\u000f\u0001" +
            "\u000f\u0005\u000f\u00c7\b\u000f\n\u000f\f\u000f\u00ca\t\u000f\u0001\u0010" +
            "\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012" +
            "\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00d6\b\u0012\u0001\u0012" +
            "\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00dd\b\u0012" +
            "\u0001\u0012\u0000\u0000\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010" +
            "\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0004\u0002\u0000" +
            "\u0006\u000699\u0001\u0000\u0015\u0016\u0002\u0000\u000f\u000f\u0011\u0011" +
            "\u0005\u0000\u000e\u000e\u0010\u0010\u0012\u0014)*03\u00fc\u0000&\u0001" +
            "\u0000\u0000\u0000\u0002+\u0001\u0000\u0000\u0000\u0004;\u0001\u0000\u0000" +
            "\u0000\u0006=\u0001\u0000\u0000\u0000\bH\u0001\u0000\u0000\u0000\nL\u0001" +
            "\u0000\u0000\u0000\fY\u0001\u0000\u0000\u0000\u000e^\u0001\u0000\u0000" +
            "\u0000\u0010h\u0001\u0000\u0000\u0000\u0012n\u0001\u0000\u0000\u0000\u0014" +
            "}\u0001\u0000\u0000\u0000\u0016\u008c\u0001\u0000\u0000\u0000\u0018\u0093" +
            "\u0001\u0000\u0000\u0000\u001a\u009c\u0001\u0000\u0000\u0000\u001c\u00b3" +
            "\u0001\u0000\u0000\u0000\u001e\u00c2\u0001\u0000\u0000\u0000 \u00cb\u0001" +
            "\u0000\u0000\u0000\"\u00ce\u0001\u0000\u0000\u0000$\u00d5\u0001\u0000" +
            "\u0000\u0000&\'\u0003\u0002\u0001\u0000\'\u0001\u0001\u0000\u0000\u0000" +
            "(*\u0003\u0004\u0002\u0000)(\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000" +
            "\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,\u0003\u0001" +
            "\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000.<\u0003\u000e\u0007\u0000" +
            "/<\u0003\u0010\b\u00000<\u0003\u0012\t\u00001<\u0003\n\u0005\u00002<\u0003" +
            "\f\u0006\u00003<\u0003\u001c\u000e\u00004<\u0003\u001a\r\u00005<\u0003" +
            "\u0016\u000b\u00006<\u0003\u0018\f\u00007<\u0003\u0006\u0003\u00008<\u0003" +
            " \u0010\u00009<\u0003\"\u0011\u0000:<\u0003\u0012\t\u0000;.\u0001\u0000" +
            "\u0000\u0000;/\u0001\u0000\u0000\u0000;0\u0001\u0000\u0000\u0000;1\u0001" +
            "\u0000\u0000\u0000;2\u0001\u0000\u0000\u0000;3\u0001\u0000\u0000\u0000" +
            ";4\u0001\u0000\u0000\u0000;5\u0001\u0000\u0000\u0000;6\u0001\u0000\u0000" +
            "\u0000;7\u0001\u0000\u0000\u0000;8\u0001\u0000\u0000\u0000;9\u0001\u0000" +
            "\u0000\u0000;:\u0001\u0000\u0000\u0000<\u0005\u0001\u0000\u0000\u0000" +
            "=>\u00054\u0000\u0000>?\u0005\u0001\u0000\u0000?A\u0005\n\u0000\u0000" +
            "@B\u0005\u0001\u0000\u0000A@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000" +
            "\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0001\u0000" +
            "\u0000\u0000EF\u0005\u000b\u0000\u0000F\u0007\u0001\u0000\u0000\u0000" +
            "GI\u0005\u0004\u0000\u0000HG\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000" +
            "\u0000IJ\u0001\u0000\u0000\u0000JK\u0005\u0001\u0000\u0000K\t\u0001\u0000" +
            "\u0000\u0000LM\u0007\u0000\u0000\u0000MN\u0005\u0001\u0000\u0000NO\u0005" +
            "\b\u0000\u0000OT\u0003\b\u0004\u0000PQ\u0005\u001f\u0000\u0000QS\u0003" +
            "\b\u0004\u0000RP\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001" +
            "\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UW\u0001\u0000\u0000\u0000" +
            "VT\u0001\u0000\u0000\u0000WX\u0005\t\u0000\u0000X\u000b\u0001\u0000\u0000" +
            "\u0000YZ\u0003\n\u0005\u0000Z[\u0005\n\u0000\u0000[\\\u0003\u0014\n\u0000" +
            "\\]\u0005\u000b\u0000\u0000]\r\u0001\u0000\u0000\u0000^_\u00057\u0000" +
            "\u0000_`\u0005\b\u0000\u0000`a\u0003\u001c\u000e\u0000ab\u0005\u001d\u0000" +
            "\u0000bc\u0003\u001e\u000f\u0000cd\u0005\u001d\u0000\u0000de\u0003\u001e" +
            "\u000f\u0000ef\u0005\t\u0000\u0000fg\u0003\u0014\n\u0000g\u000f\u0001" +
            "\u0000\u0000\u0000hi\u00058\u0000\u0000ij\u0005\b\u0000\u0000jk\u0003" +
            "\u001e\u000f\u0000kl\u0005\t\u0000\u0000lm\u0003\u0014\n\u0000m\u0011" +
            "\u0001\u0000\u0000\u0000no\u00055\u0000\u0000op\u0005\b\u0000\u0000pq" +
            "\u0003\u001e\u000f\u0000qr\u0005\t\u0000\u0000rz\u0003\u0014\n\u0000s" +
            "v\u00056\u0000\u0000tw\u0003\u0014\n\u0000uw\u0003\u0012\t\u0000vt\u0001" +
            "\u0000\u0000\u0000vu\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000" +
            "xs\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000" +
            "\u0000z{\u0001\u0000\u0000\u0000{\u0013\u0001\u0000\u0000\u0000|z\u0001" +
            "\u0000\u0000\u0000}\u0087\u0005\n\u0000\u0000~\u0086\u0003\u0012\t\u0000" +
            "\u007f\u0086\u0003\u001c\u000e\u0000\u0080\u0086\u0003 \u0010\u0000\u0081" +
            "\u0086\u0003\"\u0011\u0000\u0082\u0086\u0003\u001a\r\u0000\u0083\u0086" +
            "\u0003\u0016\u000b\u0000\u0084\u0086\u0003\u0018\f\u0000\u0085~\u0001" +
            "\u0000\u0000\u0000\u0085\u007f\u0001\u0000\u0000\u0000\u0085\u0080\u0001" +
            "\u0000\u0000\u0000\u0085\u0081\u0001\u0000\u0000\u0000\u0085\u0082\u0001" +
            "\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0084\u0001" +
            "\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001" +
            "\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0001" +
            "\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008b\u0005" +
            "\u000b\u0000\u0000\u008b\u0015\u0001\u0000\u0000\u0000\u008c\u0090\u0005" +
            "+\u0000\u0000\u008d\u008f\u0005\u0001\u0000\u0000\u008e\u008d\u0001\u0000" +
            "\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000" +
            "\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0017\u0001\u0000" +
            "\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0097\u0005,\u0000" +
            "\u0000\u0094\u0096\u0005\u0001\u0000\u0000\u0095\u0094\u0001\u0000\u0000" +
            "\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000" +
            "\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009a\u0001\u0000\u0000" +
            "\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009b\u0005-\u0000\u0000" +
            "\u009b\u0019\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0001\u0000\u0000" +
            "\u009d\u00a2\u0005\b\u0000\u0000\u009e\u00a3\u0003\u001c\u000e\u0000\u009f" +
            "\u00a3\u0005\u0001\u0000\u0000\u00a0\u00a3\u0005\u0002\u0000\u0000\u00a1" +
            "\u00a3\u0005\u0007\u0000\u0000\u00a2\u009e\u0001\u0000\u0000\u0000\u00a2" +
            "\u009f\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2" +
            "\u00a1\u0001\u0000\u0000\u0000\u00a3\u00ad\u0001\u0000\u0000\u0000\u00a4" +
            "\u00a9\u0005\u001f\u0000\u0000\u00a5\u00aa\u0003\u001c\u000e\u0000\u00a6" +
            "\u00aa\u0005\u0001\u0000\u0000\u00a7\u00aa\u0005\u0002\u0000\u0000\u00a8" +
            "\u00aa\u0005\u0007\u0000\u0000\u00a9\u00a5\u0001\u0000\u0000\u0000\u00a9" +
            "\u00a6\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9" +
            "\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab" +
            "\u00a4\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad" +
            "\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae" +
            "\u00b0\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0" +
            "\u00b1\u0005\t\u0000\u0000\u00b1\u001b\u0001\u0000\u0000\u0000\u00b2\u00b4" +
            "\u0005\u0004\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b3\u00b4" +
            "\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6" +
            "\u0005\u0001\u0000\u0000\u00b6\u00bc\u0005 \u0000\u0000\u00b7\u00bd\u0005" +
            "\u0001\u0000\u0000\u00b8\u00bd\u0005\u0002\u0000\u0000\u00b9\u00bd\u0003" +
            "\u001a\r\u0000\u00ba\u00bd\u0005\u0007\u0000\u0000\u00bb\u00bd\u0003\u001e" +
            "\u000f\u0000\u00bc\u00b7\u0001\u0000\u0000\u0000\u00bc\u00b8\u0001\u0000" +
            "\u0000\u0000\u00bc\u00b9\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000" +
            "\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd\u001d\u0001\u0000" +
            "\u0000\u0000\u00be\u00c3\u0003 \u0010\u0000\u00bf\u00c3\u0003\"\u0011" +
            "\u0000\u00c0\u00c3\u0003$\u0012\u0000\u00c1\u00c3\u0005.\u0000\u0000\u00c2" +
            "\u00be\u0001\u0000\u0000\u0000\u00c2\u00bf\u0001\u0000\u0000\u0000\u00c2" +
            "\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3" +
            "\u00c8\u0001\u0000\u0000\u0000\u00c4\u00c5\u0007\u0001\u0000\u0000\u00c5" +
            "\u00c7\u0003\u001e\u000f\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7" +
            "\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8" +
            "\u00c9\u0001\u0000\u0000\u0000\u00c9\u001f\u0001\u0000\u0000\u0000\u00ca" +
            "\u00c8\u0001\u0000\u0000\u0000\u00cb\u00cc\u0007\u0002\u0000\u0000\u00cc" +
            "\u00cd\u0005\u0001\u0000\u0000\u00cd!\u0001\u0000\u0000\u0000\u00ce\u00cf" +
            "\u0005\u0001\u0000\u0000\u00cf\u00d0\u0007\u0002\u0000\u0000\u00d0#\u0001" +
            "\u0000\u0000\u0000\u00d1\u00d6\u0005\u0001\u0000\u0000\u00d2\u00d6\u0005" +
            "\u0002\u0000\u0000\u00d3\u00d6\u0003\u001a\r\u0000\u00d4\u00d6\u0005\u0007" +
            "\u0000\u0000\u00d5\u00d1\u0001\u0000\u0000\u0000\u00d5\u00d2\u0001\u0000" +
            "\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d4\u0001\u0000" +
            "\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00dc\u0007\u0003" +
            "\u0000\u0000\u00d8\u00dd\u0005\u0001\u0000\u0000\u00d9\u00dd\u0005\u0002" +
            "\u0000\u0000\u00da\u00dd\u0003\u001a\r\u0000\u00db\u00dd\u0005\u0007\u0000" +
            "\u0000\u00dc\u00d8\u0001\u0000\u0000\u0000\u00dc\u00d9\u0001\u0000\u0000" +
            "\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00db\u0001\u0000\u0000" +
            "\u0000\u00dd%\u0001\u0000\u0000\u0000\u0014+;CHTvz\u0085\u0087\u0090\u0097" +
            "\u00a2\u00a9\u00ad\u00b3\u00bc\u00c2\u00c8\u00d5\u00dc";
    public static final ATN _ATN =
        new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static
    {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++)
        {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}
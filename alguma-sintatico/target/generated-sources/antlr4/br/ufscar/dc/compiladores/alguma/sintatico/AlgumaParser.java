// Generated from br\u005Cufscar\dc\compiladores\alguma\sintatico\Alguma.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.alguma.sintatico;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlgumaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, TIPO_VAR=16, 
		NUMINT=17, NUMREAL=18, OP_BOOL=19, VARIAVEL=20, CADEIA=21, OP_ARIT1=22, 
		OP_ARIT2=23, OP_REL=24, COMENTARIO=25, WS=26;
	public static final int
		RULE_programa = 0, RULE_listaDeclaracoes = 1, RULE_declaracao = 2, RULE_expressaoAritmetica = 3, 
		RULE_termoAritmetico = 4, RULE_fatorAritmetico = 5, RULE_expressaoRelacional = 6, 
		RULE_termoRelacional = 7, RULE_listaComandos = 8, RULE_comando = 9, RULE_comandoAtribuicao = 10, 
		RULE_comandoEntrada = 11, RULE_comandoSaida = 12, RULE_comandoCondicao = 13, 
		RULE_comandoRepeticao = 14, RULE_subAlgoritmo = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "listaDeclaracoes", "declaracao", "expressaoAritmetica", 
			"termoAritmetico", "fatorAritmetico", "expressaoRelacional", "termoRelacional", 
			"listaComandos", "comando", "comandoAtribuicao", "comandoEntrada", "comandoSaida", 
			"comandoCondicao", "comandoRepeticao", "subAlgoritmo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'DECLARACOES'", "'ALGORITMO'", "'('", "')'", "'ATRIBUIR'", 
			"'A'", "'LER'", "'IMPRIMIR'", "'SE'", "'ENTAO'", "'SENAO'", "'ENQUANTO'", 
			"'INICIO'", "'FIM'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "TIPO_VAR", "NUMINT", "NUMREAL", "OP_BOOL", "VARIAVEL", 
			"CADEIA", "OP_ARIT1", "OP_ARIT2", "OP_REL", "COMENTARIO", "WS"
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
	public String getGrammarFileName() { return "Alguma.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlgumaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public ListaComandosContext lc;
		public ListaDeclaracoesContext listaDeclaracoes() {
			return getRuleContext(ListaDeclaracoesContext.class,0);
		}
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__0);
			setState(33);
			match(T__1);
			setState(34);
			listaDeclaracoes();
			setState(35);
			match(T__0);
			setState(36);
			match(T__2);
			setState(37);
			((ProgramaContext)_localctx).lc = listaComandos();
			 System.out.println("Numero de comandos: "+((ProgramaContext)_localctx).lc.numComandos); 
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

	public static class ListaDeclaracoesContext extends ParserRuleContext {
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public ListaDeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaDeclaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterListaDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitListaDeclaracoes(this);
		}
	}

	public final ListaDeclaracoesContext listaDeclaracoes() throws RecognitionException {
		ListaDeclaracoesContext _localctx = new ListaDeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_listaDeclaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				declaracao();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VARIAVEL );
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

	public static class DeclaracaoContext extends ParserRuleContext {
		public Token VARIAVEL;
		public Token TIPO_VAR;
		public TerminalNode VARIAVEL() { return getToken(AlgumaParser.VARIAVEL, 0); }
		public TerminalNode TIPO_VAR() { return getToken(AlgumaParser.TIPO_VAR, 0); }
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			((DeclaracaoContext)_localctx).VARIAVEL = match(VARIAVEL);
			setState(46);
			match(T__0);
			setState(47);
			((DeclaracaoContext)_localctx).TIPO_VAR = match(TIPO_VAR);
			 System.out.println("    Declara????o: Var="+(((DeclaracaoContext)_localctx).VARIAVEL!=null?((DeclaracaoContext)_localctx).VARIAVEL.getText():null)+", Tipo="+(((DeclaracaoContext)_localctx).TIPO_VAR!=null?((DeclaracaoContext)_localctx).TIPO_VAR.getText():null)); 
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

	public static class ExpressaoAritmeticaContext extends ParserRuleContext {
		public TermoAritmeticoContext termoAritmetico() {
			return getRuleContext(TermoAritmeticoContext.class,0);
		}
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public TerminalNode OP_ARIT1() { return getToken(AlgumaParser.OP_ARIT1, 0); }
		public ExpressaoAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterExpressaoAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitExpressaoAritmetica(this);
		}
	}

	public final ExpressaoAritmeticaContext expressaoAritmetica() throws RecognitionException {
		return expressaoAritmetica(0);
	}

	private ExpressaoAritmeticaContext expressaoAritmetica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoAritmeticaContext _localctx = new ExpressaoAritmeticaContext(_ctx, _parentState);
		ExpressaoAritmeticaContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expressaoAritmetica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(51);
			termoAritmetico(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoAritmeticaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritmetica);
					setState(53);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(54);
					match(OP_ARIT1);
					setState(55);
					termoAritmetico(0);
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermoAritmeticoContext extends ParserRuleContext {
		public FatorAritmeticoContext fatorAritmetico() {
			return getRuleContext(FatorAritmeticoContext.class,0);
		}
		public TermoAritmeticoContext termoAritmetico() {
			return getRuleContext(TermoAritmeticoContext.class,0);
		}
		public TerminalNode OP_ARIT2() { return getToken(AlgumaParser.OP_ARIT2, 0); }
		public TermoAritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoAritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterTermoAritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitTermoAritmetico(this);
		}
	}

	public final TermoAritmeticoContext termoAritmetico() throws RecognitionException {
		return termoAritmetico(0);
	}

	private TermoAritmeticoContext termoAritmetico(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermoAritmeticoContext _localctx = new TermoAritmeticoContext(_ctx, _parentState);
		TermoAritmeticoContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_termoAritmetico, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(62);
			fatorAritmetico();
			}
			_ctx.stop = _input.LT(-1);
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermoAritmeticoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_termoAritmetico);
					setState(64);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(65);
					match(OP_ARIT2);
					setState(66);
					fatorAritmetico();
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FatorAritmeticoContext extends ParserRuleContext {
		public TerminalNode NUMINT() { return getToken(AlgumaParser.NUMINT, 0); }
		public TerminalNode NUMREAL() { return getToken(AlgumaParser.NUMREAL, 0); }
		public TerminalNode VARIAVEL() { return getToken(AlgumaParser.VARIAVEL, 0); }
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public FatorAritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fatorAritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterFatorAritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitFatorAritmetico(this);
		}
	}

	public final FatorAritmeticoContext fatorAritmetico() throws RecognitionException {
		FatorAritmeticoContext _localctx = new FatorAritmeticoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fatorAritmetico);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(NUMINT);
				}
				break;
			case NUMREAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(NUMREAL);
				}
				break;
			case VARIAVEL:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(VARIAVEL);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				match(T__3);
				setState(76);
				expressaoAritmetica(0);
				setState(77);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExpressaoRelacionalContext extends ParserRuleContext {
		public TermoRelacionalContext termoRelacional() {
			return getRuleContext(TermoRelacionalContext.class,0);
		}
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public TerminalNode OP_BOOL() { return getToken(AlgumaParser.OP_BOOL, 0); }
		public ExpressaoRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterExpressaoRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitExpressaoRelacional(this);
		}
	}

	public final ExpressaoRelacionalContext expressaoRelacional() throws RecognitionException {
		return expressaoRelacional(0);
	}

	private ExpressaoRelacionalContext expressaoRelacional(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoRelacionalContext _localctx = new ExpressaoRelacionalContext(_ctx, _parentState);
		ExpressaoRelacionalContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expressaoRelacional, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(82);
			termoRelacional();
			}
			_ctx.stop = _input.LT(-1);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoRelacionalContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressaoRelacional);
					setState(84);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(85);
					match(OP_BOOL);
					setState(86);
					termoRelacional();
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermoRelacionalContext extends ParserRuleContext {
		public List<ExpressaoAritmeticaContext> expressaoAritmetica() {
			return getRuleContexts(ExpressaoAritmeticaContext.class);
		}
		public ExpressaoAritmeticaContext expressaoAritmetica(int i) {
			return getRuleContext(ExpressaoAritmeticaContext.class,i);
		}
		public TerminalNode OP_REL() { return getToken(AlgumaParser.OP_REL, 0); }
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public TermoRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterTermoRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitTermoRelacional(this);
		}
	}

	public final TermoRelacionalContext termoRelacional() throws RecognitionException {
		TermoRelacionalContext _localctx = new TermoRelacionalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_termoRelacional);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				expressaoAritmetica(0);
				setState(93);
				match(OP_REL);
				setState(94);
				expressaoAritmetica(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(T__3);
				setState(97);
				expressaoRelacional(0);
				setState(98);
				match(T__4);
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

	public static class ListaComandosContext extends ParserRuleContext {
		public int numComandos;
		public ComandoContext cmd;
		public ListaComandosContext lc;
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public ListaComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaComandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterListaComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitListaComandos(this);
		}
	}

	public final ListaComandosContext listaComandos() throws RecognitionException {
		ListaComandosContext _localctx = new ListaComandosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listaComandos);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				((ListaComandosContext)_localctx).cmd = comando();
				 System.out.println("Apareceu um comando do tipo "+((ListaComandosContext)_localctx).cmd.tipoComando); 
				setState(104);
				((ListaComandosContext)_localctx).lc = listaComandos();
				 ((ListaComandosContext)_localctx).numComandos =  ((ListaComandosContext)_localctx).lc.numComandos + 1;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				((ListaComandosContext)_localctx).cmd = comando();
				 System.out.println("Apareceu um comando do tipo "+((ListaComandosContext)_localctx).cmd.tipoComando); ((ListaComandosContext)_localctx).numComandos =  1;
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

	public static class ComandoContext extends ParserRuleContext {
		public String tipoComando;
		public ComandoAtribuicaoContext comandoAtribuicao() {
			return getRuleContext(ComandoAtribuicaoContext.class,0);
		}
		public ComandoEntradaContext comandoEntrada() {
			return getRuleContext(ComandoEntradaContext.class,0);
		}
		public ComandoSaidaContext comandoSaida() {
			return getRuleContext(ComandoSaidaContext.class,0);
		}
		public ComandoCondicaoContext comandoCondicao() {
			return getRuleContext(ComandoCondicaoContext.class,0);
		}
		public ComandoRepeticaoContext comandoRepeticao() {
			return getRuleContext(ComandoRepeticaoContext.class,0);
		}
		public SubAlgoritmoContext subAlgoritmo() {
			return getRuleContext(SubAlgoritmoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comando);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				comandoAtribuicao();
				 ((ComandoContext)_localctx).tipoComando =  "Atribuicao"; 
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				comandoEntrada();
				 ((ComandoContext)_localctx).tipoComando =  "Entrada"; 
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				comandoSaida();
				 ((ComandoContext)_localctx).tipoComando =  "Saida"; 
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				comandoCondicao();
				 ((ComandoContext)_localctx).tipoComando =  "Condicao"; 
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				comandoRepeticao();
				 ((ComandoContext)_localctx).tipoComando =  "Repeticao"; 
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 6);
				{
				setState(127);
				subAlgoritmo();
				 ((ComandoContext)_localctx).tipoComando =  "Subalgoritmo"; 
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ComandoAtribuicaoContext extends ParserRuleContext {
		public ExpressaoAritmeticaContext expressaoAritmetica;
		public Token VARIAVEL;
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public TerminalNode VARIAVEL() { return getToken(AlgumaParser.VARIAVEL, 0); }
		public ComandoAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoAtribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterComandoAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitComandoAtribuicao(this);
		}
	}

	public final ComandoAtribuicaoContext comandoAtribuicao() throws RecognitionException {
		ComandoAtribuicaoContext _localctx = new ComandoAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comandoAtribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__5);
			setState(133);
			((ComandoAtribuicaoContext)_localctx).expressaoAritmetica = expressaoAritmetica(0);
			setState(134);
			match(T__6);
			setState(135);
			((ComandoAtribuicaoContext)_localctx).VARIAVEL = match(VARIAVEL);
			 System.out.println("      "+(((ComandoAtribuicaoContext)_localctx).VARIAVEL!=null?((ComandoAtribuicaoContext)_localctx).VARIAVEL.getText():null)+" = "+(((ComandoAtribuicaoContext)_localctx).expressaoAritmetica!=null?_input.getText(((ComandoAtribuicaoContext)_localctx).expressaoAritmetica.start,((ComandoAtribuicaoContext)_localctx).expressaoAritmetica.stop):null)); 
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

	public static class ComandoEntradaContext extends ParserRuleContext {
		public Token VARIAVEL;
		public TerminalNode VARIAVEL() { return getToken(AlgumaParser.VARIAVEL, 0); }
		public ComandoEntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoEntrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterComandoEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitComandoEntrada(this);
		}
	}

	public final ComandoEntradaContext comandoEntrada() throws RecognitionException {
		ComandoEntradaContext _localctx = new ComandoEntradaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comandoEntrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__7);
			setState(139);
			((ComandoEntradaContext)_localctx).VARIAVEL = match(VARIAVEL);
			 System.out.println("      "+(((ComandoEntradaContext)_localctx).VARIAVEL!=null?((ComandoEntradaContext)_localctx).VARIAVEL.getText():null)+" = ENTRADA"); 
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

	public static class ComandoSaidaContext extends ParserRuleContext {
		public Token texto;
		public TerminalNode VARIAVEL() { return getToken(AlgumaParser.VARIAVEL, 0); }
		public TerminalNode CADEIA() { return getToken(AlgumaParser.CADEIA, 0); }
		public ComandoSaidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoSaida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterComandoSaida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitComandoSaida(this);
		}
	}

	public final ComandoSaidaContext comandoSaida() throws RecognitionException {
		ComandoSaidaContext _localctx = new ComandoSaidaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comandoSaida);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__8);
			setState(143);
			((ComandoSaidaContext)_localctx).texto = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==VARIAVEL || _la==CADEIA) ) {
				((ComandoSaidaContext)_localctx).texto = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 System.out.println("      IMPRIMIR "+(((ComandoSaidaContext)_localctx).texto!=null?((ComandoSaidaContext)_localctx).texto.getText():null)); 
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

	public static class ComandoCondicaoContext extends ParserRuleContext {
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ComandoCondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoCondicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterComandoCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitComandoCondicao(this);
		}
	}

	public final ComandoCondicaoContext comandoCondicao() throws RecognitionException {
		ComandoCondicaoContext _localctx = new ComandoCondicaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comandoCondicao);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(T__9);
				setState(147);
				expressaoRelacional(0);
				setState(148);
				match(T__10);
				setState(149);
				comando();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(T__9);
				setState(152);
				expressaoRelacional(0);
				setState(153);
				match(T__10);
				setState(154);
				comando();
				setState(155);
				match(T__11);
				setState(156);
				comando();
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

	public static class ComandoRepeticaoContext extends ParserRuleContext {
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ComandoRepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoRepeticao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterComandoRepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitComandoRepeticao(this);
		}
	}

	public final ComandoRepeticaoContext comandoRepeticao() throws RecognitionException {
		ComandoRepeticaoContext _localctx = new ComandoRepeticaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comandoRepeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__12);
			setState(161);
			expressaoRelacional(0);
			setState(162);
			comando();
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

	public static class SubAlgoritmoContext extends ParserRuleContext {
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public SubAlgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subAlgoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterSubAlgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitSubAlgoritmo(this);
		}
	}

	public final SubAlgoritmoContext subAlgoritmo() throws RecognitionException {
		SubAlgoritmoContext _localctx = new SubAlgoritmoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_subAlgoritmo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__13);
			setState(165);
			listaComandos();
			setState(166);
			match(T__14);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expressaoAritmetica_sempred((ExpressaoAritmeticaContext)_localctx, predIndex);
		case 4:
			return termoAritmetico_sempred((TermoAritmeticoContext)_localctx, predIndex);
		case 6:
			return expressaoRelacional_sempred((ExpressaoRelacionalContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressaoAritmetica_sempred(ExpressaoAritmeticaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean termoAritmetico_sempred(TermoAritmeticoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressaoRelacional_sempred(ExpressaoRelacionalContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u00ab\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3,\n\3\r\3\16\3-\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5;\n\5\f\5\16\5>\13\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\7\6F\n\6\f\6\16\6I\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7R\n\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\7\bZ\n\b\f\b\16\b]\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\tg\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nq\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u0085\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00a1\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\2\5\b\n"+
		"\16\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\3\3\2\26\27\2\u00a9\2"+
		"\"\3\2\2\2\4+\3\2\2\2\6/\3\2\2\2\b\64\3\2\2\2\n?\3\2\2\2\fQ\3\2\2\2\16"+
		"S\3\2\2\2\20f\3\2\2\2\22p\3\2\2\2\24\u0084\3\2\2\2\26\u0086\3\2\2\2\30"+
		"\u008c\3\2\2\2\32\u0090\3\2\2\2\34\u00a0\3\2\2\2\36\u00a2\3\2\2\2 \u00a6"+
		"\3\2\2\2\"#\7\3\2\2#$\7\4\2\2$%\5\4\3\2%&\7\3\2\2&\'\7\5\2\2\'(\5\22\n"+
		"\2()\b\2\1\2)\3\3\2\2\2*,\5\6\4\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2"+
		"\2\2.\5\3\2\2\2/\60\7\26\2\2\60\61\7\3\2\2\61\62\7\22\2\2\62\63\b\4\1"+
		"\2\63\7\3\2\2\2\64\65\b\5\1\2\65\66\5\n\6\2\66<\3\2\2\2\678\f\4\2\289"+
		"\7\30\2\29;\5\n\6\2:\67\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\t\3\2\2"+
		"\2><\3\2\2\2?@\b\6\1\2@A\5\f\7\2AG\3\2\2\2BC\f\4\2\2CD\7\31\2\2DF\5\f"+
		"\7\2EB\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\13\3\2\2\2IG\3\2\2\2JR\7"+
		"\23\2\2KR\7\24\2\2LR\7\26\2\2MN\7\6\2\2NO\5\b\5\2OP\7\7\2\2PR\3\2\2\2"+
		"QJ\3\2\2\2QK\3\2\2\2QL\3\2\2\2QM\3\2\2\2R\r\3\2\2\2ST\b\b\1\2TU\5\20\t"+
		"\2U[\3\2\2\2VW\f\4\2\2WX\7\25\2\2XZ\5\20\t\2YV\3\2\2\2Z]\3\2\2\2[Y\3\2"+
		"\2\2[\\\3\2\2\2\\\17\3\2\2\2][\3\2\2\2^_\5\b\5\2_`\7\32\2\2`a\5\b\5\2"+
		"ag\3\2\2\2bc\7\6\2\2cd\5\16\b\2de\7\7\2\2eg\3\2\2\2f^\3\2\2\2fb\3\2\2"+
		"\2g\21\3\2\2\2hi\5\24\13\2ij\b\n\1\2jk\5\22\n\2kl\b\n\1\2lq\3\2\2\2mn"+
		"\5\24\13\2no\b\n\1\2oq\3\2\2\2ph\3\2\2\2pm\3\2\2\2q\23\3\2\2\2rs\5\26"+
		"\f\2st\b\13\1\2t\u0085\3\2\2\2uv\5\30\r\2vw\b\13\1\2w\u0085\3\2\2\2xy"+
		"\5\32\16\2yz\b\13\1\2z\u0085\3\2\2\2{|\5\34\17\2|}\b\13\1\2}\u0085\3\2"+
		"\2\2~\177\5\36\20\2\177\u0080\b\13\1\2\u0080\u0085\3\2\2\2\u0081\u0082"+
		"\5 \21\2\u0082\u0083\b\13\1\2\u0083\u0085\3\2\2\2\u0084r\3\2\2\2\u0084"+
		"u\3\2\2\2\u0084x\3\2\2\2\u0084{\3\2\2\2\u0084~\3\2\2\2\u0084\u0081\3\2"+
		"\2\2\u0085\25\3\2\2\2\u0086\u0087\7\b\2\2\u0087\u0088\5\b\5\2\u0088\u0089"+
		"\7\t\2\2\u0089\u008a\7\26\2\2\u008a\u008b\b\f\1\2\u008b\27\3\2\2\2\u008c"+
		"\u008d\7\n\2\2\u008d\u008e\7\26\2\2\u008e\u008f\b\r\1\2\u008f\31\3\2\2"+
		"\2\u0090\u0091\7\13\2\2\u0091\u0092\t\2\2\2\u0092\u0093\b\16\1\2\u0093"+
		"\33\3\2\2\2\u0094\u0095\7\f\2\2\u0095\u0096\5\16\b\2\u0096\u0097\7\r\2"+
		"\2\u0097\u0098\5\24\13\2\u0098\u00a1\3\2\2\2\u0099\u009a\7\f\2\2\u009a"+
		"\u009b\5\16\b\2\u009b\u009c\7\r\2\2\u009c\u009d\5\24\13\2\u009d\u009e"+
		"\7\16\2\2\u009e\u009f\5\24\13\2\u009f\u00a1\3\2\2\2\u00a0\u0094\3\2\2"+
		"\2\u00a0\u0099\3\2\2\2\u00a1\35\3\2\2\2\u00a2\u00a3\7\17\2\2\u00a3\u00a4"+
		"\5\16\b\2\u00a4\u00a5\5\24\13\2\u00a5\37\3\2\2\2\u00a6\u00a7\7\20\2\2"+
		"\u00a7\u00a8\5\22\n\2\u00a8\u00a9\7\21\2\2\u00a9!\3\2\2\2\13-<GQ[fp\u0084"+
		"\u00a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
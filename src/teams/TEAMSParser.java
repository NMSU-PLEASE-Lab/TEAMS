// Generated from TEAMS.g by ANTLR 4.2.2

package teams;
import java.util.Vector;
import extension.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TEAMSParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__31=1, T__30=2, T__29=3, T__28=4, T__27=5, T__26=6, T__25=7, T__24=8, 
		T__23=9, T__22=10, T__21=11, T__20=12, T__19=13, T__18=14, T__17=15, T__16=16, 
		T__15=17, T__14=18, T__13=19, T__12=20, T__11=21, T__10=22, T__9=23, T__8=24, 
		T__7=25, T__6=26, T__5=27, T__4=28, T__3=29, T__2=30, T__1=31, T__0=32, 
		SPACE=33, INT=34, Identifier=35, RegExp=36, WS=37;
	public static final String[] tokenNames = {
		"<INVALID>", "'long'", "'short'", "','", "'*'", "'withincode'", "'('", 
		"':'", "'int'", "'before'", "'{'", "'double'", "'boolean'", "'}'", "'aspect'", 
		"'float'", "'after'", "'fieldAccess'", "'char'", "'byte'", "'loop'", "'.'", 
		"')'", "'yourDesignator'", "'requires'", "';'", "'within'", "'&&'", "'call'", 
		"'pointcut '", "'execution'", "'basicblock'", "'!'", "SPACE", "INT", "Identifier", 
		"RegExp", "WS"
	};
	public static final int
		RULE_eval = 0, RULE_aspect = 1, RULE_myAspect = 2, RULE_pointcutDefinition = 3, 
		RULE_adviceDefinition = 4, RULE_pointcutExpReferences = 5, RULE_adviceExp = 6, 
		RULE_adviceExecutionModel = 7, RULE_before = 8, RULE_after = 9, RULE_pointcutExp = 10, 
		RULE_notPointcutExp = 11, RULE_atomExp = 12, RULE_designator = 13, RULE_args = 14, 
		RULE_arg = 15, RULE_simpleArgument = 16, RULE_call = 17, RULE_methodOrConstructorPattern = 18, 
		RULE_execution = 19, RULE_basicblock = 20, RULE_fieldAccess = 21, RULE_loop = 22, 
		RULE_yourDesignator = 23, RULE_within = 24, RULE_withincode = 25, RULE_path = 26, 
		RULE_primitiveType = 27;
	public static final String[] ruleNames = {
		"eval", "aspect", "myAspect", "pointcutDefinition", "adviceDefinition", 
		"pointcutExpReferences", "adviceExp", "adviceExecutionModel", "before", 
		"after", "pointcutExp", "notPointcutExp", "atomExp", "designator", "args", 
		"arg", "simpleArgument", "call", "methodOrConstructorPattern", "execution", 
		"basicblock", "fieldAccess", "loop", "yourDesignator", "within", "withincode", 
		"path", "primitiveType"
	};

	@Override
	public String getGrammarFileName() { return "TEAMS.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	 
	/*
	* An instance of the Aspect class to hold the aspect's data 
	*/
	Aspect myAsp = new Aspect();

	public TEAMSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EvalContext extends ParserRuleContext {
		public Aspect value;
		public AspectContext e;
		public AspectContext aspect;
		public AspectContext aspect() {
			return getRuleContext(AspectContext.class,0);
		}
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).enterEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).exitEval(this);
		}
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_eval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); ((EvalContext)_localctx).e = ((EvalContext)_localctx).aspect = aspect();

			        myAsp = ((EvalContext)_localctx).aspect.value;
			        ((EvalContext)_localctx).value =  ((EvalContext)_localctx).aspect.value; 
			        
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

	public static class AspectContext extends ParserRuleContext {
		public Aspect value;
		public MyAspectContext e;
		public PointcutDefinitionContext pointcutDefinition;
		public AdviceDefinitionContext adviceDefinition;
		public List<AdviceDefinitionContext> adviceDefinition() {
			return getRuleContexts(AdviceDefinitionContext.class);
		}
		public PointcutDefinitionContext pointcutDefinition(int i) {
			return getRuleContext(PointcutDefinitionContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(TEAMSParser.WS); }
		public List<TerminalNode> SPACE() { return getTokens(TEAMSParser.SPACE); }
		public MyAspectContext myAspect() {
			return getRuleContext(MyAspectContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TEAMSParser.WS, i);
		}
		public TerminalNode SPACE(int i) {
			return getToken(TEAMSParser.SPACE, i);
		}
		public AdviceDefinitionContext adviceDefinition(int i) {
			return getRuleContext(AdviceDefinitionContext.class,i);
		}
		public List<PointcutDefinitionContext> pointcutDefinition() {
			return getRuleContexts(PointcutDefinitionContext.class);
		}
		public AspectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aspect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).enterAspect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).exitAspect(this);
		}
	}

	public final AspectContext aspect() throws RecognitionException {
		AspectContext _localctx = new AspectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_aspect);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{

			            ((AspectContext)_localctx).value = new Aspect();
			          
			setState(60); match(14);
			setState(62);
			_la = _input.LA(1);
			if (_la==SPACE || _la==WS) {
				{
				setState(61);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==WS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(64); ((AspectContext)_localctx).e = myAspect();

			            _localctx.value.setName( (((AspectContext)_localctx).e!=null?_input.getText(((AspectContext)_localctx).e.start,((AspectContext)_localctx).e.stop):null));
			            
			setState(67);
			_la = _input.LA(1);
			if (_la==SPACE || _la==WS) {
				{
				setState(66);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==WS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(69); match(10);
			setState(71);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(70);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==WS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(74);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(73);
						_la = _input.LA(1);
						if ( !(_la==SPACE || _la==WS) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					}
					setState(76); ((AspectContext)_localctx).pointcutDefinition = pointcutDefinition();

					                         _localctx.value.addPointcut( ((AspectContext)_localctx).pointcutDefinition.value);
					                         
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 16) | (1L << SPACE) | (1L << Identifier) | (1L << WS))) != 0)) {
				{
				{
				setState(85);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(84);
					_la = _input.LA(1);
					if ( !(_la==SPACE || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
				setState(87); ((AspectContext)_localctx).adviceDefinition = adviceDefinition();

				                         _localctx.value.addAdvice( ((AspectContext)_localctx).adviceDefinition.value);
				                         //System.out.print("An advice is added");
				                        // System.out.println(" with Id: "+_localctx.value.getAdvice().elementAt(0).getName());
				                         
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95); match(13);
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

	public static class MyAspectContext extends ParserRuleContext {
		public String value;
		public Token Identifier;
		public TerminalNode Identifier() { return getToken(TEAMSParser.Identifier, 0); }
		public MyAspectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myAspect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).enterMyAspect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).exitMyAspect(this);
		}
	}

	public final MyAspectContext myAspect() throws RecognitionException {
		MyAspectContext _localctx = new MyAspectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_myAspect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); ((MyAspectContext)_localctx).Identifier = match(Identifier);

			            ((MyAspectContext)_localctx).value =  (((MyAspectContext)_localctx).Identifier!=null?((MyAspectContext)_localctx).Identifier.getText():null);
			            
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

	public static class PointcutDefinitionContext extends ParserRuleContext {
		public PointcutExpression value;
		public Token Identifier;
		public ArgsContext e;
		public ArgsContext args;
		public PointcutExpContext e1;
		public PointcutExpContext pointcutExp;
		public TerminalNode WS() { return getToken(TEAMSParser.WS, 0); }
		public TerminalNode SPACE() { return getToken(TEAMSParser.SPACE, 0); }
		public PointcutExpContext pointcutExp() {
			return getRuleContext(PointcutExpContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(TEAMSParser.Identifier, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public PointcutDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointcutDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).enterPointcutDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).exitPointcutDefinition(this);
		}
	}

	public final PointcutDefinitionContext pointcutDefinition() throws RecognitionException {
		PointcutDefinitionContext _localctx = new PointcutDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pointcutDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			    ((PointcutDefinitionContext)_localctx).value =  new PointcutExpression();
			    
			setState(102);
			_la = _input.LA(1);
			if (_la==SPACE || _la==WS) {
				{
				setState(101);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==WS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(104); match(29);
			{
			setState(105); ((PointcutDefinitionContext)_localctx).Identifier = match(Identifier);
			}
			setState(106); match(6);
			setState(107); ((PointcutDefinitionContext)_localctx).e = ((PointcutDefinitionContext)_localctx).args = args();
			setState(108); match(22);
			setState(109); match(7);
			setState(110); ((PointcutDefinitionContext)_localctx).e1 = ((PointcutDefinitionContext)_localctx).pointcutExp = pointcutExp(0);

				_localctx.value.setPC(((PointcutDefinitionContext)_localctx).pointcutExp.value);
			        _localctx.value.setName( (((PointcutDefinitionContext)_localctx).Identifier!=null?((PointcutDefinitionContext)_localctx).Identifier.getText():null));
				_localctx.value.setArgs(((PointcutDefinitionContext)_localctx).args.value);
				
			setState(112); match(25);
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

	public static class AdviceDefinitionContext extends ParserRuleContext {
		public AdviceExpression value;
		public Token Identifier;
		public AdviceExpContext e1;
		public AdviceExpContext adviceExp;
		public PointcutExpReferencesContext pointcutExpReferences;
		public PointcutExpReferencesContext pointcutExpReferences() {
			return getRuleContext(PointcutExpReferencesContext.class,0);
		}
		public AdviceExpContext adviceExp() {
			return getRuleContext(AdviceExpContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TEAMSParser.WS); }
		public List<TerminalNode> SPACE() { return getTokens(TEAMSParser.SPACE); }
		public TerminalNode Identifier() { return getToken(TEAMSParser.Identifier, 0); }
		public TerminalNode WS(int i) {
			return getToken(TEAMSParser.WS, i);
		}
		public TerminalNode SPACE(int i) {
			return getToken(TEAMSParser.SPACE, i);
		}
		public AdviceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adviceDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).enterAdviceDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).exitAdviceDefinition(this);
		}
	}

	public final AdviceDefinitionContext adviceDefinition() throws RecognitionException {
		AdviceDefinitionContext _localctx = new AdviceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_adviceDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			    ((AdviceDefinitionContext)_localctx).value =  new AdviceExpression();
			    
			setState(116);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(115);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==WS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			setState(119);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(118); ((AdviceDefinitionContext)_localctx).Identifier = match(Identifier);
				}
			}

			setState(122);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(121);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==WS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			setState(124); ((AdviceDefinitionContext)_localctx).e1 = ((AdviceDefinitionContext)_localctx).adviceExp = adviceExp(0);
			setState(125); match(7);
			setState(126); ((AdviceDefinitionContext)_localctx).pointcutExpReferences = pointcutExpReferences();

			         _localctx.value.setAdvice(((AdviceDefinitionContext)_localctx).adviceExp.value);
			         _localctx.value.setPointcutList( ((AdviceDefinitionContext)_localctx).pointcutExpReferences.value);
			         _localctx.value.setName((((AdviceDefinitionContext)_localctx).Identifier!=null?((AdviceDefinitionContext)_localctx).Identifier.getText():null));
			        
			setState(128); match(25);
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

	public static class PointcutExpReferencesContext extends ParserRuleContext {
		public Vector<Argument> value;
		public ArgsContext e1;
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public PointcutExpReferencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointcutExpReferences; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).enterPointcutExpReferences(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).exitPointcutExpReferences(this);
		}
	}

	public final PointcutExpReferencesContext pointcutExpReferences() throws RecognitionException {
		PointcutExpReferencesContext _localctx = new PointcutExpReferencesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pointcutExpReferences);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); ((PointcutExpReferencesContext)_localctx).e1 = args();
			((PointcutExpReferencesContext)_localctx).value =  ((PointcutExpReferencesContext)_localctx).e1.value;
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

	public static class AdviceExpContext extends ParserRuleContext {
		public AdviceExecutionModel value;
		public AdviceExpContext e2;
		public AdviceExecutionModelContext e1;
		public AdviceExecutionModelContext adviceExecutionModel;
		public AdviceExpContext e3;
		public List<AdviceExpContext> adviceExp() {
			return getRuleContexts(AdviceExpContext.class);
		}
		public List<TerminalNode> WS() { return getTokens(TEAMSParser.WS); }
		public AdviceExpContext adviceExp(int i) {
			return getRuleContext(AdviceExpContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(TEAMSParser.SPACE); }
		public TerminalNode WS(int i) {
			return getToken(TEAMSParser.WS, i);
		}
		public TerminalNode SPACE(int i) {
			return getToken(TEAMSParser.SPACE, i);
		}
		public AdviceExecutionModelContext adviceExecutionModel() {
			return getRuleContext(AdviceExecutionModelContext.class,0);
		}
		public AdviceExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adviceExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).enterAdviceExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).exitAdviceExp(this);
		}
	}

	public final AdviceExpContext adviceExp() throws RecognitionException {
		return adviceExp(0);
	}

	private AdviceExpContext adviceExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdviceExpContext _localctx = new AdviceExpContext(_ctx, _parentState);
		AdviceExpContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_adviceExp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(135);
			_la = _input.LA(1);
			if (_la==SPACE || _la==WS) {
				{
				setState(134);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==WS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(137); ((AdviceExpContext)_localctx).e1 = ((AdviceExpContext)_localctx).adviceExecutionModel = adviceExecutionModel();
			setState(139);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(138);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==WS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}

			            //((AdviceExpContext)_localctx).value =  new AdviceExecutionModel();
			            ((AdviceExpContext)_localctx).value =  ((AdviceExpContext)_localctx).adviceExecutionModel.value;
			            
			}
			_ctx.stop = _input.LT(-1);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdviceExpContext(_parentctx, _parentState);
					_localctx.e2 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_adviceExp);
					setState(143);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(145);
					_la = _input.LA(1);
					if (_la==SPACE || _la==WS) {
						{
						setState(144);
						_la = _input.LA(1);
						if ( !(_la==SPACE || _la==WS) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
					}

					setState(147); match(3);
					setState(149);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(148);
						_la = _input.LA(1);
						if ( !(_la==SPACE || _la==WS) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					}
					setState(151); ((AdviceExpContext)_localctx).e3 = adviceExp(0);
					setState(153);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(152);
						_la = _input.LA(1);
						if ( !(_la==SPACE || _la==WS) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					}

					                      ((AdviceExpContext)_localctx).value =  new CommaExpression();
					                      ((CommaExpression) _localctx.value).setOperand(((AdviceExpContext)_localctx).e2.value, ((AdviceExpContext)_localctx).e3.value);
					                      
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class AdviceExecutionModelContext extends ParserRuleContext {
		public AdviceExecutionModel value;
		public BeforeContext e1;
		public BeforeContext before;
		public AfterContext e2;
		public AfterContext after;
		public AfterContext after() {
			return getRuleContext(AfterContext.class,0);
		}
		public BeforeContext before() {
			return getRuleContext(BeforeContext.class,0);
		}
		public AdviceExecutionModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adviceExecutionModel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).enterAdviceExecutionModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).exitAdviceExecutionModel(this);
		}
	}

	public final AdviceExecutionModelContext adviceExecutionModel() throws RecognitionException {
		AdviceExecutionModelContext _localctx = new AdviceExecutionModelContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_adviceExecutionModel);
		try {
			setState(169);
			switch (_input.LA(1)) {
			case 9:
				enterOuterAlt(_localctx, 1);
				{

				       // ((AdviceExecutionModelContext)_localctx).value =  new AdviceExecutionModel();
				        
				setState(163); ((AdviceExecutionModelContext)_localctx).e1 = ((AdviceExecutionModelContext)_localctx).before = before();

				            ((AdviceExecutionModelContext)_localctx).value =  ((AdviceExecutionModelContext)_localctx).before.value;
				            
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 2);
				{
				setState(166); ((AdviceExecutionModelContext)_localctx).e2 = ((AdviceExecutionModelContext)_localctx).after = after();

				            ((AdviceExecutionModelContext)_localctx).value =  ((AdviceExecutionModelContext)_localctx).after.value;
				            
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

	public static class BeforeContext extends ParserRuleContext {
		public BeforeAdviceExecutionModel value;
		public TerminalNode WS() { return getToken(TEAMSParser.WS, 0); }
		public TerminalNode SPACE() { return getToken(TEAMSParser.SPACE, 0); }
		public BeforeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_before; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).enterBefore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).exitBefore(this);
		}
	}

	public final BeforeContext before() throws RecognitionException {
		BeforeContext _localctx = new BeforeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_before);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.err.println("JECG: creating before AEM");
			     ((BeforeContext)_localctx).value =  new BeforeAdviceExecutionModel(); _localctx.value.setName("before");
			setState(172); match(9);
			setState(173); match(6);
			setState(175);
			_la = _input.LA(1);
			if (_la==SPACE || _la==WS) {
				{
				setState(174);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==WS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(177); match(22);
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

	public static class AfterContext extends ParserRuleContext {
		public AfterAdviceExecutionModel value;
		public TerminalNode WS() { return getToken(TEAMSParser.WS, 0); }
		public TerminalNode SPACE() { return getToken(TEAMSParser.SPACE, 0); }
		public AfterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_after; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).enterAfter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).exitAfter(this);
		}
	}

	public final AfterContext after() throws RecognitionException {
		AfterContext _localctx = new AfterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_after);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.err.println("JECG: creating after AEM");
			     ((AfterContext)_localctx).value =  new AfterAdviceExecutionModel(); _localctx.value.setName("after");
			setState(180); match(16);
			setState(181); match(6);
			setState(183);
			_la = _input.LA(1);
			if (_la==SPACE || _la==WS) {
				{
				setState(182);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==WS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(185); match(22);
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

	public static class PointcutExpContext extends ParserRuleContext {
		public PointCutExpressionInterface value;
		public PointcutExpContext e4;
		public NotPointcutExpContext e1;
		public NotPointcutExpContext notPointcutExp;
		public DesignatorContext e3;
		public DesignatorContext designator;
		public PointcutExpContext e5;
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TEAMSParser.WS); }
		public List<TerminalNode> SPACE() { return getTokens(TEAMSParser.SPACE); }
		public NotPointcutExpContext notPointcutExp() {
			return getRuleContext(NotPointcutExpContext.class,0);
		}
		public List<PointcutExpContext> pointcutExp() {
			return getRuleContexts(PointcutExpContext.class);
		}
		public TerminalNode WS(int i) {
			return getToken(TEAMSParser.WS, i);
		}
		public PointcutExpContext pointcutExp(int i) {
			return getRuleContext(PointcutExpContext.class,i);
		}
		public TerminalNode SPACE(int i) {
			return getToken(TEAMSParser.SPACE, i);
		}
		public PointcutExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointcutExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).enterPointcutExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).exitPointcutExp(this);
		}
	}

	public final PointcutExpContext pointcutExp() throws RecognitionException {
		return pointcutExp(0);
	}

	private PointcutExpContext pointcutExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PointcutExpContext _localctx = new PointcutExpContext(_ctx, _parentState);
		PointcutExpContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_pointcutExp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			switch (_input.LA(1)) {
			case 32:
				{
				setState(188); ((PointcutExpContext)_localctx).e1 = ((PointcutExpContext)_localctx).notPointcutExp = notPointcutExp();

				            ((PointcutExpContext)_localctx).value =  new NotExpression(); 
				            ((PointcutExpContext)_localctx).value =  ((PointcutExpContext)_localctx).notPointcutExp.value;
				            
				}
				break;
			case 5:
			case 17:
			case 20:
			case 23:
			case 26:
			case 28:
			case 30:
			case 31:
			case SPACE:
			case WS:
				{
				setState(192);
				_la = _input.LA(1);
				if (_la==SPACE || _la==WS) {
					{
					setState(191);
					_la = _input.LA(1);
					if ( !(_la==SPACE || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(194); ((PointcutExpContext)_localctx).e3 = ((PointcutExpContext)_localctx).designator = designator();
				setState(196);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(195);
					_la = _input.LA(1);
					if ( !(_la==SPACE || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}

				            ((PointcutExpContext)_localctx).value =  new Designator();
				            ((PointcutExpContext)_localctx).value =  ((PointcutExpContext)_localctx).designator.value;
				            
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PointcutExpContext(_parentctx, _parentState);
					_localctx.e4 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_pointcutExp);
					setState(202);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(203); match(27);
					setState(204); ((PointcutExpContext)_localctx).e5 = pointcutExp(2);

					                      ((PointcutExpContext)_localctx).value =  new AndExpression();
					                      ((AndExpression) _localctx.value).setOperand(((PointcutExpContext)_localctx).e4.value, ((PointcutExpContext)_localctx).e5.value);
					                      
					}
					} 
				}
				setState(211);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NotPointcutExpContext extends ParserRuleContext {
		public NotExpression value;
		public PointcutExpContext e;
		public PointcutExpContext pointcutExp() {
			return getRuleContext(PointcutExpContext.class,0);
		}
		public NotPointcutExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notPointcutExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).enterNotPointcutExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).exitNotPointcutExp(this);
		}
	}

	public final NotPointcutExpContext notPointcutExp() throws RecognitionException {
		NotPointcutExpContext _localctx = new NotPointcutExpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_notPointcutExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212); match(32);
			setState(213); ((NotPointcutExpContext)_localctx).e = pointcutExp(0);
			((NotPointcutExpContext)_localctx).value =  new NotExpression(); 
				_localctx.value.setOperand(((NotPointcutExpContext)_localctx).e.value);
				
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

	public static class AtomExpContext extends ParserRuleContext {
		public PointCutExpressionInterface value;
		public DesignatorContext e1;
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public AtomExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).enterAtomExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).exitAtomExp(this);
		}
	}

	public final AtomExpContext atomExp() throws RecognitionException {
		AtomExpContext _localctx = new AtomExpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_atomExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); ((AtomExpContext)_localctx).e1 = designator();

			            ((AtomExpContext)_localctx).value = ((AtomExpContext)_localctx).e1.value; /*new PointCutExpression(); _localctx.value.setPC(e1);*/
			            
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

	public static class DesignatorContext extends ParserRuleContext {
		public Designator  value;
		public CallContext e;
		public ExecutionContext e1;
		public BasicblockContext e2;
		public WithinContext e3;
		public WithincodeContext e4;
		public FieldAccessContext e5;
		public YourDesignatorContext e6;
		public LoopContext e7;
		public Token Identifier;
		public List<TerminalNode> WS() { return getTokens(TEAMSParser.WS); }
		public List<TerminalNode> SPACE() { return getTokens(TEAMSParser.SPACE); }
		public List<TerminalNode> Identifier() { return getTokens(TEAMSParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(TEAMSParser.Identifier, i);
		}
		public TerminalNode WS(int i) {
			return getToken(TEAMSParser.WS, i);
		}
		public ExecutionContext execution() {
			return getRuleContext(ExecutionContext.class,0);
		}
		public BasicblockContext basicblock() {
			return getRuleContext(BasicblockContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public WithinContext within() {
			return getRuleContext(WithinContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public YourDesignatorContext yourDesignator() {
			return getRuleContext(YourDesignatorContext.class,0);
		}
		public WithincodeContext withincode() {
			return getRuleContext(WithincodeContext.class,0);
		}
		public TerminalNode SPACE(int i) {
			return getToken(TEAMSParser.SPACE, i);
		}
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).enterDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).exitDesignator(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_designator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        ((DesignatorContext)_localctx).value =  new Designator();
			      
			setState(244);
			switch (_input.LA(1)) {
			case 28:
				{
				setState(220); ((DesignatorContext)_localctx).e = call();

				            ((DesignatorContext)_localctx).value =  ((DesignatorContext)_localctx).e.value;
				            
				}
				break;
			case 30:
				{
				setState(223); ((DesignatorContext)_localctx).e1 = execution();

				            ((DesignatorContext)_localctx).value =  ((DesignatorContext)_localctx).e1.value;
				            
				}
				break;
			case 31:
				{
				setState(226); ((DesignatorContext)_localctx).e2 = basicblock();

				            ((DesignatorContext)_localctx).value =  ((DesignatorContext)_localctx).e2.value;
				            
				}
				break;
			case 26:
				{
				setState(229); ((DesignatorContext)_localctx).e3 = within();

				            ((DesignatorContext)_localctx).value =  ((DesignatorContext)_localctx).e3.value;
				            
				}
				break;
			case 5:
				{
				setState(232); ((DesignatorContext)_localctx).e4 = withincode();

				            ((DesignatorContext)_localctx).value =  ((DesignatorContext)_localctx).e4.value;
				            
				}
				break;
			case 17:
				{
				setState(235); ((DesignatorContext)_localctx).e5 = fieldAccess();

				            ((DesignatorContext)_localctx).value =  ((DesignatorContext)_localctx).e5.value;
				            
				}
				break;
			case 23:
				{
				setState(238); ((DesignatorContext)_localctx).e6 = yourDesignator();

				            ((DesignatorContext)_localctx).value =  ((DesignatorContext)_localctx).e6.value;
				            
				}
				break;
			case 20:
				{
				setState(241); ((DesignatorContext)_localctx).e7 = loop();

				            ((DesignatorContext)_localctx).value =  ((DesignatorContext)_localctx).e7.value;
				            
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(282);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(247);
				_la = _input.LA(1);
				if (_la==SPACE || _la==WS) {
					{
					setState(246);
					_la = _input.LA(1);
					if ( !(_la==SPACE || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(249); match(10);
				setState(251);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(250);
					_la = _input.LA(1);
					if ( !(_la==SPACE || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 24) | (1L << SPACE) | (1L << WS))) != 0)) {
					{
					{
					 JoinPointInfoExp info = new JoinPointInfoExp(); 
					setState(255);
					_la = _input.LA(1);
					if (_la==SPACE || _la==WS) {
						{
						setState(254);
						_la = _input.LA(1);
						if ( !(_la==SPACE || _la==WS) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
					}

					setState(257); match(24);
					setState(259);
					_la = _input.LA(1);
					if (_la==SPACE || _la==WS) {
						{
						setState(258);
						_la = _input.LA(1);
						if ( !(_la==SPACE || _la==WS) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
					}

					setState(261); ((DesignatorContext)_localctx).Identifier = match(Identifier);
					/*if ($Identifier.text !=$value.getName())
					                                   System.out.println("WARNING! the domain of the info "+ $Identifier.text+" !");*/
					                             info.setType( (((DesignatorContext)_localctx).Identifier!=null?((DesignatorContext)_localctx).Identifier.getText():null));
					                            
					setState(263); match(21);
					setState(264); ((DesignatorContext)_localctx).Identifier = match(Identifier);
					setState(266);
					_la = _input.LA(1);
					if (_la==SPACE || _la==WS) {
						{
						setState(265);
						_la = _input.LA(1);
						if ( !(_la==SPACE || _la==WS) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
					}

					setState(268); match(25);
					setState(270);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(269);
						_la = _input.LA(1);
						if ( !(_la==SPACE || _la==WS) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					}

					                         info.setName((((DesignatorContext)_localctx).Identifier!=null?((DesignatorContext)_localctx).Identifier.getText():null));
					                         _localctx.value.getJoinPointInfoExp().add( info);
					                         
					}
					}
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(278); match(13);
				setState(280);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(279);
					_la = _input.LA(1);
					if ( !(_la==SPACE || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
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

	public static class ArgsContext extends ParserRuleContext {
		public Vector<Argument> value;
		public ArgContext e;
		public ArgContext e1;
		public List<TerminalNode> WS() { return getTokens(TEAMSParser.WS); }
		public List<TerminalNode> SPACE() { return getTokens(TEAMSParser.SPACE); }
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public TerminalNode WS(int i) {
			return getToken(TEAMSParser.WS, i);
		}
		public TerminalNode SPACE(int i) {
			return getToken(TEAMSParser.SPACE, i);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        ((ArgsContext)_localctx).value =  new Vector<Argument>();
			        
			setState(286);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(285);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==WS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			setState(288); ((ArgsContext)_localctx).e = arg();
			setState(290);
			_la = _input.LA(1);
			if (_la==SPACE || _la==WS) {
				{
				setState(289);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==WS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}


			            _localctx.value.add(((ArgsContext)_localctx).e.value);
			            
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(293); match(3);
				setState(294); ((ArgsContext)_localctx).e1 = arg();
				_localctx.value.add(((ArgsContext)_localctx).e1.value);
				}
				}
				setState(301);
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

	public static class ArgContext extends ParserRuleContext {
		public Argument value;
		public SimpleArgumentContext e1;
		public MethodOrConstructorPatternContext e2;
		public PathContext e3;
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public MethodOrConstructorPatternContext methodOrConstructorPattern() {
			return getRuleContext(MethodOrConstructorPatternContext.class,0);
		}
		public SimpleArgumentContext simpleArgument() {
			return getRuleContext(SimpleArgumentContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arg);
		try {
			setState(311);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302); ((ArgContext)_localctx).e1 = simpleArgument();
				((ArgContext)_localctx).value =  ((ArgContext)_localctx).e1.value;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305); ((ArgContext)_localctx).e2 = methodOrConstructorPattern();
				((ArgContext)_localctx).value =  ((ArgContext)_localctx).e2.value;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(308); ((ArgContext)_localctx).e3 = path();
				((ArgContext)_localctx).value =  ((ArgContext)_localctx).e3.value;
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

	public static class SimpleArgumentContext extends ParserRuleContext {
		public SimpleArgument value;
		public Token Identifier;
		public TerminalNode Identifier() { return getToken(TEAMSParser.Identifier, 0); }
		public SimpleArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).enterSimpleArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).exitSimpleArgument(this);
		}
	}

	public final SimpleArgumentContext simpleArgument() throws RecognitionException {
		SimpleArgumentContext _localctx = new SimpleArgumentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_simpleArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((SimpleArgumentContext)_localctx).value =  new SimpleArgument();
			setState(314); ((SimpleArgumentContext)_localctx).Identifier = match(Identifier);
			_localctx.value.setExpression((((SimpleArgumentContext)_localctx).Identifier!=null?((SimpleArgumentContext)_localctx).Identifier.getText():null));
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

	public static class CallContext extends ParserRuleContext {
		public Designator value;
		public MethodOrConstructorPatternContext e;
		public MethodOrConstructorPatternContext methodOrConstructorPattern() {
			return getRuleContext(MethodOrConstructorPatternContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((CallContext)_localctx).value =  new Designator(); _localctx.value.setName("call");
			setState(318); match(28);
			setState(319); match(6);
			setState(320); ((CallContext)_localctx).e = methodOrConstructorPattern();
			_localctx.value.setArgument(((CallContext)_localctx).e.value);
			setState(322); match(22);
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

	public static class MethodOrConstructorPatternContext extends ParserRuleContext {
		public MethodExpression value;
		public PrimitiveTypeContext e;
		public Token e1;
		public ArgsContext e2;
		public TerminalNode SPACE() { return getToken(TEAMSParser.SPACE, 0); }
		public TerminalNode Identifier() { return getToken(TEAMSParser.Identifier, 0); }
		public TerminalNode RegExp() { return getToken(TEAMSParser.RegExp, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public MethodOrConstructorPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodOrConstructorPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).enterMethodOrConstructorPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).exitMethodOrConstructorPattern(this);
		}
	}

	public final MethodOrConstructorPatternContext methodOrConstructorPattern() throws RecognitionException {
		MethodOrConstructorPatternContext _localctx = new MethodOrConstructorPatternContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_methodOrConstructorPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MethodOrConstructorPatternContext)_localctx).value =  new MethodExpression();
			setState(325); ((MethodOrConstructorPatternContext)_localctx).e = primitiveType();
			setState(326); match(SPACE);
			setState(327);
			((MethodOrConstructorPatternContext)_localctx).e1 = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Identifier || _la==RegExp) ) {
				((MethodOrConstructorPatternContext)_localctx).e1 = (Token)_errHandler.recoverInline(this);
			}
			consume();
			_localctx.value.setReturnType((((MethodOrConstructorPatternContext)_localctx).e!=null?_input.getText(((MethodOrConstructorPatternContext)_localctx).e.start,((MethodOrConstructorPatternContext)_localctx).e.stop):null)); _localctx.value.setExpression((((MethodOrConstructorPatternContext)_localctx).e1!=null?((MethodOrConstructorPatternContext)_localctx).e1.getText():null));
			setState(329); match(6);
			setState(330); ((MethodOrConstructorPatternContext)_localctx).e2 = args();
			_localctx.value.setArgs(((MethodOrConstructorPatternContext)_localctx).e2.value);
			setState(332); match(22);
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

	public static class ExecutionContext extends ParserRuleContext {
		public Designator value;
		public MethodOrConstructorPatternContext e;
		public MethodOrConstructorPatternContext methodOrConstructorPattern() {
			return getRuleContext(MethodOrConstructorPatternContext.class,0);
		}
		public ExecutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).enterExecution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).exitExecution(this);
		}
	}

	public final ExecutionContext execution() throws RecognitionException {
		ExecutionContext _localctx = new ExecutionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_execution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExecutionContext)_localctx).value =  new Designator(); _localctx.value.setName("execution");
			setState(335); match(30);
			setState(336); match(6);
			setState(337); ((ExecutionContext)_localctx).e = methodOrConstructorPattern();
			_localctx.value.setArgument(((ExecutionContext)_localctx).e.value);
			setState(339); match(22);
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

	public static class BasicblockContext extends ParserRuleContext {
		public Designator value;
		public MethodOrConstructorPatternContext e;
		public MethodOrConstructorPatternContext methodOrConstructorPattern() {
			return getRuleContext(MethodOrConstructorPatternContext.class,0);
		}
		public BasicblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).enterBasicblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).exitBasicblock(this);
		}
	}

	public final BasicblockContext basicblock() throws RecognitionException {
		BasicblockContext _localctx = new BasicblockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_basicblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((BasicblockContext)_localctx).value =  new Designator(); _localctx.value.setName( "basicblock");
			setState(342); match(31);
			setState(343); match(6);
			setState(344); ((BasicblockContext)_localctx).e = methodOrConstructorPattern();
			_localctx.value.setArgument(((BasicblockContext)_localctx).e.value);
			setState(346); match(22);
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

	public static class FieldAccessContext extends ParserRuleContext {
		public Designator value;
		public MethodOrConstructorPatternContext e;
		public MethodOrConstructorPatternContext methodOrConstructorPattern() {
			return getRuleContext(MethodOrConstructorPatternContext.class,0);
		}
		public FieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).exitFieldAccess(this);
		}
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fieldAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FieldAccessContext)_localctx).value =  new Designator(); _localctx.value.setName("fieldAccess");
			setState(349); match(17);
			setState(350); match(6);
			setState(354);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 4) | (1L << 8) | (1L << 11) | (1L << 12) | (1L << 15) | (1L << 18) | (1L << 19))) != 0)) {
				{
				setState(351); ((FieldAccessContext)_localctx).e = methodOrConstructorPattern();
				_localctx.value.setArgument(((FieldAccessContext)_localctx).e.value);
				}
			}

			setState(356); match(22);
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

	public static class LoopContext extends ParserRuleContext {
		public Designator value;
		public MethodOrConstructorPatternContext e;
		public MethodOrConstructorPatternContext methodOrConstructorPattern() {
			return getRuleContext(MethodOrConstructorPatternContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((LoopContext)_localctx).value =  new Designator(); _localctx.value.setName("loop");
			setState(359); match(20);
			setState(360); match(6);
			setState(361); ((LoopContext)_localctx).e = methodOrConstructorPattern();
			_localctx.value.setArgument(((LoopContext)_localctx).e.value);
			setState(363); match(22);
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

	public static class YourDesignatorContext extends ParserRuleContext {
		public Designator value;
		public MethodOrConstructorPatternContext e;
		public MethodOrConstructorPatternContext methodOrConstructorPattern() {
			return getRuleContext(MethodOrConstructorPatternContext.class,0);
		}
		public YourDesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yourDesignator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).enterYourDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).exitYourDesignator(this);
		}
	}

	public final YourDesignatorContext yourDesignator() throws RecognitionException {
		YourDesignatorContext _localctx = new YourDesignatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_yourDesignator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((YourDesignatorContext)_localctx).value =  new Designator(); _localctx.value.setName("yourDesignator");
			setState(366); match(23);
			setState(367); match(6);
			setState(368); ((YourDesignatorContext)_localctx).e = methodOrConstructorPattern();
			_localctx.value.setArgument(((YourDesignatorContext)_localctx).e.value);
			setState(370); match(22);
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

	public static class WithinContext extends ParserRuleContext {
		public Designator value;
		public PathContext e;
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public WithinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_within; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).enterWithin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).exitWithin(this);
		}
	}

	public final WithinContext within() throws RecognitionException {
		WithinContext _localctx = new WithinContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_within);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((WithinContext)_localctx).value =  new Designator(); _localctx.value.setName("within");
			setState(373); match(26);
			setState(374); match(6);
			setState(375); ((WithinContext)_localctx).e = path();
			setState(376); match(22);
			_localctx.value.setArgument(((WithinContext)_localctx).e.value);
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

	public static class WithincodeContext extends ParserRuleContext {
		public Designator value;
		public MethodOrConstructorPatternContext e;
		public MethodOrConstructorPatternContext methodOrConstructorPattern() {
			return getRuleContext(MethodOrConstructorPatternContext.class,0);
		}
		public WithincodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withincode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).enterWithincode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).exitWithincode(this);
		}
	}

	public final WithincodeContext withincode() throws RecognitionException {
		WithincodeContext _localctx = new WithincodeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_withincode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((WithincodeContext)_localctx).value =  new Designator(); _localctx.value.setName("withincode");
			setState(380); match(5);
			setState(381); match(6);
			setState(382); ((WithincodeContext)_localctx).e = methodOrConstructorPattern();
			_localctx.value.setArgument(((WithincodeContext)_localctx).e.value);
			setState(384); match(22);
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

	public static class PathContext extends ParserRuleContext {
		public PathExpression value;
		public Token e;
		public TerminalNode Identifier(int i) {
			return getToken(TEAMSParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(TEAMSParser.Identifier); }
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).exitPath(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((PathContext)_localctx).value =  new PathExpression(); 
			setState(403);
			_la = _input.LA(1);
			if (_la==4 || _la==Identifier) {
				{
				setState(389);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(387); ((PathContext)_localctx).e = match(Identifier);
					}
					break;
				case 4:
					{
					setState(388); ((PathContext)_localctx).e = match(4);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				_localctx.value.setExpression((((PathContext)_localctx).e!=null?((PathContext)_localctx).e.getText():null));
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==21) {
					{
					{
					setState(392); match(21);
					setState(395);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(393); ((PathContext)_localctx).e = match(Identifier);
						}
						break;
					case 4:
						{
						setState(394); ((PathContext)_localctx).e = match(4);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					_localctx.value.setExpression(_localctx.value.getExpression() +"/"+(((PathContext)_localctx).e!=null?((PathContext)_localctx).e.getText():null));
					}
					}
					setState(402);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEAMSListener ) ((TEAMSListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 4) | (1L << 8) | (1L << 11) | (1L << 12) | (1L << 15) | (1L << 18) | (1L << 19))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		case 6: return adviceExp_sempred((AdviceExpContext)_localctx, predIndex);

		case 10: return pointcutExp_sempred((PointcutExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean adviceExp_sempred(AdviceExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean pointcutExp_sempred(PointcutExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\'\u019a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\3\3\3\3\3\5\3A"+
		"\n\3\3\3\3\3\3\3\5\3F\n\3\3\3\3\3\5\3J\n\3\3\3\5\3M\n\3\3\3\3\3\3\3\7"+
		"\3R\n\3\f\3\16\3U\13\3\3\3\5\3X\n\3\3\3\3\3\3\3\7\3]\n\3\f\3\16\3`\13"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\5\5i\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\5\6w\n\6\3\6\5\6z\n\6\3\6\5\6}\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\b\3\b\5\b\u008a\n\b\3\b\3\b\5\b\u008e\n\b\3\b\3"+
		"\b\3\b\3\b\5\b\u0094\n\b\3\b\3\b\5\b\u0098\n\b\3\b\3\b\5\b\u009c\n\b\3"+
		"\b\3\b\7\b\u00a0\n\b\f\b\16\b\u00a3\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u00ac\n\t\3\n\3\n\3\n\3\n\5\n\u00b2\n\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\5\13\u00ba\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u00c3\n\f\3\f\3\f\5"+
		"\f\u00c7\n\f\3\f\3\f\5\f\u00cb\n\f\3\f\3\f\3\f\3\f\3\f\7\f\u00d2\n\f\f"+
		"\f\16\f\u00d5\13\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f7\n\17\3\17\5\17\u00fa\n"+
		"\17\3\17\3\17\5\17\u00fe\n\17\3\17\3\17\5\17\u0102\n\17\3\17\3\17\5\17"+
		"\u0106\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u010d\n\17\3\17\3\17\5\17\u0111"+
		"\n\17\3\17\7\17\u0114\n\17\f\17\16\17\u0117\13\17\3\17\3\17\5\17\u011b"+
		"\n\17\5\17\u011d\n\17\3\20\3\20\5\20\u0121\n\20\3\20\3\20\5\20\u0125\n"+
		"\20\3\20\3\20\3\20\3\20\3\20\7\20\u012c\n\20\f\20\16\20\u012f\13\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u013a\n\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0165\n\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\5\34\u0188\n\34\3\34\3\34\3\34\3\34\5\34\u018e"+
		"\n\34\3\34\7\34\u0191\n\34\f\34\16\34\u0194\13\34\5\34\u0196\n\34\3\35"+
		"\3\35\3\35\2\4\16\26\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668\2\5\4\2##\'\'\3\2%&\b\2\3\4\6\6\n\n\r\16\21\21\24\25\u01af"+
		"\2:\3\2\2\2\4=\3\2\2\2\6c\3\2\2\2\bf\3\2\2\2\nt\3\2\2\2\f\u0084\3\2\2"+
		"\2\16\u0087\3\2\2\2\20\u00ab\3\2\2\2\22\u00ad\3\2\2\2\24\u00b5\3\2\2\2"+
		"\26\u00ca\3\2\2\2\30\u00d6\3\2\2\2\32\u00da\3\2\2\2\34\u00dd\3\2\2\2\36"+
		"\u011e\3\2\2\2 \u0139\3\2\2\2\"\u013b\3\2\2\2$\u013f\3\2\2\2&\u0146\3"+
		"\2\2\2(\u0150\3\2\2\2*\u0157\3\2\2\2,\u015e\3\2\2\2.\u0168\3\2\2\2\60"+
		"\u016f\3\2\2\2\62\u0176\3\2\2\2\64\u017d\3\2\2\2\66\u0184\3\2\2\28\u0197"+
		"\3\2\2\2:;\5\4\3\2;<\b\2\1\2<\3\3\2\2\2=>\b\3\1\2>@\7\20\2\2?A\t\2\2\2"+
		"@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\5\6\4\2CE\b\3\1\2DF\t\2\2\2ED\3\2\2\2"+
		"EF\3\2\2\2FG\3\2\2\2GI\7\f\2\2HJ\t\2\2\2IH\3\2\2\2IJ\3\2\2\2JS\3\2\2\2"+
		"KM\t\2\2\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\5\b\5\2OP\b\3\1\2PR\3\2\2\2"+
		"QL\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T^\3\2\2\2US\3\2\2\2VX\t\2\2\2"+
		"WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\5\n\6\2Z[\b\3\1\2[]\3\2\2\2\\W\3\2\2"+
		"\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab\7\17\2\2b\5\3"+
		"\2\2\2cd\7%\2\2de\b\4\1\2e\7\3\2\2\2fh\b\5\1\2gi\t\2\2\2hg\3\2\2\2hi\3"+
		"\2\2\2ij\3\2\2\2jk\7\37\2\2kl\7%\2\2lm\7\b\2\2mn\5\36\20\2no\7\30\2\2"+
		"op\7\t\2\2pq\5\26\f\2qr\b\5\1\2rs\7\33\2\2s\t\3\2\2\2tv\b\6\1\2uw\t\2"+
		"\2\2vu\3\2\2\2vw\3\2\2\2wy\3\2\2\2xz\7%\2\2yx\3\2\2\2yz\3\2\2\2z|\3\2"+
		"\2\2{}\t\2\2\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\5\16\b\2\177\u0080\7"+
		"\t\2\2\u0080\u0081\5\f\7\2\u0081\u0082\b\6\1\2\u0082\u0083\7\33\2\2\u0083"+
		"\13\3\2\2\2\u0084\u0085\5\36\20\2\u0085\u0086\b\7\1\2\u0086\r\3\2\2\2"+
		"\u0087\u0089\b\b\1\2\u0088\u008a\t\2\2\2\u0089\u0088\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\5\20\t\2\u008c\u008e\t\2\2\2"+
		"\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090"+
		"\b\b\1\2\u0090\u00a1\3\2\2\2\u0091\u0093\f\3\2\2\u0092\u0094\t\2\2\2\u0093"+
		"\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\7\5"+
		"\2\2\u0096\u0098\t\2\2\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009b\5\16\b\2\u009a\u009c\t\2\2\2\u009b\u009a\3"+
		"\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\b\1\2\u009e"+
		"\u00a0\3\2\2\2\u009f\u0091\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\17\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5"+
		"\b\t\1\2\u00a5\u00a6\5\22\n\2\u00a6\u00a7\b\t\1\2\u00a7\u00ac\3\2\2\2"+
		"\u00a8\u00a9\5\24\13\2\u00a9\u00aa\b\t\1\2\u00aa\u00ac\3\2\2\2\u00ab\u00a4"+
		"\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ac\21\3\2\2\2\u00ad\u00ae\b\n\1\2\u00ae"+
		"\u00af\7\13\2\2\u00af\u00b1\7\b\2\2\u00b0\u00b2\t\2\2\2\u00b1\u00b0\3"+
		"\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7\30\2\2\u00b4"+
		"\23\3\2\2\2\u00b5\u00b6\b\13\1\2\u00b6\u00b7\7\22\2\2\u00b7\u00b9\7\b"+
		"\2\2\u00b8\u00ba\t\2\2\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bc\7\30\2\2\u00bc\25\3\2\2\2\u00bd\u00be\b\f\1"+
		"\2\u00be\u00bf\5\30\r\2\u00bf\u00c0\b\f\1\2\u00c0\u00cb\3\2\2\2\u00c1"+
		"\u00c3\t\2\2\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00c6\5\34\17\2\u00c5\u00c7\t\2\2\2\u00c6\u00c5\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\b\f\1\2\u00c9\u00cb\3\2"+
		"\2\2\u00ca\u00bd\3\2\2\2\u00ca\u00c2\3\2\2\2\u00cb\u00d3\3\2\2\2\u00cc"+
		"\u00cd\f\3\2\2\u00cd\u00ce\7\35\2\2\u00ce\u00cf\5\26\f\4\u00cf\u00d0\b"+
		"\f\1\2\u00d0\u00d2\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\27\3\2\2\2\u00d5\u00d3\3\2\2"+
		"\2\u00d6\u00d7\7\"\2\2\u00d7\u00d8\5\26\f\2\u00d8\u00d9\b\r\1\2\u00d9"+
		"\31\3\2\2\2\u00da\u00db\5\34\17\2\u00db\u00dc\b\16\1\2\u00dc\33\3\2\2"+
		"\2\u00dd\u00f6\b\17\1\2\u00de\u00df\5$\23\2\u00df\u00e0\b\17\1\2\u00e0"+
		"\u00f7\3\2\2\2\u00e1\u00e2\5(\25\2\u00e2\u00e3\b\17\1\2\u00e3\u00f7\3"+
		"\2\2\2\u00e4\u00e5\5*\26\2\u00e5\u00e6\b\17\1\2\u00e6\u00f7\3\2\2\2\u00e7"+
		"\u00e8\5\62\32\2\u00e8\u00e9\b\17\1\2\u00e9\u00f7\3\2\2\2\u00ea\u00eb"+
		"\5\64\33\2\u00eb\u00ec\b\17\1\2\u00ec\u00f7\3\2\2\2\u00ed\u00ee\5,\27"+
		"\2\u00ee\u00ef\b\17\1\2\u00ef\u00f7\3\2\2\2\u00f0\u00f1\5\60\31\2\u00f1"+
		"\u00f2\b\17\1\2\u00f2\u00f7\3\2\2\2\u00f3\u00f4\5.\30\2\u00f4\u00f5\b"+
		"\17\1\2\u00f5\u00f7\3\2\2\2\u00f6\u00de\3\2\2\2\u00f6\u00e1\3\2\2\2\u00f6"+
		"\u00e4\3\2\2\2\u00f6\u00e7\3\2\2\2\u00f6\u00ea\3\2\2\2\u00f6\u00ed\3\2"+
		"\2\2\u00f6\u00f0\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7\u011c\3\2\2\2\u00f8"+
		"\u00fa\t\2\2\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb\u00fd\7\f\2\2\u00fc\u00fe\t\2\2\2\u00fd\u00fc\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0115\3\2\2\2\u00ff\u0101\b\17\1\2\u0100\u0102\t"+
		"\2\2\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0105\7\32\2\2\u0104\u0106\t\2\2\2\u0105\u0104\3\2\2\2\u0105\u0106\3"+
		"\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\7%\2\2\u0108\u0109\b\17\1\2\u0109"+
		"\u010a\7\27\2\2\u010a\u010c\7%\2\2\u010b\u010d\t\2\2\2\u010c\u010b\3\2"+
		"\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\7\33\2\2\u010f"+
		"\u0111\t\2\2\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0114\b\17\1\2\u0113\u00ff\3\2\2\2\u0114\u0117\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0118\u011a\7\17\2\2\u0119\u011b\t\2\2\2\u011a\u0119\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u00f9\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\35\3\2\2\2\u011e\u0120\b\20\1\2\u011f\u0121\t\2\2\2\u0120\u011f"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\5 \21\2\u0123"+
		"\u0125\t\2\2\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0126\u012d\b\20\1\2\u0127\u0128\7\5\2\2\u0128\u0129\5 \21\2\u0129"+
		"\u012a\b\20\1\2\u012a\u012c\3\2\2\2\u012b\u0127\3\2\2\2\u012c\u012f\3"+
		"\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\37\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u0130\u0131\5\"\22\2\u0131\u0132\b\21\1\2\u0132\u013a\3"+
		"\2\2\2\u0133\u0134\5&\24\2\u0134\u0135\b\21\1\2\u0135\u013a\3\2\2\2\u0136"+
		"\u0137\5\66\34\2\u0137\u0138\b\21\1\2\u0138\u013a\3\2\2\2\u0139\u0130"+
		"\3\2\2\2\u0139\u0133\3\2\2\2\u0139\u0136\3\2\2\2\u013a!\3\2\2\2\u013b"+
		"\u013c\b\22\1\2\u013c\u013d\7%\2\2\u013d\u013e\b\22\1\2\u013e#\3\2\2\2"+
		"\u013f\u0140\b\23\1\2\u0140\u0141\7\36\2\2\u0141\u0142\7\b\2\2\u0142\u0143"+
		"\5&\24\2\u0143\u0144\b\23\1\2\u0144\u0145\7\30\2\2\u0145%\3\2\2\2\u0146"+
		"\u0147\b\24\1\2\u0147\u0148\58\35\2\u0148\u0149\7#\2\2\u0149\u014a\t\3"+
		"\2\2\u014a\u014b\b\24\1\2\u014b\u014c\7\b\2\2\u014c\u014d\5\36\20\2\u014d"+
		"\u014e\b\24\1\2\u014e\u014f\7\30\2\2\u014f\'\3\2\2\2\u0150\u0151\b\25"+
		"\1\2\u0151\u0152\7 \2\2\u0152\u0153\7\b\2\2\u0153\u0154\5&\24\2\u0154"+
		"\u0155\b\25\1\2\u0155\u0156\7\30\2\2\u0156)\3\2\2\2\u0157\u0158\b\26\1"+
		"\2\u0158\u0159\7!\2\2\u0159\u015a\7\b\2\2\u015a\u015b\5&\24\2\u015b\u015c"+
		"\b\26\1\2\u015c\u015d\7\30\2\2\u015d+\3\2\2\2\u015e\u015f\b\27\1\2\u015f"+
		"\u0160\7\23\2\2\u0160\u0164\7\b\2\2\u0161\u0162\5&\24\2\u0162\u0163\b"+
		"\27\1\2\u0163\u0165\3\2\2\2\u0164\u0161\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0167\7\30\2\2\u0167-\3\2\2\2\u0168\u0169\b\30\1"+
		"\2\u0169\u016a\7\26\2\2\u016a\u016b\7\b\2\2\u016b\u016c\5&\24\2\u016c"+
		"\u016d\b\30\1\2\u016d\u016e\7\30\2\2\u016e/\3\2\2\2\u016f\u0170\b\31\1"+
		"\2\u0170\u0171\7\31\2\2\u0171\u0172\7\b\2\2\u0172\u0173\5&\24\2\u0173"+
		"\u0174\b\31\1\2\u0174\u0175\7\30\2\2\u0175\61\3\2\2\2\u0176\u0177\b\32"+
		"\1\2\u0177\u0178\7\34\2\2\u0178\u0179\7\b\2\2\u0179\u017a\5\66\34\2\u017a"+
		"\u017b\7\30\2\2\u017b\u017c\b\32\1\2\u017c\63\3\2\2\2\u017d\u017e\b\33"+
		"\1\2\u017e\u017f\7\7\2\2\u017f\u0180\7\b\2\2\u0180\u0181\5&\24\2\u0181"+
		"\u0182\b\33\1\2\u0182\u0183\7\30\2\2\u0183\65\3\2\2\2\u0184\u0195\b\34"+
		"\1\2\u0185\u0188\7%\2\2\u0186\u0188\7\6\2\2\u0187\u0185\3\2\2\2\u0187"+
		"\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u0192\b\34\1\2\u018a\u018d\7"+
		"\27\2\2\u018b\u018e\7%\2\2\u018c\u018e\7\6\2\2\u018d\u018b\3\2\2\2\u018d"+
		"\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\b\34\1\2\u0190\u018a\3"+
		"\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0187\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196\67\3\2\2\2\u0197\u0198\t\4\2\2\u01989\3\2\2\2-@EILSW^hvy|\u0089"+
		"\u008d\u0093\u0097\u009b\u00a1\u00ab\u00b1\u00b9\u00c2\u00c6\u00ca\u00d3"+
		"\u00f6\u00f9\u00fd\u0101\u0105\u010c\u0110\u0115\u011a\u011c\u0120\u0124"+
		"\u012d\u0139\u0164\u0187\u018d\u0192\u0195";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
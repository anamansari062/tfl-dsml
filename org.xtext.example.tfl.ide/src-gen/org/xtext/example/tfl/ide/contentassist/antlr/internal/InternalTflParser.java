package org.xtext.example.tfl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.tfl.services.TflGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTflParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'stop'", "'transport'", "'capacity'", "'speed'", "'kmph'", "'routes'", "'{'", "'}'", "'passengers'", "'peak'", "'nonpeak'", "'->'", "'in'", "'min'", "'disruption'", "'affects'", "'at'", "'duration'", "'.'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTflParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTflParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTflParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTfl.g"; }


    	private TflGrammarAccess grammarAccess;

    	public void setGrammarAccess(TflGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleTflSystem"
    // InternalTfl.g:53:1: entryRuleTflSystem : ruleTflSystem EOF ;
    public final void entryRuleTflSystem() throws RecognitionException {
        try {
            // InternalTfl.g:54:1: ( ruleTflSystem EOF )
            // InternalTfl.g:55:1: ruleTflSystem EOF
            {
             before(grammarAccess.getTflSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleTflSystem();

            state._fsp--;

             after(grammarAccess.getTflSystemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTflSystem"


    // $ANTLR start "ruleTflSystem"
    // InternalTfl.g:62:1: ruleTflSystem : ( ( rule__TflSystem__Group__0 ) ) ;
    public final void ruleTflSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:66:2: ( ( ( rule__TflSystem__Group__0 ) ) )
            // InternalTfl.g:67:2: ( ( rule__TflSystem__Group__0 ) )
            {
            // InternalTfl.g:67:2: ( ( rule__TflSystem__Group__0 ) )
            // InternalTfl.g:68:3: ( rule__TflSystem__Group__0 )
            {
             before(grammarAccess.getTflSystemAccess().getGroup()); 
            // InternalTfl.g:69:3: ( rule__TflSystem__Group__0 )
            // InternalTfl.g:69:4: rule__TflSystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TflSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTflSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTflSystem"


    // $ANTLR start "entryRuleStop"
    // InternalTfl.g:78:1: entryRuleStop : ruleStop EOF ;
    public final void entryRuleStop() throws RecognitionException {
        try {
            // InternalTfl.g:79:1: ( ruleStop EOF )
            // InternalTfl.g:80:1: ruleStop EOF
            {
             before(grammarAccess.getStopRule()); 
            pushFollow(FOLLOW_1);
            ruleStop();

            state._fsp--;

             after(grammarAccess.getStopRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStop"


    // $ANTLR start "ruleStop"
    // InternalTfl.g:87:1: ruleStop : ( ( rule__Stop__Group__0 ) ) ;
    public final void ruleStop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:91:2: ( ( ( rule__Stop__Group__0 ) ) )
            // InternalTfl.g:92:2: ( ( rule__Stop__Group__0 ) )
            {
            // InternalTfl.g:92:2: ( ( rule__Stop__Group__0 ) )
            // InternalTfl.g:93:3: ( rule__Stop__Group__0 )
            {
             before(grammarAccess.getStopAccess().getGroup()); 
            // InternalTfl.g:94:3: ( rule__Stop__Group__0 )
            // InternalTfl.g:94:4: rule__Stop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Stop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStop"


    // $ANTLR start "entryRuleTransport"
    // InternalTfl.g:103:1: entryRuleTransport : ruleTransport EOF ;
    public final void entryRuleTransport() throws RecognitionException {
        try {
            // InternalTfl.g:104:1: ( ruleTransport EOF )
            // InternalTfl.g:105:1: ruleTransport EOF
            {
             before(grammarAccess.getTransportRule()); 
            pushFollow(FOLLOW_1);
            ruleTransport();

            state._fsp--;

             after(grammarAccess.getTransportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransport"


    // $ANTLR start "ruleTransport"
    // InternalTfl.g:112:1: ruleTransport : ( ( rule__Transport__Group__0 ) ) ;
    public final void ruleTransport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:116:2: ( ( ( rule__Transport__Group__0 ) ) )
            // InternalTfl.g:117:2: ( ( rule__Transport__Group__0 ) )
            {
            // InternalTfl.g:117:2: ( ( rule__Transport__Group__0 ) )
            // InternalTfl.g:118:3: ( rule__Transport__Group__0 )
            {
             before(grammarAccess.getTransportAccess().getGroup()); 
            // InternalTfl.g:119:3: ( rule__Transport__Group__0 )
            // InternalTfl.g:119:4: rule__Transport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransport"


    // $ANTLR start "entryRuleRoute"
    // InternalTfl.g:128:1: entryRuleRoute : ruleRoute EOF ;
    public final void entryRuleRoute() throws RecognitionException {
        try {
            // InternalTfl.g:129:1: ( ruleRoute EOF )
            // InternalTfl.g:130:1: ruleRoute EOF
            {
             before(grammarAccess.getRouteRule()); 
            pushFollow(FOLLOW_1);
            ruleRoute();

            state._fsp--;

             after(grammarAccess.getRouteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoute"


    // $ANTLR start "ruleRoute"
    // InternalTfl.g:137:1: ruleRoute : ( ( rule__Route__Group__0 ) ) ;
    public final void ruleRoute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:141:2: ( ( ( rule__Route__Group__0 ) ) )
            // InternalTfl.g:142:2: ( ( rule__Route__Group__0 ) )
            {
            // InternalTfl.g:142:2: ( ( rule__Route__Group__0 ) )
            // InternalTfl.g:143:3: ( rule__Route__Group__0 )
            {
             before(grammarAccess.getRouteAccess().getGroup()); 
            // InternalTfl.g:144:3: ( rule__Route__Group__0 )
            // InternalTfl.g:144:4: rule__Route__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Route__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRouteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoute"


    // $ANTLR start "entryRuleDisruption"
    // InternalTfl.g:153:1: entryRuleDisruption : ruleDisruption EOF ;
    public final void entryRuleDisruption() throws RecognitionException {
        try {
            // InternalTfl.g:154:1: ( ruleDisruption EOF )
            // InternalTfl.g:155:1: ruleDisruption EOF
            {
             before(grammarAccess.getDisruptionRule()); 
            pushFollow(FOLLOW_1);
            ruleDisruption();

            state._fsp--;

             after(grammarAccess.getDisruptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDisruption"


    // $ANTLR start "ruleDisruption"
    // InternalTfl.g:162:1: ruleDisruption : ( ( rule__Disruption__Group__0 ) ) ;
    public final void ruleDisruption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:166:2: ( ( ( rule__Disruption__Group__0 ) ) )
            // InternalTfl.g:167:2: ( ( rule__Disruption__Group__0 ) )
            {
            // InternalTfl.g:167:2: ( ( rule__Disruption__Group__0 ) )
            // InternalTfl.g:168:3: ( rule__Disruption__Group__0 )
            {
             before(grammarAccess.getDisruptionAccess().getGroup()); 
            // InternalTfl.g:169:3: ( rule__Disruption__Group__0 )
            // InternalTfl.g:169:4: rule__Disruption__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Disruption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDisruptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDisruption"


    // $ANTLR start "entryRuleREAL"
    // InternalTfl.g:178:1: entryRuleREAL : ruleREAL EOF ;
    public final void entryRuleREAL() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTfl.g:182:1: ( ruleREAL EOF )
            // InternalTfl.g:183:1: ruleREAL EOF
            {
             before(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_1);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getREALRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalTfl.g:193:1: ruleREAL : ( ( rule__REAL__Group__0 ) ) ;
    public final void ruleREAL() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:198:2: ( ( ( rule__REAL__Group__0 ) ) )
            // InternalTfl.g:199:2: ( ( rule__REAL__Group__0 ) )
            {
            // InternalTfl.g:199:2: ( ( rule__REAL__Group__0 ) )
            // InternalTfl.g:200:3: ( rule__REAL__Group__0 )
            {
             before(grammarAccess.getREALAccess().getGroup()); 
            // InternalTfl.g:201:3: ( rule__REAL__Group__0 )
            // InternalTfl.g:201:4: rule__REAL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__REAL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getREALAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "rule__TflSystem__Group__0"
    // InternalTfl.g:210:1: rule__TflSystem__Group__0 : rule__TflSystem__Group__0__Impl rule__TflSystem__Group__1 ;
    public final void rule__TflSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:214:1: ( rule__TflSystem__Group__0__Impl rule__TflSystem__Group__1 )
            // InternalTfl.g:215:2: rule__TflSystem__Group__0__Impl rule__TflSystem__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TflSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TflSystem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TflSystem__Group__0"


    // $ANTLR start "rule__TflSystem__Group__0__Impl"
    // InternalTfl.g:222:1: rule__TflSystem__Group__0__Impl : ( ( rule__TflSystem__StopsAssignment_0 )* ) ;
    public final void rule__TflSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:226:1: ( ( ( rule__TflSystem__StopsAssignment_0 )* ) )
            // InternalTfl.g:227:1: ( ( rule__TflSystem__StopsAssignment_0 )* )
            {
            // InternalTfl.g:227:1: ( ( rule__TflSystem__StopsAssignment_0 )* )
            // InternalTfl.g:228:2: ( rule__TflSystem__StopsAssignment_0 )*
            {
             before(grammarAccess.getTflSystemAccess().getStopsAssignment_0()); 
            // InternalTfl.g:229:2: ( rule__TflSystem__StopsAssignment_0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTfl.g:229:3: rule__TflSystem__StopsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__TflSystem__StopsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTflSystemAccess().getStopsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TflSystem__Group__0__Impl"


    // $ANTLR start "rule__TflSystem__Group__1"
    // InternalTfl.g:237:1: rule__TflSystem__Group__1 : rule__TflSystem__Group__1__Impl rule__TflSystem__Group__2 ;
    public final void rule__TflSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:241:1: ( rule__TflSystem__Group__1__Impl rule__TflSystem__Group__2 )
            // InternalTfl.g:242:2: rule__TflSystem__Group__1__Impl rule__TflSystem__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__TflSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TflSystem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TflSystem__Group__1"


    // $ANTLR start "rule__TflSystem__Group__1__Impl"
    // InternalTfl.g:249:1: rule__TflSystem__Group__1__Impl : ( ( rule__TflSystem__TransportsAssignment_1 )* ) ;
    public final void rule__TflSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:253:1: ( ( ( rule__TflSystem__TransportsAssignment_1 )* ) )
            // InternalTfl.g:254:1: ( ( rule__TflSystem__TransportsAssignment_1 )* )
            {
            // InternalTfl.g:254:1: ( ( rule__TflSystem__TransportsAssignment_1 )* )
            // InternalTfl.g:255:2: ( rule__TflSystem__TransportsAssignment_1 )*
            {
             before(grammarAccess.getTflSystemAccess().getTransportsAssignment_1()); 
            // InternalTfl.g:256:2: ( rule__TflSystem__TransportsAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTfl.g:256:3: rule__TflSystem__TransportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__TflSystem__TransportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getTflSystemAccess().getTransportsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TflSystem__Group__1__Impl"


    // $ANTLR start "rule__TflSystem__Group__2"
    // InternalTfl.g:264:1: rule__TflSystem__Group__2 : rule__TflSystem__Group__2__Impl ;
    public final void rule__TflSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:268:1: ( rule__TflSystem__Group__2__Impl )
            // InternalTfl.g:269:2: rule__TflSystem__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TflSystem__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TflSystem__Group__2"


    // $ANTLR start "rule__TflSystem__Group__2__Impl"
    // InternalTfl.g:275:1: rule__TflSystem__Group__2__Impl : ( ( rule__TflSystem__DisruptionsAssignment_2 )* ) ;
    public final void rule__TflSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:279:1: ( ( ( rule__TflSystem__DisruptionsAssignment_2 )* ) )
            // InternalTfl.g:280:1: ( ( rule__TflSystem__DisruptionsAssignment_2 )* )
            {
            // InternalTfl.g:280:1: ( ( rule__TflSystem__DisruptionsAssignment_2 )* )
            // InternalTfl.g:281:2: ( rule__TflSystem__DisruptionsAssignment_2 )*
            {
             before(grammarAccess.getTflSystemAccess().getDisruptionsAssignment_2()); 
            // InternalTfl.g:282:2: ( rule__TflSystem__DisruptionsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTfl.g:282:3: rule__TflSystem__DisruptionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__TflSystem__DisruptionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getTflSystemAccess().getDisruptionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TflSystem__Group__2__Impl"


    // $ANTLR start "rule__Stop__Group__0"
    // InternalTfl.g:291:1: rule__Stop__Group__0 : rule__Stop__Group__0__Impl rule__Stop__Group__1 ;
    public final void rule__Stop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:295:1: ( rule__Stop__Group__0__Impl rule__Stop__Group__1 )
            // InternalTfl.g:296:2: rule__Stop__Group__0__Impl rule__Stop__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Stop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__0"


    // $ANTLR start "rule__Stop__Group__0__Impl"
    // InternalTfl.g:303:1: rule__Stop__Group__0__Impl : ( 'stop' ) ;
    public final void rule__Stop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:307:1: ( ( 'stop' ) )
            // InternalTfl.g:308:1: ( 'stop' )
            {
            // InternalTfl.g:308:1: ( 'stop' )
            // InternalTfl.g:309:2: 'stop'
            {
             before(grammarAccess.getStopAccess().getStopKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getStopAccess().getStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__0__Impl"


    // $ANTLR start "rule__Stop__Group__1"
    // InternalTfl.g:318:1: rule__Stop__Group__1 : rule__Stop__Group__1__Impl ;
    public final void rule__Stop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:322:1: ( rule__Stop__Group__1__Impl )
            // InternalTfl.g:323:2: rule__Stop__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stop__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__1"


    // $ANTLR start "rule__Stop__Group__1__Impl"
    // InternalTfl.g:329:1: rule__Stop__Group__1__Impl : ( ( rule__Stop__NameAssignment_1 ) ) ;
    public final void rule__Stop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:333:1: ( ( ( rule__Stop__NameAssignment_1 ) ) )
            // InternalTfl.g:334:1: ( ( rule__Stop__NameAssignment_1 ) )
            {
            // InternalTfl.g:334:1: ( ( rule__Stop__NameAssignment_1 ) )
            // InternalTfl.g:335:2: ( rule__Stop__NameAssignment_1 )
            {
             before(grammarAccess.getStopAccess().getNameAssignment_1()); 
            // InternalTfl.g:336:2: ( rule__Stop__NameAssignment_1 )
            // InternalTfl.g:336:3: rule__Stop__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Stop__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStopAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__1__Impl"


    // $ANTLR start "rule__Transport__Group__0"
    // InternalTfl.g:345:1: rule__Transport__Group__0 : rule__Transport__Group__0__Impl rule__Transport__Group__1 ;
    public final void rule__Transport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:349:1: ( rule__Transport__Group__0__Impl rule__Transport__Group__1 )
            // InternalTfl.g:350:2: rule__Transport__Group__0__Impl rule__Transport__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Transport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transport__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__0"


    // $ANTLR start "rule__Transport__Group__0__Impl"
    // InternalTfl.g:357:1: rule__Transport__Group__0__Impl : ( 'transport' ) ;
    public final void rule__Transport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:361:1: ( ( 'transport' ) )
            // InternalTfl.g:362:1: ( 'transport' )
            {
            // InternalTfl.g:362:1: ( 'transport' )
            // InternalTfl.g:363:2: 'transport'
            {
             before(grammarAccess.getTransportAccess().getTransportKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTransportAccess().getTransportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__0__Impl"


    // $ANTLR start "rule__Transport__Group__1"
    // InternalTfl.g:372:1: rule__Transport__Group__1 : rule__Transport__Group__1__Impl rule__Transport__Group__2 ;
    public final void rule__Transport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:376:1: ( rule__Transport__Group__1__Impl rule__Transport__Group__2 )
            // InternalTfl.g:377:2: rule__Transport__Group__1__Impl rule__Transport__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Transport__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transport__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__1"


    // $ANTLR start "rule__Transport__Group__1__Impl"
    // InternalTfl.g:384:1: rule__Transport__Group__1__Impl : ( ( rule__Transport__NameAssignment_1 ) ) ;
    public final void rule__Transport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:388:1: ( ( ( rule__Transport__NameAssignment_1 ) ) )
            // InternalTfl.g:389:1: ( ( rule__Transport__NameAssignment_1 ) )
            {
            // InternalTfl.g:389:1: ( ( rule__Transport__NameAssignment_1 ) )
            // InternalTfl.g:390:2: ( rule__Transport__NameAssignment_1 )
            {
             before(grammarAccess.getTransportAccess().getNameAssignment_1()); 
            // InternalTfl.g:391:2: ( rule__Transport__NameAssignment_1 )
            // InternalTfl.g:391:3: rule__Transport__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Transport__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransportAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__1__Impl"


    // $ANTLR start "rule__Transport__Group__2"
    // InternalTfl.g:399:1: rule__Transport__Group__2 : rule__Transport__Group__2__Impl rule__Transport__Group__3 ;
    public final void rule__Transport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:403:1: ( rule__Transport__Group__2__Impl rule__Transport__Group__3 )
            // InternalTfl.g:404:2: rule__Transport__Group__2__Impl rule__Transport__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Transport__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transport__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__2"


    // $ANTLR start "rule__Transport__Group__2__Impl"
    // InternalTfl.g:411:1: rule__Transport__Group__2__Impl : ( 'capacity' ) ;
    public final void rule__Transport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:415:1: ( ( 'capacity' ) )
            // InternalTfl.g:416:1: ( 'capacity' )
            {
            // InternalTfl.g:416:1: ( 'capacity' )
            // InternalTfl.g:417:2: 'capacity'
            {
             before(grammarAccess.getTransportAccess().getCapacityKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTransportAccess().getCapacityKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__2__Impl"


    // $ANTLR start "rule__Transport__Group__3"
    // InternalTfl.g:426:1: rule__Transport__Group__3 : rule__Transport__Group__3__Impl rule__Transport__Group__4 ;
    public final void rule__Transport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:430:1: ( rule__Transport__Group__3__Impl rule__Transport__Group__4 )
            // InternalTfl.g:431:2: rule__Transport__Group__3__Impl rule__Transport__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Transport__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transport__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__3"


    // $ANTLR start "rule__Transport__Group__3__Impl"
    // InternalTfl.g:438:1: rule__Transport__Group__3__Impl : ( ( rule__Transport__CapacityAssignment_3 ) ) ;
    public final void rule__Transport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:442:1: ( ( ( rule__Transport__CapacityAssignment_3 ) ) )
            // InternalTfl.g:443:1: ( ( rule__Transport__CapacityAssignment_3 ) )
            {
            // InternalTfl.g:443:1: ( ( rule__Transport__CapacityAssignment_3 ) )
            // InternalTfl.g:444:2: ( rule__Transport__CapacityAssignment_3 )
            {
             before(grammarAccess.getTransportAccess().getCapacityAssignment_3()); 
            // InternalTfl.g:445:2: ( rule__Transport__CapacityAssignment_3 )
            // InternalTfl.g:445:3: rule__Transport__CapacityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Transport__CapacityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTransportAccess().getCapacityAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__3__Impl"


    // $ANTLR start "rule__Transport__Group__4"
    // InternalTfl.g:453:1: rule__Transport__Group__4 : rule__Transport__Group__4__Impl rule__Transport__Group__5 ;
    public final void rule__Transport__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:457:1: ( rule__Transport__Group__4__Impl rule__Transport__Group__5 )
            // InternalTfl.g:458:2: rule__Transport__Group__4__Impl rule__Transport__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Transport__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transport__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__4"


    // $ANTLR start "rule__Transport__Group__4__Impl"
    // InternalTfl.g:465:1: rule__Transport__Group__4__Impl : ( 'speed' ) ;
    public final void rule__Transport__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:469:1: ( ( 'speed' ) )
            // InternalTfl.g:470:1: ( 'speed' )
            {
            // InternalTfl.g:470:1: ( 'speed' )
            // InternalTfl.g:471:2: 'speed'
            {
             before(grammarAccess.getTransportAccess().getSpeedKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTransportAccess().getSpeedKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__4__Impl"


    // $ANTLR start "rule__Transport__Group__5"
    // InternalTfl.g:480:1: rule__Transport__Group__5 : rule__Transport__Group__5__Impl rule__Transport__Group__6 ;
    public final void rule__Transport__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:484:1: ( rule__Transport__Group__5__Impl rule__Transport__Group__6 )
            // InternalTfl.g:485:2: rule__Transport__Group__5__Impl rule__Transport__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Transport__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transport__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__5"


    // $ANTLR start "rule__Transport__Group__5__Impl"
    // InternalTfl.g:492:1: rule__Transport__Group__5__Impl : ( ( rule__Transport__SpeedAssignment_5 ) ) ;
    public final void rule__Transport__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:496:1: ( ( ( rule__Transport__SpeedAssignment_5 ) ) )
            // InternalTfl.g:497:1: ( ( rule__Transport__SpeedAssignment_5 ) )
            {
            // InternalTfl.g:497:1: ( ( rule__Transport__SpeedAssignment_5 ) )
            // InternalTfl.g:498:2: ( rule__Transport__SpeedAssignment_5 )
            {
             before(grammarAccess.getTransportAccess().getSpeedAssignment_5()); 
            // InternalTfl.g:499:2: ( rule__Transport__SpeedAssignment_5 )
            // InternalTfl.g:499:3: rule__Transport__SpeedAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Transport__SpeedAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTransportAccess().getSpeedAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__5__Impl"


    // $ANTLR start "rule__Transport__Group__6"
    // InternalTfl.g:507:1: rule__Transport__Group__6 : rule__Transport__Group__6__Impl rule__Transport__Group__7 ;
    public final void rule__Transport__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:511:1: ( rule__Transport__Group__6__Impl rule__Transport__Group__7 )
            // InternalTfl.g:512:2: rule__Transport__Group__6__Impl rule__Transport__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Transport__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transport__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__6"


    // $ANTLR start "rule__Transport__Group__6__Impl"
    // InternalTfl.g:519:1: rule__Transport__Group__6__Impl : ( 'kmph' ) ;
    public final void rule__Transport__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:523:1: ( ( 'kmph' ) )
            // InternalTfl.g:524:1: ( 'kmph' )
            {
            // InternalTfl.g:524:1: ( 'kmph' )
            // InternalTfl.g:525:2: 'kmph'
            {
             before(grammarAccess.getTransportAccess().getKmphKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTransportAccess().getKmphKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__6__Impl"


    // $ANTLR start "rule__Transport__Group__7"
    // InternalTfl.g:534:1: rule__Transport__Group__7 : rule__Transport__Group__7__Impl rule__Transport__Group__8 ;
    public final void rule__Transport__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:538:1: ( rule__Transport__Group__7__Impl rule__Transport__Group__8 )
            // InternalTfl.g:539:2: rule__Transport__Group__7__Impl rule__Transport__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__Transport__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transport__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__7"


    // $ANTLR start "rule__Transport__Group__7__Impl"
    // InternalTfl.g:546:1: rule__Transport__Group__7__Impl : ( 'routes' ) ;
    public final void rule__Transport__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:550:1: ( ( 'routes' ) )
            // InternalTfl.g:551:1: ( 'routes' )
            {
            // InternalTfl.g:551:1: ( 'routes' )
            // InternalTfl.g:552:2: 'routes'
            {
             before(grammarAccess.getTransportAccess().getRoutesKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTransportAccess().getRoutesKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__7__Impl"


    // $ANTLR start "rule__Transport__Group__8"
    // InternalTfl.g:561:1: rule__Transport__Group__8 : rule__Transport__Group__8__Impl rule__Transport__Group__9 ;
    public final void rule__Transport__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:565:1: ( rule__Transport__Group__8__Impl rule__Transport__Group__9 )
            // InternalTfl.g:566:2: rule__Transport__Group__8__Impl rule__Transport__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__Transport__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transport__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__8"


    // $ANTLR start "rule__Transport__Group__8__Impl"
    // InternalTfl.g:573:1: rule__Transport__Group__8__Impl : ( '{' ) ;
    public final void rule__Transport__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:577:1: ( ( '{' ) )
            // InternalTfl.g:578:1: ( '{' )
            {
            // InternalTfl.g:578:1: ( '{' )
            // InternalTfl.g:579:2: '{'
            {
             before(grammarAccess.getTransportAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTransportAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__8__Impl"


    // $ANTLR start "rule__Transport__Group__9"
    // InternalTfl.g:588:1: rule__Transport__Group__9 : rule__Transport__Group__9__Impl rule__Transport__Group__10 ;
    public final void rule__Transport__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:592:1: ( rule__Transport__Group__9__Impl rule__Transport__Group__10 )
            // InternalTfl.g:593:2: rule__Transport__Group__9__Impl rule__Transport__Group__10
            {
            pushFollow(FOLLOW_15);
            rule__Transport__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transport__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__9"


    // $ANTLR start "rule__Transport__Group__9__Impl"
    // InternalTfl.g:600:1: rule__Transport__Group__9__Impl : ( ( rule__Transport__RoutesAssignment_9 )* ) ;
    public final void rule__Transport__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:604:1: ( ( ( rule__Transport__RoutesAssignment_9 )* ) )
            // InternalTfl.g:605:1: ( ( rule__Transport__RoutesAssignment_9 )* )
            {
            // InternalTfl.g:605:1: ( ( rule__Transport__RoutesAssignment_9 )* )
            // InternalTfl.g:606:2: ( rule__Transport__RoutesAssignment_9 )*
            {
             before(grammarAccess.getTransportAccess().getRoutesAssignment_9()); 
            // InternalTfl.g:607:2: ( rule__Transport__RoutesAssignment_9 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTfl.g:607:3: rule__Transport__RoutesAssignment_9
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Transport__RoutesAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getTransportAccess().getRoutesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__9__Impl"


    // $ANTLR start "rule__Transport__Group__10"
    // InternalTfl.g:615:1: rule__Transport__Group__10 : rule__Transport__Group__10__Impl rule__Transport__Group__11 ;
    public final void rule__Transport__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:619:1: ( rule__Transport__Group__10__Impl rule__Transport__Group__11 )
            // InternalTfl.g:620:2: rule__Transport__Group__10__Impl rule__Transport__Group__11
            {
            pushFollow(FOLLOW_17);
            rule__Transport__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transport__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__10"


    // $ANTLR start "rule__Transport__Group__10__Impl"
    // InternalTfl.g:627:1: rule__Transport__Group__10__Impl : ( '}' ) ;
    public final void rule__Transport__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:631:1: ( ( '}' ) )
            // InternalTfl.g:632:1: ( '}' )
            {
            // InternalTfl.g:632:1: ( '}' )
            // InternalTfl.g:633:2: '}'
            {
             before(grammarAccess.getTransportAccess().getRightCurlyBracketKeyword_10()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTransportAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__10__Impl"


    // $ANTLR start "rule__Transport__Group__11"
    // InternalTfl.g:642:1: rule__Transport__Group__11 : rule__Transport__Group__11__Impl rule__Transport__Group__12 ;
    public final void rule__Transport__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:646:1: ( rule__Transport__Group__11__Impl rule__Transport__Group__12 )
            // InternalTfl.g:647:2: rule__Transport__Group__11__Impl rule__Transport__Group__12
            {
            pushFollow(FOLLOW_14);
            rule__Transport__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transport__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__11"


    // $ANTLR start "rule__Transport__Group__11__Impl"
    // InternalTfl.g:654:1: rule__Transport__Group__11__Impl : ( 'passengers' ) ;
    public final void rule__Transport__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:658:1: ( ( 'passengers' ) )
            // InternalTfl.g:659:1: ( 'passengers' )
            {
            // InternalTfl.g:659:1: ( 'passengers' )
            // InternalTfl.g:660:2: 'passengers'
            {
             before(grammarAccess.getTransportAccess().getPassengersKeyword_11()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTransportAccess().getPassengersKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__11__Impl"


    // $ANTLR start "rule__Transport__Group__12"
    // InternalTfl.g:669:1: rule__Transport__Group__12 : rule__Transport__Group__12__Impl rule__Transport__Group__13 ;
    public final void rule__Transport__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:673:1: ( rule__Transport__Group__12__Impl rule__Transport__Group__13 )
            // InternalTfl.g:674:2: rule__Transport__Group__12__Impl rule__Transport__Group__13
            {
            pushFollow(FOLLOW_18);
            rule__Transport__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transport__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__12"


    // $ANTLR start "rule__Transport__Group__12__Impl"
    // InternalTfl.g:681:1: rule__Transport__Group__12__Impl : ( '{' ) ;
    public final void rule__Transport__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:685:1: ( ( '{' ) )
            // InternalTfl.g:686:1: ( '{' )
            {
            // InternalTfl.g:686:1: ( '{' )
            // InternalTfl.g:687:2: '{'
            {
             before(grammarAccess.getTransportAccess().getLeftCurlyBracketKeyword_12()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTransportAccess().getLeftCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__12__Impl"


    // $ANTLR start "rule__Transport__Group__13"
    // InternalTfl.g:696:1: rule__Transport__Group__13 : rule__Transport__Group__13__Impl rule__Transport__Group__14 ;
    public final void rule__Transport__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:700:1: ( rule__Transport__Group__13__Impl rule__Transport__Group__14 )
            // InternalTfl.g:701:2: rule__Transport__Group__13__Impl rule__Transport__Group__14
            {
            pushFollow(FOLLOW_9);
            rule__Transport__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transport__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__13"


    // $ANTLR start "rule__Transport__Group__13__Impl"
    // InternalTfl.g:708:1: rule__Transport__Group__13__Impl : ( 'peak' ) ;
    public final void rule__Transport__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:712:1: ( ( 'peak' ) )
            // InternalTfl.g:713:1: ( 'peak' )
            {
            // InternalTfl.g:713:1: ( 'peak' )
            // InternalTfl.g:714:2: 'peak'
            {
             before(grammarAccess.getTransportAccess().getPeakKeyword_13()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTransportAccess().getPeakKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__13__Impl"


    // $ANTLR start "rule__Transport__Group__14"
    // InternalTfl.g:723:1: rule__Transport__Group__14 : rule__Transport__Group__14__Impl rule__Transport__Group__15 ;
    public final void rule__Transport__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:727:1: ( rule__Transport__Group__14__Impl rule__Transport__Group__15 )
            // InternalTfl.g:728:2: rule__Transport__Group__14__Impl rule__Transport__Group__15
            {
            pushFollow(FOLLOW_19);
            rule__Transport__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transport__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__14"


    // $ANTLR start "rule__Transport__Group__14__Impl"
    // InternalTfl.g:735:1: rule__Transport__Group__14__Impl : ( ( rule__Transport__PeakAssignment_14 ) ) ;
    public final void rule__Transport__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:739:1: ( ( ( rule__Transport__PeakAssignment_14 ) ) )
            // InternalTfl.g:740:1: ( ( rule__Transport__PeakAssignment_14 ) )
            {
            // InternalTfl.g:740:1: ( ( rule__Transport__PeakAssignment_14 ) )
            // InternalTfl.g:741:2: ( rule__Transport__PeakAssignment_14 )
            {
             before(grammarAccess.getTransportAccess().getPeakAssignment_14()); 
            // InternalTfl.g:742:2: ( rule__Transport__PeakAssignment_14 )
            // InternalTfl.g:742:3: rule__Transport__PeakAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Transport__PeakAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getTransportAccess().getPeakAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__14__Impl"


    // $ANTLR start "rule__Transport__Group__15"
    // InternalTfl.g:750:1: rule__Transport__Group__15 : rule__Transport__Group__15__Impl rule__Transport__Group__16 ;
    public final void rule__Transport__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:754:1: ( rule__Transport__Group__15__Impl rule__Transport__Group__16 )
            // InternalTfl.g:755:2: rule__Transport__Group__15__Impl rule__Transport__Group__16
            {
            pushFollow(FOLLOW_9);
            rule__Transport__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transport__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__15"


    // $ANTLR start "rule__Transport__Group__15__Impl"
    // InternalTfl.g:762:1: rule__Transport__Group__15__Impl : ( 'nonpeak' ) ;
    public final void rule__Transport__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:766:1: ( ( 'nonpeak' ) )
            // InternalTfl.g:767:1: ( 'nonpeak' )
            {
            // InternalTfl.g:767:1: ( 'nonpeak' )
            // InternalTfl.g:768:2: 'nonpeak'
            {
             before(grammarAccess.getTransportAccess().getNonpeakKeyword_15()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTransportAccess().getNonpeakKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__15__Impl"


    // $ANTLR start "rule__Transport__Group__16"
    // InternalTfl.g:777:1: rule__Transport__Group__16 : rule__Transport__Group__16__Impl rule__Transport__Group__17 ;
    public final void rule__Transport__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:781:1: ( rule__Transport__Group__16__Impl rule__Transport__Group__17 )
            // InternalTfl.g:782:2: rule__Transport__Group__16__Impl rule__Transport__Group__17
            {
            pushFollow(FOLLOW_20);
            rule__Transport__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transport__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__16"


    // $ANTLR start "rule__Transport__Group__16__Impl"
    // InternalTfl.g:789:1: rule__Transport__Group__16__Impl : ( ( rule__Transport__NonPeakAssignment_16 ) ) ;
    public final void rule__Transport__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:793:1: ( ( ( rule__Transport__NonPeakAssignment_16 ) ) )
            // InternalTfl.g:794:1: ( ( rule__Transport__NonPeakAssignment_16 ) )
            {
            // InternalTfl.g:794:1: ( ( rule__Transport__NonPeakAssignment_16 ) )
            // InternalTfl.g:795:2: ( rule__Transport__NonPeakAssignment_16 )
            {
             before(grammarAccess.getTransportAccess().getNonPeakAssignment_16()); 
            // InternalTfl.g:796:2: ( rule__Transport__NonPeakAssignment_16 )
            // InternalTfl.g:796:3: rule__Transport__NonPeakAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__Transport__NonPeakAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getTransportAccess().getNonPeakAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__16__Impl"


    // $ANTLR start "rule__Transport__Group__17"
    // InternalTfl.g:804:1: rule__Transport__Group__17 : rule__Transport__Group__17__Impl ;
    public final void rule__Transport__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:808:1: ( rule__Transport__Group__17__Impl )
            // InternalTfl.g:809:2: rule__Transport__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transport__Group__17__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__17"


    // $ANTLR start "rule__Transport__Group__17__Impl"
    // InternalTfl.g:815:1: rule__Transport__Group__17__Impl : ( '}' ) ;
    public final void rule__Transport__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:819:1: ( ( '}' ) )
            // InternalTfl.g:820:1: ( '}' )
            {
            // InternalTfl.g:820:1: ( '}' )
            // InternalTfl.g:821:2: '}'
            {
             before(grammarAccess.getTransportAccess().getRightCurlyBracketKeyword_17()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTransportAccess().getRightCurlyBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__Group__17__Impl"


    // $ANTLR start "rule__Route__Group__0"
    // InternalTfl.g:831:1: rule__Route__Group__0 : rule__Route__Group__0__Impl rule__Route__Group__1 ;
    public final void rule__Route__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:835:1: ( rule__Route__Group__0__Impl rule__Route__Group__1 )
            // InternalTfl.g:836:2: rule__Route__Group__0__Impl rule__Route__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Route__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Route__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Route__Group__0"


    // $ANTLR start "rule__Route__Group__0__Impl"
    // InternalTfl.g:843:1: rule__Route__Group__0__Impl : ( ( rule__Route__StartAssignment_0 ) ) ;
    public final void rule__Route__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:847:1: ( ( ( rule__Route__StartAssignment_0 ) ) )
            // InternalTfl.g:848:1: ( ( rule__Route__StartAssignment_0 ) )
            {
            // InternalTfl.g:848:1: ( ( rule__Route__StartAssignment_0 ) )
            // InternalTfl.g:849:2: ( rule__Route__StartAssignment_0 )
            {
             before(grammarAccess.getRouteAccess().getStartAssignment_0()); 
            // InternalTfl.g:850:2: ( rule__Route__StartAssignment_0 )
            // InternalTfl.g:850:3: rule__Route__StartAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Route__StartAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRouteAccess().getStartAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Route__Group__0__Impl"


    // $ANTLR start "rule__Route__Group__1"
    // InternalTfl.g:858:1: rule__Route__Group__1 : rule__Route__Group__1__Impl rule__Route__Group__2 ;
    public final void rule__Route__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:862:1: ( rule__Route__Group__1__Impl rule__Route__Group__2 )
            // InternalTfl.g:863:2: rule__Route__Group__1__Impl rule__Route__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Route__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Route__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Route__Group__1"


    // $ANTLR start "rule__Route__Group__1__Impl"
    // InternalTfl.g:870:1: rule__Route__Group__1__Impl : ( '->' ) ;
    public final void rule__Route__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:874:1: ( ( '->' ) )
            // InternalTfl.g:875:1: ( '->' )
            {
            // InternalTfl.g:875:1: ( '->' )
            // InternalTfl.g:876:2: '->'
            {
             before(grammarAccess.getRouteAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRouteAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Route__Group__1__Impl"


    // $ANTLR start "rule__Route__Group__2"
    // InternalTfl.g:885:1: rule__Route__Group__2 : rule__Route__Group__2__Impl rule__Route__Group__3 ;
    public final void rule__Route__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:889:1: ( rule__Route__Group__2__Impl rule__Route__Group__3 )
            // InternalTfl.g:890:2: rule__Route__Group__2__Impl rule__Route__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Route__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Route__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Route__Group__2"


    // $ANTLR start "rule__Route__Group__2__Impl"
    // InternalTfl.g:897:1: rule__Route__Group__2__Impl : ( ( rule__Route__EndAssignment_2 ) ) ;
    public final void rule__Route__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:901:1: ( ( ( rule__Route__EndAssignment_2 ) ) )
            // InternalTfl.g:902:1: ( ( rule__Route__EndAssignment_2 ) )
            {
            // InternalTfl.g:902:1: ( ( rule__Route__EndAssignment_2 ) )
            // InternalTfl.g:903:2: ( rule__Route__EndAssignment_2 )
            {
             before(grammarAccess.getRouteAccess().getEndAssignment_2()); 
            // InternalTfl.g:904:2: ( rule__Route__EndAssignment_2 )
            // InternalTfl.g:904:3: rule__Route__EndAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Route__EndAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRouteAccess().getEndAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Route__Group__2__Impl"


    // $ANTLR start "rule__Route__Group__3"
    // InternalTfl.g:912:1: rule__Route__Group__3 : rule__Route__Group__3__Impl rule__Route__Group__4 ;
    public final void rule__Route__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:916:1: ( rule__Route__Group__3__Impl rule__Route__Group__4 )
            // InternalTfl.g:917:2: rule__Route__Group__3__Impl rule__Route__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Route__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Route__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Route__Group__3"


    // $ANTLR start "rule__Route__Group__3__Impl"
    // InternalTfl.g:924:1: rule__Route__Group__3__Impl : ( 'in' ) ;
    public final void rule__Route__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:928:1: ( ( 'in' ) )
            // InternalTfl.g:929:1: ( 'in' )
            {
            // InternalTfl.g:929:1: ( 'in' )
            // InternalTfl.g:930:2: 'in'
            {
             before(grammarAccess.getRouteAccess().getInKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRouteAccess().getInKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Route__Group__3__Impl"


    // $ANTLR start "rule__Route__Group__4"
    // InternalTfl.g:939:1: rule__Route__Group__4 : rule__Route__Group__4__Impl rule__Route__Group__5 ;
    public final void rule__Route__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:943:1: ( rule__Route__Group__4__Impl rule__Route__Group__5 )
            // InternalTfl.g:944:2: rule__Route__Group__4__Impl rule__Route__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Route__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Route__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Route__Group__4"


    // $ANTLR start "rule__Route__Group__4__Impl"
    // InternalTfl.g:951:1: rule__Route__Group__4__Impl : ( ( rule__Route__DurationAssignment_4 ) ) ;
    public final void rule__Route__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:955:1: ( ( ( rule__Route__DurationAssignment_4 ) ) )
            // InternalTfl.g:956:1: ( ( rule__Route__DurationAssignment_4 ) )
            {
            // InternalTfl.g:956:1: ( ( rule__Route__DurationAssignment_4 ) )
            // InternalTfl.g:957:2: ( rule__Route__DurationAssignment_4 )
            {
             before(grammarAccess.getRouteAccess().getDurationAssignment_4()); 
            // InternalTfl.g:958:2: ( rule__Route__DurationAssignment_4 )
            // InternalTfl.g:958:3: rule__Route__DurationAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Route__DurationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRouteAccess().getDurationAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Route__Group__4__Impl"


    // $ANTLR start "rule__Route__Group__5"
    // InternalTfl.g:966:1: rule__Route__Group__5 : rule__Route__Group__5__Impl ;
    public final void rule__Route__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:970:1: ( rule__Route__Group__5__Impl )
            // InternalTfl.g:971:2: rule__Route__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Route__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Route__Group__5"


    // $ANTLR start "rule__Route__Group__5__Impl"
    // InternalTfl.g:977:1: rule__Route__Group__5__Impl : ( 'min' ) ;
    public final void rule__Route__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:981:1: ( ( 'min' ) )
            // InternalTfl.g:982:1: ( 'min' )
            {
            // InternalTfl.g:982:1: ( 'min' )
            // InternalTfl.g:983:2: 'min'
            {
             before(grammarAccess.getRouteAccess().getMinKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRouteAccess().getMinKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Route__Group__5__Impl"


    // $ANTLR start "rule__Disruption__Group__0"
    // InternalTfl.g:993:1: rule__Disruption__Group__0 : rule__Disruption__Group__0__Impl rule__Disruption__Group__1 ;
    public final void rule__Disruption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:997:1: ( rule__Disruption__Group__0__Impl rule__Disruption__Group__1 )
            // InternalTfl.g:998:2: rule__Disruption__Group__0__Impl rule__Disruption__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Disruption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Disruption__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disruption__Group__0"


    // $ANTLR start "rule__Disruption__Group__0__Impl"
    // InternalTfl.g:1005:1: rule__Disruption__Group__0__Impl : ( 'disruption' ) ;
    public final void rule__Disruption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1009:1: ( ( 'disruption' ) )
            // InternalTfl.g:1010:1: ( 'disruption' )
            {
            // InternalTfl.g:1010:1: ( 'disruption' )
            // InternalTfl.g:1011:2: 'disruption'
            {
             before(grammarAccess.getDisruptionAccess().getDisruptionKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDisruptionAccess().getDisruptionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disruption__Group__0__Impl"


    // $ANTLR start "rule__Disruption__Group__1"
    // InternalTfl.g:1020:1: rule__Disruption__Group__1 : rule__Disruption__Group__1__Impl rule__Disruption__Group__2 ;
    public final void rule__Disruption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1024:1: ( rule__Disruption__Group__1__Impl rule__Disruption__Group__2 )
            // InternalTfl.g:1025:2: rule__Disruption__Group__1__Impl rule__Disruption__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Disruption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Disruption__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disruption__Group__1"


    // $ANTLR start "rule__Disruption__Group__1__Impl"
    // InternalTfl.g:1032:1: rule__Disruption__Group__1__Impl : ( ( rule__Disruption__NameAssignment_1 ) ) ;
    public final void rule__Disruption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1036:1: ( ( ( rule__Disruption__NameAssignment_1 ) ) )
            // InternalTfl.g:1037:1: ( ( rule__Disruption__NameAssignment_1 ) )
            {
            // InternalTfl.g:1037:1: ( ( rule__Disruption__NameAssignment_1 ) )
            // InternalTfl.g:1038:2: ( rule__Disruption__NameAssignment_1 )
            {
             before(grammarAccess.getDisruptionAccess().getNameAssignment_1()); 
            // InternalTfl.g:1039:2: ( rule__Disruption__NameAssignment_1 )
            // InternalTfl.g:1039:3: rule__Disruption__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Disruption__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDisruptionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disruption__Group__1__Impl"


    // $ANTLR start "rule__Disruption__Group__2"
    // InternalTfl.g:1047:1: rule__Disruption__Group__2 : rule__Disruption__Group__2__Impl rule__Disruption__Group__3 ;
    public final void rule__Disruption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1051:1: ( rule__Disruption__Group__2__Impl rule__Disruption__Group__3 )
            // InternalTfl.g:1052:2: rule__Disruption__Group__2__Impl rule__Disruption__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Disruption__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Disruption__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disruption__Group__2"


    // $ANTLR start "rule__Disruption__Group__2__Impl"
    // InternalTfl.g:1059:1: rule__Disruption__Group__2__Impl : ( 'affects' ) ;
    public final void rule__Disruption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1063:1: ( ( 'affects' ) )
            // InternalTfl.g:1064:1: ( 'affects' )
            {
            // InternalTfl.g:1064:1: ( 'affects' )
            // InternalTfl.g:1065:2: 'affects'
            {
             before(grammarAccess.getDisruptionAccess().getAffectsKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDisruptionAccess().getAffectsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disruption__Group__2__Impl"


    // $ANTLR start "rule__Disruption__Group__3"
    // InternalTfl.g:1074:1: rule__Disruption__Group__3 : rule__Disruption__Group__3__Impl rule__Disruption__Group__4 ;
    public final void rule__Disruption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1078:1: ( rule__Disruption__Group__3__Impl rule__Disruption__Group__4 )
            // InternalTfl.g:1079:2: rule__Disruption__Group__3__Impl rule__Disruption__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Disruption__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Disruption__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disruption__Group__3"


    // $ANTLR start "rule__Disruption__Group__3__Impl"
    // InternalTfl.g:1086:1: rule__Disruption__Group__3__Impl : ( ( rule__Disruption__TransportAssignment_3 ) ) ;
    public final void rule__Disruption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1090:1: ( ( ( rule__Disruption__TransportAssignment_3 ) ) )
            // InternalTfl.g:1091:1: ( ( rule__Disruption__TransportAssignment_3 ) )
            {
            // InternalTfl.g:1091:1: ( ( rule__Disruption__TransportAssignment_3 ) )
            // InternalTfl.g:1092:2: ( rule__Disruption__TransportAssignment_3 )
            {
             before(grammarAccess.getDisruptionAccess().getTransportAssignment_3()); 
            // InternalTfl.g:1093:2: ( rule__Disruption__TransportAssignment_3 )
            // InternalTfl.g:1093:3: rule__Disruption__TransportAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Disruption__TransportAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDisruptionAccess().getTransportAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disruption__Group__3__Impl"


    // $ANTLR start "rule__Disruption__Group__4"
    // InternalTfl.g:1101:1: rule__Disruption__Group__4 : rule__Disruption__Group__4__Impl rule__Disruption__Group__5 ;
    public final void rule__Disruption__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1105:1: ( rule__Disruption__Group__4__Impl rule__Disruption__Group__5 )
            // InternalTfl.g:1106:2: rule__Disruption__Group__4__Impl rule__Disruption__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Disruption__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Disruption__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disruption__Group__4"


    // $ANTLR start "rule__Disruption__Group__4__Impl"
    // InternalTfl.g:1113:1: rule__Disruption__Group__4__Impl : ( 'at' ) ;
    public final void rule__Disruption__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1117:1: ( ( 'at' ) )
            // InternalTfl.g:1118:1: ( 'at' )
            {
            // InternalTfl.g:1118:1: ( 'at' )
            // InternalTfl.g:1119:2: 'at'
            {
             before(grammarAccess.getDisruptionAccess().getAtKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDisruptionAccess().getAtKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disruption__Group__4__Impl"


    // $ANTLR start "rule__Disruption__Group__5"
    // InternalTfl.g:1128:1: rule__Disruption__Group__5 : rule__Disruption__Group__5__Impl rule__Disruption__Group__6 ;
    public final void rule__Disruption__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1132:1: ( rule__Disruption__Group__5__Impl rule__Disruption__Group__6 )
            // InternalTfl.g:1133:2: rule__Disruption__Group__5__Impl rule__Disruption__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__Disruption__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Disruption__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disruption__Group__5"


    // $ANTLR start "rule__Disruption__Group__5__Impl"
    // InternalTfl.g:1140:1: rule__Disruption__Group__5__Impl : ( ( rule__Disruption__StopAssignment_5 ) ) ;
    public final void rule__Disruption__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1144:1: ( ( ( rule__Disruption__StopAssignment_5 ) ) )
            // InternalTfl.g:1145:1: ( ( rule__Disruption__StopAssignment_5 ) )
            {
            // InternalTfl.g:1145:1: ( ( rule__Disruption__StopAssignment_5 ) )
            // InternalTfl.g:1146:2: ( rule__Disruption__StopAssignment_5 )
            {
             before(grammarAccess.getDisruptionAccess().getStopAssignment_5()); 
            // InternalTfl.g:1147:2: ( rule__Disruption__StopAssignment_5 )
            // InternalTfl.g:1147:3: rule__Disruption__StopAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Disruption__StopAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDisruptionAccess().getStopAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disruption__Group__5__Impl"


    // $ANTLR start "rule__Disruption__Group__6"
    // InternalTfl.g:1155:1: rule__Disruption__Group__6 : rule__Disruption__Group__6__Impl rule__Disruption__Group__7 ;
    public final void rule__Disruption__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1159:1: ( rule__Disruption__Group__6__Impl rule__Disruption__Group__7 )
            // InternalTfl.g:1160:2: rule__Disruption__Group__6__Impl rule__Disruption__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Disruption__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Disruption__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disruption__Group__6"


    // $ANTLR start "rule__Disruption__Group__6__Impl"
    // InternalTfl.g:1167:1: rule__Disruption__Group__6__Impl : ( 'duration' ) ;
    public final void rule__Disruption__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1171:1: ( ( 'duration' ) )
            // InternalTfl.g:1172:1: ( 'duration' )
            {
            // InternalTfl.g:1172:1: ( 'duration' )
            // InternalTfl.g:1173:2: 'duration'
            {
             before(grammarAccess.getDisruptionAccess().getDurationKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDisruptionAccess().getDurationKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disruption__Group__6__Impl"


    // $ANTLR start "rule__Disruption__Group__7"
    // InternalTfl.g:1182:1: rule__Disruption__Group__7 : rule__Disruption__Group__7__Impl rule__Disruption__Group__8 ;
    public final void rule__Disruption__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1186:1: ( rule__Disruption__Group__7__Impl rule__Disruption__Group__8 )
            // InternalTfl.g:1187:2: rule__Disruption__Group__7__Impl rule__Disruption__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__Disruption__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Disruption__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disruption__Group__7"


    // $ANTLR start "rule__Disruption__Group__7__Impl"
    // InternalTfl.g:1194:1: rule__Disruption__Group__7__Impl : ( ( rule__Disruption__DurationAssignment_7 ) ) ;
    public final void rule__Disruption__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1198:1: ( ( ( rule__Disruption__DurationAssignment_7 ) ) )
            // InternalTfl.g:1199:1: ( ( rule__Disruption__DurationAssignment_7 ) )
            {
            // InternalTfl.g:1199:1: ( ( rule__Disruption__DurationAssignment_7 ) )
            // InternalTfl.g:1200:2: ( rule__Disruption__DurationAssignment_7 )
            {
             before(grammarAccess.getDisruptionAccess().getDurationAssignment_7()); 
            // InternalTfl.g:1201:2: ( rule__Disruption__DurationAssignment_7 )
            // InternalTfl.g:1201:3: rule__Disruption__DurationAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Disruption__DurationAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDisruptionAccess().getDurationAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disruption__Group__7__Impl"


    // $ANTLR start "rule__Disruption__Group__8"
    // InternalTfl.g:1209:1: rule__Disruption__Group__8 : rule__Disruption__Group__8__Impl ;
    public final void rule__Disruption__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1213:1: ( rule__Disruption__Group__8__Impl )
            // InternalTfl.g:1214:2: rule__Disruption__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Disruption__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disruption__Group__8"


    // $ANTLR start "rule__Disruption__Group__8__Impl"
    // InternalTfl.g:1220:1: rule__Disruption__Group__8__Impl : ( 'min' ) ;
    public final void rule__Disruption__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1224:1: ( ( 'min' ) )
            // InternalTfl.g:1225:1: ( 'min' )
            {
            // InternalTfl.g:1225:1: ( 'min' )
            // InternalTfl.g:1226:2: 'min'
            {
             before(grammarAccess.getDisruptionAccess().getMinKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDisruptionAccess().getMinKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disruption__Group__8__Impl"


    // $ANTLR start "rule__REAL__Group__0"
    // InternalTfl.g:1236:1: rule__REAL__Group__0 : rule__REAL__Group__0__Impl rule__REAL__Group__1 ;
    public final void rule__REAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1240:1: ( rule__REAL__Group__0__Impl rule__REAL__Group__1 )
            // InternalTfl.g:1241:2: rule__REAL__Group__0__Impl rule__REAL__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__REAL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REAL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__0"


    // $ANTLR start "rule__REAL__Group__0__Impl"
    // InternalTfl.g:1248:1: rule__REAL__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__REAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1252:1: ( ( ( RULE_INT )? ) )
            // InternalTfl.g:1253:1: ( ( RULE_INT )? )
            {
            // InternalTfl.g:1253:1: ( ( RULE_INT )? )
            // InternalTfl.g:1254:2: ( RULE_INT )?
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
            // InternalTfl.g:1255:2: ( RULE_INT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTfl.g:1255:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__0__Impl"


    // $ANTLR start "rule__REAL__Group__1"
    // InternalTfl.g:1263:1: rule__REAL__Group__1 : rule__REAL__Group__1__Impl rule__REAL__Group__2 ;
    public final void rule__REAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1267:1: ( rule__REAL__Group__1__Impl rule__REAL__Group__2 )
            // InternalTfl.g:1268:2: rule__REAL__Group__1__Impl rule__REAL__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__REAL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REAL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__1"


    // $ANTLR start "rule__REAL__Group__1__Impl"
    // InternalTfl.g:1275:1: rule__REAL__Group__1__Impl : ( '.' ) ;
    public final void rule__REAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1279:1: ( ( '.' ) )
            // InternalTfl.g:1280:1: ( '.' )
            {
            // InternalTfl.g:1280:1: ( '.' )
            // InternalTfl.g:1281:2: '.'
            {
             before(grammarAccess.getREALAccess().getFullStopKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getREALAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__1__Impl"


    // $ANTLR start "rule__REAL__Group__2"
    // InternalTfl.g:1290:1: rule__REAL__Group__2 : rule__REAL__Group__2__Impl ;
    public final void rule__REAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1294:1: ( rule__REAL__Group__2__Impl )
            // InternalTfl.g:1295:2: rule__REAL__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__REAL__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__2"


    // $ANTLR start "rule__REAL__Group__2__Impl"
    // InternalTfl.g:1301:1: rule__REAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1305:1: ( ( RULE_INT ) )
            // InternalTfl.g:1306:1: ( RULE_INT )
            {
            // InternalTfl.g:1306:1: ( RULE_INT )
            // InternalTfl.g:1307:2: RULE_INT
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__2__Impl"


    // $ANTLR start "rule__TflSystem__StopsAssignment_0"
    // InternalTfl.g:1317:1: rule__TflSystem__StopsAssignment_0 : ( ruleStop ) ;
    public final void rule__TflSystem__StopsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1321:1: ( ( ruleStop ) )
            // InternalTfl.g:1322:2: ( ruleStop )
            {
            // InternalTfl.g:1322:2: ( ruleStop )
            // InternalTfl.g:1323:3: ruleStop
            {
             before(grammarAccess.getTflSystemAccess().getStopsStopParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStop();

            state._fsp--;

             after(grammarAccess.getTflSystemAccess().getStopsStopParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TflSystem__StopsAssignment_0"


    // $ANTLR start "rule__TflSystem__TransportsAssignment_1"
    // InternalTfl.g:1332:1: rule__TflSystem__TransportsAssignment_1 : ( ruleTransport ) ;
    public final void rule__TflSystem__TransportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1336:1: ( ( ruleTransport ) )
            // InternalTfl.g:1337:2: ( ruleTransport )
            {
            // InternalTfl.g:1337:2: ( ruleTransport )
            // InternalTfl.g:1338:3: ruleTransport
            {
             before(grammarAccess.getTflSystemAccess().getTransportsTransportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransport();

            state._fsp--;

             after(grammarAccess.getTflSystemAccess().getTransportsTransportParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TflSystem__TransportsAssignment_1"


    // $ANTLR start "rule__TflSystem__DisruptionsAssignment_2"
    // InternalTfl.g:1347:1: rule__TflSystem__DisruptionsAssignment_2 : ( ruleDisruption ) ;
    public final void rule__TflSystem__DisruptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1351:1: ( ( ruleDisruption ) )
            // InternalTfl.g:1352:2: ( ruleDisruption )
            {
            // InternalTfl.g:1352:2: ( ruleDisruption )
            // InternalTfl.g:1353:3: ruleDisruption
            {
             before(grammarAccess.getTflSystemAccess().getDisruptionsDisruptionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDisruption();

            state._fsp--;

             after(grammarAccess.getTflSystemAccess().getDisruptionsDisruptionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TflSystem__DisruptionsAssignment_2"


    // $ANTLR start "rule__Stop__NameAssignment_1"
    // InternalTfl.g:1362:1: rule__Stop__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Stop__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1366:1: ( ( RULE_ID ) )
            // InternalTfl.g:1367:2: ( RULE_ID )
            {
            // InternalTfl.g:1367:2: ( RULE_ID )
            // InternalTfl.g:1368:3: RULE_ID
            {
             before(grammarAccess.getStopAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStopAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__NameAssignment_1"


    // $ANTLR start "rule__Transport__NameAssignment_1"
    // InternalTfl.g:1377:1: rule__Transport__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Transport__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1381:1: ( ( RULE_ID ) )
            // InternalTfl.g:1382:2: ( RULE_ID )
            {
            // InternalTfl.g:1382:2: ( RULE_ID )
            // InternalTfl.g:1383:3: RULE_ID
            {
             before(grammarAccess.getTransportAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransportAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__NameAssignment_1"


    // $ANTLR start "rule__Transport__CapacityAssignment_3"
    // InternalTfl.g:1392:1: rule__Transport__CapacityAssignment_3 : ( RULE_INT ) ;
    public final void rule__Transport__CapacityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1396:1: ( ( RULE_INT ) )
            // InternalTfl.g:1397:2: ( RULE_INT )
            {
            // InternalTfl.g:1397:2: ( RULE_INT )
            // InternalTfl.g:1398:3: RULE_INT
            {
             before(grammarAccess.getTransportAccess().getCapacityINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTransportAccess().getCapacityINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__CapacityAssignment_3"


    // $ANTLR start "rule__Transport__SpeedAssignment_5"
    // InternalTfl.g:1407:1: rule__Transport__SpeedAssignment_5 : ( ruleREAL ) ;
    public final void rule__Transport__SpeedAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1411:1: ( ( ruleREAL ) )
            // InternalTfl.g:1412:2: ( ruleREAL )
            {
            // InternalTfl.g:1412:2: ( ruleREAL )
            // InternalTfl.g:1413:3: ruleREAL
            {
             before(grammarAccess.getTransportAccess().getSpeedREALParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getTransportAccess().getSpeedREALParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__SpeedAssignment_5"


    // $ANTLR start "rule__Transport__RoutesAssignment_9"
    // InternalTfl.g:1422:1: rule__Transport__RoutesAssignment_9 : ( ruleRoute ) ;
    public final void rule__Transport__RoutesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1426:1: ( ( ruleRoute ) )
            // InternalTfl.g:1427:2: ( ruleRoute )
            {
            // InternalTfl.g:1427:2: ( ruleRoute )
            // InternalTfl.g:1428:3: ruleRoute
            {
             before(grammarAccess.getTransportAccess().getRoutesRouteParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleRoute();

            state._fsp--;

             after(grammarAccess.getTransportAccess().getRoutesRouteParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__RoutesAssignment_9"


    // $ANTLR start "rule__Transport__PeakAssignment_14"
    // InternalTfl.g:1437:1: rule__Transport__PeakAssignment_14 : ( RULE_INT ) ;
    public final void rule__Transport__PeakAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1441:1: ( ( RULE_INT ) )
            // InternalTfl.g:1442:2: ( RULE_INT )
            {
            // InternalTfl.g:1442:2: ( RULE_INT )
            // InternalTfl.g:1443:3: RULE_INT
            {
             before(grammarAccess.getTransportAccess().getPeakINTTerminalRuleCall_14_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTransportAccess().getPeakINTTerminalRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__PeakAssignment_14"


    // $ANTLR start "rule__Transport__NonPeakAssignment_16"
    // InternalTfl.g:1452:1: rule__Transport__NonPeakAssignment_16 : ( RULE_INT ) ;
    public final void rule__Transport__NonPeakAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1456:1: ( ( RULE_INT ) )
            // InternalTfl.g:1457:2: ( RULE_INT )
            {
            // InternalTfl.g:1457:2: ( RULE_INT )
            // InternalTfl.g:1458:3: RULE_INT
            {
             before(grammarAccess.getTransportAccess().getNonPeakINTTerminalRuleCall_16_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTransportAccess().getNonPeakINTTerminalRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transport__NonPeakAssignment_16"


    // $ANTLR start "rule__Route__StartAssignment_0"
    // InternalTfl.g:1467:1: rule__Route__StartAssignment_0 : ( RULE_ID ) ;
    public final void rule__Route__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1471:1: ( ( RULE_ID ) )
            // InternalTfl.g:1472:2: ( RULE_ID )
            {
            // InternalTfl.g:1472:2: ( RULE_ID )
            // InternalTfl.g:1473:3: RULE_ID
            {
             before(grammarAccess.getRouteAccess().getStartIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRouteAccess().getStartIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Route__StartAssignment_0"


    // $ANTLR start "rule__Route__EndAssignment_2"
    // InternalTfl.g:1482:1: rule__Route__EndAssignment_2 : ( RULE_ID ) ;
    public final void rule__Route__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1486:1: ( ( RULE_ID ) )
            // InternalTfl.g:1487:2: ( RULE_ID )
            {
            // InternalTfl.g:1487:2: ( RULE_ID )
            // InternalTfl.g:1488:3: RULE_ID
            {
             before(grammarAccess.getRouteAccess().getEndIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRouteAccess().getEndIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Route__EndAssignment_2"


    // $ANTLR start "rule__Route__DurationAssignment_4"
    // InternalTfl.g:1497:1: rule__Route__DurationAssignment_4 : ( RULE_INT ) ;
    public final void rule__Route__DurationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1501:1: ( ( RULE_INT ) )
            // InternalTfl.g:1502:2: ( RULE_INT )
            {
            // InternalTfl.g:1502:2: ( RULE_INT )
            // InternalTfl.g:1503:3: RULE_INT
            {
             before(grammarAccess.getRouteAccess().getDurationINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRouteAccess().getDurationINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Route__DurationAssignment_4"


    // $ANTLR start "rule__Disruption__NameAssignment_1"
    // InternalTfl.g:1512:1: rule__Disruption__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Disruption__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1516:1: ( ( RULE_ID ) )
            // InternalTfl.g:1517:2: ( RULE_ID )
            {
            // InternalTfl.g:1517:2: ( RULE_ID )
            // InternalTfl.g:1518:3: RULE_ID
            {
             before(grammarAccess.getDisruptionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDisruptionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disruption__NameAssignment_1"


    // $ANTLR start "rule__Disruption__TransportAssignment_3"
    // InternalTfl.g:1527:1: rule__Disruption__TransportAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Disruption__TransportAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1531:1: ( ( ( RULE_ID ) ) )
            // InternalTfl.g:1532:2: ( ( RULE_ID ) )
            {
            // InternalTfl.g:1532:2: ( ( RULE_ID ) )
            // InternalTfl.g:1533:3: ( RULE_ID )
            {
             before(grammarAccess.getDisruptionAccess().getTransportTransportCrossReference_3_0()); 
            // InternalTfl.g:1534:3: ( RULE_ID )
            // InternalTfl.g:1535:4: RULE_ID
            {
             before(grammarAccess.getDisruptionAccess().getTransportTransportIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDisruptionAccess().getTransportTransportIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDisruptionAccess().getTransportTransportCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disruption__TransportAssignment_3"


    // $ANTLR start "rule__Disruption__StopAssignment_5"
    // InternalTfl.g:1546:1: rule__Disruption__StopAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Disruption__StopAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1550:1: ( ( ( RULE_ID ) ) )
            // InternalTfl.g:1551:2: ( ( RULE_ID ) )
            {
            // InternalTfl.g:1551:2: ( ( RULE_ID ) )
            // InternalTfl.g:1552:3: ( RULE_ID )
            {
             before(grammarAccess.getDisruptionAccess().getStopStopCrossReference_5_0()); 
            // InternalTfl.g:1553:3: ( RULE_ID )
            // InternalTfl.g:1554:4: RULE_ID
            {
             before(grammarAccess.getDisruptionAccess().getStopStopIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDisruptionAccess().getStopStopIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getDisruptionAccess().getStopStopCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disruption__StopAssignment_5"


    // $ANTLR start "rule__Disruption__DurationAssignment_7"
    // InternalTfl.g:1565:1: rule__Disruption__DurationAssignment_7 : ( RULE_INT ) ;
    public final void rule__Disruption__DurationAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTfl.g:1569:1: ( ( RULE_INT ) )
            // InternalTfl.g:1570:2: ( RULE_INT )
            {
            // InternalTfl.g:1570:2: ( RULE_INT )
            // InternalTfl.g:1571:3: RULE_INT
            {
             before(grammarAccess.getDisruptionAccess().getDurationINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDisruptionAccess().getDurationINTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disruption__DurationAssignment_7"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});

}
package org.xtext.example.tfl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.tfl.services.TflGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTflParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'stop'", "'transport'", "'capacity'", "'speed'", "'kmph'", "'routes'", "'{'", "'}'", "'passengers'", "'peak'", "'nonpeak'", "'->'", "'in'", "'min'", "'disruption'", "'affects'", "'at'", "'duration'", "'.'"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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

        public InternalTflParser(TokenStream input, TflGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TflSystem";
       	}

       	@Override
       	protected TflGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTflSystem"
    // InternalTfl.g:64:1: entryRuleTflSystem returns [EObject current=null] : iv_ruleTflSystem= ruleTflSystem EOF ;
    public final EObject entryRuleTflSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTflSystem = null;


        try {
            // InternalTfl.g:64:50: (iv_ruleTflSystem= ruleTflSystem EOF )
            // InternalTfl.g:65:2: iv_ruleTflSystem= ruleTflSystem EOF
            {
             newCompositeNode(grammarAccess.getTflSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTflSystem=ruleTflSystem();

            state._fsp--;

             current =iv_ruleTflSystem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTflSystem"


    // $ANTLR start "ruleTflSystem"
    // InternalTfl.g:71:1: ruleTflSystem returns [EObject current=null] : ( ( (lv_stops_0_0= ruleStop ) )* ( (lv_transports_1_0= ruleTransport ) )* ( (lv_disruptions_2_0= ruleDisruption ) )* ) ;
    public final EObject ruleTflSystem() throws RecognitionException {
        EObject current = null;

        EObject lv_stops_0_0 = null;

        EObject lv_transports_1_0 = null;

        EObject lv_disruptions_2_0 = null;



        	enterRule();

        try {
            // InternalTfl.g:77:2: ( ( ( (lv_stops_0_0= ruleStop ) )* ( (lv_transports_1_0= ruleTransport ) )* ( (lv_disruptions_2_0= ruleDisruption ) )* ) )
            // InternalTfl.g:78:2: ( ( (lv_stops_0_0= ruleStop ) )* ( (lv_transports_1_0= ruleTransport ) )* ( (lv_disruptions_2_0= ruleDisruption ) )* )
            {
            // InternalTfl.g:78:2: ( ( (lv_stops_0_0= ruleStop ) )* ( (lv_transports_1_0= ruleTransport ) )* ( (lv_disruptions_2_0= ruleDisruption ) )* )
            // InternalTfl.g:79:3: ( (lv_stops_0_0= ruleStop ) )* ( (lv_transports_1_0= ruleTransport ) )* ( (lv_disruptions_2_0= ruleDisruption ) )*
            {
            // InternalTfl.g:79:3: ( (lv_stops_0_0= ruleStop ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTfl.g:80:4: (lv_stops_0_0= ruleStop )
            	    {
            	    // InternalTfl.g:80:4: (lv_stops_0_0= ruleStop )
            	    // InternalTfl.g:81:5: lv_stops_0_0= ruleStop
            	    {

            	    					newCompositeNode(grammarAccess.getTflSystemAccess().getStopsStopParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_stops_0_0=ruleStop();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTflSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"stops",
            	    						lv_stops_0_0,
            	    						"org.xtext.example.tfl.Tfl.Stop");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalTfl.g:98:3: ( (lv_transports_1_0= ruleTransport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTfl.g:99:4: (lv_transports_1_0= ruleTransport )
            	    {
            	    // InternalTfl.g:99:4: (lv_transports_1_0= ruleTransport )
            	    // InternalTfl.g:100:5: lv_transports_1_0= ruleTransport
            	    {

            	    					newCompositeNode(grammarAccess.getTflSystemAccess().getTransportsTransportParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_transports_1_0=ruleTransport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTflSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transports",
            	    						lv_transports_1_0,
            	    						"org.xtext.example.tfl.Tfl.Transport");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalTfl.g:117:3: ( (lv_disruptions_2_0= ruleDisruption ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTfl.g:118:4: (lv_disruptions_2_0= ruleDisruption )
            	    {
            	    // InternalTfl.g:118:4: (lv_disruptions_2_0= ruleDisruption )
            	    // InternalTfl.g:119:5: lv_disruptions_2_0= ruleDisruption
            	    {

            	    					newCompositeNode(grammarAccess.getTflSystemAccess().getDisruptionsDisruptionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_disruptions_2_0=ruleDisruption();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTflSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"disruptions",
            	    						lv_disruptions_2_0,
            	    						"org.xtext.example.tfl.Tfl.Disruption");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTflSystem"


    // $ANTLR start "entryRuleStop"
    // InternalTfl.g:140:1: entryRuleStop returns [EObject current=null] : iv_ruleStop= ruleStop EOF ;
    public final EObject entryRuleStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStop = null;


        try {
            // InternalTfl.g:140:45: (iv_ruleStop= ruleStop EOF )
            // InternalTfl.g:141:2: iv_ruleStop= ruleStop EOF
            {
             newCompositeNode(grammarAccess.getStopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStop=ruleStop();

            state._fsp--;

             current =iv_ruleStop; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStop"


    // $ANTLR start "ruleStop"
    // InternalTfl.g:147:1: ruleStop returns [EObject current=null] : (otherlv_0= 'stop' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleStop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalTfl.g:153:2: ( (otherlv_0= 'stop' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalTfl.g:154:2: (otherlv_0= 'stop' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalTfl.g:154:2: (otherlv_0= 'stop' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalTfl.g:155:3: otherlv_0= 'stop' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getStopAccess().getStopKeyword_0());
            		
            // InternalTfl.g:159:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTfl.g:160:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTfl.g:160:4: (lv_name_1_0= RULE_ID )
            // InternalTfl.g:161:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStopAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStop"


    // $ANTLR start "entryRuleTransport"
    // InternalTfl.g:181:1: entryRuleTransport returns [EObject current=null] : iv_ruleTransport= ruleTransport EOF ;
    public final EObject entryRuleTransport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransport = null;


        try {
            // InternalTfl.g:181:50: (iv_ruleTransport= ruleTransport EOF )
            // InternalTfl.g:182:2: iv_ruleTransport= ruleTransport EOF
            {
             newCompositeNode(grammarAccess.getTransportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransport=ruleTransport();

            state._fsp--;

             current =iv_ruleTransport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransport"


    // $ANTLR start "ruleTransport"
    // InternalTfl.g:188:1: ruleTransport returns [EObject current=null] : (otherlv_0= 'transport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'capacity' ( (lv_capacity_3_0= RULE_INT ) ) otherlv_4= 'speed' ( (lv_speed_5_0= ruleREAL ) ) otherlv_6= 'kmph' otherlv_7= 'routes' otherlv_8= '{' ( (lv_routes_9_0= ruleRoute ) )* otherlv_10= '}' otherlv_11= 'passengers' otherlv_12= '{' otherlv_13= 'peak' ( (lv_peak_14_0= RULE_INT ) ) otherlv_15= 'nonpeak' ( (lv_nonPeak_16_0= RULE_INT ) ) otherlv_17= '}' ) ;
    public final EObject ruleTransport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_capacity_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_peak_14_0=null;
        Token otherlv_15=null;
        Token lv_nonPeak_16_0=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_speed_5_0 = null;

        EObject lv_routes_9_0 = null;



        	enterRule();

        try {
            // InternalTfl.g:194:2: ( (otherlv_0= 'transport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'capacity' ( (lv_capacity_3_0= RULE_INT ) ) otherlv_4= 'speed' ( (lv_speed_5_0= ruleREAL ) ) otherlv_6= 'kmph' otherlv_7= 'routes' otherlv_8= '{' ( (lv_routes_9_0= ruleRoute ) )* otherlv_10= '}' otherlv_11= 'passengers' otherlv_12= '{' otherlv_13= 'peak' ( (lv_peak_14_0= RULE_INT ) ) otherlv_15= 'nonpeak' ( (lv_nonPeak_16_0= RULE_INT ) ) otherlv_17= '}' ) )
            // InternalTfl.g:195:2: (otherlv_0= 'transport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'capacity' ( (lv_capacity_3_0= RULE_INT ) ) otherlv_4= 'speed' ( (lv_speed_5_0= ruleREAL ) ) otherlv_6= 'kmph' otherlv_7= 'routes' otherlv_8= '{' ( (lv_routes_9_0= ruleRoute ) )* otherlv_10= '}' otherlv_11= 'passengers' otherlv_12= '{' otherlv_13= 'peak' ( (lv_peak_14_0= RULE_INT ) ) otherlv_15= 'nonpeak' ( (lv_nonPeak_16_0= RULE_INT ) ) otherlv_17= '}' )
            {
            // InternalTfl.g:195:2: (otherlv_0= 'transport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'capacity' ( (lv_capacity_3_0= RULE_INT ) ) otherlv_4= 'speed' ( (lv_speed_5_0= ruleREAL ) ) otherlv_6= 'kmph' otherlv_7= 'routes' otherlv_8= '{' ( (lv_routes_9_0= ruleRoute ) )* otherlv_10= '}' otherlv_11= 'passengers' otherlv_12= '{' otherlv_13= 'peak' ( (lv_peak_14_0= RULE_INT ) ) otherlv_15= 'nonpeak' ( (lv_nonPeak_16_0= RULE_INT ) ) otherlv_17= '}' )
            // InternalTfl.g:196:3: otherlv_0= 'transport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'capacity' ( (lv_capacity_3_0= RULE_INT ) ) otherlv_4= 'speed' ( (lv_speed_5_0= ruleREAL ) ) otherlv_6= 'kmph' otherlv_7= 'routes' otherlv_8= '{' ( (lv_routes_9_0= ruleRoute ) )* otherlv_10= '}' otherlv_11= 'passengers' otherlv_12= '{' otherlv_13= 'peak' ( (lv_peak_14_0= RULE_INT ) ) otherlv_15= 'nonpeak' ( (lv_nonPeak_16_0= RULE_INT ) ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTransportAccess().getTransportKeyword_0());
            		
            // InternalTfl.g:200:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTfl.g:201:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTfl.g:201:4: (lv_name_1_0= RULE_ID )
            // InternalTfl.g:202:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTransportAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getTransportAccess().getCapacityKeyword_2());
            		
            // InternalTfl.g:222:3: ( (lv_capacity_3_0= RULE_INT ) )
            // InternalTfl.g:223:4: (lv_capacity_3_0= RULE_INT )
            {
            // InternalTfl.g:223:4: (lv_capacity_3_0= RULE_INT )
            // InternalTfl.g:224:5: lv_capacity_3_0= RULE_INT
            {
            lv_capacity_3_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_capacity_3_0, grammarAccess.getTransportAccess().getCapacityINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"capacity",
            						lv_capacity_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getTransportAccess().getSpeedKeyword_4());
            		
            // InternalTfl.g:244:3: ( (lv_speed_5_0= ruleREAL ) )
            // InternalTfl.g:245:4: (lv_speed_5_0= ruleREAL )
            {
            // InternalTfl.g:245:4: (lv_speed_5_0= ruleREAL )
            // InternalTfl.g:246:5: lv_speed_5_0= ruleREAL
            {

            					newCompositeNode(grammarAccess.getTransportAccess().getSpeedREALParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_speed_5_0=ruleREAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransportRule());
            					}
            					set(
            						current,
            						"speed",
            						lv_speed_5_0,
            						"org.xtext.example.tfl.Tfl.REAL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getTransportAccess().getKmphKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getTransportAccess().getRoutesKeyword_7());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getTransportAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalTfl.g:275:3: ( (lv_routes_9_0= ruleRoute ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTfl.g:276:4: (lv_routes_9_0= ruleRoute )
            	    {
            	    // InternalTfl.g:276:4: (lv_routes_9_0= ruleRoute )
            	    // InternalTfl.g:277:5: lv_routes_9_0= ruleRoute
            	    {

            	    					newCompositeNode(grammarAccess.getTransportAccess().getRoutesRouteParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_routes_9_0=ruleRoute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTransportRule());
            	    					}
            	    					add(
            	    						current,
            	    						"routes",
            	    						lv_routes_9_0,
            	    						"org.xtext.example.tfl.Tfl.Route");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_10=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_10, grammarAccess.getTransportAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_11=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_11, grammarAccess.getTransportAccess().getPassengersKeyword_11());
            		
            otherlv_12=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_12, grammarAccess.getTransportAccess().getLeftCurlyBracketKeyword_12());
            		
            otherlv_13=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_13, grammarAccess.getTransportAccess().getPeakKeyword_13());
            		
            // InternalTfl.g:310:3: ( (lv_peak_14_0= RULE_INT ) )
            // InternalTfl.g:311:4: (lv_peak_14_0= RULE_INT )
            {
            // InternalTfl.g:311:4: (lv_peak_14_0= RULE_INT )
            // InternalTfl.g:312:5: lv_peak_14_0= RULE_INT
            {
            lv_peak_14_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_peak_14_0, grammarAccess.getTransportAccess().getPeakINTTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"peak",
            						lv_peak_14_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_15=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_15, grammarAccess.getTransportAccess().getNonpeakKeyword_15());
            		
            // InternalTfl.g:332:3: ( (lv_nonPeak_16_0= RULE_INT ) )
            // InternalTfl.g:333:4: (lv_nonPeak_16_0= RULE_INT )
            {
            // InternalTfl.g:333:4: (lv_nonPeak_16_0= RULE_INT )
            // InternalTfl.g:334:5: lv_nonPeak_16_0= RULE_INT
            {
            lv_nonPeak_16_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_nonPeak_16_0, grammarAccess.getTransportAccess().getNonPeakINTTerminalRuleCall_16_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nonPeak",
            						lv_nonPeak_16_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_17=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getTransportAccess().getRightCurlyBracketKeyword_17());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransport"


    // $ANTLR start "entryRuleRoute"
    // InternalTfl.g:358:1: entryRuleRoute returns [EObject current=null] : iv_ruleRoute= ruleRoute EOF ;
    public final EObject entryRuleRoute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoute = null;


        try {
            // InternalTfl.g:358:46: (iv_ruleRoute= ruleRoute EOF )
            // InternalTfl.g:359:2: iv_ruleRoute= ruleRoute EOF
            {
             newCompositeNode(grammarAccess.getRouteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoute=ruleRoute();

            state._fsp--;

             current =iv_ruleRoute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoute"


    // $ANTLR start "ruleRoute"
    // InternalTfl.g:365:1: ruleRoute returns [EObject current=null] : ( ( (lv_start_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_end_2_0= RULE_ID ) ) otherlv_3= 'in' ( (lv_duration_4_0= RULE_INT ) ) otherlv_5= 'min' ) ;
    public final EObject ruleRoute() throws RecognitionException {
        EObject current = null;

        Token lv_start_0_0=null;
        Token otherlv_1=null;
        Token lv_end_2_0=null;
        Token otherlv_3=null;
        Token lv_duration_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalTfl.g:371:2: ( ( ( (lv_start_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_end_2_0= RULE_ID ) ) otherlv_3= 'in' ( (lv_duration_4_0= RULE_INT ) ) otherlv_5= 'min' ) )
            // InternalTfl.g:372:2: ( ( (lv_start_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_end_2_0= RULE_ID ) ) otherlv_3= 'in' ( (lv_duration_4_0= RULE_INT ) ) otherlv_5= 'min' )
            {
            // InternalTfl.g:372:2: ( ( (lv_start_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_end_2_0= RULE_ID ) ) otherlv_3= 'in' ( (lv_duration_4_0= RULE_INT ) ) otherlv_5= 'min' )
            // InternalTfl.g:373:3: ( (lv_start_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_end_2_0= RULE_ID ) ) otherlv_3= 'in' ( (lv_duration_4_0= RULE_INT ) ) otherlv_5= 'min'
            {
            // InternalTfl.g:373:3: ( (lv_start_0_0= RULE_ID ) )
            // InternalTfl.g:374:4: (lv_start_0_0= RULE_ID )
            {
            // InternalTfl.g:374:4: (lv_start_0_0= RULE_ID )
            // InternalTfl.g:375:5: lv_start_0_0= RULE_ID
            {
            lv_start_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_start_0_0, grammarAccess.getRouteAccess().getStartIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRouteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getRouteAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalTfl.g:395:3: ( (lv_end_2_0= RULE_ID ) )
            // InternalTfl.g:396:4: (lv_end_2_0= RULE_ID )
            {
            // InternalTfl.g:396:4: (lv_end_2_0= RULE_ID )
            // InternalTfl.g:397:5: lv_end_2_0= RULE_ID
            {
            lv_end_2_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_end_2_0, grammarAccess.getRouteAccess().getEndIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRouteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getRouteAccess().getInKeyword_3());
            		
            // InternalTfl.g:417:3: ( (lv_duration_4_0= RULE_INT ) )
            // InternalTfl.g:418:4: (lv_duration_4_0= RULE_INT )
            {
            // InternalTfl.g:418:4: (lv_duration_4_0= RULE_INT )
            // InternalTfl.g:419:5: lv_duration_4_0= RULE_INT
            {
            lv_duration_4_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_duration_4_0, grammarAccess.getRouteAccess().getDurationINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRouteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"duration",
            						lv_duration_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRouteAccess().getMinKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoute"


    // $ANTLR start "entryRuleDisruption"
    // InternalTfl.g:443:1: entryRuleDisruption returns [EObject current=null] : iv_ruleDisruption= ruleDisruption EOF ;
    public final EObject entryRuleDisruption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisruption = null;


        try {
            // InternalTfl.g:443:51: (iv_ruleDisruption= ruleDisruption EOF )
            // InternalTfl.g:444:2: iv_ruleDisruption= ruleDisruption EOF
            {
             newCompositeNode(grammarAccess.getDisruptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisruption=ruleDisruption();

            state._fsp--;

             current =iv_ruleDisruption; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDisruption"


    // $ANTLR start "ruleDisruption"
    // InternalTfl.g:450:1: ruleDisruption returns [EObject current=null] : (otherlv_0= 'disruption' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'affects' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'at' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'duration' ( (lv_duration_7_0= RULE_INT ) ) otherlv_8= 'min' ) ;
    public final EObject ruleDisruption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_duration_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalTfl.g:456:2: ( (otherlv_0= 'disruption' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'affects' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'at' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'duration' ( (lv_duration_7_0= RULE_INT ) ) otherlv_8= 'min' ) )
            // InternalTfl.g:457:2: (otherlv_0= 'disruption' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'affects' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'at' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'duration' ( (lv_duration_7_0= RULE_INT ) ) otherlv_8= 'min' )
            {
            // InternalTfl.g:457:2: (otherlv_0= 'disruption' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'affects' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'at' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'duration' ( (lv_duration_7_0= RULE_INT ) ) otherlv_8= 'min' )
            // InternalTfl.g:458:3: otherlv_0= 'disruption' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'affects' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'at' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'duration' ( (lv_duration_7_0= RULE_INT ) ) otherlv_8= 'min'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDisruptionAccess().getDisruptionKeyword_0());
            		
            // InternalTfl.g:462:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTfl.g:463:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTfl.g:463:4: (lv_name_1_0= RULE_ID )
            // InternalTfl.g:464:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDisruptionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDisruptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDisruptionAccess().getAffectsKeyword_2());
            		
            // InternalTfl.g:484:3: ( (otherlv_3= RULE_ID ) )
            // InternalTfl.g:485:4: (otherlv_3= RULE_ID )
            {
            // InternalTfl.g:485:4: (otherlv_3= RULE_ID )
            // InternalTfl.g:486:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDisruptionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_3, grammarAccess.getDisruptionAccess().getTransportTransportCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getDisruptionAccess().getAtKeyword_4());
            		
            // InternalTfl.g:501:3: ( (otherlv_5= RULE_ID ) )
            // InternalTfl.g:502:4: (otherlv_5= RULE_ID )
            {
            // InternalTfl.g:502:4: (otherlv_5= RULE_ID )
            // InternalTfl.g:503:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDisruptionRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_5, grammarAccess.getDisruptionAccess().getStopStopCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getDisruptionAccess().getDurationKeyword_6());
            		
            // InternalTfl.g:518:3: ( (lv_duration_7_0= RULE_INT ) )
            // InternalTfl.g:519:4: (lv_duration_7_0= RULE_INT )
            {
            // InternalTfl.g:519:4: (lv_duration_7_0= RULE_INT )
            // InternalTfl.g:520:5: lv_duration_7_0= RULE_INT
            {
            lv_duration_7_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_duration_7_0, grammarAccess.getDisruptionAccess().getDurationINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDisruptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"duration",
            						lv_duration_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDisruptionAccess().getMinKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDisruption"


    // $ANTLR start "entryRuleREAL"
    // InternalTfl.g:544:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTfl.g:546:2: (iv_ruleREAL= ruleREAL EOF )
            // InternalTfl.g:547:2: iv_ruleREAL= ruleREAL EOF
            {
             newCompositeNode(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleREAL=ruleREAL();

            state._fsp--;

             current =iv_ruleREAL.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalTfl.g:556:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTfl.g:563:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // InternalTfl.g:564:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // InternalTfl.g:564:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // InternalTfl.g:565:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // InternalTfl.g:565:3: (this_INT_0= RULE_INT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTfl.g:566:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_25); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,29,FOLLOW_8); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getREALAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleREAL"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});

}
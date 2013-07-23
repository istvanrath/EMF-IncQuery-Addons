package hu.bme.mit.incquery.vedl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hu.bme.mit.incquery.vedl.services.EdlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEdlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'.'", "'.*'", "'uses-incquery-patterns'", "'uses-eventsources'", "'EventModel'", "'{'", "'}'", "'AtomicEvent'", "'()'", "'id'", "':'", "'source'", "'parameterFilters'", "'IQPatternEvent'", "'IQPatternRef'", "'ChangeType'", "'ComplexEvent'", "'('", "')'", "'@Context'", "'@SamplingTime'", "'@Priority'", "'in'", "','", "']'", "'['", "'<'", "'=<'", "'=='", "'!='", "'>='", "'>'", "'contains'", "'startsWith'", "'endsWith'", "'not'", "'->'", "'-['", "']->'", "'FOUND'", "'LOST'", "'Chronicle'", "'Recent'", "'Unrestricted'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=4;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalEdlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEdlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEdlParser.tokenNames; }
    public String getGrammarFileName() { return "../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g"; }



     	private EdlGrammarAccess grammarAccess;
     	
        public InternalEdlParser(TokenStream input, EdlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "PackageDeclaration";	
       	}
       	
       	@Override
       	protected EdlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePackageDeclaration"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:68:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:69:2: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:70:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration75);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;

             current =iv_rulePackageDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration85); 

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
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:77:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_usages_2_0= ruleUsage ) )* ( (lv_model_3_0= ruleModel ) ) ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_usages_2_0 = null;

        EObject lv_model_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:80:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_usages_2_0= ruleUsage ) )* ( (lv_model_3_0= ruleModel ) ) ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:81:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_usages_2_0= ruleUsage ) )* ( (lv_model_3_0= ruleModel ) ) )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:81:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_usages_2_0= ruleUsage ) )* ( (lv_model_3_0= ruleModel ) ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:81:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_usages_2_0= ruleUsage ) )* ( (lv_model_3_0= ruleModel ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePackageDeclaration122); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:85:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:86:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:86:1: (lv_name_1_0= ruleQualifiedName )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:87:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageDeclaration143);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:103:2: ( (lv_usages_2_0= ruleUsage ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=15)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:104:1: (lv_usages_2_0= ruleUsage )
            	    {
            	    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:104:1: (lv_usages_2_0= ruleUsage )
            	    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:105:3: lv_usages_2_0= ruleUsage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getUsagesUsageParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUsage_in_rulePackageDeclaration164);
            	    lv_usages_2_0=ruleUsage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"usages",
            	            		lv_usages_2_0, 
            	            		"Usage");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:121:3: ( (lv_model_3_0= ruleModel ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:122:1: (lv_model_3_0= ruleModel )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:122:1: (lv_model_3_0= ruleModel )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:123:3: lv_model_3_0= ruleModel
            {
             
            	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getModelModelParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleModel_in_rulePackageDeclaration186);
            lv_model_3_0=ruleModel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"model",
                    		lv_model_3_0, 
                    		"Model");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleDOUBLE"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:147:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:148:2: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:149:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE223);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOUBLE234); 

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
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:156:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:159:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:160:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:160:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:160:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE274); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:167:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:168:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleDOUBLE293); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0()); 
                        
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE308); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "entryRuleQualifiedName"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:188:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:189:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:190:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName356);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName367); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:197:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:200:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:201:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:201:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:201:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName407); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:208:1: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:209:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,12,FOLLOW_12_in_ruleQualifiedName426); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName441); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:229:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:230:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:231:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard489);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard500); 

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:238:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:241:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:242:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:242:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:243:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard547);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:253:1: (kw= '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:254:2: kw= '.*'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleQualifiedNameWithWildcard566); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleUsage"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:267:1: entryRuleUsage returns [EObject current=null] : iv_ruleUsage= ruleUsage EOF ;
    public final EObject entryRuleUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsage = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:268:2: (iv_ruleUsage= ruleUsage EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:269:2: iv_ruleUsage= ruleUsage EOF
            {
             newCompositeNode(grammarAccess.getUsageRule()); 
            pushFollow(FOLLOW_ruleUsage_in_entryRuleUsage608);
            iv_ruleUsage=ruleUsage();

            state._fsp--;

             current =iv_ruleUsage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsage618); 

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
    // $ANTLR end "entryRuleUsage"


    // $ANTLR start "ruleUsage"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:276:1: ruleUsage returns [EObject current=null] : (this_IQUsage_0= ruleIQUsage | this_EventSourceUsage_1= ruleEventSourceUsage ) ;
    public final EObject ruleUsage() throws RecognitionException {
        EObject current = null;

        EObject this_IQUsage_0 = null;

        EObject this_EventSourceUsage_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:279:28: ( (this_IQUsage_0= ruleIQUsage | this_EventSourceUsage_1= ruleEventSourceUsage ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:280:1: (this_IQUsage_0= ruleIQUsage | this_EventSourceUsage_1= ruleEventSourceUsage )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:280:1: (this_IQUsage_0= ruleIQUsage | this_EventSourceUsage_1= ruleEventSourceUsage )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:281:5: this_IQUsage_0= ruleIQUsage
                    {
                     
                            newCompositeNode(grammarAccess.getUsageAccess().getIQUsageParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIQUsage_in_ruleUsage665);
                    this_IQUsage_0=ruleIQUsage();

                    state._fsp--;

                     
                            current = this_IQUsage_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:291:5: this_EventSourceUsage_1= ruleEventSourceUsage
                    {
                     
                            newCompositeNode(grammarAccess.getUsageAccess().getEventSourceUsageParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEventSourceUsage_in_ruleUsage692);
                    this_EventSourceUsage_1=ruleEventSourceUsage();

                    state._fsp--;

                     
                            current = this_EventSourceUsage_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleUsage"


    // $ANTLR start "entryRuleIQUsage"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:307:1: entryRuleIQUsage returns [EObject current=null] : iv_ruleIQUsage= ruleIQUsage EOF ;
    public final EObject entryRuleIQUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIQUsage = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:308:2: (iv_ruleIQUsage= ruleIQUsage EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:309:2: iv_ruleIQUsage= ruleIQUsage EOF
            {
             newCompositeNode(grammarAccess.getIQUsageRule()); 
            pushFollow(FOLLOW_ruleIQUsage_in_entryRuleIQUsage727);
            iv_ruleIQUsage=ruleIQUsage();

            state._fsp--;

             current =iv_ruleIQUsage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIQUsage737); 

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
    // $ANTLR end "entryRuleIQUsage"


    // $ANTLR start "ruleIQUsage"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:316:1: ruleIQUsage returns [EObject current=null] : (otherlv_0= 'uses-incquery-patterns' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleIQUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:319:28: ( (otherlv_0= 'uses-incquery-patterns' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:320:1: (otherlv_0= 'uses-incquery-patterns' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:320:1: (otherlv_0= 'uses-incquery-patterns' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:320:3: otherlv_0= 'uses-incquery-patterns' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleIQUsage774); 

                	newLeafNode(otherlv_0, grammarAccess.getIQUsageAccess().getUsesIncqueryPatternsKeyword_0());
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:324:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:325:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:325:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:326:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getIQUsageAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleIQUsage795);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIQUsageRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"QualifiedNameWithWildcard");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleIQUsage"


    // $ANTLR start "entryRuleEventSourceUsage"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:350:1: entryRuleEventSourceUsage returns [EObject current=null] : iv_ruleEventSourceUsage= ruleEventSourceUsage EOF ;
    public final EObject entryRuleEventSourceUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSourceUsage = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:351:2: (iv_ruleEventSourceUsage= ruleEventSourceUsage EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:352:2: iv_ruleEventSourceUsage= ruleEventSourceUsage EOF
            {
             newCompositeNode(grammarAccess.getEventSourceUsageRule()); 
            pushFollow(FOLLOW_ruleEventSourceUsage_in_entryRuleEventSourceUsage831);
            iv_ruleEventSourceUsage=ruleEventSourceUsage();

            state._fsp--;

             current =iv_ruleEventSourceUsage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventSourceUsage841); 

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
    // $ANTLR end "entryRuleEventSourceUsage"


    // $ANTLR start "ruleEventSourceUsage"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:359:1: ruleEventSourceUsage returns [EObject current=null] : (otherlv_0= 'uses-eventsources' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleEventSourceUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:362:28: ( (otherlv_0= 'uses-eventsources' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:363:1: (otherlv_0= 'uses-eventsources' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:363:1: (otherlv_0= 'uses-eventsources' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:363:3: otherlv_0= 'uses-eventsources' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleEventSourceUsage878); 

                	newLeafNode(otherlv_0, grammarAccess.getEventSourceUsageAccess().getUsesEventsourcesKeyword_0());
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:367:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:368:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:368:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:369:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getEventSourceUsageAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleEventSourceUsage899);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEventSourceUsageRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"QualifiedNameWithWildcard");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleEventSourceUsage"


    // $ANTLR start "entryRuleModel"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:393:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:397:2: (iv_ruleModel= ruleModel EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:398:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel941);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel951); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:408:1: ruleModel returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotations ) )* otherlv_1= 'EventModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_events_4_0= ruleEvent ) )* otherlv_5= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_events_4_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:412:28: ( ( ( (lv_annotations_0_0= ruleAnnotations ) )* otherlv_1= 'EventModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_events_4_0= ruleEvent ) )* otherlv_5= '}' ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:413:1: ( ( (lv_annotations_0_0= ruleAnnotations ) )* otherlv_1= 'EventModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_events_4_0= ruleEvent ) )* otherlv_5= '}' )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:413:1: ( ( (lv_annotations_0_0= ruleAnnotations ) )* otherlv_1= 'EventModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_events_4_0= ruleEvent ) )* otherlv_5= '}' )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:413:2: ( (lv_annotations_0_0= ruleAnnotations ) )* otherlv_1= 'EventModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_events_4_0= ruleEvent ) )* otherlv_5= '}'
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:413:2: ( (lv_annotations_0_0= ruleAnnotations ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=31 && LA6_0<=33)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:414:1: (lv_annotations_0_0= ruleAnnotations )
            	    {
            	    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:414:1: (lv_annotations_0_0= ruleAnnotations )
            	    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:415:3: lv_annotations_0_0= ruleAnnotations
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getAnnotationsAnnotationsParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotations_in_ruleModel1001);
            	    lv_annotations_0_0=ruleAnnotations();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_0_0, 
            	            		"Annotations");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleModel1014); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getEventModelKeyword_1());
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:435:1: ( (lv_name_2_0= RULE_ID ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:436:1: (lv_name_2_0= RULE_ID )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:436:1: (lv_name_2_0= RULE_ID )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:437:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModel1031); 

            			newLeafNode(lv_name_2_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleModel1048); 

                	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3());
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:457:1: ( (lv_events_4_0= ruleEvent ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19||LA7_0==25||LA7_0==28||(LA7_0>=31 && LA7_0<=33)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:458:1: (lv_events_4_0= ruleEvent )
            	    {
            	    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:458:1: (lv_events_4_0= ruleEvent )
            	    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:459:3: lv_events_4_0= ruleEvent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getEventsEventParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvent_in_ruleModel1069);
            	    lv_events_4_0=ruleEvent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"events",
            	            		lv_events_4_0, 
            	            		"Event");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleModel1082); 

                	newLeafNode(otherlv_5, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEvent"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:490:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:491:2: (iv_ruleEvent= ruleEvent EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:492:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent1122);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent1132); 

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:499:1: ruleEvent returns [EObject current=null] : (this_AbstractAtomicEvent_0= ruleAbstractAtomicEvent | this_ComplexEvent_1= ruleComplexEvent ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        EObject this_AbstractAtomicEvent_0 = null;

        EObject this_ComplexEvent_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:502:28: ( (this_AbstractAtomicEvent_0= ruleAbstractAtomicEvent | this_ComplexEvent_1= ruleComplexEvent ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:503:1: (this_AbstractAtomicEvent_0= ruleAbstractAtomicEvent | this_ComplexEvent_1= ruleComplexEvent )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:503:1: (this_AbstractAtomicEvent_0= ruleAbstractAtomicEvent | this_ComplexEvent_1= ruleComplexEvent )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:504:5: this_AbstractAtomicEvent_0= ruleAbstractAtomicEvent
                    {
                     
                            newCompositeNode(grammarAccess.getEventAccess().getAbstractAtomicEventParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAbstractAtomicEvent_in_ruleEvent1179);
                    this_AbstractAtomicEvent_0=ruleAbstractAtomicEvent();

                    state._fsp--;

                     
                            current = this_AbstractAtomicEvent_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:514:5: this_ComplexEvent_1= ruleComplexEvent
                    {
                     
                            newCompositeNode(grammarAccess.getEventAccess().getComplexEventParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleComplexEvent_in_ruleEvent1206);
                    this_ComplexEvent_1=ruleComplexEvent();

                    state._fsp--;

                     
                            current = this_ComplexEvent_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleAbstractAtomicEvent"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:530:1: entryRuleAbstractAtomicEvent returns [EObject current=null] : iv_ruleAbstractAtomicEvent= ruleAbstractAtomicEvent EOF ;
    public final EObject entryRuleAbstractAtomicEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractAtomicEvent = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:531:2: (iv_ruleAbstractAtomicEvent= ruleAbstractAtomicEvent EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:532:2: iv_ruleAbstractAtomicEvent= ruleAbstractAtomicEvent EOF
            {
             newCompositeNode(grammarAccess.getAbstractAtomicEventRule()); 
            pushFollow(FOLLOW_ruleAbstractAtomicEvent_in_entryRuleAbstractAtomicEvent1241);
            iv_ruleAbstractAtomicEvent=ruleAbstractAtomicEvent();

            state._fsp--;

             current =iv_ruleAbstractAtomicEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractAtomicEvent1251); 

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
    // $ANTLR end "entryRuleAbstractAtomicEvent"


    // $ANTLR start "ruleAbstractAtomicEvent"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:539:1: ruleAbstractAtomicEvent returns [EObject current=null] : (this_AtomicEvent_0= ruleAtomicEvent | this_IQPatternEvent_1= ruleIQPatternEvent ) ;
    public final EObject ruleAbstractAtomicEvent() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicEvent_0 = null;

        EObject this_IQPatternEvent_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:542:28: ( (this_AtomicEvent_0= ruleAtomicEvent | this_IQPatternEvent_1= ruleIQPatternEvent ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:543:1: (this_AtomicEvent_0= ruleAtomicEvent | this_IQPatternEvent_1= ruleIQPatternEvent )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:543:1: (this_AtomicEvent_0= ruleAtomicEvent | this_IQPatternEvent_1= ruleIQPatternEvent )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19||(LA9_0>=31 && LA9_0<=33)) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:544:5: this_AtomicEvent_0= ruleAtomicEvent
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractAtomicEventAccess().getAtomicEventParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAtomicEvent_in_ruleAbstractAtomicEvent1298);
                    this_AtomicEvent_0=ruleAtomicEvent();

                    state._fsp--;

                     
                            current = this_AtomicEvent_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:554:5: this_IQPatternEvent_1= ruleIQPatternEvent
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractAtomicEventAccess().getIQPatternEventParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIQPatternEvent_in_ruleAbstractAtomicEvent1325);
                    this_IQPatternEvent_1=ruleIQPatternEvent();

                    state._fsp--;

                     
                            current = this_IQPatternEvent_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleAbstractAtomicEvent"


    // $ANTLR start "entryRuleAtomicEvent"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:570:1: entryRuleAtomicEvent returns [EObject current=null] : iv_ruleAtomicEvent= ruleAtomicEvent EOF ;
    public final EObject entryRuleAtomicEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicEvent = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:571:2: (iv_ruleAtomicEvent= ruleAtomicEvent EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:572:2: iv_ruleAtomicEvent= ruleAtomicEvent EOF
            {
             newCompositeNode(grammarAccess.getAtomicEventRule()); 
            pushFollow(FOLLOW_ruleAtomicEvent_in_entryRuleAtomicEvent1360);
            iv_ruleAtomicEvent=ruleAtomicEvent();

            state._fsp--;

             current =iv_ruleAtomicEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicEvent1370); 

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
    // $ANTLR end "entryRuleAtomicEvent"


    // $ANTLR start "ruleAtomicEvent"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:579:1: ruleAtomicEvent returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotations ) )* otherlv_1= 'AtomicEvent' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '()' otherlv_4= '{' otherlv_5= 'id' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= 'source' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'parameterFilters' otherlv_12= '{' ( (lv_parameterFilters_13_0= ruleParameterFilter ) )+ otherlv_14= '}' otherlv_15= '}' ) ;
    public final EObject ruleAtomicEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_id_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_parameterFilters_13_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:582:28: ( ( ( (lv_annotations_0_0= ruleAnnotations ) )* otherlv_1= 'AtomicEvent' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '()' otherlv_4= '{' otherlv_5= 'id' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= 'source' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'parameterFilters' otherlv_12= '{' ( (lv_parameterFilters_13_0= ruleParameterFilter ) )+ otherlv_14= '}' otherlv_15= '}' ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:583:1: ( ( (lv_annotations_0_0= ruleAnnotations ) )* otherlv_1= 'AtomicEvent' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '()' otherlv_4= '{' otherlv_5= 'id' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= 'source' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'parameterFilters' otherlv_12= '{' ( (lv_parameterFilters_13_0= ruleParameterFilter ) )+ otherlv_14= '}' otherlv_15= '}' )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:583:1: ( ( (lv_annotations_0_0= ruleAnnotations ) )* otherlv_1= 'AtomicEvent' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '()' otherlv_4= '{' otherlv_5= 'id' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= 'source' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'parameterFilters' otherlv_12= '{' ( (lv_parameterFilters_13_0= ruleParameterFilter ) )+ otherlv_14= '}' otherlv_15= '}' )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:583:2: ( (lv_annotations_0_0= ruleAnnotations ) )* otherlv_1= 'AtomicEvent' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '()' otherlv_4= '{' otherlv_5= 'id' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= 'source' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'parameterFilters' otherlv_12= '{' ( (lv_parameterFilters_13_0= ruleParameterFilter ) )+ otherlv_14= '}' otherlv_15= '}'
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:583:2: ( (lv_annotations_0_0= ruleAnnotations ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=31 && LA10_0<=33)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:584:1: (lv_annotations_0_0= ruleAnnotations )
            	    {
            	    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:584:1: (lv_annotations_0_0= ruleAnnotations )
            	    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:585:3: lv_annotations_0_0= ruleAnnotations
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAtomicEventAccess().getAnnotationsAnnotationsParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotations_in_ruleAtomicEvent1416);
            	    lv_annotations_0_0=ruleAnnotations();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAtomicEventRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_0_0, 
            	            		"Annotations");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleAtomicEvent1429); 

                	newLeafNode(otherlv_1, grammarAccess.getAtomicEventAccess().getAtomicEventKeyword_1());
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:605:1: ( (lv_name_2_0= RULE_ID ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:606:1: (lv_name_2_0= RULE_ID )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:606:1: (lv_name_2_0= RULE_ID )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:607:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicEvent1446); 

            			newLeafNode(lv_name_2_0, grammarAccess.getAtomicEventAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAtomicEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleAtomicEvent1463); 

                	newLeafNode(otherlv_3, grammarAccess.getAtomicEventAccess().getLeftParenthesisRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleAtomicEvent1475); 

                	newLeafNode(otherlv_4, grammarAccess.getAtomicEventAccess().getLeftCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleAtomicEvent1487); 

                	newLeafNode(otherlv_5, grammarAccess.getAtomicEventAccess().getIdKeyword_5());
                
            otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleAtomicEvent1499); 

                	newLeafNode(otherlv_6, grammarAccess.getAtomicEventAccess().getColonKeyword_6());
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:639:1: ( (lv_id_7_0= RULE_STRING ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:640:1: (lv_id_7_0= RULE_STRING )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:640:1: (lv_id_7_0= RULE_STRING )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:641:3: lv_id_7_0= RULE_STRING
            {
            lv_id_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtomicEvent1516); 

            			newLeafNode(lv_id_7_0, grammarAccess.getAtomicEventAccess().getIdSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAtomicEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleAtomicEvent1533); 

                	newLeafNode(otherlv_8, grammarAccess.getAtomicEventAccess().getSourceKeyword_8());
                
            otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleAtomicEvent1545); 

                	newLeafNode(otherlv_9, grammarAccess.getAtomicEventAccess().getColonKeyword_9());
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:665:1: ( (otherlv_10= RULE_ID ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:666:1: (otherlv_10= RULE_ID )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:666:1: (otherlv_10= RULE_ID )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:667:3: otherlv_10= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAtomicEventRule());
            	        }
                    
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicEvent1565); 

            		newLeafNode(otherlv_10, grammarAccess.getAtomicEventAccess().getSourceSourceCrossReference_10_0()); 
            	

            }


            }

            otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleAtomicEvent1577); 

                	newLeafNode(otherlv_11, grammarAccess.getAtomicEventAccess().getParameterFiltersKeyword_11());
                
            otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleAtomicEvent1589); 

                	newLeafNode(otherlv_12, grammarAccess.getAtomicEventAccess().getLeftCurlyBracketKeyword_12());
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:686:1: ( (lv_parameterFilters_13_0= ruleParameterFilter ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:687:1: (lv_parameterFilters_13_0= ruleParameterFilter )
            	    {
            	    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:687:1: (lv_parameterFilters_13_0= ruleParameterFilter )
            	    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:688:3: lv_parameterFilters_13_0= ruleParameterFilter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAtomicEventAccess().getParameterFiltersParameterFilterParserRuleCall_13_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameterFilter_in_ruleAtomicEvent1610);
            	    lv_parameterFilters_13_0=ruleParameterFilter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAtomicEventRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameterFilters",
            	            		lv_parameterFilters_13_0, 
            	            		"ParameterFilter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleAtomicEvent1623); 

                	newLeafNode(otherlv_14, grammarAccess.getAtomicEventAccess().getRightCurlyBracketKeyword_14());
                
            otherlv_15=(Token)match(input,18,FOLLOW_18_in_ruleAtomicEvent1635); 

                	newLeafNode(otherlv_15, grammarAccess.getAtomicEventAccess().getRightCurlyBracketKeyword_15());
                

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
    // $ANTLR end "ruleAtomicEvent"


    // $ANTLR start "entryRuleIQPatternEvent"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:720:1: entryRuleIQPatternEvent returns [EObject current=null] : iv_ruleIQPatternEvent= ruleIQPatternEvent EOF ;
    public final EObject entryRuleIQPatternEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIQPatternEvent = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:721:2: (iv_ruleIQPatternEvent= ruleIQPatternEvent EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:722:2: iv_ruleIQPatternEvent= ruleIQPatternEvent EOF
            {
             newCompositeNode(grammarAccess.getIQPatternEventRule()); 
            pushFollow(FOLLOW_ruleIQPatternEvent_in_entryRuleIQPatternEvent1671);
            iv_ruleIQPatternEvent=ruleIQPatternEvent();

            state._fsp--;

             current =iv_ruleIQPatternEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIQPatternEvent1681); 

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
    // $ANTLR end "entryRuleIQPatternEvent"


    // $ANTLR start "ruleIQPatternEvent"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:729:1: ruleIQPatternEvent returns [EObject current=null] : (otherlv_0= 'IQPatternEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' otherlv_4= 'IQPatternRef' otherlv_5= ':' ( (lv_iqpattern_6_0= RULE_STRING ) ) otherlv_7= 'ChangeType' otherlv_8= ':' ( (lv_changeType_9_0= ruleIQPatternChangeType ) ) otherlv_10= '}' ) ;
    public final EObject ruleIQPatternEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_iqpattern_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_changeType_9_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:732:28: ( (otherlv_0= 'IQPatternEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' otherlv_4= 'IQPatternRef' otherlv_5= ':' ( (lv_iqpattern_6_0= RULE_STRING ) ) otherlv_7= 'ChangeType' otherlv_8= ':' ( (lv_changeType_9_0= ruleIQPatternChangeType ) ) otherlv_10= '}' ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:733:1: (otherlv_0= 'IQPatternEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' otherlv_4= 'IQPatternRef' otherlv_5= ':' ( (lv_iqpattern_6_0= RULE_STRING ) ) otherlv_7= 'ChangeType' otherlv_8= ':' ( (lv_changeType_9_0= ruleIQPatternChangeType ) ) otherlv_10= '}' )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:733:1: (otherlv_0= 'IQPatternEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' otherlv_4= 'IQPatternRef' otherlv_5= ':' ( (lv_iqpattern_6_0= RULE_STRING ) ) otherlv_7= 'ChangeType' otherlv_8= ':' ( (lv_changeType_9_0= ruleIQPatternChangeType ) ) otherlv_10= '}' )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:733:3: otherlv_0= 'IQPatternEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' otherlv_4= 'IQPatternRef' otherlv_5= ':' ( (lv_iqpattern_6_0= RULE_STRING ) ) otherlv_7= 'ChangeType' otherlv_8= ':' ( (lv_changeType_9_0= ruleIQPatternChangeType ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleIQPatternEvent1718); 

                	newLeafNode(otherlv_0, grammarAccess.getIQPatternEventAccess().getIQPatternEventKeyword_0());
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:737:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:738:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:738:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:739:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIQPatternEvent1735); 

            			newLeafNode(lv_name_1_0, grammarAccess.getIQPatternEventAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIQPatternEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleIQPatternEvent1752); 

                	newLeafNode(otherlv_2, grammarAccess.getIQPatternEventAccess().getLeftParenthesisRightParenthesisKeyword_2());
                
            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleIQPatternEvent1764); 

                	newLeafNode(otherlv_3, grammarAccess.getIQPatternEventAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleIQPatternEvent1776); 

                	newLeafNode(otherlv_4, grammarAccess.getIQPatternEventAccess().getIQPatternRefKeyword_4());
                
            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleIQPatternEvent1788); 

                	newLeafNode(otherlv_5, grammarAccess.getIQPatternEventAccess().getColonKeyword_5());
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:771:1: ( (lv_iqpattern_6_0= RULE_STRING ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:772:1: (lv_iqpattern_6_0= RULE_STRING )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:772:1: (lv_iqpattern_6_0= RULE_STRING )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:773:3: lv_iqpattern_6_0= RULE_STRING
            {
            lv_iqpattern_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIQPatternEvent1805); 

            			newLeafNode(lv_iqpattern_6_0, grammarAccess.getIQPatternEventAccess().getIqpatternSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIQPatternEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"iqpattern",
                    		lv_iqpattern_6_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleIQPatternEvent1822); 

                	newLeafNode(otherlv_7, grammarAccess.getIQPatternEventAccess().getChangeTypeKeyword_7());
                
            otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleIQPatternEvent1834); 

                	newLeafNode(otherlv_8, grammarAccess.getIQPatternEventAccess().getColonKeyword_8());
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:797:1: ( (lv_changeType_9_0= ruleIQPatternChangeType ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:798:1: (lv_changeType_9_0= ruleIQPatternChangeType )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:798:1: (lv_changeType_9_0= ruleIQPatternChangeType )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:799:3: lv_changeType_9_0= ruleIQPatternChangeType
            {
             
            	        newCompositeNode(grammarAccess.getIQPatternEventAccess().getChangeTypeIQPatternChangeTypeEnumRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleIQPatternChangeType_in_ruleIQPatternEvent1855);
            lv_changeType_9_0=ruleIQPatternChangeType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIQPatternEventRule());
            	        }
                   		set(
                   			current, 
                   			"changeType",
                    		lv_changeType_9_0, 
                    		"IQPatternChangeType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleIQPatternEvent1867); 

                	newLeafNode(otherlv_10, grammarAccess.getIQPatternEventAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleIQPatternEvent"


    // $ANTLR start "entryRuleComplexEvent"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:827:1: entryRuleComplexEvent returns [EObject current=null] : iv_ruleComplexEvent= ruleComplexEvent EOF ;
    public final EObject entryRuleComplexEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexEvent = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:828:2: (iv_ruleComplexEvent= ruleComplexEvent EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:829:2: iv_ruleComplexEvent= ruleComplexEvent EOF
            {
             newCompositeNode(grammarAccess.getComplexEventRule()); 
            pushFollow(FOLLOW_ruleComplexEvent_in_entryRuleComplexEvent1903);
            iv_ruleComplexEvent=ruleComplexEvent();

            state._fsp--;

             current =iv_ruleComplexEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexEvent1913); 

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
    // $ANTLR end "entryRuleComplexEvent"


    // $ANTLR start "ruleComplexEvent"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:836:1: ruleComplexEvent returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotations ) )* otherlv_1= 'ComplexEvent' ( (lv_name_2_0= RULE_ID ) ) ( (lv_paramlist_3_0= ruleCEParamlist ) ) otherlv_4= '{' ( (lv_complexEventExpressions_5_0= ruleComplexEventExpression ) )* otherlv_6= '}' ) ;
    public final EObject ruleComplexEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_paramlist_3_0 = null;

        EObject lv_complexEventExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:839:28: ( ( ( (lv_annotations_0_0= ruleAnnotations ) )* otherlv_1= 'ComplexEvent' ( (lv_name_2_0= RULE_ID ) ) ( (lv_paramlist_3_0= ruleCEParamlist ) ) otherlv_4= '{' ( (lv_complexEventExpressions_5_0= ruleComplexEventExpression ) )* otherlv_6= '}' ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:840:1: ( ( (lv_annotations_0_0= ruleAnnotations ) )* otherlv_1= 'ComplexEvent' ( (lv_name_2_0= RULE_ID ) ) ( (lv_paramlist_3_0= ruleCEParamlist ) ) otherlv_4= '{' ( (lv_complexEventExpressions_5_0= ruleComplexEventExpression ) )* otherlv_6= '}' )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:840:1: ( ( (lv_annotations_0_0= ruleAnnotations ) )* otherlv_1= 'ComplexEvent' ( (lv_name_2_0= RULE_ID ) ) ( (lv_paramlist_3_0= ruleCEParamlist ) ) otherlv_4= '{' ( (lv_complexEventExpressions_5_0= ruleComplexEventExpression ) )* otherlv_6= '}' )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:840:2: ( (lv_annotations_0_0= ruleAnnotations ) )* otherlv_1= 'ComplexEvent' ( (lv_name_2_0= RULE_ID ) ) ( (lv_paramlist_3_0= ruleCEParamlist ) ) otherlv_4= '{' ( (lv_complexEventExpressions_5_0= ruleComplexEventExpression ) )* otherlv_6= '}'
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:840:2: ( (lv_annotations_0_0= ruleAnnotations ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=31 && LA12_0<=33)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:841:1: (lv_annotations_0_0= ruleAnnotations )
            	    {
            	    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:841:1: (lv_annotations_0_0= ruleAnnotations )
            	    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:842:3: lv_annotations_0_0= ruleAnnotations
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComplexEventAccess().getAnnotationsAnnotationsParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotations_in_ruleComplexEvent1959);
            	    lv_annotations_0_0=ruleAnnotations();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComplexEventRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_0_0, 
            	            		"Annotations");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleComplexEvent1972); 

                	newLeafNode(otherlv_1, grammarAccess.getComplexEventAccess().getComplexEventKeyword_1());
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:862:1: ( (lv_name_2_0= RULE_ID ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:863:1: (lv_name_2_0= RULE_ID )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:863:1: (lv_name_2_0= RULE_ID )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:864:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComplexEvent1989); 

            			newLeafNode(lv_name_2_0, grammarAccess.getComplexEventAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComplexEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:880:2: ( (lv_paramlist_3_0= ruleCEParamlist ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:881:1: (lv_paramlist_3_0= ruleCEParamlist )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:881:1: (lv_paramlist_3_0= ruleCEParamlist )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:882:3: lv_paramlist_3_0= ruleCEParamlist
            {
             
            	        newCompositeNode(grammarAccess.getComplexEventAccess().getParamlistCEParamlistParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleCEParamlist_in_ruleComplexEvent2015);
            lv_paramlist_3_0=ruleCEParamlist();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComplexEventRule());
            	        }
                   		set(
                   			current, 
                   			"paramlist",
                    		lv_paramlist_3_0, 
                    		"CEParamlist");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleComplexEvent2027); 

                	newLeafNode(otherlv_4, grammarAccess.getComplexEventAccess().getLeftCurlyBracketKeyword_4());
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:902:1: ( (lv_complexEventExpressions_5_0= ruleComplexEventExpression ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:903:1: (lv_complexEventExpressions_5_0= ruleComplexEventExpression )
            	    {
            	    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:903:1: (lv_complexEventExpressions_5_0= ruleComplexEventExpression )
            	    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:904:3: lv_complexEventExpressions_5_0= ruleComplexEventExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComplexEventAccess().getComplexEventExpressionsComplexEventExpressionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComplexEventExpression_in_ruleComplexEvent2048);
            	    lv_complexEventExpressions_5_0=ruleComplexEventExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComplexEventRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"complexEventExpressions",
            	            		lv_complexEventExpressions_5_0, 
            	            		"ComplexEventExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleComplexEvent2061); 

                	newLeafNode(otherlv_6, grammarAccess.getComplexEventAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleComplexEvent"


    // $ANTLR start "entryRuleCEParamlist"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:932:1: entryRuleCEParamlist returns [EObject current=null] : iv_ruleCEParamlist= ruleCEParamlist EOF ;
    public final EObject entryRuleCEParamlist() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCEParamlist = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:933:2: (iv_ruleCEParamlist= ruleCEParamlist EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:934:2: iv_ruleCEParamlist= ruleCEParamlist EOF
            {
             newCompositeNode(grammarAccess.getCEParamlistRule()); 
            pushFollow(FOLLOW_ruleCEParamlist_in_entryRuleCEParamlist2097);
            iv_ruleCEParamlist=ruleCEParamlist();

            state._fsp--;

             current =iv_ruleCEParamlist; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCEParamlist2107); 

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
    // $ANTLR end "entryRuleCEParamlist"


    // $ANTLR start "ruleCEParamlist"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:941:1: ruleCEParamlist returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_params_2_0= ruleEventParamWithType ) )* otherlv_3= ')' ) ;
    public final EObject ruleCEParamlist() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_params_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:944:28: ( ( () otherlv_1= '(' ( (lv_params_2_0= ruleEventParamWithType ) )* otherlv_3= ')' ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:945:1: ( () otherlv_1= '(' ( (lv_params_2_0= ruleEventParamWithType ) )* otherlv_3= ')' )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:945:1: ( () otherlv_1= '(' ( (lv_params_2_0= ruleEventParamWithType ) )* otherlv_3= ')' )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:945:2: () otherlv_1= '(' ( (lv_params_2_0= ruleEventParamWithType ) )* otherlv_3= ')'
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:945:2: ()
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:946:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCEParamlistAccess().getCEParamlistAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleCEParamlist2153); 

                	newLeafNode(otherlv_1, grammarAccess.getCEParamlistAccess().getLeftParenthesisKeyword_1());
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:955:1: ( (lv_params_2_0= ruleEventParamWithType ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:956:1: (lv_params_2_0= ruleEventParamWithType )
            	    {
            	    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:956:1: (lv_params_2_0= ruleEventParamWithType )
            	    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:957:3: lv_params_2_0= ruleEventParamWithType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCEParamlistAccess().getParamsEventParamWithTypeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEventParamWithType_in_ruleCEParamlist2174);
            	    lv_params_2_0=ruleEventParamWithType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCEParamlistRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"params",
            	            		lv_params_2_0, 
            	            		"EventParamWithType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleCEParamlist2187); 

                	newLeafNode(otherlv_3, grammarAccess.getCEParamlistAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleCEParamlist"


    // $ANTLR start "entryRuleEventParamWithType"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:985:1: entryRuleEventParamWithType returns [EObject current=null] : iv_ruleEventParamWithType= ruleEventParamWithType EOF ;
    public final EObject entryRuleEventParamWithType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventParamWithType = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:986:2: (iv_ruleEventParamWithType= ruleEventParamWithType EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:987:2: iv_ruleEventParamWithType= ruleEventParamWithType EOF
            {
             newCompositeNode(grammarAccess.getEventParamWithTypeRule()); 
            pushFollow(FOLLOW_ruleEventParamWithType_in_entryRuleEventParamWithType2223);
            iv_ruleEventParamWithType=ruleEventParamWithType();

            state._fsp--;

             current =iv_ruleEventParamWithType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventParamWithType2233); 

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
    // $ANTLR end "entryRuleEventParamWithType"


    // $ANTLR start "ruleEventParamWithType"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:994:1: ruleEventParamWithType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleEventParamWithType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:997:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:998:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:998:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:998:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:998:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:999:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:999:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1000:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventParamWithType2275); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEventParamWithTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventParamWithTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleEventParamWithType2292); 

                	newLeafNode(otherlv_1, grammarAccess.getEventParamWithTypeAccess().getColonKeyword_1());
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1020:1: ( (otherlv_2= RULE_ID ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1021:1: (otherlv_2= RULE_ID )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1021:1: (otherlv_2= RULE_ID )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1022:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEventParamWithTypeRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventParamWithType2312); 

            		newLeafNode(otherlv_2, grammarAccess.getEventParamWithTypeAccess().getTypeEventCrossReference_2_0()); 
            	

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
    // $ANTLR end "ruleEventParamWithType"


    // $ANTLR start "entryRuleParameterFilter"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1041:1: entryRuleParameterFilter returns [EObject current=null] : iv_ruleParameterFilter= ruleParameterFilter EOF ;
    public final EObject entryRuleParameterFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterFilter = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1042:2: (iv_ruleParameterFilter= ruleParameterFilter EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1043:2: iv_ruleParameterFilter= ruleParameterFilter EOF
            {
             newCompositeNode(grammarAccess.getParameterFilterRule()); 
            pushFollow(FOLLOW_ruleParameterFilter_in_entryRuleParameterFilter2348);
            iv_ruleParameterFilter=ruleParameterFilter();

            state._fsp--;

             current =iv_ruleParameterFilter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterFilter2358); 

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
    // $ANTLR end "entryRuleParameterFilter"


    // $ANTLR start "ruleParameterFilter"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1050:1: ruleParameterFilter returns [EObject current=null] : ( ( (lv_attributeName_0_0= RULE_ID ) ) ( (lv_paramFilterRule_1_0= ruleParameterFilterRule ) ) ) ;
    public final EObject ruleParameterFilter() throws RecognitionException {
        EObject current = null;

        Token lv_attributeName_0_0=null;
        EObject lv_paramFilterRule_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1053:28: ( ( ( (lv_attributeName_0_0= RULE_ID ) ) ( (lv_paramFilterRule_1_0= ruleParameterFilterRule ) ) ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1054:1: ( ( (lv_attributeName_0_0= RULE_ID ) ) ( (lv_paramFilterRule_1_0= ruleParameterFilterRule ) ) )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1054:1: ( ( (lv_attributeName_0_0= RULE_ID ) ) ( (lv_paramFilterRule_1_0= ruleParameterFilterRule ) ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1054:2: ( (lv_attributeName_0_0= RULE_ID ) ) ( (lv_paramFilterRule_1_0= ruleParameterFilterRule ) )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1054:2: ( (lv_attributeName_0_0= RULE_ID ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1055:1: (lv_attributeName_0_0= RULE_ID )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1055:1: (lv_attributeName_0_0= RULE_ID )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1056:3: lv_attributeName_0_0= RULE_ID
            {
            lv_attributeName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterFilter2400); 

            			newLeafNode(lv_attributeName_0_0, grammarAccess.getParameterFilterAccess().getAttributeNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterFilterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"attributeName",
                    		lv_attributeName_0_0, 
                    		"ID");
            	    

            }


            }

            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1072:2: ( (lv_paramFilterRule_1_0= ruleParameterFilterRule ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1073:1: (lv_paramFilterRule_1_0= ruleParameterFilterRule )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1073:1: (lv_paramFilterRule_1_0= ruleParameterFilterRule )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1074:3: lv_paramFilterRule_1_0= ruleParameterFilterRule
            {
             
            	        newCompositeNode(grammarAccess.getParameterFilterAccess().getParamFilterRuleParameterFilterRuleParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleParameterFilterRule_in_ruleParameterFilter2426);
            lv_paramFilterRule_1_0=ruleParameterFilterRule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterFilterRule());
            	        }
                   		set(
                   			current, 
                   			"paramFilterRule",
                    		lv_paramFilterRule_1_0, 
                    		"ParameterFilterRule");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleParameterFilter"


    // $ANTLR start "entryRuleAnnotations"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1098:1: entryRuleAnnotations returns [EObject current=null] : iv_ruleAnnotations= ruleAnnotations EOF ;
    public final EObject entryRuleAnnotations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotations = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1099:2: (iv_ruleAnnotations= ruleAnnotations EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1100:2: iv_ruleAnnotations= ruleAnnotations EOF
            {
             newCompositeNode(grammarAccess.getAnnotationsRule()); 
            pushFollow(FOLLOW_ruleAnnotations_in_entryRuleAnnotations2462);
            iv_ruleAnnotations=ruleAnnotations();

            state._fsp--;

             current =iv_ruleAnnotations; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotations2472); 

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
    // $ANTLR end "entryRuleAnnotations"


    // $ANTLR start "ruleAnnotations"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1107:1: ruleAnnotations returns [EObject current=null] : (this_ContextAnnotation_0= ruleContextAnnotation | this_SamplingAnnotation_1= ruleSamplingAnnotation | this_PriorityAnnotation_2= rulePriorityAnnotation ) ;
    public final EObject ruleAnnotations() throws RecognitionException {
        EObject current = null;

        EObject this_ContextAnnotation_0 = null;

        EObject this_SamplingAnnotation_1 = null;

        EObject this_PriorityAnnotation_2 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1110:28: ( (this_ContextAnnotation_0= ruleContextAnnotation | this_SamplingAnnotation_1= ruleSamplingAnnotation | this_PriorityAnnotation_2= rulePriorityAnnotation ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1111:1: (this_ContextAnnotation_0= ruleContextAnnotation | this_SamplingAnnotation_1= ruleSamplingAnnotation | this_PriorityAnnotation_2= rulePriorityAnnotation )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1111:1: (this_ContextAnnotation_0= ruleContextAnnotation | this_SamplingAnnotation_1= ruleSamplingAnnotation | this_PriorityAnnotation_2= rulePriorityAnnotation )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt15=1;
                }
                break;
            case 32:
                {
                alt15=2;
                }
                break;
            case 33:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1112:5: this_ContextAnnotation_0= ruleContextAnnotation
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationsAccess().getContextAnnotationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleContextAnnotation_in_ruleAnnotations2519);
                    this_ContextAnnotation_0=ruleContextAnnotation();

                    state._fsp--;

                     
                            current = this_ContextAnnotation_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1122:5: this_SamplingAnnotation_1= ruleSamplingAnnotation
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationsAccess().getSamplingAnnotationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSamplingAnnotation_in_ruleAnnotations2546);
                    this_SamplingAnnotation_1=ruleSamplingAnnotation();

                    state._fsp--;

                     
                            current = this_SamplingAnnotation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1132:5: this_PriorityAnnotation_2= rulePriorityAnnotation
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationsAccess().getPriorityAnnotationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePriorityAnnotation_in_ruleAnnotations2573);
                    this_PriorityAnnotation_2=rulePriorityAnnotation();

                    state._fsp--;

                     
                            current = this_PriorityAnnotation_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleAnnotations"


    // $ANTLR start "entryRuleContextAnnotation"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1148:1: entryRuleContextAnnotation returns [EObject current=null] : iv_ruleContextAnnotation= ruleContextAnnotation EOF ;
    public final EObject entryRuleContextAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextAnnotation = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1149:2: (iv_ruleContextAnnotation= ruleContextAnnotation EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1150:2: iv_ruleContextAnnotation= ruleContextAnnotation EOF
            {
             newCompositeNode(grammarAccess.getContextAnnotationRule()); 
            pushFollow(FOLLOW_ruleContextAnnotation_in_entryRuleContextAnnotation2608);
            iv_ruleContextAnnotation=ruleContextAnnotation();

            state._fsp--;

             current =iv_ruleContextAnnotation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextAnnotation2618); 

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
    // $ANTLR end "entryRuleContextAnnotation"


    // $ANTLR start "ruleContextAnnotation"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1157:1: ruleContextAnnotation returns [EObject current=null] : (otherlv_0= '@Context' otherlv_1= '(' ( (lv_context_2_0= ruleContext ) ) otherlv_3= ')' ) ;
    public final EObject ruleContextAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_context_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1160:28: ( (otherlv_0= '@Context' otherlv_1= '(' ( (lv_context_2_0= ruleContext ) ) otherlv_3= ')' ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1161:1: (otherlv_0= '@Context' otherlv_1= '(' ( (lv_context_2_0= ruleContext ) ) otherlv_3= ')' )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1161:1: (otherlv_0= '@Context' otherlv_1= '(' ( (lv_context_2_0= ruleContext ) ) otherlv_3= ')' )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1161:3: otherlv_0= '@Context' otherlv_1= '(' ( (lv_context_2_0= ruleContext ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleContextAnnotation2655); 

                	newLeafNode(otherlv_0, grammarAccess.getContextAnnotationAccess().getContextKeyword_0());
                
            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleContextAnnotation2667); 

                	newLeafNode(otherlv_1, grammarAccess.getContextAnnotationAccess().getLeftParenthesisKeyword_1());
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1169:1: ( (lv_context_2_0= ruleContext ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1170:1: (lv_context_2_0= ruleContext )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1170:1: (lv_context_2_0= ruleContext )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1171:3: lv_context_2_0= ruleContext
            {
             
            	        newCompositeNode(grammarAccess.getContextAnnotationAccess().getContextContextEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleContext_in_ruleContextAnnotation2688);
            lv_context_2_0=ruleContext();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContextAnnotationRule());
            	        }
                   		set(
                   			current, 
                   			"context",
                    		lv_context_2_0, 
                    		"Context");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleContextAnnotation2700); 

                	newLeafNode(otherlv_3, grammarAccess.getContextAnnotationAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleContextAnnotation"


    // $ANTLR start "entryRuleSamplingAnnotation"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1199:1: entryRuleSamplingAnnotation returns [EObject current=null] : iv_ruleSamplingAnnotation= ruleSamplingAnnotation EOF ;
    public final EObject entryRuleSamplingAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSamplingAnnotation = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1200:2: (iv_ruleSamplingAnnotation= ruleSamplingAnnotation EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1201:2: iv_ruleSamplingAnnotation= ruleSamplingAnnotation EOF
            {
             newCompositeNode(grammarAccess.getSamplingAnnotationRule()); 
            pushFollow(FOLLOW_ruleSamplingAnnotation_in_entryRuleSamplingAnnotation2736);
            iv_ruleSamplingAnnotation=ruleSamplingAnnotation();

            state._fsp--;

             current =iv_ruleSamplingAnnotation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSamplingAnnotation2746); 

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
    // $ANTLR end "entryRuleSamplingAnnotation"


    // $ANTLR start "ruleSamplingAnnotation"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1208:1: ruleSamplingAnnotation returns [EObject current=null] : (otherlv_0= '@SamplingTime' otherlv_1= '(' ( (lv_sampling_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleSamplingAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_sampling_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1211:28: ( (otherlv_0= '@SamplingTime' otherlv_1= '(' ( (lv_sampling_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1212:1: (otherlv_0= '@SamplingTime' otherlv_1= '(' ( (lv_sampling_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1212:1: (otherlv_0= '@SamplingTime' otherlv_1= '(' ( (lv_sampling_2_0= RULE_INT ) ) otherlv_3= ')' )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1212:3: otherlv_0= '@SamplingTime' otherlv_1= '(' ( (lv_sampling_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleSamplingAnnotation2783); 

                	newLeafNode(otherlv_0, grammarAccess.getSamplingAnnotationAccess().getSamplingTimeKeyword_0());
                
            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleSamplingAnnotation2795); 

                	newLeafNode(otherlv_1, grammarAccess.getSamplingAnnotationAccess().getLeftParenthesisKeyword_1());
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1220:1: ( (lv_sampling_2_0= RULE_INT ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1221:1: (lv_sampling_2_0= RULE_INT )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1221:1: (lv_sampling_2_0= RULE_INT )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1222:3: lv_sampling_2_0= RULE_INT
            {
            lv_sampling_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSamplingAnnotation2812); 

            			newLeafNode(lv_sampling_2_0, grammarAccess.getSamplingAnnotationAccess().getSamplingINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSamplingAnnotationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"sampling",
                    		lv_sampling_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleSamplingAnnotation2829); 

                	newLeafNode(otherlv_3, grammarAccess.getSamplingAnnotationAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleSamplingAnnotation"


    // $ANTLR start "entryRulePriorityAnnotation"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1250:1: entryRulePriorityAnnotation returns [EObject current=null] : iv_rulePriorityAnnotation= rulePriorityAnnotation EOF ;
    public final EObject entryRulePriorityAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePriorityAnnotation = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1251:2: (iv_rulePriorityAnnotation= rulePriorityAnnotation EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1252:2: iv_rulePriorityAnnotation= rulePriorityAnnotation EOF
            {
             newCompositeNode(grammarAccess.getPriorityAnnotationRule()); 
            pushFollow(FOLLOW_rulePriorityAnnotation_in_entryRulePriorityAnnotation2865);
            iv_rulePriorityAnnotation=rulePriorityAnnotation();

            state._fsp--;

             current =iv_rulePriorityAnnotation; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePriorityAnnotation2875); 

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
    // $ANTLR end "entryRulePriorityAnnotation"


    // $ANTLR start "rulePriorityAnnotation"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1259:1: rulePriorityAnnotation returns [EObject current=null] : (otherlv_0= '@Priority' otherlv_1= '(' ( (lv_priority_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject rulePriorityAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_priority_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1262:28: ( (otherlv_0= '@Priority' otherlv_1= '(' ( (lv_priority_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1263:1: (otherlv_0= '@Priority' otherlv_1= '(' ( (lv_priority_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1263:1: (otherlv_0= '@Priority' otherlv_1= '(' ( (lv_priority_2_0= RULE_INT ) ) otherlv_3= ')' )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1263:3: otherlv_0= '@Priority' otherlv_1= '(' ( (lv_priority_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_rulePriorityAnnotation2912); 

                	newLeafNode(otherlv_0, grammarAccess.getPriorityAnnotationAccess().getPriorityKeyword_0());
                
            otherlv_1=(Token)match(input,29,FOLLOW_29_in_rulePriorityAnnotation2924); 

                	newLeafNode(otherlv_1, grammarAccess.getPriorityAnnotationAccess().getLeftParenthesisKeyword_1());
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1271:1: ( (lv_priority_2_0= RULE_INT ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1272:1: (lv_priority_2_0= RULE_INT )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1272:1: (lv_priority_2_0= RULE_INT )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1273:3: lv_priority_2_0= RULE_INT
            {
            lv_priority_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePriorityAnnotation2941); 

            			newLeafNode(lv_priority_2_0, grammarAccess.getPriorityAnnotationAccess().getPriorityINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPriorityAnnotationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"priority",
                    		lv_priority_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_rulePriorityAnnotation2958); 

                	newLeafNode(otherlv_3, grammarAccess.getPriorityAnnotationAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "rulePriorityAnnotation"


    // $ANTLR start "entryRuleParameterFilterRule"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1301:1: entryRuleParameterFilterRule returns [EObject current=null] : iv_ruleParameterFilterRule= ruleParameterFilterRule EOF ;
    public final EObject entryRuleParameterFilterRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterFilterRule = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1302:2: (iv_ruleParameterFilterRule= ruleParameterFilterRule EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1303:2: iv_ruleParameterFilterRule= ruleParameterFilterRule EOF
            {
             newCompositeNode(grammarAccess.getParameterFilterRuleRule()); 
            pushFollow(FOLLOW_ruleParameterFilterRule_in_entryRuleParameterFilterRule2994);
            iv_ruleParameterFilterRule=ruleParameterFilterRule();

            state._fsp--;

             current =iv_ruleParameterFilterRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterFilterRule3004); 

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
    // $ANTLR end "entryRuleParameterFilterRule"


    // $ANTLR start "ruleParameterFilterRule"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1310:1: ruleParameterFilterRule returns [EObject current=null] : (this_RangeFilter_0= ruleRangeFilter | this_NumericFilter_1= ruleNumericFilter | this_LiteralFilter_2= ruleLiteralFilter ) ;
    public final EObject ruleParameterFilterRule() throws RecognitionException {
        EObject current = null;

        EObject this_RangeFilter_0 = null;

        EObject this_NumericFilter_1 = null;

        EObject this_LiteralFilter_2 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1313:28: ( (this_RangeFilter_0= ruleRangeFilter | this_NumericFilter_1= ruleNumericFilter | this_LiteralFilter_2= ruleLiteralFilter ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1314:1: (this_RangeFilter_0= ruleRangeFilter | this_NumericFilter_1= ruleNumericFilter | this_LiteralFilter_2= ruleLiteralFilter )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1314:1: (this_RangeFilter_0= ruleRangeFilter | this_NumericFilter_1= ruleNumericFilter | this_LiteralFilter_2= ruleLiteralFilter )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                int LA16_1 = input.LA(2);

                if ( ((LA16_1>=44 && LA16_1<=46)) ) {
                    alt16=3;
                }
                else if ( (LA16_1==34) ) {
                    alt16=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
                }
                break;
            case 34:
                {
                alt16=1;
                }
                break;
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
                {
                alt16=2;
                }
                break;
            case 44:
            case 45:
            case 46:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1315:5: this_RangeFilter_0= ruleRangeFilter
                    {
                     
                            newCompositeNode(grammarAccess.getParameterFilterRuleAccess().getRangeFilterParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRangeFilter_in_ruleParameterFilterRule3051);
                    this_RangeFilter_0=ruleRangeFilter();

                    state._fsp--;

                     
                            current = this_RangeFilter_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1325:5: this_NumericFilter_1= ruleNumericFilter
                    {
                     
                            newCompositeNode(grammarAccess.getParameterFilterRuleAccess().getNumericFilterParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNumericFilter_in_ruleParameterFilterRule3078);
                    this_NumericFilter_1=ruleNumericFilter();

                    state._fsp--;

                     
                            current = this_NumericFilter_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1335:5: this_LiteralFilter_2= ruleLiteralFilter
                    {
                     
                            newCompositeNode(grammarAccess.getParameterFilterRuleAccess().getLiteralFilterParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLiteralFilter_in_ruleParameterFilterRule3105);
                    this_LiteralFilter_2=ruleLiteralFilter();

                    state._fsp--;

                     
                            current = this_LiteralFilter_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleParameterFilterRule"


    // $ANTLR start "entryRuleRangeFilter"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1351:1: entryRuleRangeFilter returns [EObject current=null] : iv_ruleRangeFilter= ruleRangeFilter EOF ;
    public final EObject entryRuleRangeFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeFilter = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1352:2: (iv_ruleRangeFilter= ruleRangeFilter EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1353:2: iv_ruleRangeFilter= ruleRangeFilter EOF
            {
             newCompositeNode(grammarAccess.getRangeFilterRule()); 
            pushFollow(FOLLOW_ruleRangeFilter_in_entryRuleRangeFilter3140);
            iv_ruleRangeFilter=ruleRangeFilter();

            state._fsp--;

             current =iv_ruleRangeFilter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRangeFilter3150); 

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
    // $ANTLR end "entryRuleRangeFilter"


    // $ANTLR start "ruleRangeFilter"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1360:1: ruleRangeFilter returns [EObject current=null] : ( ( (lv_neg_0_0= ruleNegationOpartor ) )? otherlv_1= 'in' ( (lv_range_2_0= ruleRange ) ) ) ;
    public final EObject ruleRangeFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_neg_0_0 = null;

        EObject lv_range_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1363:28: ( ( ( (lv_neg_0_0= ruleNegationOpartor ) )? otherlv_1= 'in' ( (lv_range_2_0= ruleRange ) ) ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1364:1: ( ( (lv_neg_0_0= ruleNegationOpartor ) )? otherlv_1= 'in' ( (lv_range_2_0= ruleRange ) ) )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1364:1: ( ( (lv_neg_0_0= ruleNegationOpartor ) )? otherlv_1= 'in' ( (lv_range_2_0= ruleRange ) ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1364:2: ( (lv_neg_0_0= ruleNegationOpartor ) )? otherlv_1= 'in' ( (lv_range_2_0= ruleRange ) )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1364:2: ( (lv_neg_0_0= ruleNegationOpartor ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==47) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1365:1: (lv_neg_0_0= ruleNegationOpartor )
                    {
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1365:1: (lv_neg_0_0= ruleNegationOpartor )
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1366:3: lv_neg_0_0= ruleNegationOpartor
                    {
                     
                    	        newCompositeNode(grammarAccess.getRangeFilterAccess().getNegNegationOpartorParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNegationOpartor_in_ruleRangeFilter3196);
                    lv_neg_0_0=ruleNegationOpartor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRangeFilterRule());
                    	        }
                           		set(
                           			current, 
                           			"neg",
                            		lv_neg_0_0, 
                            		"NegationOpartor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleRangeFilter3209); 

                	newLeafNode(otherlv_1, grammarAccess.getRangeFilterAccess().getInKeyword_1());
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1386:1: ( (lv_range_2_0= ruleRange ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1387:1: (lv_range_2_0= ruleRange )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1387:1: (lv_range_2_0= ruleRange )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1388:3: lv_range_2_0= ruleRange
            {
             
            	        newCompositeNode(grammarAccess.getRangeFilterAccess().getRangeRangeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRange_in_ruleRangeFilter3230);
            lv_range_2_0=ruleRange();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRangeFilterRule());
            	        }
                   		set(
                   			current, 
                   			"range",
                    		lv_range_2_0, 
                    		"Range");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleRangeFilter"


    // $ANTLR start "entryRuleRange"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1412:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1413:2: (iv_ruleRange= ruleRange EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1414:2: iv_ruleRange= ruleRange EOF
            {
             newCompositeNode(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_ruleRange_in_entryRuleRange3266);
            iv_ruleRange=ruleRange();

            state._fsp--;

             current =iv_ruleRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRange3276); 

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
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1421:1: ruleRange returns [EObject current=null] : (this_OpenOpen_0= ruleOpenOpen | this_OpenClosed_1= ruleOpenClosed | this_ClosedClosed_2= ruleClosedClosed | this_ClosedOpen_3= ruleClosedOpen ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        EObject this_OpenOpen_0 = null;

        EObject this_OpenClosed_1 = null;

        EObject this_ClosedClosed_2 = null;

        EObject this_ClosedOpen_3 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1424:28: ( (this_OpenOpen_0= ruleOpenOpen | this_OpenClosed_1= ruleOpenClosed | this_ClosedClosed_2= ruleClosedClosed | this_ClosedOpen_3= ruleClosedOpen ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1425:1: (this_OpenOpen_0= ruleOpenOpen | this_OpenClosed_1= ruleOpenClosed | this_ClosedClosed_2= ruleClosedClosed | this_ClosedOpen_3= ruleClosedOpen )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1425:1: (this_OpenOpen_0= ruleOpenOpen | this_OpenClosed_1= ruleOpenClosed | this_ClosedClosed_2= ruleClosedClosed | this_ClosedOpen_3= ruleClosedOpen )
            int alt18=4;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1426:5: this_OpenOpen_0= ruleOpenOpen
                    {
                     
                            newCompositeNode(grammarAccess.getRangeAccess().getOpenOpenParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleOpenOpen_in_ruleRange3323);
                    this_OpenOpen_0=ruleOpenOpen();

                    state._fsp--;

                     
                            current = this_OpenOpen_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1436:5: this_OpenClosed_1= ruleOpenClosed
                    {
                     
                            newCompositeNode(grammarAccess.getRangeAccess().getOpenClosedParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleOpenClosed_in_ruleRange3350);
                    this_OpenClosed_1=ruleOpenClosed();

                    state._fsp--;

                     
                            current = this_OpenClosed_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1446:5: this_ClosedClosed_2= ruleClosedClosed
                    {
                     
                            newCompositeNode(grammarAccess.getRangeAccess().getClosedClosedParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleClosedClosed_in_ruleRange3377);
                    this_ClosedClosed_2=ruleClosedClosed();

                    state._fsp--;

                     
                            current = this_ClosedClosed_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1456:5: this_ClosedOpen_3= ruleClosedOpen
                    {
                     
                            newCompositeNode(grammarAccess.getRangeAccess().getClosedOpenParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleClosedOpen_in_ruleRange3404);
                    this_ClosedOpen_3=ruleClosedOpen();

                    state._fsp--;

                     
                            current = this_ClosedOpen_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleOpenOpen"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1472:1: entryRuleOpenOpen returns [EObject current=null] : iv_ruleOpenOpen= ruleOpenOpen EOF ;
    public final EObject entryRuleOpenOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenOpen = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1473:2: (iv_ruleOpenOpen= ruleOpenOpen EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1474:2: iv_ruleOpenOpen= ruleOpenOpen EOF
            {
             newCompositeNode(grammarAccess.getOpenOpenRule()); 
            pushFollow(FOLLOW_ruleOpenOpen_in_entryRuleOpenOpen3439);
            iv_ruleOpenOpen=ruleOpenOpen();

            state._fsp--;

             current =iv_ruleOpenOpen; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpenOpen3449); 

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
    // $ANTLR end "entryRuleOpenOpen"


    // $ANTLR start "ruleOpenOpen"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1481:1: ruleOpenOpen returns [EObject current=null] : (otherlv_0= '(' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ')' ) ;
    public final EObject ruleOpenOpen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_lowerBound_1_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1484:28: ( (otherlv_0= '(' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ')' ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1485:1: (otherlv_0= '(' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ')' )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1485:1: (otherlv_0= '(' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ')' )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1485:3: otherlv_0= '(' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleOpenOpen3486); 

                	newLeafNode(otherlv_0, grammarAccess.getOpenOpenAccess().getLeftParenthesisKeyword_0());
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1489:1: ( (lv_lowerBound_1_0= ruleDOUBLE ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1490:1: (lv_lowerBound_1_0= ruleDOUBLE )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1490:1: (lv_lowerBound_1_0= ruleDOUBLE )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1491:3: lv_lowerBound_1_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getOpenOpenAccess().getLowerBoundDOUBLEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleOpenOpen3507);
            lv_lowerBound_1_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOpenOpenRule());
            	        }
                   		set(
                   			current, 
                   			"lowerBound",
                    		lv_lowerBound_1_0, 
                    		"DOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleOpenOpen3519); 

                	newLeafNode(otherlv_2, grammarAccess.getOpenOpenAccess().getCommaKeyword_2());
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1511:1: ( (lv_upperBound_3_0= ruleDOUBLE ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1512:1: (lv_upperBound_3_0= ruleDOUBLE )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1512:1: (lv_upperBound_3_0= ruleDOUBLE )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1513:3: lv_upperBound_3_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getOpenOpenAccess().getUpperBoundDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleOpenOpen3540);
            lv_upperBound_3_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOpenOpenRule());
            	        }
                   		set(
                   			current, 
                   			"upperBound",
                    		lv_upperBound_3_0, 
                    		"DOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleOpenOpen3552); 

                	newLeafNode(otherlv_4, grammarAccess.getOpenOpenAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleOpenOpen"


    // $ANTLR start "entryRuleOpenClosed"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1541:1: entryRuleOpenClosed returns [EObject current=null] : iv_ruleOpenClosed= ruleOpenClosed EOF ;
    public final EObject entryRuleOpenClosed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenClosed = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1542:2: (iv_ruleOpenClosed= ruleOpenClosed EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1543:2: iv_ruleOpenClosed= ruleOpenClosed EOF
            {
             newCompositeNode(grammarAccess.getOpenClosedRule()); 
            pushFollow(FOLLOW_ruleOpenClosed_in_entryRuleOpenClosed3588);
            iv_ruleOpenClosed=ruleOpenClosed();

            state._fsp--;

             current =iv_ruleOpenClosed; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpenClosed3598); 

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
    // $ANTLR end "entryRuleOpenClosed"


    // $ANTLR start "ruleOpenClosed"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1550:1: ruleOpenClosed returns [EObject current=null] : (otherlv_0= '(' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ']' ) ;
    public final EObject ruleOpenClosed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_lowerBound_1_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1553:28: ( (otherlv_0= '(' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ']' ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1554:1: (otherlv_0= '(' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ']' )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1554:1: (otherlv_0= '(' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ']' )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1554:3: otherlv_0= '(' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleOpenClosed3635); 

                	newLeafNode(otherlv_0, grammarAccess.getOpenClosedAccess().getLeftParenthesisKeyword_0());
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1558:1: ( (lv_lowerBound_1_0= ruleDOUBLE ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1559:1: (lv_lowerBound_1_0= ruleDOUBLE )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1559:1: (lv_lowerBound_1_0= ruleDOUBLE )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1560:3: lv_lowerBound_1_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getOpenClosedAccess().getLowerBoundDOUBLEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleOpenClosed3656);
            lv_lowerBound_1_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOpenClosedRule());
            	        }
                   		set(
                   			current, 
                   			"lowerBound",
                    		lv_lowerBound_1_0, 
                    		"DOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleOpenClosed3668); 

                	newLeafNode(otherlv_2, grammarAccess.getOpenClosedAccess().getCommaKeyword_2());
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1580:1: ( (lv_upperBound_3_0= ruleDOUBLE ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1581:1: (lv_upperBound_3_0= ruleDOUBLE )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1581:1: (lv_upperBound_3_0= ruleDOUBLE )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1582:3: lv_upperBound_3_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getOpenClosedAccess().getUpperBoundDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleOpenClosed3689);
            lv_upperBound_3_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOpenClosedRule());
            	        }
                   		set(
                   			current, 
                   			"upperBound",
                    		lv_upperBound_3_0, 
                    		"DOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleOpenClosed3701); 

                	newLeafNode(otherlv_4, grammarAccess.getOpenClosedAccess().getRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "ruleOpenClosed"


    // $ANTLR start "entryRuleClosedClosed"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1610:1: entryRuleClosedClosed returns [EObject current=null] : iv_ruleClosedClosed= ruleClosedClosed EOF ;
    public final EObject entryRuleClosedClosed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClosedClosed = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1611:2: (iv_ruleClosedClosed= ruleClosedClosed EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1612:2: iv_ruleClosedClosed= ruleClosedClosed EOF
            {
             newCompositeNode(grammarAccess.getClosedClosedRule()); 
            pushFollow(FOLLOW_ruleClosedClosed_in_entryRuleClosedClosed3737);
            iv_ruleClosedClosed=ruleClosedClosed();

            state._fsp--;

             current =iv_ruleClosedClosed; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClosedClosed3747); 

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
    // $ANTLR end "entryRuleClosedClosed"


    // $ANTLR start "ruleClosedClosed"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1619:1: ruleClosedClosed returns [EObject current=null] : (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ')' ) ;
    public final EObject ruleClosedClosed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_lowerBound_1_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1622:28: ( (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ')' ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1623:1: (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ')' )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1623:1: (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ')' )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1623:3: otherlv_0= '[' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleClosedClosed3784); 

                	newLeafNode(otherlv_0, grammarAccess.getClosedClosedAccess().getLeftSquareBracketKeyword_0());
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1627:1: ( (lv_lowerBound_1_0= ruleDOUBLE ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1628:1: (lv_lowerBound_1_0= ruleDOUBLE )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1628:1: (lv_lowerBound_1_0= ruleDOUBLE )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1629:3: lv_lowerBound_1_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getClosedClosedAccess().getLowerBoundDOUBLEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleClosedClosed3805);
            lv_lowerBound_1_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClosedClosedRule());
            	        }
                   		set(
                   			current, 
                   			"lowerBound",
                    		lv_lowerBound_1_0, 
                    		"DOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleClosedClosed3817); 

                	newLeafNode(otherlv_2, grammarAccess.getClosedClosedAccess().getCommaKeyword_2());
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1649:1: ( (lv_upperBound_3_0= ruleDOUBLE ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1650:1: (lv_upperBound_3_0= ruleDOUBLE )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1650:1: (lv_upperBound_3_0= ruleDOUBLE )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1651:3: lv_upperBound_3_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getClosedClosedAccess().getUpperBoundDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleClosedClosed3838);
            lv_upperBound_3_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClosedClosedRule());
            	        }
                   		set(
                   			current, 
                   			"upperBound",
                    		lv_upperBound_3_0, 
                    		"DOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleClosedClosed3850); 

                	newLeafNode(otherlv_4, grammarAccess.getClosedClosedAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleClosedClosed"


    // $ANTLR start "entryRuleClosedOpen"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1679:1: entryRuleClosedOpen returns [EObject current=null] : iv_ruleClosedOpen= ruleClosedOpen EOF ;
    public final EObject entryRuleClosedOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClosedOpen = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1680:2: (iv_ruleClosedOpen= ruleClosedOpen EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1681:2: iv_ruleClosedOpen= ruleClosedOpen EOF
            {
             newCompositeNode(grammarAccess.getClosedOpenRule()); 
            pushFollow(FOLLOW_ruleClosedOpen_in_entryRuleClosedOpen3886);
            iv_ruleClosedOpen=ruleClosedOpen();

            state._fsp--;

             current =iv_ruleClosedOpen; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClosedOpen3896); 

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
    // $ANTLR end "entryRuleClosedOpen"


    // $ANTLR start "ruleClosedOpen"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1688:1: ruleClosedOpen returns [EObject current=null] : (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ']' ) ;
    public final EObject ruleClosedOpen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_lowerBound_1_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1691:28: ( (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ']' ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1692:1: (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ']' )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1692:1: (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ']' )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1692:3: otherlv_0= '[' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleClosedOpen3933); 

                	newLeafNode(otherlv_0, grammarAccess.getClosedOpenAccess().getLeftSquareBracketKeyword_0());
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1696:1: ( (lv_lowerBound_1_0= ruleDOUBLE ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1697:1: (lv_lowerBound_1_0= ruleDOUBLE )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1697:1: (lv_lowerBound_1_0= ruleDOUBLE )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1698:3: lv_lowerBound_1_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getClosedOpenAccess().getLowerBoundDOUBLEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleClosedOpen3954);
            lv_lowerBound_1_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClosedOpenRule());
            	        }
                   		set(
                   			current, 
                   			"lowerBound",
                    		lv_lowerBound_1_0, 
                    		"DOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleClosedOpen3966); 

                	newLeafNode(otherlv_2, grammarAccess.getClosedOpenAccess().getCommaKeyword_2());
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1718:1: ( (lv_upperBound_3_0= ruleDOUBLE ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1719:1: (lv_upperBound_3_0= ruleDOUBLE )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1719:1: (lv_upperBound_3_0= ruleDOUBLE )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1720:3: lv_upperBound_3_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getClosedOpenAccess().getUpperBoundDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleClosedOpen3987);
            lv_upperBound_3_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClosedOpenRule());
            	        }
                   		set(
                   			current, 
                   			"upperBound",
                    		lv_upperBound_3_0, 
                    		"DOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleClosedOpen3999); 

                	newLeafNode(otherlv_4, grammarAccess.getClosedOpenAccess().getRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "ruleClosedOpen"


    // $ANTLR start "entryRuleNumericFilter"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1748:1: entryRuleNumericFilter returns [EObject current=null] : iv_ruleNumericFilter= ruleNumericFilter EOF ;
    public final EObject entryRuleNumericFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericFilter = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1749:2: (iv_ruleNumericFilter= ruleNumericFilter EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1750:2: iv_ruleNumericFilter= ruleNumericFilter EOF
            {
             newCompositeNode(grammarAccess.getNumericFilterRule()); 
            pushFollow(FOLLOW_ruleNumericFilter_in_entryRuleNumericFilter4035);
            iv_ruleNumericFilter=ruleNumericFilter();

            state._fsp--;

             current =iv_ruleNumericFilter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericFilter4045); 

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
    // $ANTLR end "entryRuleNumericFilter"


    // $ANTLR start "ruleNumericFilter"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1757:1: ruleNumericFilter returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNumericOperator ) ) ( (lv_value_1_0= ruleDOUBLE ) ) ) ;
    public final EObject ruleNumericFilter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operator_0_0 = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1760:28: ( ( ( (lv_operator_0_0= ruleNumericOperator ) ) ( (lv_value_1_0= ruleDOUBLE ) ) ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1761:1: ( ( (lv_operator_0_0= ruleNumericOperator ) ) ( (lv_value_1_0= ruleDOUBLE ) ) )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1761:1: ( ( (lv_operator_0_0= ruleNumericOperator ) ) ( (lv_value_1_0= ruleDOUBLE ) ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1761:2: ( (lv_operator_0_0= ruleNumericOperator ) ) ( (lv_value_1_0= ruleDOUBLE ) )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1761:2: ( (lv_operator_0_0= ruleNumericOperator ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1762:1: (lv_operator_0_0= ruleNumericOperator )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1762:1: (lv_operator_0_0= ruleNumericOperator )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1763:3: lv_operator_0_0= ruleNumericOperator
            {
             
            	        newCompositeNode(grammarAccess.getNumericFilterAccess().getOperatorNumericOperatorParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNumericOperator_in_ruleNumericFilter4091);
            lv_operator_0_0=ruleNumericOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumericFilterRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_0_0, 
                    		"NumericOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1779:2: ( (lv_value_1_0= ruleDOUBLE ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1780:1: (lv_value_1_0= ruleDOUBLE )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1780:1: (lv_value_1_0= ruleDOUBLE )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1781:3: lv_value_1_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getNumericFilterAccess().getValueDOUBLEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleNumericFilter4112);
            lv_value_1_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumericFilterRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"DOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleNumericFilter"


    // $ANTLR start "entryRuleNumericOperator"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1805:1: entryRuleNumericOperator returns [String current=null] : iv_ruleNumericOperator= ruleNumericOperator EOF ;
    public final String entryRuleNumericOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumericOperator = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1806:2: (iv_ruleNumericOperator= ruleNumericOperator EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1807:2: iv_ruleNumericOperator= ruleNumericOperator EOF
            {
             newCompositeNode(grammarAccess.getNumericOperatorRule()); 
            pushFollow(FOLLOW_ruleNumericOperator_in_entryRuleNumericOperator4149);
            iv_ruleNumericOperator=ruleNumericOperator();

            state._fsp--;

             current =iv_ruleNumericOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericOperator4160); 

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
    // $ANTLR end "entryRuleNumericOperator"


    // $ANTLR start "ruleNumericOperator"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1814:1: ruleNumericOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '=<' | kw= '==' | kw= '!=' | kw= '>=' | kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleNumericOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1817:28: ( (kw= '<' | kw= '=<' | kw= '==' | kw= '!=' | kw= '>=' | kw= '>' ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1818:1: (kw= '<' | kw= '=<' | kw= '==' | kw= '!=' | kw= '>=' | kw= '>' )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1818:1: (kw= '<' | kw= '=<' | kw= '==' | kw= '!=' | kw= '>=' | kw= '>' )
            int alt19=6;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt19=1;
                }
                break;
            case 39:
                {
                alt19=2;
                }
                break;
            case 40:
                {
                alt19=3;
                }
                break;
            case 41:
                {
                alt19=4;
                }
                break;
            case 42:
                {
                alt19=5;
                }
                break;
            case 43:
                {
                alt19=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1819:2: kw= '<'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleNumericOperator4198); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNumericOperatorAccess().getLessThanSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1826:2: kw= '=<'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleNumericOperator4217); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNumericOperatorAccess().getEqualsSignLessThanSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1833:2: kw= '=='
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleNumericOperator4236); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNumericOperatorAccess().getEqualsSignEqualsSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1840:2: kw= '!='
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleNumericOperator4255); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNumericOperatorAccess().getExclamationMarkEqualsSignKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1847:2: kw= '>='
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleNumericOperator4274); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNumericOperatorAccess().getGreaterThanSignEqualsSignKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1854:2: kw= '>'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleNumericOperator4293); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNumericOperatorAccess().getGreaterThanSignKeyword_5()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleNumericOperator"


    // $ANTLR start "entryRuleLiteralFilter"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1867:1: entryRuleLiteralFilter returns [EObject current=null] : iv_ruleLiteralFilter= ruleLiteralFilter EOF ;
    public final EObject entryRuleLiteralFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralFilter = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1868:2: (iv_ruleLiteralFilter= ruleLiteralFilter EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1869:2: iv_ruleLiteralFilter= ruleLiteralFilter EOF
            {
             newCompositeNode(grammarAccess.getLiteralFilterRule()); 
            pushFollow(FOLLOW_ruleLiteralFilter_in_entryRuleLiteralFilter4333);
            iv_ruleLiteralFilter=ruleLiteralFilter();

            state._fsp--;

             current =iv_ruleLiteralFilter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralFilter4343); 

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
    // $ANTLR end "entryRuleLiteralFilter"


    // $ANTLR start "ruleLiteralFilter"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1876:1: ruleLiteralFilter returns [EObject current=null] : ( ( (lv_neg_0_0= ruleNegationOpartor ) )? ( (lv_operator_1_0= ruleLiteralOperator ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleLiteralFilter() throws RecognitionException {
        EObject current = null;

        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_neg_0_0 = null;

        AntlrDatatypeRuleToken lv_operator_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1879:28: ( ( ( (lv_neg_0_0= ruleNegationOpartor ) )? ( (lv_operator_1_0= ruleLiteralOperator ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1880:1: ( ( (lv_neg_0_0= ruleNegationOpartor ) )? ( (lv_operator_1_0= ruleLiteralOperator ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1880:1: ( ( (lv_neg_0_0= ruleNegationOpartor ) )? ( (lv_operator_1_0= ruleLiteralOperator ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1880:2: ( (lv_neg_0_0= ruleNegationOpartor ) )? ( (lv_operator_1_0= ruleLiteralOperator ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1880:2: ( (lv_neg_0_0= ruleNegationOpartor ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==47) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1881:1: (lv_neg_0_0= ruleNegationOpartor )
                    {
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1881:1: (lv_neg_0_0= ruleNegationOpartor )
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1882:3: lv_neg_0_0= ruleNegationOpartor
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralFilterAccess().getNegNegationOpartorParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNegationOpartor_in_ruleLiteralFilter4389);
                    lv_neg_0_0=ruleNegationOpartor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLiteralFilterRule());
                    	        }
                           		set(
                           			current, 
                           			"neg",
                            		lv_neg_0_0, 
                            		"NegationOpartor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1898:3: ( (lv_operator_1_0= ruleLiteralOperator ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1899:1: (lv_operator_1_0= ruleLiteralOperator )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1899:1: (lv_operator_1_0= ruleLiteralOperator )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1900:3: lv_operator_1_0= ruleLiteralOperator
            {
             
            	        newCompositeNode(grammarAccess.getLiteralFilterAccess().getOperatorLiteralOperatorParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteralOperator_in_ruleLiteralFilter4411);
            lv_operator_1_0=ruleLiteralOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLiteralFilterRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_1_0, 
                    		"LiteralOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1916:2: ( (lv_value_2_0= RULE_STRING ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1917:1: (lv_value_2_0= RULE_STRING )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1917:1: (lv_value_2_0= RULE_STRING )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1918:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteralFilter4428); 

            			newLeafNode(lv_value_2_0, grammarAccess.getLiteralFilterAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLiteralFilterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleLiteralFilter"


    // $ANTLR start "entryRuleLiteralOperator"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1942:1: entryRuleLiteralOperator returns [String current=null] : iv_ruleLiteralOperator= ruleLiteralOperator EOF ;
    public final String entryRuleLiteralOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralOperator = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1943:2: (iv_ruleLiteralOperator= ruleLiteralOperator EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1944:2: iv_ruleLiteralOperator= ruleLiteralOperator EOF
            {
             newCompositeNode(grammarAccess.getLiteralOperatorRule()); 
            pushFollow(FOLLOW_ruleLiteralOperator_in_entryRuleLiteralOperator4470);
            iv_ruleLiteralOperator=ruleLiteralOperator();

            state._fsp--;

             current =iv_ruleLiteralOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralOperator4481); 

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
    // $ANTLR end "entryRuleLiteralOperator"


    // $ANTLR start "ruleLiteralOperator"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1951:1: ruleLiteralOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'contains' | kw= 'startsWith' | kw= 'endsWith' ) ;
    public final AntlrDatatypeRuleToken ruleLiteralOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1954:28: ( (kw= 'contains' | kw= 'startsWith' | kw= 'endsWith' ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1955:1: (kw= 'contains' | kw= 'startsWith' | kw= 'endsWith' )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1955:1: (kw= 'contains' | kw= 'startsWith' | kw= 'endsWith' )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt21=1;
                }
                break;
            case 45:
                {
                alt21=2;
                }
                break;
            case 46:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1956:2: kw= 'contains'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleLiteralOperator4519); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLiteralOperatorAccess().getContainsKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1963:2: kw= 'startsWith'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleLiteralOperator4538); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLiteralOperatorAccess().getStartsWithKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1970:2: kw= 'endsWith'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleLiteralOperator4557); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLiteralOperatorAccess().getEndsWithKeyword_2()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleLiteralOperator"


    // $ANTLR start "entryRuleNegationOpartor"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1983:1: entryRuleNegationOpartor returns [String current=null] : iv_ruleNegationOpartor= ruleNegationOpartor EOF ;
    public final String entryRuleNegationOpartor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNegationOpartor = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1984:2: (iv_ruleNegationOpartor= ruleNegationOpartor EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1985:2: iv_ruleNegationOpartor= ruleNegationOpartor EOF
            {
             newCompositeNode(grammarAccess.getNegationOpartorRule()); 
            pushFollow(FOLLOW_ruleNegationOpartor_in_entryRuleNegationOpartor4598);
            iv_ruleNegationOpartor=ruleNegationOpartor();

            state._fsp--;

             current =iv_ruleNegationOpartor.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegationOpartor4609); 

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
    // $ANTLR end "entryRuleNegationOpartor"


    // $ANTLR start "ruleNegationOpartor"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1992:1: ruleNegationOpartor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'not' ;
    public final AntlrDatatypeRuleToken ruleNegationOpartor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1995:28: (kw= 'not' )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:1997:2: kw= 'not'
            {
            kw=(Token)match(input,47,FOLLOW_47_in_ruleNegationOpartor4646); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNegationOpartorAccess().getNotKeyword()); 
                

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
    // $ANTLR end "ruleNegationOpartor"


    // $ANTLR start "entryRuleComplexEventExpression"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2010:1: entryRuleComplexEventExpression returns [EObject current=null] : iv_ruleComplexEventExpression= ruleComplexEventExpression EOF ;
    public final EObject entryRuleComplexEventExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexEventExpression = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2011:2: (iv_ruleComplexEventExpression= ruleComplexEventExpression EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2012:2: iv_ruleComplexEventExpression= ruleComplexEventExpression EOF
            {
             newCompositeNode(grammarAccess.getComplexEventExpressionRule()); 
            pushFollow(FOLLOW_ruleComplexEventExpression_in_entryRuleComplexEventExpression4685);
            iv_ruleComplexEventExpression=ruleComplexEventExpression();

            state._fsp--;

             current =iv_ruleComplexEventExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexEventExpression4695); 

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
    // $ANTLR end "entryRuleComplexEventExpression"


    // $ANTLR start "ruleComplexEventExpression"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2019:1: ruleComplexEventExpression returns [EObject current=null] : this_FollowsExpression_0= ruleFollowsExpression ;
    public final EObject ruleComplexEventExpression() throws RecognitionException {
        EObject current = null;

        EObject this_FollowsExpression_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2022:28: (this_FollowsExpression_0= ruleFollowsExpression )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2024:5: this_FollowsExpression_0= ruleFollowsExpression
            {
             
                    newCompositeNode(grammarAccess.getComplexEventExpressionAccess().getFollowsExpressionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleFollowsExpression_in_ruleComplexEventExpression4741);
            this_FollowsExpression_0=ruleFollowsExpression();

            state._fsp--;

             
                    current = this_FollowsExpression_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleComplexEventExpression"


    // $ANTLR start "entryRuleFollowsExpression"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2040:1: entryRuleFollowsExpression returns [EObject current=null] : iv_ruleFollowsExpression= ruleFollowsExpression EOF ;
    public final EObject entryRuleFollowsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFollowsExpression = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2041:2: (iv_ruleFollowsExpression= ruleFollowsExpression EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2042:2: iv_ruleFollowsExpression= ruleFollowsExpression EOF
            {
             newCompositeNode(grammarAccess.getFollowsExpressionRule()); 
            pushFollow(FOLLOW_ruleFollowsExpression_in_entryRuleFollowsExpression4775);
            iv_ruleFollowsExpression=ruleFollowsExpression();

            state._fsp--;

             current =iv_ruleFollowsExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFollowsExpression4785); 

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
    // $ANTLR end "entryRuleFollowsExpression"


    // $ANTLR start "ruleFollowsExpression"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2049:1: ruleFollowsExpression returns [EObject current=null] : ( ( (lv_firstEvent_0_0= ruleEventWithMultiplicity ) ) ( (lv_events_1_0= ruleEventWithFollowsOperator ) )* ) ;
    public final EObject ruleFollowsExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_firstEvent_0_0 = null;

        EObject lv_events_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2052:28: ( ( ( (lv_firstEvent_0_0= ruleEventWithMultiplicity ) ) ( (lv_events_1_0= ruleEventWithFollowsOperator ) )* ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2053:1: ( ( (lv_firstEvent_0_0= ruleEventWithMultiplicity ) ) ( (lv_events_1_0= ruleEventWithFollowsOperator ) )* )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2053:1: ( ( (lv_firstEvent_0_0= ruleEventWithMultiplicity ) ) ( (lv_events_1_0= ruleEventWithFollowsOperator ) )* )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2053:2: ( (lv_firstEvent_0_0= ruleEventWithMultiplicity ) ) ( (lv_events_1_0= ruleEventWithFollowsOperator ) )*
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2053:2: ( (lv_firstEvent_0_0= ruleEventWithMultiplicity ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2054:1: (lv_firstEvent_0_0= ruleEventWithMultiplicity )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2054:1: (lv_firstEvent_0_0= ruleEventWithMultiplicity )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2055:3: lv_firstEvent_0_0= ruleEventWithMultiplicity
            {
             
            	        newCompositeNode(grammarAccess.getFollowsExpressionAccess().getFirstEventEventWithMultiplicityParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEventWithMultiplicity_in_ruleFollowsExpression4831);
            lv_firstEvent_0_0=ruleEventWithMultiplicity();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFollowsExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"firstEvent",
                    		lv_firstEvent_0_0, 
                    		"EventWithMultiplicity");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2071:2: ( (lv_events_1_0= ruleEventWithFollowsOperator ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=48 && LA22_0<=49)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2072:1: (lv_events_1_0= ruleEventWithFollowsOperator )
            	    {
            	    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2072:1: (lv_events_1_0= ruleEventWithFollowsOperator )
            	    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2073:3: lv_events_1_0= ruleEventWithFollowsOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFollowsExpressionAccess().getEventsEventWithFollowsOperatorParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEventWithFollowsOperator_in_ruleFollowsExpression4852);
            	    lv_events_1_0=ruleEventWithFollowsOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFollowsExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"events",
            	            		lv_events_1_0, 
            	            		"EventWithFollowsOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "ruleFollowsExpression"


    // $ANTLR start "entryRuleEventWithFollowsOperator"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2097:1: entryRuleEventWithFollowsOperator returns [EObject current=null] : iv_ruleEventWithFollowsOperator= ruleEventWithFollowsOperator EOF ;
    public final EObject entryRuleEventWithFollowsOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventWithFollowsOperator = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2098:2: (iv_ruleEventWithFollowsOperator= ruleEventWithFollowsOperator EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2099:2: iv_ruleEventWithFollowsOperator= ruleEventWithFollowsOperator EOF
            {
             newCompositeNode(grammarAccess.getEventWithFollowsOperatorRule()); 
            pushFollow(FOLLOW_ruleEventWithFollowsOperator_in_entryRuleEventWithFollowsOperator4889);
            iv_ruleEventWithFollowsOperator=ruleEventWithFollowsOperator();

            state._fsp--;

             current =iv_ruleEventWithFollowsOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventWithFollowsOperator4899); 

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
    // $ANTLR end "entryRuleEventWithFollowsOperator"


    // $ANTLR start "ruleEventWithFollowsOperator"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2106:1: ruleEventWithFollowsOperator returns [EObject current=null] : ( ( (lv_operator_0_0= ruleFollowsOperator ) ) ( (lv_event_1_0= ruleEventWithMultiplicity ) ) ) ;
    public final EObject ruleEventWithFollowsOperator() throws RecognitionException {
        EObject current = null;

        EObject lv_operator_0_0 = null;

        EObject lv_event_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2109:28: ( ( ( (lv_operator_0_0= ruleFollowsOperator ) ) ( (lv_event_1_0= ruleEventWithMultiplicity ) ) ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2110:1: ( ( (lv_operator_0_0= ruleFollowsOperator ) ) ( (lv_event_1_0= ruleEventWithMultiplicity ) ) )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2110:1: ( ( (lv_operator_0_0= ruleFollowsOperator ) ) ( (lv_event_1_0= ruleEventWithMultiplicity ) ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2110:2: ( (lv_operator_0_0= ruleFollowsOperator ) ) ( (lv_event_1_0= ruleEventWithMultiplicity ) )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2110:2: ( (lv_operator_0_0= ruleFollowsOperator ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2111:1: (lv_operator_0_0= ruleFollowsOperator )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2111:1: (lv_operator_0_0= ruleFollowsOperator )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2112:3: lv_operator_0_0= ruleFollowsOperator
            {
             
            	        newCompositeNode(grammarAccess.getEventWithFollowsOperatorAccess().getOperatorFollowsOperatorParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleFollowsOperator_in_ruleEventWithFollowsOperator4945);
            lv_operator_0_0=ruleFollowsOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEventWithFollowsOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_0_0, 
                    		"FollowsOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2128:2: ( (lv_event_1_0= ruleEventWithMultiplicity ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2129:1: (lv_event_1_0= ruleEventWithMultiplicity )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2129:1: (lv_event_1_0= ruleEventWithMultiplicity )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2130:3: lv_event_1_0= ruleEventWithMultiplicity
            {
             
            	        newCompositeNode(grammarAccess.getEventWithFollowsOperatorAccess().getEventEventWithMultiplicityParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEventWithMultiplicity_in_ruleEventWithFollowsOperator4966);
            lv_event_1_0=ruleEventWithMultiplicity();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEventWithFollowsOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"event",
                    		lv_event_1_0, 
                    		"EventWithMultiplicity");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleEventWithFollowsOperator"


    // $ANTLR start "entryRuleFollowsOperator"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2154:1: entryRuleFollowsOperator returns [EObject current=null] : iv_ruleFollowsOperator= ruleFollowsOperator EOF ;
    public final EObject entryRuleFollowsOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFollowsOperator = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2155:2: (iv_ruleFollowsOperator= ruleFollowsOperator EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2156:2: iv_ruleFollowsOperator= ruleFollowsOperator EOF
            {
             newCompositeNode(grammarAccess.getFollowsOperatorRule()); 
            pushFollow(FOLLOW_ruleFollowsOperator_in_entryRuleFollowsOperator5002);
            iv_ruleFollowsOperator=ruleFollowsOperator();

            state._fsp--;

             current =iv_ruleFollowsOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFollowsOperator5012); 

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
    // $ANTLR end "entryRuleFollowsOperator"


    // $ANTLR start "ruleFollowsOperator"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2163:1: ruleFollowsOperator returns [EObject current=null] : (this_FollowsOperatorNoTW_0= ruleFollowsOperatorNoTW | this_FollowsOperatorViaTW_1= ruleFollowsOperatorViaTW ) ;
    public final EObject ruleFollowsOperator() throws RecognitionException {
        EObject current = null;

        EObject this_FollowsOperatorNoTW_0 = null;

        EObject this_FollowsOperatorViaTW_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2166:28: ( (this_FollowsOperatorNoTW_0= ruleFollowsOperatorNoTW | this_FollowsOperatorViaTW_1= ruleFollowsOperatorViaTW ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2167:1: (this_FollowsOperatorNoTW_0= ruleFollowsOperatorNoTW | this_FollowsOperatorViaTW_1= ruleFollowsOperatorViaTW )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2167:1: (this_FollowsOperatorNoTW_0= ruleFollowsOperatorNoTW | this_FollowsOperatorViaTW_1= ruleFollowsOperatorViaTW )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==48) ) {
                alt23=1;
            }
            else if ( (LA23_0==49) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2168:5: this_FollowsOperatorNoTW_0= ruleFollowsOperatorNoTW
                    {
                     
                            newCompositeNode(grammarAccess.getFollowsOperatorAccess().getFollowsOperatorNoTWParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleFollowsOperatorNoTW_in_ruleFollowsOperator5059);
                    this_FollowsOperatorNoTW_0=ruleFollowsOperatorNoTW();

                    state._fsp--;

                     
                            current = this_FollowsOperatorNoTW_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2178:5: this_FollowsOperatorViaTW_1= ruleFollowsOperatorViaTW
                    {
                     
                            newCompositeNode(grammarAccess.getFollowsOperatorAccess().getFollowsOperatorViaTWParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFollowsOperatorViaTW_in_ruleFollowsOperator5086);
                    this_FollowsOperatorViaTW_1=ruleFollowsOperatorViaTW();

                    state._fsp--;

                     
                            current = this_FollowsOperatorViaTW_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleFollowsOperator"


    // $ANTLR start "entryRuleFollowsOperatorNoTW"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2194:1: entryRuleFollowsOperatorNoTW returns [EObject current=null] : iv_ruleFollowsOperatorNoTW= ruleFollowsOperatorNoTW EOF ;
    public final EObject entryRuleFollowsOperatorNoTW() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFollowsOperatorNoTW = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2195:2: (iv_ruleFollowsOperatorNoTW= ruleFollowsOperatorNoTW EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2196:2: iv_ruleFollowsOperatorNoTW= ruleFollowsOperatorNoTW EOF
            {
             newCompositeNode(grammarAccess.getFollowsOperatorNoTWRule()); 
            pushFollow(FOLLOW_ruleFollowsOperatorNoTW_in_entryRuleFollowsOperatorNoTW5121);
            iv_ruleFollowsOperatorNoTW=ruleFollowsOperatorNoTW();

            state._fsp--;

             current =iv_ruleFollowsOperatorNoTW; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFollowsOperatorNoTW5131); 

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
    // $ANTLR end "entryRuleFollowsOperatorNoTW"


    // $ANTLR start "ruleFollowsOperatorNoTW"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2203:1: ruleFollowsOperatorNoTW returns [EObject current=null] : ( () otherlv_1= '->' ) ;
    public final EObject ruleFollowsOperatorNoTW() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2206:28: ( ( () otherlv_1= '->' ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2207:1: ( () otherlv_1= '->' )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2207:1: ( () otherlv_1= '->' )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2207:2: () otherlv_1= '->'
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2207:2: ()
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2208:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFollowsOperatorNoTWAccess().getFollowsOperatorNoTWAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleFollowsOperatorNoTW5177); 

                	newLeafNode(otherlv_1, grammarAccess.getFollowsOperatorNoTWAccess().getHyphenMinusGreaterThanSignKeyword_1());
                

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
    // $ANTLR end "ruleFollowsOperatorNoTW"


    // $ANTLR start "entryRuleFollowsOperatorViaTW"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2225:1: entryRuleFollowsOperatorViaTW returns [EObject current=null] : iv_ruleFollowsOperatorViaTW= ruleFollowsOperatorViaTW EOF ;
    public final EObject entryRuleFollowsOperatorViaTW() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFollowsOperatorViaTW = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2226:2: (iv_ruleFollowsOperatorViaTW= ruleFollowsOperatorViaTW EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2227:2: iv_ruleFollowsOperatorViaTW= ruleFollowsOperatorViaTW EOF
            {
             newCompositeNode(grammarAccess.getFollowsOperatorViaTWRule()); 
            pushFollow(FOLLOW_ruleFollowsOperatorViaTW_in_entryRuleFollowsOperatorViaTW5213);
            iv_ruleFollowsOperatorViaTW=ruleFollowsOperatorViaTW();

            state._fsp--;

             current =iv_ruleFollowsOperatorViaTW; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFollowsOperatorViaTW5223); 

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
    // $ANTLR end "entryRuleFollowsOperatorViaTW"


    // $ANTLR start "ruleFollowsOperatorViaTW"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2234:1: ruleFollowsOperatorViaTW returns [EObject current=null] : (otherlv_0= '-[' ( (lv_timewindow_1_0= RULE_INT ) ) otherlv_2= ']->' ) ;
    public final EObject ruleFollowsOperatorViaTW() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_timewindow_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2237:28: ( (otherlv_0= '-[' ( (lv_timewindow_1_0= RULE_INT ) ) otherlv_2= ']->' ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2238:1: (otherlv_0= '-[' ( (lv_timewindow_1_0= RULE_INT ) ) otherlv_2= ']->' )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2238:1: (otherlv_0= '-[' ( (lv_timewindow_1_0= RULE_INT ) ) otherlv_2= ']->' )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2238:3: otherlv_0= '-[' ( (lv_timewindow_1_0= RULE_INT ) ) otherlv_2= ']->'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleFollowsOperatorViaTW5260); 

                	newLeafNode(otherlv_0, grammarAccess.getFollowsOperatorViaTWAccess().getHyphenMinusLeftSquareBracketKeyword_0());
                
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2242:1: ( (lv_timewindow_1_0= RULE_INT ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2243:1: (lv_timewindow_1_0= RULE_INT )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2243:1: (lv_timewindow_1_0= RULE_INT )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2244:3: lv_timewindow_1_0= RULE_INT
            {
            lv_timewindow_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFollowsOperatorViaTW5277); 

            			newLeafNode(lv_timewindow_1_0, grammarAccess.getFollowsOperatorViaTWAccess().getTimewindowINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFollowsOperatorViaTWRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"timewindow",
                    		lv_timewindow_1_0, 
                    		"INT");
            	    

            }


            }

            otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleFollowsOperatorViaTW5294); 

                	newLeafNode(otherlv_2, grammarAccess.getFollowsOperatorViaTWAccess().getRightSquareBracketHyphenMinusGreaterThanSignKeyword_2());
                

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
    // $ANTLR end "ruleFollowsOperatorViaTW"


    // $ANTLR start "entryRuleEventWithMultiplicity"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2272:1: entryRuleEventWithMultiplicity returns [EObject current=null] : iv_ruleEventWithMultiplicity= ruleEventWithMultiplicity EOF ;
    public final EObject entryRuleEventWithMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventWithMultiplicity = null;


        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2273:2: (iv_ruleEventWithMultiplicity= ruleEventWithMultiplicity EOF )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2274:2: iv_ruleEventWithMultiplicity= ruleEventWithMultiplicity EOF
            {
             newCompositeNode(grammarAccess.getEventWithMultiplicityRule()); 
            pushFollow(FOLLOW_ruleEventWithMultiplicity_in_entryRuleEventWithMultiplicity5330);
            iv_ruleEventWithMultiplicity=ruleEventWithMultiplicity();

            state._fsp--;

             current =iv_ruleEventWithMultiplicity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventWithMultiplicity5340); 

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
    // $ANTLR end "entryRuleEventWithMultiplicity"


    // $ANTLR start "ruleEventWithMultiplicity"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2281:1: ruleEventWithMultiplicity returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_multiplicity_2_0= RULE_INT ) ) otherlv_3= '}' )? ) ;
    public final EObject ruleEventWithMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_multiplicity_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2284:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_multiplicity_2_0= RULE_INT ) ) otherlv_3= '}' )? ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2285:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_multiplicity_2_0= RULE_INT ) ) otherlv_3= '}' )? )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2285:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_multiplicity_2_0= RULE_INT ) ) otherlv_3= '}' )? )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2285:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_multiplicity_2_0= RULE_INT ) ) otherlv_3= '}' )?
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2285:2: ( (otherlv_0= RULE_ID ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2286:1: (otherlv_0= RULE_ID )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2286:1: (otherlv_0= RULE_ID )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2287:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEventWithMultiplicityRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventWithMultiplicity5385); 

            		newLeafNode(otherlv_0, grammarAccess.getEventWithMultiplicityAccess().getEventEventParamWithTypeCrossReference_0_0()); 
            	

            }


            }

            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2298:2: (otherlv_1= '{' ( (lv_multiplicity_2_0= RULE_INT ) ) otherlv_3= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==17) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2298:4: otherlv_1= '{' ( (lv_multiplicity_2_0= RULE_INT ) ) otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleEventWithMultiplicity5398); 

                        	newLeafNode(otherlv_1, grammarAccess.getEventWithMultiplicityAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2302:1: ( (lv_multiplicity_2_0= RULE_INT ) )
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2303:1: (lv_multiplicity_2_0= RULE_INT )
                    {
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2303:1: (lv_multiplicity_2_0= RULE_INT )
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2304:3: lv_multiplicity_2_0= RULE_INT
                    {
                    lv_multiplicity_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEventWithMultiplicity5415); 

                    			newLeafNode(lv_multiplicity_2_0, grammarAccess.getEventWithMultiplicityAccess().getMultiplicityINTTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventWithMultiplicityRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"multiplicity",
                            		lv_multiplicity_2_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleEventWithMultiplicity5432); 

                        	newLeafNode(otherlv_3, grammarAccess.getEventWithMultiplicityAccess().getRightCurlyBracketKeyword_1_2());
                        

                    }
                    break;

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
    // $ANTLR end "ruleEventWithMultiplicity"


    // $ANTLR start "ruleIQPatternChangeType"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2332:1: ruleIQPatternChangeType returns [Enumerator current=null] : ( (enumLiteral_0= 'FOUND' ) | (enumLiteral_1= 'LOST' ) ) ;
    public final Enumerator ruleIQPatternChangeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2334:28: ( ( (enumLiteral_0= 'FOUND' ) | (enumLiteral_1= 'LOST' ) ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2335:1: ( (enumLiteral_0= 'FOUND' ) | (enumLiteral_1= 'LOST' ) )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2335:1: ( (enumLiteral_0= 'FOUND' ) | (enumLiteral_1= 'LOST' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==51) ) {
                alt25=1;
            }
            else if ( (LA25_0==52) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2335:2: (enumLiteral_0= 'FOUND' )
                    {
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2335:2: (enumLiteral_0= 'FOUND' )
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2335:4: enumLiteral_0= 'FOUND'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_51_in_ruleIQPatternChangeType5484); 

                            current = grammarAccess.getIQPatternChangeTypeAccess().getFOUNDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getIQPatternChangeTypeAccess().getFOUNDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2341:6: (enumLiteral_1= 'LOST' )
                    {
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2341:6: (enumLiteral_1= 'LOST' )
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2341:8: enumLiteral_1= 'LOST'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_52_in_ruleIQPatternChangeType5501); 

                            current = grammarAccess.getIQPatternChangeTypeAccess().getLOSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getIQPatternChangeTypeAccess().getLOSTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

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
    // $ANTLR end "ruleIQPatternChangeType"


    // $ANTLR start "ruleContext"
    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2351:1: ruleContext returns [Enumerator current=null] : ( (enumLiteral_0= 'Chronicle' ) | (enumLiteral_1= 'Recent' ) | (enumLiteral_2= 'Unrestricted' ) ) ;
    public final Enumerator ruleContext() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2353:28: ( ( (enumLiteral_0= 'Chronicle' ) | (enumLiteral_1= 'Recent' ) | (enumLiteral_2= 'Unrestricted' ) ) )
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2354:1: ( (enumLiteral_0= 'Chronicle' ) | (enumLiteral_1= 'Recent' ) | (enumLiteral_2= 'Unrestricted' ) )
            {
            // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2354:1: ( (enumLiteral_0= 'Chronicle' ) | (enumLiteral_1= 'Recent' ) | (enumLiteral_2= 'Unrestricted' ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt26=1;
                }
                break;
            case 54:
                {
                alt26=2;
                }
                break;
            case 55:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2354:2: (enumLiteral_0= 'Chronicle' )
                    {
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2354:2: (enumLiteral_0= 'Chronicle' )
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2354:4: enumLiteral_0= 'Chronicle'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_53_in_ruleContext5546); 

                            current = grammarAccess.getContextAccess().getChronicleEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getContextAccess().getChronicleEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2360:6: (enumLiteral_1= 'Recent' )
                    {
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2360:6: (enumLiteral_1= 'Recent' )
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2360:8: enumLiteral_1= 'Recent'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_54_in_ruleContext5563); 

                            current = grammarAccess.getContextAccess().getRecentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getContextAccess().getRecentEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2366:6: (enumLiteral_2= 'Unrestricted' )
                    {
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2366:6: (enumLiteral_2= 'Unrestricted' )
                    // ../hu.bme.mit.incquery.edl/src-gen/hu/bme/mit/incquery/vedl/parser/antlr/internal/InternalEdl.g:2366:8: enumLiteral_2= 'Unrestricted'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_55_in_ruleContext5580); 

                            current = grammarAccess.getContextAccess().getUnrestrictedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getContextAccess().getUnrestrictedEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

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
    // $ANTLR end "ruleContext"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA8_eotS =
        "\21\uffff";
    static final String DFA8_eofS =
        "\21\uffff";
    static final String DFA8_minS =
        "\1\23\3\35\2\uffff\1\65\2\4\5\36\3\23";
    static final String DFA8_maxS =
        "\1\41\3\35\2\uffff\1\67\2\4\5\36\3\41";
    static final String DFA8_acceptS =
        "\4\uffff\1\1\1\2\13\uffff";
    static final String DFA8_specialS =
        "\21\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\4\5\uffff\1\4\2\uffff\1\5\2\uffff\1\1\1\2\1\3",
            "\1\6",
            "\1\7",
            "\1\10",
            "",
            "",
            "\1\11\1\12\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\4\10\uffff\1\5\2\uffff\1\1\1\2\1\3",
            "\1\4\10\uffff\1\5\2\uffff\1\1\1\2\1\3",
            "\1\4\10\uffff\1\5\2\uffff\1\1\1\2\1\3"
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "503:1: (this_AbstractAtomicEvent_0= ruleAbstractAtomicEvent | this_ComplexEvent_1= ruleComplexEvent )";
        }
    }
    static final String DFA18_eotS =
        "\25\uffff";
    static final String DFA18_eofS =
        "\25\uffff";
    static final String DFA18_minS =
        "\1\35\2\4\2\14\4\4\1\43\1\14\1\43\1\14\1\4\2\uffff\1\4\2\uffff"+
        "\2\36";
    static final String DFA18_maxS =
        "\1\45\2\4\2\43\4\4\1\43\1\44\1\43\1\44\1\4\2\uffff\1\4\2\uffff"+
        "\2\44";
    static final String DFA18_acceptS =
        "\16\uffff\1\1\1\2\1\uffff\1\3\1\4\2\uffff";
    static final String DFA18_specialS =
        "\25\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1\7\uffff\1\2",
            "\1\3",
            "\1\4",
            "\1\5\26\uffff\1\6",
            "\1\7\26\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\6",
            "\1\15\21\uffff\1\16\5\uffff\1\17",
            "\1\10",
            "\1\20\21\uffff\1\21\5\uffff\1\22",
            "\1\23",
            "",
            "",
            "\1\24",
            "",
            "",
            "\1\16\5\uffff\1\17",
            "\1\21\5\uffff\1\22"
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1425:1: (this_OpenOpen_0= ruleOpenOpen | this_OpenClosed_1= ruleOpenClosed | this_ClosedClosed_2= ruleClosedClosed | this_ClosedOpen_3= ruleClosedOpen )";
        }
    }
 

    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePackageDeclaration122 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDeclaration143 = new BitSet(new long[]{0x000000038001C000L});
    public static final BitSet FOLLOW_ruleUsage_in_rulePackageDeclaration164 = new BitSet(new long[]{0x000000038001C000L});
    public static final BitSet FOLLOW_ruleModel_in_rulePackageDeclaration186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOUBLE234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE274 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleDOUBLE293 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName407 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedName426 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName441 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard547 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleQualifiedNameWithWildcard566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsage_in_entryRuleUsage608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsage618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIQUsage_in_ruleUsage665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventSourceUsage_in_ruleUsage692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIQUsage_in_entryRuleIQUsage727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIQUsage737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleIQUsage774 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleIQUsage795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventSourceUsage_in_entryRuleEventSourceUsage831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventSourceUsage841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleEventSourceUsage878 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleEventSourceUsage899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotations_in_ruleModel1001 = new BitSet(new long[]{0x0000000380010000L});
    public static final BitSet FOLLOW_16_in_ruleModel1014 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel1031 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleModel1048 = new BitSet(new long[]{0x00000003920C0000L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleModel1069 = new BitSet(new long[]{0x00000003920C0000L});
    public static final BitSet FOLLOW_18_in_ruleModel1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent1122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractAtomicEvent_in_ruleEvent1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexEvent_in_ruleEvent1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractAtomicEvent_in_entryRuleAbstractAtomicEvent1241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractAtomicEvent1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicEvent_in_ruleAbstractAtomicEvent1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIQPatternEvent_in_ruleAbstractAtomicEvent1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicEvent_in_entryRuleAtomicEvent1360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicEvent1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotations_in_ruleAtomicEvent1416 = new BitSet(new long[]{0x0000000380080000L});
    public static final BitSet FOLLOW_19_in_ruleAtomicEvent1429 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicEvent1446 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAtomicEvent1463 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAtomicEvent1475 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAtomicEvent1487 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAtomicEvent1499 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtomicEvent1516 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAtomicEvent1533 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAtomicEvent1545 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicEvent1565 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAtomicEvent1577 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAtomicEvent1589 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameterFilter_in_ruleAtomicEvent1610 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_18_in_ruleAtomicEvent1623 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAtomicEvent1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIQPatternEvent_in_entryRuleIQPatternEvent1671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIQPatternEvent1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleIQPatternEvent1718 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIQPatternEvent1735 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleIQPatternEvent1752 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIQPatternEvent1764 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleIQPatternEvent1776 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIQPatternEvent1788 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIQPatternEvent1805 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleIQPatternEvent1822 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIQPatternEvent1834 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_ruleIQPatternChangeType_in_ruleIQPatternEvent1855 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIQPatternEvent1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexEvent_in_entryRuleComplexEvent1903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexEvent1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotations_in_ruleComplexEvent1959 = new BitSet(new long[]{0x0000000390000000L});
    public static final BitSet FOLLOW_28_in_ruleComplexEvent1972 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComplexEvent1989 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleCEParamlist_in_ruleComplexEvent2015 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleComplexEvent2027 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_ruleComplexEventExpression_in_ruleComplexEvent2048 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_18_in_ruleComplexEvent2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCEParamlist_in_entryRuleCEParamlist2097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCEParamlist2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCEParamlist2153 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_ruleEventParamWithType_in_ruleCEParamlist2174 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_30_in_ruleCEParamlist2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventParamWithType_in_entryRuleEventParamWithType2223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventParamWithType2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventParamWithType2275 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleEventParamWithType2292 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventParamWithType2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterFilter_in_entryRuleParameterFilter2348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterFilter2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterFilter2400 = new BitSet(new long[]{0x0000FFC400000000L});
    public static final BitSet FOLLOW_ruleParameterFilterRule_in_ruleParameterFilter2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotations_in_entryRuleAnnotations2462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotations2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextAnnotation_in_ruleAnnotations2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSamplingAnnotation_in_ruleAnnotations2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePriorityAnnotation_in_ruleAnnotations2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextAnnotation_in_entryRuleContextAnnotation2608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextAnnotation2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleContextAnnotation2655 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleContextAnnotation2667 = new BitSet(new long[]{0x00E0000000000000L});
    public static final BitSet FOLLOW_ruleContext_in_ruleContextAnnotation2688 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleContextAnnotation2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSamplingAnnotation_in_entryRuleSamplingAnnotation2736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSamplingAnnotation2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleSamplingAnnotation2783 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleSamplingAnnotation2795 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSamplingAnnotation2812 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSamplingAnnotation2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePriorityAnnotation_in_entryRulePriorityAnnotation2865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePriorityAnnotation2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rulePriorityAnnotation2912 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulePriorityAnnotation2924 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePriorityAnnotation2941 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePriorityAnnotation2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterFilterRule_in_entryRuleParameterFilterRule2994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterFilterRule3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeFilter_in_ruleParameterFilterRule3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericFilter_in_ruleParameterFilterRule3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralFilter_in_ruleParameterFilterRule3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeFilter_in_entryRuleRangeFilter3140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRangeFilter3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegationOpartor_in_ruleRangeFilter3196 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleRangeFilter3209 = new BitSet(new long[]{0x0000002020000000L});
    public static final BitSet FOLLOW_ruleRange_in_ruleRangeFilter3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_entryRuleRange3266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRange3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenOpen_in_ruleRange3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenClosed_in_ruleRange3350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClosedClosed_in_ruleRange3377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClosedOpen_in_ruleRange3404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenOpen_in_entryRuleOpenOpen3439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpenOpen3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpenOpen3486 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleOpenOpen3507 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleOpenOpen3519 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleOpenOpen3540 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleOpenOpen3552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenClosed_in_entryRuleOpenClosed3588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpenClosed3598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpenClosed3635 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleOpenClosed3656 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleOpenClosed3668 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleOpenClosed3689 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleOpenClosed3701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClosedClosed_in_entryRuleClosedClosed3737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClosedClosed3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleClosedClosed3784 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleClosedClosed3805 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleClosedClosed3817 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleClosedClosed3838 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleClosedClosed3850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClosedOpen_in_entryRuleClosedOpen3886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClosedOpen3896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleClosedOpen3933 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleClosedOpen3954 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleClosedOpen3966 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleClosedOpen3987 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleClosedOpen3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericFilter_in_entryRuleNumericFilter4035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericFilter4045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericOperator_in_ruleNumericFilter4091 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleNumericFilter4112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericOperator_in_entryRuleNumericOperator4149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericOperator4160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleNumericOperator4198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleNumericOperator4217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleNumericOperator4236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleNumericOperator4255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleNumericOperator4274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleNumericOperator4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralFilter_in_entryRuleLiteralFilter4333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralFilter4343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegationOpartor_in_ruleLiteralFilter4389 = new BitSet(new long[]{0x0000FFC400000000L});
    public static final BitSet FOLLOW_ruleLiteralOperator_in_ruleLiteralFilter4411 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteralFilter4428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralOperator_in_entryRuleLiteralOperator4470 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralOperator4481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleLiteralOperator4519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleLiteralOperator4538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleLiteralOperator4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegationOpartor_in_entryRuleNegationOpartor4598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegationOpartor4609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleNegationOpartor4646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexEventExpression_in_entryRuleComplexEventExpression4685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexEventExpression4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFollowsExpression_in_ruleComplexEventExpression4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFollowsExpression_in_entryRuleFollowsExpression4775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFollowsExpression4785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventWithMultiplicity_in_ruleFollowsExpression4831 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_ruleEventWithFollowsOperator_in_ruleFollowsExpression4852 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_ruleEventWithFollowsOperator_in_entryRuleEventWithFollowsOperator4889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventWithFollowsOperator4899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFollowsOperator_in_ruleEventWithFollowsOperator4945 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEventWithMultiplicity_in_ruleEventWithFollowsOperator4966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFollowsOperator_in_entryRuleFollowsOperator5002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFollowsOperator5012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFollowsOperatorNoTW_in_ruleFollowsOperator5059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFollowsOperatorViaTW_in_ruleFollowsOperator5086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFollowsOperatorNoTW_in_entryRuleFollowsOperatorNoTW5121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFollowsOperatorNoTW5131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleFollowsOperatorNoTW5177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFollowsOperatorViaTW_in_entryRuleFollowsOperatorViaTW5213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFollowsOperatorViaTW5223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleFollowsOperatorViaTW5260 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFollowsOperatorViaTW5277 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleFollowsOperatorViaTW5294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventWithMultiplicity_in_entryRuleEventWithMultiplicity5330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventWithMultiplicity5340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventWithMultiplicity5385 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleEventWithMultiplicity5398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEventWithMultiplicity5415 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEventWithMultiplicity5432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleIQPatternChangeType5484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleIQPatternChangeType5501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleContext5546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleContext5563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleContext5580 = new BitSet(new long[]{0x0000000000000002L});

}
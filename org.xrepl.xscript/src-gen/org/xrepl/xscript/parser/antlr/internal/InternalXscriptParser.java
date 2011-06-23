package org.xrepl.xscript.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xrepl.xscript.services.XscriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalXscriptParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'create'", "'.'", "'*'", "'import'", "'static'", "'extension'", "'as'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'-'", "'**'", "'/'", "'%'", "'!'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "'if'", "'else'", "'switch'", "':'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "';'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
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
    public static final int T__59=59;
    public static final int RULE_INT=6;
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
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;
    public static final int T__74=74;
    public static final int T__73=73;

    // delegates
    // delegators


        public InternalXscriptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXscriptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXscriptParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g"; }



     	private XscriptGrammarAccess grammarAccess;
     	
        public InternalXscriptParser(TokenStream input, XscriptGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "XScript";	
       	}
       	
       	@Override
       	protected XscriptGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleXScript"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:67:1: entryRuleXScript returns [EObject current=null] : iv_ruleXScript= ruleXScript EOF ;
    public final EObject entryRuleXScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXScript = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:68:2: (iv_ruleXScript= ruleXScript EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:69:2: iv_ruleXScript= ruleXScript EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXScriptRule()); 
            }
            pushFollow(FOLLOW_ruleXScript_in_entryRuleXScript75);
            iv_ruleXScript=ruleXScript();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXScript; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXScript85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXScript"


    // $ANTLR start "ruleXScript"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:76:1: ruleXScript returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpression ) ) | ( (lv_expressions_2_0= ruleXScriptExpression ) ) | ( (lv_expressions_3_0= ruleXVariableDeclaration ) ) )* ) ;
    public final EObject ruleXScript() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_1_0 = null;

        EObject lv_expressions_2_0 = null;

        EObject lv_expressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:79:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpression ) ) | ( (lv_expressions_2_0= ruleXScriptExpression ) ) | ( (lv_expressions_3_0= ruleXVariableDeclaration ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:80:1: ( () ( ( (lv_expressions_1_0= ruleXExpression ) ) | ( (lv_expressions_2_0= ruleXScriptExpression ) ) | ( (lv_expressions_3_0= ruleXVariableDeclaration ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:80:1: ( () ( ( (lv_expressions_1_0= ruleXExpression ) ) | ( (lv_expressions_2_0= ruleXScriptExpression ) ) | ( (lv_expressions_3_0= ruleXVariableDeclaration ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:80:2: () ( ( (lv_expressions_1_0= ruleXExpression ) ) | ( (lv_expressions_2_0= ruleXScriptExpression ) ) | ( (lv_expressions_3_0= ruleXVariableDeclaration ) ) )*
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:80:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:81:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXScriptAccess().getXScriptAction_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:86:2: ( ( (lv_expressions_1_0= ruleXExpression ) ) | ( (lv_expressions_2_0= ruleXScriptExpression ) ) | ( (lv_expressions_3_0= ruleXVariableDeclaration ) ) )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case RULE_ID:
                case RULE_STRING:
                case RULE_INT:
                case 11:
                case 28:
                case 31:
                case 32:
                case 36:
                case 40:
                case 42:
                case 45:
                case 47:
                case 49:
                case 53:
                case 54:
                case 55:
                case 59:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    {
                    alt1=1;
                    }
                    break;
                case 14:
                    {
                    alt1=2;
                    }
                    break;
                case 57:
                case 58:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:86:3: ( (lv_expressions_1_0= ruleXExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:86:3: ( (lv_expressions_1_0= ruleXExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:87:1: (lv_expressions_1_0= ruleXExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:87:1: (lv_expressions_1_0= ruleXExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:88:3: lv_expressions_1_0= ruleXExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXScriptAccess().getExpressionsXExpressionParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXScript141);
            	    lv_expressions_1_0=ruleXExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXScriptRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:105:6: ( (lv_expressions_2_0= ruleXScriptExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:105:6: ( (lv_expressions_2_0= ruleXScriptExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:106:1: (lv_expressions_2_0= ruleXScriptExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:106:1: (lv_expressions_2_0= ruleXScriptExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:107:3: lv_expressions_2_0= ruleXScriptExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXScriptAccess().getExpressionsXScriptExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXScriptExpression_in_ruleXScript168);
            	    lv_expressions_2_0=ruleXScriptExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXScriptRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XScriptExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:124:6: ( (lv_expressions_3_0= ruleXVariableDeclaration ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:124:6: ( (lv_expressions_3_0= ruleXVariableDeclaration ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:125:1: (lv_expressions_3_0= ruleXVariableDeclaration )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:125:1: (lv_expressions_3_0= ruleXVariableDeclaration )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:126:3: lv_expressions_3_0= ruleXVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXScriptAccess().getExpressionsXVariableDeclarationParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXScript195);
            	    lv_expressions_3_0=ruleXVariableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXScriptRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_3_0, 
            	              		"XVariableDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXScript"


    // $ANTLR start "entryRuleXScriptExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:150:1: entryRuleXScriptExpression returns [EObject current=null] : iv_ruleXScriptExpression= ruleXScriptExpression EOF ;
    public final EObject entryRuleXScriptExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXScriptExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:151:2: (iv_ruleXScriptExpression= ruleXScriptExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:152:2: iv_ruleXScriptExpression= ruleXScriptExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXScriptExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXScriptExpression_in_entryRuleXScriptExpression233);
            iv_ruleXScriptExpression=ruleXScriptExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXScriptExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXScriptExpression243); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXScriptExpression"


    // $ANTLR start "ruleXScriptExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:159:1: ruleXScriptExpression returns [EObject current=null] : (this_XImport_0= ruleXImport | this_XEPackageImport_1= ruleXEPackageImport ) ;
    public final EObject ruleXScriptExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XImport_0 = null;

        EObject this_XEPackageImport_1 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:162:28: ( (this_XImport_0= ruleXImport | this_XEPackageImport_1= ruleXEPackageImport ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:163:1: (this_XImport_0= ruleXImport | this_XEPackageImport_1= ruleXEPackageImport )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:163:1: (this_XImport_0= ruleXImport | this_XEPackageImport_1= ruleXEPackageImport )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_STRING) ) {
                    alt2=2;
                }
                else if ( (LA2_1==RULE_ID||LA2_1==15) ) {
                    alt2=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:164:5: this_XImport_0= ruleXImport
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXScriptExpressionAccess().getXImportParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXImport_in_ruleXScriptExpression290);
                    this_XImport_0=ruleXImport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XImport_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:174:5: this_XEPackageImport_1= ruleXEPackageImport
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXScriptExpressionAccess().getXEPackageImportParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXEPackageImport_in_ruleXScriptExpression317);
                    this_XEPackageImport_1=ruleXEPackageImport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XEPackageImport_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXScriptExpression"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:190:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:191:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:192:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression352);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression362); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:199:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression | this_XNewEObject_13= ruleXNewEObject ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XFeatureCall_3 = null;

        EObject this_XLiteral_4 = null;

        EObject this_XIfExpression_5 = null;

        EObject this_XForLoopExpression_6 = null;

        EObject this_XWhileExpression_7 = null;

        EObject this_XDoWhileExpression_8 = null;

        EObject this_XThrowExpression_9 = null;

        EObject this_XReturnExpression_10 = null;

        EObject this_XTryCatchFinallyExpression_11 = null;

        EObject this_XParenthesizedExpression_12 = null;

        EObject this_XNewEObject_13 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:202:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression | this_XNewEObject_13= ruleXNewEObject ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:203:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression | this_XNewEObject_13= ruleXNewEObject )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:203:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression | this_XNewEObject_13= ruleXNewEObject )
            int alt3=14;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt3=1;
                }
                break;
            case 49:
                {
                alt3=2;
                }
                break;
            case 47:
                {
                alt3=3;
                }
                break;
            case RULE_ID:
            case 28:
            case 59:
                {
                alt3=4;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case 42:
            case 62:
            case 63:
            case 64:
            case 65:
                {
                alt3=5;
                }
                break;
            case 45:
                {
                alt3=6;
                }
                break;
            case 53:
                {
                alt3=7;
                }
                break;
            case 54:
                {
                alt3=8;
                }
                break;
            case 55:
                {
                alt3=9;
                }
                break;
            case 66:
                {
                alt3=10;
                }
                break;
            case 67:
                {
                alt3=11;
                }
                break;
            case 68:
                {
                alt3=12;
                }
                break;
            case 40:
                {
                alt3=13;
                }
                break;
            case 11:
                {
                alt3=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:204:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression409);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:214:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression436);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:224:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression463);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:234:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression490);
                    this_XFeatureCall_3=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:244:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression517);
                    this_XLiteral_4=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:254:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression544);
                    this_XIfExpression_5=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:264:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression571);
                    this_XForLoopExpression_6=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:274:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression598);
                    this_XWhileExpression_7=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:284:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression625);
                    this_XDoWhileExpression_8=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:294:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression652);
                    this_XThrowExpression_9=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:304:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression679);
                    this_XReturnExpression_10=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:314:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression706);
                    this_XTryCatchFinallyExpression_11=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:324:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression733);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:334:5: this_XNewEObject_13= ruleXNewEObject
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXNewEObjectParserRuleCall_13()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNewEObject_in_ruleXPrimaryExpression760);
                    this_XNewEObject_13=ruleXNewEObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNewEObject_13; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXNewEObject"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:350:1: entryRuleXNewEObject returns [EObject current=null] : iv_ruleXNewEObject= ruleXNewEObject EOF ;
    public final EObject entryRuleXNewEObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNewEObject = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:351:2: (iv_ruleXNewEObject= ruleXNewEObject EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:352:2: iv_ruleXNewEObject= ruleXNewEObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNewEObjectRule()); 
            }
            pushFollow(FOLLOW_ruleXNewEObject_in_entryRuleXNewEObject795);
            iv_ruleXNewEObject=ruleXNewEObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNewEObject; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNewEObject805); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXNewEObject"


    // $ANTLR start "ruleXNewEObject"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:359:1: ruleXNewEObject returns [EObject current=null] : (otherlv_0= 'create' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleXNewEObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:362:28: ( (otherlv_0= 'create' ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:363:1: (otherlv_0= 'create' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:363:1: (otherlv_0= 'create' ( (otherlv_1= RULE_ID ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:363:3: otherlv_0= 'create' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleXNewEObject842); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXNewEObjectAccess().getCreateKeyword_0());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:367:1: ( (otherlv_1= RULE_ID ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:368:1: (otherlv_1= RULE_ID )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:368:1: (otherlv_1= RULE_ID )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:369:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXNewEObjectRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXNewEObject862); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getXNewEObjectAccess().getTypeEClassCrossReference_1_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXNewEObject"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:388:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:389:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:390:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard899);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildCard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard910); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:397:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:400:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:401:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:401:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:402:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard957);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:412:1: (kw= '.' kw= '*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:413:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleQualifiedNameWithWildCard976); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleQualifiedNameWithWildCard989); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRuleXImport"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:432:1: entryRuleXImport returns [EObject current=null] : iv_ruleXImport= ruleXImport EOF ;
    public final EObject entryRuleXImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXImport = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:433:2: (iv_ruleXImport= ruleXImport EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:434:2: iv_ruleXImport= ruleXImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXImportRule()); 
            }
            pushFollow(FOLLOW_ruleXImport_in_entryRuleXImport1031);
            iv_ruleXImport=ruleXImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXImport1041); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXImport"


    // $ANTLR start "ruleXImport"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:441:1: ruleXImport returns [EObject current=null] : (otherlv_0= 'import' ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? )? ( (lv_importedNamespace_3_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleXImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_static_1_0=null;
        Token lv_extension_2_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:444:28: ( (otherlv_0= 'import' ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? )? ( (lv_importedNamespace_3_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:445:1: (otherlv_0= 'import' ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? )? ( (lv_importedNamespace_3_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:445:1: (otherlv_0= 'import' ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? )? ( (lv_importedNamespace_3_0= ruleQualifiedNameWithWildCard ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:445:3: otherlv_0= 'import' ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? )? ( (lv_importedNamespace_3_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleXImport1078); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXImportAccess().getImportKeyword_0());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:449:1: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:449:2: ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )?
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:449:2: ( (lv_static_1_0= 'static' ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:450:1: (lv_static_1_0= 'static' )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:450:1: (lv_static_1_0= 'static' )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:451:3: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,15,FOLLOW_15_in_ruleXImport1097); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_static_1_0, grammarAccess.getXImportAccess().getStaticStaticKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXImportRule());
                      	        }
                             		setWithLastConsumed(current, "static", true, "static");
                      	    
                    }

                    }


                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:464:2: ( (lv_extension_2_0= 'extension' ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==16) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:465:1: (lv_extension_2_0= 'extension' )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:465:1: (lv_extension_2_0= 'extension' )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:466:3: lv_extension_2_0= 'extension'
                            {
                            lv_extension_2_0=(Token)match(input,16,FOLLOW_16_in_ruleXImport1128); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_extension_2_0, grammarAccess.getXImportAccess().getExtensionExtensionKeyword_1_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getXImportRule());
                              	        }
                                     		setWithLastConsumed(current, "extension", true, "extension");
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:479:5: ( (lv_importedNamespace_3_0= ruleQualifiedNameWithWildCard ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:480:1: (lv_importedNamespace_3_0= ruleQualifiedNameWithWildCard )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:480:1: (lv_importedNamespace_3_0= ruleQualifiedNameWithWildCard )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:481:3: lv_importedNamespace_3_0= ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleXImport1165);
            lv_importedNamespace_3_0=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_3_0, 
                      		"QualifiedNameWithWildCard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXImport"


    // $ANTLR start "entryRuleXEPackageImport"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:505:1: entryRuleXEPackageImport returns [EObject current=null] : iv_ruleXEPackageImport= ruleXEPackageImport EOF ;
    public final EObject entryRuleXEPackageImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEPackageImport = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:506:2: (iv_ruleXEPackageImport= ruleXEPackageImport EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:507:2: iv_ruleXEPackageImport= ruleXEPackageImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEPackageImportRule()); 
            }
            pushFollow(FOLLOW_ruleXEPackageImport_in_entryRuleXEPackageImport1201);
            iv_ruleXEPackageImport=ruleXEPackageImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEPackageImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEPackageImport1211); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXEPackageImport"


    // $ANTLR start "ruleXEPackageImport"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:514:1: ruleXEPackageImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_nsUri_1_0= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleXEPackageImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nsUri_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:517:28: ( (otherlv_0= 'import' ( (lv_nsUri_1_0= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:518:1: (otherlv_0= 'import' ( (lv_nsUri_1_0= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:518:1: (otherlv_0= 'import' ( (lv_nsUri_1_0= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:518:3: otherlv_0= 'import' ( (lv_nsUri_1_0= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleXEPackageImport1248); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXEPackageImportAccess().getImportKeyword_0());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:522:1: ( (lv_nsUri_1_0= RULE_STRING ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:523:1: (lv_nsUri_1_0= RULE_STRING )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:523:1: (lv_nsUri_1_0= RULE_STRING )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:524:3: lv_nsUri_1_0= RULE_STRING
            {
            lv_nsUri_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXEPackageImport1265); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_nsUri_1_0, grammarAccess.getXEPackageImportAccess().getNsUriSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXEPackageImportRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"nsUri",
                      		lv_nsUri_1_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:540:2: (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:540:4: otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleXEPackageImport1283); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXEPackageImportAccess().getAsKeyword_2_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:544:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:545:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:545:1: (lv_name_3_0= RULE_ID )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:546:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXEPackageImport1300); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_3_0, grammarAccess.getXEPackageImportAccess().getNameIDTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXEPackageImportRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_3_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXEPackageImport"


    // $ANTLR start "entryRuleXExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:570:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:571:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:572:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression1343);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression1353); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:579:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:582:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:584:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression1399);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:600:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:601:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:602:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment1433);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment1443); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:609:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:612:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:613:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:613:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==EOF||(LA9_1>=RULE_ID && LA9_1<=RULE_INT)||(LA9_1>=11 && LA9_1<=14)||LA9_1==17||(LA9_1>=19 && LA9_1<=42)||(LA9_1>=44 && LA9_1<=71)) ) {
                    alt9=2;
                }
                else if ( (LA9_1==18) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_INT)||LA9_0==11||LA9_0==28||(LA9_0>=31 && LA9_0<=32)||LA9_0==36||LA9_0==40||LA9_0==42||LA9_0==45||LA9_0==47||LA9_0==49||(LA9_0>=53 && LA9_0<=55)||LA9_0==59||(LA9_0>=61 && LA9_0<=68)) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:613:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:613:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:613:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:613:3: ()
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:614:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:619:2: ( ( ruleValidID ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:620:1: ( ruleValidID )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:620:1: ( ruleValidID )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:621:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment1501);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1517);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:642:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:643:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:643:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:644:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1537);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:661:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:661:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:662:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1567);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:670:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==19) ) {
                        int LA8_1 = input.LA(2);

                        if ( (synpred1_InternalXscript()) ) {
                            alt8=1;
                        }
                    }
                    switch (alt8) {
                        case 1 :
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:670:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:670:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:670:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:675:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:675:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:675:7: ()
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:676:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:681:2: ( ( ruleOpMultiAssign ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:682:1: ( ruleOpMultiAssign )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:682:1: ( ruleOpMultiAssign )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:683:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1620);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:696:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:697:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:697:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:698:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1643);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:722:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:723:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:724:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1683);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1694); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:731:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:734:28: (kw= '=' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:736:2: kw= '='
            {
            kw=(Token)match(input,18,FOLLOW_18_in_ruleOpSingleAssign1731); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:749:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:750:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:751:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1771);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1782); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:758:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:761:28: (kw= '+=' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:763:2: kw= '+='
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleOpMultiAssign1819); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:776:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:777:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:778:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1858);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1868); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:785:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:788:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:789:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:789:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:790:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1915);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:798:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    int LA10_2 = input.LA(2);

                    if ( (synpred2_InternalXscript()) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:798:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:798:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:798:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:803:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:803:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:803:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:804:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:809:2: ( ( ruleOpOr ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:810:1: ( ruleOpOr )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:810:1: ( ruleOpOr )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:811:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1968);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:824:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:825:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:825:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:826:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1991);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:850:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:851:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:852:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr2030);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr2041); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:859:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:862:28: (kw= '||' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:864:2: kw= '||'
            {
            kw=(Token)match(input,20,FOLLOW_20_in_ruleOpOr2078); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:877:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:878:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:879:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2117);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression2127); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:886:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:889:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:890:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:890:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:891:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2174);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:899:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    int LA11_2 = input.LA(2);

                    if ( (synpred3_InternalXscript()) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:899:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:899:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:899:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:904:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:904:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:904:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:905:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:910:2: ( ( ruleOpAnd ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:911:1: ( ruleOpAnd )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:911:1: ( ruleOpAnd )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:912:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression2227);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:925:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:926:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:926:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:927:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2250);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:951:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:952:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:953:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd2289);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd2300); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:960:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:963:28: (kw= '&&' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:965:2: kw= '&&'
            {
            kw=(Token)match(input,21,FOLLOW_21_in_ruleOpAnd2337); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:978:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:979:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:980:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2376);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression2386); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:987:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:990:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:991:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:991:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:992:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2433);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1000:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred4_InternalXscript()) ) {
                        alt12=1;
                    }


                }
                else if ( (LA12_0==23) ) {
                    int LA12_3 = input.LA(2);

                    if ( (synpred4_InternalXscript()) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1000:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1000:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1000:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1005:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1005:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1005:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1006:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1011:2: ( ( ruleOpEquality ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1012:1: ( ruleOpEquality )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1012:1: ( ruleOpEquality )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1013:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2486);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1026:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1027:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1027:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1028:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2509);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1052:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1053:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1054:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2548);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2559); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1061:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1064:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1065:1: (kw= '==' | kw= '!=' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1065:1: (kw= '==' | kw= '!=' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            else if ( (LA13_0==23) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1066:2: kw= '=='
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleOpEquality2597); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1073:2: kw= '!='
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpEquality2616); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1086:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1087:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1088:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2656);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2666); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1095:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1098:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1099:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1099:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1100:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2713);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1108:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop14:
            do {
                int alt14=3;
                switch ( input.LA(1) ) {
                case 28:
                    {
                    int LA14_2 = input.LA(2);

                    if ( (synpred6_InternalXscript()) ) {
                        alt14=2;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA14_3 = input.LA(2);

                    if ( (synpred5_InternalXscript()) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA14_4 = input.LA(2);

                    if ( (synpred6_InternalXscript()) ) {
                        alt14=2;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA14_5 = input.LA(2);

                    if ( (synpred6_InternalXscript()) ) {
                        alt14=2;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA14_6 = input.LA(2);

                    if ( (synpred6_InternalXscript()) ) {
                        alt14=2;
                    }


                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1108:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1108:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1108:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1108:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1108:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1110:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1110:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1110:6: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1111:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleXRelationalExpression2749); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1120:3: ( ( ruleQualifiedName ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1121:1: ( ruleQualifiedName )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1121:1: ( ruleQualifiedName )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1122:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2774);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1136:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1136:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1136:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1136:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1136:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1141:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1141:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1141:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1142:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1147:2: ( ( ruleOpCompare ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1148:1: ( ruleOpCompare )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1148:1: ( ruleOpCompare )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1149:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2835);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1162:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1163:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1163:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1164:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2858);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1188:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1189:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1190:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2898);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2909); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1197:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1200:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1201:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1201:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt15=1;
                }
                break;
            case 26:
                {
                alt15=2;
                }
                break;
            case 27:
                {
                alt15=3;
                }
                break;
            case 28:
                {
                alt15=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1202:2: kw= '>='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpCompare2947); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1209:2: kw= '<='
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpCompare2966); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1216:2: kw= '>'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpCompare2985); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1223:2: kw= '<'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpCompare3004); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1236:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1237:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1238:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3044);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3054); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1245:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1248:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1249:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1249:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1250:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3101);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1258:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred7_InternalXscript()) ) {
                        alt16=1;
                    }


                }
                else if ( (LA16_0==30) ) {
                    int LA16_3 = input.LA(2);

                    if ( (synpred7_InternalXscript()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1258:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1258:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1258:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1263:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1263:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1263:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1264:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1269:2: ( ( ruleOpOther ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1270:1: ( ruleOpOther )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1270:1: ( ruleOpOther )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1271:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3154);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1284:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1285:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1285:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1286:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3177);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1310:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1311:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1312:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther3216);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther3227); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1319:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1322:28: ( (kw= '->' | kw= '..' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1323:1: (kw= '->' | kw= '..' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1323:1: (kw= '->' | kw= '..' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            else if ( (LA17_0==30) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1324:2: kw= '->'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther3265); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1331:2: kw= '..'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOther3284); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1344:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1345:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1346:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3324);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression3334); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1353:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1356:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1357:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1357:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1358:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3381);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1366:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==32) ) {
                    int LA18_2 = input.LA(2);

                    if ( (synpred8_InternalXscript()) ) {
                        alt18=1;
                    }


                }
                else if ( (LA18_0==31) ) {
                    int LA18_3 = input.LA(2);

                    if ( (synpred8_InternalXscript()) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1366:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1366:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1366:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1371:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1371:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1371:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1372:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1377:2: ( ( ruleOpAdd ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1378:1: ( ruleOpAdd )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1378:1: ( ruleOpAdd )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1379:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3434);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1392:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1393:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1393:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1394:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3457);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1418:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1419:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1420:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3496);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3507); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1427:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1430:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1431:1: (kw= '+' | kw= '-' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1431:1: (kw= '+' | kw= '-' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            else if ( (LA19_0==32) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1432:2: kw= '+'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpAdd3545); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1439:2: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpAdd3564); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1452:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1453:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1454:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3604);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3614); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1461:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1464:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1465:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1465:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1466:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3661);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1474:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop20:
            do {
                int alt20=2;
                switch ( input.LA(1) ) {
                case 13:
                    {
                    int LA20_2 = input.LA(2);

                    if ( (synpred9_InternalXscript()) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 33:
                    {
                    int LA20_3 = input.LA(2);

                    if ( (synpred9_InternalXscript()) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA20_4 = input.LA(2);

                    if ( (synpred9_InternalXscript()) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA20_5 = input.LA(2);

                    if ( (synpred9_InternalXscript()) ) {
                        alt20=1;
                    }


                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1474:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1474:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1474:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1479:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1479:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1479:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1480:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1485:2: ( ( ruleOpMulti ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1486:1: ( ruleOpMulti )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1486:1: ( ruleOpMulti )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1487:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3714);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1500:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1501:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1501:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1502:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3737);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1526:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1527:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1528:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3776);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3787); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1535:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1538:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1539:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1539:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt21=1;
                }
                break;
            case 33:
                {
                alt21=2;
                }
                break;
            case 34:
                {
                alt21=3;
                }
                break;
            case 35:
                {
                alt21=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1540:2: kw= '*'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleOpMulti3825); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1547:2: kw= '**'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpMulti3844); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1554:2: kw= '/'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpMulti3863); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1561:2: kw= '%'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpMulti3882); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1574:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1575:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1576:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3922);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3932); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1583:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1586:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1587:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1587:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=31 && LA22_0<=32)||LA22_0==36) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_INT)||LA22_0==11||LA22_0==28||LA22_0==40||LA22_0==42||LA22_0==45||LA22_0==47||LA22_0==49||(LA22_0>=53 && LA22_0<=55)||LA22_0==59||(LA22_0>=61 && LA22_0<=68)) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1587:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1587:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1587:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1587:3: ()
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1588:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1593:2: ( ( ruleOpUnary ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1594:1: ( ruleOpUnary )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1594:1: ( ruleOpUnary )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1595:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3990);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1608:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1609:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1609:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1610:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4011);
                    lv_operand_2_0=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XCastedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1628:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4040);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1644:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1645:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1646:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary4076);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary4087); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1653:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1656:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1657:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1657:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt23=1;
                }
                break;
            case 32:
                {
                alt23=2;
                }
                break;
            case 31:
                {
                alt23=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1658:2: kw= '!'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpUnary4125); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1665:2: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpUnary4144); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1672:2: kw= '+'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpUnary4163); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1685:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1686:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1687:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4203);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression4213); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1694:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1697:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1698:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1698:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1699:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4260);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1707:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==17) ) {
                    int LA24_2 = input.LA(2);

                    if ( (synpred10_InternalXscript()) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1707:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1707:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1707:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1709:5: ( () otherlv_2= 'as' )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1709:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1709:6: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1710:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleXCastedExpression4295); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1719:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1720:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1720:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1721:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4318);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1745:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1746:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1747:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4356);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4366); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1754:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1757:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1758:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1758:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1759:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4413);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1767:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            loop31:
            do {
                int alt31=3;
                switch ( input.LA(1) ) {
                case 12:
                    {
                    int LA31_2 = input.LA(2);

                    if ( (synpred11_InternalXscript()) ) {
                        alt31=1;
                    }
                    else if ( (synpred12_InternalXscript()) ) {
                        alt31=2;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA31_3 = input.LA(2);

                    if ( (synpred12_InternalXscript()) ) {
                        alt31=2;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA31_4 = input.LA(2);

                    if ( (synpred12_InternalXscript()) ) {
                        alt31=2;
                    }


                    }
                    break;

                }

                switch (alt31) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1767:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1767:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1767:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1767:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1767:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1773:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1773:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1773:26: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1774:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleXMemberFeatureCall4462); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1783:1: ( ( ruleValidID ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1784:1: ( ruleValidID )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1784:1: ( ruleValidID )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1785:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4485);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4501);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1806:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1807:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1807:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1808:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4523);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1825:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1825:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1825:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1825:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1825:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1841:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1841:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1841:8: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1842:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1847:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt25=3;
            	    switch ( input.LA(1) ) {
            	    case 12:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt25=2;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt25=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt25) {
            	        case 1 :
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1847:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleXMemberFeatureCall4609); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1852:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1852:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1853:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1853:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1854:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,37,FOLLOW_37_in_ruleXMemberFeatureCall4633); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1868:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1868:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1869:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1869:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1870:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,38,FOLLOW_38_in_ruleXMemberFeatureCall4670); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1883:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==28) ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1883:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleXMemberFeatureCall4699); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1887:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1888:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1888:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1889:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4720);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1905:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop26:
            	            do {
            	                int alt26=2;
            	                int LA26_0 = input.LA(1);

            	                if ( (LA26_0==39) ) {
            	                    alt26=1;
            	                }


            	                switch (alt26) {
            	            	case 1 :
            	            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1905:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,39,FOLLOW_39_in_ruleXMemberFeatureCall4733); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1909:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1910:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1910:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1911:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4754);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop26;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,27,FOLLOW_27_in_ruleXMemberFeatureCall4768); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1931:3: ( ( ruleValidID ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1932:1: ( ruleValidID )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1932:1: ( ruleValidID )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1933:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4793);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1946:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt30=2;
            	    alt30 = dfa30.predict(input);
            	    switch (alt30) {
            	        case 1 :
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1946:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1946:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1946:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1953:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1954:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall4827); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1967:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt29=3;
            	            alt29 = dfa29.predict(input);
            	            switch (alt29) {
            	                case 1 :
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1967:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1967:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1967:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1979:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1980:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4902);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1997:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1997:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1997:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1997:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1998:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1998:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1999:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4930);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2015:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop28:
            	                    do {
            	                        int alt28=2;
            	                        int LA28_0 = input.LA(1);

            	                        if ( (LA28_0==39) ) {
            	                            alt28=1;
            	                        }


            	                        switch (alt28) {
            	                    	case 1 :
            	                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2015:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,39,FOLLOW_39_in_ruleXMemberFeatureCall4943); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2019:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2020:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2020:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2021:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4964);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop28;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall4981); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXLiteral"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2049:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2050:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2051:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5022);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5032); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2058:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XIntLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2061:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2062:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2062:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt32=6;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt32=1;
                }
                break;
            case 62:
            case 63:
                {
                alt32=2;
                }
                break;
            case RULE_INT:
                {
                alt32=3;
                }
                break;
            case 64:
                {
                alt32=4;
                }
                break;
            case RULE_STRING:
                {
                alt32=5;
                }
                break;
            case 65:
                {
                alt32=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2063:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5079);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2073:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5106);
                    this_XBooleanLiteral_1=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2083:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral5133);
                    this_XIntLiteral_2=ruleXIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIntLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2093:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5160);
                    this_XNullLiteral_3=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2103:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5187);
                    this_XStringLiteral_4=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2113:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5214);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXClosure"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2129:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2130:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2131:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5249);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5259); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2138:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_formalParameters_2_0 = null;

        EObject lv_formalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2141:28: ( ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2142:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2142:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2142:2: () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2142:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2143:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleXClosure5305); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2152:1: ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID||LA34_0==40||LA34_0==71) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2152:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2152:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2153:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2153:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2154:3: lv_formalParameters_2_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5327);
                    lv_formalParameters_2_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"formalParameters",
                              		lv_formalParameters_2_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2170:2: (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==39) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2170:4: otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleXClosure5340); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2174:1: ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2175:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2175:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2176:3: lv_formalParameters_4_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5361);
                    	    lv_formalParameters_4_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"formalParameters",
                    	              		lv_formalParameters_4_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleXClosure5377); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXClosureAccess().getVerticalLineKeyword_3());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2196:1: ( (lv_expression_6_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2197:1: (lv_expression_6_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2197:1: (lv_expression_6_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2198:3: lv_expression_6_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXClosure5398);
            lv_expression_6_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleXClosure5410); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2226:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2227:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2228:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5446);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5456); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2235:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalParameters_1_0 = null;

        EObject lv_formalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2238:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2239:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2239:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2239:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2239:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2239:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2250:5: ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2250:6: () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2250:6: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2251:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2256:2: ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID||LA36_0==40||LA36_0==71) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2256:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2256:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2257:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2257:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2258:3: lv_formalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5554);
                    lv_formalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"formalParameters",
                              		lv_formalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2274:2: (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==39) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2274:4: otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleXShortClosure5567); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2278:1: ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2279:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2279:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2280:3: lv_formalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5588);
                    	    lv_formalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"formalParameters",
                    	              		lv_formalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXShortClosure5604); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXShortClosureAccess().getVerticalLineKeyword_0_0_2());
                  
            }

            }


            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2300:3: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2301:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2301:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2302:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5627);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2326:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2327:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2328:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5663);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5673); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2335:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2338:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2339:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2339:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2339:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleXParenthesizedExpression5710); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5732);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXParenthesizedExpression5743); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2364:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2365:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2366:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5779);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5789); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2373:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2376:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2377:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2377:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2377:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2377:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2378:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleXIfExpression5835); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXIfExpression5847); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2391:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2392:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2392:1: (lv_if_3_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2393:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5868);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXIfExpression5880); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2413:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2414:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2414:1: (lv_then_5_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2415:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5901);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2431:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==46) ) {
                int LA37_1 = input.LA(2);

                if ( (synpred16_InternalXscript()) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2431:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2431:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2431:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_46_in_ruleXIfExpression5922); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2436:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2437:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2437:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2438:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5944);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2462:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2463:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2464:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5982);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression5992); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2471:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        EObject lv_cases_6_0 = null;

        EObject lv_default_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2474:28: ( ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2475:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2475:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2475:2: () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2475:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2476:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleXSwitchExpression6038); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2485:1: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==48) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2485:2: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2485:2: ( (lv_localVarName_2_0= ruleValidID ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2486:1: (lv_localVarName_2_0= ruleValidID )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2486:1: (lv_localVarName_2_0= ruleValidID )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2487:3: lv_localVarName_2_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6060);
                    lv_localVarName_2_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_2_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleXSwitchExpression6072); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2507:3: ( (lv_switch_4_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2508:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2508:1: (lv_switch_4_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2509:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6095);
            lv_switch_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"switch",
                      		lv_switch_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,49,FOLLOW_49_in_ruleXSwitchExpression6107); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2529:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID||LA39_0==40||LA39_0==48||LA39_0==52||LA39_0==71) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2530:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2530:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2531:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6128);
            	    lv_cases_6_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_6_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2547:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==50) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2547:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,50,FOLLOW_50_in_ruleXSwitchExpression6142); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,48,FOLLOW_48_in_ruleXSwitchExpression6154); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2555:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2556:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2556:1: (lv_default_9_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2557:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6175);
                    lv_default_9_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_9_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,51,FOLLOW_51_in_ruleXSwitchExpression6189); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2585:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2586:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2587:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6225);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6235); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2594:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2597:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2598:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2598:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2598:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2598:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID||LA41_0==40||LA41_0==71) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2599:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2599:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2600:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6281);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2616:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==52) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2616:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXCasePart6295); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2620:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2621:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2621:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2622:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6316);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleXCasePart6330); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2642:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2643:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2643:1: (lv_then_4_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2644:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6351);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2668:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2669:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2670:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6387);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6397); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2677:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2680:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2681:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2681:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2681:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2681:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2682:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXForLoopExpression6443); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXForLoopExpression6455); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2695:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2696:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2696:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2697:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6476);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleXForLoopExpression6488); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2717:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2718:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2718:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2719:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6509);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleXForLoopExpression6521); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2739:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2740:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2740:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2741:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6542);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2765:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2766:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2767:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6578);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6588); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2774:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2777:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2778:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2778:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2778:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2778:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2779:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXWhileExpression6634); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXWhileExpression6646); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2792:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2793:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2793:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2794:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6667);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXWhileExpression6679); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2814:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2815:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2815:1: (lv_body_5_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2816:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6700);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2840:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2841:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2842:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6736);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression6746); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2849:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2852:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2853:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2853:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2853:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2853:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2854:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXDoWhileExpression6792); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2863:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2864:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2864:1: (lv_body_2_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2865:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6813);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleXDoWhileExpression6825); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleXDoWhileExpression6837); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2889:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2890:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2890:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2891:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6858);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleXDoWhileExpression6870); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2919:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2920:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2921:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6906);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression6916); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2928:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2931:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2932:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2932:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2932:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2932:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2933:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleXBlockExpression6962); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2942:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_INT)||LA44_0==11||LA44_0==28||(LA44_0>=31 && LA44_0<=32)||LA44_0==36||LA44_0==40||LA44_0==42||LA44_0==45||LA44_0==47||LA44_0==49||(LA44_0>=53 && LA44_0<=55)||(LA44_0>=57 && LA44_0<=59)||(LA44_0>=61 && LA44_0<=68)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2942:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2942:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2943:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2943:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2944:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression6984);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2960:2: (otherlv_3= ';' )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==56) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2960:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleXBlockExpression6997); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleXBlockExpression7013); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionInsideBlock"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2976:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2977:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2978:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7049);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7059); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpressionInsideBlock"


    // $ANTLR start "ruleXExpressionInsideBlock"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2985:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2988:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2989:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2989:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=57 && LA45_0<=58)) ) {
                alt45=1;
            }
            else if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_INT)||LA45_0==11||LA45_0==28||(LA45_0>=31 && LA45_0<=32)||LA45_0==36||LA45_0==40||LA45_0==42||LA45_0==45||LA45_0==47||LA45_0==49||(LA45_0>=53 && LA45_0<=55)||LA45_0==59||(LA45_0>=61 && LA45_0<=68)) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2990:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7106);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3000:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7133);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpressionInsideBlock"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3016:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3017:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3018:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7168);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7178); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3025:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3028:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3029:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3029:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3029:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3029:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3030:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3035:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==57) ) {
                alt46=1;
            }
            else if ( (LA46_0==58) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3035:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3035:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3036:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3036:1: (lv_writeable_1_0= 'var' )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3037:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,57,FOLLOW_57_in_ruleXVariableDeclaration7231); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3051:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleXVariableDeclaration7262); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3055:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                int LA47_1 = input.LA(2);

                if ( (synpred17_InternalXscript()) ) {
                    alt47=1;
                }
                else if ( (true) ) {
                    alt47=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA47_0==40) && (synpred17_InternalXscript())) {
                alt47=1;
            }
            else if ( (LA47_0==71) && (synpred17_InternalXscript())) {
                alt47=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3055:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3055:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3055:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3063:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3063:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3063:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3064:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3064:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3065:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7310);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3081:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3082:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3082:1: (lv_name_4_0= ruleValidID )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3083:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7331);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3100:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3100:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3101:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3101:1: (lv_name_5_0= ruleValidID )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3102:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7360);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3118:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==18) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3118:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleXVariableDeclaration7374); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3122:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3123:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3123:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3124:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7395);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3148:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3149:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3150:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7433);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7443); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3157:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3160:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3161:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3161:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3161:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3161:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==RULE_ID||LA49_1==12||LA49_1==28) ) {
                    alt49=1;
                }
            }
            else if ( (LA49_0==40||LA49_0==71) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3162:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3162:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3163:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7489);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3179:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3180:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3180:1: (lv_name_1_0= ruleValidID )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3181:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7511);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3205:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3206:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3207:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7547);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7557); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3214:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3217:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3218:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3218:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3218:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3218:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3219:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3224:2: ( ( ruleStaticQualifier ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==60) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3225:1: ( ruleStaticQualifier )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3225:1: ( ruleStaticQualifier )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3226:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7614);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3239:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==28) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3239:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleXFeatureCall7628); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3243:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3244:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3244:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3245:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7649);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3261:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==39) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3261:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleXFeatureCall7662); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3265:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3266:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3266:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3267:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7683);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleXFeatureCall7697); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3287:3: ( ( ruleIdOrSuper ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3288:1: ( ruleIdOrSuper )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3288:1: ( ruleIdOrSuper )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3289:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7722);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3302:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt55=2;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3302:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3302:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3302:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3309:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3310:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,40,FOLLOW_40_in_ruleXFeatureCall7756); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3323:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt54=3;
                    alt54 = dfa54.predict(input);
                    switch (alt54) {
                        case 1 :
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3323:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3323:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3323:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3335:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3336:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7831);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3353:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3353:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3353:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3353:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3354:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3354:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3355:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7859);
                            lv_featureCallArguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3371:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop53:
                            do {
                                int alt53=2;
                                int LA53_0 = input.LA(1);

                                if ( (LA53_0==39) ) {
                                    alt53=1;
                                }


                                switch (alt53) {
                            	case 1 :
                            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3371:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,39,FOLLOW_39_in_ruleXFeatureCall7872); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3375:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3376:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3376:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3377:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7893);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop53;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,41,FOLLOW_41_in_ruleXFeatureCall7910); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3405:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3406:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3407:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper7949);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper7960); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3414:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3417:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3418:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3418:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                alt56=1;
            }
            else if ( (LA56_0==59) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3419:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8007);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3431:2: kw= 'super'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleIdOrSuper8031); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleStaticQualifier"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3444:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3445:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3446:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8072);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8083); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3453:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3456:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3457:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3457:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt57=0;
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_ID) ) {
                    int LA57_2 = input.LA(2);

                    if ( (LA57_2==60) ) {
                        alt57=1;
                    }


                }


                switch (alt57) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3458:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8130);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,60,FOLLOW_60_in_ruleStaticQualifier8148); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt57 >= 1 ) break loop57;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(57, input);
                        throw eee;
                }
                cnt57++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3482:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3483:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3484:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8189);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8199); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3491:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3494:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3495:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3495:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3495:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3495:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3496:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXConstructorCall8245); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3505:1: ( ( ruleQualifiedName ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3506:1: ( ruleQualifiedName )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3506:1: ( ruleQualifiedName )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3507:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8268);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3520:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==28) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3520:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleXConstructorCall8281); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3524:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3525:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3525:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3526:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8302);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_4_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3542:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==39) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3542:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleXConstructorCall8315); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3546:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3547:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3547:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3548:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8336);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleXConstructorCall8350); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,40,FOLLOW_40_in_ruleXConstructorCall8364); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3572:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt61=3;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3572:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3572:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3572:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3584:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3585:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8426);
                    lv_arguments_9_0=ruleXShortClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_9_0, 
                              		"XShortClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3602:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3602:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3602:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3602:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3603:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3603:1: (lv_arguments_10_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3604:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8454);
                    lv_arguments_10_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_10_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3620:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==39) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3620:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,39,FOLLOW_39_in_ruleXConstructorCall8467); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3624:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3625:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3625:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3626:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8488);
                    	    lv_arguments_12_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_12_0, 
                    	              		"XExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,41,FOLLOW_41_in_ruleXConstructorCall8505); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3654:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3655:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3656:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8541);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral8551); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3663:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3666:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3667:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3667:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3667:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3667:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3668:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3673:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==62) ) {
                alt62=1;
            }
            else if ( (LA62_0==63) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3673:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXBooleanLiteral8598); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3678:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3678:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3679:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3679:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3680:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,63,FOLLOW_63_in_ruleXBooleanLiteral8622); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3701:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3702:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3703:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8672);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral8682); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3710:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3713:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3714:1: ( () otherlv_1= 'null' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3714:1: ( () otherlv_1= 'null' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3714:2: () otherlv_1= 'null'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3714:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3715:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXNullLiteral8728); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXIntLiteral"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3732:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3733:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3734:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral8764);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral8774); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXIntLiteral"


    // $ANTLR start "ruleXIntLiteral"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3741:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3744:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3745:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3745:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3745:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3745:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3746:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3751:2: ( (lv_value_1_0= RULE_INT ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3752:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3752:1: (lv_value_1_0= RULE_INT )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3753:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral8825); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXIntLiteralAccess().getValueINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXIntLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"INT");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXIntLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3777:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3778:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3779:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral8866);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral8876); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3786:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3789:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3790:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3790:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3790:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3790:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3791:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3796:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3797:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3797:1: (lv_value_1_0= RULE_STRING )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3798:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral8927); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3822:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3823:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3824:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral8968);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral8978); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3831:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3834:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3835:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3835:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3835:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3835:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3836:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXTypeLiteral9024); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXTypeLiteral9036); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3849:1: ( ( ruleQualifiedName ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3850:1: ( ruleQualifiedName )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3850:1: ( ruleQualifiedName )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3851:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9059);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXTypeLiteral9071); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3876:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3877:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3878:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9107);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9117); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3885:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3888:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3889:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3889:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3889:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3889:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3890:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXThrowExpression9163); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3899:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3900:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3900:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3901:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9184);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3925:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3926:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3927:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9220);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9230); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3934:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3937:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3938:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3938:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3938:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3938:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3939:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXReturnExpression9276); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3948:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt63=2;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3948:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3953:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3954:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9307);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3978:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3979:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3980:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9344);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9354); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3987:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3990:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3991:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3991:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3991:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3991:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3992:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXTryCatchFinallyExpression9400); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4001:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4002:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4002:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4003:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9421);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4019:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==70) ) {
                alt66=1;
            }
            else if ( (LA66_0==69) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4019:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4019:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4019:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4019:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt64=0;
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==70) ) {
                            int LA64_2 = input.LA(2);

                            if ( (synpred22_InternalXscript()) ) {
                                alt64=1;
                            }


                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4019:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4021:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4022:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9451);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt64 >= 1 ) break loop64;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(64, input);
                                throw eee;
                        }
                        cnt64++;
                    } while (true);

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4038:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==69) ) {
                        int LA65_1 = input.LA(2);

                        if ( (synpred23_InternalXscript()) ) {
                            alt65=1;
                        }
                    }
                    switch (alt65) {
                        case 1 :
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4038:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4038:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4038:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,69,FOLLOW_69_in_ruleXTryCatchFinallyExpression9473); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4043:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4044:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4044:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4045:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9495);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4062:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4062:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4062:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,69,FOLLOW_69_in_ruleXTryCatchFinallyExpression9517); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4066:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4067:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4067:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4068:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9538);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4092:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4093:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4094:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9576);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause9586); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4101:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4104:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4105:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4105:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4105:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4105:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4105:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleXCatchClause9631); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleXCatchClause9644); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4114:1: ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4115:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4115:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4116:3: lv_declaredParam_2_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause9665);
            lv_declaredParam_2_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleXCatchClause9677); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4136:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4137:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4137:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4138:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause9698);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4162:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4163:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4164:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9735);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName9746); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4171:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4174:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4175:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4175:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4176:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName9793);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4186:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==12) ) {
                    int LA67_1 = input.LA(2);

                    if ( (LA67_1==RULE_ID) ) {
                        int LA67_3 = input.LA(3);

                        if ( (synpred25_InternalXscript()) ) {
                            alt67=1;
                        }


                    }


                }


                switch (alt67) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4186:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4186:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4186:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,12,FOLLOW_12_in_ruleQualifiedName9821); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName9844);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4213:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4214:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4215:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference9891);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference9901); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4222:1: ruleJvmTypeReference returns [EObject current=null] : (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_1 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4225:28: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4226:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4226:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_ID) ) {
                alt68=1;
            }
            else if ( (LA68_0==40||LA68_0==71) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4227:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference9948);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4237:5: this_XFunctionTypeRef_1= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference9975);
                    this_XFunctionTypeRef_1=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4253:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4254:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4255:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10010);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10020); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4262:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4265:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4266:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4266:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4266:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4266:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==40) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4266:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleXFunctionTypeRef10058); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4270:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4271:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4271:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4272:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10079);
                    lv_paramTypes_1_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                      	        }
                             		add(
                             			current, 
                             			"paramTypes",
                              		lv_paramTypes_1_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4288:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==39) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4288:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleXFunctionTypeRef10092); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4292:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4293:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4293:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4294:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10113);
                    	    lv_paramTypes_3_0=ruleJvmTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"paramTypes",
                    	              		lv_paramTypes_3_0, 
                    	              		"JvmTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXFunctionTypeRef10127); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,71,FOLLOW_71_in_ruleXFunctionTypeRef10141); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4318:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4319:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4319:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4320:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10162);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4344:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4345:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4346:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10198);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10208); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4353:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4356:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4357:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4357:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4357:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4357:2: ( ( ruleQualifiedName ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4358:1: ( ruleQualifiedName )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4358:1: ( ruleQualifiedName )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4359:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10256);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4372:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt72=2;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4372:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4372:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4372:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleJvmParameterizedTypeReference10277); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4377:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4378:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4378:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4379:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10299);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4395:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==39) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4395:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleJvmParameterizedTypeReference10312); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4399:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4400:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4400:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4401:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10333);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleJvmParameterizedTypeReference10347); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4429:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4430:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4431:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10385);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10395); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4438:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4441:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4442:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4442:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_ID||LA73_0==40||LA73_0==71) ) {
                alt73=1;
            }
            else if ( (LA73_0==72) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4443:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10442);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4453:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10469);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4469:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4470:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4471:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference10504);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference10514); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4478:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4481:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4482:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4482:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4482:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4482:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4483:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleJvmWildcardTypeReference10560); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4492:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt74=3;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==73) ) {
                alt74=1;
            }
            else if ( (LA74_0==59) ) {
                alt74=2;
            }
            switch (alt74) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4492:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4492:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4493:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4493:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4494:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference10582);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4511:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4511:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4512:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4512:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4513:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference10609);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4537:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4538:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4539:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound10647);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound10657); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4546:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4549:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4550:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4550:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4550:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleJvmUpperBound10694); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4554:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4555:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4555:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4556:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound10715);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4580:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4581:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4582:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded10751);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded10761); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4589:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4592:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4593:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4593:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4593:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleJvmUpperBoundAnded10798); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4597:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4598:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4598:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4599:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded10819);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4623:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4624:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4625:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound10855);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound10865); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4632:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4635:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4636:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4636:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4636:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleJvmLowerBound10902); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4640:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4641:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4641:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4642:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound10923);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleValidID"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4668:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4669:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4670:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID10962);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID10973); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4677:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4680:28: (this_ID_0= RULE_ID )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4681:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11012); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleValidID"

    // $ANTLR start synpred1_InternalXscript
    public final void synpred1_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:670:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:670:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:670:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:670:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:670:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:671:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:671:2: ( ( ruleOpMultiAssign ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:672:1: ( ruleOpMultiAssign )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:672:1: ( ruleOpMultiAssign )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:673:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalXscript1588);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalXscript

    // $ANTLR start synpred2_InternalXscript
    public final void synpred2_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:798:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:798:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:798:4: ( () ( ( ruleOpOr ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:798:5: () ( ( ruleOpOr ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:798:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:799:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:799:2: ( ( ruleOpOr ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:800:1: ( ruleOpOr )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:800:1: ( ruleOpOr )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:801:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalXscript1936);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalXscript

    // $ANTLR start synpred3_InternalXscript
    public final void synpred3_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:899:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:899:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:899:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:899:5: () ( ( ruleOpAnd ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:899:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:900:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:900:2: ( ( ruleOpAnd ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:901:1: ( ruleOpAnd )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:901:1: ( ruleOpAnd )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:902:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalXscript2195);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalXscript

    // $ANTLR start synpred4_InternalXscript
    public final void synpred4_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1000:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1000:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1000:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1000:5: () ( ( ruleOpEquality ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1000:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1001:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1001:2: ( ( ruleOpEquality ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1002:1: ( ruleOpEquality )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1002:1: ( ruleOpEquality )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1003:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalXscript2454);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalXscript

    // $ANTLR start synpred5_InternalXscript
    public final void synpred5_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1108:4: ( ( () 'instanceof' ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1108:5: ( () 'instanceof' )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1108:5: ( () 'instanceof' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1108:6: () 'instanceof'
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1108:6: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1109:1: 
        {
        }

        match(input,24,FOLLOW_24_in_synpred5_InternalXscript2730); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalXscript

    // $ANTLR start synpred6_InternalXscript
    public final void synpred6_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1136:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1136:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1136:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1136:10: () ( ( ruleOpCompare ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1136:10: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1137:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1137:2: ( ( ruleOpCompare ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1138:1: ( ruleOpCompare )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1138:1: ( ruleOpCompare )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1139:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalXscript2803);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalXscript

    // $ANTLR start synpred7_InternalXscript
    public final void synpred7_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1258:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1258:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1258:4: ( () ( ( ruleOpOther ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1258:5: () ( ( ruleOpOther ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1258:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1259:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1259:2: ( ( ruleOpOther ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1260:1: ( ruleOpOther )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1260:1: ( ruleOpOther )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1261:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalXscript3122);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalXscript

    // $ANTLR start synpred8_InternalXscript
    public final void synpred8_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1366:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1366:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1366:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1366:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1366:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1367:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1367:2: ( ( ruleOpAdd ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1368:1: ( ruleOpAdd )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1368:1: ( ruleOpAdd )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1369:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalXscript3402);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalXscript

    // $ANTLR start synpred9_InternalXscript
    public final void synpred9_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1474:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1474:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1474:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1474:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1474:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1475:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1475:2: ( ( ruleOpMulti ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1476:1: ( ruleOpMulti )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1476:1: ( ruleOpMulti )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1477:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalXscript3682);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalXscript

    // $ANTLR start synpred10_InternalXscript
    public final void synpred10_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1707:3: ( ( () 'as' ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1707:4: ( () 'as' )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1707:4: ( () 'as' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1707:5: () 'as'
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1707:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1708:1: 
        {
        }

        match(input,17,FOLLOW_17_in_synpred10_InternalXscript4276); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalXscript

    // $ANTLR start synpred11_InternalXscript
    public final void synpred11_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1767:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1767:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1767:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1767:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1767:6: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1768:1: 
        {
        }

        match(input,12,FOLLOW_12_in_synpred11_InternalXscript4430); if (state.failed) return ;
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1769:1: ( ( ruleValidID ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1770:1: ( ruleValidID )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1770:1: ( ruleValidID )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1771:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalXscript4439);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalXscript4445);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalXscript

    // $ANTLR start synpred12_InternalXscript
    public final void synpred12_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1825:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1825:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1825:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1825:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1825:10: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1826:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1826:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt75=3;
        switch ( input.LA(1) ) {
        case 12:
            {
            alt75=1;
            }
            break;
        case 37:
            {
            alt75=2;
            }
            break;
        case 38:
            {
            alt75=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 75, 0, input);

            throw nvae;
        }

        switch (alt75) {
            case 1 :
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1826:4: '.'
                {
                match(input,12,FOLLOW_12_in_synpred12_InternalXscript4548); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1828:6: ( ( '?.' ) )
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1828:6: ( ( '?.' ) )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1829:1: ( '?.' )
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1829:1: ( '?.' )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1830:2: '?.'
                {
                match(input,37,FOLLOW_37_in_synpred12_InternalXscript4562); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1835:6: ( ( '*.' ) )
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1835:6: ( ( '*.' ) )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1836:1: ( '*.' )
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1836:1: ( '*.' )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1837:2: '*.'
                {
                match(input,38,FOLLOW_38_in_synpred12_InternalXscript4582); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalXscript

    // $ANTLR start synpred13_InternalXscript
    public final void synpred13_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1946:4: ( ( '(' ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1947:1: ( '(' )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1947:1: ( '(' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1948:2: '('
        {
        match(input,40,FOLLOW_40_in_synpred13_InternalXscript4809); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalXscript

    // $ANTLR start synpred14_InternalXscript
    public final void synpred14_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1967:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1967:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1967:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1967:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1967:6: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1968:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1968:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt77=2;
        int LA77_0 = input.LA(1);

        if ( (LA77_0==RULE_ID||LA77_0==40||LA77_0==71) ) {
            alt77=1;
        }
        switch (alt77) {
            case 1 :
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1968:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1968:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1969:1: ( ruleJvmFormalParameter )
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1969:1: ( ruleJvmFormalParameter )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1970:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalXscript4861);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1972:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop76:
                do {
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==39) ) {
                        alt76=1;
                    }


                    switch (alt76) {
                	case 1 :
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1972:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,39,FOLLOW_39_in_synpred14_InternalXscript4868); if (state.failed) return ;
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1973:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1974:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1974:1: ( ruleJvmFormalParameter )
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1975:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalXscript4875);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop76;
                    }
                } while (true);


                }
                break;

        }

        match(input,43,FOLLOW_43_in_synpred14_InternalXscript4885); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalXscript

    // $ANTLR start synpred16_InternalXscript
    public final void synpred16_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2431:4: ( 'else' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2431:6: 'else'
        {
        match(input,46,FOLLOW_46_in_synpred16_InternalXscript5914); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalXscript

    // $ANTLR start synpred17_InternalXscript
    public final void synpred17_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3055:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3055:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3055:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3055:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3055:6: ( ( ruleJvmTypeReference ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3056:1: ( ruleJvmTypeReference )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3056:1: ( ruleJvmTypeReference )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3057:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred17_InternalXscript7280);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3059:2: ( ( ruleValidID ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3060:1: ( ruleValidID )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3060:1: ( ruleValidID )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3061:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred17_InternalXscript7289);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred17_InternalXscript

    // $ANTLR start synpred18_InternalXscript
    public final void synpred18_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3302:4: ( ( '(' ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3303:1: ( '(' )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3303:1: ( '(' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3304:2: '('
        {
        match(input,40,FOLLOW_40_in_synpred18_InternalXscript7738); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalXscript

    // $ANTLR start synpred19_InternalXscript
    public final void synpred19_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3323:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3323:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3323:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3323:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3323:6: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3324:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3324:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt81=2;
        int LA81_0 = input.LA(1);

        if ( (LA81_0==RULE_ID||LA81_0==40||LA81_0==71) ) {
            alt81=1;
        }
        switch (alt81) {
            case 1 :
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3324:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3324:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3325:1: ( ruleJvmFormalParameter )
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3325:1: ( ruleJvmFormalParameter )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3326:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalXscript7790);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3328:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop80:
                do {
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==39) ) {
                        alt80=1;
                    }


                    switch (alt80) {
                	case 1 :
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3328:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,39,FOLLOW_39_in_synpred19_InternalXscript7797); if (state.failed) return ;
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3329:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3330:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3330:1: ( ruleJvmFormalParameter )
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3331:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalXscript7804);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop80;
                    }
                } while (true);


                }
                break;

        }

        match(input,43,FOLLOW_43_in_synpred19_InternalXscript7814); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalXscript

    // $ANTLR start synpred20_InternalXscript
    public final void synpred20_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3572:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3572:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3572:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3572:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3572:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3573:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3573:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt83=2;
        int LA83_0 = input.LA(1);

        if ( (LA83_0==RULE_ID||LA83_0==40||LA83_0==71) ) {
            alt83=1;
        }
        switch (alt83) {
            case 1 :
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3573:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3573:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3574:1: ( ruleJvmFormalParameter )
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3574:1: ( ruleJvmFormalParameter )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3575:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalXscript8385);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3577:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop82:
                do {
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==39) ) {
                        alt82=1;
                    }


                    switch (alt82) {
                	case 1 :
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3577:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,39,FOLLOW_39_in_synpred20_InternalXscript8392); if (state.failed) return ;
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3578:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3579:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3579:1: ( ruleJvmFormalParameter )
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3580:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalXscript8399);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop82;
                    }
                } while (true);


                }
                break;

        }

        match(input,43,FOLLOW_43_in_synpred20_InternalXscript8409); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalXscript

    // $ANTLR start synpred21_InternalXscript
    public final void synpred21_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3948:2: ( ( ruleXExpression ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3949:1: ( ruleXExpression )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3949:1: ( ruleXExpression )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3950:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred21_InternalXscript9290);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalXscript

    // $ANTLR start synpred22_InternalXscript
    public final void synpred22_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4019:5: ( 'catch' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4019:7: 'catch'
        {
        match(input,70,FOLLOW_70_in_synpred22_InternalXscript9435); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalXscript

    // $ANTLR start synpred23_InternalXscript
    public final void synpred23_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4038:5: ( 'finally' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4038:7: 'finally'
        {
        match(input,69,FOLLOW_69_in_synpred23_InternalXscript9465); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalXscript

    // $ANTLR start synpred25_InternalXscript
    public final void synpred25_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4186:3: ( '.' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4187:2: '.'
        {
        match(input,12,FOLLOW_12_in_synpred25_InternalXscript9812); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalXscript

    // $ANTLR start synpred26_InternalXscript
    public final void synpred26_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4372:4: ( '<' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4372:6: '<'
        {
        match(input,28,FOLLOW_28_in_synpred26_InternalXscript10269); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalXscript

    // Delegated rules

    public final boolean synpred5_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA30 dfa30 = new DFA30(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA72 dfa72 = new DFA72(this);
    static final String DFA30_eotS =
        "\76\uffff";
    static final String DFA30_eofS =
        "\1\2\75\uffff";
    static final String DFA30_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA30_maxS =
        "\1\107\1\0\74\uffff";
    static final String DFA30_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA30_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA30_transitionS = {
            "\3\2\4\uffff\4\2\2\uffff\1\2\1\uffff\25\2\1\1\2\2\1\uffff\20"+
            "\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1946:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_1 = input.LA(1);

                         
                        int index30_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalXscript()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index30_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA29_eotS =
        "\35\uffff";
    static final String DFA29_eofS =
        "\35\uffff";
    static final String DFA29_minS =
        "\1\4\2\0\32\uffff";
    static final String DFA29_maxS =
        "\1\107\2\0\32\uffff";
    static final String DFA29_acceptS =
        "\3\uffff\2\1\1\2\26\uffff\1\3";
    static final String DFA29_specialS =
        "\1\0\1\1\1\2\32\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\1\2\5\4\uffff\1\5\20\uffff\1\5\2\uffff\2\5\3\uffff\1\5\3"+
            "\uffff\1\2\1\34\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\3\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1967:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_0 = input.LA(1);

                         
                        int index29_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA29_0==RULE_ID) ) {s = 1;}

                        else if ( (LA29_0==40) ) {s = 2;}

                        else if ( (LA29_0==71) && (synpred14_InternalXscript())) {s = 3;}

                        else if ( (LA29_0==43) && (synpred14_InternalXscript())) {s = 4;}

                        else if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_INT)||LA29_0==11||LA29_0==28||(LA29_0>=31 && LA29_0<=32)||LA29_0==36||LA29_0==42||LA29_0==45||LA29_0==47||LA29_0==49||(LA29_0>=53 && LA29_0<=55)||LA29_0==59||(LA29_0>=61 && LA29_0<=68)) ) {s = 5;}

                        else if ( (LA29_0==41) ) {s = 28;}

                         
                        input.seek(index29_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_1 = input.LA(1);

                         
                        int index29_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalXscript()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index29_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA29_2 = input.LA(1);

                         
                        int index29_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalXscript()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index29_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA55_eotS =
        "\76\uffff";
    static final String DFA55_eofS =
        "\1\2\75\uffff";
    static final String DFA55_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA55_maxS =
        "\1\107\1\0\74\uffff";
    static final String DFA55_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA55_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA55_transitionS = {
            "\3\2\4\uffff\4\2\2\uffff\1\2\1\uffff\25\2\1\1\2\2\1\uffff\20"+
            "\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "3302:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_1 = input.LA(1);

                         
                        int index55_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalXscript()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index55_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA54_eotS =
        "\35\uffff";
    static final String DFA54_eofS =
        "\35\uffff";
    static final String DFA54_minS =
        "\1\4\2\0\32\uffff";
    static final String DFA54_maxS =
        "\1\107\2\0\32\uffff";
    static final String DFA54_acceptS =
        "\3\uffff\2\1\1\2\26\uffff\1\3";
    static final String DFA54_specialS =
        "\1\0\1\1\1\2\32\uffff}>";
    static final String[] DFA54_transitionS = {
            "\1\1\2\5\4\uffff\1\5\20\uffff\1\5\2\uffff\2\5\3\uffff\1\5\3"+
            "\uffff\1\2\1\34\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\3\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "3323:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_0 = input.LA(1);

                         
                        int index54_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA54_0==RULE_ID) ) {s = 1;}

                        else if ( (LA54_0==40) ) {s = 2;}

                        else if ( (LA54_0==71) && (synpred19_InternalXscript())) {s = 3;}

                        else if ( (LA54_0==43) && (synpred19_InternalXscript())) {s = 4;}

                        else if ( ((LA54_0>=RULE_STRING && LA54_0<=RULE_INT)||LA54_0==11||LA54_0==28||(LA54_0>=31 && LA54_0<=32)||LA54_0==36||LA54_0==42||LA54_0==45||LA54_0==47||LA54_0==49||(LA54_0>=53 && LA54_0<=55)||LA54_0==59||(LA54_0>=61 && LA54_0<=68)) ) {s = 5;}

                        else if ( (LA54_0==41) ) {s = 28;}

                         
                        input.seek(index54_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA54_1 = input.LA(1);

                         
                        int index54_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalXscript()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index54_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA54_2 = input.LA(1);

                         
                        int index54_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalXscript()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index54_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA61_eotS =
        "\35\uffff";
    static final String DFA61_eofS =
        "\35\uffff";
    static final String DFA61_minS =
        "\1\4\2\0\32\uffff";
    static final String DFA61_maxS =
        "\1\107\2\0\32\uffff";
    static final String DFA61_acceptS =
        "\3\uffff\2\1\1\2\26\uffff\1\3";
    static final String DFA61_specialS =
        "\1\0\1\1\1\2\32\uffff}>";
    static final String[] DFA61_transitionS = {
            "\1\1\2\5\4\uffff\1\5\20\uffff\1\5\2\uffff\2\5\3\uffff\1\5\3"+
            "\uffff\1\2\1\34\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\3\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "3572:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_0 = input.LA(1);

                         
                        int index61_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA61_0==RULE_ID) ) {s = 1;}

                        else if ( (LA61_0==40) ) {s = 2;}

                        else if ( (LA61_0==71) && (synpred20_InternalXscript())) {s = 3;}

                        else if ( (LA61_0==43) && (synpred20_InternalXscript())) {s = 4;}

                        else if ( ((LA61_0>=RULE_STRING && LA61_0<=RULE_INT)||LA61_0==11||LA61_0==28||(LA61_0>=31 && LA61_0<=32)||LA61_0==36||LA61_0==42||LA61_0==45||LA61_0==47||LA61_0==49||(LA61_0>=53 && LA61_0<=55)||LA61_0==59||(LA61_0>=61 && LA61_0<=68)) ) {s = 5;}

                        else if ( (LA61_0==41) ) {s = 28;}

                         
                        input.seek(index61_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA61_1 = input.LA(1);

                         
                        int index61_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXscript()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index61_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA61_2 = input.LA(1);

                         
                        int index61_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXscript()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index61_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA63_eotS =
        "\76\uffff";
    static final String DFA63_eofS =
        "\1\32\75\uffff";
    static final String DFA63_minS =
        "\1\4\31\0\44\uffff";
    static final String DFA63_maxS =
        "\1\107\31\0\44\uffff";
    static final String DFA63_acceptS =
        "\32\uffff\1\2\42\uffff\1\1";
    static final String DFA63_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\44"+
        "\uffff}>";
    static final String[] DFA63_transitionS = {
            "\1\1\1\17\1\15\4\uffff\1\31\3\32\2\uffff\1\32\1\uffff\11\32"+
            "\1\10\2\32\1\4\1\3\3\32\1\2\3\32\1\30\1\32\1\12\1\uffff\1\32"+
            "\1\21\1\32\1\7\1\32\1\6\3\32\1\22\1\23\1\24\3\32\1\11\1\uffff"+
            "\1\5\1\13\1\14\1\16\1\20\1\25\1\26\1\27\3\32",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "3948:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA63_1 = input.LA(1);

                         
                        int index63_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 61;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA63_2 = input.LA(1);

                         
                        int index63_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 61;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA63_3 = input.LA(1);

                         
                        int index63_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 61;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA63_4 = input.LA(1);

                         
                        int index63_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 61;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA63_5 = input.LA(1);

                         
                        int index63_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 61;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA63_6 = input.LA(1);

                         
                        int index63_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 61;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA63_7 = input.LA(1);

                         
                        int index63_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 61;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA63_8 = input.LA(1);

                         
                        int index63_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 61;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA63_9 = input.LA(1);

                         
                        int index63_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 61;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA63_10 = input.LA(1);

                         
                        int index63_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 61;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA63_11 = input.LA(1);

                         
                        int index63_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 61;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA63_12 = input.LA(1);

                         
                        int index63_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 61;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA63_13 = input.LA(1);

                         
                        int index63_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 61;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA63_14 = input.LA(1);

                         
                        int index63_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 61;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA63_15 = input.LA(1);

                         
                        int index63_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 61;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA63_16 = input.LA(1);

                         
                        int index63_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 61;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA63_17 = input.LA(1);

                         
                        int index63_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 61;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA63_18 = input.LA(1);

                         
                        int index63_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 61;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA63_19 = input.LA(1);

                         
                        int index63_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 61;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA63_20 = input.LA(1);

                         
                        int index63_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 61;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA63_21 = input.LA(1);

                         
                        int index63_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 61;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA63_22 = input.LA(1);

                         
                        int index63_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 61;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA63_23 = input.LA(1);

                         
                        int index63_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 61;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA63_24 = input.LA(1);

                         
                        int index63_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 61;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA63_25 = input.LA(1);

                         
                        int index63_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 61;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index63_25);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 63, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA72_eotS =
        "\76\uffff";
    static final String DFA72_eofS =
        "\1\2\75\uffff";
    static final String DFA72_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA72_maxS =
        "\1\107\1\0\74\uffff";
    static final String DFA72_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA72_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA72_transitionS = {
            "\3\2\4\uffff\4\2\2\uffff\1\2\1\uffff\11\2\1\1\16\2\1\uffff\20"+
            "\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "4372:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_1 = input.LA(1);

                         
                        int index72_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalXscript()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index72_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 72, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleXScript_in_entryRuleXScript75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXScript85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXScript141 = new BitSet(new long[]{0xEEE2A51190004872L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXScriptExpression_in_ruleXScript168 = new BitSet(new long[]{0xEEE2A51190004872L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXScript195 = new BitSet(new long[]{0xEEE2A51190004872L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXScriptExpression_in_entryRuleXScriptExpression233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXScriptExpression243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXImport_in_ruleXScriptExpression290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEPackageImport_in_ruleXScriptExpression317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNewEObject_in_ruleXPrimaryExpression760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNewEObject_in_entryRuleXNewEObject795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNewEObject805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleXNewEObject842 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXNewEObject862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard957 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedNameWithWildCard976 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleQualifiedNameWithWildCard989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXImport_in_entryRuleXImport1031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXImport1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleXImport1078 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleXImport1097 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_16_in_ruleXImport1128 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleXImport1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEPackageImport_in_entryRuleXEPackageImport1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEPackageImport1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleXEPackageImport1248 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXEPackageImport1265 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleXEPackageImport1283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXEPackageImport1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression1343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment1433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment1501 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1517 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1567 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1620 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpSingleAssign1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpMultiAssign1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1915 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1968 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1991 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr2030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpOr2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2174 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression2227 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2250 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd2289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpAnd2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2433 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2486 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2509 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpEquality2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpEquality2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2656 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2713 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_24_in_ruleXRelationalExpression2749 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2774 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2835 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2858 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpCompare2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpCompare2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpCompare2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpCompare3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3101 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3154 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3177 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther3216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOther3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3381 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3434 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3457 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpAdd3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpAdd3564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3661 = new BitSet(new long[]{0x0000000E00002002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3714 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3737 = new BitSet(new long[]{0x0000000E00002002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleOpMulti3825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpMulti3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpMulti3863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpMulti3882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3990 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary4076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary4087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpUnary4125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpUnary4144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpUnary4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4260 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleXCastedExpression4295 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4318 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4413 = new BitSet(new long[]{0x0000006000001002L});
    public static final BitSet FOLLOW_12_in_ruleXMemberFeatureCall4462 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4485 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4501 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4523 = new BitSet(new long[]{0x0000006000001002L});
    public static final BitSet FOLLOW_12_in_ruleXMemberFeatureCall4609 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_37_in_ruleXMemberFeatureCall4633 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_38_in_ruleXMemberFeatureCall4670 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_28_in_ruleXMemberFeatureCall4699 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4720 = new BitSet(new long[]{0x0000008008000000L});
    public static final BitSet FOLLOW_39_in_ruleXMemberFeatureCall4733 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4754 = new BitSet(new long[]{0x0000008008000000L});
    public static final BitSet FOLLOW_27_in_ruleXMemberFeatureCall4768 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4793 = new BitSet(new long[]{0x0000016000001002L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall4827 = new BitSet(new long[]{0xE8E2AF1190008870L,0x000000000000009FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4902 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4930 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_39_in_ruleXMemberFeatureCall4943 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4964 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall4981 = new BitSet(new long[]{0x0000006000001002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral5133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleXClosure5305 = new BitSet(new long[]{0x0000090000008010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5327 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_39_in_ruleXClosure5340 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5361 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_43_in_ruleXClosure5377 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXClosure5398 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXClosure5410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5554 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_39_in_ruleXShortClosure5567 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5588 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_43_in_ruleXShortClosure5604 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleXParenthesizedExpression5710 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5732 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXParenthesizedExpression5743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleXIfExpression5835 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXIfExpression5847 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5868 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXIfExpression5880 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5901 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleXIfExpression5922 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression5992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXSwitchExpression6038 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6060 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXSwitchExpression6072 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6095 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXSwitchExpression6107 = new BitSet(new long[]{0x0011010000008010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6128 = new BitSet(new long[]{0x001D010000008010L,0x0000000000000080L});
    public static final BitSet FOLLOW_50_in_ruleXSwitchExpression6142 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXSwitchExpression6154 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6175 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXSwitchExpression6189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6281 = new BitSet(new long[]{0x0011000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXCasePart6295 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6316 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXCasePart6330 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXForLoopExpression6443 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXForLoopExpression6455 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6476 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXForLoopExpression6488 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6509 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXForLoopExpression6521 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXWhileExpression6634 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXWhileExpression6646 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6667 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXWhileExpression6679 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression6746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXDoWhileExpression6792 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6813 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXDoWhileExpression6825 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXDoWhileExpression6837 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6858 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXDoWhileExpression6870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression6916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXBlockExpression6962 = new BitSet(new long[]{0xEEEAA51190004870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression6984 = new BitSet(new long[]{0xEFEAA51190004870L,0x000000000000001FL});
    public static final BitSet FOLLOW_56_in_ruleXBlockExpression6997 = new BitSet(new long[]{0xEEEAA51190004870L,0x000000000000001FL});
    public static final BitSet FOLLOW_51_in_ruleXBlockExpression7013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXVariableDeclaration7231 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000080L});
    public static final BitSet FOLLOW_58_in_ruleXVariableDeclaration7262 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7310 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7331 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7360 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleXVariableDeclaration7374 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7489 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7614 = new BitSet(new long[]{0x0800000010000010L});
    public static final BitSet FOLLOW_28_in_ruleXFeatureCall7628 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7649 = new BitSet(new long[]{0x0000008008000000L});
    public static final BitSet FOLLOW_39_in_ruleXFeatureCall7662 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7683 = new BitSet(new long[]{0x0000008008000000L});
    public static final BitSet FOLLOW_27_in_ruleXFeatureCall7697 = new BitSet(new long[]{0x0800000010000010L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7722 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleXFeatureCall7756 = new BitSet(new long[]{0xE8E2AF1190008870L,0x000000000000009FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7831 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7859 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_39_in_ruleXFeatureCall7872 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7893 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_41_in_ruleXFeatureCall7910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper7949 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper7960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleIdOrSuper8031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8130 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleStaticQualifier8148 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXConstructorCall8245 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8268 = new BitSet(new long[]{0x0000010010000000L});
    public static final BitSet FOLLOW_28_in_ruleXConstructorCall8281 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8302 = new BitSet(new long[]{0x0000008008000000L});
    public static final BitSet FOLLOW_39_in_ruleXConstructorCall8315 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8336 = new BitSet(new long[]{0x0000008008000000L});
    public static final BitSet FOLLOW_27_in_ruleXConstructorCall8350 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXConstructorCall8364 = new BitSet(new long[]{0xE8E2AF1190008870L,0x000000000000009FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8426 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8454 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_39_in_ruleXConstructorCall8467 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8488 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_41_in_ruleXConstructorCall8505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral8551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXBooleanLiteral8598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXBooleanLiteral8622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral8682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXNullLiteral8728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral8764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral8774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral8825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral8866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral8876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral8927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral8968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral8978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXTypeLiteral9024 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXTypeLiteral9036 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9059 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXTypeLiteral9071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXThrowExpression9163 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXReturnExpression9276 = new BitSet(new long[]{0xE8E2A51190000872L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXTryCatchFinallyExpression9400 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9451 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_69_in_ruleXTryCatchFinallyExpression9473 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXTryCatchFinallyExpression9517 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause9586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXCatchClause9631 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXCatchClause9644 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause9665 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXCatchClause9677 = new BitSet(new long[]{0xE8E2A51190000870L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause9698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName9746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName9793 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedName9821 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName9844 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference9891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference9901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference9948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference9975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleXFunctionTypeRef10058 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10079 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_39_in_ruleXFunctionTypeRef10092 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10113 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_41_in_ruleXFunctionTypeRef10127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleXFunctionTypeRef10141 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10256 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleJvmParameterizedTypeReference10277 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10299 = new BitSet(new long[]{0x0000008008000000L});
    public static final BitSet FOLLOW_39_in_ruleJvmParameterizedTypeReference10312 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10333 = new BitSet(new long[]{0x0000008008000000L});
    public static final BitSet FOLLOW_27_in_ruleJvmParameterizedTypeReference10347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference10504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference10514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleJvmWildcardTypeReference10560 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference10582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference10609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound10647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound10657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleJvmUpperBound10694 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound10715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded10751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded10761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleJvmUpperBoundAnded10798 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded10819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound10855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound10865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleJvmLowerBound10902 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound10923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID10962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID10973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalXscript1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalXscript1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalXscript2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalXscript2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred5_InternalXscript2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalXscript2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalXscript3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalXscript3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalXscript3682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_synpred10_InternalXscript4276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred11_InternalXscript4430 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalXscript4439 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalXscript4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred12_InternalXscript4548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred12_InternalXscript4562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred12_InternalXscript4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred13_InternalXscript4809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalXscript4861 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_39_in_synpred14_InternalXscript4868 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalXscript4875 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_43_in_synpred14_InternalXscript4885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred16_InternalXscript5914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred17_InternalXscript7280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred17_InternalXscript7289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred18_InternalXscript7738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalXscript7790 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_39_in_synpred19_InternalXscript7797 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalXscript7804 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_43_in_synpred19_InternalXscript7814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalXscript8385 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_39_in_synpred20_InternalXscript8392 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalXscript8399 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_43_in_synpred20_InternalXscript8409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred21_InternalXscript9290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_synpred22_InternalXscript9435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_synpred23_InternalXscript9465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred25_InternalXscript9812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred26_InternalXscript10269 = new BitSet(new long[]{0x0000000000000002L});

}
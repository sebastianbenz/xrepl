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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'create'", "'.'", "'*'", "'import'", "'static'", "'extension'", "'as'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'-'", "'**'", "'/'", "'%'", "'!'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "'if'", "'else'", "'switch'", "':'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "';'", "'var'", "'val'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'", "'super'"
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
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
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

                if ( (LA2_1==RULE_ID||LA2_1==15) ) {
                    alt2=1;
                }
                else if ( (LA2_1==RULE_STRING) ) {
                    alt2=2;
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
            case 59:
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
                {
                alt3=4;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case 42:
            case 60:
            case 61:
            case 62:
            case 63:
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
            case 64:
                {
                alt3=10;
                }
                break;
            case 65:
                {
                alt3=11;
                }
                break;
            case 66:
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:609:1: ruleXAssignment returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:612:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:613:1: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:613:1: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==EOF||(LA9_1>=RULE_ID && LA9_1<=RULE_INT)||(LA9_1>=11 && LA9_1<=14)||LA9_1==17||(LA9_1>=19 && LA9_1<=42)||(LA9_1>=44 && LA9_1<=69)) ) {
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
            else if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_INT)||LA9_0==11||LA9_0==28||(LA9_0>=31 && LA9_0<=32)||LA9_0==36||LA9_0==40||LA9_0==42||LA9_0==45||LA9_0==47||LA9_0==49||(LA9_0>=53 && LA9_0<=55)||(LA9_0>=59 && LA9_0<=66)) ) {
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:613:2: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:613:2: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:613:3: () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
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

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:619:2: ( (otherlv_1= RULE_ID ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:620:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:620:1: (otherlv_1= RULE_ID )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:621:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXAssignment1498); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1514);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:640:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:641:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:641:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:642:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1534);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:659:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:659:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:660:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1564);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:668:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
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
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:668:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:668:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:668:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:673:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:673:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:673:7: ()
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:674:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:679:2: ( ( ruleOpMultiAssign ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:680:1: ( ruleOpMultiAssign )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:680:1: ( ruleOpMultiAssign )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:681:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1617);
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

                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:694:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:695:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:695:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:696:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1640);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:720:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:721:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:722:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1680);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1691); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:729:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:732:28: (kw= '=' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:734:2: kw= '='
            {
            kw=(Token)match(input,18,FOLLOW_18_in_ruleOpSingleAssign1728); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:747:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:748:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:749:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1768);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1779); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:756:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:759:28: (kw= '+=' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:761:2: kw= '+='
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleOpMultiAssign1816); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:774:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:775:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:776:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1855);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1865); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:783:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:786:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:787:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:787:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:788:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1912);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:796:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
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
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:796:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:796:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:796:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:801:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:801:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:801:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:802:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:807:2: ( ( ruleOpOr ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:808:1: ( ruleOpOr )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:808:1: ( ruleOpOr )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:809:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1965);
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

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:822:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:823:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:823:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:824:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1988);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:848:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:849:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:850:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr2027);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr2038); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:857:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:860:28: (kw= '||' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:862:2: kw= '||'
            {
            kw=(Token)match(input,20,FOLLOW_20_in_ruleOpOr2075); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:875:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:876:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:877:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2114);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression2124); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:884:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:887:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:888:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:888:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:889:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2171);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:897:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
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
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:897:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:897:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:897:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:902:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:902:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:902:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:903:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:908:2: ( ( ruleOpAnd ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:909:1: ( ruleOpAnd )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:909:1: ( ruleOpAnd )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:910:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression2224);
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

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:923:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:924:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:924:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:925:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2247);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:949:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:950:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:951:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd2286);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd2297); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:958:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:961:28: (kw= '&&' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:963:2: kw= '&&'
            {
            kw=(Token)match(input,21,FOLLOW_21_in_ruleOpAnd2334); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:976:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:977:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:978:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2373);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression2383); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:985:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:988:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:989:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:989:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:990:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2430);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:998:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
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
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:998:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:998:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:998:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1003:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1003:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1003:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1004:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1009:2: ( ( ruleOpEquality ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1010:1: ( ruleOpEquality )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1010:1: ( ruleOpEquality )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1011:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2483);
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

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1024:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1025:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1025:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1026:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2506);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1050:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1051:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1052:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2545);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2556); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1059:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1062:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1063:1: (kw= '==' | kw= '!=' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1063:1: (kw= '==' | kw= '!=' )
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1064:2: kw= '=='
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleOpEquality2594); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1071:2: kw= '!='
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpEquality2613); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1084:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1085:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1086:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2653);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2663); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1093:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1096:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1097:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1097:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1098:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2710);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1106:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
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
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1106:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1106:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1106:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1106:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1106:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1108:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1108:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1108:6: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1109:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleXRelationalExpression2746); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1118:3: ( ( ruleQualifiedName ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1119:1: ( ruleQualifiedName )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1119:1: ( ruleQualifiedName )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1120:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2771);
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
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1134:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1134:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1134:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1134:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1134:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1139:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1139:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1139:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1140:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1145:2: ( ( ruleOpCompare ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1146:1: ( ruleOpCompare )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1146:1: ( ruleOpCompare )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1147:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2832);
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

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1160:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1161:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1161:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1162:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2855);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1186:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1187:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1188:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2895);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2906); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1195:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1198:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1199:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1199:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1200:2: kw= '>='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpCompare2944); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1207:2: kw= '<='
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpCompare2963); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1214:2: kw= '>'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpCompare2982); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1221:2: kw= '<'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpCompare3001); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1234:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1235:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1236:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3041);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3051); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1243:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1246:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1247:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1247:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1248:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3098);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1256:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
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
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1256:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1256:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1256:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1261:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1261:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1261:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1262:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1267:2: ( ( ruleOpOther ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1268:1: ( ruleOpOther )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1268:1: ( ruleOpOther )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1269:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3151);
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

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1282:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1283:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1283:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1284:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3174);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1308:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1309:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1310:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther3213);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther3224); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1317:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1320:28: ( (kw= '->' | kw= '..' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1321:1: (kw= '->' | kw= '..' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1321:1: (kw= '->' | kw= '..' )
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1322:2: kw= '->'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther3262); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1329:2: kw= '..'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOther3281); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1342:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1343:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1344:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3321);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression3331); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1351:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1354:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1355:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1355:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1356:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3378);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1364:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
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
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1364:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1364:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1364:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1369:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1369:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1369:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1370:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1375:2: ( ( ruleOpAdd ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1376:1: ( ruleOpAdd )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1376:1: ( ruleOpAdd )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1377:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3431);
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

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1390:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1391:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1391:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1392:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3454);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1416:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1417:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1418:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3493);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3504); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1425:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1428:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1429:1: (kw= '+' | kw= '-' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1429:1: (kw= '+' | kw= '-' )
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1430:2: kw= '+'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpAdd3542); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1437:2: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpAdd3561); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1450:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1451:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1452:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3601);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3611); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1459:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1462:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1463:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1463:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1464:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3658);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1472:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
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
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1472:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1472:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1472:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1477:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1477:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1477:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1478:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1483:2: ( ( ruleOpMulti ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1484:1: ( ruleOpMulti )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1484:1: ( ruleOpMulti )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1485:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3711);
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

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1498:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1499:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1499:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1500:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3734);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1524:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1525:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1526:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3773);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3784); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1533:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1536:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1537:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1537:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1538:2: kw= '*'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleOpMulti3822); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1545:2: kw= '**'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpMulti3841); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1552:2: kw= '/'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpMulti3860); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1559:2: kw= '%'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpMulti3879); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1572:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1573:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1574:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3919);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3929); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1581:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1584:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1585:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1585:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=31 && LA22_0<=32)||LA22_0==36) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_INT)||LA22_0==11||LA22_0==28||LA22_0==40||LA22_0==42||LA22_0==45||LA22_0==47||LA22_0==49||(LA22_0>=53 && LA22_0<=55)||(LA22_0>=59 && LA22_0<=66)) ) {
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1585:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1585:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1585:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1585:3: ()
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1586:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1591:2: ( ( ruleOpUnary ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1592:1: ( ruleOpUnary )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1592:1: ( ruleOpUnary )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1593:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3987);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1606:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1607:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1607:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1608:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4008);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1626:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4037);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1642:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1643:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1644:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary4073);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary4084); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1651:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1654:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1655:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1655:1: (kw= '!' | kw= '-' | kw= '+' )
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1656:2: kw= '!'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpUnary4122); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1663:2: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpUnary4141); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1670:2: kw= '+'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpUnary4160); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1683:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1684:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1685:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4200);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression4210); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1692:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1695:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1696:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1696:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1697:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4257);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1705:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
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
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1705:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1705:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1705:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1707:5: ( () otherlv_2= 'as' )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1707:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1707:6: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1708:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleXCastedExpression4292); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1717:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1718:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1718:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1719:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4315);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1743:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1744:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1745:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4353);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4363); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1752:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1755:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1756:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1756:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1757:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4410);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1765:1: ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
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
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1765:2: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1765:2: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1765:3: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1765:3: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1765:4: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1772:25: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1772:26: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1772:26: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1773:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleXMemberFeatureCall4459); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1782:1: ( (otherlv_3= RULE_ID ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1783:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1783:1: (otherlv_3= RULE_ID )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1784:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXMemberFeatureCall4479); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4495);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1803:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1804:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1804:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1805:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4517);
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
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1822:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1822:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1822:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1822:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1822:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1838:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1838:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1838:8: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1839:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1844:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
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
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1844:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleXMemberFeatureCall4603); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1849:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1849:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1850:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1850:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1851:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,37,FOLLOW_37_in_ruleXMemberFeatureCall4627); if (state.failed) return current;
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
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1865:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1865:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1866:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1866:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1867:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,38,FOLLOW_38_in_ruleXMemberFeatureCall4664); if (state.failed) return current;
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

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1880:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==28) ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1880:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleXMemberFeatureCall4693); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1884:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1885:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1885:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1886:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4714);
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

            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1902:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop26:
            	            do {
            	                int alt26=2;
            	                int LA26_0 = input.LA(1);

            	                if ( (LA26_0==39) ) {
            	                    alt26=1;
            	                }


            	                switch (alt26) {
            	            	case 1 :
            	            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1902:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,39,FOLLOW_39_in_ruleXMemberFeatureCall4727); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1906:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1907:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1907:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1908:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4748);
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

            	            otherlv_14=(Token)match(input,27,FOLLOW_27_in_ruleXMemberFeatureCall4762); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1928:3: ( (otherlv_15= RULE_ID ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1929:1: (otherlv_15= RULE_ID )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1929:1: (otherlv_15= RULE_ID )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1930:3: otherlv_15= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXMemberFeatureCall4784); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_15, grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1941:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt30=2;
            	    alt30 = dfa30.predict(input);
            	    switch (alt30) {
            	        case 1 :
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1941:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1941:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1941:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1948:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1949:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall4818); if (state.failed) return current;
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

            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1962:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt29=3;
            	            alt29 = dfa29.predict(input);
            	            switch (alt29) {
            	                case 1 :
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1962:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1962:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1962:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1974:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1975:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4893);
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
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1992:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1992:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1992:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1992:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1993:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1993:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1994:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4921);
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

            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2010:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop28:
            	                    do {
            	                        int alt28=2;
            	                        int LA28_0 = input.LA(1);

            	                        if ( (LA28_0==39) ) {
            	                            alt28=1;
            	                        }


            	                        switch (alt28) {
            	                    	case 1 :
            	                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2010:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,39,FOLLOW_39_in_ruleXMemberFeatureCall4934); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2014:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2015:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2015:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2016:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4955);
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

            	            otherlv_21=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall4972); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2044:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2045:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2046:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5013);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5023); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2053:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2056:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2057:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2057:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt32=6;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt32=1;
                }
                break;
            case 60:
            case 61:
                {
                alt32=2;
                }
                break;
            case RULE_INT:
                {
                alt32=3;
                }
                break;
            case 62:
                {
                alt32=4;
                }
                break;
            case RULE_STRING:
                {
                alt32=5;
                }
                break;
            case 63:
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2058:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5070);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2068:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5097);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2078:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral5124);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2088:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5151);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2098:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5178);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2108:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5205);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2124:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2125:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2126:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5240);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5250); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2133:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2136:28: ( ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2137:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2137:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2137:2: () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2137:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2138:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleXClosure5296); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2147:1: ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID||LA34_0==40||LA34_0==69) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2147:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2147:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2148:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2148:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2149:3: lv_formalParameters_2_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5318);
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

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2165:2: (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==39) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2165:4: otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleXClosure5331); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2169:1: ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2170:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2170:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2171:3: lv_formalParameters_4_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5352);
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

            otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleXClosure5368); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXClosureAccess().getVerticalLineKeyword_3());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2191:1: ( (lv_expression_6_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2192:1: (lv_expression_6_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2192:1: (lv_expression_6_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2193:3: lv_expression_6_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXClosure5389);
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

            otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleXClosure5401); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2221:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2222:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2223:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5437);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5447); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2230:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalParameters_1_0 = null;

        EObject lv_formalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2233:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2234:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2234:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2234:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2234:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2234:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2245:5: ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2245:6: () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2245:6: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2246:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2251:2: ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID||LA36_0==40||LA36_0==69) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2251:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2251:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2252:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2252:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2253:3: lv_formalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5545);
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

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2269:2: (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==39) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2269:4: otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleXShortClosure5558); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2273:1: ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2274:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2274:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2275:3: lv_formalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5579);
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

            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXShortClosure5595); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXShortClosureAccess().getVerticalLineKeyword_0_0_2());
                  
            }

            }


            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2295:3: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2296:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2296:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2297:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5618);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2321:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2322:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2323:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5654);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5664); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2330:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2333:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2334:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2334:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2334:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleXParenthesizedExpression5701); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5723);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXParenthesizedExpression5734); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2359:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2360:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2361:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5770);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5780); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2368:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2371:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2372:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2372:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2372:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2372:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2373:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleXIfExpression5826); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXIfExpression5838); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2386:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2387:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2387:1: (lv_if_3_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2388:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5859);
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

            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXIfExpression5871); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2408:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2409:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2409:1: (lv_then_5_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2410:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5892);
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

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2426:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2426:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2426:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2426:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_46_in_ruleXIfExpression5913); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2431:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2432:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2432:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2433:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5935);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2457:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2458:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2459:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5973);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression5983); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2466:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_localVarName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_switch_4_0 = null;

        EObject lv_cases_6_0 = null;

        EObject lv_default_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2469:28: ( ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2470:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2470:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2470:2: () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2470:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2471:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleXSwitchExpression6029); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2480:1: ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )?
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2480:2: ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':'
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2480:2: ( (lv_localVarName_2_0= RULE_ID ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2481:1: (lv_localVarName_2_0= RULE_ID )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2481:1: (lv_localVarName_2_0= RULE_ID )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2482:3: lv_localVarName_2_0= RULE_ID
                    {
                    lv_localVarName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXSwitchExpression6047); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_localVarName_2_0, grammarAccess.getXSwitchExpressionAccess().getLocalVarNameIDTerminalRuleCall_2_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_2_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleXSwitchExpression6064); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2502:3: ( (lv_switch_4_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2503:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2503:1: (lv_switch_4_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2504:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6087);
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

            otherlv_5=(Token)match(input,49,FOLLOW_49_in_ruleXSwitchExpression6099); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2524:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID||LA39_0==40||LA39_0==48||LA39_0==52||LA39_0==69) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2525:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2525:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2526:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6120);
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

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2542:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==50) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2542:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,50,FOLLOW_50_in_ruleXSwitchExpression6134); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,48,FOLLOW_48_in_ruleXSwitchExpression6146); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2550:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2551:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2551:1: (lv_default_9_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2552:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6167);
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

            otherlv_10=(Token)match(input,51,FOLLOW_51_in_ruleXSwitchExpression6181); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2580:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2581:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2582:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6217);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6227); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2589:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2592:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2593:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2593:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2593:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2593:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID||LA41_0==40||LA41_0==69) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2594:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2594:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2595:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6273);
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

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2611:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==52) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2611:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXCasePart6287); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2615:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2616:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2616:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2617:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6308);
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

            otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleXCasePart6322); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2637:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2638:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2638:1: (lv_then_4_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2639:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6343);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2663:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2664:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2665:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6379);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6389); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2672:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2675:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2676:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2676:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2676:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2676:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2677:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXForLoopExpression6435); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXForLoopExpression6447); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2690:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2691:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2691:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2692:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6468);
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

            otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleXForLoopExpression6480); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2712:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2713:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2713:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2714:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6501);
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

            otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleXForLoopExpression6513); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2734:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2735:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2735:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2736:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6534);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2760:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2761:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2762:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6570);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6580); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2769:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2772:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2773:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2773:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2773:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2773:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2774:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXWhileExpression6626); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXWhileExpression6638); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2787:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2788:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2788:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2789:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6659);
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

            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXWhileExpression6671); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2809:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2810:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2810:1: (lv_body_5_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2811:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6692);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2835:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2836:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2837:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6728);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression6738); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2844:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2847:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2848:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2848:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2848:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2848:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2849:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXDoWhileExpression6784); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2858:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2859:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2859:1: (lv_body_2_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2860:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6805);
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

            otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleXDoWhileExpression6817); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleXDoWhileExpression6829); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2884:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2885:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2885:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2886:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6850);
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

            otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleXDoWhileExpression6862); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2914:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2915:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2916:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6898);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression6908); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2923:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2926:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2927:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2927:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2927:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2927:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2928:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleXBlockExpression6954); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2937:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_INT)||LA44_0==11||LA44_0==28||(LA44_0>=31 && LA44_0<=32)||LA44_0==36||LA44_0==40||LA44_0==42||LA44_0==45||LA44_0==47||LA44_0==49||(LA44_0>=53 && LA44_0<=55)||(LA44_0>=57 && LA44_0<=66)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2937:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2937:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2938:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2938:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2939:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression6976);
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

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2955:2: (otherlv_3= ';' )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==56) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2955:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleXBlockExpression6989); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleXBlockExpression7005); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2971:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2972:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2973:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7041);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7051); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2980:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2983:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2984:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2984:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=57 && LA45_0<=58)) ) {
                alt45=1;
            }
            else if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_INT)||LA45_0==11||LA45_0==28||(LA45_0>=31 && LA45_0<=32)||LA45_0==36||LA45_0==40||LA45_0==42||LA45_0==45||LA45_0==47||LA45_0==49||(LA45_0>=53 && LA45_0<=55)||(LA45_0>=59 && LA45_0<=66)) ) {
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2985:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7098);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2995:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7125);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3011:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3012:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3013:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7160);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7170); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3020:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3023:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3024:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3024:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3024:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3024:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3025:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3030:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3030:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3030:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3031:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3031:1: (lv_writeable_1_0= 'var' )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3032:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,57,FOLLOW_57_in_ruleXVariableDeclaration7223); if (state.failed) return current;
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3046:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleXVariableDeclaration7254); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3050:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) )
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
            else if ( (LA47_0==69) && (synpred17_InternalXscript())) {
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3050:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3050:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3050:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3059:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3059:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3059:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3060:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3060:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3061:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7303);
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

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3077:2: ( (lv_name_4_0= RULE_ID ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3078:1: (lv_name_4_0= RULE_ID )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3078:1: (lv_name_4_0= RULE_ID )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3079:3: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXVariableDeclaration7320); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_4_0, grammarAccess.getXVariableDeclarationAccess().getNameIDTerminalRuleCall_2_0_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3096:6: ( (lv_name_5_0= RULE_ID ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3096:6: ( (lv_name_5_0= RULE_ID ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3097:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3097:1: (lv_name_5_0= RULE_ID )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3098:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXVariableDeclaration7350); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_5_0, grammarAccess.getXVariableDeclarationAccess().getNameIDTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3114:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==18) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3114:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleXVariableDeclaration7369); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3118:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3119:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3119:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3120:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7390);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3144:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3145:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3146:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7428);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7438); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3153:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_parameterType_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3156:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3157:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3157:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3157:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3157:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==RULE_ID||LA49_1==12||LA49_1==28) ) {
                    alt49=1;
                }
            }
            else if ( (LA49_0==40||LA49_0==69) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3158:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3158:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3159:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7484);
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

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3175:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3176:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3176:1: (lv_name_1_0= RULE_ID )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3177:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJvmFormalParameter7502); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getJvmFormalParameterAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3201:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3202:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3203:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7543);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7553); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3210:1: ruleXFeatureCall returns [EObject current=null] : ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_7_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_typeArguments_2_0 = null;

        EObject lv_typeArguments_4_0 = null;

        EObject lv_featureCallArguments_8_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3213:28: ( ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3214:1: ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3214:1: ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3214:2: () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )?
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3214:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3215:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3220:2: (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==28) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3220:4: otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleXFeatureCall7600); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_1_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3224:1: ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3225:1: (lv_typeArguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3225:1: (lv_typeArguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3226:3: lv_typeArguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7621);
                    lv_typeArguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3242:2: (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==39) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3242:4: otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleXFeatureCall7634); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXFeatureCallAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3246:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3247:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3247:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3248:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7655);
                    	    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
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


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleXFeatureCall7669); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3268:3: ( (otherlv_6= RULE_ID ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3269:1: (otherlv_6= RULE_ID )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3269:1: (otherlv_6= RULE_ID )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3270:3: otherlv_6= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXFeatureCall7691); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_2_0()); 
              	
            }

            }


            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3281:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )?
            int alt54=2;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3281:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')'
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3281:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3281:4: ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3288:1: (lv_explicitOperationCall_7_0= '(' )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3289:3: lv_explicitOperationCall_7_0= '('
                    {
                    lv_explicitOperationCall_7_0=(Token)match(input,40,FOLLOW_40_in_ruleXFeatureCall7725); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_7_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_3_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3302:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )?
                    int alt53=3;
                    alt53 = dfa53.predict(input);
                    switch (alt53) {
                        case 1 :
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3302:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3302:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3302:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3314:1: (lv_featureCallArguments_8_0= ruleXShortClosure )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3315:3: lv_featureCallArguments_8_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_3_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7800);
                            lv_featureCallArguments_8_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_8_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3332:6: ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3332:6: ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3332:7: ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )*
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3332:7: ( (lv_featureCallArguments_9_0= ruleXExpression ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3333:1: (lv_featureCallArguments_9_0= ruleXExpression )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3333:1: (lv_featureCallArguments_9_0= ruleXExpression )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3334:3: lv_featureCallArguments_9_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_3_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7828);
                            lv_featureCallArguments_9_0=ruleXExpression();

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
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3350:2: (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )*
                            loop52:
                            do {
                                int alt52=2;
                                int LA52_0 = input.LA(1);

                                if ( (LA52_0==39) ) {
                                    alt52=1;
                                }


                                switch (alt52) {
                            	case 1 :
                            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3350:4: otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) )
                            	    {
                            	    otherlv_10=(Token)match(input,39,FOLLOW_39_in_ruleXFeatureCall7841); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_10, grammarAccess.getXFeatureCallAccess().getCommaKeyword_3_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3354:1: ( (lv_featureCallArguments_11_0= ruleXExpression ) )
                            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3355:1: (lv_featureCallArguments_11_0= ruleXExpression )
                            	    {
                            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3355:1: (lv_featureCallArguments_11_0= ruleXExpression )
                            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3356:3: lv_featureCallArguments_11_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_3_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7862);
                            	    lv_featureCallArguments_11_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_11_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop52;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,41,FOLLOW_41_in_ruleXFeatureCall7879); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_3_2());
                          
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


    // $ANTLR start "entryRuleXConstructorCall"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3384:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3385:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3386:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall7917);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall7927); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3393:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3396:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3397:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3397:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3397:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3397:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3398:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXConstructorCall7973); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3407:1: ( ( ruleQualifiedName ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3408:1: ( ruleQualifiedName )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3408:1: ( ruleQualifiedName )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3409:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall7996);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3422:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==28) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3422:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleXConstructorCall8009); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3426:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3427:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3427:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3428:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8030);
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

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3444:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==39) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3444:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleXConstructorCall8043); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3448:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3449:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3449:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3450:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8064);
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
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleXConstructorCall8078); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,40,FOLLOW_40_in_ruleXConstructorCall8092); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3474:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt58=3;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3474:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3474:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3474:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3486:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3487:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8154);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3504:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3504:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3504:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3504:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3505:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3505:1: (lv_arguments_10_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3506:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8182);
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

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3522:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==39) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3522:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,39,FOLLOW_39_in_ruleXConstructorCall8195); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3526:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3527:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3527:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3528:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8216);
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
                    	    break loop57;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,41,FOLLOW_41_in_ruleXConstructorCall8233); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3556:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3557:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3558:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8269);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral8279); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3565:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3568:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3569:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3569:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3569:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3569:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3570:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3575:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==60) ) {
                alt59=1;
            }
            else if ( (LA59_0==61) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3575:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXBooleanLiteral8326); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3580:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3580:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3581:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3581:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3582:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,61,FOLLOW_61_in_ruleXBooleanLiteral8350); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3603:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3604:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3605:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8400);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral8410); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3612:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3615:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3616:1: ( () otherlv_1= 'null' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3616:1: ( () otherlv_1= 'null' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3616:2: () otherlv_1= 'null'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3616:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3617:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXNullLiteral8456); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3634:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3635:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3636:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral8492);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral8502); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3643:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3646:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3647:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3647:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3647:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3647:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3648:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3653:2: ( (lv_value_1_0= RULE_INT ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3654:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3654:1: (lv_value_1_0= RULE_INT )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3655:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral8553); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3679:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3680:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3681:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral8594);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral8604); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3688:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3691:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3692:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3692:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3692:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3692:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3693:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3698:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3699:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3699:1: (lv_value_1_0= RULE_STRING )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3700:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral8655); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3724:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3725:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3726:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral8696);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral8706); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3733:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3736:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3737:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3737:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3737:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3737:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3738:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXTypeLiteral8752); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXTypeLiteral8764); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3751:1: ( ( ruleQualifiedName ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3752:1: ( ruleQualifiedName )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3752:1: ( ruleQualifiedName )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3753:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral8787);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXTypeLiteral8799); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3778:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3779:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3780:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression8835);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression8845); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3787:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3790:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3791:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3791:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3791:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3791:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3792:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXThrowExpression8891); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3801:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3802:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3802:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3803:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression8912);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3827:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3828:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3829:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression8948);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression8958); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3836:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3839:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3840:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3840:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3840:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3840:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3841:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXReturnExpression9004); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3850:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3850:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3855:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3856:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9035);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3880:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3881:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3882:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9072);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9082); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3889:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3892:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3893:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3893:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3893:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3893:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3894:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXTryCatchFinallyExpression9128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3903:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3904:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3904:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3905:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9149);
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

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3921:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==68) ) {
                alt63=1;
            }
            else if ( (LA63_0==67) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3921:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3921:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3921:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3921:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt61=0;
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==68) ) {
                            int LA61_2 = input.LA(2);

                            if ( (synpred22_InternalXscript()) ) {
                                alt61=1;
                            }


                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3921:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3923:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3924:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9179);
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
                    	    if ( cnt61 >= 1 ) break loop61;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(61, input);
                                throw eee;
                        }
                        cnt61++;
                    } while (true);

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3940:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==67) ) {
                        int LA62_1 = input.LA(2);

                        if ( (synpred23_InternalXscript()) ) {
                            alt62=1;
                        }
                    }
                    switch (alt62) {
                        case 1 :
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3940:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3940:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3940:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,67,FOLLOW_67_in_ruleXTryCatchFinallyExpression9201); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3945:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3946:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3946:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3947:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9223);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3964:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3964:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3964:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,67,FOLLOW_67_in_ruleXTryCatchFinallyExpression9245); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3968:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3969:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3969:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3970:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9266);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3994:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3995:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3996:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9304);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause9314); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4003:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4006:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4007:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4007:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4007:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4007:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4007:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleXCatchClause9359); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleXCatchClause9372); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4016:1: ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4017:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4017:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4018:3: lv_declaredParam_2_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause9393);
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

            otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleXCatchClause9405); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4038:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4039:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4039:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4040:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause9426);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4064:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4065:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4066:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9463);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName9474); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4073:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4076:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4077:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4077:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4077:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName9514); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4084:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==12) ) {
                    int LA64_1 = input.LA(2);

                    if ( (LA64_1==RULE_ID) ) {
                        int LA64_3 = input.LA(3);

                        if ( (synpred25_InternalXscript()) ) {
                            alt64=1;
                        }


                    }


                }


                switch (alt64) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4084:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4084:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4084:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,12,FOLLOW_12_in_ruleQualifiedName9542); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName9558); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop64;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4107:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4108:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4109:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference9605);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference9615); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4116:1: ruleJvmTypeReference returns [EObject current=null] : (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_1 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4119:28: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4120:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4120:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_ID) ) {
                alt65=1;
            }
            else if ( (LA65_0==40||LA65_0==69) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4121:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference9662);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4131:5: this_XFunctionTypeRef_1= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference9689);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4147:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4148:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4149:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef9724);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef9734); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4156:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4159:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4160:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4160:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4160:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4160:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==40) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4160:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleXFunctionTypeRef9772); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4164:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4165:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4165:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4166:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9793);
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

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4182:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==39) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4182:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleXFunctionTypeRef9806); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4186:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4187:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4187:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4188:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9827);
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
                    	    break loop66;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXFunctionTypeRef9841); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,69,FOLLOW_69_in_ruleXFunctionTypeRef9855); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4212:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4213:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4213:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4214:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9876);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4238:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4239:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4240:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference9912);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference9922); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4247:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4250:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4251:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4251:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4251:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4251:2: ( ( ruleQualifiedName ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4252:1: ( ruleQualifiedName )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4252:1: ( ruleQualifiedName )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4253:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference9970);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4266:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt69=2;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4266:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4266:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4266:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleJvmParameterizedTypeReference9991); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4271:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4272:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4272:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4273:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10013);
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

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4289:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==39) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4289:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleJvmParameterizedTypeReference10026); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4293:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4294:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4294:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4295:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10047);
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
                    	    break loop68;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleJvmParameterizedTypeReference10061); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4323:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4324:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4325:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10099);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10109); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4332:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4335:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4336:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4336:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_ID||LA70_0==40||LA70_0==69) ) {
                alt70=1;
            }
            else if ( (LA70_0==70) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4337:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10156);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4347:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10183);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4363:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4364:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4365:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference10218);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference10228); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4372:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4375:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4376:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4376:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4376:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4376:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4377:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleJvmWildcardTypeReference10274); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4386:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt71=3;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==71) ) {
                alt71=1;
            }
            else if ( (LA71_0==73) ) {
                alt71=2;
            }
            switch (alt71) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4386:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4386:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4387:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4387:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4388:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference10296);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4405:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4405:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4406:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4406:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4407:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference10323);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4431:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4432:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4433:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound10361);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound10371); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4440:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4443:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4444:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4444:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4444:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleJvmUpperBound10408); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4448:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4449:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4449:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4450:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound10429);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4474:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4475:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4476:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded10465);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded10475); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4483:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4486:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4487:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4487:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4487:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleJvmUpperBoundAnded10512); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4491:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4492:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4492:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4493:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded10533);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4517:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4518:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4519:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound10569);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound10579); if (state.failed) return current;

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4526:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4529:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4530:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4530:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4530:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleJvmLowerBound10616); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4534:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4535:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4535:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4536:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound10637);
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

    // $ANTLR start synpred1_InternalXscript
    public final void synpred1_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:668:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:668:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:668:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:668:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:668:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:669:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:669:2: ( ( ruleOpMultiAssign ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:670:1: ( ruleOpMultiAssign )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:670:1: ( ruleOpMultiAssign )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:671:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalXscript1585);
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
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:796:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:796:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:796:4: ( () ( ( ruleOpOr ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:796:5: () ( ( ruleOpOr ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:796:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:797:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:797:2: ( ( ruleOpOr ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:798:1: ( ruleOpOr )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:798:1: ( ruleOpOr )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:799:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalXscript1933);
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
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:897:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:897:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:897:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:897:5: () ( ( ruleOpAnd ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:897:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:898:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:898:2: ( ( ruleOpAnd ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:899:1: ( ruleOpAnd )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:899:1: ( ruleOpAnd )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:900:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalXscript2192);
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
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:998:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:998:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:998:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:998:5: () ( ( ruleOpEquality ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:998:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:999:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:999:2: ( ( ruleOpEquality ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1000:1: ( ruleOpEquality )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1000:1: ( ruleOpEquality )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1001:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalXscript2451);
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
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1106:4: ( ( () 'instanceof' ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1106:5: ( () 'instanceof' )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1106:5: ( () 'instanceof' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1106:6: () 'instanceof'
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1106:6: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1107:1: 
        {
        }

        match(input,24,FOLLOW_24_in_synpred5_InternalXscript2727); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalXscript

    // $ANTLR start synpred6_InternalXscript
    public final void synpred6_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1134:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1134:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1134:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1134:10: () ( ( ruleOpCompare ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1134:10: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1135:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1135:2: ( ( ruleOpCompare ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1136:1: ( ruleOpCompare )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1136:1: ( ruleOpCompare )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1137:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalXscript2800);
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
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1256:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1256:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1256:4: ( () ( ( ruleOpOther ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1256:5: () ( ( ruleOpOther ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1256:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1257:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1257:2: ( ( ruleOpOther ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1258:1: ( ruleOpOther )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1258:1: ( ruleOpOther )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1259:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalXscript3119);
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
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1364:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1364:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1364:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1364:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1364:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1365:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1365:2: ( ( ruleOpAdd ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1366:1: ( ruleOpAdd )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1366:1: ( ruleOpAdd )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1367:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalXscript3399);
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
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1472:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1472:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1472:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1472:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1472:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1473:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1473:2: ( ( ruleOpMulti ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1474:1: ( ruleOpMulti )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1474:1: ( ruleOpMulti )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1475:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalXscript3679);
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
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1705:3: ( ( () 'as' ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1705:4: ( () 'as' )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1705:4: ( () 'as' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1705:5: () 'as'
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1705:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1706:1: 
        {
        }

        match(input,17,FOLLOW_17_in_synpred10_InternalXscript4273); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalXscript

    // $ANTLR start synpred11_InternalXscript
    public final void synpred11_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1765:4: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1765:5: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1765:5: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1765:6: () '.' ( ( RULE_ID ) ) ruleOpSingleAssign
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1765:6: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1766:1: 
        {
        }

        match(input,12,FOLLOW_12_in_synpred11_InternalXscript4427); if (state.failed) return ;
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1767:1: ( ( RULE_ID ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1768:1: ( RULE_ID )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1768:1: ( RULE_ID )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1769:2: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred11_InternalXscript4435); if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalXscript4442);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalXscript

    // $ANTLR start synpred12_InternalXscript
    public final void synpred12_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1822:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1822:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1822:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1822:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1822:10: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1823:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1823:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt72=3;
        switch ( input.LA(1) ) {
        case 12:
            {
            alt72=1;
            }
            break;
        case 37:
            {
            alt72=2;
            }
            break;
        case 38:
            {
            alt72=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 72, 0, input);

            throw nvae;
        }

        switch (alt72) {
            case 1 :
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1823:4: '.'
                {
                match(input,12,FOLLOW_12_in_synpred12_InternalXscript4542); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1825:6: ( ( '?.' ) )
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1825:6: ( ( '?.' ) )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1826:1: ( '?.' )
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1826:1: ( '?.' )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1827:2: '?.'
                {
                match(input,37,FOLLOW_37_in_synpred12_InternalXscript4556); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1832:6: ( ( '*.' ) )
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1832:6: ( ( '*.' ) )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1833:1: ( '*.' )
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1833:1: ( '*.' )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1834:2: '*.'
                {
                match(input,38,FOLLOW_38_in_synpred12_InternalXscript4576); if (state.failed) return ;

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
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1941:4: ( ( '(' ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1942:1: ( '(' )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1942:1: ( '(' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1943:2: '('
        {
        match(input,40,FOLLOW_40_in_synpred13_InternalXscript4800); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalXscript

    // $ANTLR start synpred14_InternalXscript
    public final void synpred14_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1962:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1962:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1962:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1962:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1962:6: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1963:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1963:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt74=2;
        int LA74_0 = input.LA(1);

        if ( (LA74_0==RULE_ID||LA74_0==40||LA74_0==69) ) {
            alt74=1;
        }
        switch (alt74) {
            case 1 :
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1963:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1963:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1964:1: ( ruleJvmFormalParameter )
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1964:1: ( ruleJvmFormalParameter )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1965:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalXscript4852);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1967:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop73:
                do {
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==39) ) {
                        alt73=1;
                    }


                    switch (alt73) {
                	case 1 :
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1967:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,39,FOLLOW_39_in_synpred14_InternalXscript4859); if (state.failed) return ;
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1968:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1969:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1969:1: ( ruleJvmFormalParameter )
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1970:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalXscript4866);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop73;
                    }
                } while (true);


                }
                break;

        }

        match(input,43,FOLLOW_43_in_synpred14_InternalXscript4876); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalXscript

    // $ANTLR start synpred16_InternalXscript
    public final void synpred16_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2426:4: ( 'else' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2426:6: 'else'
        {
        match(input,46,FOLLOW_46_in_synpred16_InternalXscript5905); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalXscript

    // $ANTLR start synpred17_InternalXscript
    public final void synpred17_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3050:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3050:5: ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3050:5: ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3050:6: ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3050:6: ( ( ruleJvmTypeReference ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3051:1: ( ruleJvmTypeReference )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3051:1: ( ruleJvmTypeReference )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3052:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred17_InternalXscript7272);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3054:2: ( ( RULE_ID ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3055:1: ( RULE_ID )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3055:1: ( RULE_ID )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3056:1: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred17_InternalXscript7281); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred17_InternalXscript

    // $ANTLR start synpred18_InternalXscript
    public final void synpred18_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3281:4: ( ( '(' ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3282:1: ( '(' )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3282:1: ( '(' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3283:2: '('
        {
        match(input,40,FOLLOW_40_in_synpred18_InternalXscript7707); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalXscript

    // $ANTLR start synpred19_InternalXscript
    public final void synpred19_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3302:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3302:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3302:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3302:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3302:6: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3303:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3303:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt78=2;
        int LA78_0 = input.LA(1);

        if ( (LA78_0==RULE_ID||LA78_0==40||LA78_0==69) ) {
            alt78=1;
        }
        switch (alt78) {
            case 1 :
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3303:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3303:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3304:1: ( ruleJvmFormalParameter )
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3304:1: ( ruleJvmFormalParameter )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3305:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalXscript7759);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3307:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop77:
                do {
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==39) ) {
                        alt77=1;
                    }


                    switch (alt77) {
                	case 1 :
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3307:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,39,FOLLOW_39_in_synpred19_InternalXscript7766); if (state.failed) return ;
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3308:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3309:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3309:1: ( ruleJvmFormalParameter )
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3310:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalXscript7773);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop77;
                    }
                } while (true);


                }
                break;

        }

        match(input,43,FOLLOW_43_in_synpred19_InternalXscript7783); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalXscript

    // $ANTLR start synpred20_InternalXscript
    public final void synpred20_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3474:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3474:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3474:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3474:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3474:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3475:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3475:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt80=2;
        int LA80_0 = input.LA(1);

        if ( (LA80_0==RULE_ID||LA80_0==40||LA80_0==69) ) {
            alt80=1;
        }
        switch (alt80) {
            case 1 :
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3475:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3475:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3476:1: ( ruleJvmFormalParameter )
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3476:1: ( ruleJvmFormalParameter )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3477:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalXscript8113);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3479:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop79:
                do {
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==39) ) {
                        alt79=1;
                    }


                    switch (alt79) {
                	case 1 :
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3479:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,39,FOLLOW_39_in_synpred20_InternalXscript8120); if (state.failed) return ;
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3480:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3481:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3481:1: ( ruleJvmFormalParameter )
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3482:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalXscript8127);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop79;
                    }
                } while (true);


                }
                break;

        }

        match(input,43,FOLLOW_43_in_synpred20_InternalXscript8137); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalXscript

    // $ANTLR start synpred21_InternalXscript
    public final void synpred21_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3850:2: ( ( ruleXExpression ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3851:1: ( ruleXExpression )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3851:1: ( ruleXExpression )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3852:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred21_InternalXscript9018);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalXscript

    // $ANTLR start synpred22_InternalXscript
    public final void synpred22_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3921:5: ( 'catch' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3921:7: 'catch'
        {
        match(input,68,FOLLOW_68_in_synpred22_InternalXscript9163); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalXscript

    // $ANTLR start synpred23_InternalXscript
    public final void synpred23_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3940:5: ( 'finally' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3940:7: 'finally'
        {
        match(input,67,FOLLOW_67_in_synpred23_InternalXscript9193); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalXscript

    // $ANTLR start synpred25_InternalXscript
    public final void synpred25_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4084:3: ( '.' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4085:2: '.'
        {
        match(input,12,FOLLOW_12_in_synpred25_InternalXscript9533); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalXscript

    // $ANTLR start synpred26_InternalXscript
    public final void synpred26_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4266:4: ( '<' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4266:6: '<'
        {
        match(input,28,FOLLOW_28_in_synpred26_InternalXscript9983); if (state.failed) return ;

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
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA69 dfa69 = new DFA69(this);
    static final String DFA30_eotS =
        "\75\uffff";
    static final String DFA30_eofS =
        "\1\2\74\uffff";
    static final String DFA30_minS =
        "\1\4\1\0\73\uffff";
    static final String DFA30_maxS =
        "\1\105\1\0\73\uffff";
    static final String DFA30_acceptS =
        "\2\uffff\1\2\71\uffff\1\1";
    static final String DFA30_specialS =
        "\1\uffff\1\0\73\uffff}>";
    static final String[] DFA30_transitionS = {
            "\3\2\4\uffff\4\2\2\uffff\1\2\1\uffff\25\2\1\1\2\2\1\uffff\32"+
            "\2",
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
            return "1941:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
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
                        if ( (synpred13_InternalXscript()) ) {s = 60;}

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
        "\34\uffff";
    static final String DFA29_eofS =
        "\34\uffff";
    static final String DFA29_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA29_maxS =
        "\1\105\2\0\31\uffff";
    static final String DFA29_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA29_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\1\2\5\4\uffff\1\5\20\uffff\1\5\2\uffff\2\5\3\uffff\1\5\3"+
            "\uffff\1\2\1\33\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\3\uffff\10\5\2\uffff\1\3",
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
            return "1962:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA29_0==69) && (synpred14_InternalXscript())) {s = 3;}

                        else if ( (LA29_0==43) && (synpred14_InternalXscript())) {s = 4;}

                        else if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_INT)||LA29_0==11||LA29_0==28||(LA29_0>=31 && LA29_0<=32)||LA29_0==36||LA29_0==42||LA29_0==45||LA29_0==47||LA29_0==49||(LA29_0>=53 && LA29_0<=55)||(LA29_0>=59 && LA29_0<=66)) ) {s = 5;}

                        else if ( (LA29_0==41) ) {s = 27;}

                         
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
    static final String DFA54_eotS =
        "\75\uffff";
    static final String DFA54_eofS =
        "\1\2\74\uffff";
    static final String DFA54_minS =
        "\1\4\1\0\73\uffff";
    static final String DFA54_maxS =
        "\1\105\1\0\73\uffff";
    static final String DFA54_acceptS =
        "\2\uffff\1\2\71\uffff\1\1";
    static final String DFA54_specialS =
        "\1\uffff\1\0\73\uffff}>";
    static final String[] DFA54_transitionS = {
            "\3\2\4\uffff\4\2\2\uffff\1\2\1\uffff\25\2\1\1\2\2\1\uffff\32"+
            "\2",
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
            return "3281:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_1 = input.LA(1);

                         
                        int index54_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index54_1);
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
    static final String DFA53_eotS =
        "\34\uffff";
    static final String DFA53_eofS =
        "\34\uffff";
    static final String DFA53_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA53_maxS =
        "\1\105\2\0\31\uffff";
    static final String DFA53_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA53_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\1\2\5\4\uffff\1\5\20\uffff\1\5\2\uffff\2\5\3\uffff\1\5\3"+
            "\uffff\1\2\1\33\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\3\uffff\10\5\2\uffff\1\3",
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
            ""
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "3302:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_0 = input.LA(1);

                         
                        int index53_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA53_0==RULE_ID) ) {s = 1;}

                        else if ( (LA53_0==40) ) {s = 2;}

                        else if ( (LA53_0==69) && (synpred19_InternalXscript())) {s = 3;}

                        else if ( (LA53_0==43) && (synpred19_InternalXscript())) {s = 4;}

                        else if ( ((LA53_0>=RULE_STRING && LA53_0<=RULE_INT)||LA53_0==11||LA53_0==28||(LA53_0>=31 && LA53_0<=32)||LA53_0==36||LA53_0==42||LA53_0==45||LA53_0==47||LA53_0==49||(LA53_0>=53 && LA53_0<=55)||(LA53_0>=59 && LA53_0<=66)) ) {s = 5;}

                        else if ( (LA53_0==41) ) {s = 27;}

                         
                        input.seek(index53_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA53_1 = input.LA(1);

                         
                        int index53_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalXscript()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index53_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA53_2 = input.LA(1);

                         
                        int index53_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalXscript()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index53_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA58_eotS =
        "\34\uffff";
    static final String DFA58_eofS =
        "\34\uffff";
    static final String DFA58_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA58_maxS =
        "\1\105\2\0\31\uffff";
    static final String DFA58_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA58_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA58_transitionS = {
            "\1\1\2\5\4\uffff\1\5\20\uffff\1\5\2\uffff\2\5\3\uffff\1\5\3"+
            "\uffff\1\2\1\33\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\3\uffff\10\5\2\uffff\1\3",
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
            ""
    };

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "3474:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_0 = input.LA(1);

                         
                        int index58_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA58_0==RULE_ID) ) {s = 1;}

                        else if ( (LA58_0==40) ) {s = 2;}

                        else if ( (LA58_0==69) && (synpred20_InternalXscript())) {s = 3;}

                        else if ( (LA58_0==43) && (synpred20_InternalXscript())) {s = 4;}

                        else if ( ((LA58_0>=RULE_STRING && LA58_0<=RULE_INT)||LA58_0==11||LA58_0==28||(LA58_0>=31 && LA58_0<=32)||LA58_0==36||LA58_0==42||LA58_0==45||LA58_0==47||LA58_0==49||(LA58_0>=53 && LA58_0<=55)||(LA58_0>=59 && LA58_0<=66)) ) {s = 5;}

                        else if ( (LA58_0==41) ) {s = 27;}

                         
                        input.seek(index58_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA58_1 = input.LA(1);

                         
                        int index58_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXscript()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index58_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA58_2 = input.LA(1);

                         
                        int index58_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXscript()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index58_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA60_eotS =
        "\75\uffff";
    static final String DFA60_eofS =
        "\1\31\74\uffff";
    static final String DFA60_minS =
        "\1\4\30\0\44\uffff";
    static final String DFA60_maxS =
        "\1\105\30\0\44\uffff";
    static final String DFA60_acceptS =
        "\31\uffff\1\2\42\uffff\1\1";
    static final String DFA60_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\44\uffff}>";
    static final String[] DFA60_transitionS = {
            "\1\1\1\16\1\14\4\uffff\1\30\3\31\2\uffff\1\31\1\uffff\11\31"+
            "\1\10\2\31\1\4\1\3\3\31\1\2\3\31\1\27\1\31\1\11\1\uffff\1\31"+
            "\1\20\1\31\1\7\1\31\1\6\3\31\1\21\1\22\1\23\3\31\1\5\1\12\1"+
            "\13\1\15\1\17\1\24\1\25\1\26\3\31",
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

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "3850:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA60_1 = input.LA(1);

                         
                        int index60_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index60_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA60_2 = input.LA(1);

                         
                        int index60_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index60_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA60_3 = input.LA(1);

                         
                        int index60_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index60_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA60_4 = input.LA(1);

                         
                        int index60_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index60_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA60_5 = input.LA(1);

                         
                        int index60_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index60_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA60_6 = input.LA(1);

                         
                        int index60_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index60_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA60_7 = input.LA(1);

                         
                        int index60_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index60_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA60_8 = input.LA(1);

                         
                        int index60_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index60_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA60_9 = input.LA(1);

                         
                        int index60_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index60_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA60_10 = input.LA(1);

                         
                        int index60_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index60_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA60_11 = input.LA(1);

                         
                        int index60_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index60_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA60_12 = input.LA(1);

                         
                        int index60_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index60_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA60_13 = input.LA(1);

                         
                        int index60_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index60_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA60_14 = input.LA(1);

                         
                        int index60_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index60_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA60_15 = input.LA(1);

                         
                        int index60_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index60_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA60_16 = input.LA(1);

                         
                        int index60_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index60_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA60_17 = input.LA(1);

                         
                        int index60_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index60_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA60_18 = input.LA(1);

                         
                        int index60_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index60_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA60_19 = input.LA(1);

                         
                        int index60_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index60_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA60_20 = input.LA(1);

                         
                        int index60_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index60_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA60_21 = input.LA(1);

                         
                        int index60_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index60_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA60_22 = input.LA(1);

                         
                        int index60_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index60_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA60_23 = input.LA(1);

                         
                        int index60_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index60_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA60_24 = input.LA(1);

                         
                        int index60_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index60_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 60, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA69_eotS =
        "\75\uffff";
    static final String DFA69_eofS =
        "\1\2\74\uffff";
    static final String DFA69_minS =
        "\1\4\1\0\73\uffff";
    static final String DFA69_maxS =
        "\1\105\1\0\73\uffff";
    static final String DFA69_acceptS =
        "\2\uffff\1\2\71\uffff\1\1";
    static final String DFA69_specialS =
        "\1\uffff\1\0\73\uffff}>";
    static final String[] DFA69_transitionS = {
            "\3\2\4\uffff\4\2\2\uffff\1\2\1\uffff\11\2\1\1\16\2\1\uffff\32"+
            "\2",
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
            ""
    };

    static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
    static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
    static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
    static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
    static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
    static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
    static final short[][] DFA69_transition;

    static {
        int numStates = DFA69_transitionS.length;
        DFA69_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
        }
    }

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = DFA69_eot;
            this.eof = DFA69_eof;
            this.min = DFA69_min;
            this.max = DFA69_max;
            this.accept = DFA69_accept;
            this.special = DFA69_special;
            this.transition = DFA69_transition;
        }
        public String getDescription() {
            return "4266:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_1 = input.LA(1);

                         
                        int index69_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index69_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 69, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleXScript_in_entryRuleXScript75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXScript85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXScript141 = new BitSet(new long[]{0xFEE2A51190004872L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXScriptExpression_in_ruleXScript168 = new BitSet(new long[]{0xFEE2A51190004872L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXScript195 = new BitSet(new long[]{0xFEE2A51190004872L,0x0000000000000007L});
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
    public static final BitSet FOLLOW_RULE_ID_in_ruleXAssignment1498 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1514 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1564 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1617 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpSingleAssign1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpMultiAssign1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1912 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1965 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1988 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr2027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpOr2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2171 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression2224 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2247 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd2286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpAnd2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2430 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2483 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2506 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpEquality2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpEquality2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2710 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_24_in_ruleXRelationalExpression2746 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2771 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2832 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2855 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpCompare2944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpCompare2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpCompare2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpCompare3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3098 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3151 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3174 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther3213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOther3262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression3331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3378 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3431 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3454 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpAdd3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpAdd3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3658 = new BitSet(new long[]{0x0000000E00002002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3711 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3734 = new BitSet(new long[]{0x0000000E00002002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleOpMulti3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpMulti3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpMulti3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpMulti3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3987 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary4073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary4084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpUnary4122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpUnary4141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpUnary4160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression4210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4257 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleXCastedExpression4292 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4315 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4410 = new BitSet(new long[]{0x0000006000001002L});
    public static final BitSet FOLLOW_12_in_ruleXMemberFeatureCall4459 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXMemberFeatureCall4479 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4495 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4517 = new BitSet(new long[]{0x0000006000001002L});
    public static final BitSet FOLLOW_12_in_ruleXMemberFeatureCall4603 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_37_in_ruleXMemberFeatureCall4627 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_38_in_ruleXMemberFeatureCall4664 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_28_in_ruleXMemberFeatureCall4693 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4714 = new BitSet(new long[]{0x0000008008000000L});
    public static final BitSet FOLLOW_39_in_ruleXMemberFeatureCall4727 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4748 = new BitSet(new long[]{0x0000008008000000L});
    public static final BitSet FOLLOW_27_in_ruleXMemberFeatureCall4762 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXMemberFeatureCall4784 = new BitSet(new long[]{0x0000016000001002L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall4818 = new BitSet(new long[]{0xF8E2AF1190008870L,0x0000000000000027L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4893 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4921 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_39_in_ruleXMemberFeatureCall4934 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4955 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall4972 = new BitSet(new long[]{0x0000006000001002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral5124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleXClosure5296 = new BitSet(new long[]{0x0000090000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5318 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_39_in_ruleXClosure5331 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5352 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_43_in_ruleXClosure5368 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXClosure5389 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXClosure5401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5545 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_39_in_ruleXShortClosure5558 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5579 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_43_in_ruleXShortClosure5595 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleXParenthesizedExpression5701 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5723 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXParenthesizedExpression5734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleXIfExpression5826 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXIfExpression5838 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5859 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXIfExpression5871 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5892 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleXIfExpression5913 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression5983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXSwitchExpression6029 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXSwitchExpression6047 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXSwitchExpression6064 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6087 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXSwitchExpression6099 = new BitSet(new long[]{0x0011010000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6120 = new BitSet(new long[]{0x001D010000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_50_in_ruleXSwitchExpression6134 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXSwitchExpression6146 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6167 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXSwitchExpression6181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6273 = new BitSet(new long[]{0x0011000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXCasePart6287 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6308 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXCasePart6322 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXForLoopExpression6435 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXForLoopExpression6447 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6468 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXForLoopExpression6480 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6501 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXForLoopExpression6513 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXWhileExpression6626 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXWhileExpression6638 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6659 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXWhileExpression6671 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression6738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXDoWhileExpression6784 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6805 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXDoWhileExpression6817 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXDoWhileExpression6829 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6850 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXDoWhileExpression6862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression6908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXBlockExpression6954 = new BitSet(new long[]{0xFEEAA51190004870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression6976 = new BitSet(new long[]{0xFFEAA51190004870L,0x0000000000000007L});
    public static final BitSet FOLLOW_56_in_ruleXBlockExpression6989 = new BitSet(new long[]{0xFEEAA51190004870L,0x0000000000000007L});
    public static final BitSet FOLLOW_51_in_ruleXBlockExpression7005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXVariableDeclaration7223 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_58_in_ruleXVariableDeclaration7254 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7303 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXVariableDeclaration7320 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXVariableDeclaration7350 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleXVariableDeclaration7369 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJvmFormalParameter7502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleXFeatureCall7600 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7621 = new BitSet(new long[]{0x0000008008000000L});
    public static final BitSet FOLLOW_39_in_ruleXFeatureCall7634 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7655 = new BitSet(new long[]{0x0000008008000000L});
    public static final BitSet FOLLOW_27_in_ruleXFeatureCall7669 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXFeatureCall7691 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleXFeatureCall7725 = new BitSet(new long[]{0xF8E2AF1190008870L,0x0000000000000027L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7800 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7828 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_39_in_ruleXFeatureCall7841 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7862 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_41_in_ruleXFeatureCall7879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall7917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall7927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXConstructorCall7973 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall7996 = new BitSet(new long[]{0x0000010010000000L});
    public static final BitSet FOLLOW_28_in_ruleXConstructorCall8009 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8030 = new BitSet(new long[]{0x0000008008000000L});
    public static final BitSet FOLLOW_39_in_ruleXConstructorCall8043 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8064 = new BitSet(new long[]{0x0000008008000000L});
    public static final BitSet FOLLOW_27_in_ruleXConstructorCall8078 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXConstructorCall8092 = new BitSet(new long[]{0xF8E2AF1190008870L,0x0000000000000027L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8154 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8182 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_39_in_ruleXConstructorCall8195 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8216 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_41_in_ruleXConstructorCall8233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral8279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXBooleanLiteral8326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXBooleanLiteral8350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral8410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXNullLiteral8456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral8492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral8502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral8553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral8594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral8604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral8655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral8696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral8706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXTypeLiteral8752 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXTypeLiteral8764 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral8787 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXTypeLiteral8799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression8835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression8845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXThrowExpression8891 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression8912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression8948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression8958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXReturnExpression9004 = new BitSet(new long[]{0xF8E2A51190000872L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXTryCatchFinallyExpression9128 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9179 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_ruleXTryCatchFinallyExpression9201 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXTryCatchFinallyExpression9245 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause9314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXCatchClause9359 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXCatchClause9372 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause9393 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXCatchClause9405 = new BitSet(new long[]{0xF8E2A51190000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause9426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName9474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName9514 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedName9542 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName9558 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference9605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference9615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference9662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference9689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef9724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef9734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleXFunctionTypeRef9772 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9793 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_39_in_ruleXFunctionTypeRef9806 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9827 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_41_in_ruleXFunctionTypeRef9841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleXFunctionTypeRef9855 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference9912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference9922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference9970 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleJvmParameterizedTypeReference9991 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10013 = new BitSet(new long[]{0x0000008008000000L});
    public static final BitSet FOLLOW_39_in_ruleJvmParameterizedTypeReference10026 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10047 = new BitSet(new long[]{0x0000008008000000L});
    public static final BitSet FOLLOW_27_in_ruleJvmParameterizedTypeReference10061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference10218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference10228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleJvmWildcardTypeReference10274 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000280L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference10296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference10323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound10361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound10371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleJvmUpperBound10408 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound10429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded10465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded10475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleJvmUpperBoundAnded10512 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded10533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound10569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound10579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleJvmLowerBound10616 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound10637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalXscript1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalXscript1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalXscript2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalXscript2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred5_InternalXscript2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalXscript2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalXscript3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalXscript3399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalXscript3679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_synpred10_InternalXscript4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred11_InternalXscript4427 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred11_InternalXscript4435 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalXscript4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred12_InternalXscript4542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred12_InternalXscript4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred12_InternalXscript4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred13_InternalXscript4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalXscript4852 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_39_in_synpred14_InternalXscript4859 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalXscript4866 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_43_in_synpred14_InternalXscript4876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred16_InternalXscript5905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred17_InternalXscript7272 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred17_InternalXscript7281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred18_InternalXscript7707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalXscript7759 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_39_in_synpred19_InternalXscript7766 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalXscript7773 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_43_in_synpred19_InternalXscript7783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalXscript8113 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_39_in_synpred20_InternalXscript8120 = new BitSet(new long[]{0x0000010000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalXscript8127 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_43_in_synpred20_InternalXscript8137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred21_InternalXscript9018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_synpred22_InternalXscript9163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_synpred23_InternalXscript9193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred25_InternalXscript9533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred26_InternalXscript9983 = new BitSet(new long[]{0x0000000000000002L});

}
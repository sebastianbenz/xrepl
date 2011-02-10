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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'*'", "'import'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'-'", "'**'", "'/'", "'%'", "'!'", "'as'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "'if'", "'else'", "'switch'", "':'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "';'", "'var'", "'val'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'", "'super'"
    };
    public static final int T__42=42;
    public static final int T__12=12;
    public static final int T__28=28;
    public static final int T__57=57;
    public static final int T__23=23;
    public static final int T__51=51;
    public static final int T__13=13;
    public static final int RULE_STRING=6;
    public static final int T__69=69;
    public static final int T__47=47;
    public static final int T__50=50;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__19=19;
    public static final int T__70=70;
    public static final int T__67=67;
    public static final int T__39=39;
    public static final int T__30=30;
    public static final int T__52=52;
    public static final int T__46=46;
    public static final int T__68=68;
    public static final int T__17=17;
    public static final int T__62=62;
    public static final int RULE_INT=5;
    public static final int T__27=27;
    public static final int T__24=24;
    public static final int T__49=49;
    public static final int T__61=61;
    public static final int T__59=59;
    public static final int T__54=54;
    public static final int T__48=48;
    public static final int T__34=34;
    public static final int T__56=56;
    public static final int T__15=15;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__35=35;
    public static final int RULE_ID=4;
    public static final int T__36=36;
    public static final int T__20=20;
    public static final int T__58=58;
    public static final int T__64=64;
    public static final int T__44=44;
    public static final int T__66=66;
    public static final int T__14=14;
    public static final int T__33=33;
    public static final int T__22=22;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__29=29;
    public static final int T__45=45;
    public static final int RULE_WS=9;
    public static final int T__63=63;
    public static final int T__43=43;
    public static final int T__31=31;
    public static final int T__40=40;
    public static final int EOF=-1;
    public static final int T__53=53;
    public static final int T__16=16;
    public static final int T__32=32;
    public static final int T__38=38;
    public static final int T__37=37;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__60=60;
    public static final int T__41=41;
    public static final int T__18=18;

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
                case RULE_INT:
                case RULE_STRING:
                case 24:
                case 27:
                case 28:
                case 32:
                case 37:
                case 39:
                case 42:
                case 44:
                case 46:
                case 50:
                case 51:
                case 52:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                    {
                    alt1=1;
                    }
                    break;
                case 13:
                    {
                    alt1=2;
                    }
                    break;
                case 54:
                case 55:
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:159:1: ruleXScriptExpression returns [EObject current=null] : this_XImport_0= ruleXImport ;
    public final EObject ruleXScriptExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XImport_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:162:28: (this_XImport_0= ruleXImport )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:164:5: this_XImport_0= ruleXImport
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXScriptExpressionAccess().getXImportParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXImport_in_ruleXScriptExpression289);
            this_XImport_0=ruleXImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XImport_0; 
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
    // $ANTLR end "ruleXScriptExpression"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:180:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:181:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:182:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard324);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildCard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard335); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:189:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:192:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:193:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:193:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:194:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard382);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:204:1: (kw= '.' kw= '*' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:205:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,11,FOLLOW_11_in_ruleQualifiedNameWithWildCard401); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleQualifiedNameWithWildCard414); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:224:1: entryRuleXImport returns [EObject current=null] : iv_ruleXImport= ruleXImport EOF ;
    public final EObject entryRuleXImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXImport = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:225:2: (iv_ruleXImport= ruleXImport EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:226:2: iv_ruleXImport= ruleXImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXImportRule()); 
            }
            pushFollow(FOLLOW_ruleXImport_in_entryRuleXImport456);
            iv_ruleXImport=ruleXImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXImport466); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:233:1: ruleXImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleXImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:236:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:237:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:237:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:237:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleXImport503); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXImportAccess().getImportKeyword_0());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:241:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:242:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:242:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:243:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleXImport524);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
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


    // $ANTLR start "entryRuleXExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:267:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:268:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:269:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression560);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression570); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:276:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:279:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:281:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression616);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:297:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:298:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:299:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment650);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment660); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:306:1: ruleXAssignment returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:309:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:310:1: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:310:1: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==14) ) {
                    alt4=1;
                }
                else if ( (LA4_1==EOF||(LA4_1>=RULE_ID && LA4_1<=RULE_STRING)||(LA4_1>=11 && LA4_1<=13)||(LA4_1>=15 && LA4_1<=39)||(LA4_1>=41 && LA4_1<=66)) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA4_0>=RULE_INT && LA4_0<=RULE_STRING)||LA4_0==24||(LA4_0>=27 && LA4_0<=28)||LA4_0==32||LA4_0==37||LA4_0==39||LA4_0==42||LA4_0==44||LA4_0==46||(LA4_0>=50 && LA4_0<=52)||(LA4_0>=56 && LA4_0<=63)) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:310:2: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:310:2: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:310:3: () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:310:3: ()
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:311:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:316:2: ( (otherlv_1= RULE_ID ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:317:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:317:1: (otherlv_1= RULE_ID )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:318:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXAssignment715); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment731);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:337:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:338:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:338:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:339:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment751);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:356:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:356:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:357:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment781);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:365:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==15) ) {
                        int LA3_1 = input.LA(2);

                        if ( (synpred1_InternalXscript()) ) {
                            alt3=1;
                        }
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:365:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:365:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:365:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:370:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:370:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:370:7: ()
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:371:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:376:2: ( ( ruleOpMultiAssign ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:377:1: ( ruleOpMultiAssign )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:377:1: ( ruleOpMultiAssign )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:378:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment834);
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

                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:391:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:392:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:392:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:393:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment857);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:417:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:418:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:419:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign897);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign908); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:426:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:429:28: (kw= '=' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:431:2: kw= '='
            {
            kw=(Token)match(input,14,FOLLOW_14_in_ruleOpSingleAssign945); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:444:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:445:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:446:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign985);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign996); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:453:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:456:28: (kw= '+=' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:458:2: kw= '+='
            {
            kw=(Token)match(input,15,FOLLOW_15_in_ruleOpMultiAssign1033); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:471:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:472:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:473:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1072);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1082); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:480:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:483:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:484:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:484:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:485:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1129);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:493:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    int LA5_2 = input.LA(2);

                    if ( (synpred2_InternalXscript()) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:493:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:493:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:493:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:498:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:498:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:498:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:499:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:504:2: ( ( ruleOpOr ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:505:1: ( ruleOpOr )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:505:1: ( ruleOpOr )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:506:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1182);
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

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:519:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:520:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:520:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:521:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1205);
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
            	    break loop5;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:545:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:546:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:547:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1244);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1255); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:554:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:557:28: (kw= '||' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:559:2: kw= '||'
            {
            kw=(Token)match(input,16,FOLLOW_16_in_ruleOpOr1292); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:572:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:573:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:574:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1331);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1341); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:581:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:584:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:585:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:585:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:586:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1388);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:594:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    int LA6_2 = input.LA(2);

                    if ( (synpred3_InternalXscript()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:594:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:594:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:594:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:599:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:599:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:599:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:600:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:605:2: ( ( ruleOpAnd ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:606:1: ( ruleOpAnd )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:606:1: ( ruleOpAnd )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:607:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1441);
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

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:620:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:621:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:621:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:622:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1464);
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
            	    break loop6;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:646:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:647:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:648:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1503);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1514); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:655:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:658:28: (kw= '&&' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:660:2: kw= '&&'
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleOpAnd1551); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:673:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:674:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:675:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1590);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression1600); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:682:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:685:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:686:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:686:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:687:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1647);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:695:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    int LA7_2 = input.LA(2);

                    if ( (synpred4_InternalXscript()) ) {
                        alt7=1;
                    }


                }
                else if ( (LA7_0==19) ) {
                    int LA7_3 = input.LA(2);

                    if ( (synpred4_InternalXscript()) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:695:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:695:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:695:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:700:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:700:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:700:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:701:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:706:2: ( ( ruleOpEquality ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:707:1: ( ruleOpEquality )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:707:1: ( ruleOpEquality )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:708:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1700);
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

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:721:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:722:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:722:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:723:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1723);
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
            	    break loop7;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:747:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:748:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:749:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality1762);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality1773); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:756:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:759:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:760:1: (kw= '==' | kw= '!=' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:760:1: (kw= '==' | kw= '!=' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:761:2: kw= '=='
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleOpEquality1811); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:768:2: kw= '!='
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleOpEquality1830); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:781:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:782:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:783:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1870);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression1880); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:790:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:793:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:794:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:794:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:795:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1927);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:803:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop9:
            do {
                int alt9=3;
                switch ( input.LA(1) ) {
                case 24:
                    {
                    int LA9_2 = input.LA(2);

                    if ( (synpred6_InternalXscript()) ) {
                        alt9=2;
                    }


                    }
                    break;
                case 20:
                    {
                    int LA9_3 = input.LA(2);

                    if ( (synpred5_InternalXscript()) ) {
                        alt9=1;
                    }


                    }
                    break;
                case 21:
                    {
                    int LA9_4 = input.LA(2);

                    if ( (synpred6_InternalXscript()) ) {
                        alt9=2;
                    }


                    }
                    break;
                case 22:
                    {
                    int LA9_5 = input.LA(2);

                    if ( (synpred6_InternalXscript()) ) {
                        alt9=2;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA9_6 = input.LA(2);

                    if ( (synpred6_InternalXscript()) ) {
                        alt9=2;
                    }


                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:803:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:803:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:803:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:803:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:803:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:805:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:805:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:805:6: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:806:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleXRelationalExpression1963); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:815:3: ( ( ruleQualifiedName ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:816:1: ( ruleQualifiedName )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:816:1: ( ruleQualifiedName )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:817:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression1988);
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
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:831:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:831:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:831:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:831:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:831:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:836:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:836:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:836:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:837:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:842:2: ( ( ruleOpCompare ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:843:1: ( ruleOpCompare )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:843:1: ( ruleOpCompare )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:844:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2049);
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

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:857:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:858:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:858:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:859:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2072);
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
            	    break loop9;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:883:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:884:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:885:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2112);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2123); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:892:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:895:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:896:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:896:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt10=1;
                }
                break;
            case 22:
                {
                alt10=2;
                }
                break;
            case 23:
                {
                alt10=3;
                }
                break;
            case 24:
                {
                alt10=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:897:2: kw= '>='
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleOpCompare2161); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:904:2: kw= '<='
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleOpCompare2180); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:911:2: kw= '>'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpCompare2199); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:918:2: kw= '<'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpCompare2218); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:931:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:932:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:933:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2258);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2268); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:940:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:943:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:944:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:944:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:945:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2315);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:953:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    int LA11_2 = input.LA(2);

                    if ( (synpred7_InternalXscript()) ) {
                        alt11=1;
                    }


                }
                else if ( (LA11_0==26) ) {
                    int LA11_3 = input.LA(2);

                    if ( (synpred7_InternalXscript()) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:953:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:953:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:953:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:958:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:958:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:958:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:959:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:964:2: ( ( ruleOpOther ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:965:1: ( ruleOpOther )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:965:1: ( ruleOpOther )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:966:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2368);
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

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:979:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:980:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:980:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:981:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2391);
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1005:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1006:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1007:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2430);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2441); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1014:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1017:28: ( (kw= '->' | kw= '..' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1018:1: (kw= '->' | kw= '..' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1018:1: (kw= '->' | kw= '..' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            else if ( (LA12_0==26) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1019:2: kw= '->'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther2479); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1026:2: kw= '..'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2498); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1039:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1040:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1041:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2538);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2548); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1048:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1051:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1052:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1052:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1053:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2595);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1061:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    int LA13_2 = input.LA(2);

                    if ( (synpred8_InternalXscript()) ) {
                        alt13=1;
                    }


                }
                else if ( (LA13_0==27) ) {
                    int LA13_3 = input.LA(2);

                    if ( (synpred8_InternalXscript()) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1061:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1061:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1061:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1066:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1066:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1066:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1067:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1072:2: ( ( ruleOpAdd ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1073:1: ( ruleOpAdd )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1073:1: ( ruleOpAdd )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1074:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2648);
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

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1087:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1088:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1088:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1089:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2671);
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
            	    break loop13;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1113:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1114:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1115:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd2710);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd2721); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1122:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1125:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1126:1: (kw= '+' | kw= '-' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1126:1: (kw= '+' | kw= '-' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            else if ( (LA14_0==28) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1127:2: kw= '+'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpAdd2759); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1134:2: kw= '-'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpAdd2778); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1147:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1148:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1149:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2818);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2828); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1156:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1159:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1160:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1160:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1161:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2875);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1169:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop15:
            do {
                int alt15=2;
                switch ( input.LA(1) ) {
                case 12:
                    {
                    int LA15_2 = input.LA(2);

                    if ( (synpred9_InternalXscript()) ) {
                        alt15=1;
                    }


                    }
                    break;
                case 29:
                    {
                    int LA15_3 = input.LA(2);

                    if ( (synpred9_InternalXscript()) ) {
                        alt15=1;
                    }


                    }
                    break;
                case 30:
                    {
                    int LA15_4 = input.LA(2);

                    if ( (synpred9_InternalXscript()) ) {
                        alt15=1;
                    }


                    }
                    break;
                case 31:
                    {
                    int LA15_5 = input.LA(2);

                    if ( (synpred9_InternalXscript()) ) {
                        alt15=1;
                    }


                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1169:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1169:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1169:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1174:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1174:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1174:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1175:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1180:2: ( ( ruleOpMulti ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1181:1: ( ruleOpMulti )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1181:1: ( ruleOpMulti )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1182:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression2928);
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

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1195:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1196:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1196:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1197:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2951);
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
            	    break loop15;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1221:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1222:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1223:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti2990);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3001); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1230:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1233:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1234:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1234:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt16=1;
                }
                break;
            case 29:
                {
                alt16=2;
                }
                break;
            case 30:
                {
                alt16=3;
                }
                break;
            case 31:
                {
                alt16=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1235:2: kw= '*'
                    {
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleOpMulti3039); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1242:2: kw= '**'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpMulti3058); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1249:2: kw= '/'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpMulti3077); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1256:2: kw= '%'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpMulti3096); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1269:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1270:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1271:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3136);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3146); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1278:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1281:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1282:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1282:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=27 && LA17_0<=28)||LA17_0==32) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_STRING)||LA17_0==24||LA17_0==37||LA17_0==39||LA17_0==42||LA17_0==44||LA17_0==46||(LA17_0>=50 && LA17_0<=52)||(LA17_0>=56 && LA17_0<=63)) ) {
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1282:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1282:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1282:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1282:3: ()
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1283:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1288:2: ( ( ruleOpUnary ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1289:1: ( ruleOpUnary )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1289:1: ( ruleOpUnary )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1290:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3204);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1303:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1304:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1304:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1305:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3225);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1323:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3254);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1339:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1340:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1341:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3290);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3301); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1348:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1351:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1352:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1352:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt18=1;
                }
                break;
            case 28:
                {
                alt18=2;
                }
                break;
            case 27:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1353:2: kw= '!'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpUnary3339); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1360:2: kw= '-'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpUnary3358); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1367:2: kw= '+'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpUnary3377); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1380:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1381:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1382:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3417);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3427); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1389:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1392:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1393:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1393:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1394:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3474);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1402:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==33) ) {
                    int LA19_2 = input.LA(2);

                    if ( (synpred10_InternalXscript()) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1402:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1402:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1402:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1404:5: ( () otherlv_2= 'as' )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1404:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1404:6: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1405:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleXCastedExpression3509); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1414:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1415:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1415:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1416:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3532);
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
            	    break loop19;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1440:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1441:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1442:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3570);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3580); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1449:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1452:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1453:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1453:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1454:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3627);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1462:1: ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            loop26:
            do {
                int alt26=3;
                switch ( input.LA(1) ) {
                case 11:
                    {
                    int LA26_2 = input.LA(2);

                    if ( (synpred11_InternalXscript()) ) {
                        alt26=1;
                    }
                    else if ( (synpred12_InternalXscript()) ) {
                        alt26=2;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA26_3 = input.LA(2);

                    if ( (synpred12_InternalXscript()) ) {
                        alt26=2;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA26_4 = input.LA(2);

                    if ( (synpred12_InternalXscript()) ) {
                        alt26=2;
                    }


                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1462:2: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1462:2: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1462:3: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1462:3: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1462:4: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1469:25: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1469:26: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1469:26: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1470:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleXMemberFeatureCall3676); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1479:1: ( (otherlv_3= RULE_ID ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1480:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1480:1: (otherlv_3= RULE_ID )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1481:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXMemberFeatureCall3696); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3712);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1500:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1501:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1501:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1502:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3734);
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
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1519:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1519:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1519:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1519:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1519:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1535:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1535:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1535:8: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1536:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1541:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt20=3;
            	    switch ( input.LA(1) ) {
            	    case 11:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt20=2;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt20=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt20) {
            	        case 1 :
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1541:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,11,FOLLOW_11_in_ruleXMemberFeatureCall3820); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1546:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1546:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1547:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1547:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1548:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,34,FOLLOW_34_in_ruleXMemberFeatureCall3844); if (state.failed) return current;
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
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1562:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1562:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1563:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1563:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1564:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,35,FOLLOW_35_in_ruleXMemberFeatureCall3881); if (state.failed) return current;
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

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1577:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==24) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1577:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,24,FOLLOW_24_in_ruleXMemberFeatureCall3910); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1581:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1582:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1582:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1583:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3931);
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

            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1599:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop21:
            	            do {
            	                int alt21=2;
            	                int LA21_0 = input.LA(1);

            	                if ( (LA21_0==36) ) {
            	                    alt21=1;
            	                }


            	                switch (alt21) {
            	            	case 1 :
            	            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1599:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,36,FOLLOW_36_in_ruleXMemberFeatureCall3944); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1603:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1604:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1604:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1605:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3965);
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
            	            	    break loop21;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,23,FOLLOW_23_in_ruleXMemberFeatureCall3979); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1625:3: ( (otherlv_15= RULE_ID ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1626:1: (otherlv_15= RULE_ID )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1626:1: (otherlv_15= RULE_ID )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1627:3: otherlv_15= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXMemberFeatureCall4001); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_15, grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1638:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt25=2;
            	    alt25 = dfa25.predict(input);
            	    switch (alt25) {
            	        case 1 :
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1638:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1638:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1638:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1645:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1646:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,37,FOLLOW_37_in_ruleXMemberFeatureCall4035); if (state.failed) return current;
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

            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1659:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt24=3;
            	            alt24 = dfa24.predict(input);
            	            switch (alt24) {
            	                case 1 :
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1659:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1659:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1659:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1671:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1672:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4110);
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
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1689:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1689:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1689:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1689:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1690:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1690:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1691:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4138);
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

            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1707:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop23:
            	                    do {
            	                        int alt23=2;
            	                        int LA23_0 = input.LA(1);

            	                        if ( (LA23_0==36) ) {
            	                            alt23=1;
            	                        }


            	                        switch (alt23) {
            	                    	case 1 :
            	                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1707:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,36,FOLLOW_36_in_ruleXMemberFeatureCall4151); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1711:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1712:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1712:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1713:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4172);
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
            	                    	    break loop23;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,38,FOLLOW_38_in_ruleXMemberFeatureCall4189); if (state.failed) return current;
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
            	    break loop26;
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


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1741:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1742:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1743:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4230);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4240); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1750:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1753:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1754:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1754:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt27=13;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt27=1;
                }
                break;
            case 46:
                {
                alt27=2;
                }
                break;
            case 44:
                {
                alt27=3;
                }
                break;
            case RULE_ID:
            case 24:
                {
                alt27=4;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 39:
            case 57:
            case 58:
            case 59:
            case 60:
                {
                alt27=5;
                }
                break;
            case 42:
                {
                alt27=6;
                }
                break;
            case 50:
                {
                alt27=7;
                }
                break;
            case 51:
                {
                alt27=8;
                }
                break;
            case 52:
                {
                alt27=9;
                }
                break;
            case 61:
                {
                alt27=10;
                }
                break;
            case 62:
                {
                alt27=11;
                }
                break;
            case 63:
                {
                alt27=12;
                }
                break;
            case 37:
                {
                alt27=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1755:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4287);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1765:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4314);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1775:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4341);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1785:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4368);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1795:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4395);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1805:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4422);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1815:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4449);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1825:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4476);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1835:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4503);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1845:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4530);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1855:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4557);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1865:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4584);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1875:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4611);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
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


    // $ANTLR start "entryRuleXLiteral"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1891:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1892:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1893:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral4646);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral4656); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1900:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1903:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1904:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1904:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt28=6;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt28=1;
                }
                break;
            case 57:
            case 58:
                {
                alt28=2;
                }
                break;
            case RULE_INT:
                {
                alt28=3;
                }
                break;
            case 59:
                {
                alt28=4;
                }
                break;
            case RULE_STRING:
                {
                alt28=5;
                }
                break;
            case 60:
                {
                alt28=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1905:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral4703);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1915:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4730);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1925:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral4757);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1935:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral4784);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1945:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral4811);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1955:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral4838);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1971:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1972:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1973:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure4873);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure4883); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1980:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1983:28: ( ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1984:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1984:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1984:2: () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1984:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1985:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleXClosure4929); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1994:1: ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID||LA30_0==37||LA30_0==66) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1994:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1994:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1995:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1995:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1996:3: lv_formalParameters_2_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure4951);
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

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2012:2: (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==36) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2012:4: otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleXClosure4964); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2016:1: ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2017:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2017:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2018:3: lv_formalParameters_4_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure4985);
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
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,40,FOLLOW_40_in_ruleXClosure5001); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXClosureAccess().getVerticalLineKeyword_3());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2038:1: ( (lv_expression_6_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2039:1: (lv_expression_6_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2039:1: (lv_expression_6_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2040:3: lv_expression_6_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXClosure5022);
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

            otherlv_7=(Token)match(input,41,FOLLOW_41_in_ruleXClosure5034); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2068:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2069:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2070:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5070);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5080); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2077:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalParameters_1_0 = null;

        EObject lv_formalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2080:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2081:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2081:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2081:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2081:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2081:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2092:5: ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2092:6: () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2092:6: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2093:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2098:2: ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID||LA32_0==37||LA32_0==66) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2098:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2098:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2099:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2099:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2100:3: lv_formalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5178);
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

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2116:2: (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==36) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2116:4: otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleXShortClosure5191); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2120:1: ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2121:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2121:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2122:3: lv_formalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5212);
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
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleXShortClosure5228); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXShortClosureAccess().getVerticalLineKeyword_0_0_2());
                  
            }

            }


            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2142:3: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2143:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2143:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2144:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5251);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2168:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2169:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2170:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5287);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5297); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2177:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2180:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2181:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2181:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2181:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleXParenthesizedExpression5334); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5356);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleXParenthesizedExpression5367); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2206:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2207:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2208:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5403);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5413); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2215:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2218:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2219:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2219:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2219:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2219:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2220:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleXIfExpression5459); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleXIfExpression5471); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2233:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2234:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2234:1: (lv_if_3_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2235:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5492);
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

            otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleXIfExpression5504); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2255:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2256:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2256:1: (lv_then_5_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2257:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5525);
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

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2273:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==43) ) {
                int LA33_1 = input.LA(2);

                if ( (synpred16_InternalXscript()) ) {
                    alt33=1;
                }
            }
            switch (alt33) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2273:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2273:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2273:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,43,FOLLOW_43_in_ruleXIfExpression5546); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2278:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2279:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2279:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2280:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5568);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2304:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2305:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2306:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5606);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression5616); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2313:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2316:28: ( ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2317:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2317:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2317:2: () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2317:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2318:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleXSwitchExpression5662); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2327:1: ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==45) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2327:2: ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':'
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2327:2: ( (lv_localVarName_2_0= RULE_ID ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2328:1: (lv_localVarName_2_0= RULE_ID )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2328:1: (lv_localVarName_2_0= RULE_ID )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2329:3: lv_localVarName_2_0= RULE_ID
                    {
                    lv_localVarName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXSwitchExpression5680); if (state.failed) return current;
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

                    otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleXSwitchExpression5697); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2349:3: ( (lv_switch_4_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2350:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2350:1: (lv_switch_4_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2351:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression5720);
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

            otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleXSwitchExpression5732); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2371:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID||LA35_0==37||LA35_0==45||LA35_0==49||LA35_0==66) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2372:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2372:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2373:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression5753);
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
            	    if ( cnt35 >= 1 ) break loop35;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2389:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==47) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2389:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,47,FOLLOW_47_in_ruleXSwitchExpression5767); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,45,FOLLOW_45_in_ruleXSwitchExpression5779); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2397:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2398:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2398:1: (lv_default_9_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2399:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression5800);
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

            otherlv_10=(Token)match(input,48,FOLLOW_48_in_ruleXSwitchExpression5814); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2427:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2428:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2429:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart5850);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart5860); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2436:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2439:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2440:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2440:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2440:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2440:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID||LA37_0==37||LA37_0==66) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2441:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2441:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2442:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart5906);
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

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2458:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==49) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2458:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleXCasePart5920); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2462:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2463:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2463:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2464:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart5941);
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

            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleXCasePart5955); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2484:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2485:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2485:1: (lv_then_4_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2486:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart5976);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2510:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2511:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2512:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6012);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6022); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2519:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2522:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2523:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2523:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2523:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2523:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2524:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleXForLoopExpression6068); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleXForLoopExpression6080); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2537:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2538:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2538:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2539:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6101);
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

            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXForLoopExpression6113); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2559:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2560:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2560:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2561:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6134);
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

            otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleXForLoopExpression6146); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2581:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2582:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2582:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2583:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6167);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2607:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2608:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2609:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6203);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6213); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2616:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2619:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2620:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2620:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2620:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2620:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2621:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleXWhileExpression6259); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleXWhileExpression6271); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2634:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2635:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2635:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2636:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6292);
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

            otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleXWhileExpression6304); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2656:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2657:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2657:1: (lv_body_5_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2658:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6325);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2682:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2683:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2684:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6361);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression6371); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2691:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2694:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2695:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2695:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2695:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2695:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2696:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXDoWhileExpression6417); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2705:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2706:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2706:1: (lv_body_2_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2707:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6438);
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

            otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleXDoWhileExpression6450); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleXDoWhileExpression6462); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2731:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2732:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2732:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2733:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6483);
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

            otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleXDoWhileExpression6495); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2761:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2762:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2763:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6531);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression6541); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2770:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2773:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2774:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2774:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2774:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2774:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2775:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleXBlockExpression6587); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2784:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_STRING)||LA40_0==24||(LA40_0>=27 && LA40_0<=28)||LA40_0==32||LA40_0==37||LA40_0==39||LA40_0==42||LA40_0==44||LA40_0==46||(LA40_0>=50 && LA40_0<=52)||(LA40_0>=54 && LA40_0<=63)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2784:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2784:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2785:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2785:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2786:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression6609);
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

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2802:2: (otherlv_3= ';' )?
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==53) ) {
            	        alt39=1;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2802:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleXBlockExpression6622); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleXBlockExpression6638); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2818:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2819:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2820:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock6674);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock6684); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2827:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2830:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2831:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2831:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=54 && LA41_0<=55)) ) {
                alt41=1;
            }
            else if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_STRING)||LA41_0==24||(LA41_0>=27 && LA41_0<=28)||LA41_0==32||LA41_0==37||LA41_0==39||LA41_0==42||LA41_0==44||LA41_0==46||(LA41_0>=50 && LA41_0<=52)||(LA41_0>=56 && LA41_0<=63)) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2832:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock6731);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2842:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock6758);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2858:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2859:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2860:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration6793);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration6803); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2867:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2870:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2871:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2871:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2871:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2871:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2872:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2877:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==54) ) {
                alt42=1;
            }
            else if ( (LA42_0==55) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2877:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2877:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2878:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2878:1: (lv_writeable_1_0= 'var' )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2879:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,54,FOLLOW_54_in_ruleXVariableDeclaration6856); if (state.failed) return current;
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2893:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleXVariableDeclaration6887); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2897:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                int LA43_1 = input.LA(2);

                if ( (synpred17_InternalXscript()) ) {
                    alt43=1;
                }
                else if ( (true) ) {
                    alt43=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA43_0==37) && (synpred17_InternalXscript())) {
                alt43=1;
            }
            else if ( (LA43_0==66) && (synpred17_InternalXscript())) {
                alt43=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2897:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2897:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2897:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2906:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2906:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2906:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2907:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2907:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2908:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration6936);
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

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2924:2: ( (lv_name_4_0= RULE_ID ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2925:1: (lv_name_4_0= RULE_ID )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2925:1: (lv_name_4_0= RULE_ID )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2926:3: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXVariableDeclaration6953); if (state.failed) return current;
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2943:6: ( (lv_name_5_0= RULE_ID ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2943:6: ( (lv_name_5_0= RULE_ID ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2944:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2944:1: (lv_name_5_0= RULE_ID )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2945:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXVariableDeclaration6983); if (state.failed) return current;
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

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2961:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==14) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2961:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleXVariableDeclaration7002); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2965:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2966:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2966:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2967:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7023);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2991:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2992:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2993:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7061);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7071); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3000:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_parameterType_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3003:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3004:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3004:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3004:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3004:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==RULE_ID||LA45_1==11||LA45_1==24) ) {
                    alt45=1;
                }
            }
            else if ( (LA45_0==37||LA45_0==66) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3005:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3005:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3006:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7117);
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

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3022:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3023:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3023:1: (lv_name_1_0= RULE_ID )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3024:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJvmFormalParameter7135); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3048:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3049:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3050:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7176);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7186); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3057:1: ruleXFeatureCall returns [EObject current=null] : ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3060:28: ( ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3061:1: ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3061:1: ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3061:2: () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )?
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3061:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3062:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3067:2: (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==24) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3067:4: otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleXFeatureCall7233); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_1_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3071:1: ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3072:1: (lv_typeArguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3072:1: (lv_typeArguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3073:3: lv_typeArguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7254);
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

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3089:2: (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==36) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3089:4: otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleXFeatureCall7267); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXFeatureCallAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3093:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3094:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3094:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3095:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7288);
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
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleXFeatureCall7302); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3115:3: ( (otherlv_6= RULE_ID ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3116:1: (otherlv_6= RULE_ID )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3116:1: (otherlv_6= RULE_ID )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3117:3: otherlv_6= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXFeatureCall7324); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_2_0()); 
              	
            }

            }


            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3128:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )?
            int alt50=2;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3128:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')'
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3128:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3128:4: ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3135:1: (lv_explicitOperationCall_7_0= '(' )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3136:3: lv_explicitOperationCall_7_0= '('
                    {
                    lv_explicitOperationCall_7_0=(Token)match(input,37,FOLLOW_37_in_ruleXFeatureCall7358); if (state.failed) return current;
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

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3149:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )?
                    int alt49=3;
                    alt49 = dfa49.predict(input);
                    switch (alt49) {
                        case 1 :
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3149:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3149:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3149:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3161:1: (lv_featureCallArguments_8_0= ruleXShortClosure )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3162:3: lv_featureCallArguments_8_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_3_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7433);
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
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3179:6: ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3179:6: ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3179:7: ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )*
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3179:7: ( (lv_featureCallArguments_9_0= ruleXExpression ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3180:1: (lv_featureCallArguments_9_0= ruleXExpression )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3180:1: (lv_featureCallArguments_9_0= ruleXExpression )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3181:3: lv_featureCallArguments_9_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_3_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7461);
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

                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3197:2: (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )*
                            loop48:
                            do {
                                int alt48=2;
                                int LA48_0 = input.LA(1);

                                if ( (LA48_0==36) ) {
                                    alt48=1;
                                }


                                switch (alt48) {
                            	case 1 :
                            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3197:4: otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) )
                            	    {
                            	    otherlv_10=(Token)match(input,36,FOLLOW_36_in_ruleXFeatureCall7474); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_10, grammarAccess.getXFeatureCallAccess().getCommaKeyword_3_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3201:1: ( (lv_featureCallArguments_11_0= ruleXExpression ) )
                            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3202:1: (lv_featureCallArguments_11_0= ruleXExpression )
                            	    {
                            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3202:1: (lv_featureCallArguments_11_0= ruleXExpression )
                            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3203:3: lv_featureCallArguments_11_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_3_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7495);
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
                            	    break loop48;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,38,FOLLOW_38_in_ruleXFeatureCall7512); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3231:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3232:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3233:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall7550);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall7560); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3240:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3243:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3244:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3244:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3244:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3244:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3245:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXConstructorCall7606); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3254:1: ( ( ruleQualifiedName ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3255:1: ( ruleQualifiedName )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3255:1: ( ruleQualifiedName )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3256:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall7629);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3269:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==24) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3269:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleXConstructorCall7642); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3273:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3274:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3274:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3275:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall7663);
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

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3291:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==36) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3291:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleXConstructorCall7676); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3295:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3296:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3296:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3297:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall7697);
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
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleXConstructorCall7711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,37,FOLLOW_37_in_ruleXConstructorCall7725); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3321:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt54=3;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3321:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3321:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3321:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3333:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3334:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall7787);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3351:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3351:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3351:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3351:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3352:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3352:1: (lv_arguments_10_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3353:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall7815);
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

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3369:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==36) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3369:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,36,FOLLOW_36_in_ruleXConstructorCall7828); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3373:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3374:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3374:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3375:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall7849);
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
                    	    break loop53;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,38,FOLLOW_38_in_ruleXConstructorCall7866); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3403:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3404:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3405:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral7902);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral7912); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3412:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3415:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3416:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3416:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3416:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3416:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3417:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3422:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==57) ) {
                alt55=1;
            }
            else if ( (LA55_0==58) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3422:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXBooleanLiteral7959); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3427:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3427:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3428:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3428:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3429:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,58,FOLLOW_58_in_ruleXBooleanLiteral7983); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3450:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3451:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3452:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8033);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral8043); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3459:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3462:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3463:1: ( () otherlv_1= 'null' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3463:1: ( () otherlv_1= 'null' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3463:2: () otherlv_1= 'null'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3463:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3464:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXNullLiteral8089); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3481:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3482:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3483:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral8125);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral8135); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3490:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3493:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3494:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3494:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3494:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3494:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3495:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3500:2: ( (lv_value_1_0= RULE_INT ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3501:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3501:1: (lv_value_1_0= RULE_INT )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3502:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral8186); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3526:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3527:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3528:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral8227);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral8237); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3535:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3538:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3539:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3539:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3539:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3539:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3540:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3545:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3546:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3546:1: (lv_value_1_0= RULE_STRING )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3547:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral8288); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3571:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3572:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3573:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral8329);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral8339); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3580:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3583:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3584:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3584:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3584:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3584:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3585:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXTypeLiteral8385); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleXTypeLiteral8397); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3598:1: ( ( ruleQualifiedName ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3599:1: ( ruleQualifiedName )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3599:1: ( ruleQualifiedName )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3600:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral8420);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleXTypeLiteral8432); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3625:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3626:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3627:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression8468);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression8478); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3634:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3637:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3638:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3638:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3638:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3638:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3639:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXThrowExpression8524); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3648:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3649:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3649:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3650:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression8545);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3674:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3675:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3676:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression8581);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression8591); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3683:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3686:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3687:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3687:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3687:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3687:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3688:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXReturnExpression8637); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3697:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt56=2;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3697:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3702:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3703:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression8668);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3727:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3728:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3729:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression8705);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression8715); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3736:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3739:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3740:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3740:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3740:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3740:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3741:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXTryCatchFinallyExpression8761); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3750:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3751:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3751:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3752:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression8782);
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

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3768:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==65) ) {
                alt59=1;
            }
            else if ( (LA59_0==64) ) {
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3768:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3768:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3768:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3768:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt57=0;
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==65) ) {
                            int LA57_2 = input.LA(2);

                            if ( (synpred22_InternalXscript()) ) {
                                alt57=1;
                            }


                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3768:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3770:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3771:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression8812);
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
                    	    if ( cnt57 >= 1 ) break loop57;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(57, input);
                                throw eee;
                        }
                        cnt57++;
                    } while (true);

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3787:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==64) ) {
                        int LA58_1 = input.LA(2);

                        if ( (synpred23_InternalXscript()) ) {
                            alt58=1;
                        }
                    }
                    switch (alt58) {
                        case 1 :
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3787:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3787:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3787:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,64,FOLLOW_64_in_ruleXTryCatchFinallyExpression8834); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3792:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3793:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3793:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3794:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression8856);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3811:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3811:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3811:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,64,FOLLOW_64_in_ruleXTryCatchFinallyExpression8878); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3815:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3816:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3816:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3817:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression8899);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3841:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3842:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3843:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause8937);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause8947); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3850:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3853:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3854:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3854:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3854:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3854:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3854:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_65_in_ruleXCatchClause8992); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleXCatchClause9005); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3863:1: ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3864:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3864:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3865:3: lv_declaredParam_2_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause9026);
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

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleXCatchClause9038); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3885:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3886:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3886:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3887:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause9059);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3911:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3912:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3913:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9096);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName9107); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3920:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3923:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3924:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3924:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3924:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName9147); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3931:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==11) ) {
                    int LA60_1 = input.LA(2);

                    if ( (LA60_1==RULE_ID) ) {
                        int LA60_3 = input.LA(3);

                        if ( (synpred25_InternalXscript()) ) {
                            alt60=1;
                        }


                    }


                }


                switch (alt60) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3931:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3931:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3931:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,11,FOLLOW_11_in_ruleQualifiedName9175); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName9191); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop60;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3954:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3955:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3956:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference9238);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference9248); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3963:1: ruleJvmTypeReference returns [EObject current=null] : (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_1 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3966:28: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3967:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3967:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                alt61=1;
            }
            else if ( (LA61_0==37||LA61_0==66) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3968:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference9295);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3978:5: this_XFunctionTypeRef_1= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference9322);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3994:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3995:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3996:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef9357);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef9367); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4003:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4006:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4007:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4007:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4007:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4007:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==37) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4007:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleXFunctionTypeRef9405); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4011:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4012:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4012:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4013:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9426);
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

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4029:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==36) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4029:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleXFunctionTypeRef9439); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4033:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4034:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4034:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4035:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9460);
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
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleXFunctionTypeRef9474); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,66,FOLLOW_66_in_ruleXFunctionTypeRef9488); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4059:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4060:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4060:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4061:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9509);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4085:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4086:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4087:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference9545);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference9555); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4094:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4097:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4098:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4098:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4098:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4098:2: ( ( ruleQualifiedName ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4099:1: ( ruleQualifiedName )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4099:1: ( ruleQualifiedName )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4100:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference9603);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4113:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4113:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4113:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4113:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleJvmParameterizedTypeReference9624); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4118:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4119:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4119:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4120:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference9646);
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

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4136:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==36) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4136:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleJvmParameterizedTypeReference9659); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4140:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4141:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4141:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4142:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference9680);
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
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleJvmParameterizedTypeReference9694); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4170:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4171:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4172:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference9732);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference9742); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4179:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4182:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4183:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4183:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID||LA66_0==37||LA66_0==66) ) {
                alt66=1;
            }
            else if ( (LA66_0==67) ) {
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4184:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference9789);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4194:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference9816);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4210:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4211:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4212:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference9851);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference9861); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4219:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4222:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4223:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4223:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4223:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4223:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4224:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleJvmWildcardTypeReference9907); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4233:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt67=3;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==68) ) {
                alt67=1;
            }
            else if ( (LA67_0==70) ) {
                alt67=2;
            }
            switch (alt67) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4233:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4233:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4234:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4234:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4235:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference9929);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4252:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4252:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4253:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4253:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4254:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference9956);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4278:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4279:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4280:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound9994);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound10004); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4287:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4290:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4291:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4291:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4291:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleJvmUpperBound10041); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4295:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4296:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4296:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4297:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound10062);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4321:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4322:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4323:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded10098);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded10108); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4330:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4333:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4334:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4334:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4334:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_ruleJvmUpperBoundAnded10145); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4338:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4339:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4339:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4340:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded10166);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4364:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4365:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4366:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound10202);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound10212); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4373:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4376:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4377:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4377:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4377:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleJvmLowerBound10249); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4381:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4382:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4382:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4383:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound10270);
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
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:365:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:365:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:365:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:365:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:365:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:366:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:366:2: ( ( ruleOpMultiAssign ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:367:1: ( ruleOpMultiAssign )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:367:1: ( ruleOpMultiAssign )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:368:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalXscript802);
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
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:493:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:493:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:493:4: ( () ( ( ruleOpOr ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:493:5: () ( ( ruleOpOr ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:493:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:494:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:494:2: ( ( ruleOpOr ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:495:1: ( ruleOpOr )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:495:1: ( ruleOpOr )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:496:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalXscript1150);
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
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:594:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:594:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:594:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:594:5: () ( ( ruleOpAnd ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:594:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:595:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:595:2: ( ( ruleOpAnd ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:596:1: ( ruleOpAnd )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:596:1: ( ruleOpAnd )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:597:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalXscript1409);
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
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:695:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:695:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:695:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:695:5: () ( ( ruleOpEquality ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:695:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:696:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:696:2: ( ( ruleOpEquality ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:697:1: ( ruleOpEquality )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:697:1: ( ruleOpEquality )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:698:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalXscript1668);
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
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:803:4: ( ( () 'instanceof' ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:803:5: ( () 'instanceof' )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:803:5: ( () 'instanceof' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:803:6: () 'instanceof'
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:803:6: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:804:1: 
        {
        }

        match(input,20,FOLLOW_20_in_synpred5_InternalXscript1944); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalXscript

    // $ANTLR start synpred6_InternalXscript
    public final void synpred6_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:831:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:831:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:831:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:831:10: () ( ( ruleOpCompare ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:831:10: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:832:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:832:2: ( ( ruleOpCompare ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:833:1: ( ruleOpCompare )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:833:1: ( ruleOpCompare )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:834:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalXscript2017);
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
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:953:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:953:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:953:4: ( () ( ( ruleOpOther ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:953:5: () ( ( ruleOpOther ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:953:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:954:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:954:2: ( ( ruleOpOther ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:955:1: ( ruleOpOther )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:955:1: ( ruleOpOther )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:956:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalXscript2336);
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
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1061:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1061:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1061:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1061:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1061:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1062:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1062:2: ( ( ruleOpAdd ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1063:1: ( ruleOpAdd )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1063:1: ( ruleOpAdd )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1064:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalXscript2616);
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
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1169:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1169:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1169:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1169:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1169:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1170:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1170:2: ( ( ruleOpMulti ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1171:1: ( ruleOpMulti )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1171:1: ( ruleOpMulti )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1172:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalXscript2896);
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
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1402:3: ( ( () 'as' ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1402:4: ( () 'as' )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1402:4: ( () 'as' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1402:5: () 'as'
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1402:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1403:1: 
        {
        }

        match(input,33,FOLLOW_33_in_synpred10_InternalXscript3490); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalXscript

    // $ANTLR start synpred11_InternalXscript
    public final void synpred11_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1462:4: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1462:5: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1462:5: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1462:6: () '.' ( ( RULE_ID ) ) ruleOpSingleAssign
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1462:6: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1463:1: 
        {
        }

        match(input,11,FOLLOW_11_in_synpred11_InternalXscript3644); if (state.failed) return ;
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1464:1: ( ( RULE_ID ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1465:1: ( RULE_ID )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1465:1: ( RULE_ID )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1466:2: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred11_InternalXscript3652); if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalXscript3659);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalXscript

    // $ANTLR start synpred12_InternalXscript
    public final void synpred12_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1519:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1519:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1519:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1519:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1519:10: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1520:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1520:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt68=3;
        switch ( input.LA(1) ) {
        case 11:
            {
            alt68=1;
            }
            break;
        case 34:
            {
            alt68=2;
            }
            break;
        case 35:
            {
            alt68=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 68, 0, input);

            throw nvae;
        }

        switch (alt68) {
            case 1 :
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1520:4: '.'
                {
                match(input,11,FOLLOW_11_in_synpred12_InternalXscript3759); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1522:6: ( ( '?.' ) )
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1522:6: ( ( '?.' ) )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1523:1: ( '?.' )
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1523:1: ( '?.' )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1524:2: '?.'
                {
                match(input,34,FOLLOW_34_in_synpred12_InternalXscript3773); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1529:6: ( ( '*.' ) )
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1529:6: ( ( '*.' ) )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1530:1: ( '*.' )
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1530:1: ( '*.' )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1531:2: '*.'
                {
                match(input,35,FOLLOW_35_in_synpred12_InternalXscript3793); if (state.failed) return ;

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
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1638:4: ( ( '(' ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1639:1: ( '(' )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1639:1: ( '(' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1640:2: '('
        {
        match(input,37,FOLLOW_37_in_synpred13_InternalXscript4017); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalXscript

    // $ANTLR start synpred14_InternalXscript
    public final void synpred14_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1659:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1659:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1659:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1659:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1659:6: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1660:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1660:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt70=2;
        int LA70_0 = input.LA(1);

        if ( (LA70_0==RULE_ID||LA70_0==37||LA70_0==66) ) {
            alt70=1;
        }
        switch (alt70) {
            case 1 :
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1660:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1660:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1661:1: ( ruleJvmFormalParameter )
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1661:1: ( ruleJvmFormalParameter )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1662:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalXscript4069);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1664:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop69:
                do {
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==36) ) {
                        alt69=1;
                    }


                    switch (alt69) {
                	case 1 :
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1664:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,36,FOLLOW_36_in_synpred14_InternalXscript4076); if (state.failed) return ;
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1665:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1666:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1666:1: ( ruleJvmFormalParameter )
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1667:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalXscript4083);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop69;
                    }
                } while (true);


                }
                break;

        }

        match(input,40,FOLLOW_40_in_synpred14_InternalXscript4093); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalXscript

    // $ANTLR start synpred16_InternalXscript
    public final void synpred16_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2273:4: ( 'else' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2273:6: 'else'
        {
        match(input,43,FOLLOW_43_in_synpred16_InternalXscript5538); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalXscript

    // $ANTLR start synpred17_InternalXscript
    public final void synpred17_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2897:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2897:5: ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2897:5: ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2897:6: ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2897:6: ( ( ruleJvmTypeReference ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2898:1: ( ruleJvmTypeReference )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2898:1: ( ruleJvmTypeReference )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2899:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred17_InternalXscript6905);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2901:2: ( ( RULE_ID ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2902:1: ( RULE_ID )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2902:1: ( RULE_ID )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2903:1: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred17_InternalXscript6914); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred17_InternalXscript

    // $ANTLR start synpred18_InternalXscript
    public final void synpred18_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3128:4: ( ( '(' ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3129:1: ( '(' )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3129:1: ( '(' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3130:2: '('
        {
        match(input,37,FOLLOW_37_in_synpred18_InternalXscript7340); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalXscript

    // $ANTLR start synpred19_InternalXscript
    public final void synpred19_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3149:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3149:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3149:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3149:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3149:6: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3150:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3150:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt74=2;
        int LA74_0 = input.LA(1);

        if ( (LA74_0==RULE_ID||LA74_0==37||LA74_0==66) ) {
            alt74=1;
        }
        switch (alt74) {
            case 1 :
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3150:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3150:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3151:1: ( ruleJvmFormalParameter )
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3151:1: ( ruleJvmFormalParameter )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3152:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalXscript7392);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3154:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop73:
                do {
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==36) ) {
                        alt73=1;
                    }


                    switch (alt73) {
                	case 1 :
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3154:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,36,FOLLOW_36_in_synpred19_InternalXscript7399); if (state.failed) return ;
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3155:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3156:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3156:1: ( ruleJvmFormalParameter )
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3157:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalXscript7406);
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

        match(input,40,FOLLOW_40_in_synpred19_InternalXscript7416); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalXscript

    // $ANTLR start synpred20_InternalXscript
    public final void synpred20_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3321:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3321:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3321:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3321:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3321:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3322:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3322:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt76=2;
        int LA76_0 = input.LA(1);

        if ( (LA76_0==RULE_ID||LA76_0==37||LA76_0==66) ) {
            alt76=1;
        }
        switch (alt76) {
            case 1 :
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3322:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3322:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3323:1: ( ruleJvmFormalParameter )
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3323:1: ( ruleJvmFormalParameter )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3324:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalXscript7746);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3326:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop75:
                do {
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==36) ) {
                        alt75=1;
                    }


                    switch (alt75) {
                	case 1 :
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3326:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,36,FOLLOW_36_in_synpred20_InternalXscript7753); if (state.failed) return ;
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3327:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3328:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3328:1: ( ruleJvmFormalParameter )
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3329:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalXscript7760);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop75;
                    }
                } while (true);


                }
                break;

        }

        match(input,40,FOLLOW_40_in_synpred20_InternalXscript7770); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalXscript

    // $ANTLR start synpred21_InternalXscript
    public final void synpred21_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3697:2: ( ( ruleXExpression ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3698:1: ( ruleXExpression )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3698:1: ( ruleXExpression )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3699:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred21_InternalXscript8651);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalXscript

    // $ANTLR start synpred22_InternalXscript
    public final void synpred22_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3768:5: ( 'catch' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3768:7: 'catch'
        {
        match(input,65,FOLLOW_65_in_synpred22_InternalXscript8796); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalXscript

    // $ANTLR start synpred23_InternalXscript
    public final void synpred23_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3787:5: ( 'finally' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3787:7: 'finally'
        {
        match(input,64,FOLLOW_64_in_synpred23_InternalXscript8826); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalXscript

    // $ANTLR start synpred25_InternalXscript
    public final void synpred25_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3931:3: ( '.' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3932:2: '.'
        {
        match(input,11,FOLLOW_11_in_synpred25_InternalXscript9166); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalXscript

    // $ANTLR start synpred26_InternalXscript
    public final void synpred26_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4113:4: ( '<' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4113:6: '<'
        {
        match(input,24,FOLLOW_24_in_synpred26_InternalXscript9616); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalXscript

    // Delegated rules

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


    protected DFA25 dfa25 = new DFA25(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA65 dfa65 = new DFA65(this);
    static final String DFA25_eotS =
        "\74\uffff";
    static final String DFA25_eofS =
        "\1\2\73\uffff";
    static final String DFA25_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA25_maxS =
        "\1\102\1\0\72\uffff";
    static final String DFA25_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA25_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA25_transitionS = {
            "\3\2\4\uffff\3\2\1\uffff\26\2\1\1\2\2\1\uffff\32\2",
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
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "1638:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_1 = input.LA(1);

                         
                        int index25_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalXscript()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index25_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA24_eotS =
        "\33\uffff";
    static final String DFA24_eofS =
        "\33\uffff";
    static final String DFA24_minS =
        "\1\4\2\0\30\uffff";
    static final String DFA24_maxS =
        "\1\102\2\0\30\uffff";
    static final String DFA24_acceptS =
        "\3\uffff\2\1\1\2\24\uffff\1\3";
    static final String DFA24_specialS =
        "\1\0\1\1\1\2\30\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\1\2\5\21\uffff\1\5\2\uffff\2\5\3\uffff\1\5\4\uffff\1\2\1"+
            "\32\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\3\5"+
            "\3\uffff\10\5\2\uffff\1\3",
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
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "1659:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_0 = input.LA(1);

                         
                        int index24_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_0==RULE_ID) ) {s = 1;}

                        else if ( (LA24_0==37) ) {s = 2;}

                        else if ( (LA24_0==66) && (synpred14_InternalXscript())) {s = 3;}

                        else if ( (LA24_0==40) && (synpred14_InternalXscript())) {s = 4;}

                        else if ( ((LA24_0>=RULE_INT && LA24_0<=RULE_STRING)||LA24_0==24||(LA24_0>=27 && LA24_0<=28)||LA24_0==32||LA24_0==39||LA24_0==42||LA24_0==44||LA24_0==46||(LA24_0>=50 && LA24_0<=52)||(LA24_0>=56 && LA24_0<=63)) ) {s = 5;}

                        else if ( (LA24_0==38) ) {s = 26;}

                         
                        input.seek(index24_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_1 = input.LA(1);

                         
                        int index24_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalXscript()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index24_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_2 = input.LA(1);

                         
                        int index24_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalXscript()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index24_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA50_eotS =
        "\74\uffff";
    static final String DFA50_eofS =
        "\1\2\73\uffff";
    static final String DFA50_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA50_maxS =
        "\1\102\1\0\72\uffff";
    static final String DFA50_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA50_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA50_transitionS = {
            "\3\2\4\uffff\3\2\1\uffff\26\2\1\1\2\2\1\uffff\32\2",
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
            ""
    };

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "3128:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_1 = input.LA(1);

                         
                        int index50_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalXscript()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index50_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 50, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA49_eotS =
        "\33\uffff";
    static final String DFA49_eofS =
        "\33\uffff";
    static final String DFA49_minS =
        "\1\4\2\0\30\uffff";
    static final String DFA49_maxS =
        "\1\102\2\0\30\uffff";
    static final String DFA49_acceptS =
        "\3\uffff\2\1\1\2\24\uffff\1\3";
    static final String DFA49_specialS =
        "\1\0\1\1\1\2\30\uffff}>";
    static final String[] DFA49_transitionS = {
            "\1\1\2\5\21\uffff\1\5\2\uffff\2\5\3\uffff\1\5\4\uffff\1\2\1"+
            "\32\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\3\5"+
            "\3\uffff\10\5\2\uffff\1\3",
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
            ""
    };

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "3149:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_0 = input.LA(1);

                         
                        int index49_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA49_0==RULE_ID) ) {s = 1;}

                        else if ( (LA49_0==37) ) {s = 2;}

                        else if ( (LA49_0==66) && (synpred19_InternalXscript())) {s = 3;}

                        else if ( (LA49_0==40) && (synpred19_InternalXscript())) {s = 4;}

                        else if ( ((LA49_0>=RULE_INT && LA49_0<=RULE_STRING)||LA49_0==24||(LA49_0>=27 && LA49_0<=28)||LA49_0==32||LA49_0==39||LA49_0==42||LA49_0==44||LA49_0==46||(LA49_0>=50 && LA49_0<=52)||(LA49_0>=56 && LA49_0<=63)) ) {s = 5;}

                        else if ( (LA49_0==38) ) {s = 26;}

                         
                        input.seek(index49_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA49_1 = input.LA(1);

                         
                        int index49_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalXscript()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index49_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA49_2 = input.LA(1);

                         
                        int index49_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalXscript()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index49_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 49, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA54_eotS =
        "\33\uffff";
    static final String DFA54_eofS =
        "\33\uffff";
    static final String DFA54_minS =
        "\1\4\2\0\30\uffff";
    static final String DFA54_maxS =
        "\1\102\2\0\30\uffff";
    static final String DFA54_acceptS =
        "\3\uffff\2\1\1\2\24\uffff\1\3";
    static final String DFA54_specialS =
        "\1\0\1\1\1\2\30\uffff}>";
    static final String[] DFA54_transitionS = {
            "\1\1\2\5\21\uffff\1\5\2\uffff\2\5\3\uffff\1\5\4\uffff\1\2\1"+
            "\32\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\3\5"+
            "\3\uffff\10\5\2\uffff\1\3",
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
            return "3321:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA54_0==37) ) {s = 2;}

                        else if ( (LA54_0==66) && (synpred20_InternalXscript())) {s = 3;}

                        else if ( (LA54_0==40) && (synpred20_InternalXscript())) {s = 4;}

                        else if ( ((LA54_0>=RULE_INT && LA54_0<=RULE_STRING)||LA54_0==24||(LA54_0>=27 && LA54_0<=28)||LA54_0==32||LA54_0==39||LA54_0==42||LA54_0==44||LA54_0==46||(LA54_0>=50 && LA54_0<=52)||(LA54_0>=56 && LA54_0<=63)) ) {s = 5;}

                        else if ( (LA54_0==38) ) {s = 26;}

                         
                        input.seek(index54_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA54_1 = input.LA(1);

                         
                        int index54_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXscript()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index54_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA54_2 = input.LA(1);

                         
                        int index54_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXscript()) ) {s = 4;}

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
    static final String DFA56_eotS =
        "\74\uffff";
    static final String DFA56_eofS =
        "\1\30\73\uffff";
    static final String DFA56_minS =
        "\1\4\27\0\44\uffff";
    static final String DFA56_maxS =
        "\1\102\27\0\44\uffff";
    static final String DFA56_acceptS =
        "\30\uffff\1\2\42\uffff\1\1";
    static final String DFA56_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\44\uffff}>";
    static final String[] DFA56_transitionS = {
            "\1\1\1\14\1\16\4\uffff\3\30\1\uffff\11\30\1\10\2\30\1\4\1\3"+
            "\3\30\1\2\4\30\1\27\1\30\1\11\1\uffff\1\30\1\20\1\30\1\7\1\30"+
            "\1\6\3\30\1\21\1\22\1\23\3\30\1\5\1\12\1\13\1\15\1\17\1\24\1"+
            "\25\1\26\3\30",
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

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "3697:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_1 = input.LA(1);

                         
                        int index56_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 59;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA56_2 = input.LA(1);

                         
                        int index56_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 59;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA56_3 = input.LA(1);

                         
                        int index56_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 59;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA56_4 = input.LA(1);

                         
                        int index56_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 59;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA56_5 = input.LA(1);

                         
                        int index56_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 59;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA56_6 = input.LA(1);

                         
                        int index56_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 59;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA56_7 = input.LA(1);

                         
                        int index56_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 59;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA56_8 = input.LA(1);

                         
                        int index56_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 59;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA56_9 = input.LA(1);

                         
                        int index56_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 59;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA56_10 = input.LA(1);

                         
                        int index56_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 59;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA56_11 = input.LA(1);

                         
                        int index56_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 59;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA56_12 = input.LA(1);

                         
                        int index56_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 59;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA56_13 = input.LA(1);

                         
                        int index56_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 59;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA56_14 = input.LA(1);

                         
                        int index56_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 59;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA56_15 = input.LA(1);

                         
                        int index56_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 59;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA56_16 = input.LA(1);

                         
                        int index56_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 59;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA56_17 = input.LA(1);

                         
                        int index56_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 59;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA56_18 = input.LA(1);

                         
                        int index56_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 59;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA56_19 = input.LA(1);

                         
                        int index56_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 59;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA56_20 = input.LA(1);

                         
                        int index56_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 59;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA56_21 = input.LA(1);

                         
                        int index56_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 59;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA56_22 = input.LA(1);

                         
                        int index56_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 59;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA56_23 = input.LA(1);

                         
                        int index56_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXscript()) ) {s = 59;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_23);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 56, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\74\uffff";
    static final String DFA65_eofS =
        "\1\2\73\uffff";
    static final String DFA65_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA65_maxS =
        "\1\102\1\0\72\uffff";
    static final String DFA65_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA65_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA65_transitionS = {
            "\3\2\4\uffff\3\2\1\uffff\11\2\1\1\17\2\1\uffff\32\2",
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
            ""
    };

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "4113:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_1 = input.LA(1);

                         
                        int index65_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalXscript()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index65_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleXScript_in_entryRuleXScript75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXScript85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXScript141 = new BitSet(new long[]{0xFFDC54A119002072L});
    public static final BitSet FOLLOW_ruleXScriptExpression_in_ruleXScript168 = new BitSet(new long[]{0xFFDC54A119002072L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXScript195 = new BitSet(new long[]{0xFFDC54A119002072L});
    public static final BitSet FOLLOW_ruleXScriptExpression_in_entryRuleXScriptExpression233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXScriptExpression243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXImport_in_ruleXScriptExpression289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard382 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleQualifiedNameWithWildCard401 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedNameWithWildCard414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXImport_in_entryRuleXImport456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXImport466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleXImport503 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleXImport524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment650 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXAssignment715 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment731 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment781 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment834 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOpSingleAssign945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleOpMultiAssign1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1129 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1182 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1205 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOpOr1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1388 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1441 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1464 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpAnd1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1647 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1700 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1723 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality1762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpEquality1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpEquality1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1927 = new BitSet(new long[]{0x0000000001F00002L});
    public static final BitSet FOLLOW_20_in_ruleXRelationalExpression1963 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression1988 = new BitSet(new long[]{0x0000000001F00002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2049 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2072 = new BitSet(new long[]{0x0000000001F00002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpCompare2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpCompare2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpCompare2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpCompare2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2315 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2368 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2391 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpOther2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2595 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2648 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2671 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd2710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpAdd2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpAdd2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2875 = new BitSet(new long[]{0x00000000E0001002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression2928 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2951 = new BitSet(new long[]{0x00000000E0001002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti2990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleOpMulti3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpMulti3058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpMulti3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpMulti3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3204 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpUnary3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpUnary3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpUnary3377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3474 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleXCastedExpression3509 = new BitSet(new long[]{0x0000002000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3532 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3627 = new BitSet(new long[]{0x0000000C00000802L});
    public static final BitSet FOLLOW_11_in_ruleXMemberFeatureCall3676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXMemberFeatureCall3696 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3712 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3734 = new BitSet(new long[]{0x0000000C00000802L});
    public static final BitSet FOLLOW_11_in_ruleXMemberFeatureCall3820 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_34_in_ruleXMemberFeatureCall3844 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_35_in_ruleXMemberFeatureCall3881 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24_in_ruleXMemberFeatureCall3910 = new BitSet(new long[]{0x0000002000000010L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3931 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_36_in_ruleXMemberFeatureCall3944 = new BitSet(new long[]{0x0000002000000010L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3965 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_23_in_ruleXMemberFeatureCall3979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXMemberFeatureCall4001 = new BitSet(new long[]{0x0000002C00000802L});
    public static final BitSet FOLLOW_37_in_ruleXMemberFeatureCall4035 = new BitSet(new long[]{0xFF1C55E119000070L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4110 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4138 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_36_in_ruleXMemberFeatureCall4151 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4172 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_38_in_ruleXMemberFeatureCall4189 = new BitSet(new long[]{0x0000000C00000802L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral4646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral4656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral4703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral4757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral4784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral4811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral4838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure4873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure4883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleXClosure4929 = new BitSet(new long[]{0x0000012000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure4951 = new BitSet(new long[]{0x0000011000000000L});
    public static final BitSet FOLLOW_36_in_ruleXClosure4964 = new BitSet(new long[]{0x0000002000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure4985 = new BitSet(new long[]{0x0000011000000000L});
    public static final BitSet FOLLOW_40_in_ruleXClosure5001 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXClosure5022 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXClosure5034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5178 = new BitSet(new long[]{0x0000011000000000L});
    public static final BitSet FOLLOW_36_in_ruleXShortClosure5191 = new BitSet(new long[]{0x0000002000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5212 = new BitSet(new long[]{0x0000011000000000L});
    public static final BitSet FOLLOW_40_in_ruleXShortClosure5228 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleXParenthesizedExpression5334 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5356 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleXParenthesizedExpression5367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleXIfExpression5459 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleXIfExpression5471 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5492 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleXIfExpression5504 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5525 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleXIfExpression5546 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression5616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleXSwitchExpression5662 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXSwitchExpression5680 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXSwitchExpression5697 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression5720 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXSwitchExpression5732 = new BitSet(new long[]{0x0002202000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression5753 = new BitSet(new long[]{0x0003A02000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_47_in_ruleXSwitchExpression5767 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXSwitchExpression5779 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression5800 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXSwitchExpression5814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart5850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart5860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart5906 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_49_in_ruleXCasePart5920 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart5941 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXCasePart5955 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart5976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXForLoopExpression6068 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleXForLoopExpression6080 = new BitSet(new long[]{0x0000002000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6101 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXForLoopExpression6113 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6134 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleXForLoopExpression6146 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXWhileExpression6259 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleXWhileExpression6271 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6292 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleXWhileExpression6304 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression6371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXDoWhileExpression6417 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6438 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXDoWhileExpression6450 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleXDoWhileExpression6462 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6483 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleXDoWhileExpression6495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression6541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXBlockExpression6587 = new BitSet(new long[]{0xFFDD54A119002070L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression6609 = new BitSet(new long[]{0xFFFD54A119002070L});
    public static final BitSet FOLLOW_53_in_ruleXBlockExpression6622 = new BitSet(new long[]{0xFFDD54A119002070L});
    public static final BitSet FOLLOW_48_in_ruleXBlockExpression6638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock6674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock6684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock6731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock6758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration6793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration6803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXVariableDeclaration6856 = new BitSet(new long[]{0x0000002000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_55_in_ruleXVariableDeclaration6887 = new BitSet(new long[]{0x0000002000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration6936 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXVariableDeclaration6953 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXVariableDeclaration6983 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleXVariableDeclaration7002 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJvmFormalParameter7135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleXFeatureCall7233 = new BitSet(new long[]{0x0000002000000010L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7254 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_36_in_ruleXFeatureCall7267 = new BitSet(new long[]{0x0000002000000010L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7288 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_23_in_ruleXFeatureCall7302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXFeatureCall7324 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleXFeatureCall7358 = new BitSet(new long[]{0xFF1C55E119000070L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7433 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7461 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_36_in_ruleXFeatureCall7474 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7495 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_38_in_ruleXFeatureCall7512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall7550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall7560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXConstructorCall7606 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall7629 = new BitSet(new long[]{0x0000002001000000L});
    public static final BitSet FOLLOW_24_in_ruleXConstructorCall7642 = new BitSet(new long[]{0x0000002000000010L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall7663 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_36_in_ruleXConstructorCall7676 = new BitSet(new long[]{0x0000002000000010L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall7697 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_23_in_ruleXConstructorCall7711 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleXConstructorCall7725 = new BitSet(new long[]{0xFF1C55E119000070L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall7787 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall7815 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_36_in_ruleXConstructorCall7828 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall7849 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_38_in_ruleXConstructorCall7866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral7902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral7912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXBooleanLiteral7959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXBooleanLiteral7983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral8043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXNullLiteral8089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral8125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral8135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral8186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral8227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral8237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral8288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral8329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral8339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXTypeLiteral8385 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleXTypeLiteral8397 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral8420 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleXTypeLiteral8432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression8468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression8478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXThrowExpression8524 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression8545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression8581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression8591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXReturnExpression8637 = new BitSet(new long[]{0xFF1C54A119000072L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression8668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression8705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression8715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXTryCatchFinallyExpression8761 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression8782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression8812 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_64_in_ruleXTryCatchFinallyExpression8834 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression8856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXTryCatchFinallyExpression8878 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression8899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause8937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause8947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXCatchClause8992 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleXCatchClause9005 = new BitSet(new long[]{0x0000002000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause9026 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleXCatchClause9038 = new BitSet(new long[]{0xFF1C54A119000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause9059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName9107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName9147 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleQualifiedName9175 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName9191 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference9238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference9248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference9295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference9322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef9357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef9367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleXFunctionTypeRef9405 = new BitSet(new long[]{0x0000002000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9426 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_36_in_ruleXFunctionTypeRef9439 = new BitSet(new long[]{0x0000002000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9460 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_38_in_ruleXFunctionTypeRef9474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleXFunctionTypeRef9488 = new BitSet(new long[]{0x0000002000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference9545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference9555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference9603 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleJvmParameterizedTypeReference9624 = new BitSet(new long[]{0x0000002000000010L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference9646 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_36_in_ruleJvmParameterizedTypeReference9659 = new BitSet(new long[]{0x0000002000000010L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference9680 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_23_in_ruleJvmParameterizedTypeReference9694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference9732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference9742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference9789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference9816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference9851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference9861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleJvmWildcardTypeReference9907 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000050L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference9929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference9956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound9994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound10004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleJvmUpperBound10041 = new BitSet(new long[]{0x0000002000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound10062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded10098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded10108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleJvmUpperBoundAnded10145 = new BitSet(new long[]{0x0000002000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded10166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound10202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound10212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleJvmLowerBound10249 = new BitSet(new long[]{0x0000002000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound10270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalXscript802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalXscript1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalXscript1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalXscript1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_synpred5_InternalXscript1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalXscript2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalXscript2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalXscript2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalXscript2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred10_InternalXscript3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred11_InternalXscript3644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred11_InternalXscript3652 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalXscript3659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred12_InternalXscript3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_synpred12_InternalXscript3773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred12_InternalXscript3793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred13_InternalXscript4017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalXscript4069 = new BitSet(new long[]{0x0000011000000000L});
    public static final BitSet FOLLOW_36_in_synpred14_InternalXscript4076 = new BitSet(new long[]{0x0000002000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalXscript4083 = new BitSet(new long[]{0x0000011000000000L});
    public static final BitSet FOLLOW_40_in_synpred14_InternalXscript4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred16_InternalXscript5538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred17_InternalXscript6905 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred17_InternalXscript6914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred18_InternalXscript7340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalXscript7392 = new BitSet(new long[]{0x0000011000000000L});
    public static final BitSet FOLLOW_36_in_synpred19_InternalXscript7399 = new BitSet(new long[]{0x0000002000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalXscript7406 = new BitSet(new long[]{0x0000011000000000L});
    public static final BitSet FOLLOW_40_in_synpred19_InternalXscript7416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalXscript7746 = new BitSet(new long[]{0x0000011000000000L});
    public static final BitSet FOLLOW_36_in_synpred20_InternalXscript7753 = new BitSet(new long[]{0x0000002000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalXscript7760 = new BitSet(new long[]{0x0000011000000000L});
    public static final BitSet FOLLOW_40_in_synpred20_InternalXscript7770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred21_InternalXscript8651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_synpred22_InternalXscript8796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_synpred23_InternalXscript8826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred25_InternalXscript9166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred26_InternalXscript9616 = new BitSet(new long[]{0x0000000000000002L});

}
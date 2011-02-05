/*******************************************************************************
 * Copyright (c) 2011 Sebastian Benz and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sebastian Benz - initial API and implementation
 *******************************************************************************/
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'*'", "'import'", "'use'", "'as'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'-'", "'**'", "'/'", "'%'", "'!'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "'if'", "'else'", "'switch'", "':'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "';'", "'var'", "'val'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'", "'super'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

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
                case RULE_STRING:
                case RULE_ID:
                case RULE_INT:
                case 26:
                case 29:
                case 30:
                case 34:
                case 38:
                case 40:
                case 43:
                case 45:
                case 47:
                case 51:
                case 52:
                case 53:
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
                case 14:
                    {
                    alt1=2;
                    }
                    break;
                case 55:
                case 56:
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:159:1: ruleXScriptExpression returns [EObject current=null] : (this_XImport_0= ruleXImport | this_XPackageUse_1= ruleXPackageUse ) ;
    public final EObject ruleXScriptExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XImport_0 = null;

        EObject this_XPackageUse_1 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:162:28: ( (this_XImport_0= ruleXImport | this_XPackageUse_1= ruleXPackageUse ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:163:1: (this_XImport_0= ruleXImport | this_XPackageUse_1= ruleXPackageUse )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:163:1: (this_XImport_0= ruleXImport | this_XPackageUse_1= ruleXPackageUse )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:174:5: this_XPackageUse_1= ruleXPackageUse
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXScriptExpressionAccess().getXPackageUseParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXPackageUse_in_ruleXScriptExpression317);
                    this_XPackageUse_1=ruleXPackageUse();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XPackageUse_1; 
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


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:190:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:191:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:192:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard353);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildCard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard364); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:199:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:202:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:203:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:203:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:204:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard411);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:214:1: (kw= '.' kw= '*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:215:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,11,FOLLOW_11_in_ruleQualifiedNameWithWildCard430); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleQualifiedNameWithWildCard443); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:234:1: entryRuleXImport returns [EObject current=null] : iv_ruleXImport= ruleXImport EOF ;
    public final EObject entryRuleXImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXImport = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:235:2: (iv_ruleXImport= ruleXImport EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:236:2: iv_ruleXImport= ruleXImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXImportRule()); 
            }
            pushFollow(FOLLOW_ruleXImport_in_entryRuleXImport485);
            iv_ruleXImport=ruleXImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXImport495); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:243:1: ruleXImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleXImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:246:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:247:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:247:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:247:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleXImport532); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXImportAccess().getImportKeyword_0());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:251:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:252:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:252:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:253:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleXImport553);
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


    // $ANTLR start "entryRuleXPackageUse"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:277:1: entryRuleXPackageUse returns [EObject current=null] : iv_ruleXPackageUse= ruleXPackageUse EOF ;
    public final EObject entryRuleXPackageUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPackageUse = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:278:2: (iv_ruleXPackageUse= ruleXPackageUse EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:279:2: iv_ruleXPackageUse= ruleXPackageUse EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPackageUseRule()); 
            }
            pushFollow(FOLLOW_ruleXPackageUse_in_entryRuleXPackageUse589);
            iv_ruleXPackageUse=ruleXPackageUse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPackageUse; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPackageUse599); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXPackageUse"


    // $ANTLR start "ruleXPackageUse"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:286:1: ruleXPackageUse returns [EObject current=null] : (otherlv_0= 'use' ( (lv_nsUri_1_0= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleXPackageUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nsUri_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:289:28: ( (otherlv_0= 'use' ( (lv_nsUri_1_0= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:290:1: (otherlv_0= 'use' ( (lv_nsUri_1_0= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:290:1: (otherlv_0= 'use' ( (lv_nsUri_1_0= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:290:3: otherlv_0= 'use' ( (lv_nsUri_1_0= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleXPackageUse636); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXPackageUseAccess().getUseKeyword_0());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:294:1: ( (lv_nsUri_1_0= RULE_STRING ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:295:1: (lv_nsUri_1_0= RULE_STRING )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:295:1: (lv_nsUri_1_0= RULE_STRING )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:296:3: lv_nsUri_1_0= RULE_STRING
            {
            lv_nsUri_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXPackageUse653); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_nsUri_1_0, grammarAccess.getXPackageUseAccess().getNsUriSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXPackageUseRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"nsUri",
                      		lv_nsUri_1_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:312:2: (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:312:4: otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleXPackageUse671); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXPackageUseAccess().getAsKeyword_2_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:316:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:317:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:317:1: (lv_name_3_0= RULE_ID )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:318:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXPackageUse688); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_3_0, grammarAccess.getXPackageUseAccess().getNameIDTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXPackageUseRule());
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
    // $ANTLR end "ruleXPackageUse"


    // $ANTLR start "entryRuleXExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:342:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:343:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:344:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression731);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression741); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:351:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:354:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:356:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression787);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:372:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:373:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:374:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment821);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment831); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:381:1: ruleXAssignment returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:384:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:385:1: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:385:1: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==16) ) {
                    alt6=1;
                }
                else if ( (LA6_1==EOF||(LA6_1>=RULE_STRING && LA6_1<=RULE_INT)||(LA6_1>=11 && LA6_1<=15)||(LA6_1>=17 && LA6_1<=40)||(LA6_1>=42 && LA6_1<=66)) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==RULE_STRING||LA6_0==RULE_INT||LA6_0==26||(LA6_0>=29 && LA6_0<=30)||LA6_0==34||LA6_0==38||LA6_0==40||LA6_0==43||LA6_0==45||LA6_0==47||(LA6_0>=51 && LA6_0<=53)||(LA6_0>=57 && LA6_0<=63)) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:385:2: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:385:2: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:385:3: () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:385:3: ()
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:386:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:391:2: ( (otherlv_1= RULE_ID ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:392:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:392:1: (otherlv_1= RULE_ID )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:393:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXAssignment886); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment902);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:412:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:413:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:413:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:414:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment922);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:431:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:431:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:432:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment952);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:440:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==17) ) {
                        int LA5_1 = input.LA(2);

                        if ( (synpred1_InternalXscript()) ) {
                            alt5=1;
                        }
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:440:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:440:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:440:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:445:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:445:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:445:7: ()
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:446:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:451:2: ( ( ruleOpMultiAssign ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:452:1: ( ruleOpMultiAssign )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:452:1: ( ruleOpMultiAssign )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:453:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1005);
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

                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:466:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:467:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:467:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:468:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1028);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:492:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:493:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:494:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1068);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1079); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:501:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:504:28: (kw= '=' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:506:2: kw= '='
            {
            kw=(Token)match(input,16,FOLLOW_16_in_ruleOpSingleAssign1116); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:519:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:520:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:521:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1156);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1167); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:528:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:531:28: (kw= '+=' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:533:2: kw= '+='
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleOpMultiAssign1204); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:546:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:547:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:548:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1243);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1253); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:555:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:558:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:559:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:559:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:560:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1300);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:568:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    int LA7_2 = input.LA(2);

                    if ( (synpred2_InternalXscript()) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:568:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:568:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:568:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:573:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:573:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:573:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:574:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:579:2: ( ( ruleOpOr ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:580:1: ( ruleOpOr )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:580:1: ( ruleOpOr )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:581:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1353);
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

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:594:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:595:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:595:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:596:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1376);
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
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:620:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:621:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:622:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1415);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1426); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:629:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:632:28: (kw= '||' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:634:2: kw= '||'
            {
            kw=(Token)match(input,18,FOLLOW_18_in_ruleOpOr1463); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:647:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:648:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:649:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1502);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1512); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:656:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:659:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:660:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:660:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:661:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1559);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:669:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    int LA8_2 = input.LA(2);

                    if ( (synpred3_InternalXscript()) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:669:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:669:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:669:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:674:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:674:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:674:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:675:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:680:2: ( ( ruleOpAnd ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:681:1: ( ruleOpAnd )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:681:1: ( ruleOpAnd )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:682:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1612);
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

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:695:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:696:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:696:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:697:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1635);
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
            	    break loop8;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:721:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:722:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:723:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1674);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1685); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:730:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:733:28: (kw= '&&' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:735:2: kw= '&&'
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleOpAnd1722); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:748:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:749:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:750:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1761);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression1771); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:757:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:760:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:761:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:761:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:762:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1818);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:770:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    int LA9_2 = input.LA(2);

                    if ( (synpred4_InternalXscript()) ) {
                        alt9=1;
                    }


                }
                else if ( (LA9_0==21) ) {
                    int LA9_3 = input.LA(2);

                    if ( (synpred4_InternalXscript()) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:770:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:770:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:770:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:775:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:775:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:775:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:776:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:781:2: ( ( ruleOpEquality ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:782:1: ( ruleOpEquality )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:782:1: ( ruleOpEquality )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:783:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1871);
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

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:796:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:797:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:797:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:798:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1894);
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:822:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:823:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:824:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality1933);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality1944); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:831:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:834:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:835:1: (kw= '==' | kw= '!=' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:835:1: (kw= '==' | kw= '!=' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            else if ( (LA10_0==21) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:836:2: kw= '=='
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleOpEquality1982); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:843:2: kw= '!='
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleOpEquality2001); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:856:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:857:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:858:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2041);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2051); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:865:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:868:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:869:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:869:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:870:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2098);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:878:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop11:
            do {
                int alt11=3;
                switch ( input.LA(1) ) {
                case 26:
                    {
                    int LA11_2 = input.LA(2);

                    if ( (synpred6_InternalXscript()) ) {
                        alt11=2;
                    }


                    }
                    break;
                case 22:
                    {
                    int LA11_3 = input.LA(2);

                    if ( (synpred5_InternalXscript()) ) {
                        alt11=1;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA11_4 = input.LA(2);

                    if ( (synpred6_InternalXscript()) ) {
                        alt11=2;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA11_5 = input.LA(2);

                    if ( (synpred6_InternalXscript()) ) {
                        alt11=2;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA11_6 = input.LA(2);

                    if ( (synpred6_InternalXscript()) ) {
                        alt11=2;
                    }


                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:878:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:878:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:878:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:878:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:878:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:880:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:880:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:880:6: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:881:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleXRelationalExpression2134); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:890:3: ( ( ruleQualifiedName ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:891:1: ( ruleQualifiedName )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:891:1: ( ruleQualifiedName )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:892:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2159);
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
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:906:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:906:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:906:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:906:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:906:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:911:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:911:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:911:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:912:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:917:2: ( ( ruleOpCompare ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:918:1: ( ruleOpCompare )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:918:1: ( ruleOpCompare )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:919:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2220);
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

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:932:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:933:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:933:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:934:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2243);
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:958:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:959:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:960:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2283);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2294); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:967:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:970:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:971:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:971:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt12=1;
                }
                break;
            case 24:
                {
                alt12=2;
                }
                break;
            case 25:
                {
                alt12=3;
                }
                break;
            case 26:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:972:2: kw= '>='
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpCompare2332); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:979:2: kw= '<='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpCompare2351); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:986:2: kw= '>'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpCompare2370); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:993:2: kw= '<'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpCompare2389); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1006:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1007:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1008:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2429);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2439); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1015:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1018:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1019:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1019:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1020:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2486);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1028:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    int LA13_2 = input.LA(2);

                    if ( (synpred7_InternalXscript()) ) {
                        alt13=1;
                    }


                }
                else if ( (LA13_0==28) ) {
                    int LA13_3 = input.LA(2);

                    if ( (synpred7_InternalXscript()) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1028:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1028:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1028:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1033:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1033:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1033:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1034:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1039:2: ( ( ruleOpOther ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1040:1: ( ruleOpOther )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1040:1: ( ruleOpOther )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1041:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2539);
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

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1054:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1055:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1055:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1056:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2562);
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1080:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1081:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1082:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2601);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2612); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1089:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1092:28: ( (kw= '->' | kw= '..' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1093:1: (kw= '->' | kw= '..' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1093:1: (kw= '->' | kw= '..' )
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1094:2: kw= '->'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2650); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1101:2: kw= '..'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2669); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1114:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1115:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1116:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2709);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2719); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1123:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1126:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1127:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1127:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1128:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2766);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1136:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30) ) {
                    int LA15_2 = input.LA(2);

                    if ( (synpred8_InternalXscript()) ) {
                        alt15=1;
                    }


                }
                else if ( (LA15_0==29) ) {
                    int LA15_3 = input.LA(2);

                    if ( (synpred8_InternalXscript()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1136:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1136:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1136:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1141:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1141:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1141:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1142:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1147:2: ( ( ruleOpAdd ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1148:1: ( ruleOpAdd )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1148:1: ( ruleOpAdd )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1149:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2819);
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

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1162:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1163:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1163:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1164:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2842);
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1188:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1189:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1190:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd2881);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd2892); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1197:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1200:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1201:1: (kw= '+' | kw= '-' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1201:1: (kw= '+' | kw= '-' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            else if ( (LA16_0==30) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1202:2: kw= '+'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpAdd2930); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1209:2: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpAdd2949); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1222:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1223:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1224:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2989);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2999); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1231:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1234:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1235:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1235:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1236:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3046);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1244:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop17:
            do {
                int alt17=2;
                switch ( input.LA(1) ) {
                case 12:
                    {
                    int LA17_2 = input.LA(2);

                    if ( (synpred9_InternalXscript()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 31:
                    {
                    int LA17_3 = input.LA(2);

                    if ( (synpred9_InternalXscript()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 32:
                    {
                    int LA17_4 = input.LA(2);

                    if ( (synpred9_InternalXscript()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 33:
                    {
                    int LA17_5 = input.LA(2);

                    if ( (synpred9_InternalXscript()) ) {
                        alt17=1;
                    }


                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1244:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1244:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1244:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1249:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1249:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1249:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1250:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1255:2: ( ( ruleOpMulti ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1256:1: ( ruleOpMulti )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1256:1: ( ruleOpMulti )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1257:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3099);
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

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1270:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1271:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1271:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1272:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3122);
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
            	    break loop17;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1296:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1297:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1298:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3161);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3172); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1305:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1308:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1309:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1309:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt18=1;
                }
                break;
            case 31:
                {
                alt18=2;
                }
                break;
            case 32:
                {
                alt18=3;
                }
                break;
            case 33:
                {
                alt18=4;
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1310:2: kw= '*'
                    {
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleOpMulti3210); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1317:2: kw= '**'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpMulti3229); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1324:2: kw= '/'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpMulti3248); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1331:2: kw= '%'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpMulti3267); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1344:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1345:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1346:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3307);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3317); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1353:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1356:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1357:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1357:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=29 && LA19_0<=30)||LA19_0==34) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_INT)||LA19_0==26||LA19_0==38||LA19_0==40||LA19_0==43||LA19_0==45||LA19_0==47||(LA19_0>=51 && LA19_0<=53)||(LA19_0>=57 && LA19_0<=63)) ) {
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1357:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1357:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1357:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1357:3: ()
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1358:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1363:2: ( ( ruleOpUnary ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1364:1: ( ruleOpUnary )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1364:1: ( ruleOpUnary )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1365:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3375);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1378:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1379:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1379:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1380:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3396);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1398:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3425);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1414:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1415:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1416:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3461);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3472); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1423:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1426:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1427:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1427:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt20=1;
                }
                break;
            case 30:
                {
                alt20=2;
                }
                break;
            case 29:
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1428:2: kw= '!'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpUnary3510); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1435:2: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpUnary3529); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1442:2: kw= '+'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpUnary3548); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1455:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1456:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1457:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3588);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3598); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1464:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1467:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1468:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1468:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1469:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3645);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1477:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==15) ) {
                    int LA21_2 = input.LA(2);

                    if ( (synpred10_InternalXscript()) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1477:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1477:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1477:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1479:5: ( () otherlv_2= 'as' )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1479:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1479:6: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1480:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleXCastedExpression3680); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1489:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1490:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1490:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1491:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3703);
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
            	    break loop21;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1515:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1516:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1517:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3741);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3751); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1524:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( ruleXShortClosure ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1527:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( ruleXShortClosure ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1528:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( ruleXShortClosure ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1528:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( ruleXShortClosure ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1529:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( ruleXShortClosure ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3798);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1537:1: ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( ruleXShortClosure ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            loop28:
            do {
                int alt28=3;
                switch ( input.LA(1) ) {
                case 11:
                    {
                    int LA28_2 = input.LA(2);

                    if ( (synpred11_InternalXscript()) ) {
                        alt28=1;
                    }
                    else if ( (synpred12_InternalXscript()) ) {
                        alt28=2;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA28_3 = input.LA(2);

                    if ( (synpred12_InternalXscript()) ) {
                        alt28=2;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA28_4 = input.LA(2);

                    if ( (synpred12_InternalXscript()) ) {
                        alt28=2;
                    }


                    }
                    break;

                }

                switch (alt28) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1537:2: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1537:2: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1537:3: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1537:3: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1537:4: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1544:25: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1544:26: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1544:26: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1545:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleXMemberFeatureCall3847); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1554:1: ( (otherlv_3= RULE_ID ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1555:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1555:1: (otherlv_3= RULE_ID )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1556:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXMemberFeatureCall3867); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3883);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1575:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1576:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1576:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1577:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3905);
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
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1594:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( ruleXShortClosure ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1594:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( ruleXShortClosure ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1594:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( ruleXShortClosure ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1594:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1594:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1610:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1610:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1610:8: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1611:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1616:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt22=3;
            	    switch ( input.LA(1) ) {
            	    case 11:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt22=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt22) {
            	        case 1 :
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1616:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,11,FOLLOW_11_in_ruleXMemberFeatureCall3991); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1621:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1621:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1622:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1622:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1623:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,35,FOLLOW_35_in_ruleXMemberFeatureCall4015); if (state.failed) return current;
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
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1637:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1637:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1638:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1638:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1639:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,36,FOLLOW_36_in_ruleXMemberFeatureCall4052); if (state.failed) return current;
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

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1652:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==26) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1652:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,26,FOLLOW_26_in_ruleXMemberFeatureCall4081); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1656:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1657:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1657:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1658:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4102);
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

            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1674:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop23:
            	            do {
            	                int alt23=2;
            	                int LA23_0 = input.LA(1);

            	                if ( (LA23_0==37) ) {
            	                    alt23=1;
            	                }


            	                switch (alt23) {
            	            	case 1 :
            	            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1674:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,37,FOLLOW_37_in_ruleXMemberFeatureCall4115); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1678:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1679:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1679:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1680:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4136);
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
            	            	    break loop23;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,25,FOLLOW_25_in_ruleXMemberFeatureCall4150); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1700:3: ( (otherlv_15= RULE_ID ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1701:1: (otherlv_15= RULE_ID )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1701:1: (otherlv_15= RULE_ID )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1702:3: otherlv_15= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXMemberFeatureCall4172); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_15, grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1713:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( ruleXShortClosure ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt27=2;
            	    alt27 = dfa27.predict(input);
            	    switch (alt27) {
            	        case 1 :
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1713:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( ruleXShortClosure ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1713:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1713:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1720:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1721:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,38,FOLLOW_38_in_ruleXMemberFeatureCall4206); if (state.failed) return current;
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

            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1734:2: ( ( ( ( ruleXShortClosure ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt26=3;
            	            alt26 = dfa26.predict(input);
            	            switch (alt26) {
            	                case 1 :
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1734:3: ( ( ( ruleXShortClosure ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1734:3: ( ( ( ruleXShortClosure ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1734:4: ( ( ruleXShortClosure ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1739:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1740:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4251);
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
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1757:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1757:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1757:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1757:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1758:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1758:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1759:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4279);
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

            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1775:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop25:
            	                    do {
            	                        int alt25=2;
            	                        int LA25_0 = input.LA(1);

            	                        if ( (LA25_0==37) ) {
            	                            alt25=1;
            	                        }


            	                        switch (alt25) {
            	                    	case 1 :
            	                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1775:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,37,FOLLOW_37_in_ruleXMemberFeatureCall4292); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1779:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1780:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1780:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1781:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4313);
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
            	                    	    break loop25;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,39,FOLLOW_39_in_ruleXMemberFeatureCall4330); if (state.failed) return current;
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
            	    break loop28;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1809:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1810:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1811:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4371);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4381); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1818:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XTryCatchFinallyExpression_10= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_11= ruleXParenthesizedExpression ) ;
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

        EObject this_XTryCatchFinallyExpression_10 = null;

        EObject this_XParenthesizedExpression_11 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1821:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XTryCatchFinallyExpression_10= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_11= ruleXParenthesizedExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1822:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XTryCatchFinallyExpression_10= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_11= ruleXParenthesizedExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1822:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XTryCatchFinallyExpression_10= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_11= ruleXParenthesizedExpression )
            int alt29=12;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt29=1;
                }
                break;
            case 47:
                {
                alt29=2;
                }
                break;
            case 45:
                {
                alt29=3;
                }
                break;
            case RULE_ID:
            case 26:
                {
                alt29=4;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case 40:
            case 58:
            case 59:
            case 60:
            case 61:
                {
                alt29=5;
                }
                break;
            case 43:
                {
                alt29=6;
                }
                break;
            case 51:
                {
                alt29=7;
                }
                break;
            case 52:
                {
                alt29=8;
                }
                break;
            case 53:
                {
                alt29=9;
                }
                break;
            case 62:
                {
                alt29=10;
                }
                break;
            case 63:
                {
                alt29=11;
                }
                break;
            case 38:
                {
                alt29=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1823:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4428);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1833:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4455);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1843:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4482);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1853:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4509);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1863:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4536);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1873:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4563);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1883:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4590);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1893:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4617);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1903:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4644);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1913:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4671);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1923:5: this_XTryCatchFinallyExpression_10= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4698);
                    this_XTryCatchFinallyExpression_10=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1933:5: this_XParenthesizedExpression_11= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4725);
                    this_XParenthesizedExpression_11=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_11; 
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1949:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1950:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1951:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral4760);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral4770); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1958:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1961:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1962:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1962:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt30=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt30=1;
                }
                break;
            case 58:
            case 59:
                {
                alt30=2;
                }
                break;
            case RULE_INT:
                {
                alt30=3;
                }
                break;
            case 60:
                {
                alt30=4;
                }
                break;
            case RULE_STRING:
                {
                alt30=5;
                }
                break;
            case 61:
                {
                alt30=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1963:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral4817);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1973:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4844);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1983:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral4871);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1993:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral4898);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2003:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral4925);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2013:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral4952);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2029:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2030:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2031:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure4987);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure4997); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2038:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2041:28: ( ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2042:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2042:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2042:2: () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2042:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2043:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleXClosure5043); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2052:1: ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID||LA32_0==38||LA32_0==66) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2052:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2052:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2053:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2053:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2054:3: lv_formalParameters_2_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5065);
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

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2070:2: (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==37) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2070:4: otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleXClosure5078); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2074:1: ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2075:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2075:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2076:3: lv_formalParameters_4_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5099);
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
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleXClosure5115); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXClosureAccess().getVerticalLineKeyword_3());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2096:1: ( (lv_expression_6_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2097:1: (lv_expression_6_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2097:1: (lv_expression_6_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2098:3: lv_expression_6_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXClosure5136);
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

            otherlv_7=(Token)match(input,42,FOLLOW_42_in_ruleXClosure5148); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2126:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2127:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2128:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5184);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5194); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2135:1: ruleXShortClosure returns [EObject current=null] : ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalParameters_1_0 = null;

        EObject lv_formalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2138:28: ( ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2139:1: ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2139:1: ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2139:2: () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2139:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2140:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2145:2: ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID||LA34_0==38||LA34_0==66) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2145:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2145:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2146:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2146:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2147:3: lv_formalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5250);
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

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2163:2: (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==37) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2163:4: otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleXShortClosure5263); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2167:1: ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2168:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2168:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2169:3: lv_formalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5284);
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
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXShortClosure5300); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXShortClosureAccess().getVerticalLineKeyword_2());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2189:1: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2190:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2190:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2191:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5321);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2215:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2216:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2217:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5357);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5367); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2224:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2227:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2228:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2228:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2228:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleXParenthesizedExpression5404); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5426);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleXParenthesizedExpression5437); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2253:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2254:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2255:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5473);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5483); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2262:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2265:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2266:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2266:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2266:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2266:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2267:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleXIfExpression5529); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleXIfExpression5541); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2280:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2281:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2281:1: (lv_if_3_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2282:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5562);
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

            otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleXIfExpression5574); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2302:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2303:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2303:1: (lv_then_5_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2304:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5595);
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

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2320:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==44) ) {
                int LA35_1 = input.LA(2);

                if ( (synpred15_InternalXscript()) ) {
                    alt35=1;
                }
            }
            switch (alt35) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2320:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2320:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2320:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,44,FOLLOW_44_in_ruleXIfExpression5616); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2325:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2326:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2326:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2327:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5638);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2351:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2352:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2353:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5676);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression5686); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2360:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2363:28: ( ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2364:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2364:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2364:2: () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2364:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2365:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleXSwitchExpression5732); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2374:1: ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==46) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2374:2: ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':'
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2374:2: ( (lv_localVarName_2_0= RULE_ID ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2375:1: (lv_localVarName_2_0= RULE_ID )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2375:1: (lv_localVarName_2_0= RULE_ID )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2376:3: lv_localVarName_2_0= RULE_ID
                    {
                    lv_localVarName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXSwitchExpression5750); if (state.failed) return current;
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

                    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleXSwitchExpression5767); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2396:3: ( (lv_switch_4_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2397:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2397:1: (lv_switch_4_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2398:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression5790);
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

            otherlv_5=(Token)match(input,47,FOLLOW_47_in_ruleXSwitchExpression5802); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2418:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID||LA37_0==38||LA37_0==46||LA37_0==50||LA37_0==66) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2419:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2419:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2420:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression5823);
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
            	    if ( cnt37 >= 1 ) break loop37;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2436:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==48) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2436:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,48,FOLLOW_48_in_ruleXSwitchExpression5837); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,46,FOLLOW_46_in_ruleXSwitchExpression5849); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2444:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2445:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2445:1: (lv_default_9_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2446:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression5870);
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

            otherlv_10=(Token)match(input,49,FOLLOW_49_in_ruleXSwitchExpression5884); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2474:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2475:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2476:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart5920);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart5930); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2483:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2486:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2487:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2487:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2487:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2487:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID||LA39_0==38||LA39_0==66) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2488:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2488:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2489:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart5976);
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

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2505:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==50) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2505:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleXCasePart5990); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2509:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2510:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2510:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2511:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6011);
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

            otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleXCasePart6025); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2531:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2532:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2532:1: (lv_then_4_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2533:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6046);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2557:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2558:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2559:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6082);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6092); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2566:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2569:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2570:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2570:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2570:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2570:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2571:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleXForLoopExpression6138); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleXForLoopExpression6150); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2584:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2585:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2585:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2586:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6171);
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

            otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleXForLoopExpression6183); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2606:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2607:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2607:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2608:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6204);
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

            otherlv_6=(Token)match(input,39,FOLLOW_39_in_ruleXForLoopExpression6216); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2628:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2629:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2629:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2630:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6237);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2654:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2655:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2656:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6273);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6283); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2663:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2666:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2667:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2667:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2667:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2667:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2668:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXWhileExpression6329); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleXWhileExpression6341); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2681:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2682:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2682:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2683:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6362);
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

            otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleXWhileExpression6374); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2703:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2704:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2704:1: (lv_body_5_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2705:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6395);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2729:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2730:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2731:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6431);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression6441); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2738:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2741:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2742:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2742:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2742:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2742:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2743:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXDoWhileExpression6487); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2752:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2753:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2753:1: (lv_body_2_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2754:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6508);
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

            otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleXDoWhileExpression6520); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleXDoWhileExpression6532); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2778:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2779:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2779:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2780:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6553);
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

            otherlv_6=(Token)match(input,39,FOLLOW_39_in_ruleXDoWhileExpression6565); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2808:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2809:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2810:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6601);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression6611); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2817:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2820:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2821:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2821:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2821:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2821:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2822:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleXBlockExpression6657); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2831:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_STRING && LA42_0<=RULE_INT)||LA42_0==26||(LA42_0>=29 && LA42_0<=30)||LA42_0==34||LA42_0==38||LA42_0==40||LA42_0==43||LA42_0==45||LA42_0==47||(LA42_0>=51 && LA42_0<=53)||(LA42_0>=55 && LA42_0<=63)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2831:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2831:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2832:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2832:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2833:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression6679);
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

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2849:2: (otherlv_3= ';' )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==54) ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2849:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleXBlockExpression6692); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleXBlockExpression6708); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2865:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2866:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2867:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock6744);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock6754); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2874:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2877:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2878:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2878:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=55 && LA43_0<=56)) ) {
                alt43=1;
            }
            else if ( ((LA43_0>=RULE_STRING && LA43_0<=RULE_INT)||LA43_0==26||(LA43_0>=29 && LA43_0<=30)||LA43_0==34||LA43_0==38||LA43_0==40||LA43_0==43||LA43_0==45||LA43_0==47||(LA43_0>=51 && LA43_0<=53)||(LA43_0>=57 && LA43_0<=63)) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2879:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock6801);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2889:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock6828);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2905:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2906:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2907:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration6863);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration6873); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2914:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2917:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2918:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2918:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2918:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2918:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2919:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2924:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==55) ) {
                alt44=1;
            }
            else if ( (LA44_0==56) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2924:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2924:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2925:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2925:1: (lv_writeable_1_0= 'var' )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2926:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,55,FOLLOW_55_in_ruleXVariableDeclaration6926); if (state.failed) return current;
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2940:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleXVariableDeclaration6957); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2944:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                int LA45_1 = input.LA(2);

                if ( (synpred16_InternalXscript()) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA45_0==38) && (synpred16_InternalXscript())) {
                alt45=1;
            }
            else if ( (LA45_0==66) && (synpred16_InternalXscript())) {
                alt45=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2944:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2944:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2944:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2953:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2953:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2953:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2954:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2954:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2955:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7006);
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

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2971:2: ( (lv_name_4_0= RULE_ID ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2972:1: (lv_name_4_0= RULE_ID )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2972:1: (lv_name_4_0= RULE_ID )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2973:3: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXVariableDeclaration7023); if (state.failed) return current;
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2990:6: ( (lv_name_5_0= RULE_ID ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2990:6: ( (lv_name_5_0= RULE_ID ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2991:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2991:1: (lv_name_5_0= RULE_ID )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2992:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXVariableDeclaration7053); if (state.failed) return current;
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

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3008:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==16) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3008:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleXVariableDeclaration7072); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3012:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3013:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3013:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3014:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7093);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3038:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3039:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3040:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7131);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7141); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3047:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_parameterType_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3050:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3051:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3051:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3051:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3051:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==RULE_ID||LA47_1==11||LA47_1==26) ) {
                    alt47=1;
                }
            }
            else if ( (LA47_0==38||LA47_0==66) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3052:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3052:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3053:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7187);
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

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3069:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3070:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3070:1: (lv_name_1_0= RULE_ID )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3071:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJvmFormalParameter7205); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3095:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3096:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3097:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7246);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7256); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3104:1: ruleXFeatureCall returns [EObject current=null] : ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( ruleXShortClosure ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3107:28: ( ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( ruleXShortClosure ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3108:1: ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( ruleXShortClosure ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3108:1: ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( ruleXShortClosure ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3108:2: () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( ruleXShortClosure ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )?
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3108:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3109:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3114:2: (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==26) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3114:4: otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleXFeatureCall7303); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_1_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3118:1: ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3119:1: (lv_typeArguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3119:1: (lv_typeArguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3120:3: lv_typeArguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7324);
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

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3136:2: (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==37) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3136:4: otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleXFeatureCall7337); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXFeatureCallAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3140:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3141:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3141:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3142:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7358);
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
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleXFeatureCall7372); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3162:3: ( (otherlv_6= RULE_ID ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3163:1: (otherlv_6= RULE_ID )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3163:1: (otherlv_6= RULE_ID )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3164:3: otherlv_6= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXFeatureCall7394); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_2_0()); 
              	
            }

            }


            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3175:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( ruleXShortClosure ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )?
            int alt52=2;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3175:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( ruleXShortClosure ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')'
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3175:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3175:4: ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3182:1: (lv_explicitOperationCall_7_0= '(' )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3183:3: lv_explicitOperationCall_7_0= '('
                    {
                    lv_explicitOperationCall_7_0=(Token)match(input,38,FOLLOW_38_in_ruleXFeatureCall7428); if (state.failed) return current;
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

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3196:2: ( ( ( ( ruleXShortClosure ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )?
                    int alt51=3;
                    alt51 = dfa51.predict(input);
                    switch (alt51) {
                        case 1 :
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3196:3: ( ( ( ruleXShortClosure ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3196:3: ( ( ( ruleXShortClosure ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3196:4: ( ( ruleXShortClosure ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3201:1: (lv_featureCallArguments_8_0= ruleXShortClosure )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3202:3: lv_featureCallArguments_8_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_3_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7473);
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
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3219:6: ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3219:6: ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3219:7: ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )*
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3219:7: ( (lv_featureCallArguments_9_0= ruleXExpression ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3220:1: (lv_featureCallArguments_9_0= ruleXExpression )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3220:1: (lv_featureCallArguments_9_0= ruleXExpression )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3221:3: lv_featureCallArguments_9_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_3_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7501);
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

                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3237:2: (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )*
                            loop50:
                            do {
                                int alt50=2;
                                int LA50_0 = input.LA(1);

                                if ( (LA50_0==37) ) {
                                    alt50=1;
                                }


                                switch (alt50) {
                            	case 1 :
                            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3237:4: otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) )
                            	    {
                            	    otherlv_10=(Token)match(input,37,FOLLOW_37_in_ruleXFeatureCall7514); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_10, grammarAccess.getXFeatureCallAccess().getCommaKeyword_3_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3241:1: ( (lv_featureCallArguments_11_0= ruleXExpression ) )
                            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3242:1: (lv_featureCallArguments_11_0= ruleXExpression )
                            	    {
                            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3242:1: (lv_featureCallArguments_11_0= ruleXExpression )
                            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3243:3: lv_featureCallArguments_11_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_3_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7535);
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
                            	    break loop50;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,39,FOLLOW_39_in_ruleXFeatureCall7552); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3271:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3272:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3273:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall7590);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall7600); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3280:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( ruleXShortClosure ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3283:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( ruleXShortClosure ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3284:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( ruleXShortClosure ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3284:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( ruleXShortClosure ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3284:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( ruleXShortClosure ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3284:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3285:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXConstructorCall7646); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3294:1: ( ( ruleQualifiedName ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3295:1: ( ruleQualifiedName )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3295:1: ( ruleQualifiedName )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3296:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall7669);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3309:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==26) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3309:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleXConstructorCall7682); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3313:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3314:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3314:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3315:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall7703);
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

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3331:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==37) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3331:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleXConstructorCall7716); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3335:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3336:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3336:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3337:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall7737);
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
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleXConstructorCall7751); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,38,FOLLOW_38_in_ruleXConstructorCall7765); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3361:1: ( ( ( ( ruleXShortClosure ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt56=3;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3361:2: ( ( ( ruleXShortClosure ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3361:2: ( ( ( ruleXShortClosure ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3361:3: ( ( ruleXShortClosure ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3366:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3367:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall7797);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3384:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3384:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3384:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3384:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3385:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3385:1: (lv_arguments_10_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3386:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall7825);
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

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3402:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==37) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3402:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,37,FOLLOW_37_in_ruleXConstructorCall7838); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3406:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3407:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3407:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3408:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall7859);
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
                    	    break loop55;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,39,FOLLOW_39_in_ruleXConstructorCall7876); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3436:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3437:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3438:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral7912);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral7922); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3445:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3448:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3449:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3449:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3449:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3449:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3450:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3455:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==58) ) {
                alt57=1;
            }
            else if ( (LA57_0==59) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3455:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXBooleanLiteral7969); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3460:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3460:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3461:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3461:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3462:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,59,FOLLOW_59_in_ruleXBooleanLiteral7993); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3483:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3484:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3485:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8043);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral8053); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3492:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3495:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3496:1: ( () otherlv_1= 'null' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3496:1: ( () otherlv_1= 'null' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3496:2: () otherlv_1= 'null'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3496:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3497:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXNullLiteral8099); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3514:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3515:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3516:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral8135);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral8145); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3523:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3526:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3527:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3527:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3527:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3527:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3528:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3533:2: ( (lv_value_1_0= RULE_INT ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3534:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3534:1: (lv_value_1_0= RULE_INT )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3535:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral8196); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3559:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3560:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3561:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral8237);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral8247); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3568:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3571:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3572:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3572:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3572:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3572:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3573:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3578:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3579:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3579:1: (lv_value_1_0= RULE_STRING )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3580:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral8298); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3604:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3605:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3606:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral8339);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral8349); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3613:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3616:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3617:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3617:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3617:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3617:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3618:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXTypeLiteral8395); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleXTypeLiteral8407); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3631:1: ( ( ruleQualifiedName ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3632:1: ( ruleQualifiedName )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3632:1: ( ruleQualifiedName )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3633:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral8430);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleXTypeLiteral8442); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3658:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3659:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3660:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression8478);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression8488); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3667:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3670:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3671:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3671:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3671:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3671:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3672:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXThrowExpression8534); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3681:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3682:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3682:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3683:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression8555);
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


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3707:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3708:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3709:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression8591);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression8601); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3716:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( ( ruleXCatchClause ) )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3719:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( ( ruleXCatchClause ) )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3720:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( ( ruleXCatchClause ) )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3720:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( ( ruleXCatchClause ) )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3720:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( ( ruleXCatchClause ) )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3720:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3721:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXTryCatchFinallyExpression8647); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3730:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3731:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3731:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3732:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression8668);
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

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3748:2: ( ( ( ( ( ruleXCatchClause ) )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==65) ) {
                alt60=1;
            }
            else if ( (LA60_0==64) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3748:3: ( ( ( ( ruleXCatchClause ) )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3748:3: ( ( ( ( ruleXCatchClause ) )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3748:4: ( ( ( ruleXCatchClause ) )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3748:4: ( ( ( ruleXCatchClause ) )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt58=0;
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==65) ) {
                            int LA58_2 = input.LA(2);

                            if ( (synpred20_InternalXscript()) ) {
                                alt58=1;
                            }


                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3748:5: ( ( ruleXCatchClause ) )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3753:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3754:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression8701);
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
                    	    if ( cnt58 >= 1 ) break loop58;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(58, input);
                                throw eee;
                        }
                        cnt58++;
                    } while (true);

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3770:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==64) ) {
                        int LA59_1 = input.LA(2);

                        if ( (synpred21_InternalXscript()) ) {
                            alt59=1;
                        }
                    }
                    switch (alt59) {
                        case 1 :
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3770:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3770:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3770:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,64,FOLLOW_64_in_ruleXTryCatchFinallyExpression8723); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3775:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3776:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3776:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3777:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression8745);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3794:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3794:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3794:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,64,FOLLOW_64_in_ruleXTryCatchFinallyExpression8767); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3798:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3799:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3799:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3800:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression8788);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3824:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3825:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3826:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause8826);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause8836); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3833:1: ruleXCatchClause returns [EObject current=null] : (otherlv_0= 'catch' otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3836:28: ( (otherlv_0= 'catch' otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3837:1: (otherlv_0= 'catch' otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3837:1: (otherlv_0= 'catch' otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3837:3: otherlv_0= 'catch' otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_65_in_ruleXCatchClause8873); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleXCatchClause8885); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3845:1: ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3846:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3846:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3847:3: lv_declaredParam_2_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause8906);
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

            otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleXCatchClause8918); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3867:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3868:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3868:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3869:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause8939);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3893:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3894:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3895:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName8976);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName8987); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3902:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3905:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3906:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3906:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3906:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName9027); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3913:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==11) ) {
                    int LA61_1 = input.LA(2);

                    if ( (LA61_1==RULE_ID) ) {
                        int LA61_3 = input.LA(3);

                        if ( (synpred22_InternalXscript()) ) {
                            alt61=1;
                        }


                    }


                }


                switch (alt61) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3913:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3913:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3913:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,11,FOLLOW_11_in_ruleQualifiedName9055); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName9071); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop61;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3936:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3937:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3938:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference9118);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference9128); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3945:1: ruleJvmTypeReference returns [EObject current=null] : (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_1 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3948:28: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3949:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3949:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                alt62=1;
            }
            else if ( (LA62_0==38||LA62_0==66) ) {
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3950:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference9175);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3960:5: this_XFunctionTypeRef_1= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference9202);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3976:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3977:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3978:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef9237);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef9247); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3985:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3988:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3989:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3989:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3989:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3989:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==38) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3989:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleXFunctionTypeRef9285); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3993:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3994:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3994:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3995:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9306);
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

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4011:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==37) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4011:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleXFunctionTypeRef9319); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4015:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4016:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4016:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4017:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9340);
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
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleXFunctionTypeRef9354); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,66,FOLLOW_66_in_ruleXFunctionTypeRef9368); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4041:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4042:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4042:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4043:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9389);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4067:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4068:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4069:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference9425);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference9435); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4076:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4079:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4080:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4080:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4080:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4080:2: ( ( ruleQualifiedName ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4081:1: ( ruleQualifiedName )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4081:1: ( ruleQualifiedName )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4082:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference9483);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4095:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4095:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4095:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4095:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleJvmParameterizedTypeReference9504); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4100:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4101:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4101:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4102:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference9526);
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

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4118:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==37) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4118:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleJvmParameterizedTypeReference9539); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4122:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4123:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4123:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4124:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference9560);
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
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleJvmParameterizedTypeReference9574); if (state.failed) return current;
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4152:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4153:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4154:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference9612);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference9622); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4161:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4164:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4165:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4165:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID||LA67_0==38||LA67_0==66) ) {
                alt67=1;
            }
            else if ( (LA67_0==67) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4166:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference9669);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4176:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference9696);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4192:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4193:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4194:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference9731);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference9741); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4201:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4204:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4205:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4205:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4205:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4205:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4206:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleJvmWildcardTypeReference9787); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4215:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt68=3;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==68) ) {
                alt68=1;
            }
            else if ( (LA68_0==70) ) {
                alt68=2;
            }
            switch (alt68) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4215:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4215:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4216:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4216:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4217:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference9809);
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
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4234:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4234:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4235:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4235:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4236:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference9836);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4260:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4261:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4262:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound9874);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound9884); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4269:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4272:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4273:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4273:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4273:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleJvmUpperBound9921); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4277:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4278:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4278:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4279:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound9942);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4303:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4304:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4305:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded9978);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded9988); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4312:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4315:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4316:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4316:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4316:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_ruleJvmUpperBoundAnded10025); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4320:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4321:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4321:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4322:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded10046);
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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4346:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4347:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4348:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound10082);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound10092); if (state.failed) return current;

            }

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
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4355:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4358:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4359:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4359:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4359:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleJvmLowerBound10129); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4363:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4364:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4364:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4365:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound10150);
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
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:440:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:440:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:440:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:440:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:440:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:441:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:441:2: ( ( ruleOpMultiAssign ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:442:1: ( ruleOpMultiAssign )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:442:1: ( ruleOpMultiAssign )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:443:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalXscript973);
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
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:568:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:568:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:568:4: ( () ( ( ruleOpOr ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:568:5: () ( ( ruleOpOr ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:568:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:569:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:569:2: ( ( ruleOpOr ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:570:1: ( ruleOpOr )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:570:1: ( ruleOpOr )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:571:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalXscript1321);
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
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:669:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:669:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:669:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:669:5: () ( ( ruleOpAnd ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:669:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:670:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:670:2: ( ( ruleOpAnd ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:671:1: ( ruleOpAnd )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:671:1: ( ruleOpAnd )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:672:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalXscript1580);
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
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:770:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:770:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:770:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:770:5: () ( ( ruleOpEquality ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:770:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:771:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:771:2: ( ( ruleOpEquality ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:772:1: ( ruleOpEquality )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:772:1: ( ruleOpEquality )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:773:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalXscript1839);
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
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:878:4: ( ( () 'instanceof' ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:878:5: ( () 'instanceof' )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:878:5: ( () 'instanceof' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:878:6: () 'instanceof'
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:878:6: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:879:1: 
        {
        }

        match(input,22,FOLLOW_22_in_synpred5_InternalXscript2115); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalXscript

    // $ANTLR start synpred6_InternalXscript
    public final void synpred6_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:906:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:906:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:906:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:906:10: () ( ( ruleOpCompare ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:906:10: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:907:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:907:2: ( ( ruleOpCompare ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:908:1: ( ruleOpCompare )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:908:1: ( ruleOpCompare )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:909:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalXscript2188);
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
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1028:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1028:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1028:4: ( () ( ( ruleOpOther ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1028:5: () ( ( ruleOpOther ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1028:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1029:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1029:2: ( ( ruleOpOther ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1030:1: ( ruleOpOther )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1030:1: ( ruleOpOther )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1031:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalXscript2507);
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
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1136:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1136:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1136:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1136:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1136:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1137:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1137:2: ( ( ruleOpAdd ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1138:1: ( ruleOpAdd )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1138:1: ( ruleOpAdd )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1139:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalXscript2787);
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
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1244:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1244:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1244:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1244:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1244:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1245:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1245:2: ( ( ruleOpMulti ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1246:1: ( ruleOpMulti )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1246:1: ( ruleOpMulti )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1247:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalXscript3067);
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
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1477:3: ( ( () 'as' ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1477:4: ( () 'as' )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1477:4: ( () 'as' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1477:5: () 'as'
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1477:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1478:1: 
        {
        }

        match(input,15,FOLLOW_15_in_synpred10_InternalXscript3661); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalXscript

    // $ANTLR start synpred11_InternalXscript
    public final void synpred11_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1537:4: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1537:5: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1537:5: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1537:6: () '.' ( ( RULE_ID ) ) ruleOpSingleAssign
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1537:6: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1538:1: 
        {
        }

        match(input,11,FOLLOW_11_in_synpred11_InternalXscript3815); if (state.failed) return ;
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1539:1: ( ( RULE_ID ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1540:1: ( RULE_ID )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1540:1: ( RULE_ID )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1541:2: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred11_InternalXscript3823); if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalXscript3830);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalXscript

    // $ANTLR start synpred12_InternalXscript
    public final void synpred12_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1594:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1594:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1594:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1594:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1594:10: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1595:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1595:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt69=3;
        switch ( input.LA(1) ) {
        case 11:
            {
            alt69=1;
            }
            break;
        case 35:
            {
            alt69=2;
            }
            break;
        case 36:
            {
            alt69=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 69, 0, input);

            throw nvae;
        }

        switch (alt69) {
            case 1 :
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1595:4: '.'
                {
                match(input,11,FOLLOW_11_in_synpred12_InternalXscript3930); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1597:6: ( ( '?.' ) )
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1597:6: ( ( '?.' ) )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1598:1: ( '?.' )
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1598:1: ( '?.' )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1599:2: '?.'
                {
                match(input,35,FOLLOW_35_in_synpred12_InternalXscript3944); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1604:6: ( ( '*.' ) )
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1604:6: ( ( '*.' ) )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1605:1: ( '*.' )
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1605:1: ( '*.' )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1606:2: '*.'
                {
                match(input,36,FOLLOW_36_in_synpred12_InternalXscript3964); if (state.failed) return ;

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
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1713:4: ( ( '(' ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1714:1: ( '(' )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1714:1: ( '(' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1715:2: '('
        {
        match(input,38,FOLLOW_38_in_synpred13_InternalXscript4188); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalXscript

    // $ANTLR start synpred14_InternalXscript
    public final void synpred14_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1734:4: ( ( ruleXShortClosure ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1735:1: ( ruleXShortClosure )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1735:1: ( ruleXShortClosure )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1736:1: ruleXShortClosure
        {
        pushFollow(FOLLOW_ruleXShortClosure_in_synpred14_InternalXscript4234);
        ruleXShortClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalXscript

    // $ANTLR start synpred15_InternalXscript
    public final void synpred15_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2320:4: ( 'else' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2320:6: 'else'
        {
        match(input,44,FOLLOW_44_in_synpred15_InternalXscript5608); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalXscript

    // $ANTLR start synpred16_InternalXscript
    public final void synpred16_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2944:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2944:5: ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2944:5: ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2944:6: ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2944:6: ( ( ruleJvmTypeReference ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2945:1: ( ruleJvmTypeReference )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2945:1: ( ruleJvmTypeReference )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2946:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred16_InternalXscript6975);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2948:2: ( ( RULE_ID ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2949:1: ( RULE_ID )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2949:1: ( RULE_ID )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2950:1: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred16_InternalXscript6984); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalXscript

    // $ANTLR start synpred17_InternalXscript
    public final void synpred17_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3175:4: ( ( '(' ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3176:1: ( '(' )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3176:1: ( '(' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3177:2: '('
        {
        match(input,38,FOLLOW_38_in_synpred17_InternalXscript7410); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalXscript

    // $ANTLR start synpred18_InternalXscript
    public final void synpred18_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3196:4: ( ( ruleXShortClosure ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3197:1: ( ruleXShortClosure )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3197:1: ( ruleXShortClosure )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3198:1: ruleXShortClosure
        {
        pushFollow(FOLLOW_ruleXShortClosure_in_synpred18_InternalXscript7456);
        ruleXShortClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalXscript

    // $ANTLR start synpred19_InternalXscript
    public final void synpred19_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3361:3: ( ( ruleXShortClosure ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3362:1: ( ruleXShortClosure )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3362:1: ( ruleXShortClosure )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3363:1: ruleXShortClosure
        {
        pushFollow(FOLLOW_ruleXShortClosure_in_synpred19_InternalXscript7780);
        ruleXShortClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalXscript

    // $ANTLR start synpred20_InternalXscript
    public final void synpred20_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3748:5: ( ( ruleXCatchClause ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3749:1: ( ruleXCatchClause )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3749:1: ( ruleXCatchClause )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3750:1: ruleXCatchClause
        {
        pushFollow(FOLLOW_ruleXCatchClause_in_synpred20_InternalXscript8684);
        ruleXCatchClause();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalXscript

    // $ANTLR start synpred21_InternalXscript
    public final void synpred21_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3770:5: ( 'finally' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3770:7: 'finally'
        {
        match(input,64,FOLLOW_64_in_synpred21_InternalXscript8715); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_InternalXscript

    // $ANTLR start synpred22_InternalXscript
    public final void synpred22_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3913:3: ( '.' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3914:2: '.'
        {
        match(input,11,FOLLOW_11_in_synpred22_InternalXscript9046); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalXscript

    // $ANTLR start synpred23_InternalXscript
    public final void synpred23_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4095:4: ( '<' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4095:6: '<'
        {
        match(input,26,FOLLOW_26_in_synpred23_InternalXscript9496); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalXscript

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
    public final boolean synpred15_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalXscript_fragment(); // can never throw exception
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


    protected DFA27 dfa27 = new DFA27(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA66 dfa66 = new DFA66(this);
    static final String DFA27_eotS =
        "\74\uffff";
    static final String DFA27_eofS =
        "\1\2\73\uffff";
    static final String DFA27_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA27_maxS =
        "\1\102\1\0\72\uffff";
    static final String DFA27_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA27_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA27_transitionS = {
            "\3\2\4\uffff\5\2\1\uffff\25\2\1\1\2\2\1\uffff\31\2",
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

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1713:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( ruleXShortClosure ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_1 = input.LA(1);

                         
                        int index27_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalXscript()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index27_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA26_eotS =
        "\32\uffff";
    static final String DFA26_eofS =
        "\32\uffff";
    static final String DFA26_minS =
        "\1\4\2\0\27\uffff";
    static final String DFA26_maxS =
        "\1\102\2\0\27\uffff";
    static final String DFA26_acceptS =
        "\3\uffff\2\1\1\2\23\uffff\1\3";
    static final String DFA26_specialS =
        "\1\0\1\1\1\2\27\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\5\1\1\1\5\23\uffff\1\5\2\uffff\2\5\3\uffff\1\5\3\uffff\1"+
            "\2\1\31\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff"+
            "\3\5\3\uffff\7\5\2\uffff\1\3",
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
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1734:2: ( ( ( ( ruleXShortClosure ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_0 = input.LA(1);

                         
                        int index26_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_0==RULE_ID) ) {s = 1;}

                        else if ( (LA26_0==38) ) {s = 2;}

                        else if ( (LA26_0==66) && (synpred14_InternalXscript())) {s = 3;}

                        else if ( (LA26_0==41) && (synpred14_InternalXscript())) {s = 4;}

                        else if ( (LA26_0==RULE_STRING||LA26_0==RULE_INT||LA26_0==26||(LA26_0>=29 && LA26_0<=30)||LA26_0==34||LA26_0==40||LA26_0==43||LA26_0==45||LA26_0==47||(LA26_0>=51 && LA26_0<=53)||(LA26_0>=57 && LA26_0<=63)) ) {s = 5;}

                        else if ( (LA26_0==39) ) {s = 25;}

                         
                        input.seek(index26_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_1 = input.LA(1);

                         
                        int index26_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalXscript()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index26_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_2 = input.LA(1);

                         
                        int index26_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalXscript()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index26_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA52_eotS =
        "\74\uffff";
    static final String DFA52_eofS =
        "\1\2\73\uffff";
    static final String DFA52_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA52_maxS =
        "\1\102\1\0\72\uffff";
    static final String DFA52_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA52_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA52_transitionS = {
            "\3\2\4\uffff\5\2\1\uffff\25\2\1\1\2\2\1\uffff\31\2",
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

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "3175:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( ruleXShortClosure ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA52_1 = input.LA(1);

                         
                        int index52_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalXscript()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index52_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 52, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA51_eotS =
        "\32\uffff";
    static final String DFA51_eofS =
        "\32\uffff";
    static final String DFA51_minS =
        "\1\4\2\0\27\uffff";
    static final String DFA51_maxS =
        "\1\102\2\0\27\uffff";
    static final String DFA51_acceptS =
        "\3\uffff\2\1\1\2\23\uffff\1\3";
    static final String DFA51_specialS =
        "\1\0\1\1\1\2\27\uffff}>";
    static final String[] DFA51_transitionS = {
            "\1\5\1\1\1\5\23\uffff\1\5\2\uffff\2\5\3\uffff\1\5\3\uffff\1"+
            "\2\1\31\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff"+
            "\3\5\3\uffff\7\5\2\uffff\1\3",
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
            ""
    };

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "3196:2: ( ( ( ( ruleXShortClosure ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA51_0 = input.LA(1);

                         
                        int index51_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA51_0==RULE_ID) ) {s = 1;}

                        else if ( (LA51_0==38) ) {s = 2;}

                        else if ( (LA51_0==66) && (synpred18_InternalXscript())) {s = 3;}

                        else if ( (LA51_0==41) && (synpred18_InternalXscript())) {s = 4;}

                        else if ( (LA51_0==RULE_STRING||LA51_0==RULE_INT||LA51_0==26||(LA51_0>=29 && LA51_0<=30)||LA51_0==34||LA51_0==40||LA51_0==43||LA51_0==45||LA51_0==47||(LA51_0>=51 && LA51_0<=53)||(LA51_0>=57 && LA51_0<=63)) ) {s = 5;}

                        else if ( (LA51_0==39) ) {s = 25;}

                         
                        input.seek(index51_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA51_1 = input.LA(1);

                         
                        int index51_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalXscript()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index51_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA51_2 = input.LA(1);

                         
                        int index51_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalXscript()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index51_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 51, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA56_eotS =
        "\32\uffff";
    static final String DFA56_eofS =
        "\32\uffff";
    static final String DFA56_minS =
        "\1\4\2\0\27\uffff";
    static final String DFA56_maxS =
        "\1\102\2\0\27\uffff";
    static final String DFA56_acceptS =
        "\3\uffff\2\1\1\2\23\uffff\1\3";
    static final String DFA56_specialS =
        "\1\0\1\1\1\2\27\uffff}>";
    static final String[] DFA56_transitionS = {
            "\1\5\1\1\1\5\23\uffff\1\5\2\uffff\2\5\3\uffff\1\5\3\uffff\1"+
            "\2\1\31\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff"+
            "\3\5\3\uffff\7\5\2\uffff\1\3",
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
            return "3361:1: ( ( ( ( ruleXShortClosure ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_0 = input.LA(1);

                         
                        int index56_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA56_0==RULE_ID) ) {s = 1;}

                        else if ( (LA56_0==38) ) {s = 2;}

                        else if ( (LA56_0==66) && (synpred19_InternalXscript())) {s = 3;}

                        else if ( (LA56_0==41) && (synpred19_InternalXscript())) {s = 4;}

                        else if ( (LA56_0==RULE_STRING||LA56_0==RULE_INT||LA56_0==26||(LA56_0>=29 && LA56_0<=30)||LA56_0==34||LA56_0==40||LA56_0==43||LA56_0==45||LA56_0==47||(LA56_0>=51 && LA56_0<=53)||(LA56_0>=57 && LA56_0<=63)) ) {s = 5;}

                        else if ( (LA56_0==39) ) {s = 25;}

                         
                        input.seek(index56_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA56_1 = input.LA(1);

                         
                        int index56_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalXscript()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index56_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA56_2 = input.LA(1);

                         
                        int index56_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalXscript()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index56_2);
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
    static final String DFA66_eotS =
        "\74\uffff";
    static final String DFA66_eofS =
        "\1\2\73\uffff";
    static final String DFA66_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA66_maxS =
        "\1\102\1\0\72\uffff";
    static final String DFA66_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA66_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA66_transitionS = {
            "\3\2\4\uffff\5\2\1\uffff\11\2\1\1\16\2\1\uffff\31\2",
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

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "4095:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalXscript()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 66, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleXScript_in_entryRuleXScript75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXScript85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXScript141 = new BitSet(new long[]{0xFFB8A94464006072L});
    public static final BitSet FOLLOW_ruleXScriptExpression_in_ruleXScript168 = new BitSet(new long[]{0xFFB8A94464006072L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXScript195 = new BitSet(new long[]{0xFFB8A94464006072L});
    public static final BitSet FOLLOW_ruleXScriptExpression_in_entryRuleXScriptExpression233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXScriptExpression243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXImport_in_ruleXScriptExpression290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPackageUse_in_ruleXScriptExpression317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard411 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleQualifiedNameWithWildCard430 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedNameWithWildCard443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXImport_in_entryRuleXImport485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXImport495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleXImport532 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleXImport553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPackageUse_in_entryRuleXPackageUse589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPackageUse599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleXPackageUse636 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXPackageUse653 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleXPackageUse671 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXPackageUse688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXAssignment886 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment902 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment952 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1005 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOpSingleAssign1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpMultiAssign1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1300 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1353 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1376 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpOr1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1559 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1612 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1635 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpAnd1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1818 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1871 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1894 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality1933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpEquality1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpEquality2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2098 = new BitSet(new long[]{0x0000000007C00002L});
    public static final BitSet FOLLOW_22_in_ruleXRelationalExpression2134 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2159 = new BitSet(new long[]{0x0000000007C00002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2220 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2243 = new BitSet(new long[]{0x0000000007C00002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpCompare2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpCompare2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpCompare2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpCompare2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2486 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2539 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2562 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2766 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2819 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2842 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd2881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpAdd2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpAdd2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3046 = new BitSet(new long[]{0x0000000380001002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3099 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3122 = new BitSet(new long[]{0x0000000380001002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleOpMulti3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpMulti3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpMulti3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpMulti3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3375 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpUnary3510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpUnary3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpUnary3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3645 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleXCastedExpression3680 = new BitSet(new long[]{0x0000004000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3703 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3798 = new BitSet(new long[]{0x0000001800000802L});
    public static final BitSet FOLLOW_11_in_ruleXMemberFeatureCall3847 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXMemberFeatureCall3867 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3883 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3905 = new BitSet(new long[]{0x0000001800000802L});
    public static final BitSet FOLLOW_11_in_ruleXMemberFeatureCall3991 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_35_in_ruleXMemberFeatureCall4015 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_36_in_ruleXMemberFeatureCall4052 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_26_in_ruleXMemberFeatureCall4081 = new BitSet(new long[]{0x0000004000000020L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4102 = new BitSet(new long[]{0x0000002002000000L});
    public static final BitSet FOLLOW_37_in_ruleXMemberFeatureCall4115 = new BitSet(new long[]{0x0000004000000020L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4136 = new BitSet(new long[]{0x0000002002000000L});
    public static final BitSet FOLLOW_25_in_ruleXMemberFeatureCall4150 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXMemberFeatureCall4172 = new BitSet(new long[]{0x0000005800000802L});
    public static final BitSet FOLLOW_38_in_ruleXMemberFeatureCall4206 = new BitSet(new long[]{0xFE38ABC464000070L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4251 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4279 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_37_in_ruleXMemberFeatureCall4292 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4313 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_39_in_ruleXMemberFeatureCall4330 = new BitSet(new long[]{0x0000001800000802L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral4760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral4770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral4817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral4871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral4898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral4925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral4952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure4987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure4997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleXClosure5043 = new BitSet(new long[]{0x0000024000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5065 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_37_in_ruleXClosure5078 = new BitSet(new long[]{0x0000004000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5099 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_41_in_ruleXClosure5115 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXClosure5136 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXClosure5148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5250 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_37_in_ruleXShortClosure5263 = new BitSet(new long[]{0x0000004000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5284 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_41_in_ruleXShortClosure5300 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleXParenthesizedExpression5404 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5426 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleXParenthesizedExpression5437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleXIfExpression5529 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleXIfExpression5541 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5562 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleXIfExpression5574 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5595 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleXIfExpression5616 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression5686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleXSwitchExpression5732 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXSwitchExpression5750 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXSwitchExpression5767 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression5790 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXSwitchExpression5802 = new BitSet(new long[]{0x0004404000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression5823 = new BitSet(new long[]{0x0007404000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_48_in_ruleXSwitchExpression5837 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXSwitchExpression5849 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression5870 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXSwitchExpression5884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart5920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart5930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart5976 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_50_in_ruleXCasePart5990 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6011 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXCasePart6025 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXForLoopExpression6138 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleXForLoopExpression6150 = new BitSet(new long[]{0x0000004000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6171 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXForLoopExpression6183 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6204 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleXForLoopExpression6216 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXWhileExpression6329 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleXWhileExpression6341 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6362 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleXWhileExpression6374 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression6441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXDoWhileExpression6487 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6508 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXDoWhileExpression6520 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleXDoWhileExpression6532 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6553 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleXDoWhileExpression6565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression6611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXBlockExpression6657 = new BitSet(new long[]{0xFFBAA94464006070L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression6679 = new BitSet(new long[]{0xFFFAA94464006070L});
    public static final BitSet FOLLOW_54_in_ruleXBlockExpression6692 = new BitSet(new long[]{0xFFBAA94464006070L});
    public static final BitSet FOLLOW_49_in_ruleXBlockExpression6708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock6744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock6754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock6801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock6828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration6863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration6873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXVariableDeclaration6926 = new BitSet(new long[]{0x0000004000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_56_in_ruleXVariableDeclaration6957 = new BitSet(new long[]{0x0000004000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7006 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXVariableDeclaration7023 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXVariableDeclaration7053 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleXVariableDeclaration7072 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7187 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJvmFormalParameter7205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleXFeatureCall7303 = new BitSet(new long[]{0x0000004000000020L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7324 = new BitSet(new long[]{0x0000002002000000L});
    public static final BitSet FOLLOW_37_in_ruleXFeatureCall7337 = new BitSet(new long[]{0x0000004000000020L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7358 = new BitSet(new long[]{0x0000002002000000L});
    public static final BitSet FOLLOW_25_in_ruleXFeatureCall7372 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXFeatureCall7394 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleXFeatureCall7428 = new BitSet(new long[]{0xFE38ABC464000070L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7473 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7501 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_37_in_ruleXFeatureCall7514 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7535 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_39_in_ruleXFeatureCall7552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall7590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall7600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXConstructorCall7646 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall7669 = new BitSet(new long[]{0x0000004004000000L});
    public static final BitSet FOLLOW_26_in_ruleXConstructorCall7682 = new BitSet(new long[]{0x0000004000000020L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall7703 = new BitSet(new long[]{0x0000002002000000L});
    public static final BitSet FOLLOW_37_in_ruleXConstructorCall7716 = new BitSet(new long[]{0x0000004000000020L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall7737 = new BitSet(new long[]{0x0000002002000000L});
    public static final BitSet FOLLOW_25_in_ruleXConstructorCall7751 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleXConstructorCall7765 = new BitSet(new long[]{0xFE38ABC464000070L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall7797 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall7825 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_37_in_ruleXConstructorCall7838 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall7859 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_39_in_ruleXConstructorCall7876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral7912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral7922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXBooleanLiteral7969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXBooleanLiteral7993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral8053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXNullLiteral8099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral8135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral8145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral8196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral8237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral8247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral8298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral8339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral8349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXTypeLiteral8395 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleXTypeLiteral8407 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral8430 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleXTypeLiteral8442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression8478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression8488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXThrowExpression8534 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression8555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression8591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression8601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXTryCatchFinallyExpression8647 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression8668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression8701 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_64_in_ruleXTryCatchFinallyExpression8723 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression8745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXTryCatchFinallyExpression8767 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression8788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause8826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause8836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXCatchClause8873 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleXCatchClause8885 = new BitSet(new long[]{0x0000004000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause8906 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleXCatchClause8918 = new BitSet(new long[]{0xFE38A94464000070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause8939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName8976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName8987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName9027 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleQualifiedName9055 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName9071 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference9118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference9128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference9175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference9202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef9237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef9247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleXFunctionTypeRef9285 = new BitSet(new long[]{0x0000004000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9306 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_37_in_ruleXFunctionTypeRef9319 = new BitSet(new long[]{0x0000004000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9340 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_39_in_ruleXFunctionTypeRef9354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleXFunctionTypeRef9368 = new BitSet(new long[]{0x0000004000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference9425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference9435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference9483 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleJvmParameterizedTypeReference9504 = new BitSet(new long[]{0x0000004000000020L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference9526 = new BitSet(new long[]{0x0000002002000000L});
    public static final BitSet FOLLOW_37_in_ruleJvmParameterizedTypeReference9539 = new BitSet(new long[]{0x0000004000000020L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference9560 = new BitSet(new long[]{0x0000002002000000L});
    public static final BitSet FOLLOW_25_in_ruleJvmParameterizedTypeReference9574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference9612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference9622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference9669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference9696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference9731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference9741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleJvmWildcardTypeReference9787 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000050L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference9809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference9836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound9874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound9884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleJvmUpperBound9921 = new BitSet(new long[]{0x0000004000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound9942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded9978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded9988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleJvmUpperBoundAnded10025 = new BitSet(new long[]{0x0000004000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded10046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound10082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound10092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleJvmLowerBound10129 = new BitSet(new long[]{0x0000004000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound10150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalXscript973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalXscript1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalXscript1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalXscript1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_synpred5_InternalXscript2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalXscript2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalXscript2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalXscript2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalXscript3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred10_InternalXscript3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred11_InternalXscript3815 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred11_InternalXscript3823 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalXscript3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred12_InternalXscript3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred12_InternalXscript3944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred12_InternalXscript3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred13_InternalXscript4188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_synpred14_InternalXscript4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred15_InternalXscript5608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred16_InternalXscript6975 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred16_InternalXscript6984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred17_InternalXscript7410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_synpred18_InternalXscript7456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_synpred19_InternalXscript7780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_synpred20_InternalXscript8684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_synpred21_InternalXscript8715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred22_InternalXscript9046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred23_InternalXscript9496 = new BitSet(new long[]{0x0000000000000002L});

}
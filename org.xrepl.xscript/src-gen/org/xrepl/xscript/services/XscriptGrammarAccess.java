/*
* generated by Xtext
*/

package org.xrepl.xscript.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.xbase.services.XbaseGrammarAccess;
import org.eclipse.xtext.xbase.services.XtypeGrammarAccess;

@Singleton
public class XscriptGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class XScriptElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "XScript");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cXScriptAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cExpressionsAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cExpressionsXExpressionParserRuleCall_1_0_0 = (RuleCall)cExpressionsAssignment_1_0.eContents().get(0);
		private final Assignment cExpressionsAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cExpressionsXScriptExpressionParserRuleCall_1_1_0 = (RuleCall)cExpressionsAssignment_1_1.eContents().get(0);
		private final Assignment cExpressionsAssignment_1_2 = (Assignment)cAlternatives_1.eContents().get(2);
		private final RuleCall cExpressionsXVariableDeclarationParserRuleCall_1_2_0 = (RuleCall)cExpressionsAssignment_1_2.eContents().get(0);
		
		//XScript:
		//	{XScript} (expressions+=XExpression | expressions+=XScriptExpression | expressions+=XVariableDeclaration)*;
		public ParserRule getRule() { return rule; }

		//{XScript} (expressions+=XExpression | expressions+=XScriptExpression | expressions+=XVariableDeclaration)*
		public Group getGroup() { return cGroup; }

		//{XScript}
		public Action getXScriptAction_0() { return cXScriptAction_0; }

		//(expressions+=XExpression | expressions+=XScriptExpression | expressions+=XVariableDeclaration)*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//expressions+=XExpression
		public Assignment getExpressionsAssignment_1_0() { return cExpressionsAssignment_1_0; }

		//XExpression
		public RuleCall getExpressionsXExpressionParserRuleCall_1_0_0() { return cExpressionsXExpressionParserRuleCall_1_0_0; }

		//expressions+=XScriptExpression
		public Assignment getExpressionsAssignment_1_1() { return cExpressionsAssignment_1_1; }

		//XScriptExpression
		public RuleCall getExpressionsXScriptExpressionParserRuleCall_1_1_0() { return cExpressionsXScriptExpressionParserRuleCall_1_1_0; }

		//expressions+=XVariableDeclaration
		public Assignment getExpressionsAssignment_1_2() { return cExpressionsAssignment_1_2; }

		//XVariableDeclaration
		public RuleCall getExpressionsXVariableDeclarationParserRuleCall_1_2_0() { return cExpressionsXVariableDeclarationParserRuleCall_1_2_0; }
	}

	public class XScriptExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "XScriptExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cXImportParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cXEPackageImportParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//XScriptExpression:
		//	XImport | XEPackageImport;
		public ParserRule getRule() { return rule; }

		//XImport | XEPackageImport
		public Alternatives getAlternatives() { return cAlternatives; }

		//XImport
		public RuleCall getXImportParserRuleCall_0() { return cXImportParserRuleCall_0; }

		//XEPackageImport
		public RuleCall getXEPackageImportParserRuleCall_1() { return cXEPackageImportParserRuleCall_1; }
	}

	public class XPrimaryExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "XPrimaryExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cXConstructorCallParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cXBlockExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cXSwitchExpressionParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cXFeatureCallParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cXLiteralParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cXIfExpressionParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cXForLoopExpressionParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cXWhileExpressionParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		private final RuleCall cXDoWhileExpressionParserRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		private final RuleCall cXThrowExpressionParserRuleCall_9 = (RuleCall)cAlternatives.eContents().get(9);
		private final RuleCall cXReturnExpressionParserRuleCall_10 = (RuleCall)cAlternatives.eContents().get(10);
		private final RuleCall cXTryCatchFinallyExpressionParserRuleCall_11 = (RuleCall)cAlternatives.eContents().get(11);
		private final RuleCall cXParenthesizedExpressionParserRuleCall_12 = (RuleCall)cAlternatives.eContents().get(12);
		private final RuleCall cXNewEObjectParserRuleCall_13 = (RuleCall)cAlternatives.eContents().get(13);
		
		//XPrimaryExpression returns base::XExpression:
		//	XConstructorCall | XBlockExpression | XSwitchExpression | XFeatureCall | XLiteral | XIfExpression | XForLoopExpression
		//	| XWhileExpression | XDoWhileExpression | XThrowExpression | XReturnExpression | XTryCatchFinallyExpression |
		//	XParenthesizedExpression | XNewEObject;
		public ParserRule getRule() { return rule; }

		//XConstructorCall | XBlockExpression | XSwitchExpression | XFeatureCall | XLiteral | XIfExpression | XForLoopExpression |
		//XWhileExpression | XDoWhileExpression | XThrowExpression | XReturnExpression | XTryCatchFinallyExpression |
		//XParenthesizedExpression | XNewEObject
		public Alternatives getAlternatives() { return cAlternatives; }

		//XConstructorCall
		public RuleCall getXConstructorCallParserRuleCall_0() { return cXConstructorCallParserRuleCall_0; }

		//XBlockExpression
		public RuleCall getXBlockExpressionParserRuleCall_1() { return cXBlockExpressionParserRuleCall_1; }

		//XSwitchExpression
		public RuleCall getXSwitchExpressionParserRuleCall_2() { return cXSwitchExpressionParserRuleCall_2; }

		//XFeatureCall
		public RuleCall getXFeatureCallParserRuleCall_3() { return cXFeatureCallParserRuleCall_3; }

		//XLiteral
		public RuleCall getXLiteralParserRuleCall_4() { return cXLiteralParserRuleCall_4; }

		//XIfExpression
		public RuleCall getXIfExpressionParserRuleCall_5() { return cXIfExpressionParserRuleCall_5; }

		//XForLoopExpression
		public RuleCall getXForLoopExpressionParserRuleCall_6() { return cXForLoopExpressionParserRuleCall_6; }

		//XWhileExpression
		public RuleCall getXWhileExpressionParserRuleCall_7() { return cXWhileExpressionParserRuleCall_7; }

		//XDoWhileExpression
		public RuleCall getXDoWhileExpressionParserRuleCall_8() { return cXDoWhileExpressionParserRuleCall_8; }

		//XThrowExpression
		public RuleCall getXThrowExpressionParserRuleCall_9() { return cXThrowExpressionParserRuleCall_9; }

		//XReturnExpression
		public RuleCall getXReturnExpressionParserRuleCall_10() { return cXReturnExpressionParserRuleCall_10; }

		//XTryCatchFinallyExpression
		public RuleCall getXTryCatchFinallyExpressionParserRuleCall_11() { return cXTryCatchFinallyExpressionParserRuleCall_11; }

		//XParenthesizedExpression
		public RuleCall getXParenthesizedExpressionParserRuleCall_12() { return cXParenthesizedExpressionParserRuleCall_12; }

		//XNewEObject
		public RuleCall getXNewEObjectParserRuleCall_13() { return cXNewEObjectParserRuleCall_13; }
	}

	public class XNewEObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "XNewEObject");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCreateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cTypeEClassCrossReference_1_0 = (CrossReference)cTypeAssignment_1.eContents().get(0);
		private final RuleCall cTypeEClassIDTerminalRuleCall_1_0_1 = (RuleCall)cTypeEClassCrossReference_1_0.eContents().get(1);
		
		//// temporary syntax 
		//XNewEObject:
		//	"create" type=[ecore::EClass];
		public ParserRule getRule() { return rule; }

		//"create" type=[ecore::EClass]
		public Group getGroup() { return cGroup; }

		//"create"
		public Keyword getCreateKeyword_0() { return cCreateKeyword_0; }

		//type=[ecore::EClass]
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }

		//[ecore::EClass]
		public CrossReference getTypeEClassCrossReference_1_0() { return cTypeEClassCrossReference_1_0; }

		//ID
		public RuleCall getTypeEClassIDTerminalRuleCall_1_0_1() { return cTypeEClassIDTerminalRuleCall_1_0_1; }
	}

	public class QualifiedNameWithWildCardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedNameWithWildCard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Keyword cAsteriskKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		
		//QualifiedNameWithWildCard:
		//	QualifiedName ("." "*")?;
		public ParserRule getRule() { return rule; }

		//QualifiedName ("." "*")?
		public Group getGroup() { return cGroup; }

		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }

		//("." "*")?
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//"*"
		public Keyword getAsteriskKeyword_1_1() { return cAsteriskKeyword_1_1; }
	}

	public class XImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "XImport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cStaticAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final Keyword cStaticStaticKeyword_1_0_0 = (Keyword)cStaticAssignment_1_0.eContents().get(0);
		private final Assignment cExtensionAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Keyword cExtensionExtensionKeyword_1_1_0 = (Keyword)cExtensionAssignment_1_1.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cImportedNamespaceQualifiedNameWithWildCardParserRuleCall_2_0 = (RuleCall)cImportedNamespaceAssignment_2.eContents().get(0);
		
		//XImport:
		//	"import" (static?="static" extension?="extension"?)? importedNamespace=QualifiedNameWithWildCard;
		public ParserRule getRule() { return rule; }

		//"import" (static?="static" extension?="extension"?)? importedNamespace=QualifiedNameWithWildCard
		public Group getGroup() { return cGroup; }

		//"import"
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }

		//(static?="static" extension?="extension"?)?
		public Group getGroup_1() { return cGroup_1; }

		//static?="static"
		public Assignment getStaticAssignment_1_0() { return cStaticAssignment_1_0; }

		//"static"
		public Keyword getStaticStaticKeyword_1_0_0() { return cStaticStaticKeyword_1_0_0; }

		//extension?="extension"?
		public Assignment getExtensionAssignment_1_1() { return cExtensionAssignment_1_1; }

		//"extension"
		public Keyword getExtensionExtensionKeyword_1_1_0() { return cExtensionExtensionKeyword_1_1_0; }

		//importedNamespace=QualifiedNameWithWildCard
		public Assignment getImportedNamespaceAssignment_2() { return cImportedNamespaceAssignment_2; }

		//QualifiedNameWithWildCard
		public RuleCall getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_2_0() { return cImportedNamespaceQualifiedNameWithWildCardParserRuleCall_2_0; }
	}

	public class XEPackageImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "XEPackageImport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNsUriAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNsUriSTRINGTerminalRuleCall_1_0 = (RuleCall)cNsUriAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cAsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cNameAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_2_1_0 = (RuleCall)cNameAssignment_2_1.eContents().get(0);
		
		//XEPackageImport:
		//	"import" nsUri=STRING ("as" name=ID)?;
		public ParserRule getRule() { return rule; }

		//"import" nsUri=STRING ("as" name=ID)?
		public Group getGroup() { return cGroup; }

		//"import"
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }

		//nsUri=STRING
		public Assignment getNsUriAssignment_1() { return cNsUriAssignment_1; }

		//STRING
		public RuleCall getNsUriSTRINGTerminalRuleCall_1_0() { return cNsUriSTRINGTerminalRuleCall_1_0; }

		//("as" name=ID)?
		public Group getGroup_2() { return cGroup_2; }

		//"as"
		public Keyword getAsKeyword_2_0() { return cAsKeyword_2_0; }

		//name=ID
		public Assignment getNameAssignment_2_1() { return cNameAssignment_2_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_1_0() { return cNameIDTerminalRuleCall_2_1_0; }
	}
	
	
	private XScriptElements pXScript;
	private XScriptExpressionElements pXScriptExpression;
	private XPrimaryExpressionElements pXPrimaryExpression;
	private XNewEObjectElements pXNewEObject;
	private QualifiedNameWithWildCardElements pQualifiedNameWithWildCard;
	private XImportElements pXImport;
	private XEPackageImportElements pXEPackageImport;
	
	private final GrammarProvider grammarProvider;

	private XbaseGrammarAccess gaXbase;

	@Inject
	public XscriptGrammarAccess(GrammarProvider grammarProvider,
		XbaseGrammarAccess gaXbase) {
		this.grammarProvider = grammarProvider;
		this.gaXbase = gaXbase;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public XbaseGrammarAccess getXbaseGrammarAccess() {
		return gaXbase;
	}

	
	//XScript:
	//	{XScript} (expressions+=XExpression | expressions+=XScriptExpression | expressions+=XVariableDeclaration)*;
	public XScriptElements getXScriptAccess() {
		return (pXScript != null) ? pXScript : (pXScript = new XScriptElements());
	}
	
	public ParserRule getXScriptRule() {
		return getXScriptAccess().getRule();
	}

	//XScriptExpression:
	//	XImport | XEPackageImport;
	public XScriptExpressionElements getXScriptExpressionAccess() {
		return (pXScriptExpression != null) ? pXScriptExpression : (pXScriptExpression = new XScriptExpressionElements());
	}
	
	public ParserRule getXScriptExpressionRule() {
		return getXScriptExpressionAccess().getRule();
	}

	//XPrimaryExpression returns base::XExpression:
	//	XConstructorCall | XBlockExpression | XSwitchExpression | XFeatureCall | XLiteral | XIfExpression | XForLoopExpression
	//	| XWhileExpression | XDoWhileExpression | XThrowExpression | XReturnExpression | XTryCatchFinallyExpression |
	//	XParenthesizedExpression | XNewEObject;
	public XPrimaryExpressionElements getXPrimaryExpressionAccess() {
		return (pXPrimaryExpression != null) ? pXPrimaryExpression : (pXPrimaryExpression = new XPrimaryExpressionElements());
	}
	
	public ParserRule getXPrimaryExpressionRule() {
		return getXPrimaryExpressionAccess().getRule();
	}

	//// temporary syntax 
	//XNewEObject:
	//	"create" type=[ecore::EClass];
	public XNewEObjectElements getXNewEObjectAccess() {
		return (pXNewEObject != null) ? pXNewEObject : (pXNewEObject = new XNewEObjectElements());
	}
	
	public ParserRule getXNewEObjectRule() {
		return getXNewEObjectAccess().getRule();
	}

	//QualifiedNameWithWildCard:
	//	QualifiedName ("." "*")?;
	public QualifiedNameWithWildCardElements getQualifiedNameWithWildCardAccess() {
		return (pQualifiedNameWithWildCard != null) ? pQualifiedNameWithWildCard : (pQualifiedNameWithWildCard = new QualifiedNameWithWildCardElements());
	}
	
	public ParserRule getQualifiedNameWithWildCardRule() {
		return getQualifiedNameWithWildCardAccess().getRule();
	}

	//XImport:
	//	"import" (static?="static" extension?="extension"?)? importedNamespace=QualifiedNameWithWildCard;
	public XImportElements getXImportAccess() {
		return (pXImport != null) ? pXImport : (pXImport = new XImportElements());
	}
	
	public ParserRule getXImportRule() {
		return getXImportAccess().getRule();
	}

	//XEPackageImport:
	//	"import" nsUri=STRING ("as" name=ID)?;
	public XEPackageImportElements getXEPackageImportAccess() {
		return (pXEPackageImport != null) ? pXEPackageImport : (pXEPackageImport = new XEPackageImportElements());
	}
	
	public ParserRule getXEPackageImportRule() {
		return getXEPackageImportAccess().getRule();
	}

	//XExpression:
	//	XAssignment;
	public XbaseGrammarAccess.XExpressionElements getXExpressionAccess() {
		return gaXbase.getXExpressionAccess();
	}
	
	public ParserRule getXExpressionRule() {
		return getXExpressionAccess().getRule();
	}

	//XAssignment returns XExpression:
	//	{XAssignment} feature=[types::JvmIdentifiableElement] OpSingleAssign value=XAssignment | XOrExpression (=>
	//	({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpMultiAssign])
	//	rightOperand=XAssignment)?;
	public XbaseGrammarAccess.XAssignmentElements getXAssignmentAccess() {
		return gaXbase.getXAssignmentAccess();
	}
	
	public ParserRule getXAssignmentRule() {
		return getXAssignmentAccess().getRule();
	}

	//OpSingleAssign:
	//	"=";
	public XbaseGrammarAccess.OpSingleAssignElements getOpSingleAssignAccess() {
		return gaXbase.getOpSingleAssignAccess();
	}
	
	public ParserRule getOpSingleAssignRule() {
		return getOpSingleAssignAccess().getRule();
	}

	//OpMultiAssign:
	//	"+=";
	public XbaseGrammarAccess.OpMultiAssignElements getOpMultiAssignAccess() {
		return gaXbase.getOpMultiAssignAccess();
	}
	
	public ParserRule getOpMultiAssignRule() {
		return getOpMultiAssignAccess().getRule();
	}

	//XOrExpression returns XExpression:
	//	XAndExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpOr])
	//	rightOperand=XAndExpression)*;
	public XbaseGrammarAccess.XOrExpressionElements getXOrExpressionAccess() {
		return gaXbase.getXOrExpressionAccess();
	}
	
	public ParserRule getXOrExpressionRule() {
		return getXOrExpressionAccess().getRule();
	}

	//OpOr:
	//	"||";
	public XbaseGrammarAccess.OpOrElements getOpOrAccess() {
		return gaXbase.getOpOrAccess();
	}
	
	public ParserRule getOpOrRule() {
		return getOpOrAccess().getRule();
	}

	//XAndExpression returns XExpression:
	//	XEqualityExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpAnd])
	//	rightOperand=XEqualityExpression)*;
	public XbaseGrammarAccess.XAndExpressionElements getXAndExpressionAccess() {
		return gaXbase.getXAndExpressionAccess();
	}
	
	public ParserRule getXAndExpressionRule() {
		return getXAndExpressionAccess().getRule();
	}

	//OpAnd:
	//	"&&";
	public XbaseGrammarAccess.OpAndElements getOpAndAccess() {
		return gaXbase.getOpAndAccess();
	}
	
	public ParserRule getOpAndRule() {
		return getOpAndAccess().getRule();
	}

	//XEqualityExpression returns XExpression:
	//	XRelationalExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpEquality])
	//	rightOperand=XRelationalExpression)*;
	public XbaseGrammarAccess.XEqualityExpressionElements getXEqualityExpressionAccess() {
		return gaXbase.getXEqualityExpressionAccess();
	}
	
	public ParserRule getXEqualityExpressionRule() {
		return getXEqualityExpressionAccess().getRule();
	}

	//OpEquality:
	//	"==" | "!=";
	public XbaseGrammarAccess.OpEqualityElements getOpEqualityAccess() {
		return gaXbase.getOpEqualityAccess();
	}
	
	public ParserRule getOpEqualityRule() {
		return getOpEqualityAccess().getRule();
	}

	//XRelationalExpression returns XExpression:
	//	XOtherOperatorExpression (=> ({XInstanceOfExpression.expression=current} "instanceof")
	//	type=[types::JvmType|QualifiedName] | => ({XBinaryOperation.leftOperand=current}
	//	feature=[types::JvmIdentifiableElement|OpCompare]) rightOperand=XOtherOperatorExpression)*;
	public XbaseGrammarAccess.XRelationalExpressionElements getXRelationalExpressionAccess() {
		return gaXbase.getXRelationalExpressionAccess();
	}
	
	public ParserRule getXRelationalExpressionRule() {
		return getXRelationalExpressionAccess().getRule();
	}

	//OpCompare:
	//	">=" | "<=" | ">" | "<";
	public XbaseGrammarAccess.OpCompareElements getOpCompareAccess() {
		return gaXbase.getOpCompareAccess();
	}
	
	public ParserRule getOpCompareRule() {
		return getOpCompareAccess().getRule();
	}

	//XOtherOperatorExpression returns XExpression:
	//	XAdditiveExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpOther])
	//	rightOperand=XAdditiveExpression)*;
	public XbaseGrammarAccess.XOtherOperatorExpressionElements getXOtherOperatorExpressionAccess() {
		return gaXbase.getXOtherOperatorExpressionAccess();
	}
	
	public ParserRule getXOtherOperatorExpressionRule() {
		return getXOtherOperatorExpressionAccess().getRule();
	}

	//OpOther:
	//	"->" | "..";
	public XbaseGrammarAccess.OpOtherElements getOpOtherAccess() {
		return gaXbase.getOpOtherAccess();
	}
	
	public ParserRule getOpOtherRule() {
		return getOpOtherAccess().getRule();
	}

	//XAdditiveExpression returns XExpression:
	//	XMultiplicativeExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpAdd])
	//	rightOperand=XMultiplicativeExpression)*;
	public XbaseGrammarAccess.XAdditiveExpressionElements getXAdditiveExpressionAccess() {
		return gaXbase.getXAdditiveExpressionAccess();
	}
	
	public ParserRule getXAdditiveExpressionRule() {
		return getXAdditiveExpressionAccess().getRule();
	}

	//OpAdd:
	//	"+" | "-";
	public XbaseGrammarAccess.OpAddElements getOpAddAccess() {
		return gaXbase.getOpAddAccess();
	}
	
	public ParserRule getOpAddRule() {
		return getOpAddAccess().getRule();
	}

	//XMultiplicativeExpression returns XExpression:
	//	XUnaryOperation (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpMulti])
	//	rightOperand=XUnaryOperation)*;
	public XbaseGrammarAccess.XMultiplicativeExpressionElements getXMultiplicativeExpressionAccess() {
		return gaXbase.getXMultiplicativeExpressionAccess();
	}
	
	public ParserRule getXMultiplicativeExpressionRule() {
		return getXMultiplicativeExpressionAccess().getRule();
	}

	//OpMulti:
	//	"*" | "**" | "/" | "%";
	public XbaseGrammarAccess.OpMultiElements getOpMultiAccess() {
		return gaXbase.getOpMultiAccess();
	}
	
	public ParserRule getOpMultiRule() {
		return getOpMultiAccess().getRule();
	}

	//XUnaryOperation returns XExpression:
	//	{XUnaryOperation} feature=[types::JvmIdentifiableElement|OpUnary] operand=XCastedExpression | XCastedExpression;
	public XbaseGrammarAccess.XUnaryOperationElements getXUnaryOperationAccess() {
		return gaXbase.getXUnaryOperationAccess();
	}
	
	public ParserRule getXUnaryOperationRule() {
		return getXUnaryOperationAccess().getRule();
	}

	//OpUnary:
	//	"!" | "-" | "+";
	public XbaseGrammarAccess.OpUnaryElements getOpUnaryAccess() {
		return gaXbase.getOpUnaryAccess();
	}
	
	public ParserRule getOpUnaryRule() {
		return getOpUnaryAccess().getRule();
	}

	//XCastedExpression returns XExpression:
	//	XMemberFeatureCall (=> ({XCastedExpression.target=current} "as") type=JvmTypeReference)*;
	public XbaseGrammarAccess.XCastedExpressionElements getXCastedExpressionAccess() {
		return gaXbase.getXCastedExpressionAccess();
	}
	
	public ParserRule getXCastedExpressionRule() {
		return getXCastedExpressionAccess().getRule();
	}

	//XMemberFeatureCall returns XExpression:
	//	XPrimaryExpression (=> ({XAssignment.assignable=current} "." feature=[types::JvmIdentifiableElement] OpSingleAssign)
	//	value=XAssignment | => ({XMemberFeatureCall.memberCallTarget=current} ("." | nullSafe?="?." | spreading?="*.")) ("<"
	//	typeArguments+=JvmArgumentTypeReference ("," typeArguments+=JvmArgumentTypeReference)* ">")?
	//	feature=[types::JvmIdentifiableElement] (=> explicitOperationCall?="(" (memberCallArguments+=XShortClosure |
	//	memberCallArguments+=XExpression ("," memberCallArguments+=XExpression)*)? ")")?)*;
	public XbaseGrammarAccess.XMemberFeatureCallElements getXMemberFeatureCallAccess() {
		return gaXbase.getXMemberFeatureCallAccess();
	}
	
	public ParserRule getXMemberFeatureCallRule() {
		return getXMemberFeatureCallAccess().getRule();
	}

	//XLiteral returns XExpression:
	//	XClosure | XBooleanLiteral | XIntLiteral | XNullLiteral | XStringLiteral | XTypeLiteral;
	public XbaseGrammarAccess.XLiteralElements getXLiteralAccess() {
		return gaXbase.getXLiteralAccess();
	}
	
	public ParserRule getXLiteralRule() {
		return getXLiteralAccess().getRule();
	}

	//XClosure returns XExpression:
	//	{XClosure} "[" (formalParameters+=JvmFormalParameter ("," formalParameters+=JvmFormalParameter)*)? "|"
	//	expression=XExpression "]";
	public XbaseGrammarAccess.XClosureElements getXClosureAccess() {
		return gaXbase.getXClosureAccess();
	}
	
	public ParserRule getXClosureRule() {
		return getXClosureAccess().getRule();
	}

	//XShortClosure returns XExpression:
	//	=> ({XClosure} (formalParameters+=JvmFormalParameter ("," formalParameters+=JvmFormalParameter)*)? "|")
	//	expression=XExpression;
	public XbaseGrammarAccess.XShortClosureElements getXShortClosureAccess() {
		return gaXbase.getXShortClosureAccess();
	}
	
	public ParserRule getXShortClosureRule() {
		return getXShortClosureAccess().getRule();
	}

	//XParenthesizedExpression returns XExpression:
	//	"(" XExpression ")";
	public XbaseGrammarAccess.XParenthesizedExpressionElements getXParenthesizedExpressionAccess() {
		return gaXbase.getXParenthesizedExpressionAccess();
	}
	
	public ParserRule getXParenthesizedExpressionRule() {
		return getXParenthesizedExpressionAccess().getRule();
	}

	//XIfExpression returns XExpression:
	//	{XIfExpression} "if" "(" if=XExpression ")" then=XExpression ("else" else=XExpression)?;
	public XbaseGrammarAccess.XIfExpressionElements getXIfExpressionAccess() {
		return gaXbase.getXIfExpressionAccess();
	}
	
	public ParserRule getXIfExpressionRule() {
		return getXIfExpressionAccess().getRule();
	}

	//XSwitchExpression returns XExpression:
	//	{XSwitchExpression} "switch" (localVarName=ID ":")? switch=XExpression "{" cases+=XCasePart+ ("default" ":"
	//	default=XExpression)? "}";
	public XbaseGrammarAccess.XSwitchExpressionElements getXSwitchExpressionAccess() {
		return gaXbase.getXSwitchExpressionAccess();
	}
	
	public ParserRule getXSwitchExpressionRule() {
		return getXSwitchExpressionAccess().getRule();
	}

	//XCasePart:
	//	typeGuard=JvmTypeReference? ("case" case=XExpression)? ":" then=XExpression;
	public XbaseGrammarAccess.XCasePartElements getXCasePartAccess() {
		return gaXbase.getXCasePartAccess();
	}
	
	public ParserRule getXCasePartRule() {
		return getXCasePartAccess().getRule();
	}

	//XForLoopExpression returns XExpression:
	//	{XForLoopExpression} "for" "(" declaredParam=JvmFormalParameter ":" forExpression=XExpression ")"
	//	eachExpression=XExpression;
	public XbaseGrammarAccess.XForLoopExpressionElements getXForLoopExpressionAccess() {
		return gaXbase.getXForLoopExpressionAccess();
	}
	
	public ParserRule getXForLoopExpressionRule() {
		return getXForLoopExpressionAccess().getRule();
	}

	//XWhileExpression returns XExpression:
	//	{XWhileExpression} "while" "(" predicate=XExpression ")" body=XExpression;
	public XbaseGrammarAccess.XWhileExpressionElements getXWhileExpressionAccess() {
		return gaXbase.getXWhileExpressionAccess();
	}
	
	public ParserRule getXWhileExpressionRule() {
		return getXWhileExpressionAccess().getRule();
	}

	//XDoWhileExpression returns XExpression:
	//	{XDoWhileExpression} "do" body=XExpression "while" "(" predicate=XExpression ")";
	public XbaseGrammarAccess.XDoWhileExpressionElements getXDoWhileExpressionAccess() {
		return gaXbase.getXDoWhileExpressionAccess();
	}
	
	public ParserRule getXDoWhileExpressionRule() {
		return getXDoWhileExpressionAccess().getRule();
	}

	//XBlockExpression returns XExpression:
	//	{XBlockExpression} "{" (expressions+=XExpressionInsideBlock ";"?)* "}";
	public XbaseGrammarAccess.XBlockExpressionElements getXBlockExpressionAccess() {
		return gaXbase.getXBlockExpressionAccess();
	}
	
	public ParserRule getXBlockExpressionRule() {
		return getXBlockExpressionAccess().getRule();
	}

	//XExpressionInsideBlock returns XExpression:
	//	XVariableDeclaration | XExpression;
	public XbaseGrammarAccess.XExpressionInsideBlockElements getXExpressionInsideBlockAccess() {
		return gaXbase.getXExpressionInsideBlockAccess();
	}
	
	public ParserRule getXExpressionInsideBlockRule() {
		return getXExpressionInsideBlockAccess().getRule();
	}

	//XVariableDeclaration returns XExpression:
	//	{XVariableDeclaration} (writeable?="var" | "val") (=> (type=JvmTypeReference name=ID) | name=ID) ("="
	//	right=XExpression)?;
	public XbaseGrammarAccess.XVariableDeclarationElements getXVariableDeclarationAccess() {
		return gaXbase.getXVariableDeclarationAccess();
	}
	
	public ParserRule getXVariableDeclarationRule() {
		return getXVariableDeclarationAccess().getRule();
	}

	//JvmFormalParameter returns types::JvmFormalParameter:
	//	parameterType=JvmTypeReference? name=ID;
	public XbaseGrammarAccess.JvmFormalParameterElements getJvmFormalParameterAccess() {
		return gaXbase.getJvmFormalParameterAccess();
	}
	
	public ParserRule getJvmFormalParameterRule() {
		return getJvmFormalParameterAccess().getRule();
	}

	//XFeatureCall returns XExpression:
	//	{XFeatureCall} ("<" typeArguments+=JvmArgumentTypeReference ("," typeArguments+=JvmArgumentTypeReference)* ">")?
	//	feature=[types::JvmIdentifiableElement] (=> explicitOperationCall?="(" (featureCallArguments+=XShortClosure |
	//	featureCallArguments+=XExpression ("," featureCallArguments+=XExpression)*)? ")")?;
	public XbaseGrammarAccess.XFeatureCallElements getXFeatureCallAccess() {
		return gaXbase.getXFeatureCallAccess();
	}
	
	public ParserRule getXFeatureCallRule() {
		return getXFeatureCallAccess().getRule();
	}

	//XConstructorCall returns XExpression:
	//	{XConstructorCall} "new" constructor=[types::JvmConstructor|QualifiedName] ("<"
	//	typeArguments+=JvmArgumentTypeReference ("," typeArguments+=JvmArgumentTypeReference)* ">")? "("
	//	(arguments+=XShortClosure | arguments+=XExpression ("," arguments+=XExpression)*)? ")";
	public XbaseGrammarAccess.XConstructorCallElements getXConstructorCallAccess() {
		return gaXbase.getXConstructorCallAccess();
	}
	
	public ParserRule getXConstructorCallRule() {
		return getXConstructorCallAccess().getRule();
	}

	//XBooleanLiteral returns XExpression:
	//	{XBooleanLiteral} ("false" | isTrue?="true");
	public XbaseGrammarAccess.XBooleanLiteralElements getXBooleanLiteralAccess() {
		return gaXbase.getXBooleanLiteralAccess();
	}
	
	public ParserRule getXBooleanLiteralRule() {
		return getXBooleanLiteralAccess().getRule();
	}

	//XNullLiteral returns XExpression:
	//	{XNullLiteral} "null";
	public XbaseGrammarAccess.XNullLiteralElements getXNullLiteralAccess() {
		return gaXbase.getXNullLiteralAccess();
	}
	
	public ParserRule getXNullLiteralRule() {
		return getXNullLiteralAccess().getRule();
	}

	//XIntLiteral returns XExpression:
	//	{XIntLiteral} value=INT;
	public XbaseGrammarAccess.XIntLiteralElements getXIntLiteralAccess() {
		return gaXbase.getXIntLiteralAccess();
	}
	
	public ParserRule getXIntLiteralRule() {
		return getXIntLiteralAccess().getRule();
	}

	//XStringLiteral returns XExpression:
	//	{XStringLiteral} value=STRING;
	public XbaseGrammarAccess.XStringLiteralElements getXStringLiteralAccess() {
		return gaXbase.getXStringLiteralAccess();
	}
	
	public ParserRule getXStringLiteralRule() {
		return getXStringLiteralAccess().getRule();
	}

	//XTypeLiteral returns XExpression:
	//	{XTypeLiteral} "typeof" "(" type=[types::JvmType|QualifiedName] ")";
	public XbaseGrammarAccess.XTypeLiteralElements getXTypeLiteralAccess() {
		return gaXbase.getXTypeLiteralAccess();
	}
	
	public ParserRule getXTypeLiteralRule() {
		return getXTypeLiteralAccess().getRule();
	}

	//XThrowExpression returns XExpression:
	//	{XThrowExpression} "throw" expression=XExpression;
	public XbaseGrammarAccess.XThrowExpressionElements getXThrowExpressionAccess() {
		return gaXbase.getXThrowExpressionAccess();
	}
	
	public ParserRule getXThrowExpressionRule() {
		return getXThrowExpressionAccess().getRule();
	}

	//XReturnExpression returns XExpression:
	//	{XReturnExpression} "return" => expression=XExpression?;
	public XbaseGrammarAccess.XReturnExpressionElements getXReturnExpressionAccess() {
		return gaXbase.getXReturnExpressionAccess();
	}
	
	public ParserRule getXReturnExpressionRule() {
		return getXReturnExpressionAccess().getRule();
	}

	//XTryCatchFinallyExpression returns XExpression:
	//	{XTryCatchFinallyExpression} "try" expression=XExpression (catchClauses+=XCatchClause+ ("finally"
	//	finallyExpression=XExpression)? | "finally" finallyExpression=XExpression);
	public XbaseGrammarAccess.XTryCatchFinallyExpressionElements getXTryCatchFinallyExpressionAccess() {
		return gaXbase.getXTryCatchFinallyExpressionAccess();
	}
	
	public ParserRule getXTryCatchFinallyExpressionRule() {
		return getXTryCatchFinallyExpressionAccess().getRule();
	}

	//XCatchClause:
	//	"catch" "(" declaredParam=JvmFormalParameter ")" expression=XExpression;
	public XbaseGrammarAccess.XCatchClauseElements getXCatchClauseAccess() {
		return gaXbase.getXCatchClauseAccess();
	}
	
	public ParserRule getXCatchClauseRule() {
		return getXCatchClauseAccess().getRule();
	}

	//QualifiedName:
	//	ID ("." ID)*;
	public XbaseGrammarAccess.QualifiedNameElements getQualifiedNameAccess() {
		return gaXbase.getQualifiedNameAccess();
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//JvmTypeReference returns JvmParameterizedTypeReference:
	//	JvmParameterizedTypeReference | XFunctionTypeRef;
	public XtypeGrammarAccess.JvmTypeReferenceElements getJvmTypeReferenceAccess() {
		return gaXbase.getJvmTypeReferenceAccess();
	}
	
	public ParserRule getJvmTypeReferenceRule() {
		return getJvmTypeReferenceAccess().getRule();
	}

	//XFunctionTypeRef:
	//	("(" paramTypes+=JvmTypeReference ("," paramTypes+=JvmTypeReference)* ")")? "=>" returnType=JvmTypeReference;
	public XtypeGrammarAccess.XFunctionTypeRefElements getXFunctionTypeRefAccess() {
		return gaXbase.getXFunctionTypeRefAccess();
	}
	
	public ParserRule getXFunctionTypeRefRule() {
		return getXFunctionTypeRefAccess().getRule();
	}

	//JvmParameterizedTypeReference:
	//	type=[JvmType|QualifiedName] ("<" arguments+=JvmArgumentTypeReference ("," arguments+=JvmArgumentTypeReference)*
	//	">")?;
	public XtypeGrammarAccess.JvmParameterizedTypeReferenceElements getJvmParameterizedTypeReferenceAccess() {
		return gaXbase.getJvmParameterizedTypeReferenceAccess();
	}
	
	public ParserRule getJvmParameterizedTypeReferenceRule() {
		return getJvmParameterizedTypeReferenceAccess().getRule();
	}

	//JvmArgumentTypeReference returns JvmTypeReference:
	//	JvmTypeReference | JvmWildcardTypeReference;
	public XtypeGrammarAccess.JvmArgumentTypeReferenceElements getJvmArgumentTypeReferenceAccess() {
		return gaXbase.getJvmArgumentTypeReferenceAccess();
	}
	
	public ParserRule getJvmArgumentTypeReferenceRule() {
		return getJvmArgumentTypeReferenceAccess().getRule();
	}

	//JvmWildcardTypeReference:
	//	{JvmWildcardTypeReference} "?" (constraints+=JvmUpperBound | constraints+=JvmLowerBound)?;
	public XtypeGrammarAccess.JvmWildcardTypeReferenceElements getJvmWildcardTypeReferenceAccess() {
		return gaXbase.getJvmWildcardTypeReferenceAccess();
	}
	
	public ParserRule getJvmWildcardTypeReferenceRule() {
		return getJvmWildcardTypeReferenceAccess().getRule();
	}

	//JvmUpperBound:
	//	"extends" typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmUpperBoundElements getJvmUpperBoundAccess() {
		return gaXbase.getJvmUpperBoundAccess();
	}
	
	public ParserRule getJvmUpperBoundRule() {
		return getJvmUpperBoundAccess().getRule();
	}

	//JvmUpperBoundAnded returns JvmUpperBound:
	//	"&" typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmUpperBoundAndedElements getJvmUpperBoundAndedAccess() {
		return gaXbase.getJvmUpperBoundAndedAccess();
	}
	
	public ParserRule getJvmUpperBoundAndedRule() {
		return getJvmUpperBoundAndedAccess().getRule();
	}

	//JvmLowerBound:
	//	"super" typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmLowerBoundElements getJvmLowerBoundAccess() {
		return gaXbase.getJvmLowerBoundAccess();
	}
	
	public ParserRule getJvmLowerBoundRule() {
		return getJvmLowerBoundAccess().getRule();
	}

	//JvmTypeParameter:
	//	name=ID (constraints+=JvmUpperBound constraints+=JvmUpperBoundAnded* | constraints+=JvmLowerBound)?;
	public XtypeGrammarAccess.JvmTypeParameterElements getJvmTypeParameterAccess() {
		return gaXbase.getJvmTypeParameterAccess();
	}
	
	public ParserRule getJvmTypeParameterRule() {
		return getJvmTypeParameterAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaXbase.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaXbase.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaXbase.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaXbase.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaXbase.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaXbase.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaXbase.getANY_OTHERRule();
	} 
}

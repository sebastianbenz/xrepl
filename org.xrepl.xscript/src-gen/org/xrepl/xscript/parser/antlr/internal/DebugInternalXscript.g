/*
* generated by Xtext
*/
grammar DebugInternalXscript ;

// Rule XScript
ruleXScript :
	(
		ruleXExpression |
		ruleXScriptExpression |
		ruleXVariableDeclaration
	)*
;

// Rule XScriptExpression
ruleXScriptExpression :
	ruleXImport |
	ruleXEPackageImport
;

// Rule XPrimaryExpression
ruleXPrimaryExpression :
	ruleXConstructorCall |
	ruleXBlockExpression |
	ruleXSwitchExpression |
	ruleXFeatureCall |
	ruleXLiteral |
	ruleXIfExpression |
	ruleXForLoopExpression |
	ruleXWhileExpression |
	ruleXDoWhileExpression |
	ruleXThrowExpression |
	ruleXReturnExpression |
	ruleXTryCatchFinallyExpression |
	ruleXParenthesizedExpression |
	ruleXNewEObject
;

// Rule XNewEObject
ruleXNewEObject :
	'create' RULE_ID
;

// Rule QualifiedNameWithWildCard
ruleQualifiedNameWithWildCard :
	ruleQualifiedName (
		'.' '*'
	)?
;

// Rule XImport
ruleXImport :
	'import' (
		'static' 'extension'?
	)? ruleQualifiedNameWithWildCard
;

// Rule XEPackageImport
ruleXEPackageImport :
	'import' RULE_STRING (
		'as' RULE_ID
	)?
;

// Rule XExpression
ruleXExpression :
	ruleXAssignment
;

// Rule XAssignment
ruleXAssignment :
	RULE_ID ruleOpSingleAssign ruleXAssignment |
	ruleXOrExpression (
		( (
		ruleOpMultiAssign
		) => ruleOpMultiAssign ) ruleXAssignment
	)?
;

// Rule OpSingleAssign
ruleOpSingleAssign :
	'='
;

// Rule OpMultiAssign
ruleOpMultiAssign :
	'+='
;

// Rule XOrExpression
ruleXOrExpression :
	ruleXAndExpression (
		( (
		ruleOpOr
		) => ruleOpOr ) ruleXAndExpression
	)*
;

// Rule OpOr
ruleOpOr :
	'||'
;

// Rule XAndExpression
ruleXAndExpression :
	ruleXEqualityExpression (
		( (
		ruleOpAnd
		) => ruleOpAnd ) ruleXEqualityExpression
	)*
;

// Rule OpAnd
ruleOpAnd :
	'&&'
;

// Rule XEqualityExpression
ruleXEqualityExpression :
	ruleXRelationalExpression (
		( (
		ruleOpEquality
		) => ruleOpEquality ) ruleXRelationalExpression
	)*
;

// Rule OpEquality
ruleOpEquality :
	'==' |
	'!='
;

// Rule XRelationalExpression
ruleXRelationalExpression :
	ruleXOtherOperatorExpression (
		( (
		'instanceof'
		) => 'instanceof' ) ruleQualifiedName |
		( (
		ruleOpCompare
		) => ruleOpCompare ) ruleXOtherOperatorExpression
	)*
;

// Rule OpCompare
ruleOpCompare :
	'>=' |
	'<=' |
	'>' |
	'<'
;

// Rule XOtherOperatorExpression
ruleXOtherOperatorExpression :
	ruleXAdditiveExpression (
		( (
		ruleOpOther
		) => ruleOpOther ) ruleXAdditiveExpression
	)*
;

// Rule OpOther
ruleOpOther :
	'->' |
	'..'
;

// Rule XAdditiveExpression
ruleXAdditiveExpression :
	ruleXMultiplicativeExpression (
		( (
		ruleOpAdd
		) => ruleOpAdd ) ruleXMultiplicativeExpression
	)*
;

// Rule OpAdd
ruleOpAdd :
	'+' |
	'-'
;

// Rule XMultiplicativeExpression
ruleXMultiplicativeExpression :
	ruleXUnaryOperation (
		( (
		ruleOpMulti
		) => ruleOpMulti ) ruleXUnaryOperation
	)*
;

// Rule OpMulti
ruleOpMulti :
	'*' |
	'**' |
	'/' |
	'%'
;

// Rule XUnaryOperation
ruleXUnaryOperation :
	ruleOpUnary ruleXCastedExpression |
	ruleXCastedExpression
;

// Rule OpUnary
ruleOpUnary :
	'!' |
	'-' |
	'+'
;

// Rule XCastedExpression
ruleXCastedExpression :
	ruleXMemberFeatureCall (
		( (
		'as'
		) => 'as' ) ruleJvmTypeReference
	)*
;

// Rule XMemberFeatureCall
ruleXMemberFeatureCall :
	ruleXPrimaryExpression (
		( (
		'.' RULE_ID ruleOpSingleAssign
		) => (
			'.' RULE_ID ruleOpSingleAssign
		) ) ruleXAssignment |
		( (
		'.' |
		'?.' |
		'*.'
		) => (
			'.' |
			'?.' |
			'*.'
		) ) (
			'<' ruleJvmArgumentTypeReference (
				',' ruleJvmArgumentTypeReference
			)* '>'
		)? RULE_ID (
			( (
			'('
			) => '(' ) (
				( (
				(
					ruleJvmFormalParameter (
						',' ruleJvmFormalParameter
					)*
				)? '|'
				) => ruleXShortClosure ) |
				ruleXExpression (
					',' ruleXExpression
				)*
			)? ')'
		)?
	)*
;

// Rule XLiteral
ruleXLiteral :
	ruleXClosure |
	ruleXBooleanLiteral |
	ruleXIntLiteral |
	ruleXNullLiteral |
	ruleXStringLiteral |
	ruleXTypeLiteral
;

// Rule XClosure
ruleXClosure :
	'[' (
		ruleJvmFormalParameter (
			',' ruleJvmFormalParameter
		)*
	)? '|' ruleXExpression ']'
;

// Rule XShortClosure
ruleXShortClosure :
	( (
	(
		ruleJvmFormalParameter (
			',' ruleJvmFormalParameter
		)*
	)? '|'
	) => (
		(
			ruleJvmFormalParameter (
				',' ruleJvmFormalParameter
			)*
		)? '|'
	) ) ruleXExpression
;

// Rule XParenthesizedExpression
ruleXParenthesizedExpression :
	'(' ruleXExpression ')'
;

// Rule XIfExpression
ruleXIfExpression :
	'if' '(' ruleXExpression ')' ruleXExpression (
		( (
		'else'
		) => 'else' ) ruleXExpression
	)?
;

// Rule XSwitchExpression
ruleXSwitchExpression :
	'switch' (
		RULE_ID ':'
	)? ruleXExpression '{' ruleXCasePart+ (
		'default' ':' ruleXExpression
	)? '}'
;

// Rule XCasePart
ruleXCasePart :
	ruleJvmTypeReference? (
		'case' ruleXExpression
	)? ':' ruleXExpression
;

// Rule XForLoopExpression
ruleXForLoopExpression :
	'for' '(' ruleJvmFormalParameter ':' ruleXExpression ')' ruleXExpression
;

// Rule XWhileExpression
ruleXWhileExpression :
	'while' '(' ruleXExpression ')' ruleXExpression
;

// Rule XDoWhileExpression
ruleXDoWhileExpression :
	'do' ruleXExpression 'while' '(' ruleXExpression ')'
;

// Rule XBlockExpression
ruleXBlockExpression :
	'{' (
		ruleXExpressionInsideBlock ';'?
	)* '}'
;

// Rule XExpressionInsideBlock
ruleXExpressionInsideBlock :
	ruleXVariableDeclaration |
	ruleXExpression
;

// Rule XVariableDeclaration
ruleXVariableDeclaration :
	(
		'var' |
		'val'
	) (
		( (
		ruleJvmTypeReference RULE_ID
		) => (
			ruleJvmTypeReference RULE_ID
		) ) |
		RULE_ID
	) (
		'=' ruleXExpression
	)?
;

// Rule JvmFormalParameter
ruleJvmFormalParameter :
	ruleJvmTypeReference? RULE_ID
;

// Rule XFeatureCall
ruleXFeatureCall :
	(
		'<' ruleJvmArgumentTypeReference (
			',' ruleJvmArgumentTypeReference
		)* '>'
	)? RULE_ID (
		( (
		'('
		) => '(' ) (
			( (
			(
				ruleJvmFormalParameter (
					',' ruleJvmFormalParameter
				)*
			)? '|'
			) => ruleXShortClosure ) |
			ruleXExpression (
				',' ruleXExpression
			)*
		)? ')'
	)?
;

// Rule XConstructorCall
ruleXConstructorCall :
	'new' ruleQualifiedName (
		'<' ruleJvmArgumentTypeReference (
			',' ruleJvmArgumentTypeReference
		)* '>'
	)? '(' (
		( (
		(
			ruleJvmFormalParameter (
				',' ruleJvmFormalParameter
			)*
		)? '|'
		) => ruleXShortClosure ) |
		ruleXExpression (
			',' ruleXExpression
		)*
	)? ')'
;

// Rule XBooleanLiteral
ruleXBooleanLiteral :
	'false' |
	'true'
;

// Rule XNullLiteral
ruleXNullLiteral :
	'null'
;

// Rule XIntLiteral
ruleXIntLiteral :
	RULE_INT
;

// Rule XStringLiteral
ruleXStringLiteral :
	RULE_STRING
;

// Rule XTypeLiteral
ruleXTypeLiteral :
	'typeof' '(' ruleQualifiedName ')'
;

// Rule XThrowExpression
ruleXThrowExpression :
	'throw' ruleXExpression
;

// Rule XReturnExpression
ruleXReturnExpression :
	'return' ( (
	ruleXExpression
	) => ruleXExpression )?
;

// Rule XTryCatchFinallyExpression
ruleXTryCatchFinallyExpression :
	'try' ruleXExpression (
		( (
		'catch'
		) => ruleXCatchClause )+ (
			( (
			'finally'
			) => 'finally' ) ruleXExpression
		)? |
		'finally' ruleXExpression
	)
;

// Rule XCatchClause
ruleXCatchClause :
	( (
	'catch'
	) => 'catch' ) '(' ruleJvmFormalParameter ')' ruleXExpression
;

// Rule QualifiedName
ruleQualifiedName :
	RULE_ID (
		( (
		'.'
		) => '.' ) RULE_ID
	)*
;

// Rule JvmTypeReference
ruleJvmTypeReference :
	ruleJvmParameterizedTypeReference |
	ruleXFunctionTypeRef
;

// Rule XFunctionTypeRef
ruleXFunctionTypeRef :
	(
		'(' ruleJvmTypeReference (
			',' ruleJvmTypeReference
		)* ')'
	)? '=>' ruleJvmTypeReference
;

// Rule JvmParameterizedTypeReference
ruleJvmParameterizedTypeReference :
	ruleQualifiedName (
		( (
		'<'
		) => '<' ) ruleJvmArgumentTypeReference (
			',' ruleJvmArgumentTypeReference
		)* '>'
	)?
;

// Rule JvmArgumentTypeReference
ruleJvmArgumentTypeReference :
	ruleJvmTypeReference |
	ruleJvmWildcardTypeReference
;

// Rule JvmWildcardTypeReference
ruleJvmWildcardTypeReference :
	'?' (
		ruleJvmUpperBound |
		ruleJvmLowerBound
	)?
;

// Rule JvmUpperBound
ruleJvmUpperBound :
	'extends' ruleJvmTypeReference
;

// Rule JvmUpperBoundAnded
ruleJvmUpperBoundAnded :
	'&' ruleJvmTypeReference
;

// Rule JvmLowerBound
ruleJvmLowerBound :
	'super' ruleJvmTypeReference
;

RULE_ID :
	'^'? (
		'a' .. 'z' |
		'A' .. 'Z' |
		'_'
	) (
		'a' .. 'z' |
		'A' .. 'Z' |
		'_' |
		'0' .. '9'
	)*
;

RULE_INT :
	'0' .. '9'+
;

RULE_STRING :
	'"' (
		'\\' (
			'b' |
			't' |
			'n' |
			'f' |
			'r' |
			'u' |
			'"' |
			'\'' |
			'\\'
		) |
		~ (
			'\\' |
			'"'
		)
	)* '"' |
	'\'' (
		'\\' (
			'b' |
			't' |
			'n' |
			'f' |
			'r' |
			'u' |
			'"' |
			'\'' |
			'\\'
		) |
		~ (
			'\\' |
			'\''
		)
	)* '\''
;

RULE_ML_COMMENT :
	'/*' (
		options { greedy = false ; } : .
	)* '*/' {skip();}
;

RULE_SL_COMMENT :
	'//' ~ (
		'\n' |
		'\r'
	)* (
		'\r'? '\n'
	)? {skip();}
;

RULE_WS :
	(
		' ' |
		'\t' |
		'\r' |
		'\n'
	)+ {skip();}
;

RULE_ANY_OTHER :
	.
;
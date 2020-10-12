grammar InternalNabla;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package fr.cea.nabla.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package fr.cea.nabla.ide.contentassist.antlr.internal;

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
import fr.cea.nabla.services.NablaGrammarAccess;

}
@parser::members {
	private NablaGrammarAccess grammarAccess;

	public void setGrammarAccess(NablaGrammarAccess grammarAccess) {
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
}

// Entry rule entryRuleNablaModule
entryRuleNablaModule
:
{ before(grammarAccess.getNablaModuleRule()); }
	 ruleNablaModule
{ after(grammarAccess.getNablaModuleRule()); } 
	 EOF 
;

// Rule NablaModule
ruleNablaModule 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNablaModuleAccess().getGroup()); }
		(rule__NablaModule__Group__0)
		{ after(grammarAccess.getNablaModuleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleImport
entryRuleImport
:
{ before(grammarAccess.getImportRule()); }
	 ruleImport
{ after(grammarAccess.getImportRule()); } 
	 EOF 
;

// Rule Import
ruleImport 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getImportAccess().getGroup()); }
		(rule__Import__Group__0)
		{ after(grammarAccess.getImportAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDeclarationBlock
entryRuleDeclarationBlock
:
{ before(grammarAccess.getDeclarationBlockRule()); }
	 ruleDeclarationBlock
{ after(grammarAccess.getDeclarationBlockRule()); } 
	 EOF 
;

// Rule DeclarationBlock
ruleDeclarationBlock 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDeclarationBlockAccess().getAlternatives()); }
		(rule__DeclarationBlock__Alternatives)
		{ after(grammarAccess.getDeclarationBlockAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleJob
entryRuleJob
:
{ before(grammarAccess.getJobRule()); }
	 ruleJob
{ after(grammarAccess.getJobRule()); } 
	 EOF 
;

// Rule Job
ruleJob 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getJobAccess().getAlternatives()); }
		(rule__Job__Alternatives)
		{ after(grammarAccess.getJobAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInstruction
entryRuleInstruction
:
{ before(grammarAccess.getInstructionRule()); }
	 ruleInstruction
{ after(grammarAccess.getInstructionRule()); } 
	 EOF 
;

// Rule Instruction
ruleInstruction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInstructionAccess().getAlternatives()); }
		(rule__Instruction__Alternatives)
		{ after(grammarAccess.getInstructionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTimeIterator
entryRuleTimeIterator
:
{ before(grammarAccess.getTimeIteratorRule()); }
	 ruleTimeIterator
{ after(grammarAccess.getTimeIteratorRule()); } 
	 EOF 
;

// Rule TimeIterator
ruleTimeIterator 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTimeIteratorAccess().getGroup()); }
		(rule__TimeIterator__Group__0)
		{ after(grammarAccess.getTimeIteratorAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSpaceIterator
entryRuleSpaceIterator
:
{ before(grammarAccess.getSpaceIteratorRule()); }
	 ruleSpaceIterator
{ after(grammarAccess.getSpaceIteratorRule()); } 
	 EOF 
;

// Rule SpaceIterator
ruleSpaceIterator 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSpaceIteratorAccess().getGroup()); }
		(rule__SpaceIterator__Group__0)
		{ after(grammarAccess.getSpaceIteratorAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSpaceIteratorRange
entryRuleSpaceIteratorRange
:
{ before(grammarAccess.getSpaceIteratorRangeRule()); }
	 ruleSpaceIteratorRange
{ after(grammarAccess.getSpaceIteratorRangeRule()); } 
	 EOF 
;

// Rule SpaceIteratorRange
ruleSpaceIteratorRange 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSpaceIteratorRangeAccess().getGroup()); }
		(rule__SpaceIteratorRange__Group__0)
		{ after(grammarAccess.getSpaceIteratorRangeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSpaceIteratorRef
entryRuleSpaceIteratorRef
:
{ before(grammarAccess.getSpaceIteratorRefRule()); }
	 ruleSpaceIteratorRef
{ after(grammarAccess.getSpaceIteratorRefRule()); } 
	 EOF 
;

// Rule SpaceIteratorRef
ruleSpaceIteratorRef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSpaceIteratorRefAccess().getAlternatives()); }
		(rule__SpaceIteratorRef__Alternatives)
		{ after(grammarAccess.getSpaceIteratorRefAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleScalarVarDefinition
entryRuleScalarVarDefinition
:
{ before(grammarAccess.getScalarVarDefinitionRule()); }
	 ruleScalarVarDefinition
{ after(grammarAccess.getScalarVarDefinitionRule()); } 
	 EOF 
;

// Rule ScalarVarDefinition
ruleScalarVarDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScalarVarDefinitionAccess().getGroup()); }
		(rule__ScalarVarDefinition__Group__0)
		{ after(grammarAccess.getScalarVarDefinitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVarGroupDeclaration
entryRuleVarGroupDeclaration
:
{ before(grammarAccess.getVarGroupDeclarationRule()); }
	 ruleVarGroupDeclaration
{ after(grammarAccess.getVarGroupDeclarationRule()); } 
	 EOF 
;

// Rule VarGroupDeclaration
ruleVarGroupDeclaration 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVarGroupDeclarationAccess().getGroup()); }
		(rule__VarGroupDeclaration__Group__0)
		{ after(grammarAccess.getVarGroupDeclarationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVar
entryRuleVar
:
{ before(grammarAccess.getVarRule()); }
	 ruleVar
{ after(grammarAccess.getVarRule()); } 
	 EOF 
;

// Rule Var
ruleVar 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVarAccess().getAlternatives()); }
		(rule__Var__Alternatives)
		{ after(grammarAccess.getVarAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleScalarVar
entryRuleScalarVar
:
{ before(grammarAccess.getScalarVarRule()); }
	 ruleScalarVar
{ after(grammarAccess.getScalarVarRule()); } 
	 EOF 
;

// Rule ScalarVar
ruleScalarVar 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScalarVarAccess().getNameAssignment()); }
		(rule__ScalarVar__NameAssignment)
		{ after(grammarAccess.getScalarVarAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleArrayVar
entryRuleArrayVar
:
{ before(grammarAccess.getArrayVarRule()); }
	 ruleArrayVar
{ after(grammarAccess.getArrayVarRule()); } 
	 EOF 
;

// Rule ArrayVar
ruleArrayVar 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getArrayVarAccess().getGroup()); }
		(rule__ArrayVar__Group__0)
		{ after(grammarAccess.getArrayVarAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConnectivity
entryRuleConnectivity
:
{ before(grammarAccess.getConnectivityRule()); }
	 ruleConnectivity
{ after(grammarAccess.getConnectivityRule()); } 
	 EOF 
;

// Rule Connectivity
ruleConnectivity 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConnectivityAccess().getGroup()); }
		(rule__Connectivity__Group__0)
		{ after(grammarAccess.getConnectivityAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleItemArgType
entryRuleItemArgType
:
{ before(grammarAccess.getItemArgTypeRule()); }
	 ruleItemArgType
{ after(grammarAccess.getItemArgTypeRule()); } 
	 EOF 
;

// Rule ItemArgType
ruleItemArgType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getItemArgTypeAccess().getAlternatives()); }
		(rule__ItemArgType__Alternatives)
		{ after(grammarAccess.getItemArgTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFunction
entryRuleFunction
:
{ before(grammarAccess.getFunctionRule()); }
	 ruleFunction
{ after(grammarAccess.getFunctionRule()); } 
	 EOF 
;

// Rule Function
ruleFunction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFunctionAccess().getGroup()); }
		(rule__Function__Group__0)
		{ after(grammarAccess.getFunctionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFunctionArg
entryRuleFunctionArg
:
{ before(grammarAccess.getFunctionArgRule()); }
	 ruleFunctionArg
{ after(grammarAccess.getFunctionArgRule()); } 
	 EOF 
;

// Rule FunctionArg
ruleFunctionArg 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFunctionArgAccess().getGroup()); }
		(rule__FunctionArg__Group__0)
		{ after(grammarAccess.getFunctionArgAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleReduction
entryRuleReduction
:
{ before(grammarAccess.getReductionRule()); }
	 ruleReduction
{ after(grammarAccess.getReductionRule()); } 
	 EOF 
;

// Rule Reduction
ruleReduction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getReductionAccess().getGroup()); }
		(rule__Reduction__Group__0)
		{ after(grammarAccess.getReductionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleReductionArg
entryRuleReductionArg
:
{ before(grammarAccess.getReductionArgRule()); }
	 ruleReductionArg
{ after(grammarAccess.getReductionArgRule()); } 
	 EOF 
;

// Rule ReductionArg
ruleReductionArg 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getReductionArgAccess().getGroup()); }
		(rule__ReductionArg__Group__0)
		{ after(grammarAccess.getReductionArgAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExpression
entryRuleExpression
:
{ before(grammarAccess.getExpressionRule()); }
	 ruleExpression
{ after(grammarAccess.getExpressionRule()); } 
	 EOF 
;

// Rule Expression
ruleExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpressionAccess().getOrParserRuleCall()); }
		ruleOr
		{ after(grammarAccess.getExpressionAccess().getOrParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOr
entryRuleOr
:
{ before(grammarAccess.getOrRule()); }
	 ruleOr
{ after(grammarAccess.getOrRule()); } 
	 EOF 
;

// Rule Or
ruleOr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOrAccess().getGroup()); }
		(rule__Or__Group__0)
		{ after(grammarAccess.getOrAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAnd
entryRuleAnd
:
{ before(grammarAccess.getAndRule()); }
	 ruleAnd
{ after(grammarAccess.getAndRule()); } 
	 EOF 
;

// Rule And
ruleAnd 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAndAccess().getGroup()); }
		(rule__And__Group__0)
		{ after(grammarAccess.getAndAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEquality
entryRuleEquality
:
{ before(grammarAccess.getEqualityRule()); }
	 ruleEquality
{ after(grammarAccess.getEqualityRule()); } 
	 EOF 
;

// Rule Equality
ruleEquality 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEqualityAccess().getGroup()); }
		(rule__Equality__Group__0)
		{ after(grammarAccess.getEqualityAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComparison
entryRuleComparison
:
{ before(grammarAccess.getComparisonRule()); }
	 ruleComparison
{ after(grammarAccess.getComparisonRule()); } 
	 EOF 
;

// Rule Comparison
ruleComparison 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComparisonAccess().getGroup()); }
		(rule__Comparison__Group__0)
		{ after(grammarAccess.getComparisonAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePlusOrMinus
entryRulePlusOrMinus
:
{ before(grammarAccess.getPlusOrMinusRule()); }
	 rulePlusOrMinus
{ after(grammarAccess.getPlusOrMinusRule()); } 
	 EOF 
;

// Rule PlusOrMinus
rulePlusOrMinus 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPlusOrMinusAccess().getGroup()); }
		(rule__PlusOrMinus__Group__0)
		{ after(grammarAccess.getPlusOrMinusAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMulOrDiv
entryRuleMulOrDiv
:
{ before(grammarAccess.getMulOrDivRule()); }
	 ruleMulOrDiv
{ after(grammarAccess.getMulOrDivRule()); } 
	 EOF 
;

// Rule MulOrDiv
ruleMulOrDiv 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMulOrDivAccess().getGroup()); }
		(rule__MulOrDiv__Group__0)
		{ after(grammarAccess.getMulOrDivAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePrimary
entryRulePrimary
:
{ before(grammarAccess.getPrimaryRule()); }
	 rulePrimary
{ after(grammarAccess.getPrimaryRule()); } 
	 EOF 
;

// Rule Primary
rulePrimary 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPrimaryAccess().getAlternatives()); }
		(rule__Primary__Alternatives)
		{ after(grammarAccess.getPrimaryAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAtomic
entryRuleAtomic
:
{ before(grammarAccess.getAtomicRule()); }
	 ruleAtomic
{ after(grammarAccess.getAtomicRule()); } 
	 EOF 
;

// Rule Atomic
ruleAtomic 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAtomicAccess().getAlternatives()); }
		(rule__Atomic__Alternatives)
		{ after(grammarAccess.getAtomicAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleReal2Constant
entryRuleReal2Constant
:
{ before(grammarAccess.getReal2ConstantRule()); }
	 ruleReal2Constant
{ after(grammarAccess.getReal2ConstantRule()); } 
	 EOF 
;

// Rule Real2Constant
ruleReal2Constant 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getReal2ConstantAccess().getGroup()); }
		(rule__Real2Constant__Group__0)
		{ after(grammarAccess.getReal2ConstantAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleReal3Constant
entryRuleReal3Constant
:
{ before(grammarAccess.getReal3ConstantRule()); }
	 ruleReal3Constant
{ after(grammarAccess.getReal3ConstantRule()); } 
	 EOF 
;

// Rule Real3Constant
ruleReal3Constant 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getReal3ConstantAccess().getGroup()); }
		(rule__Real3Constant__Group__0)
		{ after(grammarAccess.getReal3ConstantAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVarRef
entryRuleVarRef
:
{ before(grammarAccess.getVarRefRule()); }
	 ruleVarRef
{ after(grammarAccess.getVarRefRule()); } 
	 EOF 
;

// Rule VarRef
ruleVarRef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVarRefAccess().getGroup()); }
		(rule__VarRef__Group__0)
		{ after(grammarAccess.getVarRefAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIteratorRangeOrRef
entryRuleIteratorRangeOrRef
:
{ before(grammarAccess.getIteratorRangeOrRefRule()); }
	 ruleIteratorRangeOrRef
{ after(grammarAccess.getIteratorRangeOrRefRule()); } 
	 EOF 
;

// Rule IteratorRangeOrRef
ruleIteratorRangeOrRef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIteratorRangeOrRefAccess().getAlternatives()); }
		(rule__IteratorRangeOrRef__Alternatives)
		{ after(grammarAccess.getIteratorRangeOrRefAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTimeIteratorRef
entryRuleTimeIteratorRef
:
{ before(grammarAccess.getTimeIteratorRefRule()); }
	 ruleTimeIteratorRef
{ after(grammarAccess.getTimeIteratorRefRule()); } 
	 EOF 
;

// Rule TimeIteratorRef
ruleTimeIteratorRef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTimeIteratorRefAccess().getGroup()); }
		(rule__TimeIteratorRef__Group__0)
		{ after(grammarAccess.getTimeIteratorRefAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedNameAccess().getGroup()); }
		(rule__QualifiedName__Group__0)
		{ after(grammarAccess.getQualifiedNameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedNameWithWildcard
entryRuleQualifiedNameWithWildcard
:
{ before(grammarAccess.getQualifiedNameWithWildcardRule()); }
	 ruleQualifiedNameWithWildcard
{ after(grammarAccess.getQualifiedNameWithWildcardRule()); } 
	 EOF 
;

// Rule QualifiedNameWithWildcard
ruleQualifiedNameWithWildcard 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); }
		(rule__QualifiedNameWithWildcard__Group__0)
		{ after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule BasicType
ruleBasicType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBasicTypeAccess().getAlternatives()); }
		(rule__BasicType__Alternatives)
		{ after(grammarAccess.getBasicTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule ItemType
ruleItemType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getItemTypeAccess().getAlternatives()); }
		(rule__ItemType__Alternatives)
		{ after(grammarAccess.getItemTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NablaModule__VariablesAlternatives_5_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNablaModuleAccess().getVariablesScalarVarDefinitionParserRuleCall_5_0_0()); }
		ruleScalarVarDefinition
		{ after(grammarAccess.getNablaModuleAccess().getVariablesScalarVarDefinitionParserRuleCall_5_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getNablaModuleAccess().getVariablesVarGroupDeclarationParserRuleCall_5_0_1()); }
		ruleVarGroupDeclaration
		{ after(grammarAccess.getNablaModuleAccess().getVariablesVarGroupDeclarationParserRuleCall_5_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclarationBlock__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDeclarationBlockAccess().getGroup_0()); }
		(rule__DeclarationBlock__Group_0__0)
		{ after(grammarAccess.getDeclarationBlockAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getDeclarationBlockAccess().getGroup_1()); }
		(rule__DeclarationBlock__Group_1__0)
		{ after(grammarAccess.getDeclarationBlockAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclarationBlock__FunctionsAlternatives_1_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDeclarationBlockAccess().getFunctionsFunctionParserRuleCall_1_3_0_0()); }
		ruleFunction
		{ after(grammarAccess.getDeclarationBlockAccess().getFunctionsFunctionParserRuleCall_1_3_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getDeclarationBlockAccess().getFunctionsReductionParserRuleCall_1_3_0_1()); }
		ruleReduction
		{ after(grammarAccess.getDeclarationBlockAccess().getFunctionsReductionParserRuleCall_1_3_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Job__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJobAccess().getGroup_0()); }
		(rule__Job__Group_0__0)
		{ after(grammarAccess.getJobAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getJobAccess().getGroup_1()); }
		(rule__Job__Group_1__0)
		{ after(grammarAccess.getJobAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstructionAccess().getScalarVarDefinitionParserRuleCall_0()); }
		ruleScalarVarDefinition
		{ after(grammarAccess.getInstructionAccess().getScalarVarDefinitionParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getInstructionAccess().getVarGroupDeclarationParserRuleCall_1()); }
		ruleVarGroupDeclaration
		{ after(grammarAccess.getInstructionAccess().getVarGroupDeclarationParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getInstructionAccess().getGroup_2()); }
		(rule__Instruction__Group_2__0)
		{ after(grammarAccess.getInstructionAccess().getGroup_2()); }
	)
	|
	(
		{ before(grammarAccess.getInstructionAccess().getGroup_3()); }
		(rule__Instruction__Group_3__0)
		{ after(grammarAccess.getInstructionAccess().getGroup_3()); }
	)
	|
	(
		{ before(grammarAccess.getInstructionAccess().getGroup_4()); }
		(rule__Instruction__Group_4__0)
		{ after(grammarAccess.getInstructionAccess().getGroup_4()); }
	)
	|
	(
		{ before(grammarAccess.getInstructionAccess().getGroup_5()); }
		(rule__Instruction__Group_5__0)
		{ after(grammarAccess.getInstructionAccess().getGroup_5()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIteratorRef__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpaceIteratorRefAccess().getGroup_0()); }
		(rule__SpaceIteratorRef__Group_0__0)
		{ after(grammarAccess.getSpaceIteratorRefAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getSpaceIteratorRefAccess().getIteratorAssignment_1()); }
		(rule__SpaceIteratorRef__IteratorAssignment_1)
		{ after(grammarAccess.getSpaceIteratorRefAccess().getIteratorAssignment_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIteratorRef__Alternatives_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpaceIteratorRefAccess().getPrevAssignment_0_0_0()); }
		(rule__SpaceIteratorRef__PrevAssignment_0_0_0)
		{ after(grammarAccess.getSpaceIteratorRefAccess().getPrevAssignment_0_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getSpaceIteratorRefAccess().getNextAssignment_0_0_1()); }
		(rule__SpaceIteratorRef__NextAssignment_0_0_1)
		{ after(grammarAccess.getSpaceIteratorRefAccess().getNextAssignment_0_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVarAccess().getScalarVarParserRuleCall_0()); }
		ruleScalarVar
		{ after(grammarAccess.getVarAccess().getScalarVarParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getVarAccess().getArrayVarParserRuleCall_1()); }
		ruleArrayVar
		{ after(grammarAccess.getVarAccess().getArrayVarParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connectivity__Alternatives_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConnectivityAccess().getGroup_3_0()); }
		(rule__Connectivity__Group_3_0__0)
		{ after(grammarAccess.getConnectivityAccess().getGroup_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getConnectivityAccess().getEmptySetKeyword_3_1()); }
		'\u2205'
		{ after(grammarAccess.getConnectivityAccess().getEmptySetKeyword_3_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ItemArgType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getItemArgTypeAccess().getGroup_0()); }
		(rule__ItemArgType__Group_0__0)
		{ after(grammarAccess.getItemArgTypeAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getItemArgTypeAccess().getTypeAssignment_1()); }
		(rule__ItemArgType__TypeAssignment_1)
		{ after(grammarAccess.getItemArgTypeAccess().getTypeAssignment_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionArg__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionArgAccess().getGroup_1_0()); }
		(rule__FunctionArg__Group_1_0__0)
		{ after(grammarAccess.getFunctionArgAccess().getGroup_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getFunctionArgAccess().getEmptySetKeyword_1_1()); }
		'\u2205'
		{ after(grammarAccess.getFunctionArgAccess().getEmptySetKeyword_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality__OpAlternatives_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); }
		'=='
		{ after(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); }
		'!='
		{ after(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparison__OpAlternatives_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); }
		'>='
		{ after(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); }
		'<='
		{ after(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); }
		'>'
		{ after(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); }
		'<'
		{ after(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Alternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); }
		(rule__PlusOrMinus__Group_1_0_0__0)
		{ after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); }
		(rule__PlusOrMinus__Group_1_0_1__0)
		{ after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__OpAlternatives_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); }
		'*'
		{ after(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1()); }
		'/'
		{ after(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryAccess().getGroup_0()); }
		(rule__Primary__Group_0__0)
		{ after(grammarAccess.getPrimaryAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryAccess().getGroup_1()); }
		(rule__Primary__Group_1__0)
		{ after(grammarAccess.getPrimaryAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryAccess().getGroup_2()); }
		(rule__Primary__Group_2__0)
		{ after(grammarAccess.getPrimaryAccess().getGroup_2()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_3()); }
		ruleAtomic
		{ after(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicAccess().getGroup_0()); }
		(rule__Atomic__Group_0__0)
		{ after(grammarAccess.getAtomicAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicAccess().getGroup_1()); }
		(rule__Atomic__Group_1__0)
		{ after(grammarAccess.getAtomicAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicAccess().getReal2ConstantParserRuleCall_2()); }
		ruleReal2Constant
		{ after(grammarAccess.getAtomicAccess().getReal2ConstantParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicAccess().getReal3ConstantParserRuleCall_3()); }
		ruleReal3Constant
		{ after(grammarAccess.getAtomicAccess().getReal3ConstantParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicAccess().getGroup_4()); }
		(rule__Atomic__Group_4__0)
		{ after(grammarAccess.getAtomicAccess().getGroup_4()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicAccess().getGroup_5()); }
		(rule__Atomic__Group_5__0)
		{ after(grammarAccess.getAtomicAccess().getGroup_5()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicAccess().getGroup_6()); }
		(rule__Atomic__Group_6__0)
		{ after(grammarAccess.getAtomicAccess().getGroup_6()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicAccess().getGroup_7()); }
		(rule__Atomic__Group_7__0)
		{ after(grammarAccess.getAtomicAccess().getGroup_7()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicAccess().getGroup_8()); }
		(rule__Atomic__Group_8__0)
		{ after(grammarAccess.getAtomicAccess().getGroup_8()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicAccess().getGroup_9()); }
		(rule__Atomic__Group_9__0)
		{ after(grammarAccess.getAtomicAccess().getGroup_9()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicAccess().getGroup_10()); }
		(rule__Atomic__Group_10__0)
		{ after(grammarAccess.getAtomicAccess().getGroup_10()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicAccess().getGroup_11()); }
		(rule__Atomic__Group_11__0)
		{ after(grammarAccess.getAtomicAccess().getGroup_11()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicAccess().getVarRefParserRuleCall_12()); }
		ruleVarRef
		{ after(grammarAccess.getAtomicAccess().getVarRefParserRuleCall_12()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Alternatives_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicAccess().getValueAssignment_4_1_0()); }
		(rule__Atomic__ValueAssignment_4_1_0)
		{ after(grammarAccess.getAtomicAccess().getValueAssignment_4_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicAccess().getFalseKeyword_4_1_1()); }
		'false'
		{ after(grammarAccess.getAtomicAccess().getFalseKeyword_4_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IteratorRangeOrRef__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIteratorRangeOrRefAccess().getSpaceIteratorRangeParserRuleCall_0()); }
		ruleSpaceIteratorRange
		{ after(grammarAccess.getIteratorRangeOrRefAccess().getSpaceIteratorRangeParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getIteratorRangeOrRefAccess().getSpaceIteratorRefParserRuleCall_1()); }
		ruleSpaceIteratorRef
		{ after(grammarAccess.getIteratorRangeOrRefAccess().getSpaceIteratorRefParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeIteratorRef__Alternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeIteratorRefAccess().getInitAssignment_1_0_0()); }
		(rule__TimeIteratorRef__InitAssignment_1_0_0)
		{ after(grammarAccess.getTimeIteratorRefAccess().getInitAssignment_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getTimeIteratorRefAccess().getNextAssignment_1_0_1()); }
		(rule__TimeIteratorRef__NextAssignment_1_0_1)
		{ after(grammarAccess.getTimeIteratorRefAccess().getNextAssignment_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BasicType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBasicTypeAccess().getIntEnumLiteralDeclaration_0()); }
		('\u2115')
		{ after(grammarAccess.getBasicTypeAccess().getIntEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getBasicTypeAccess().getRealEnumLiteralDeclaration_1()); }
		('\u211D')
		{ after(grammarAccess.getBasicTypeAccess().getRealEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getBasicTypeAccess().getReal2EnumLiteralDeclaration_2()); }
		('\u211D\u00B2')
		{ after(grammarAccess.getBasicTypeAccess().getReal2EnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getBasicTypeAccess().getReal2x2EnumLiteralDeclaration_3()); }
		('\u211D\u00B2\u02E3\u00B2')
		{ after(grammarAccess.getBasicTypeAccess().getReal2x2EnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getBasicTypeAccess().getReal3EnumLiteralDeclaration_4()); }
		('\u211D\u00B3')
		{ after(grammarAccess.getBasicTypeAccess().getReal3EnumLiteralDeclaration_4()); }
	)
	|
	(
		{ before(grammarAccess.getBasicTypeAccess().getReal3x3EnumLiteralDeclaration_5()); }
		('\u211D\u00B3\u02E3\u00B3')
		{ after(grammarAccess.getBasicTypeAccess().getReal3x3EnumLiteralDeclaration_5()); }
	)
	|
	(
		{ before(grammarAccess.getBasicTypeAccess().getBoolEnumLiteralDeclaration_6()); }
		('\u213E')
		{ after(grammarAccess.getBasicTypeAccess().getBoolEnumLiteralDeclaration_6()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ItemType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getItemTypeAccess().getNodeEnumLiteralDeclaration_0()); }
		('node')
		{ after(grammarAccess.getItemTypeAccess().getNodeEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getItemTypeAccess().getCellEnumLiteralDeclaration_1()); }
		('cell')
		{ after(grammarAccess.getItemTypeAccess().getCellEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getItemTypeAccess().getFaceEnumLiteralDeclaration_2()); }
		('face')
		{ after(grammarAccess.getItemTypeAccess().getFaceEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NablaModule__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NablaModule__Group__0__Impl
	rule__NablaModule__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NablaModule__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNablaModuleAccess().getModuleKeyword_0()); }
	'module'
	{ after(grammarAccess.getNablaModuleAccess().getModuleKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NablaModule__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NablaModule__Group__1__Impl
	rule__NablaModule__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NablaModule__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNablaModuleAccess().getNameAssignment_1()); }
	(rule__NablaModule__NameAssignment_1)
	{ after(grammarAccess.getNablaModuleAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NablaModule__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NablaModule__Group__2__Impl
	rule__NablaModule__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NablaModule__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNablaModuleAccess().getSemicolonKeyword_2()); }
	';'
	{ after(grammarAccess.getNablaModuleAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NablaModule__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NablaModule__Group__3__Impl
	rule__NablaModule__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NablaModule__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNablaModuleAccess().getImportsAssignment_3()); }
	(rule__NablaModule__ImportsAssignment_3)*
	{ after(grammarAccess.getNablaModuleAccess().getImportsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NablaModule__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NablaModule__Group__4__Impl
	rule__NablaModule__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__NablaModule__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNablaModuleAccess().getBlocksAssignment_4()); }
	(rule__NablaModule__BlocksAssignment_4)*
	{ after(grammarAccess.getNablaModuleAccess().getBlocksAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NablaModule__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NablaModule__Group__5__Impl
	rule__NablaModule__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__NablaModule__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNablaModuleAccess().getVariablesAssignment_5()); }
	(rule__NablaModule__VariablesAssignment_5)*
	{ after(grammarAccess.getNablaModuleAccess().getVariablesAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NablaModule__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NablaModule__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NablaModule__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNablaModuleAccess().getJobsAssignment_6()); }
	(rule__NablaModule__JobsAssignment_6)*
	{ after(grammarAccess.getNablaModuleAccess().getJobsAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Import__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Import__Group__0__Impl
	rule__Import__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportAccess().getWithKeyword_0()); }
	'with'
	{ after(grammarAccess.getImportAccess().getWithKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Import__Group__1__Impl
	rule__Import__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); }
	(rule__Import__ImportedNamespaceAssignment_1)
	{ after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Import__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportAccess().getSemicolonKeyword_2()); }
	';'
	{ after(grammarAccess.getImportAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DeclarationBlock__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeclarationBlock__Group_0__0__Impl
	rule__DeclarationBlock__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclarationBlock__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclarationBlockAccess().getConnectivityDeclarationBlockAction_0_0()); }
	()
	{ after(grammarAccess.getDeclarationBlockAccess().getConnectivityDeclarationBlockAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclarationBlock__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeclarationBlock__Group_0__1__Impl
	rule__DeclarationBlock__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclarationBlock__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclarationBlockAccess().getConnectivitiesKeyword_0_1()); }
	'connectivities'
	{ after(grammarAccess.getDeclarationBlockAccess().getConnectivitiesKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclarationBlock__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeclarationBlock__Group_0__2__Impl
	rule__DeclarationBlock__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclarationBlock__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclarationBlockAccess().getLeftCurlyBracketKeyword_0_2()); }
	'{'
	{ after(grammarAccess.getDeclarationBlockAccess().getLeftCurlyBracketKeyword_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclarationBlock__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeclarationBlock__Group_0__3__Impl
	rule__DeclarationBlock__Group_0__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclarationBlock__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclarationBlockAccess().getConnectivitiesAssignment_0_3()); }
	(rule__DeclarationBlock__ConnectivitiesAssignment_0_3)*
	{ after(grammarAccess.getDeclarationBlockAccess().getConnectivitiesAssignment_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclarationBlock__Group_0__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeclarationBlock__Group_0__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclarationBlock__Group_0__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclarationBlockAccess().getRightCurlyBracketKeyword_0_4()); }
	'}'
	{ after(grammarAccess.getDeclarationBlockAccess().getRightCurlyBracketKeyword_0_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DeclarationBlock__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeclarationBlock__Group_1__0__Impl
	rule__DeclarationBlock__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclarationBlock__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclarationBlockAccess().getFunctionDeclarationBlockAction_1_0()); }
	()
	{ after(grammarAccess.getDeclarationBlockAccess().getFunctionDeclarationBlockAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclarationBlock__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeclarationBlock__Group_1__1__Impl
	rule__DeclarationBlock__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclarationBlock__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclarationBlockAccess().getFunctionsKeyword_1_1()); }
	'functions'
	{ after(grammarAccess.getDeclarationBlockAccess().getFunctionsKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclarationBlock__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeclarationBlock__Group_1__2__Impl
	rule__DeclarationBlock__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclarationBlock__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclarationBlockAccess().getLeftCurlyBracketKeyword_1_2()); }
	'{'
	{ after(grammarAccess.getDeclarationBlockAccess().getLeftCurlyBracketKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclarationBlock__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeclarationBlock__Group_1__3__Impl
	rule__DeclarationBlock__Group_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclarationBlock__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclarationBlockAccess().getFunctionsAssignment_1_3()); }
	(rule__DeclarationBlock__FunctionsAssignment_1_3)*
	{ after(grammarAccess.getDeclarationBlockAccess().getFunctionsAssignment_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclarationBlock__Group_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeclarationBlock__Group_1__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclarationBlock__Group_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclarationBlockAccess().getRightCurlyBracketKeyword_1_4()); }
	'}'
	{ after(grammarAccess.getDeclarationBlockAccess().getRightCurlyBracketKeyword_1_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Job__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Job__Group_0__0__Impl
	rule__Job__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Job__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJobAccess().getInstructionJobAction_0_0()); }
	()
	{ after(grammarAccess.getJobAccess().getInstructionJobAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Job__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Job__Group_0__1__Impl
	rule__Job__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Job__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJobAccess().getNameAssignment_0_1()); }
	(rule__Job__NameAssignment_0_1)
	{ after(grammarAccess.getJobAccess().getNameAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Job__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Job__Group_0__2__Impl
	rule__Job__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Job__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJobAccess().getColonKeyword_0_2()); }
	':'
	{ after(grammarAccess.getJobAccess().getColonKeyword_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Job__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Job__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Job__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJobAccess().getInstructionAssignment_0_3()); }
	(rule__Job__InstructionAssignment_0_3)
	{ after(grammarAccess.getJobAccess().getInstructionAssignment_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Job__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Job__Group_1__0__Impl
	rule__Job__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Job__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJobAccess().getTimeLoopJobAction_1_0()); }
	()
	{ after(grammarAccess.getJobAccess().getTimeLoopJobAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Job__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Job__Group_1__1__Impl
	rule__Job__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Job__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJobAccess().getNameAssignment_1_1()); }
	(rule__Job__NameAssignment_1_1)
	{ after(grammarAccess.getJobAccess().getNameAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Job__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Job__Group_1__2__Impl
	rule__Job__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Job__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJobAccess().getColonKeyword_1_2()); }
	':'
	{ after(grammarAccess.getJobAccess().getColonKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Job__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Job__Group_1__3__Impl
	rule__Job__Group_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Job__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJobAccess().getForAllKeyword_1_3()); }
	'\u2200'
	{ after(grammarAccess.getJobAccess().getForAllKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Job__Group_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Job__Group_1__4__Impl
	rule__Job__Group_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Job__Group_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJobAccess().getIteratorAssignment_1_4()); }
	(rule__Job__IteratorAssignment_1_4)
	{ after(grammarAccess.getJobAccess().getIteratorAssignment_1_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Job__Group_1__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Job__Group_1__5__Impl
	rule__Job__Group_1__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Job__Group_1__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJobAccess().getCommaKeyword_1_5()); }
	','
	{ after(grammarAccess.getJobAccess().getCommaKeyword_1_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Job__Group_1__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Job__Group_1__6__Impl
	rule__Job__Group_1__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Job__Group_1__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJobAccess().getInitializationAssignment_1_6()); }
	(rule__Job__InitializationAssignment_1_6)
	{ after(grammarAccess.getJobAccess().getInitializationAssignment_1_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Job__Group_1__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Job__Group_1__7__Impl
	rule__Job__Group_1__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Job__Group_1__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJobAccess().getCommaKeyword_1_7()); }
	','
	{ after(grammarAccess.getJobAccess().getCommaKeyword_1_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Job__Group_1__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Job__Group_1__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Job__Group_1__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJobAccess().getBodyAssignment_1_8()); }
	(rule__Job__BodyAssignment_1_8)
	{ after(grammarAccess.getJobAccess().getBodyAssignment_1_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Instruction__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_2__0__Impl
	rule__Instruction__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getInstructionBlockAction_2_0()); }
	()
	{ after(grammarAccess.getInstructionAccess().getInstructionBlockAction_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_2__1__Impl
	rule__Instruction__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getLeftCurlyBracketKeyword_2_1()); }
	'{'
	{ after(grammarAccess.getInstructionAccess().getLeftCurlyBracketKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_2__2__Impl
	rule__Instruction__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getInstructionAccess().getInstructionsAssignment_2_2()); }
		(rule__Instruction__InstructionsAssignment_2_2)
		{ after(grammarAccess.getInstructionAccess().getInstructionsAssignment_2_2()); }
	)
	(
		{ before(grammarAccess.getInstructionAccess().getInstructionsAssignment_2_2()); }
		(rule__Instruction__InstructionsAssignment_2_2)*
		{ after(grammarAccess.getInstructionAccess().getInstructionsAssignment_2_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getRightCurlyBracketKeyword_2_3()); }
	'}'
	{ after(grammarAccess.getInstructionAccess().getRightCurlyBracketKeyword_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Instruction__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_3__0__Impl
	rule__Instruction__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getAffectationAction_3_0()); }
	()
	{ after(grammarAccess.getInstructionAccess().getAffectationAction_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_3__1__Impl
	rule__Instruction__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getVarRefAssignment_3_1()); }
	(rule__Instruction__VarRefAssignment_3_1)
	{ after(grammarAccess.getInstructionAccess().getVarRefAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_3__2__Impl
	rule__Instruction__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getEqualsSignKeyword_3_2()); }
	'='
	{ after(grammarAccess.getInstructionAccess().getEqualsSignKeyword_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_3__3__Impl
	rule__Instruction__Group_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getExpressionAssignment_3_3()); }
	(rule__Instruction__ExpressionAssignment_3_3)
	{ after(grammarAccess.getInstructionAccess().getExpressionAssignment_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_3__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_3__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_3__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getSemicolonKeyword_3_4()); }
	';'
	{ after(grammarAccess.getInstructionAccess().getSemicolonKeyword_3_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Instruction__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_4__0__Impl
	rule__Instruction__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getLoopAction_4_0()); }
	()
	{ after(grammarAccess.getInstructionAccess().getLoopAction_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_4__1__Impl
	rule__Instruction__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getForAllKeyword_4_1()); }
	'\u2200'
	{ after(grammarAccess.getInstructionAccess().getForAllKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_4__2__Impl
	rule__Instruction__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getIteratorAssignment_4_2()); }
	(rule__Instruction__IteratorAssignment_4_2)
	{ after(grammarAccess.getInstructionAccess().getIteratorAssignment_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_4__3__Impl
	rule__Instruction__Group_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getCommaKeyword_4_3()); }
	','
	{ after(grammarAccess.getInstructionAccess().getCommaKeyword_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_4__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_4__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_4__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getBodyAssignment_4_4()); }
	(rule__Instruction__BodyAssignment_4_4)
	{ after(grammarAccess.getInstructionAccess().getBodyAssignment_4_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Instruction__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_5__0__Impl
	rule__Instruction__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getIfAction_5_0()); }
	()
	{ after(grammarAccess.getInstructionAccess().getIfAction_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_5__1__Impl
	rule__Instruction__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getIfKeyword_5_1()); }
	'if'
	{ after(grammarAccess.getInstructionAccess().getIfKeyword_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_5__2__Impl
	rule__Instruction__Group_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getLeftParenthesisKeyword_5_2()); }
	'('
	{ after(grammarAccess.getInstructionAccess().getLeftParenthesisKeyword_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_5__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_5__3__Impl
	rule__Instruction__Group_5__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_5__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getConditionAssignment_5_3()); }
	(rule__Instruction__ConditionAssignment_5_3)
	{ after(grammarAccess.getInstructionAccess().getConditionAssignment_5_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_5__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_5__4__Impl
	rule__Instruction__Group_5__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_5__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getRightParenthesisKeyword_5_4()); }
	')'
	{ after(grammarAccess.getInstructionAccess().getRightParenthesisKeyword_5_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_5__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_5__5__Impl
	rule__Instruction__Group_5__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_5__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getThenAssignment_5_5()); }
	(rule__Instruction__ThenAssignment_5_5)
	{ after(grammarAccess.getInstructionAccess().getThenAssignment_5_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_5__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_5__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_5__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getGroup_5_6()); }
	(rule__Instruction__Group_5_6__0)?
	{ after(grammarAccess.getInstructionAccess().getGroup_5_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Instruction__Group_5_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_5_6__0__Impl
	rule__Instruction__Group_5_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_5_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getElseKeyword_5_6_0()); }
	('else')
	{ after(grammarAccess.getInstructionAccess().getElseKeyword_5_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_5_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_5_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_5_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getElseAssignment_5_6_1()); }
	(rule__Instruction__ElseAssignment_5_6_1)
	{ after(grammarAccess.getInstructionAccess().getElseAssignment_5_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TimeIterator__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeIterator__Group__0__Impl
	rule__TimeIterator__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeIterator__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeIteratorAccess().getNameAssignment_0()); }
	(rule__TimeIterator__NameAssignment_0)
	{ after(grammarAccess.getTimeIteratorAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeIterator__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeIterator__Group__1__Impl
	rule__TimeIterator__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeIterator__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeIteratorAccess().getElementOfKeyword_1()); }
	'\u2208'
	{ after(grammarAccess.getTimeIteratorAccess().getElementOfKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeIterator__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeIterator__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeIterator__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeIteratorAccess().getDoubleStruckCapitalNKeyword_2()); }
	'\u2115'
	{ after(grammarAccess.getTimeIteratorAccess().getDoubleStruckCapitalNKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SpaceIterator__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpaceIterator__Group__0__Impl
	rule__SpaceIterator__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIterator__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpaceIteratorAccess().getNameAssignment_0()); }
	(rule__SpaceIterator__NameAssignment_0)
	{ after(grammarAccess.getSpaceIteratorAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIterator__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpaceIterator__Group__1__Impl
	rule__SpaceIterator__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIterator__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpaceIteratorAccess().getElementOfKeyword_1()); }
	'\u2208'
	{ after(grammarAccess.getSpaceIteratorAccess().getElementOfKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIterator__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpaceIterator__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIterator__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpaceIteratorAccess().getRangeAssignment_2()); }
	(rule__SpaceIterator__RangeAssignment_2)
	{ after(grammarAccess.getSpaceIteratorAccess().getRangeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SpaceIteratorRange__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpaceIteratorRange__Group__0__Impl
	rule__SpaceIteratorRange__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIteratorRange__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpaceIteratorRangeAccess().getConnectivityAssignment_0()); }
	(rule__SpaceIteratorRange__ConnectivityAssignment_0)
	{ after(grammarAccess.getSpaceIteratorRangeAccess().getConnectivityAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIteratorRange__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpaceIteratorRange__Group__1__Impl
	rule__SpaceIteratorRange__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIteratorRange__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpaceIteratorRangeAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getSpaceIteratorRangeAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIteratorRange__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpaceIteratorRange__Group__2__Impl
	rule__SpaceIteratorRange__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIteratorRange__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpaceIteratorRangeAccess().getGroup_2()); }
	(rule__SpaceIteratorRange__Group_2__0)?
	{ after(grammarAccess.getSpaceIteratorRangeAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIteratorRange__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpaceIteratorRange__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIteratorRange__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpaceIteratorRangeAccess().getRightParenthesisKeyword_3()); }
	')'
	{ after(grammarAccess.getSpaceIteratorRangeAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SpaceIteratorRange__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpaceIteratorRange__Group_2__0__Impl
	rule__SpaceIteratorRange__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIteratorRange__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpaceIteratorRangeAccess().getArgsAssignment_2_0()); }
	(rule__SpaceIteratorRange__ArgsAssignment_2_0)
	{ after(grammarAccess.getSpaceIteratorRangeAccess().getArgsAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIteratorRange__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpaceIteratorRange__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIteratorRange__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpaceIteratorRangeAccess().getGroup_2_1()); }
	(rule__SpaceIteratorRange__Group_2_1__0)*
	{ after(grammarAccess.getSpaceIteratorRangeAccess().getGroup_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SpaceIteratorRange__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpaceIteratorRange__Group_2_1__0__Impl
	rule__SpaceIteratorRange__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIteratorRange__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpaceIteratorRangeAccess().getCommaKeyword_2_1_0()); }
	','
	{ after(grammarAccess.getSpaceIteratorRangeAccess().getCommaKeyword_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIteratorRange__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpaceIteratorRange__Group_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIteratorRange__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpaceIteratorRangeAccess().getArgsAssignment_2_1_1()); }
	(rule__SpaceIteratorRange__ArgsAssignment_2_1_1)
	{ after(grammarAccess.getSpaceIteratorRangeAccess().getArgsAssignment_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SpaceIteratorRef__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpaceIteratorRef__Group_0__0__Impl
	rule__SpaceIteratorRef__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIteratorRef__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpaceIteratorRefAccess().getAlternatives_0_0()); }
	(rule__SpaceIteratorRef__Alternatives_0_0)
	{ after(grammarAccess.getSpaceIteratorRefAccess().getAlternatives_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIteratorRef__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpaceIteratorRef__Group_0__1__Impl
	rule__SpaceIteratorRef__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIteratorRef__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpaceIteratorRefAccess().getLeftParenthesisKeyword_0_1()); }
	'('
	{ after(grammarAccess.getSpaceIteratorRefAccess().getLeftParenthesisKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIteratorRef__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpaceIteratorRef__Group_0__2__Impl
	rule__SpaceIteratorRef__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIteratorRef__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpaceIteratorRefAccess().getIteratorAssignment_0_2()); }
	(rule__SpaceIteratorRef__IteratorAssignment_0_2)
	{ after(grammarAccess.getSpaceIteratorRefAccess().getIteratorAssignment_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIteratorRef__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpaceIteratorRef__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIteratorRef__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpaceIteratorRefAccess().getRightParenthesisKeyword_0_3()); }
	')'
	{ after(grammarAccess.getSpaceIteratorRefAccess().getRightParenthesisKeyword_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ScalarVarDefinition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarVarDefinition__Group__0__Impl
	rule__ScalarVarDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarVarDefinition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarVarDefinitionAccess().getConstAssignment_0()); }
	(rule__ScalarVarDefinition__ConstAssignment_0)?
	{ after(grammarAccess.getScalarVarDefinitionAccess().getConstAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarVarDefinition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarVarDefinition__Group__1__Impl
	rule__ScalarVarDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarVarDefinition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarVarDefinitionAccess().getTypeAssignment_1()); }
	(rule__ScalarVarDefinition__TypeAssignment_1)
	{ after(grammarAccess.getScalarVarDefinitionAccess().getTypeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarVarDefinition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarVarDefinition__Group__2__Impl
	rule__ScalarVarDefinition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarVarDefinition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarVarDefinitionAccess().getVariableAssignment_2()); }
	(rule__ScalarVarDefinition__VariableAssignment_2)
	{ after(grammarAccess.getScalarVarDefinitionAccess().getVariableAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarVarDefinition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarVarDefinition__Group__3__Impl
	rule__ScalarVarDefinition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarVarDefinition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarVarDefinitionAccess().getEqualsSignKeyword_3()); }
	'='
	{ after(grammarAccess.getScalarVarDefinitionAccess().getEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarVarDefinition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarVarDefinition__Group__4__Impl
	rule__ScalarVarDefinition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarVarDefinition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarVarDefinitionAccess().getDefaultValueAssignment_4()); }
	(rule__ScalarVarDefinition__DefaultValueAssignment_4)
	{ after(grammarAccess.getScalarVarDefinitionAccess().getDefaultValueAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarVarDefinition__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarVarDefinition__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarVarDefinition__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarVarDefinitionAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getScalarVarDefinitionAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VarGroupDeclaration__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarGroupDeclaration__Group__0__Impl
	rule__VarGroupDeclaration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VarGroupDeclaration__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarGroupDeclarationAccess().getTypeAssignment_0()); }
	(rule__VarGroupDeclaration__TypeAssignment_0)
	{ after(grammarAccess.getVarGroupDeclarationAccess().getTypeAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarGroupDeclaration__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarGroupDeclaration__Group__1__Impl
	rule__VarGroupDeclaration__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VarGroupDeclaration__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarGroupDeclarationAccess().getVariablesAssignment_1()); }
	(rule__VarGroupDeclaration__VariablesAssignment_1)
	{ after(grammarAccess.getVarGroupDeclarationAccess().getVariablesAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarGroupDeclaration__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarGroupDeclaration__Group__2__Impl
	rule__VarGroupDeclaration__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VarGroupDeclaration__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarGroupDeclarationAccess().getGroup_2()); }
	(rule__VarGroupDeclaration__Group_2__0)*
	{ after(grammarAccess.getVarGroupDeclarationAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarGroupDeclaration__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarGroupDeclaration__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VarGroupDeclaration__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarGroupDeclarationAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getVarGroupDeclarationAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VarGroupDeclaration__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarGroupDeclaration__Group_2__0__Impl
	rule__VarGroupDeclaration__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VarGroupDeclaration__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarGroupDeclarationAccess().getCommaKeyword_2_0()); }
	','
	{ after(grammarAccess.getVarGroupDeclarationAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarGroupDeclaration__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarGroupDeclaration__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VarGroupDeclaration__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarGroupDeclarationAccess().getVariablesAssignment_2_1()); }
	(rule__VarGroupDeclaration__VariablesAssignment_2_1)
	{ after(grammarAccess.getVarGroupDeclarationAccess().getVariablesAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ArrayVar__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayVar__Group__0__Impl
	rule__ArrayVar__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayVar__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayVarAccess().getNameAssignment_0()); }
	(rule__ArrayVar__NameAssignment_0)
	{ after(grammarAccess.getArrayVarAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayVar__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayVar__Group__1__Impl
	rule__ArrayVar__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayVar__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayVarAccess().getLeftSquareBracketKeyword_1()); }
	'['
	{ after(grammarAccess.getArrayVarAccess().getLeftSquareBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayVar__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayVar__Group__2__Impl
	rule__ArrayVar__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayVar__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayVarAccess().getDimensionsAssignment_2()); }
	(rule__ArrayVar__DimensionsAssignment_2)
	{ after(grammarAccess.getArrayVarAccess().getDimensionsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayVar__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayVar__Group__3__Impl
	rule__ArrayVar__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayVar__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayVarAccess().getGroup_3()); }
	(rule__ArrayVar__Group_3__0)*
	{ after(grammarAccess.getArrayVarAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayVar__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayVar__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayVar__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayVarAccess().getRightSquareBracketKeyword_4()); }
	']'
	{ after(grammarAccess.getArrayVarAccess().getRightSquareBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ArrayVar__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayVar__Group_3__0__Impl
	rule__ArrayVar__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayVar__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayVarAccess().getCommaKeyword_3_0()); }
	','
	{ after(grammarAccess.getArrayVarAccess().getCommaKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayVar__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayVar__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayVar__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayVarAccess().getDimensionsAssignment_3_1()); }
	(rule__ArrayVar__DimensionsAssignment_3_1)
	{ after(grammarAccess.getArrayVarAccess().getDimensionsAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Connectivity__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connectivity__Group__0__Impl
	rule__Connectivity__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Connectivity__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectivityAccess().getNameAssignment_0()); }
	(rule__Connectivity__NameAssignment_0)
	{ after(grammarAccess.getConnectivityAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connectivity__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connectivity__Group__1__Impl
	rule__Connectivity__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Connectivity__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectivityAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getConnectivityAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connectivity__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connectivity__Group__2__Impl
	rule__Connectivity__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Connectivity__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectivityAccess().getLeftParenthesisKeyword_2()); }
	'('
	{ after(grammarAccess.getConnectivityAccess().getLeftParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connectivity__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connectivity__Group__3__Impl
	rule__Connectivity__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Connectivity__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectivityAccess().getAlternatives_3()); }
	(rule__Connectivity__Alternatives_3)
	{ after(grammarAccess.getConnectivityAccess().getAlternatives_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connectivity__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connectivity__Group__4__Impl
	rule__Connectivity__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Connectivity__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectivityAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getConnectivityAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connectivity__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connectivity__Group__5__Impl
	rule__Connectivity__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Connectivity__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectivityAccess().getRightwardsArrowKeyword_5()); }
	'\u2192'
	{ after(grammarAccess.getConnectivityAccess().getRightwardsArrowKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connectivity__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connectivity__Group__6__Impl
	rule__Connectivity__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Connectivity__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectivityAccess().getReturnTypeAssignment_6()); }
	(rule__Connectivity__ReturnTypeAssignment_6)
	{ after(grammarAccess.getConnectivityAccess().getReturnTypeAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connectivity__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connectivity__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Connectivity__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectivityAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getConnectivityAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Connectivity__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connectivity__Group_3_0__0__Impl
	rule__Connectivity__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Connectivity__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectivityAccess().getInTypesAssignment_3_0_0()); }
	(rule__Connectivity__InTypesAssignment_3_0_0)
	{ after(grammarAccess.getConnectivityAccess().getInTypesAssignment_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connectivity__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connectivity__Group_3_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Connectivity__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectivityAccess().getGroup_3_0_1()); }
	(rule__Connectivity__Group_3_0_1__0)*
	{ after(grammarAccess.getConnectivityAccess().getGroup_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Connectivity__Group_3_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connectivity__Group_3_0_1__0__Impl
	rule__Connectivity__Group_3_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Connectivity__Group_3_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectivityAccess().getCommaKeyword_3_0_1_0()); }
	','
	{ after(grammarAccess.getConnectivityAccess().getCommaKeyword_3_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connectivity__Group_3_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connectivity__Group_3_0_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Connectivity__Group_3_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectivityAccess().getInTypesAssignment_3_0_1_1()); }
	(rule__Connectivity__InTypesAssignment_3_0_1_1)
	{ after(grammarAccess.getConnectivityAccess().getInTypesAssignment_3_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ItemArgType__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ItemArgType__Group_0__0__Impl
	rule__ItemArgType__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ItemArgType__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getItemArgTypeAccess().getMultipleAssignment_0_0()); }
	(rule__ItemArgType__MultipleAssignment_0_0)
	{ after(grammarAccess.getItemArgTypeAccess().getMultipleAssignment_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ItemArgType__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ItemArgType__Group_0__1__Impl
	rule__ItemArgType__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ItemArgType__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getItemArgTypeAccess().getTypeAssignment_0_1()); }
	(rule__ItemArgType__TypeAssignment_0_1)
	{ after(grammarAccess.getItemArgTypeAccess().getTypeAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ItemArgType__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ItemArgType__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ItemArgType__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getItemArgTypeAccess().getRightCurlyBracketKeyword_0_2()); }
	'}'
	{ after(grammarAccess.getItemArgTypeAccess().getRightCurlyBracketKeyword_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Function__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group__0__Impl
	rule__Function__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getFunctionAction_0()); }
	()
	{ after(grammarAccess.getFunctionAccess().getFunctionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group__1__Impl
	rule__Function__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getNameAssignment_1()); }
	(rule__Function__NameAssignment_1)
	{ after(grammarAccess.getFunctionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group__2__Impl
	rule__Function__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getFunctionAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group__3__Impl
	rule__Function__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getArgGroupsAssignment_3()); }
	(rule__Function__ArgGroupsAssignment_3)
	{ after(grammarAccess.getFunctionAccess().getArgGroupsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group__4__Impl
	rule__Function__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getGroup_4()); }
	(rule__Function__Group_4__0)*
	{ after(grammarAccess.getFunctionAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getFunctionAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Function__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_4__0__Impl
	rule__Function__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getCommaKeyword_4_0()); }
	','
	{ after(grammarAccess.getFunctionAccess().getCommaKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getArgGroupsAssignment_4_1()); }
	(rule__Function__ArgGroupsAssignment_4_1)
	{ after(grammarAccess.getFunctionAccess().getArgGroupsAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FunctionArg__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunctionArg__Group__0__Impl
	rule__FunctionArg__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionArg__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionArgAccess().getLeftParenthesisKeyword_0()); }
	'('
	{ after(grammarAccess.getFunctionArgAccess().getLeftParenthesisKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionArg__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunctionArg__Group__1__Impl
	rule__FunctionArg__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionArg__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionArgAccess().getAlternatives_1()); }
	(rule__FunctionArg__Alternatives_1)
	{ after(grammarAccess.getFunctionArgAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionArg__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunctionArg__Group__2__Impl
	rule__FunctionArg__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionArg__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionArgAccess().getRightParenthesisKeyword_2()); }
	')'
	{ after(grammarAccess.getFunctionArgAccess().getRightParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionArg__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunctionArg__Group__3__Impl
	rule__FunctionArg__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionArg__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionArgAccess().getRightwardsArrowKeyword_3()); }
	'\u2192'
	{ after(grammarAccess.getFunctionArgAccess().getRightwardsArrowKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionArg__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunctionArg__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionArg__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionArgAccess().getReturnTypeAssignment_4()); }
	(rule__FunctionArg__ReturnTypeAssignment_4)
	{ after(grammarAccess.getFunctionArgAccess().getReturnTypeAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FunctionArg__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunctionArg__Group_1_0__0__Impl
	rule__FunctionArg__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionArg__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionArgAccess().getInTypesAssignment_1_0_0()); }
	(rule__FunctionArg__InTypesAssignment_1_0_0)
	{ after(grammarAccess.getFunctionArgAccess().getInTypesAssignment_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionArg__Group_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunctionArg__Group_1_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionArg__Group_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionArgAccess().getGroup_1_0_1()); }
	(rule__FunctionArg__Group_1_0_1__0)*
	{ after(grammarAccess.getFunctionArgAccess().getGroup_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FunctionArg__Group_1_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunctionArg__Group_1_0_1__0__Impl
	rule__FunctionArg__Group_1_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionArg__Group_1_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionArgAccess().getCommaKeyword_1_0_1_0()); }
	','
	{ after(grammarAccess.getFunctionArgAccess().getCommaKeyword_1_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionArg__Group_1_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunctionArg__Group_1_0_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionArg__Group_1_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionArgAccess().getInTypesAssignment_1_0_1_1()); }
	(rule__FunctionArg__InTypesAssignment_1_0_1_1)
	{ after(grammarAccess.getFunctionArgAccess().getInTypesAssignment_1_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Reduction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Reduction__Group__0__Impl
	rule__Reduction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Reduction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReductionAccess().getReductionAction_0()); }
	()
	{ after(grammarAccess.getReductionAccess().getReductionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reduction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Reduction__Group__1__Impl
	rule__Reduction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Reduction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReductionAccess().getNameAssignment_1()); }
	(rule__Reduction__NameAssignment_1)
	{ after(grammarAccess.getReductionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reduction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Reduction__Group__2__Impl
	rule__Reduction__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Reduction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReductionAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getReductionAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reduction__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Reduction__Group__3__Impl
	rule__Reduction__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Reduction__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReductionAccess().getArgGroupsAssignment_3()); }
	(rule__Reduction__ArgGroupsAssignment_3)
	{ after(grammarAccess.getReductionAccess().getArgGroupsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reduction__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Reduction__Group__4__Impl
	rule__Reduction__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Reduction__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReductionAccess().getGroup_4()); }
	(rule__Reduction__Group_4__0)*
	{ after(grammarAccess.getReductionAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reduction__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Reduction__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Reduction__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReductionAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getReductionAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Reduction__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Reduction__Group_4__0__Impl
	rule__Reduction__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Reduction__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReductionAccess().getCommaKeyword_4_0()); }
	','
	{ after(grammarAccess.getReductionAccess().getCommaKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reduction__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Reduction__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Reduction__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReductionAccess().getArgGroupsAssignment_4_1()); }
	(rule__Reduction__ArgGroupsAssignment_4_1)
	{ after(grammarAccess.getReductionAccess().getArgGroupsAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ReductionArg__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReductionArg__Group__0__Impl
	rule__ReductionArg__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ReductionArg__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReductionArgAccess().getLeftParenthesisKeyword_0()); }
	'('
	{ after(grammarAccess.getReductionArgAccess().getLeftParenthesisKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReductionArg__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReductionArg__Group__1__Impl
	rule__ReductionArg__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ReductionArg__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReductionArgAccess().getSeedAssignment_1()); }
	(rule__ReductionArg__SeedAssignment_1)
	{ after(grammarAccess.getReductionArgAccess().getSeedAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReductionArg__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReductionArg__Group__2__Impl
	rule__ReductionArg__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ReductionArg__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReductionArgAccess().getCommaKeyword_2()); }
	','
	{ after(grammarAccess.getReductionArgAccess().getCommaKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReductionArg__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReductionArg__Group__3__Impl
	rule__ReductionArg__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ReductionArg__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReductionArgAccess().getCollectionTypeAssignment_3()); }
	(rule__ReductionArg__CollectionTypeAssignment_3)
	{ after(grammarAccess.getReductionArgAccess().getCollectionTypeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReductionArg__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReductionArg__Group__4__Impl
	rule__ReductionArg__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ReductionArg__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReductionArgAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getReductionArgAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReductionArg__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReductionArg__Group__5__Impl
	rule__ReductionArg__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ReductionArg__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReductionArgAccess().getRightwardsArrowKeyword_5()); }
	'\u2192'
	{ after(grammarAccess.getReductionArgAccess().getRightwardsArrowKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReductionArg__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReductionArg__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ReductionArg__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReductionArgAccess().getReturnTypeAssignment_6()); }
	(rule__ReductionArg__ReturnTypeAssignment_6)
	{ after(grammarAccess.getReductionArgAccess().getReturnTypeAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Or__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Or__Group__0__Impl
	rule__Or__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Or__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); }
	ruleAnd
	{ after(grammarAccess.getOrAccess().getAndParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Or__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Or__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Or__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrAccess().getGroup_1()); }
	(rule__Or__Group_1__0)*
	{ after(grammarAccess.getOrAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Or__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Or__Group_1__0__Impl
	rule__Or__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Or__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); }
	()
	{ after(grammarAccess.getOrAccess().getOrLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Or__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Or__Group_1__1__Impl
	rule__Or__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Or__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrAccess().getOpAssignment_1_1()); }
	(rule__Or__OpAssignment_1_1)
	{ after(grammarAccess.getOrAccess().getOpAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Or__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Or__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Or__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrAccess().getRightAssignment_1_2()); }
	(rule__Or__RightAssignment_1_2)
	{ after(grammarAccess.getOrAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__And__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__And__Group__0__Impl
	rule__And__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__And__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); }
	ruleEquality
	{ after(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__And__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__And__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__And__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndAccess().getGroup_1()); }
	(rule__And__Group_1__0)*
	{ after(grammarAccess.getAndAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__And__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__And__Group_1__0__Impl
	rule__And__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__And__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); }
	()
	{ after(grammarAccess.getAndAccess().getAndLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__And__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__And__Group_1__1__Impl
	rule__And__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__And__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndAccess().getOpAssignment_1_1()); }
	(rule__And__OpAssignment_1_1)
	{ after(grammarAccess.getAndAccess().getOpAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__And__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__And__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__And__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndAccess().getRightAssignment_1_2()); }
	(rule__And__RightAssignment_1_2)
	{ after(grammarAccess.getAndAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Equality__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Equality__Group__0__Impl
	rule__Equality__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); }
	ruleComparison
	{ after(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Equality__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEqualityAccess().getGroup_1()); }
	(rule__Equality__Group_1__0)*
	{ after(grammarAccess.getEqualityAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Equality__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Equality__Group_1__0__Impl
	rule__Equality__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); }
	()
	{ after(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Equality__Group_1__1__Impl
	rule__Equality__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); }
	(rule__Equality__OpAssignment_1_1)
	{ after(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Equality__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); }
	(rule__Equality__RightAssignment_1_2)
	{ after(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Comparison__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comparison__Group__0__Impl
	rule__Comparison__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparison__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); }
	rulePlusOrMinus
	{ after(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparison__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comparison__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparison__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComparisonAccess().getGroup_1()); }
	(rule__Comparison__Group_1__0)*
	{ after(grammarAccess.getComparisonAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Comparison__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comparison__Group_1__0__Impl
	rule__Comparison__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparison__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); }
	()
	{ after(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparison__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comparison__Group_1__1__Impl
	rule__Comparison__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparison__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); }
	(rule__Comparison__OpAssignment_1_1)
	{ after(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparison__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comparison__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparison__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); }
	(rule__Comparison__RightAssignment_1_2)
	{ after(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlusOrMinus__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group__0__Impl
	rule__PlusOrMinus__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); }
	ruleMulOrDiv
	{ after(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); }
	(rule__PlusOrMinus__Group_1__0)*
	{ after(grammarAccess.getPlusOrMinusAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlusOrMinus__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group_1__0__Impl
	rule__PlusOrMinus__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); }
	(rule__PlusOrMinus__Alternatives_1_0)
	{ after(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); }
	(rule__PlusOrMinus__RightAssignment_1_1)
	{ after(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlusOrMinus__Group_1_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group_1_0_0__0__Impl
	rule__PlusOrMinus__Group_1_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); }
	()
	{ after(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group_1_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getOpAssignment_1_0_0_1()); }
	(rule__PlusOrMinus__OpAssignment_1_0_0_1)
	{ after(grammarAccess.getPlusOrMinusAccess().getOpAssignment_1_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlusOrMinus__Group_1_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group_1_0_1__0__Impl
	rule__PlusOrMinus__Group_1_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); }
	()
	{ after(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group_1_0_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getOpAssignment_1_0_1_1()); }
	(rule__PlusOrMinus__OpAssignment_1_0_1_1)
	{ after(grammarAccess.getPlusOrMinusAccess().getOpAssignment_1_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MulOrDiv__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MulOrDiv__Group__0__Impl
	rule__MulOrDiv__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); }
	rulePrimary
	{ after(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MulOrDiv__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMulOrDivAccess().getGroup_1()); }
	(rule__MulOrDiv__Group_1__0)*
	{ after(grammarAccess.getMulOrDivAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MulOrDiv__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MulOrDiv__Group_1__0__Impl
	rule__MulOrDiv__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); }
	()
	{ after(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MulOrDiv__Group_1__1__Impl
	rule__MulOrDiv__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); }
	(rule__MulOrDiv__OpAssignment_1_1)
	{ after(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MulOrDiv__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); }
	(rule__MulOrDiv__RightAssignment_1_2)
	{ after(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Primary__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_0__0__Impl
	rule__Primary__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getParenthesisAction_0_0()); }
	()
	{ after(grammarAccess.getPrimaryAccess().getParenthesisAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_0__1__Impl
	rule__Primary__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_1()); }
	'('
	{ after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_0__2__Impl
	rule__Primary__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getExpressionAssignment_0_2()); }
	(rule__Primary__ExpressionAssignment_0_2)
	{ after(grammarAccess.getPrimaryAccess().getExpressionAssignment_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_3()); }
	')'
	{ after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Primary__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_1__0__Impl
	rule__Primary__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getUnaryMinusAction_1_0()); }
	()
	{ after(grammarAccess.getPrimaryAccess().getUnaryMinusAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_1__1__Impl
	rule__Primary__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_1_1()); }
	'-'
	{ after(grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); }
	(rule__Primary__ExpressionAssignment_1_2)
	{ after(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Primary__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_2__0__Impl
	rule__Primary__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getNotAction_2_0()); }
	()
	{ after(grammarAccess.getPrimaryAccess().getNotAction_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_2__1__Impl
	rule__Primary__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_2_1()); }
	'!'
	{ after(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getExpressionAssignment_2_2()); }
	(rule__Primary__ExpressionAssignment_2_2)
	{ after(grammarAccess.getPrimaryAccess().getExpressionAssignment_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Atomic__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_0__0__Impl
	rule__Atomic__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getIntConstantAction_0_0()); }
	()
	{ after(grammarAccess.getAtomicAccess().getIntConstantAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); }
	(rule__Atomic__ValueAssignment_0_1)
	{ after(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Atomic__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_1__0__Impl
	rule__Atomic__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getRealConstantAction_1_0()); }
	()
	{ after(grammarAccess.getAtomicAccess().getRealConstantAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); }
	(rule__Atomic__ValueAssignment_1_1)
	{ after(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Atomic__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_4__0__Impl
	rule__Atomic__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getBoolConstantAction_4_0()); }
	()
	{ after(grammarAccess.getAtomicAccess().getBoolConstantAction_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getAlternatives_4_1()); }
	(rule__Atomic__Alternatives_4_1)
	{ after(grammarAccess.getAtomicAccess().getAlternatives_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Atomic__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_5__0__Impl
	rule__Atomic__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getReal2x2ConstantAction_5_0()); }
	()
	{ after(grammarAccess.getAtomicAccess().getReal2x2ConstantAction_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_5__1__Impl
	rule__Atomic__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getLeftCurlyBracketKeyword_5_1()); }
	'{'
	{ after(grammarAccess.getAtomicAccess().getLeftCurlyBracketKeyword_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_5__2__Impl
	rule__Atomic__Group_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getXAssignment_5_2()); }
	(rule__Atomic__XAssignment_5_2)
	{ after(grammarAccess.getAtomicAccess().getXAssignment_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_5__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_5__3__Impl
	rule__Atomic__Group_5__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_5__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getCommaKeyword_5_3()); }
	','
	{ after(grammarAccess.getAtomicAccess().getCommaKeyword_5_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_5__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_5__4__Impl
	rule__Atomic__Group_5__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_5__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getYAssignment_5_4()); }
	(rule__Atomic__YAssignment_5_4)
	{ after(grammarAccess.getAtomicAccess().getYAssignment_5_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_5__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_5__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_5__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getRightCurlyBracketKeyword_5_5()); }
	'}'
	{ after(grammarAccess.getAtomicAccess().getRightCurlyBracketKeyword_5_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Atomic__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_6__0__Impl
	rule__Atomic__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getReal3x3ConstantAction_6_0()); }
	()
	{ after(grammarAccess.getAtomicAccess().getReal3x3ConstantAction_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_6__1__Impl
	rule__Atomic__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getLeftCurlyBracketKeyword_6_1()); }
	'{'
	{ after(grammarAccess.getAtomicAccess().getLeftCurlyBracketKeyword_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_6__2__Impl
	rule__Atomic__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getXAssignment_6_2()); }
	(rule__Atomic__XAssignment_6_2)
	{ after(grammarAccess.getAtomicAccess().getXAssignment_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_6__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_6__3__Impl
	rule__Atomic__Group_6__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_6__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getCommaKeyword_6_3()); }
	','
	{ after(grammarAccess.getAtomicAccess().getCommaKeyword_6_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_6__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_6__4__Impl
	rule__Atomic__Group_6__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_6__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getYAssignment_6_4()); }
	(rule__Atomic__YAssignment_6_4)
	{ after(grammarAccess.getAtomicAccess().getYAssignment_6_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_6__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_6__5__Impl
	rule__Atomic__Group_6__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_6__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getCommaKeyword_6_5()); }
	','
	{ after(grammarAccess.getAtomicAccess().getCommaKeyword_6_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_6__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_6__6__Impl
	rule__Atomic__Group_6__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_6__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getZAssignment_6_6()); }
	(rule__Atomic__ZAssignment_6_6)
	{ after(grammarAccess.getAtomicAccess().getZAssignment_6_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_6__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_6__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_6__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getRightCurlyBracketKeyword_6_7()); }
	'}'
	{ after(grammarAccess.getAtomicAccess().getRightCurlyBracketKeyword_6_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Atomic__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_7__0__Impl
	rule__Atomic__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getRealXCompactConstantAction_7_0()); }
	()
	{ after(grammarAccess.getAtomicAccess().getRealXCompactConstantAction_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_7__1__Impl
	rule__Atomic__Group_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getTypeAssignment_7_1()); }
	(rule__Atomic__TypeAssignment_7_1)
	{ after(grammarAccess.getAtomicAccess().getTypeAssignment_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_7__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_7__2__Impl
	rule__Atomic__Group_7__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_7__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_7_2()); }
	'('
	{ after(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_7_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_7__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_7__3__Impl
	rule__Atomic__Group_7__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_7__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getValueAssignment_7_3()); }
	(rule__Atomic__ValueAssignment_7_3)
	{ after(grammarAccess.getAtomicAccess().getValueAssignment_7_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_7__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_7__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_7__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_7_4()); }
	')'
	{ after(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_7_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Atomic__Group_8__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_8__0__Impl
	rule__Atomic__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_8__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getMinConstantAction_8_0()); }
	()
	{ after(grammarAccess.getAtomicAccess().getMinConstantAction_8_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_8__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_8__1__Impl
	rule__Atomic__Group_8__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_8__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getTypeAssignment_8_1()); }
	(rule__Atomic__TypeAssignment_8_1)
	{ after(grammarAccess.getAtomicAccess().getTypeAssignment_8_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_8__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_8__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_8__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getMinValueKeyword_8_2()); }
	'.MinValue'
	{ after(grammarAccess.getAtomicAccess().getMinValueKeyword_8_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Atomic__Group_9__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_9__0__Impl
	rule__Atomic__Group_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_9__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getMaxConstantAction_9_0()); }
	()
	{ after(grammarAccess.getAtomicAccess().getMaxConstantAction_9_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_9__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_9__1__Impl
	rule__Atomic__Group_9__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_9__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getTypeAssignment_9_1()); }
	(rule__Atomic__TypeAssignment_9_1)
	{ after(grammarAccess.getAtomicAccess().getTypeAssignment_9_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_9__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_9__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_9__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getMaxValueKeyword_9_2()); }
	'.MaxValue'
	{ after(grammarAccess.getAtomicAccess().getMaxValueKeyword_9_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Atomic__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_10__0__Impl
	rule__Atomic__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getFunctionCallAction_10_0()); }
	()
	{ after(grammarAccess.getAtomicAccess().getFunctionCallAction_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_10__1__Impl
	rule__Atomic__Group_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getFunctionAssignment_10_1()); }
	(rule__Atomic__FunctionAssignment_10_1)
	{ after(grammarAccess.getAtomicAccess().getFunctionAssignment_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_10__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_10__2__Impl
	rule__Atomic__Group_10__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_10__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_10_2()); }
	'('
	{ after(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_10_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_10__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_10__3__Impl
	rule__Atomic__Group_10__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_10__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getGroup_10_3()); }
	(rule__Atomic__Group_10_3__0)?
	{ after(grammarAccess.getAtomicAccess().getGroup_10_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_10__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_10__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_10__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_10_4()); }
	')'
	{ after(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_10_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Atomic__Group_10_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_10_3__0__Impl
	rule__Atomic__Group_10_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_10_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getArgsAssignment_10_3_0()); }
	(rule__Atomic__ArgsAssignment_10_3_0)
	{ after(grammarAccess.getAtomicAccess().getArgsAssignment_10_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_10_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_10_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_10_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getGroup_10_3_1()); }
	(rule__Atomic__Group_10_3_1__0)*
	{ after(grammarAccess.getAtomicAccess().getGroup_10_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Atomic__Group_10_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_10_3_1__0__Impl
	rule__Atomic__Group_10_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_10_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getCommaKeyword_10_3_1_0()); }
	','
	{ after(grammarAccess.getAtomicAccess().getCommaKeyword_10_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_10_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_10_3_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_10_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getArgsAssignment_10_3_1_1()); }
	(rule__Atomic__ArgsAssignment_10_3_1_1)
	{ after(grammarAccess.getAtomicAccess().getArgsAssignment_10_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Atomic__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_11__0__Impl
	rule__Atomic__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getReductionCallAction_11_0()); }
	()
	{ after(grammarAccess.getAtomicAccess().getReductionCallAction_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_11__1__Impl
	rule__Atomic__Group_11__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getReductionAssignment_11_1()); }
	(rule__Atomic__ReductionAssignment_11_1)
	{ after(grammarAccess.getAtomicAccess().getReductionAssignment_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_11__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_11__2__Impl
	rule__Atomic__Group_11__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_11__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getLeftCurlyBracketKeyword_11_2()); }
	'{'
	{ after(grammarAccess.getAtomicAccess().getLeftCurlyBracketKeyword_11_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_11__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_11__3__Impl
	rule__Atomic__Group_11__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_11__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getIteratorAssignment_11_3()); }
	(rule__Atomic__IteratorAssignment_11_3)
	{ after(grammarAccess.getAtomicAccess().getIteratorAssignment_11_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_11__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_11__4__Impl
	rule__Atomic__Group_11__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_11__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getRightCurlyBracketKeyword_11_4()); }
	'}'
	{ after(grammarAccess.getAtomicAccess().getRightCurlyBracketKeyword_11_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_11__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_11__5__Impl
	rule__Atomic__Group_11__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_11__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_11_5()); }
	'('
	{ after(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_11_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_11__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_11__6__Impl
	rule__Atomic__Group_11__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_11__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getArgAssignment_11_6()); }
	(rule__Atomic__ArgAssignment_11_6)
	{ after(grammarAccess.getAtomicAccess().getArgAssignment_11_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_11__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_11__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_11__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_11_7()); }
	')'
	{ after(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_11_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Real2Constant__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Real2Constant__Group__0__Impl
	rule__Real2Constant__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Real2Constant__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReal2ConstantAccess().getLeftCurlyBracketKeyword_0()); }
	'{'
	{ after(grammarAccess.getReal2ConstantAccess().getLeftCurlyBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Real2Constant__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Real2Constant__Group__1__Impl
	rule__Real2Constant__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Real2Constant__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReal2ConstantAccess().getXAssignment_1()); }
	(rule__Real2Constant__XAssignment_1)
	{ after(grammarAccess.getReal2ConstantAccess().getXAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Real2Constant__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Real2Constant__Group__2__Impl
	rule__Real2Constant__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Real2Constant__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReal2ConstantAccess().getCommaKeyword_2()); }
	','
	{ after(grammarAccess.getReal2ConstantAccess().getCommaKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Real2Constant__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Real2Constant__Group__3__Impl
	rule__Real2Constant__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Real2Constant__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReal2ConstantAccess().getYAssignment_3()); }
	(rule__Real2Constant__YAssignment_3)
	{ after(grammarAccess.getReal2ConstantAccess().getYAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Real2Constant__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Real2Constant__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Real2Constant__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReal2ConstantAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getReal2ConstantAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Real3Constant__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Real3Constant__Group__0__Impl
	rule__Real3Constant__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Real3Constant__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReal3ConstantAccess().getLeftCurlyBracketKeyword_0()); }
	'{'
	{ after(grammarAccess.getReal3ConstantAccess().getLeftCurlyBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Real3Constant__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Real3Constant__Group__1__Impl
	rule__Real3Constant__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Real3Constant__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReal3ConstantAccess().getXAssignment_1()); }
	(rule__Real3Constant__XAssignment_1)
	{ after(grammarAccess.getReal3ConstantAccess().getXAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Real3Constant__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Real3Constant__Group__2__Impl
	rule__Real3Constant__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Real3Constant__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReal3ConstantAccess().getCommaKeyword_2()); }
	','
	{ after(grammarAccess.getReal3ConstantAccess().getCommaKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Real3Constant__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Real3Constant__Group__3__Impl
	rule__Real3Constant__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Real3Constant__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReal3ConstantAccess().getYAssignment_3()); }
	(rule__Real3Constant__YAssignment_3)
	{ after(grammarAccess.getReal3ConstantAccess().getYAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Real3Constant__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Real3Constant__Group__4__Impl
	rule__Real3Constant__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Real3Constant__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReal3ConstantAccess().getCommaKeyword_4()); }
	','
	{ after(grammarAccess.getReal3ConstantAccess().getCommaKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Real3Constant__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Real3Constant__Group__5__Impl
	rule__Real3Constant__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Real3Constant__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReal3ConstantAccess().getZAssignment_5()); }
	(rule__Real3Constant__ZAssignment_5)
	{ after(grammarAccess.getReal3ConstantAccess().getZAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Real3Constant__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Real3Constant__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Real3Constant__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReal3ConstantAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getReal3ConstantAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VarRef__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarRef__Group__0__Impl
	rule__VarRef__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VarRef__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarRefAccess().getVariableAssignment_0()); }
	(rule__VarRef__VariableAssignment_0)
	{ after(grammarAccess.getVarRefAccess().getVariableAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarRef__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarRef__Group__1__Impl
	rule__VarRef__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VarRef__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarRefAccess().getGroup_1()); }
	(rule__VarRef__Group_1__0)?
	{ after(grammarAccess.getVarRefAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarRef__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarRef__Group__2__Impl
	rule__VarRef__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VarRef__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarRefAccess().getGroup_2()); }
	(rule__VarRef__Group_2__0)?
	{ after(grammarAccess.getVarRefAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarRef__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarRef__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VarRef__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarRefAccess().getGroup_3()); }
	(rule__VarRef__Group_3__0)*
	{ after(grammarAccess.getVarRefAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VarRef__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarRef__Group_1__0__Impl
	rule__VarRef__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VarRef__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarRefAccess().getLeftCurlyBracketKeyword_1_0()); }
	'{'
	{ after(grammarAccess.getVarRefAccess().getLeftCurlyBracketKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarRef__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarRef__Group_1__1__Impl
	rule__VarRef__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VarRef__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarRefAccess().getSpaceIteratorsAssignment_1_1()); }
	(rule__VarRef__SpaceIteratorsAssignment_1_1)
	{ after(grammarAccess.getVarRefAccess().getSpaceIteratorsAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarRef__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarRef__Group_1__2__Impl
	rule__VarRef__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VarRef__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarRefAccess().getGroup_1_2()); }
	(rule__VarRef__Group_1_2__0)*
	{ after(grammarAccess.getVarRefAccess().getGroup_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarRef__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarRef__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VarRef__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarRefAccess().getRightCurlyBracketKeyword_1_3()); }
	'}'
	{ after(grammarAccess.getVarRefAccess().getRightCurlyBracketKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VarRef__Group_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarRef__Group_1_2__0__Impl
	rule__VarRef__Group_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VarRef__Group_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarRefAccess().getCommaKeyword_1_2_0()); }
	','
	{ after(grammarAccess.getVarRefAccess().getCommaKeyword_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarRef__Group_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarRef__Group_1_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VarRef__Group_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarRefAccess().getSpaceIteratorsAssignment_1_2_1()); }
	(rule__VarRef__SpaceIteratorsAssignment_1_2_1)
	{ after(grammarAccess.getVarRefAccess().getSpaceIteratorsAssignment_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VarRef__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarRef__Group_2__0__Impl
	rule__VarRef__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VarRef__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarRefAccess().getCircumflexAccentLeftCurlyBracketKeyword_2_0()); }
	'^{'
	{ after(grammarAccess.getVarRefAccess().getCircumflexAccentLeftCurlyBracketKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarRef__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarRef__Group_2__1__Impl
	rule__VarRef__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VarRef__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarRefAccess().getTimeIteratorAssignment_2_1()); }
	(rule__VarRef__TimeIteratorAssignment_2_1)
	{ after(grammarAccess.getVarRefAccess().getTimeIteratorAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarRef__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarRef__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VarRef__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarRefAccess().getRightCurlyBracketKeyword_2_2()); }
	'}'
	{ after(grammarAccess.getVarRefAccess().getRightCurlyBracketKeyword_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VarRef__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarRef__Group_3__0__Impl
	rule__VarRef__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VarRef__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarRefAccess().getFullStopKeyword_3_0()); }
	'.'
	{ after(grammarAccess.getVarRefAccess().getFullStopKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarRef__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarRef__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VarRef__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarRefAccess().getFieldsAssignment_3_1()); }
	(rule__VarRef__FieldsAssignment_3_1)
	{ after(grammarAccess.getVarRefAccess().getFieldsAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TimeIteratorRef__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeIteratorRef__Group__0__Impl
	rule__TimeIteratorRef__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeIteratorRef__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeIteratorRefAccess().getIteratorAssignment_0()); }
	(rule__TimeIteratorRef__IteratorAssignment_0)
	{ after(grammarAccess.getTimeIteratorRefAccess().getIteratorAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeIteratorRef__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeIteratorRef__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeIteratorRef__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeIteratorRefAccess().getGroup_1()); }
	(rule__TimeIteratorRef__Group_1__0)?
	{ after(grammarAccess.getTimeIteratorRefAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TimeIteratorRef__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeIteratorRef__Group_1__0__Impl
	rule__TimeIteratorRef__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeIteratorRef__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeIteratorRefAccess().getAlternatives_1_0()); }
	(rule__TimeIteratorRef__Alternatives_1_0)
	{ after(grammarAccess.getTimeIteratorRefAccess().getAlternatives_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeIteratorRef__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeIteratorRef__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeIteratorRef__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeIteratorRefAccess().getValueAssignment_1_1()); }
	(rule__TimeIteratorRef__ValueAssignment_1_1)
	{ after(grammarAccess.getTimeIteratorRefAccess().getValueAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__0__Impl
	rule__QualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
	(rule__QualifiedName__Group_1__0)*
	{ after(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__0__Impl
	rule__QualifiedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedNameWithWildcard__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedNameWithWildcard__Group__0__Impl
	rule__QualifiedNameWithWildcard__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedNameWithWildcard__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); }
	ruleQualifiedName
	{ after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedNameWithWildcard__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedNameWithWildcard__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedNameWithWildcard__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); }
	('.*')?
	{ after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NablaModule__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNablaModuleAccess().getNameQualifiedNameParserRuleCall_1_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getNablaModuleAccess().getNameQualifiedNameParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NablaModule__ImportsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNablaModuleAccess().getImportsImportParserRuleCall_3_0()); }
		ruleImport
		{ after(grammarAccess.getNablaModuleAccess().getImportsImportParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NablaModule__BlocksAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNablaModuleAccess().getBlocksDeclarationBlockParserRuleCall_4_0()); }
		ruleDeclarationBlock
		{ after(grammarAccess.getNablaModuleAccess().getBlocksDeclarationBlockParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NablaModule__VariablesAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNablaModuleAccess().getVariablesAlternatives_5_0()); }
		(rule__NablaModule__VariablesAlternatives_5_0)
		{ after(grammarAccess.getNablaModuleAccess().getVariablesAlternatives_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NablaModule__JobsAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNablaModuleAccess().getJobsJobParserRuleCall_6_0()); }
		ruleJob
		{ after(grammarAccess.getNablaModuleAccess().getJobsJobParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__ImportedNamespaceAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); }
		ruleQualifiedNameWithWildcard
		{ after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclarationBlock__ConnectivitiesAssignment_0_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDeclarationBlockAccess().getConnectivitiesConnectivityParserRuleCall_0_3_0()); }
		ruleConnectivity
		{ after(grammarAccess.getDeclarationBlockAccess().getConnectivitiesConnectivityParserRuleCall_0_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclarationBlock__FunctionsAssignment_1_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDeclarationBlockAccess().getFunctionsAlternatives_1_3_0()); }
		(rule__DeclarationBlock__FunctionsAlternatives_1_3_0)
		{ after(grammarAccess.getDeclarationBlockAccess().getFunctionsAlternatives_1_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Job__NameAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJobAccess().getNameIDTerminalRuleCall_0_1_0()); }
		RULE_ID
		{ after(grammarAccess.getJobAccess().getNameIDTerminalRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Job__InstructionAssignment_0_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJobAccess().getInstructionInstructionParserRuleCall_0_3_0()); }
		ruleInstruction
		{ after(grammarAccess.getJobAccess().getInstructionInstructionParserRuleCall_0_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Job__NameAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJobAccess().getNameIDTerminalRuleCall_1_1_0()); }
		RULE_ID
		{ after(grammarAccess.getJobAccess().getNameIDTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Job__IteratorAssignment_1_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJobAccess().getIteratorTimeIteratorParserRuleCall_1_4_0()); }
		ruleTimeIterator
		{ after(grammarAccess.getJobAccess().getIteratorTimeIteratorParserRuleCall_1_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Job__InitializationAssignment_1_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJobAccess().getInitializationInstructionParserRuleCall_1_6_0()); }
		ruleInstruction
		{ after(grammarAccess.getJobAccess().getInitializationInstructionParserRuleCall_1_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Job__BodyAssignment_1_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJobAccess().getBodyInstructionParserRuleCall_1_8_0()); }
		ruleInstruction
		{ after(grammarAccess.getJobAccess().getBodyInstructionParserRuleCall_1_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__InstructionsAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstructionAccess().getInstructionsInstructionParserRuleCall_2_2_0()); }
		ruleInstruction
		{ after(grammarAccess.getInstructionAccess().getInstructionsInstructionParserRuleCall_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__VarRefAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstructionAccess().getVarRefVarRefParserRuleCall_3_1_0()); }
		ruleVarRef
		{ after(grammarAccess.getInstructionAccess().getVarRefVarRefParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__ExpressionAssignment_3_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstructionAccess().getExpressionExpressionParserRuleCall_3_3_0()); }
		ruleExpression
		{ after(grammarAccess.getInstructionAccess().getExpressionExpressionParserRuleCall_3_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__IteratorAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstructionAccess().getIteratorSpaceIteratorParserRuleCall_4_2_0()); }
		ruleSpaceIterator
		{ after(grammarAccess.getInstructionAccess().getIteratorSpaceIteratorParserRuleCall_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__BodyAssignment_4_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstructionAccess().getBodyInstructionParserRuleCall_4_4_0()); }
		ruleInstruction
		{ after(grammarAccess.getInstructionAccess().getBodyInstructionParserRuleCall_4_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__ConditionAssignment_5_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstructionAccess().getConditionExpressionParserRuleCall_5_3_0()); }
		ruleExpression
		{ after(grammarAccess.getInstructionAccess().getConditionExpressionParserRuleCall_5_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__ThenAssignment_5_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstructionAccess().getThenInstructionParserRuleCall_5_5_0()); }
		ruleInstruction
		{ after(grammarAccess.getInstructionAccess().getThenInstructionParserRuleCall_5_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__ElseAssignment_5_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstructionAccess().getElseInstructionParserRuleCall_5_6_1_0()); }
		ruleInstruction
		{ after(grammarAccess.getInstructionAccess().getElseInstructionParserRuleCall_5_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeIterator__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeIteratorAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getTimeIteratorAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIterator__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpaceIteratorAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getSpaceIteratorAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIterator__RangeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpaceIteratorAccess().getRangeSpaceIteratorRangeParserRuleCall_2_0()); }
		ruleSpaceIteratorRange
		{ after(grammarAccess.getSpaceIteratorAccess().getRangeSpaceIteratorRangeParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIteratorRange__ConnectivityAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpaceIteratorRangeAccess().getConnectivityConnectivityCrossReference_0_0()); }
		(
			{ before(grammarAccess.getSpaceIteratorRangeAccess().getConnectivityConnectivityIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getSpaceIteratorRangeAccess().getConnectivityConnectivityIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getSpaceIteratorRangeAccess().getConnectivityConnectivityCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIteratorRange__ArgsAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpaceIteratorRangeAccess().getArgsSpaceIteratorRefParserRuleCall_2_0_0()); }
		ruleSpaceIteratorRef
		{ after(grammarAccess.getSpaceIteratorRangeAccess().getArgsSpaceIteratorRefParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIteratorRange__ArgsAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpaceIteratorRangeAccess().getArgsSpaceIteratorRefParserRuleCall_2_1_1_0()); }
		ruleSpaceIteratorRef
		{ after(grammarAccess.getSpaceIteratorRangeAccess().getArgsSpaceIteratorRefParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIteratorRef__PrevAssignment_0_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpaceIteratorRefAccess().getPrevBlackLeftPointingPointerKeyword_0_0_0_0()); }
		(
			{ before(grammarAccess.getSpaceIteratorRefAccess().getPrevBlackLeftPointingPointerKeyword_0_0_0_0()); }
			'\u25C4'
			{ after(grammarAccess.getSpaceIteratorRefAccess().getPrevBlackLeftPointingPointerKeyword_0_0_0_0()); }
		)
		{ after(grammarAccess.getSpaceIteratorRefAccess().getPrevBlackLeftPointingPointerKeyword_0_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIteratorRef__NextAssignment_0_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpaceIteratorRefAccess().getNextBlackRightPointingPointerKeyword_0_0_1_0()); }
		(
			{ before(grammarAccess.getSpaceIteratorRefAccess().getNextBlackRightPointingPointerKeyword_0_0_1_0()); }
			'\u25BA'
			{ after(grammarAccess.getSpaceIteratorRefAccess().getNextBlackRightPointingPointerKeyword_0_0_1_0()); }
		)
		{ after(grammarAccess.getSpaceIteratorRefAccess().getNextBlackRightPointingPointerKeyword_0_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIteratorRef__IteratorAssignment_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpaceIteratorRefAccess().getIteratorSpaceIteratorCrossReference_0_2_0()); }
		(
			{ before(grammarAccess.getSpaceIteratorRefAccess().getIteratorSpaceIteratorIDTerminalRuleCall_0_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getSpaceIteratorRefAccess().getIteratorSpaceIteratorIDTerminalRuleCall_0_2_0_1()); }
		)
		{ after(grammarAccess.getSpaceIteratorRefAccess().getIteratorSpaceIteratorCrossReference_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpaceIteratorRef__IteratorAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpaceIteratorRefAccess().getIteratorSpaceIteratorCrossReference_1_0()); }
		(
			{ before(grammarAccess.getSpaceIteratorRefAccess().getIteratorSpaceIteratorIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getSpaceIteratorRefAccess().getIteratorSpaceIteratorIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getSpaceIteratorRefAccess().getIteratorSpaceIteratorCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarVarDefinition__ConstAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScalarVarDefinitionAccess().getConstConstKeyword_0_0()); }
		(
			{ before(grammarAccess.getScalarVarDefinitionAccess().getConstConstKeyword_0_0()); }
			'const'
			{ after(grammarAccess.getScalarVarDefinitionAccess().getConstConstKeyword_0_0()); }
		)
		{ after(grammarAccess.getScalarVarDefinitionAccess().getConstConstKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarVarDefinition__TypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScalarVarDefinitionAccess().getTypeBasicTypeEnumRuleCall_1_0()); }
		ruleBasicType
		{ after(grammarAccess.getScalarVarDefinitionAccess().getTypeBasicTypeEnumRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarVarDefinition__VariableAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScalarVarDefinitionAccess().getVariableScalarVarParserRuleCall_2_0()); }
		ruleScalarVar
		{ after(grammarAccess.getScalarVarDefinitionAccess().getVariableScalarVarParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarVarDefinition__DefaultValueAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScalarVarDefinitionAccess().getDefaultValueExpressionParserRuleCall_4_0()); }
		ruleExpression
		{ after(grammarAccess.getScalarVarDefinitionAccess().getDefaultValueExpressionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarGroupDeclaration__TypeAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVarGroupDeclarationAccess().getTypeBasicTypeEnumRuleCall_0_0()); }
		ruleBasicType
		{ after(grammarAccess.getVarGroupDeclarationAccess().getTypeBasicTypeEnumRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarGroupDeclaration__VariablesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVarGroupDeclarationAccess().getVariablesVarParserRuleCall_1_0()); }
		ruleVar
		{ after(grammarAccess.getVarGroupDeclarationAccess().getVariablesVarParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarGroupDeclaration__VariablesAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVarGroupDeclarationAccess().getVariablesVarParserRuleCall_2_1_0()); }
		ruleVar
		{ after(grammarAccess.getVarGroupDeclarationAccess().getVariablesVarParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarVar__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScalarVarAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getScalarVarAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayVar__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArrayVarAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getArrayVarAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayVar__DimensionsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArrayVarAccess().getDimensionsConnectivityCrossReference_2_0()); }
		(
			{ before(grammarAccess.getArrayVarAccess().getDimensionsConnectivityIDTerminalRuleCall_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getArrayVarAccess().getDimensionsConnectivityIDTerminalRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getArrayVarAccess().getDimensionsConnectivityCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayVar__DimensionsAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArrayVarAccess().getDimensionsConnectivityCrossReference_3_1_0()); }
		(
			{ before(grammarAccess.getArrayVarAccess().getDimensionsConnectivityIDTerminalRuleCall_3_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getArrayVarAccess().getDimensionsConnectivityIDTerminalRuleCall_3_1_0_1()); }
		)
		{ after(grammarAccess.getArrayVarAccess().getDimensionsConnectivityCrossReference_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connectivity__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConnectivityAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getConnectivityAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connectivity__InTypesAssignment_3_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConnectivityAccess().getInTypesItemTypeEnumRuleCall_3_0_0_0()); }
		ruleItemType
		{ after(grammarAccess.getConnectivityAccess().getInTypesItemTypeEnumRuleCall_3_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connectivity__InTypesAssignment_3_0_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConnectivityAccess().getInTypesItemTypeEnumRuleCall_3_0_1_1_0()); }
		ruleItemType
		{ after(grammarAccess.getConnectivityAccess().getInTypesItemTypeEnumRuleCall_3_0_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connectivity__ReturnTypeAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConnectivityAccess().getReturnTypeItemArgTypeParserRuleCall_6_0()); }
		ruleItemArgType
		{ after(grammarAccess.getConnectivityAccess().getReturnTypeItemArgTypeParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ItemArgType__MultipleAssignment_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getItemArgTypeAccess().getMultipleLeftCurlyBracketKeyword_0_0_0()); }
		(
			{ before(grammarAccess.getItemArgTypeAccess().getMultipleLeftCurlyBracketKeyword_0_0_0()); }
			'{'
			{ after(grammarAccess.getItemArgTypeAccess().getMultipleLeftCurlyBracketKeyword_0_0_0()); }
		)
		{ after(grammarAccess.getItemArgTypeAccess().getMultipleLeftCurlyBracketKeyword_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ItemArgType__TypeAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getItemArgTypeAccess().getTypeItemTypeEnumRuleCall_0_1_0()); }
		ruleItemType
		{ after(grammarAccess.getItemArgTypeAccess().getTypeItemTypeEnumRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ItemArgType__TypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getItemArgTypeAccess().getTypeItemTypeEnumRuleCall_1_0()); }
		ruleItemType
		{ after(grammarAccess.getItemArgTypeAccess().getTypeItemTypeEnumRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__ArgGroupsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getArgGroupsFunctionArgParserRuleCall_3_0()); }
		ruleFunctionArg
		{ after(grammarAccess.getFunctionAccess().getArgGroupsFunctionArgParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__ArgGroupsAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getArgGroupsFunctionArgParserRuleCall_4_1_0()); }
		ruleFunctionArg
		{ after(grammarAccess.getFunctionAccess().getArgGroupsFunctionArgParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionArg__InTypesAssignment_1_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionArgAccess().getInTypesBasicTypeEnumRuleCall_1_0_0_0()); }
		ruleBasicType
		{ after(grammarAccess.getFunctionArgAccess().getInTypesBasicTypeEnumRuleCall_1_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionArg__InTypesAssignment_1_0_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionArgAccess().getInTypesBasicTypeEnumRuleCall_1_0_1_1_0()); }
		ruleBasicType
		{ after(grammarAccess.getFunctionArgAccess().getInTypesBasicTypeEnumRuleCall_1_0_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionArg__ReturnTypeAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionArgAccess().getReturnTypeBasicTypeEnumRuleCall_4_0()); }
		ruleBasicType
		{ after(grammarAccess.getFunctionArgAccess().getReturnTypeBasicTypeEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reduction__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReductionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getReductionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reduction__ArgGroupsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReductionAccess().getArgGroupsReductionArgParserRuleCall_3_0()); }
		ruleReductionArg
		{ after(grammarAccess.getReductionAccess().getArgGroupsReductionArgParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reduction__ArgGroupsAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReductionAccess().getArgGroupsReductionArgParserRuleCall_4_1_0()); }
		ruleReductionArg
		{ after(grammarAccess.getReductionAccess().getArgGroupsReductionArgParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReductionArg__SeedAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReductionArgAccess().getSeedExpressionParserRuleCall_1_0()); }
		ruleExpression
		{ after(grammarAccess.getReductionArgAccess().getSeedExpressionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReductionArg__CollectionTypeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReductionArgAccess().getCollectionTypeBasicTypeEnumRuleCall_3_0()); }
		ruleBasicType
		{ after(grammarAccess.getReductionArgAccess().getCollectionTypeBasicTypeEnumRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReductionArg__ReturnTypeAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReductionArgAccess().getReturnTypeBasicTypeEnumRuleCall_6_0()); }
		ruleBasicType
		{ after(grammarAccess.getReductionArgAccess().getReturnTypeBasicTypeEnumRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Or__OpAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOrAccess().getOpVerticalLineVerticalLineKeyword_1_1_0()); }
		(
			{ before(grammarAccess.getOrAccess().getOpVerticalLineVerticalLineKeyword_1_1_0()); }
			'||'
			{ after(grammarAccess.getOrAccess().getOpVerticalLineVerticalLineKeyword_1_1_0()); }
		)
		{ after(grammarAccess.getOrAccess().getOpVerticalLineVerticalLineKeyword_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Or__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); }
		ruleAnd
		{ after(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__And__OpAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndAccess().getOpAmpersandAmpersandKeyword_1_1_0()); }
		(
			{ before(grammarAccess.getAndAccess().getOpAmpersandAmpersandKeyword_1_1_0()); }
			'&&'
			{ after(grammarAccess.getAndAccess().getOpAmpersandAmpersandKeyword_1_1_0()); }
		)
		{ after(grammarAccess.getAndAccess().getOpAmpersandAmpersandKeyword_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__And__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); }
		ruleEquality
		{ after(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality__OpAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); }
		(rule__Equality__OpAlternatives_1_1_0)
		{ after(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); }
		ruleComparison
		{ after(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparison__OpAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); }
		(rule__Comparison__OpAlternatives_1_1_0)
		{ after(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparison__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); }
		rulePlusOrMinus
		{ after(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__OpAssignment_1_0_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlusOrMinusAccess().getOpPlusSignKeyword_1_0_0_1_0()); }
		(
			{ before(grammarAccess.getPlusOrMinusAccess().getOpPlusSignKeyword_1_0_0_1_0()); }
			'+'
			{ after(grammarAccess.getPlusOrMinusAccess().getOpPlusSignKeyword_1_0_0_1_0()); }
		)
		{ after(grammarAccess.getPlusOrMinusAccess().getOpPlusSignKeyword_1_0_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__OpAssignment_1_0_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlusOrMinusAccess().getOpHyphenMinusKeyword_1_0_1_1_0()); }
		(
			{ before(grammarAccess.getPlusOrMinusAccess().getOpHyphenMinusKeyword_1_0_1_1_0()); }
			'-'
			{ after(grammarAccess.getPlusOrMinusAccess().getOpHyphenMinusKeyword_1_0_1_1_0()); }
		)
		{ after(grammarAccess.getPlusOrMinusAccess().getOpHyphenMinusKeyword_1_0_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__RightAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); }
		ruleMulOrDiv
		{ after(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__OpAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); }
		(rule__MulOrDiv__OpAlternatives_1_1_0)
		{ after(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); }
		rulePrimary
		{ after(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__ExpressionAssignment_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryAccess().getExpressionExpressionParserRuleCall_0_2_0()); }
		ruleExpression
		{ after(grammarAccess.getPrimaryAccess().getExpressionExpressionParserRuleCall_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__ExpressionAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); }
		rulePrimary
		{ after(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__ExpressionAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_2_2_0()); }
		rulePrimary
		{ after(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__ValueAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); }
		RULE_INT
		{ after(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__ValueAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicAccess().getValueREALTerminalRuleCall_1_1_0()); }
		RULE_REAL
		{ after(grammarAccess.getAtomicAccess().getValueREALTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__ValueAssignment_4_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicAccess().getValueTrueKeyword_4_1_0_0()); }
		(
			{ before(grammarAccess.getAtomicAccess().getValueTrueKeyword_4_1_0_0()); }
			'true'
			{ after(grammarAccess.getAtomicAccess().getValueTrueKeyword_4_1_0_0()); }
		)
		{ after(grammarAccess.getAtomicAccess().getValueTrueKeyword_4_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__XAssignment_5_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicAccess().getXReal2ConstantParserRuleCall_5_2_0()); }
		ruleReal2Constant
		{ after(grammarAccess.getAtomicAccess().getXReal2ConstantParserRuleCall_5_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__YAssignment_5_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicAccess().getYReal2ConstantParserRuleCall_5_4_0()); }
		ruleReal2Constant
		{ after(grammarAccess.getAtomicAccess().getYReal2ConstantParserRuleCall_5_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__XAssignment_6_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicAccess().getXReal3ConstantParserRuleCall_6_2_0()); }
		ruleReal3Constant
		{ after(grammarAccess.getAtomicAccess().getXReal3ConstantParserRuleCall_6_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__YAssignment_6_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicAccess().getYReal3ConstantParserRuleCall_6_4_0()); }
		ruleReal3Constant
		{ after(grammarAccess.getAtomicAccess().getYReal3ConstantParserRuleCall_6_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__ZAssignment_6_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicAccess().getZReal3ConstantParserRuleCall_6_6_0()); }
		ruleReal3Constant
		{ after(grammarAccess.getAtomicAccess().getZReal3ConstantParserRuleCall_6_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__TypeAssignment_7_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicAccess().getTypeBasicTypeEnumRuleCall_7_1_0()); }
		ruleBasicType
		{ after(grammarAccess.getAtomicAccess().getTypeBasicTypeEnumRuleCall_7_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__ValueAssignment_7_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicAccess().getValueREALTerminalRuleCall_7_3_0()); }
		RULE_REAL
		{ after(grammarAccess.getAtomicAccess().getValueREALTerminalRuleCall_7_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__TypeAssignment_8_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicAccess().getTypeBasicTypeEnumRuleCall_8_1_0()); }
		ruleBasicType
		{ after(grammarAccess.getAtomicAccess().getTypeBasicTypeEnumRuleCall_8_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__TypeAssignment_9_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicAccess().getTypeBasicTypeEnumRuleCall_9_1_0()); }
		ruleBasicType
		{ after(grammarAccess.getAtomicAccess().getTypeBasicTypeEnumRuleCall_9_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__FunctionAssignment_10_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicAccess().getFunctionFunctionCrossReference_10_1_0()); }
		(
			{ before(grammarAccess.getAtomicAccess().getFunctionFunctionQualifiedNameParserRuleCall_10_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getAtomicAccess().getFunctionFunctionQualifiedNameParserRuleCall_10_1_0_1()); }
		)
		{ after(grammarAccess.getAtomicAccess().getFunctionFunctionCrossReference_10_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__ArgsAssignment_10_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicAccess().getArgsExpressionParserRuleCall_10_3_0_0()); }
		ruleExpression
		{ after(grammarAccess.getAtomicAccess().getArgsExpressionParserRuleCall_10_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__ArgsAssignment_10_3_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicAccess().getArgsExpressionParserRuleCall_10_3_1_1_0()); }
		ruleExpression
		{ after(grammarAccess.getAtomicAccess().getArgsExpressionParserRuleCall_10_3_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__ReductionAssignment_11_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicAccess().getReductionReductionCrossReference_11_1_0()); }
		(
			{ before(grammarAccess.getAtomicAccess().getReductionReductionQualifiedNameParserRuleCall_11_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getAtomicAccess().getReductionReductionQualifiedNameParserRuleCall_11_1_0_1()); }
		)
		{ after(grammarAccess.getAtomicAccess().getReductionReductionCrossReference_11_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__IteratorAssignment_11_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicAccess().getIteratorSpaceIteratorParserRuleCall_11_3_0()); }
		ruleSpaceIterator
		{ after(grammarAccess.getAtomicAccess().getIteratorSpaceIteratorParserRuleCall_11_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__ArgAssignment_11_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicAccess().getArgExpressionParserRuleCall_11_6_0()); }
		ruleExpression
		{ after(grammarAccess.getAtomicAccess().getArgExpressionParserRuleCall_11_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Real2Constant__XAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReal2ConstantAccess().getXREALTerminalRuleCall_1_0()); }
		RULE_REAL
		{ after(grammarAccess.getReal2ConstantAccess().getXREALTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Real2Constant__YAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReal2ConstantAccess().getYREALTerminalRuleCall_3_0()); }
		RULE_REAL
		{ after(grammarAccess.getReal2ConstantAccess().getYREALTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Real3Constant__XAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReal3ConstantAccess().getXREALTerminalRuleCall_1_0()); }
		RULE_REAL
		{ after(grammarAccess.getReal3ConstantAccess().getXREALTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Real3Constant__YAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReal3ConstantAccess().getYREALTerminalRuleCall_3_0()); }
		RULE_REAL
		{ after(grammarAccess.getReal3ConstantAccess().getYREALTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Real3Constant__ZAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReal3ConstantAccess().getZREALTerminalRuleCall_5_0()); }
		RULE_REAL
		{ after(grammarAccess.getReal3ConstantAccess().getZREALTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarRef__VariableAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVarRefAccess().getVariableVarCrossReference_0_0()); }
		(
			{ before(grammarAccess.getVarRefAccess().getVariableVarIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getVarRefAccess().getVariableVarIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getVarRefAccess().getVariableVarCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarRef__SpaceIteratorsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVarRefAccess().getSpaceIteratorsIteratorRangeOrRefParserRuleCall_1_1_0()); }
		ruleIteratorRangeOrRef
		{ after(grammarAccess.getVarRefAccess().getSpaceIteratorsIteratorRangeOrRefParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarRef__SpaceIteratorsAssignment_1_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVarRefAccess().getSpaceIteratorsIteratorRangeOrRefParserRuleCall_1_2_1_0()); }
		ruleIteratorRangeOrRef
		{ after(grammarAccess.getVarRefAccess().getSpaceIteratorsIteratorRangeOrRefParserRuleCall_1_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarRef__TimeIteratorAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVarRefAccess().getTimeIteratorTimeIteratorRefParserRuleCall_2_1_0()); }
		ruleTimeIteratorRef
		{ after(grammarAccess.getVarRefAccess().getTimeIteratorTimeIteratorRefParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarRef__FieldsAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVarRefAccess().getFieldsIDTerminalRuleCall_3_1_0()); }
		RULE_ID
		{ after(grammarAccess.getVarRefAccess().getFieldsIDTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeIteratorRef__IteratorAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeIteratorRefAccess().getIteratorTimeIteratorCrossReference_0_0()); }
		(
			{ before(grammarAccess.getTimeIteratorRefAccess().getIteratorTimeIteratorIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getTimeIteratorRefAccess().getIteratorTimeIteratorIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getTimeIteratorRefAccess().getIteratorTimeIteratorCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeIteratorRef__InitAssignment_1_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeIteratorRefAccess().getInitEqualsSignKeyword_1_0_0_0()); }
		(
			{ before(grammarAccess.getTimeIteratorRefAccess().getInitEqualsSignKeyword_1_0_0_0()); }
			'='
			{ after(grammarAccess.getTimeIteratorRefAccess().getInitEqualsSignKeyword_1_0_0_0()); }
		)
		{ after(grammarAccess.getTimeIteratorRefAccess().getInitEqualsSignKeyword_1_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeIteratorRef__NextAssignment_1_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeIteratorRefAccess().getNextPlusSignKeyword_1_0_1_0()); }
		(
			{ before(grammarAccess.getTimeIteratorRefAccess().getNextPlusSignKeyword_1_0_1_0()); }
			'+'
			{ after(grammarAccess.getTimeIteratorRefAccess().getNextPlusSignKeyword_1_0_1_0()); }
		)
		{ after(grammarAccess.getTimeIteratorRefAccess().getNextPlusSignKeyword_1_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeIteratorRef__ValueAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeIteratorRefAccess().getValueINTTerminalRuleCall_1_1_0()); }
		RULE_INT
		{ after(grammarAccess.getTimeIteratorRefAccess().getValueINTTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'\u0394'..'\u03F2'|'\u220F'..'\u221C'|'_') ('a'..'z'|'A'..'Z'|'\u0394'..'\u03F2'|'0'..'9'|'\u2211'|'_')*;

RULE_REAL : ('0'..'9')+ '.' ('0'..'9')+ ('e' ('+'|'-') ('0'..'9')+)?;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

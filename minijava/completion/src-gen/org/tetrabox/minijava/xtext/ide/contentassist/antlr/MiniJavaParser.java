package org.tetrabox.minijava.xtext.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import kaulua.contentassist.antlr.AbstractContentAssistParser;
import org.tetrabox.minijava.xtext.ide.contentassist.antlr.internal.InternalMiniJavaParser;
import org.tetrabox.minijava.xtext.services.MiniJavaGrammarAccess;

public class MiniJavaParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MiniJavaGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MiniJavaGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getTypeDeclarationAccess().getAlternatives(), "rule__TypeDeclaration__Alternatives");
			builder.put(grammarAccess.getMemberAccess().getAlternatives(), "rule__Member__Alternatives");
			builder.put(grammarAccess.getMethodAccess().getAlternatives_8(), "rule__Method__Alternatives_8");
			builder.put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
			builder.put(grammarAccess.getSingleTypeRefAccess().getAlternatives(), "rule__SingleTypeRef__Alternatives");
			builder.put(grammarAccess.getNamedElementAccess().getAlternatives(), "rule__NamedElement__Alternatives");
			builder.put(grammarAccess.getTypedDeclarationAccess().getAlternatives(), "rule__TypedDeclaration__Alternatives");
			builder.put(grammarAccess.getSymbolAccess().getAlternatives(), "rule__Symbol__Alternatives");
			builder.put(grammarAccess.getAssigneeAccess().getAlternatives(), "rule__Assignee__Alternatives");
			builder.put(grammarAccess.getEqualityAccess().getAlternatives_1_0(), "rule__Equality__Alternatives_1_0");
			builder.put(grammarAccess.getComparisonAccess().getAlternatives_1_0(), "rule__Comparison__Alternatives_1_0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0(), "rule__PlusOrMinus__Alternatives_1_0");
			builder.put(grammarAccess.getMulOrDivAccess().getAlternatives_1_0(), "rule__MulOrDiv__Alternatives_1_0");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getSelectionExpressionAccess().getAlternatives_1(), "rule__SelectionExpression__Alternatives_1");
			builder.put(grammarAccess.getTerminalExpressionAccess().getAlternatives(), "rule__TerminalExpression__Alternatives");
			builder.put(grammarAccess.getTerminalExpressionAccess().getValueAlternatives_2_1_0(), "rule__TerminalExpression__ValueAlternatives_2_1_0");
			builder.put(grammarAccess.getAccessLevelAccess().getAlternatives(), "rule__AccessLevel__Alternatives");
			builder.put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
			builder.put(grammarAccess.getProgramAccess().getGroup_0(), "rule__Program__Group_0__0");
			builder.put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
			builder.put(grammarAccess.getClassAccess().getGroup(), "rule__Class__Group__0");
			builder.put(grammarAccess.getClassAccess().getGroup_4(), "rule__Class__Group_4__0");
			builder.put(grammarAccess.getClassAccess().getGroup_5(), "rule__Class__Group_5__0");
			builder.put(grammarAccess.getClassAccess().getGroup_5_2(), "rule__Class__Group_5_2__0");
			builder.put(grammarAccess.getInterfaceAccess().getGroup(), "rule__Interface__Group__0");
			builder.put(grammarAccess.getInterfaceAccess().getGroup_3(), "rule__Interface__Group_3__0");
			builder.put(grammarAccess.getInterfaceAccess().getGroup_3_2(), "rule__Interface__Group_3_2__0");
			builder.put(grammarAccess.getMethodAccess().getGroup(), "rule__Method__Group__0");
			builder.put(grammarAccess.getMethodAccess().getGroup_6(), "rule__Method__Group_6__0");
			builder.put(grammarAccess.getMethodAccess().getGroup_6_1(), "rule__Method__Group_6_1__0");
			builder.put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
			builder.put(grammarAccess.getFieldAccess().getGroup(), "rule__Field__Group__0");
			builder.put(grammarAccess.getFieldAccess().getGroup_3(), "rule__Field__Group_3__0");
			builder.put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
			builder.put(grammarAccess.getStatementAccess().getGroup_0(), "rule__Statement__Group_0__0");
			builder.put(grammarAccess.getStatementAccess().getGroup_1(), "rule__Statement__Group_1__0");
			builder.put(grammarAccess.getStatementAccess().getGroup_5(), "rule__Statement__Group_5__0");
			builder.put(grammarAccess.getStatementAccess().getGroup_7(), "rule__Statement__Group_7__0");
			builder.put(grammarAccess.getPrintStatementAccess().getGroup(), "rule__PrintStatement__Group__0");
			builder.put(grammarAccess.getReturnAccess().getGroup(), "rule__Return__Group__0");
			builder.put(grammarAccess.getIfStatementAccess().getGroup(), "rule__IfStatement__Group__0");
			builder.put(grammarAccess.getIfStatementAccess().getGroup_5(), "rule__IfStatement__Group_5__0");
			builder.put(grammarAccess.getWhileStatementAccess().getGroup(), "rule__WhileStatement__Group__0");
			builder.put(grammarAccess.getForStatementAccess().getGroup(), "rule__ForStatement__Group__0");
			builder.put(grammarAccess.getTypeRefAccess().getGroup(), "rule__TypeRef__Group__0");
			builder.put(grammarAccess.getTypeRefAccess().getGroup_1(), "rule__TypeRef__Group_1__0");
			builder.put(grammarAccess.getSingleTypeRefAccess().getGroup_1(), "rule__SingleTypeRef__Group_1__0");
			builder.put(grammarAccess.getSingleTypeRefAccess().getGroup_2(), "rule__SingleTypeRef__Group_2__0");
			builder.put(grammarAccess.getSingleTypeRefAccess().getGroup_3(), "rule__SingleTypeRef__Group_3__0");
			builder.put(grammarAccess.getSingleTypeRefAccess().getGroup_4(), "rule__SingleTypeRef__Group_4__0");
			builder.put(grammarAccess.getVariableDeclarationAccess().getGroup(), "rule__VariableDeclaration__Group__0");
			builder.put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
			builder.put(grammarAccess.getOrAccess().getGroup(), "rule__Or__Group__0");
			builder.put(grammarAccess.getOrAccess().getGroup_1(), "rule__Or__Group_1__0");
			builder.put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
			builder.put(grammarAccess.getAndAccess().getGroup_1(), "rule__And__Group_1__0");
			builder.put(grammarAccess.getEqualityAccess().getGroup(), "rule__Equality__Group__0");
			builder.put(grammarAccess.getEqualityAccess().getGroup_1(), "rule__Equality__Group_1__0");
			builder.put(grammarAccess.getEqualityAccess().getGroup_1_0_0(), "rule__Equality__Group_1_0_0__0");
			builder.put(grammarAccess.getEqualityAccess().getGroup_1_0_1(), "rule__Equality__Group_1_0_1__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup_1(), "rule__Comparison__Group_1__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup_1_0_0(), "rule__Comparison__Group_1_0_0__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup_1_0_1(), "rule__Comparison__Group_1_0_1__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup_1_0_2(), "rule__Comparison__Group_1_0_2__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup_1_0_3(), "rule__Comparison__Group_1_0_3__0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getGroup(), "rule__PlusOrMinus__Group__0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getGroup_1(), "rule__PlusOrMinus__Group_1__0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0(), "rule__PlusOrMinus__Group_1_0_0__0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1(), "rule__PlusOrMinus__Group_1_0_1__0");
			builder.put(grammarAccess.getMulOrDivAccess().getGroup(), "rule__MulOrDiv__Group__0");
			builder.put(grammarAccess.getMulOrDivAccess().getGroup_1(), "rule__MulOrDiv__Group_1__0");
			builder.put(grammarAccess.getMulOrDivAccess().getGroup_1_0_0(), "rule__MulOrDiv__Group_1_0_0__0");
			builder.put(grammarAccess.getMulOrDivAccess().getGroup_1_0_1(), "rule__MulOrDiv__Group_1_0_1__0");
			builder.put(grammarAccess.getArrayAccessAccess().getGroup(), "rule__ArrayAccess__Group__0");
			builder.put(grammarAccess.getArrayAccessAccess().getGroup_1(), "rule__ArrayAccess__Group_1__0");
			builder.put(grammarAccess.getArrayLengthAccess().getGroup(), "rule__ArrayLength__Group__0");
			builder.put(grammarAccess.getArrayLengthAccess().getGroup_1(), "rule__ArrayLength__Group_1__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_0(), "rule__Primary__Group_0__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_1(), "rule__Primary__Group_1__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_2(), "rule__Primary__Group_2__0");
			builder.put(grammarAccess.getSelectionExpressionAccess().getGroup(), "rule__SelectionExpression__Group__0");
			builder.put(grammarAccess.getSelectionExpressionAccess().getGroup_1_0(), "rule__SelectionExpression__Group_1_0__0");
			builder.put(grammarAccess.getSelectionExpressionAccess().getGroup_1_1(), "rule__SelectionExpression__Group_1_1__0");
			builder.put(grammarAccess.getSelectionExpressionAccess().getGroup_1_1_4(), "rule__SelectionExpression__Group_1_1_4__0");
			builder.put(grammarAccess.getSelectionExpressionAccess().getGroup_1_1_4_1(), "rule__SelectionExpression__Group_1_1_4_1__0");
			builder.put(grammarAccess.getTerminalExpressionAccess().getGroup_0(), "rule__TerminalExpression__Group_0__0");
			builder.put(grammarAccess.getTerminalExpressionAccess().getGroup_1(), "rule__TerminalExpression__Group_1__0");
			builder.put(grammarAccess.getTerminalExpressionAccess().getGroup_2(), "rule__TerminalExpression__Group_2__0");
			builder.put(grammarAccess.getTerminalExpressionAccess().getGroup_3(), "rule__TerminalExpression__Group_3__0");
			builder.put(grammarAccess.getTerminalExpressionAccess().getGroup_4(), "rule__TerminalExpression__Group_4__0");
			builder.put(grammarAccess.getTerminalExpressionAccess().getGroup_5(), "rule__TerminalExpression__Group_5__0");
			builder.put(grammarAccess.getTerminalExpressionAccess().getGroup_6(), "rule__TerminalExpression__Group_6__0");
			builder.put(grammarAccess.getTerminalExpressionAccess().getGroup_6_4(), "rule__TerminalExpression__Group_6_4__0");
			builder.put(grammarAccess.getTerminalExpressionAccess().getGroup_6_4_1(), "rule__TerminalExpression__Group_6_4_1__0");
			builder.put(grammarAccess.getTerminalExpressionAccess().getGroup_7(), "rule__TerminalExpression__Group_7__0");
			builder.put(grammarAccess.getTerminalExpressionAccess().getGroup_8(), "rule__TerminalExpression__Group_8__0");
			builder.put(grammarAccess.getProgramAccess().getNameAssignment_0_1(), "rule__Program__NameAssignment_0_1");
			builder.put(grammarAccess.getProgramAccess().getImportsAssignment_1(), "rule__Program__ImportsAssignment_1");
			builder.put(grammarAccess.getProgramAccess().getClassesAssignment_2(), "rule__Program__ClassesAssignment_2");
			builder.put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
			builder.put(grammarAccess.getClassAccess().getAccessLevelAssignment_0(), "rule__Class__AccessLevelAssignment_0");
			builder.put(grammarAccess.getClassAccess().getAbstractAssignment_1(), "rule__Class__AbstractAssignment_1");
			builder.put(grammarAccess.getClassAccess().getNameAssignment_3(), "rule__Class__NameAssignment_3");
			builder.put(grammarAccess.getClassAccess().getSuperClassAssignment_4_1(), "rule__Class__SuperClassAssignment_4_1");
			builder.put(grammarAccess.getClassAccess().getImplementsAssignment_5_1(), "rule__Class__ImplementsAssignment_5_1");
			builder.put(grammarAccess.getClassAccess().getImplementsAssignment_5_2_1(), "rule__Class__ImplementsAssignment_5_2_1");
			builder.put(grammarAccess.getClassAccess().getMembersAssignment_7(), "rule__Class__MembersAssignment_7");
			builder.put(grammarAccess.getInterfaceAccess().getAccessLevelAssignment_0(), "rule__Interface__AccessLevelAssignment_0");
			builder.put(grammarAccess.getInterfaceAccess().getNameAssignment_2(), "rule__Interface__NameAssignment_2");
			builder.put(grammarAccess.getInterfaceAccess().getImplementsAssignment_3_1(), "rule__Interface__ImplementsAssignment_3_1");
			builder.put(grammarAccess.getInterfaceAccess().getImplementsAssignment_3_2_1(), "rule__Interface__ImplementsAssignment_3_2_1");
			builder.put(grammarAccess.getInterfaceAccess().getMembersAssignment_5(), "rule__Interface__MembersAssignment_5");
			builder.put(grammarAccess.getMethodAccess().getAccessAssignment_0(), "rule__Method__AccessAssignment_0");
			builder.put(grammarAccess.getMethodAccess().getAbstractAssignment_1(), "rule__Method__AbstractAssignment_1");
			builder.put(grammarAccess.getMethodAccess().getStaticAssignment_2(), "rule__Method__StaticAssignment_2");
			builder.put(grammarAccess.getMethodAccess().getTypeRefAssignment_3(), "rule__Method__TypeRefAssignment_3");
			builder.put(grammarAccess.getMethodAccess().getNameAssignment_4(), "rule__Method__NameAssignment_4");
			builder.put(grammarAccess.getMethodAccess().getParamsAssignment_6_0(), "rule__Method__ParamsAssignment_6_0");
			builder.put(grammarAccess.getMethodAccess().getParamsAssignment_6_1_1(), "rule__Method__ParamsAssignment_6_1_1");
			builder.put(grammarAccess.getMethodAccess().getBodyAssignment_8_0(), "rule__Method__BodyAssignment_8_0");
			builder.put(grammarAccess.getParameterAccess().getTypeRefAssignment_0(), "rule__Parameter__TypeRefAssignment_0");
			builder.put(grammarAccess.getParameterAccess().getNameAssignment_1(), "rule__Parameter__NameAssignment_1");
			builder.put(grammarAccess.getFieldAccess().getAccessAssignment_0(), "rule__Field__AccessAssignment_0");
			builder.put(grammarAccess.getFieldAccess().getTypeRefAssignment_1(), "rule__Field__TypeRefAssignment_1");
			builder.put(grammarAccess.getFieldAccess().getNameAssignment_2(), "rule__Field__NameAssignment_2");
			builder.put(grammarAccess.getFieldAccess().getDefaultValueAssignment_3_1(), "rule__Field__DefaultValueAssignment_3_1");
			builder.put(grammarAccess.getBlockAccess().getStatementsAssignment_2(), "rule__Block__StatementsAssignment_2");
			builder.put(grammarAccess.getPrintStatementAccess().getExpressionAssignment_6(), "rule__PrintStatement__ExpressionAssignment_6");
			builder.put(grammarAccess.getReturnAccess().getExpressionAssignment_1(), "rule__Return__ExpressionAssignment_1");
			builder.put(grammarAccess.getIfStatementAccess().getExpressionAssignment_2(), "rule__IfStatement__ExpressionAssignment_2");
			builder.put(grammarAccess.getIfStatementAccess().getThenBlockAssignment_4(), "rule__IfStatement__ThenBlockAssignment_4");
			builder.put(grammarAccess.getIfStatementAccess().getElseBlockAssignment_5_1(), "rule__IfStatement__ElseBlockAssignment_5_1");
			builder.put(grammarAccess.getWhileStatementAccess().getConditionAssignment_2(), "rule__WhileStatement__ConditionAssignment_2");
			builder.put(grammarAccess.getWhileStatementAccess().getBlockAssignment_4(), "rule__WhileStatement__BlockAssignment_4");
			builder.put(grammarAccess.getForStatementAccess().getDeclarationAssignment_2(), "rule__ForStatement__DeclarationAssignment_2");
			builder.put(grammarAccess.getForStatementAccess().getConditionAssignment_4(), "rule__ForStatement__ConditionAssignment_4");
			builder.put(grammarAccess.getForStatementAccess().getProgressionAssignment_6(), "rule__ForStatement__ProgressionAssignment_6");
			builder.put(grammarAccess.getForStatementAccess().getBlockAssignment_8(), "rule__ForStatement__BlockAssignment_8");
			builder.put(grammarAccess.getClassRefAccess().getReferencedClassAssignment(), "rule__ClassRef__ReferencedClassAssignment");
			builder.put(grammarAccess.getVariableDeclarationAccess().getTypeRefAssignment_0(), "rule__VariableDeclaration__TypeRefAssignment_0");
			builder.put(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1(), "rule__VariableDeclaration__NameAssignment_1");
			builder.put(grammarAccess.getAssignmentAccess().getAssigneeAssignment_0(), "rule__Assignment__AssigneeAssignment_0");
			builder.put(grammarAccess.getAssignmentAccess().getValueAssignment_2(), "rule__Assignment__ValueAssignment_2");
			builder.put(grammarAccess.getOrAccess().getRightAssignment_1_2(), "rule__Or__RightAssignment_1_2");
			builder.put(grammarAccess.getAndAccess().getRightAssignment_1_2(), "rule__And__RightAssignment_1_2");
			builder.put(grammarAccess.getEqualityAccess().getRightAssignment_1_1(), "rule__Equality__RightAssignment_1_1");
			builder.put(grammarAccess.getComparisonAccess().getRightAssignment_1_1(), "rule__Comparison__RightAssignment_1_1");
			builder.put(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1(), "rule__PlusOrMinus__RightAssignment_1_1");
			builder.put(grammarAccess.getMulOrDivAccess().getRightAssignment_1_1(), "rule__MulOrDiv__RightAssignment_1_1");
			builder.put(grammarAccess.getArrayAccessAccess().getIndexAssignment_1_2(), "rule__ArrayAccess__IndexAssignment_1_2");
			builder.put(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2(), "rule__Primary__ExpressionAssignment_1_2");
			builder.put(grammarAccess.getPrimaryAccess().getExpressionAssignment_2_2(), "rule__Primary__ExpressionAssignment_2_2");
			builder.put(grammarAccess.getSelectionExpressionAccess().getFieldAssignment_1_0_2(), "rule__SelectionExpression__FieldAssignment_1_0_2");
			builder.put(grammarAccess.getSelectionExpressionAccess().getMethodAssignment_1_1_2(), "rule__SelectionExpression__MethodAssignment_1_1_2");
			builder.put(grammarAccess.getSelectionExpressionAccess().getArgsAssignment_1_1_4_0(), "rule__SelectionExpression__ArgsAssignment_1_1_4_0");
			builder.put(grammarAccess.getSelectionExpressionAccess().getArgsAssignment_1_1_4_1_1(), "rule__SelectionExpression__ArgsAssignment_1_1_4_1_1");
			builder.put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_1(), "rule__TerminalExpression__ValueAssignment_0_1");
			builder.put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1(), "rule__TerminalExpression__ValueAssignment_1_1");
			builder.put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1(), "rule__TerminalExpression__ValueAssignment_2_1");
			builder.put(grammarAccess.getTerminalExpressionAccess().getTypeAssignment_6_2(), "rule__TerminalExpression__TypeAssignment_6_2");
			builder.put(grammarAccess.getTerminalExpressionAccess().getArgsAssignment_6_4_0(), "rule__TerminalExpression__ArgsAssignment_6_4_0");
			builder.put(grammarAccess.getTerminalExpressionAccess().getArgsAssignment_6_4_1_1(), "rule__TerminalExpression__ArgsAssignment_6_4_1_1");
			builder.put(grammarAccess.getTerminalExpressionAccess().getTypeAssignment_7_2(), "rule__TerminalExpression__TypeAssignment_7_2");
			builder.put(grammarAccess.getTerminalExpressionAccess().getSizeAssignment_7_4(), "rule__TerminalExpression__SizeAssignment_7_4");
			builder.put(grammarAccess.getTerminalExpressionAccess().getSymbolAssignment_8_1(), "rule__TerminalExpression__SymbolAssignment_8_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MiniJavaGrammarAccess grammarAccess;

	@Override
	protected InternalMiniJavaParser createParser() {
		InternalMiniJavaParser result = new InternalMiniJavaParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MiniJavaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MiniJavaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}

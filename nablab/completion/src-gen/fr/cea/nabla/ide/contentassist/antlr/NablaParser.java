package fr.cea.nabla.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.cea.nabla.ide.contentassist.antlr.internal.InternalNablaParser;
import fr.cea.nabla.services.NablaGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import kaulua.contentassist.antlr.AbstractContentAssistParser;

public class NablaParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(NablaGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, NablaGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getNablaModuleAccess().getVariablesAlternatives_5_0(), "rule__NablaModule__VariablesAlternatives_5_0");
			builder.put(grammarAccess.getDeclarationBlockAccess().getAlternatives(), "rule__DeclarationBlock__Alternatives");
			builder.put(grammarAccess.getDeclarationBlockAccess().getFunctionsAlternatives_1_3_0(), "rule__DeclarationBlock__FunctionsAlternatives_1_3_0");
			builder.put(grammarAccess.getJobAccess().getAlternatives(), "rule__Job__Alternatives");
			builder.put(grammarAccess.getInstructionAccess().getAlternatives(), "rule__Instruction__Alternatives");
			builder.put(grammarAccess.getSpaceIteratorRefAccess().getAlternatives(), "rule__SpaceIteratorRef__Alternatives");
			builder.put(grammarAccess.getSpaceIteratorRefAccess().getAlternatives_0_0(), "rule__SpaceIteratorRef__Alternatives_0_0");
			builder.put(grammarAccess.getVarAccess().getAlternatives(), "rule__Var__Alternatives");
			builder.put(grammarAccess.getConnectivityAccess().getAlternatives_3(), "rule__Connectivity__Alternatives_3");
			builder.put(grammarAccess.getItemArgTypeAccess().getAlternatives(), "rule__ItemArgType__Alternatives");
			builder.put(grammarAccess.getFunctionArgAccess().getAlternatives_1(), "rule__FunctionArg__Alternatives_1");
			builder.put(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0(), "rule__Equality__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0(), "rule__Comparison__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0(), "rule__PlusOrMinus__Alternatives_1_0");
			builder.put(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0(), "rule__MulOrDiv__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getAtomicAccess().getAlternatives(), "rule__Atomic__Alternatives");
			builder.put(grammarAccess.getAtomicAccess().getAlternatives_4_1(), "rule__Atomic__Alternatives_4_1");
			builder.put(grammarAccess.getIteratorRangeOrRefAccess().getAlternatives(), "rule__IteratorRangeOrRef__Alternatives");
			builder.put(grammarAccess.getTimeIteratorRefAccess().getAlternatives_1_0(), "rule__TimeIteratorRef__Alternatives_1_0");
			builder.put(grammarAccess.getBasicTypeAccess().getAlternatives(), "rule__BasicType__Alternatives");
			builder.put(grammarAccess.getItemTypeAccess().getAlternatives(), "rule__ItemType__Alternatives");
			builder.put(grammarAccess.getNablaModuleAccess().getGroup(), "rule__NablaModule__Group__0");
			builder.put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
			builder.put(grammarAccess.getDeclarationBlockAccess().getGroup_0(), "rule__DeclarationBlock__Group_0__0");
			builder.put(grammarAccess.getDeclarationBlockAccess().getGroup_1(), "rule__DeclarationBlock__Group_1__0");
			builder.put(grammarAccess.getJobAccess().getGroup_0(), "rule__Job__Group_0__0");
			builder.put(grammarAccess.getJobAccess().getGroup_1(), "rule__Job__Group_1__0");
			builder.put(grammarAccess.getInstructionAccess().getGroup_2(), "rule__Instruction__Group_2__0");
			builder.put(grammarAccess.getInstructionAccess().getGroup_3(), "rule__Instruction__Group_3__0");
			builder.put(grammarAccess.getInstructionAccess().getGroup_4(), "rule__Instruction__Group_4__0");
			builder.put(grammarAccess.getInstructionAccess().getGroup_5(), "rule__Instruction__Group_5__0");
			builder.put(grammarAccess.getInstructionAccess().getGroup_5_6(), "rule__Instruction__Group_5_6__0");
			builder.put(grammarAccess.getTimeIteratorAccess().getGroup(), "rule__TimeIterator__Group__0");
			builder.put(grammarAccess.getSpaceIteratorAccess().getGroup(), "rule__SpaceIterator__Group__0");
			builder.put(grammarAccess.getSpaceIteratorRangeAccess().getGroup(), "rule__SpaceIteratorRange__Group__0");
			builder.put(grammarAccess.getSpaceIteratorRangeAccess().getGroup_2(), "rule__SpaceIteratorRange__Group_2__0");
			builder.put(grammarAccess.getSpaceIteratorRangeAccess().getGroup_2_1(), "rule__SpaceIteratorRange__Group_2_1__0");
			builder.put(grammarAccess.getSpaceIteratorRefAccess().getGroup_0(), "rule__SpaceIteratorRef__Group_0__0");
			builder.put(grammarAccess.getScalarVarDefinitionAccess().getGroup(), "rule__ScalarVarDefinition__Group__0");
			builder.put(grammarAccess.getVarGroupDeclarationAccess().getGroup(), "rule__VarGroupDeclaration__Group__0");
			builder.put(grammarAccess.getVarGroupDeclarationAccess().getGroup_2(), "rule__VarGroupDeclaration__Group_2__0");
			builder.put(grammarAccess.getArrayVarAccess().getGroup(), "rule__ArrayVar__Group__0");
			builder.put(grammarAccess.getArrayVarAccess().getGroup_3(), "rule__ArrayVar__Group_3__0");
			builder.put(grammarAccess.getConnectivityAccess().getGroup(), "rule__Connectivity__Group__0");
			builder.put(grammarAccess.getConnectivityAccess().getGroup_3_0(), "rule__Connectivity__Group_3_0__0");
			builder.put(grammarAccess.getConnectivityAccess().getGroup_3_0_1(), "rule__Connectivity__Group_3_0_1__0");
			builder.put(grammarAccess.getItemArgTypeAccess().getGroup_0(), "rule__ItemArgType__Group_0__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup_4(), "rule__Function__Group_4__0");
			builder.put(grammarAccess.getFunctionArgAccess().getGroup(), "rule__FunctionArg__Group__0");
			builder.put(grammarAccess.getFunctionArgAccess().getGroup_1_0(), "rule__FunctionArg__Group_1_0__0");
			builder.put(grammarAccess.getFunctionArgAccess().getGroup_1_0_1(), "rule__FunctionArg__Group_1_0_1__0");
			builder.put(grammarAccess.getReductionAccess().getGroup(), "rule__Reduction__Group__0");
			builder.put(grammarAccess.getReductionAccess().getGroup_4(), "rule__Reduction__Group_4__0");
			builder.put(grammarAccess.getReductionArgAccess().getGroup(), "rule__ReductionArg__Group__0");
			builder.put(grammarAccess.getOrAccess().getGroup(), "rule__Or__Group__0");
			builder.put(grammarAccess.getOrAccess().getGroup_1(), "rule__Or__Group_1__0");
			builder.put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
			builder.put(grammarAccess.getAndAccess().getGroup_1(), "rule__And__Group_1__0");
			builder.put(grammarAccess.getEqualityAccess().getGroup(), "rule__Equality__Group__0");
			builder.put(grammarAccess.getEqualityAccess().getGroup_1(), "rule__Equality__Group_1__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup_1(), "rule__Comparison__Group_1__0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getGroup(), "rule__PlusOrMinus__Group__0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getGroup_1(), "rule__PlusOrMinus__Group_1__0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0(), "rule__PlusOrMinus__Group_1_0_0__0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1(), "rule__PlusOrMinus__Group_1_0_1__0");
			builder.put(grammarAccess.getMulOrDivAccess().getGroup(), "rule__MulOrDiv__Group__0");
			builder.put(grammarAccess.getMulOrDivAccess().getGroup_1(), "rule__MulOrDiv__Group_1__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_0(), "rule__Primary__Group_0__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_1(), "rule__Primary__Group_1__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_2(), "rule__Primary__Group_2__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_0(), "rule__Atomic__Group_0__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_1(), "rule__Atomic__Group_1__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_4(), "rule__Atomic__Group_4__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_5(), "rule__Atomic__Group_5__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_6(), "rule__Atomic__Group_6__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_7(), "rule__Atomic__Group_7__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_8(), "rule__Atomic__Group_8__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_9(), "rule__Atomic__Group_9__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_10(), "rule__Atomic__Group_10__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_10_3(), "rule__Atomic__Group_10_3__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_10_3_1(), "rule__Atomic__Group_10_3_1__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_11(), "rule__Atomic__Group_11__0");
			builder.put(grammarAccess.getReal2ConstantAccess().getGroup(), "rule__Real2Constant__Group__0");
			builder.put(grammarAccess.getReal3ConstantAccess().getGroup(), "rule__Real3Constant__Group__0");
			builder.put(grammarAccess.getVarRefAccess().getGroup(), "rule__VarRef__Group__0");
			builder.put(grammarAccess.getVarRefAccess().getGroup_1(), "rule__VarRef__Group_1__0");
			builder.put(grammarAccess.getVarRefAccess().getGroup_1_2(), "rule__VarRef__Group_1_2__0");
			builder.put(grammarAccess.getVarRefAccess().getGroup_2(), "rule__VarRef__Group_2__0");
			builder.put(grammarAccess.getVarRefAccess().getGroup_3(), "rule__VarRef__Group_3__0");
			builder.put(grammarAccess.getTimeIteratorRefAccess().getGroup(), "rule__TimeIteratorRef__Group__0");
			builder.put(grammarAccess.getTimeIteratorRefAccess().getGroup_1(), "rule__TimeIteratorRef__Group_1__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
			builder.put(grammarAccess.getNablaModuleAccess().getNameAssignment_1(), "rule__NablaModule__NameAssignment_1");
			builder.put(grammarAccess.getNablaModuleAccess().getImportsAssignment_3(), "rule__NablaModule__ImportsAssignment_3");
			builder.put(grammarAccess.getNablaModuleAccess().getBlocksAssignment_4(), "rule__NablaModule__BlocksAssignment_4");
			builder.put(grammarAccess.getNablaModuleAccess().getVariablesAssignment_5(), "rule__NablaModule__VariablesAssignment_5");
			builder.put(grammarAccess.getNablaModuleAccess().getJobsAssignment_6(), "rule__NablaModule__JobsAssignment_6");
			builder.put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
			builder.put(grammarAccess.getDeclarationBlockAccess().getConnectivitiesAssignment_0_3(), "rule__DeclarationBlock__ConnectivitiesAssignment_0_3");
			builder.put(grammarAccess.getDeclarationBlockAccess().getFunctionsAssignment_1_3(), "rule__DeclarationBlock__FunctionsAssignment_1_3");
			builder.put(grammarAccess.getJobAccess().getNameAssignment_0_1(), "rule__Job__NameAssignment_0_1");
			builder.put(grammarAccess.getJobAccess().getInstructionAssignment_0_3(), "rule__Job__InstructionAssignment_0_3");
			builder.put(grammarAccess.getJobAccess().getNameAssignment_1_1(), "rule__Job__NameAssignment_1_1");
			builder.put(grammarAccess.getJobAccess().getIteratorAssignment_1_4(), "rule__Job__IteratorAssignment_1_4");
			builder.put(grammarAccess.getJobAccess().getInitializationAssignment_1_6(), "rule__Job__InitializationAssignment_1_6");
			builder.put(grammarAccess.getJobAccess().getBodyAssignment_1_8(), "rule__Job__BodyAssignment_1_8");
			builder.put(grammarAccess.getInstructionAccess().getInstructionsAssignment_2_2(), "rule__Instruction__InstructionsAssignment_2_2");
			builder.put(grammarAccess.getInstructionAccess().getVarRefAssignment_3_1(), "rule__Instruction__VarRefAssignment_3_1");
			builder.put(grammarAccess.getInstructionAccess().getExpressionAssignment_3_3(), "rule__Instruction__ExpressionAssignment_3_3");
			builder.put(grammarAccess.getInstructionAccess().getIteratorAssignment_4_2(), "rule__Instruction__IteratorAssignment_4_2");
			builder.put(grammarAccess.getInstructionAccess().getBodyAssignment_4_4(), "rule__Instruction__BodyAssignment_4_4");
			builder.put(grammarAccess.getInstructionAccess().getConditionAssignment_5_3(), "rule__Instruction__ConditionAssignment_5_3");
			builder.put(grammarAccess.getInstructionAccess().getThenAssignment_5_5(), "rule__Instruction__ThenAssignment_5_5");
			builder.put(grammarAccess.getInstructionAccess().getElseAssignment_5_6_1(), "rule__Instruction__ElseAssignment_5_6_1");
			builder.put(grammarAccess.getTimeIteratorAccess().getNameAssignment_0(), "rule__TimeIterator__NameAssignment_0");
			builder.put(grammarAccess.getSpaceIteratorAccess().getNameAssignment_0(), "rule__SpaceIterator__NameAssignment_0");
			builder.put(grammarAccess.getSpaceIteratorAccess().getRangeAssignment_2(), "rule__SpaceIterator__RangeAssignment_2");
			builder.put(grammarAccess.getSpaceIteratorRangeAccess().getConnectivityAssignment_0(), "rule__SpaceIteratorRange__ConnectivityAssignment_0");
			builder.put(grammarAccess.getSpaceIteratorRangeAccess().getArgsAssignment_2_0(), "rule__SpaceIteratorRange__ArgsAssignment_2_0");
			builder.put(grammarAccess.getSpaceIteratorRangeAccess().getArgsAssignment_2_1_1(), "rule__SpaceIteratorRange__ArgsAssignment_2_1_1");
			builder.put(grammarAccess.getSpaceIteratorRefAccess().getPrevAssignment_0_0_0(), "rule__SpaceIteratorRef__PrevAssignment_0_0_0");
			builder.put(grammarAccess.getSpaceIteratorRefAccess().getNextAssignment_0_0_1(), "rule__SpaceIteratorRef__NextAssignment_0_0_1");
			builder.put(grammarAccess.getSpaceIteratorRefAccess().getIteratorAssignment_0_2(), "rule__SpaceIteratorRef__IteratorAssignment_0_2");
			builder.put(grammarAccess.getSpaceIteratorRefAccess().getIteratorAssignment_1(), "rule__SpaceIteratorRef__IteratorAssignment_1");
			builder.put(grammarAccess.getScalarVarDefinitionAccess().getConstAssignment_0(), "rule__ScalarVarDefinition__ConstAssignment_0");
			builder.put(grammarAccess.getScalarVarDefinitionAccess().getTypeAssignment_1(), "rule__ScalarVarDefinition__TypeAssignment_1");
			builder.put(grammarAccess.getScalarVarDefinitionAccess().getVariableAssignment_2(), "rule__ScalarVarDefinition__VariableAssignment_2");
			builder.put(grammarAccess.getScalarVarDefinitionAccess().getDefaultValueAssignment_4(), "rule__ScalarVarDefinition__DefaultValueAssignment_4");
			builder.put(grammarAccess.getVarGroupDeclarationAccess().getTypeAssignment_0(), "rule__VarGroupDeclaration__TypeAssignment_0");
			builder.put(grammarAccess.getVarGroupDeclarationAccess().getVariablesAssignment_1(), "rule__VarGroupDeclaration__VariablesAssignment_1");
			builder.put(grammarAccess.getVarGroupDeclarationAccess().getVariablesAssignment_2_1(), "rule__VarGroupDeclaration__VariablesAssignment_2_1");
			builder.put(grammarAccess.getScalarVarAccess().getNameAssignment(), "rule__ScalarVar__NameAssignment");
			builder.put(grammarAccess.getArrayVarAccess().getNameAssignment_0(), "rule__ArrayVar__NameAssignment_0");
			builder.put(grammarAccess.getArrayVarAccess().getDimensionsAssignment_2(), "rule__ArrayVar__DimensionsAssignment_2");
			builder.put(grammarAccess.getArrayVarAccess().getDimensionsAssignment_3_1(), "rule__ArrayVar__DimensionsAssignment_3_1");
			builder.put(grammarAccess.getConnectivityAccess().getNameAssignment_0(), "rule__Connectivity__NameAssignment_0");
			builder.put(grammarAccess.getConnectivityAccess().getInTypesAssignment_3_0_0(), "rule__Connectivity__InTypesAssignment_3_0_0");
			builder.put(grammarAccess.getConnectivityAccess().getInTypesAssignment_3_0_1_1(), "rule__Connectivity__InTypesAssignment_3_0_1_1");
			builder.put(grammarAccess.getConnectivityAccess().getReturnTypeAssignment_6(), "rule__Connectivity__ReturnTypeAssignment_6");
			builder.put(grammarAccess.getItemArgTypeAccess().getMultipleAssignment_0_0(), "rule__ItemArgType__MultipleAssignment_0_0");
			builder.put(grammarAccess.getItemArgTypeAccess().getTypeAssignment_0_1(), "rule__ItemArgType__TypeAssignment_0_1");
			builder.put(grammarAccess.getItemArgTypeAccess().getTypeAssignment_1(), "rule__ItemArgType__TypeAssignment_1");
			builder.put(grammarAccess.getFunctionAccess().getNameAssignment_1(), "rule__Function__NameAssignment_1");
			builder.put(grammarAccess.getFunctionAccess().getArgGroupsAssignment_3(), "rule__Function__ArgGroupsAssignment_3");
			builder.put(grammarAccess.getFunctionAccess().getArgGroupsAssignment_4_1(), "rule__Function__ArgGroupsAssignment_4_1");
			builder.put(grammarAccess.getFunctionArgAccess().getInTypesAssignment_1_0_0(), "rule__FunctionArg__InTypesAssignment_1_0_0");
			builder.put(grammarAccess.getFunctionArgAccess().getInTypesAssignment_1_0_1_1(), "rule__FunctionArg__InTypesAssignment_1_0_1_1");
			builder.put(grammarAccess.getFunctionArgAccess().getReturnTypeAssignment_4(), "rule__FunctionArg__ReturnTypeAssignment_4");
			builder.put(grammarAccess.getReductionAccess().getNameAssignment_1(), "rule__Reduction__NameAssignment_1");
			builder.put(grammarAccess.getReductionAccess().getArgGroupsAssignment_3(), "rule__Reduction__ArgGroupsAssignment_3");
			builder.put(grammarAccess.getReductionAccess().getArgGroupsAssignment_4_1(), "rule__Reduction__ArgGroupsAssignment_4_1");
			builder.put(grammarAccess.getReductionArgAccess().getSeedAssignment_1(), "rule__ReductionArg__SeedAssignment_1");
			builder.put(grammarAccess.getReductionArgAccess().getCollectionTypeAssignment_3(), "rule__ReductionArg__CollectionTypeAssignment_3");
			builder.put(grammarAccess.getReductionArgAccess().getReturnTypeAssignment_6(), "rule__ReductionArg__ReturnTypeAssignment_6");
			builder.put(grammarAccess.getOrAccess().getOpAssignment_1_1(), "rule__Or__OpAssignment_1_1");
			builder.put(grammarAccess.getOrAccess().getRightAssignment_1_2(), "rule__Or__RightAssignment_1_2");
			builder.put(grammarAccess.getAndAccess().getOpAssignment_1_1(), "rule__And__OpAssignment_1_1");
			builder.put(grammarAccess.getAndAccess().getRightAssignment_1_2(), "rule__And__RightAssignment_1_2");
			builder.put(grammarAccess.getEqualityAccess().getOpAssignment_1_1(), "rule__Equality__OpAssignment_1_1");
			builder.put(grammarAccess.getEqualityAccess().getRightAssignment_1_2(), "rule__Equality__RightAssignment_1_2");
			builder.put(grammarAccess.getComparisonAccess().getOpAssignment_1_1(), "rule__Comparison__OpAssignment_1_1");
			builder.put(grammarAccess.getComparisonAccess().getRightAssignment_1_2(), "rule__Comparison__RightAssignment_1_2");
			builder.put(grammarAccess.getPlusOrMinusAccess().getOpAssignment_1_0_0_1(), "rule__PlusOrMinus__OpAssignment_1_0_0_1");
			builder.put(grammarAccess.getPlusOrMinusAccess().getOpAssignment_1_0_1_1(), "rule__PlusOrMinus__OpAssignment_1_0_1_1");
			builder.put(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1(), "rule__PlusOrMinus__RightAssignment_1_1");
			builder.put(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1(), "rule__MulOrDiv__OpAssignment_1_1");
			builder.put(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2(), "rule__MulOrDiv__RightAssignment_1_2");
			builder.put(grammarAccess.getPrimaryAccess().getExpressionAssignment_0_2(), "rule__Primary__ExpressionAssignment_0_2");
			builder.put(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2(), "rule__Primary__ExpressionAssignment_1_2");
			builder.put(grammarAccess.getPrimaryAccess().getExpressionAssignment_2_2(), "rule__Primary__ExpressionAssignment_2_2");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_0_1(), "rule__Atomic__ValueAssignment_0_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_1_1(), "rule__Atomic__ValueAssignment_1_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_4_1_0(), "rule__Atomic__ValueAssignment_4_1_0");
			builder.put(grammarAccess.getAtomicAccess().getXAssignment_5_2(), "rule__Atomic__XAssignment_5_2");
			builder.put(grammarAccess.getAtomicAccess().getYAssignment_5_4(), "rule__Atomic__YAssignment_5_4");
			builder.put(grammarAccess.getAtomicAccess().getXAssignment_6_2(), "rule__Atomic__XAssignment_6_2");
			builder.put(grammarAccess.getAtomicAccess().getYAssignment_6_4(), "rule__Atomic__YAssignment_6_4");
			builder.put(grammarAccess.getAtomicAccess().getZAssignment_6_6(), "rule__Atomic__ZAssignment_6_6");
			builder.put(grammarAccess.getAtomicAccess().getTypeAssignment_7_1(), "rule__Atomic__TypeAssignment_7_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_7_3(), "rule__Atomic__ValueAssignment_7_3");
			builder.put(grammarAccess.getAtomicAccess().getTypeAssignment_8_1(), "rule__Atomic__TypeAssignment_8_1");
			builder.put(grammarAccess.getAtomicAccess().getTypeAssignment_9_1(), "rule__Atomic__TypeAssignment_9_1");
			builder.put(grammarAccess.getAtomicAccess().getFunctionAssignment_10_1(), "rule__Atomic__FunctionAssignment_10_1");
			builder.put(grammarAccess.getAtomicAccess().getArgsAssignment_10_3_0(), "rule__Atomic__ArgsAssignment_10_3_0");
			builder.put(grammarAccess.getAtomicAccess().getArgsAssignment_10_3_1_1(), "rule__Atomic__ArgsAssignment_10_3_1_1");
			builder.put(grammarAccess.getAtomicAccess().getReductionAssignment_11_1(), "rule__Atomic__ReductionAssignment_11_1");
			builder.put(grammarAccess.getAtomicAccess().getIteratorAssignment_11_3(), "rule__Atomic__IteratorAssignment_11_3");
			builder.put(grammarAccess.getAtomicAccess().getArgAssignment_11_6(), "rule__Atomic__ArgAssignment_11_6");
			builder.put(grammarAccess.getReal2ConstantAccess().getXAssignment_1(), "rule__Real2Constant__XAssignment_1");
			builder.put(grammarAccess.getReal2ConstantAccess().getYAssignment_3(), "rule__Real2Constant__YAssignment_3");
			builder.put(grammarAccess.getReal3ConstantAccess().getXAssignment_1(), "rule__Real3Constant__XAssignment_1");
			builder.put(grammarAccess.getReal3ConstantAccess().getYAssignment_3(), "rule__Real3Constant__YAssignment_3");
			builder.put(grammarAccess.getReal3ConstantAccess().getZAssignment_5(), "rule__Real3Constant__ZAssignment_5");
			builder.put(grammarAccess.getVarRefAccess().getVariableAssignment_0(), "rule__VarRef__VariableAssignment_0");
			builder.put(grammarAccess.getVarRefAccess().getSpaceIteratorsAssignment_1_1(), "rule__VarRef__SpaceIteratorsAssignment_1_1");
			builder.put(grammarAccess.getVarRefAccess().getSpaceIteratorsAssignment_1_2_1(), "rule__VarRef__SpaceIteratorsAssignment_1_2_1");
			builder.put(grammarAccess.getVarRefAccess().getTimeIteratorAssignment_2_1(), "rule__VarRef__TimeIteratorAssignment_2_1");
			builder.put(grammarAccess.getVarRefAccess().getFieldsAssignment_3_1(), "rule__VarRef__FieldsAssignment_3_1");
			builder.put(grammarAccess.getTimeIteratorRefAccess().getIteratorAssignment_0(), "rule__TimeIteratorRef__IteratorAssignment_0");
			builder.put(grammarAccess.getTimeIteratorRefAccess().getInitAssignment_1_0_0(), "rule__TimeIteratorRef__InitAssignment_1_0_0");
			builder.put(grammarAccess.getTimeIteratorRefAccess().getNextAssignment_1_0_1(), "rule__TimeIteratorRef__NextAssignment_1_0_1");
			builder.put(grammarAccess.getTimeIteratorRefAccess().getValueAssignment_1_1(), "rule__TimeIteratorRef__ValueAssignment_1_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private NablaGrammarAccess grammarAccess;

	@Override
	protected InternalNablaParser createParser() {
		InternalNablaParser result = new InternalNablaParser(null);
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

	public NablaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(NablaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}

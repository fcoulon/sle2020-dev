package fr.inria.diverse.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.inria.diverse.ide.contentassist.antlr.internal.InternalLogoParser;
import fr.inria.diverse.services.LogoGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import kaulua.contentassist.antlr.AbstractContentAssistParser;

public class LogoParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(LogoGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, LogoGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getInstructionAccess().getAlternatives(), "rule__Instruction__Alternatives");
			builder.put(grammarAccess.getExpressionAccess().getAlternatives_1(), "rule__Expression__Alternatives_1");
			builder.put(grammarAccess.getAddExpAccess().getAlternatives_1(), "rule__AddExp__Alternatives_1");
			builder.put(grammarAccess.getMultExprAccess().getAlternatives_1(), "rule__MultExpr__Alternatives_1");
			builder.put(grammarAccess.getUnaryExpAccess().getAlternatives(), "rule__UnaryExp__Alternatives");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getEDoubleAccess().getAlternatives_4_0(), "rule__EDouble__Alternatives_4_0");
			builder.put(grammarAccess.getLogoProgramAccess().getGroup(), "rule__LogoProgram__Group__0");
			builder.put(grammarAccess.getLogoProgramAccess().getGroup_3(), "rule__LogoProgram__Group_3__0");
			builder.put(grammarAccess.getLogoProgramAccess().getGroup_3_1(), "rule__LogoProgram__Group_3_1__0");
			builder.put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
			builder.put(grammarAccess.getExpressionAccess().getGroup_1_0(), "rule__Expression__Group_1_0__0");
			builder.put(grammarAccess.getExpressionAccess().getGroup_1_1(), "rule__Expression__Group_1_1__0");
			builder.put(grammarAccess.getExpressionAccess().getGroup_1_2(), "rule__Expression__Group_1_2__0");
			builder.put(grammarAccess.getAddExpAccess().getGroup(), "rule__AddExp__Group__0");
			builder.put(grammarAccess.getAddExpAccess().getGroup_1_0(), "rule__AddExp__Group_1_0__0");
			builder.put(grammarAccess.getAddExpAccess().getGroup_1_1(), "rule__AddExp__Group_1_1__0");
			builder.put(grammarAccess.getMultExprAccess().getGroup(), "rule__MultExpr__Group__0");
			builder.put(grammarAccess.getMultExprAccess().getGroup_1_0(), "rule__MultExpr__Group_1_0__0");
			builder.put(grammarAccess.getMultExprAccess().getGroup_1_1(), "rule__MultExpr__Group_1_1__0");
			builder.put(grammarAccess.getBackAccess().getGroup(), "rule__Back__Group__0");
			builder.put(grammarAccess.getForwardAccess().getGroup(), "rule__Forward__Group__0");
			builder.put(grammarAccess.getLeftAccess().getGroup(), "rule__Left__Group__0");
			builder.put(grammarAccess.getRightAccess().getGroup(), "rule__Right__Group__0");
			builder.put(grammarAccess.getPenDownAccess().getGroup(), "rule__PenDown__Group__0");
			builder.put(grammarAccess.getPenUpAccess().getGroup(), "rule__PenUp__Group__0");
			builder.put(grammarAccess.getClearAccess().getGroup(), "rule__Clear__Group__0");
			builder.put(grammarAccess.getConstantAccess().getGroup(), "rule__Constant__Group__0");
			builder.put(grammarAccess.getProcCallAccess().getGroup(), "rule__ProcCall__Group__0");
			builder.put(grammarAccess.getProcCallAccess().getGroup_3(), "rule__ProcCall__Group_3__0");
			builder.put(grammarAccess.getProcCallAccess().getGroup_3_1(), "rule__ProcCall__Group_3_1__0");
			builder.put(grammarAccess.getProcDeclarationAccess().getGroup(), "rule__ProcDeclaration__Group__0");
			builder.put(grammarAccess.getProcDeclarationAccess().getGroup_4(), "rule__ProcDeclaration__Group_4__0");
			builder.put(grammarAccess.getProcDeclarationAccess().getGroup_4_1(), "rule__ProcDeclaration__Group_4_1__0");
			builder.put(grammarAccess.getProcDeclarationAccess().getGroup_7(), "rule__ProcDeclaration__Group_7__0");
			builder.put(grammarAccess.getProcDeclarationAccess().getGroup_7_1(), "rule__ProcDeclaration__Group_7_1__0");
			builder.put(grammarAccess.getProcDeclarationAccess().getGroup_8(), "rule__ProcDeclaration__Group_8__0");
			builder.put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
			builder.put(grammarAccess.getBlockAccess().getGroup_2(), "rule__Block__Group_2__0");
			builder.put(grammarAccess.getBlockAccess().getGroup_2_1(), "rule__Block__Group_2_1__0");
			builder.put(grammarAccess.getIfAccess().getGroup(), "rule__If__Group__0");
			builder.put(grammarAccess.getRepeatAccess().getGroup(), "rule__Repeat__Group__0");
			builder.put(grammarAccess.getWhileAccess().getGroup(), "rule__While__Group__0");
			builder.put(grammarAccess.getParameterCallAccess().getGroup(), "rule__ParameterCall__Group__0");
			builder.put(grammarAccess.getCosAccess().getGroup(), "rule__Cos__Group__0");
			builder.put(grammarAccess.getSinAccess().getGroup(), "rule__Sin__Group__0");
			builder.put(grammarAccess.getTanAccess().getGroup(), "rule__Tan__Group__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup(), "rule__EDouble__Group__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup_4(), "rule__EDouble__Group_4__0");
			builder.put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
			builder.put(grammarAccess.getLogoProgramAccess().getInstructionsAssignment_3_0(), "rule__LogoProgram__InstructionsAssignment_3_0");
			builder.put(grammarAccess.getLogoProgramAccess().getInstructionsAssignment_3_1_1(), "rule__LogoProgram__InstructionsAssignment_3_1_1");
			builder.put(grammarAccess.getExpressionAccess().getRhsAssignment_1_0_2(), "rule__Expression__RhsAssignment_1_0_2");
			builder.put(grammarAccess.getExpressionAccess().getRhsAssignment_1_1_2(), "rule__Expression__RhsAssignment_1_1_2");
			builder.put(grammarAccess.getExpressionAccess().getRhsAssignment_1_2_2(), "rule__Expression__RhsAssignment_1_2_2");
			builder.put(grammarAccess.getAddExpAccess().getRhsAssignment_1_0_2(), "rule__AddExp__RhsAssignment_1_0_2");
			builder.put(grammarAccess.getAddExpAccess().getRhsAssignment_1_1_2(), "rule__AddExp__RhsAssignment_1_1_2");
			builder.put(grammarAccess.getMultExprAccess().getRhsAssignment_1_0_2(), "rule__MultExpr__RhsAssignment_1_0_2");
			builder.put(grammarAccess.getMultExprAccess().getRhsAssignment_1_1_2(), "rule__MultExpr__RhsAssignment_1_1_2");
			builder.put(grammarAccess.getBackAccess().getStepsAssignment_2(), "rule__Back__StepsAssignment_2");
			builder.put(grammarAccess.getForwardAccess().getStepsAssignment_2(), "rule__Forward__StepsAssignment_2");
			builder.put(grammarAccess.getLeftAccess().getAngleAssignment_2(), "rule__Left__AngleAssignment_2");
			builder.put(grammarAccess.getRightAccess().getAngleAssignment_2(), "rule__Right__AngleAssignment_2");
			builder.put(grammarAccess.getConstantAccess().getValueAssignment_1(), "rule__Constant__ValueAssignment_1");
			builder.put(grammarAccess.getProcCallAccess().getDeclarationAssignment_1(), "rule__ProcCall__DeclarationAssignment_1");
			builder.put(grammarAccess.getProcCallAccess().getActualArgsAssignment_3_0(), "rule__ProcCall__ActualArgsAssignment_3_0");
			builder.put(grammarAccess.getProcCallAccess().getActualArgsAssignment_3_1_1(), "rule__ProcCall__ActualArgsAssignment_3_1_1");
			builder.put(grammarAccess.getProcDeclarationAccess().getNameAssignment_2(), "rule__ProcDeclaration__NameAssignment_2");
			builder.put(grammarAccess.getProcDeclarationAccess().getArgsAssignment_4_0(), "rule__ProcDeclaration__ArgsAssignment_4_0");
			builder.put(grammarAccess.getProcDeclarationAccess().getArgsAssignment_4_1_1(), "rule__ProcDeclaration__ArgsAssignment_4_1_1");
			builder.put(grammarAccess.getProcDeclarationAccess().getInstructionsAssignment_7_0(), "rule__ProcDeclaration__InstructionsAssignment_7_0");
			builder.put(grammarAccess.getProcDeclarationAccess().getInstructionsAssignment_7_1_1(), "rule__ProcDeclaration__InstructionsAssignment_7_1_1");
			builder.put(grammarAccess.getProcDeclarationAccess().getInstructionsAssignment_8_1(), "rule__ProcDeclaration__InstructionsAssignment_8_1");
			builder.put(grammarAccess.getBlockAccess().getInstructionsAssignment_2_0(), "rule__Block__InstructionsAssignment_2_0");
			builder.put(grammarAccess.getBlockAccess().getInstructionsAssignment_2_1_1(), "rule__Block__InstructionsAssignment_2_1_1");
			builder.put(grammarAccess.getIfAccess().getConditionAssignment_2(), "rule__If__ConditionAssignment_2");
			builder.put(grammarAccess.getIfAccess().getThenPartAssignment_3(), "rule__If__ThenPartAssignment_3");
			builder.put(grammarAccess.getIfAccess().getElsePartAssignment_4(), "rule__If__ElsePartAssignment_4");
			builder.put(grammarAccess.getRepeatAccess().getConditionAssignment_2(), "rule__Repeat__ConditionAssignment_2");
			builder.put(grammarAccess.getRepeatAccess().getBlockAssignment_3(), "rule__Repeat__BlockAssignment_3");
			builder.put(grammarAccess.getWhileAccess().getConditionAssignment_2(), "rule__While__ConditionAssignment_2");
			builder.put(grammarAccess.getWhileAccess().getBlockAssignment_3(), "rule__While__BlockAssignment_3");
			builder.put(grammarAccess.getParameterCallAccess().getParameterAssignment_1(), "rule__ParameterCall__ParameterAssignment_1");
			builder.put(grammarAccess.getCosAccess().getExpressionAssignment_2(), "rule__Cos__ExpressionAssignment_2");
			builder.put(grammarAccess.getSinAccess().getExpressionAssignment_2(), "rule__Sin__ExpressionAssignment_2");
			builder.put(grammarAccess.getTanAccess().getExpressionAssignment_2(), "rule__Tan__ExpressionAssignment_2");
			builder.put(grammarAccess.getParameterAccess().getNameAssignment_1(), "rule__Parameter__NameAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private LogoGrammarAccess grammarAccess;

	@Override
	protected InternalLogoParser createParser() {
		InternalLogoParser result = new InternalLogoParser(null);
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

	public LogoGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LogoGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}

/*
 * generated by Xtext 2.19.0
 */
package fr.inria.diverse.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class KauluaGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ProtocolElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.diverse.Kaulua.Protocol");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProtocolKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFeaturesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFeaturesFeatureParserRuleCall_3_0 = (RuleCall)cFeaturesAssignment_3.eContents().get(0);
		private final Keyword cDependenciesKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cDependenciesAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cDependenciesDependencyParserRuleCall_6_0 = (RuleCall)cDependenciesAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Protocol:
		//	'Protocol' name=STRING '{'
		//	features+=Feature+
		//	'dependencies' '{'
		//	dependencies+=Dependency*
		//	'}'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Protocol' name=STRING '{' features+=Feature+ 'dependencies' '{' dependencies+=Dependency* '}' '}'
		public Group getGroup() { return cGroup; }
		
		//'Protocol'
		public Keyword getProtocolKeyword_0() { return cProtocolKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//features+=Feature+
		public Assignment getFeaturesAssignment_3() { return cFeaturesAssignment_3; }
		
		//Feature
		public RuleCall getFeaturesFeatureParserRuleCall_3_0() { return cFeaturesFeatureParserRuleCall_3_0; }
		
		//'dependencies'
		public Keyword getDependenciesKeyword_4() { return cDependenciesKeyword_4; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }
		
		//dependencies+=Dependency*
		public Assignment getDependenciesAssignment_6() { return cDependenciesAssignment_6; }
		
		//Dependency
		public RuleCall getDependenciesDependencyParserRuleCall_6_0() { return cDependenciesDependencyParserRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}
	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.diverse.Kaulua.Feature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cIsMandatoryAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cIsMandatoryMandatoryKeyword_0_0 = (Keyword)cIsMandatoryAssignment_0.eContents().get(0);
		private final Keyword cFeatureKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCapabilitiesKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cColonKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cCapabilitiesAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cCapabilitiesCapabilityParserRuleCall_4_2_0 = (RuleCall)cCapabilitiesAssignment_4_2.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cAlternativeOfKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cColonKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cAlternativeGroupAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cAlternativeGroupSTRINGTerminalRuleCall_5_2_0 = (RuleCall)cAlternativeGroupAssignment_5_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Feature:
		//	isMandatory?="mandatory"? 'feature' name=ID '{' ('capabilities' ':' capabilities+=Capability+)? ('alternativeOf' ':'
		//	alternativeGroup=STRING)?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//isMandatory?="mandatory"? 'feature' name=ID '{' ('capabilities' ':' capabilities+=Capability+)? ('alternativeOf' ':'
		//alternativeGroup=STRING)? '}'
		public Group getGroup() { return cGroup; }
		
		//isMandatory?="mandatory"?
		public Assignment getIsMandatoryAssignment_0() { return cIsMandatoryAssignment_0; }
		
		//"mandatory"
		public Keyword getIsMandatoryMandatoryKeyword_0_0() { return cIsMandatoryMandatoryKeyword_0_0; }
		
		//'feature'
		public Keyword getFeatureKeyword_1() { return cFeatureKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//('capabilities' ':' capabilities+=Capability+)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'capabilities'
		public Keyword getCapabilitiesKeyword_4_0() { return cCapabilitiesKeyword_4_0; }
		
		//':'
		public Keyword getColonKeyword_4_1() { return cColonKeyword_4_1; }
		
		//capabilities+=Capability+
		public Assignment getCapabilitiesAssignment_4_2() { return cCapabilitiesAssignment_4_2; }
		
		//Capability
		public RuleCall getCapabilitiesCapabilityParserRuleCall_4_2_0() { return cCapabilitiesCapabilityParserRuleCall_4_2_0; }
		
		//('alternativeOf' ':' alternativeGroup=STRING)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'alternativeOf'
		public Keyword getAlternativeOfKeyword_5_0() { return cAlternativeOfKeyword_5_0; }
		
		//':'
		public Keyword getColonKeyword_5_1() { return cColonKeyword_5_1; }
		
		//alternativeGroup=STRING
		public Assignment getAlternativeGroupAssignment_5_2() { return cAlternativeGroupAssignment_5_2; }
		
		//STRING
		public RuleCall getAlternativeGroupSTRINGTerminalRuleCall_5_2_0() { return cAlternativeGroupSTRINGTerminalRuleCall_5_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class CapabilityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.diverse.Kaulua.Capability");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cDefinitionFileAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cDefinitionFileSTRINGTerminalRuleCall_1_1_0 = (RuleCall)cDefinitionFileAssignment_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		
		//Capability:
		//	name=ID ('[' definitionFile=STRING ']')?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ('[' definitionFile=STRING ']')?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//('[' definitionFile=STRING ']')?
		public Group getGroup_1() { return cGroup_1; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1_0() { return cLeftSquareBracketKeyword_1_0; }
		
		//definitionFile=STRING
		public Assignment getDefinitionFileAssignment_1_1() { return cDefinitionFileAssignment_1_1; }
		
		//STRING
		public RuleCall getDefinitionFileSTRINGTerminalRuleCall_1_1_0() { return cDefinitionFileSTRINGTerminalRuleCall_1_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_1_2() { return cRightSquareBracketKeyword_1_2; }
	}
	public class DependencyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.diverse.Kaulua.Dependency");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCallerAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cCallerCapabilityCrossReference_0_0 = (CrossReference)cCallerAssignment_0.eContents().get(0);
		private final RuleCall cCallerCapabilityQUALIFIERTerminalRuleCall_0_0_1 = (RuleCall)cCallerCapabilityCrossReference_0_0.eContents().get(1);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cCalleeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cCalleeCapabilityCrossReference_2_0 = (CrossReference)cCalleeAssignment_2.eContents().get(0);
		private final RuleCall cCalleeCapabilityQUALIFIERTerminalRuleCall_2_0_1 = (RuleCall)cCalleeCapabilityCrossReference_2_0.eContents().get(1);
		
		//Dependency:
		//	caller=[Capability|QUALIFIER] "->" callee=[Capability|QUALIFIER];
		@Override public ParserRule getRule() { return rule; }
		
		//caller=[Capability|QUALIFIER] "->" callee=[Capability|QUALIFIER]
		public Group getGroup() { return cGroup; }
		
		//caller=[Capability|QUALIFIER]
		public Assignment getCallerAssignment_0() { return cCallerAssignment_0; }
		
		//[Capability|QUALIFIER]
		public CrossReference getCallerCapabilityCrossReference_0_0() { return cCallerCapabilityCrossReference_0_0; }
		
		//QUALIFIER
		public RuleCall getCallerCapabilityQUALIFIERTerminalRuleCall_0_0_1() { return cCallerCapabilityQUALIFIERTerminalRuleCall_0_0_1; }
		
		//"->"
		public Keyword getHyphenMinusGreaterThanSignKeyword_1() { return cHyphenMinusGreaterThanSignKeyword_1; }
		
		//callee=[Capability|QUALIFIER]
		public Assignment getCalleeAssignment_2() { return cCalleeAssignment_2; }
		
		//[Capability|QUALIFIER]
		public CrossReference getCalleeCapabilityCrossReference_2_0() { return cCalleeCapabilityCrossReference_2_0; }
		
		//QUALIFIER
		public RuleCall getCalleeCapabilityQUALIFIERTerminalRuleCall_2_0_1() { return cCalleeCapabilityQUALIFIERTerminalRuleCall_2_0_1; }
	}
	
	
	private final ProtocolElements pProtocol;
	private final FeatureElements pFeature;
	private final CapabilityElements pCapability;
	private final DependencyElements pDependency;
	private final TerminalRule tQUALIFIER;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public KauluaGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pProtocol = new ProtocolElements();
		this.pFeature = new FeatureElements();
		this.pCapability = new CapabilityElements();
		this.pDependency = new DependencyElements();
		this.tQUALIFIER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.diverse.Kaulua.QUALIFIER");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.inria.diverse.Kaulua".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Protocol:
	//	'Protocol' name=STRING '{'
	//	features+=Feature+
	//	'dependencies' '{'
	//	dependencies+=Dependency*
	//	'}'
	//	'}';
	public ProtocolElements getProtocolAccess() {
		return pProtocol;
	}
	
	public ParserRule getProtocolRule() {
		return getProtocolAccess().getRule();
	}
	
	//Feature:
	//	isMandatory?="mandatory"? 'feature' name=ID '{' ('capabilities' ':' capabilities+=Capability+)? ('alternativeOf' ':'
	//	alternativeGroup=STRING)?
	//	'}';
	public FeatureElements getFeatureAccess() {
		return pFeature;
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}
	
	//Capability:
	//	name=ID ('[' definitionFile=STRING ']')?;
	public CapabilityElements getCapabilityAccess() {
		return pCapability;
	}
	
	public ParserRule getCapabilityRule() {
		return getCapabilityAccess().getRule();
	}
	
	//Dependency:
	//	caller=[Capability|QUALIFIER] "->" callee=[Capability|QUALIFIER];
	public DependencyElements getDependencyAccess() {
		return pDependency;
	}
	
	public ParserRule getDependencyRule() {
		return getDependencyAccess().getRule();
	}
	
	//terminal QUALIFIER:
	//	ID ('.' ID)+;
	public TerminalRule getQUALIFIERRule() {
		return tQUALIFIER;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}

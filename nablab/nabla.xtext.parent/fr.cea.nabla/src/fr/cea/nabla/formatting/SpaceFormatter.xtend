package fr.cea.nabla.formatting

import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eclipse.emf.ecore.EObject
import fr.cea.nabla.nabla.NablaModule
import fr.cea.nabla.nabla.DeclarationBlock
import fr.cea.nabla.nabla.Instruction
import fr.cea.nabla.nabla.Connectivity
import fr.cea.nabla.nabla.Import
import fr.cea.nabla.nabla.ConnectivityDeclarationBlock
import fr.cea.nabla.nabla.FunctionDeclarationBlock
import fr.cea.nabla.nabla.Var
import fr.cea.nabla.nabla.ScalarVarDefinition
import fr.cea.nabla.nabla.VarGroupDeclaration
import fr.cea.nabla.nabla.Affectation
import fr.cea.nabla.nabla.InstructionJob
import fr.cea.nabla.nabla.TimeLoopJob

class SpaceFormatter extends AbstractFormatter2 {

//	override dispatch void format(EObject obj, extension IFormattableDocument document) {
//		
//		obj.surround[oneSpace]
//		
//		for(child : obj.eContents) {
//			child.format
//		}
//	}
	
	def dispatch void format(NablaModule m, extension IFormattableDocument document) {
		m.regionFor.keyword(";").append[setNewLines(2)]
		
		for(imp : m.imports) {
			imp.format
		}
		for(block : m.blocks) {
			block.format
		}
		for(v : m.variables) {
			v.format
		}
		for(j : m.jobs) {
			j.format
		}
	}
	
	def dispatch void format(DeclarationBlock block, extension IFormattableDocument document) {
		block.interior[indent]
		block.regionFor.keyword("{").append[newLine]
		block.regionFor.keyword("}").prepend[newLine]
		block.regionFor.keyword("}").append[setNewLines(2)]
	}
	
	def dispatch void format(Import imp, extension IFormattableDocument document) {
		imp.regionFor.keyword(";").append[newLine]
	}
	
	def dispatch void format(ConnectivityDeclarationBlock connectBlock, extension IFormattableDocument document) {
		for(connect : connectBlock.connectivities) {
			connect.regionFor.keyword(";").append[newLine]
		}
	}
	
	def dispatch void format(FunctionDeclarationBlock funBlock, extension IFormattableDocument document) {
		for(fun : funBlock.functions) {
			fun.regionFor.keyword(";").append[newLine]
		}
	}
	
	def dispatch void format(ScalarVarDefinition varr, extension IFormattableDocument document) {
		varr.regionFor.keyword(";").append[newLine]
	}
	
	def dispatch void format(VarGroupDeclaration varr, extension IFormattableDocument document) {
		varr.regionFor.keyword(";").append[newLine]
	}
	
//	def dispatch void format(Affectation aff, extension IFormattableDocument document) {
//		aff.regionFor.keyword(";").append[newLine]
//	}

	def dispatch void format(InstructionJob inst, extension IFormattableDocument document) {
		inst.regionFor.keyword(";").append[newLine]
	}
	
	def dispatch void format(TimeLoopJob inst, extension IFormattableDocument document) {
		inst.regionFor.keyword(";").append[newLine]
	}
}
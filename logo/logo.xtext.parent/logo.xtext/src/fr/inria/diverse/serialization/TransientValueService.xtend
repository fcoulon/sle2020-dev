package fr.inria.diverse.serialization

import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import kmLogo.ASM.ProcDeclaration

class TransientValueService extends DefaultTransientValueService {
	
	override isTransient(EObject owner, EStructuralFeature feature, int index) {
//		val isTransient = super.isTransient(owner, feature, index)
//		if(isTransient)
//			return true
//		
//		println(owner.eClass + ' ' + feature.name + ' ' + (owner.eClass.name == 'ProcDeclaration' && feature.name == 'procCall'))
//		
//		return owner.eClass.name == 'ProcDeclaration' && feature.name == 'procCall'
		
		return super.isTransient(owner, feature, index)
	}
	
}
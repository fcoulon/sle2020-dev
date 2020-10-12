package kaulua.formatting

import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class NullFormatter extends AbstractFormatter2 { //FIXME: this is language specific
	override format(Object obj, IFormattableDocument document) {
	}
}

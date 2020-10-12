 
package kaulua.fm.generator.handlers;

import javax.inject.Named;

import org.eclipse.core.internal.resources.File;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.viewers.TreeSelection;

import kaulua.fm.generator.ScriptGenerator;

public class ScriptGeneratorHandler {
	@Execute
public void execute(@Named(IServiceConstants.ACTIVE_SELECTION) Object  selection) {
		
		if(selection instanceof TreeSelection) {
			TreeSelection select = (TreeSelection) selection;
			Object element = select.getFirstElement();
			
			if(element instanceof File) {
				File file = (File) element;
				ScriptGenerator.generateScripts(file);
			}
		}
	}
}
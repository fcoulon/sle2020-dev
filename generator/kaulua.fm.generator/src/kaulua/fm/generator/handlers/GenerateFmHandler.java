package kaulua.fm.generator.handlers;

import javax.inject.Named;

import org.eclipse.core.internal.resources.File;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.viewers.TreeSelection;

import kaulua.fm.generator.FeatureModelGenerator;

/** <b>Warning</b> : 
  As explained in <a href="http://wiki.eclipse.org/Eclipse4/RCP/FAQ#Why_aren.27t_my_handler_fields_being_re-injected.3F">this wiki page</a>, it is not recommended to define @Inject fields in a handler. <br/><br/>
  <b>Inject the values in the @Execute methods</b>
*/
public class GenerateFmHandler {
	
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SELECTION) Object  selection) {
		
		if(selection instanceof TreeSelection) {
			TreeSelection select = (TreeSelection) selection;
			Object element = select.getFirstElement();
			
			if(element instanceof File) {
				File file = (File) element;
				FeatureModelGenerator.generate(file);
			}
		}
	}

}

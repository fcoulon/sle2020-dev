/**
 * generated by Xtext 2.17.0
 */
package fr.inria.diverse.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class KauluaLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public KauluaLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}

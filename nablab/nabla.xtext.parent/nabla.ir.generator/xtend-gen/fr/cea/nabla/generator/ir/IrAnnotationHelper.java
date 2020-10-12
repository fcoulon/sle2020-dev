/**
 * Copyright (c) 2018 CEA
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 * 	Benoit Lelandais - initial implementation
 * 	Marie-Pierre Oudot - initial implementation
 * 	Jean-Sylvain Camier - Nabla generation support
 */
package fr.cea.nabla.generator.ir;

import com.google.inject.Inject;
import fr.cea.nabla.ir.Utils;
import fr.cea.nabla.ir.ir.IrAnnotation;
import fr.cea.nabla.ir.ir.IrFactory;
import fr.cea.nabla.ir.ir.IrModule;
import fr.cea.nabla.nabla.NablaModule;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class IrAnnotationHelper {
  @Inject
  private ILocationInFileProvider locationProvider;
  
  public static final String ANNOTATION_NABLA_ORIGIN_SOURCE = "nabla-origin";
  
  public static final String ANNOTATION_URI_DETAIL = "uri";
  
  public static final String ANNOTATION_OFFSET_DETAIL = "offset";
  
  public static final String ANNOTATION_LENGTH_DETAIL = "length";
  
  protected IrAnnotation _toIrAnnotation(final NablaModule it) {
    final IrAnnotation annotation = this.createIrAnnot(it);
    annotation.getDetails().put(IrAnnotationHelper.ANNOTATION_URI_DETAIL, it.eResource().getURI().toString());
    return annotation;
  }
  
  protected IrAnnotation _toIrAnnotation(final EObject it) {
    return this.createIrAnnot(it);
  }
  
  public String getUriDetail(final EObject o) {
    String _xblockexpression = null;
    {
      final IrModule irFile = Utils.getIrModule(o);
      String _xifexpression = null;
      if ((irFile == null)) {
        _xifexpression = null;
      } else {
        _xifexpression = IterableExtensions.<IrAnnotation>head(irFile.getAnnotations()).getDetails().get(IrAnnotationHelper.ANNOTATION_URI_DETAIL);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  private IrAnnotation createIrAnnot(final EObject nablaElt) {
    IrAnnotation _xblockexpression = null;
    {
      final ITextRegion region = this.locationProvider.getFullTextRegion(nablaElt);
      if ((region == null)) {
        throw new RuntimeException(("Ooops : impossible de créer une annotation pour : " + nablaElt));
      }
      IrAnnotation _createIrAnnotation = IrFactory.eINSTANCE.createIrAnnotation();
      final Procedure1<IrAnnotation> _function = (IrAnnotation it) -> {
        it.setSource(IrAnnotationHelper.ANNOTATION_NABLA_ORIGIN_SOURCE);
        it.getDetails().put(IrAnnotationHelper.ANNOTATION_OFFSET_DETAIL, Integer.valueOf(region.getOffset()).toString());
        it.getDetails().put(IrAnnotationHelper.ANNOTATION_LENGTH_DETAIL, Integer.valueOf(region.getLength()).toString());
      };
      _xblockexpression = ObjectExtensions.<IrAnnotation>operator_doubleArrow(_createIrAnnotation, _function);
    }
    return _xblockexpression;
  }
  
  public IrAnnotation toIrAnnotation(final EObject it) {
    if (it instanceof NablaModule) {
      return _toIrAnnotation((NablaModule)it);
    } else if (it != null) {
      return _toIrAnnotation(it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}

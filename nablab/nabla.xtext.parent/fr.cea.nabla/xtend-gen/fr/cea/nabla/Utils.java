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
package fr.cea.nabla;

import fr.cea.nabla.nabla.NablaModule;
import java.util.Map;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class Utils {
  public static IFile toEclipseFile(final Resource emfResource) {
    final URI uri = emfResource.getURI();
    if (((uri != null) && uri.isPlatformResource())) {
      final IWorkspaceRoot ws = ResourcesPlugin.getWorkspace().getRoot();
      final String platformString = uri.toPlatformString(true);
      final IResource resource = ws.findMember(platformString);
      if ((((resource != null) && resource.exists()) && (resource.getType() == IResource.FILE))) {
        return ((IFile) resource);
      }
    }
    return null;
  }
  
  public static NablaModule getNablaModule(final EObject o) {
    NablaModule _xifexpression = null;
    if ((o == null)) {
      _xifexpression = null;
    } else {
      NablaModule _xifexpression_1 = null;
      if ((o instanceof NablaModule)) {
        _xifexpression_1 = ((NablaModule) o);
      } else {
        _xifexpression_1 = Utils.getNablaModule(o.eContainer());
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public static String getFileNameWithoutExtension(final Resource input) {
    Map<String, Object> _extensionToFactoryMap = input.getResourceSet().getResourceFactoryRegistry().getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION, _xMIResourceFactoryImpl);
    return input.getURI().trimFileExtension().lastSegment();
  }
}

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
package fr.cea.nabla.ir.generator;

import fr.cea.nabla.ir.ir.IrModule;
import fr.cea.nabla.ir.transformers.IrTransformationStep;
import java.util.List;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public abstract class IrGenerator {
  @Accessors({ AccessorType.PUBLIC_GETTER, AccessorType.PUBLIC_SETTER })
  private String generationDir;
  
  @Accessors
  private final String fileExtension;
  
  @Accessors
  private final List<? extends IrTransformationStep> transformationSteps;
  
  public IrGenerator(final String fileExtension, final List<? extends IrTransformationStep> transformationSteps) {
    this.generationDir = null;
    this.fileExtension = fileExtension;
    this.transformationSteps = transformationSteps;
  }
  
  public abstract CharSequence getFileContent(final IrModule it);
  
  @Pure
  public String getGenerationDir() {
    return this.generationDir;
  }
  
  public void setGenerationDir(final String generationDir) {
    this.generationDir = generationDir;
  }
  
  @Pure
  public String getFileExtension() {
    return this.fileExtension;
  }
  
  @Pure
  public List<? extends IrTransformationStep> getTransformationSteps() {
    return this.transformationSteps;
  }
}

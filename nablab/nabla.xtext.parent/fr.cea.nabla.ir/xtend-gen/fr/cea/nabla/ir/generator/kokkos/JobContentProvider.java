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
package fr.cea.nabla.ir.generator.kokkos;

import com.google.inject.Inject;
import fr.cea.nabla.ir.generator.Utils;
import fr.cea.nabla.ir.generator.kokkos.InstructionContentProvider;
import fr.cea.nabla.ir.ir.InstructionJob;
import fr.cea.nabla.ir.ir.Job;
import fr.cea.nabla.ir.ir.TimeIterationCopyJob;
import java.util.Arrays;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class JobContentProvider {
  @Inject
  @Extension
  private Utils _utils;
  
  @Inject
  @Extension
  private InstructionContentProvider _instructionContentProvider;
  
  public CharSequence getContent(final Job it) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _comment = this._utils.getComment(it);
    _builder.append(_comment);
    _builder.newLineIfNotEmpty();
    _builder.append("void ");
    String _firstLower = StringExtensions.toFirstLower(it.getName());
    _builder.append(_firstLower);
    _builder.append("()");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _innerContent = this.getInnerContent(it);
    _builder.append(_innerContent, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence _getInnerContent(final InstructionJob it) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _innerContent = this._instructionContentProvider.getInnerContent(it.getInstruction());
    _builder.append(_innerContent);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence _getInnerContent(final TimeIterationCopyJob it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("auto tmpSwitch = ");
    String _name = it.getLeft().getName();
    _builder.append(_name);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    String _name_1 = it.getLeft().getName();
    _builder.append(_name_1);
    _builder.append(" = ");
    String _name_2 = it.getRight().getName();
    _builder.append(_name_2);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    String _name_3 = it.getRight().getName();
    _builder.append(_name_3);
    _builder.append(" = tmpSwitch;");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence getInnerContent(final Job it) {
    if (it instanceof InstructionJob) {
      return _getInnerContent((InstructionJob)it);
    } else if (it instanceof TimeIterationCopyJob) {
      return _getInnerContent((TimeIterationCopyJob)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}

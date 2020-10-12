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
package fr.cea.nabla.ir.generator.n;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class DirtyPatchProvider {
  public CharSequence getFileHeader() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("with ℝ²; // On est en 2D!!!");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// Il nous faut ca");
    _builder.newLine();
    _builder.append("//ℝ³ perp(ℝ³ α, ℝ³ β){ return ℝ³(β.y-α.y,-β.x+α.x,0.0);}");
    _builder.newLine();
    _builder.append("ℝ³ perp(ℝ³ a){ return ℝ³(a.y,-a.x,0.0);}");
    _builder.newLine();
    _builder.append("ℝ trace(ℝ³ˣ³ M){return M.x.x+M.y.y+M.z.z;}");
    _builder.newLine();
    _builder.append("ℝ³ˣ³ inverse(ℝ³ˣ³ M) { ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ℝ det = matrixDeterminant(M);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//assert(det!=0.0);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return inverseMatrix(M,det);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// Et ca");
    _builder.newLine();
    _builder.append("#define tensProduct opProdTens");
    _builder.newLine();
    _builder.append("#define matVectProduct opProdTensVec");
    _builder.newLine();
    _builder.append("//#define id3 matrix3x3Id();\t");
    _builder.newLine();
    return _builder;
  }
}

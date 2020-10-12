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
package fr.cea.nabla.typing;

import com.google.common.base.Objects;
import fr.cea.nabla.nabla.BasicType;
import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@Data
@SuppressWarnings("all")
public class NablaType {
  public static final NablaType UNDEFINED = null;
  
  private final BasicType base;
  
  private final int dimension;
  
  public static boolean isBasicType(final NablaType t) {
    return ((t != NablaType.UNDEFINED) && (t.dimension == 0));
  }
  
  public static String getLabel(final NablaType t) {
    if ((t == NablaType.UNDEFINED)) {
      return "undefined";
    }
    String tName = t.base.getLiteral();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, t.dimension, true);
    for (final Integer i : _doubleDotLessThan) {
      String _tName = tName;
      tName = (_tName + "[]");
    }
    return tName;
  }
  
  public boolean match(final NablaType b) {
    boolean _xifexpression = false;
    if ((b == NablaType.UNDEFINED)) {
      _xifexpression = false;
    } else {
      _xifexpression = (Objects.equal(this.base, b.base) && (this.dimension == b.dimension));
    }
    return _xifexpression;
  }
  
  public NablaType(final BasicType base, final int dimension) {
    super();
    this.base = base;
    this.dimension = dimension;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.base== null) ? 0 : this.base.hashCode());
    return prime * result + this.dimension;
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    NablaType other = (NablaType) obj;
    if (this.base == null) {
      if (other.base != null)
        return false;
    } else if (!this.base.equals(other.base))
      return false;
    if (other.dimension != this.dimension)
      return false;
    return true;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("base", this.base);
    b.add("dimension", this.dimension);
    return b.toString();
  }
  
  @Pure
  public BasicType getBase() {
    return this.base;
  }
  
  @Pure
  public int getDimension() {
    return this.dimension;
  }
}

/**
 * generated by Xtext 2.10.0
 */
package org.thingml.xtext.validation;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.thingml.xtext.constraints.ThingMLHelpers;
import org.thingml.xtext.helpers.IncludeCycle;
import org.thingml.xtext.helpers.ThingHelper;
import org.thingml.xtext.thingML.Thing;
import org.thingml.xtext.thingML.ThingMLPackage;
import org.thingml.xtext.validation.AbstractThingMLValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class ThingMLValidator extends AbstractThingMLValidator {
  @Check
  public void checkNoCyclesInThingIncludes(final Thing thing) {
    try {
      ThingHelper.allIncludedThingsWithCheck(thing);
      ThingMLHelpers.allThingFragmentsWithCheck(thing);
    } catch (final Throwable _t) {
      if (_t instanceof IncludeCycle) {
        final IncludeCycle e = (IncludeCycle)_t;
        this.error(e.getMessage(), thing, ThingMLPackage.eINSTANCE.getThing_Includes());
        return;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}

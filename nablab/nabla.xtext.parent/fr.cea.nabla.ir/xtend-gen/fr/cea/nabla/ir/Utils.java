package fr.cea.nabla.ir;

import fr.cea.nabla.ir.ir.IrModule;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class Utils {
  public static IrModule getIrModule(final EObject o) {
    IrModule _xifexpression = null;
    if ((o == null)) {
      _xifexpression = null;
    } else {
      IrModule _xifexpression_1 = null;
      if ((o instanceof IrModule)) {
        _xifexpression_1 = ((IrModule) o);
      } else {
        _xifexpression_1 = Utils.getIrModule(o.eContainer());
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
}

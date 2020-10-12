package fr.cea.nabla.ir.transformers;

import com.google.common.base.Objects;
import fr.cea.nabla.ir.ir.IrModule;
import fr.cea.nabla.ir.ir.Variable;
import fr.cea.nabla.ir.transformers.IrTransformationStep;
import java.util.Properties;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Attend des propriétés de type <nom_de_variable> = <nom_de_persistence>.
 * Le <nom_de_variable> représente lae nom de la vraible du code.
 * Le <nom_de_persistence> représente un alias qui sera généralement donné en dépouillement.
 */
@SuppressWarnings("all")
public class TagPersistentVariables implements IrTransformationStep {
  private final Properties variables;
  
  public TagPersistentVariables(final Properties variables) {
    this.variables = variables;
  }
  
  @Override
  public String getDescription() {
    return "Tag variables as persistent";
  }
  
  @Override
  public boolean transform(final IrModule m) {
    Set<String> _stringPropertyNames = this.variables.stringPropertyNames();
    for (final String key : _stringPropertyNames) {
      {
        final Function1<Variable, Boolean> _function = new Function1<Variable, Boolean>() {
          @Override
          public Boolean apply(final Variable x) {
            String _name = x.getName();
            return Boolean.valueOf(Objects.equal(_name, key));
          }
        };
        final Variable v = IterableExtensions.<Variable>findFirst(m.getVariables(), _function);
        if ((v != null)) {
          v.setPersist(true);
          v.setPersistenceName(this.variables.getProperty(key));
        }
      }
    }
    return false;
  }
}

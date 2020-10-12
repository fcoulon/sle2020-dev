package fr.cea.nabla.formatting;

import fr.cea.nabla.nabla.Callable;
import fr.cea.nabla.nabla.Connectivity;
import fr.cea.nabla.nabla.ConnectivityDeclarationBlock;
import fr.cea.nabla.nabla.DeclarationBlock;
import fr.cea.nabla.nabla.FunctionDeclarationBlock;
import fr.cea.nabla.nabla.Import;
import fr.cea.nabla.nabla.Instruction;
import fr.cea.nabla.nabla.InstructionJob;
import fr.cea.nabla.nabla.Job;
import fr.cea.nabla.nabla.NablaModule;
import fr.cea.nabla.nabla.ScalarVarDefinition;
import fr.cea.nabla.nabla.TimeLoopJob;
import fr.cea.nabla.nabla.VarGroupDeclaration;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class SpaceFormatter extends AbstractFormatter2 {
  protected void _format(final NablaModule m, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    document.append(this.textRegionExtensions.regionFor(m).keyword(";"), _function);
    EList<Import> _imports = m.getImports();
    for (final Import imp : _imports) {
      document.<Import>format(imp);
    }
    EList<DeclarationBlock> _blocks = m.getBlocks();
    for (final DeclarationBlock block : _blocks) {
      document.<DeclarationBlock>format(block);
    }
    EList<Instruction> _variables = m.getVariables();
    for (final Instruction v : _variables) {
      document.<Instruction>format(v);
    }
    EList<Job> _jobs = m.getJobs();
    for (final Job j : _jobs) {
      document.<Job>format(j);
    }
  }
  
  protected void _format(final DeclarationBlock block, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<DeclarationBlock>interior(block, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(this.textRegionExtensions.regionFor(block).keyword("{"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(block).keyword("}"), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    document.append(this.textRegionExtensions.regionFor(block).keyword("}"), _function_3);
  }
  
  protected void _format(final Import imp, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(this.textRegionExtensions.regionFor(imp).keyword(";"), _function);
  }
  
  protected void _format(final ConnectivityDeclarationBlock connectBlock, @Extension final IFormattableDocument document) {
    EList<Connectivity> _connectivities = connectBlock.getConnectivities();
    for (final Connectivity connect : _connectivities) {
      final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
        it.newLine();
      };
      document.append(this.textRegionExtensions.regionFor(connect).keyword(";"), _function);
    }
  }
  
  protected void _format(final FunctionDeclarationBlock funBlock, @Extension final IFormattableDocument document) {
    EList<Callable> _functions = funBlock.getFunctions();
    for (final Callable fun : _functions) {
      final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
        it.newLine();
      };
      document.append(this.textRegionExtensions.regionFor(fun).keyword(";"), _function);
    }
  }
  
  protected void _format(final ScalarVarDefinition varr, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(this.textRegionExtensions.regionFor(varr).keyword(";"), _function);
  }
  
  protected void _format(final VarGroupDeclaration varr, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(this.textRegionExtensions.regionFor(varr).keyword(";"), _function);
  }
  
  protected void _format(final InstructionJob inst, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(this.textRegionExtensions.regionFor(inst).keyword(";"), _function);
  }
  
  protected void _format(final TimeLoopJob inst, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(this.textRegionExtensions.regionFor(inst).keyword(";"), _function);
  }
  
  public void format(final Object connectBlock, final IFormattableDocument document) {
    if (connectBlock instanceof XtextResource) {
      _format((XtextResource)connectBlock, document);
      return;
    } else if (connectBlock instanceof ConnectivityDeclarationBlock) {
      _format((ConnectivityDeclarationBlock)connectBlock, document);
      return;
    } else if (connectBlock instanceof FunctionDeclarationBlock) {
      _format((FunctionDeclarationBlock)connectBlock, document);
      return;
    } else if (connectBlock instanceof InstructionJob) {
      _format((InstructionJob)connectBlock, document);
      return;
    } else if (connectBlock instanceof ScalarVarDefinition) {
      _format((ScalarVarDefinition)connectBlock, document);
      return;
    } else if (connectBlock instanceof TimeLoopJob) {
      _format((TimeLoopJob)connectBlock, document);
      return;
    } else if (connectBlock instanceof VarGroupDeclaration) {
      _format((VarGroupDeclaration)connectBlock, document);
      return;
    } else if (connectBlock instanceof DeclarationBlock) {
      _format((DeclarationBlock)connectBlock, document);
      return;
    } else if (connectBlock instanceof Import) {
      _format((Import)connectBlock, document);
      return;
    } else if (connectBlock instanceof NablaModule) {
      _format((NablaModule)connectBlock, document);
      return;
    } else if (connectBlock instanceof EObject) {
      _format((EObject)connectBlock, document);
      return;
    } else if (connectBlock == null) {
      _format((Void)null, document);
      return;
    } else if (connectBlock != null) {
      _format(connectBlock, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(connectBlock, document).toString());
    }
  }
}

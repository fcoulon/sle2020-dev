/**
 */
package fr.cea.nabla.ir.ir.util;

import fr.cea.nabla.ir.ir.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.cea.nabla.ir.ir.IrPackage
 * @generated
 */
public class IrAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IrPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IrAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IrPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IrSwitch<Adapter> modelSwitch =
		new IrSwitch<Adapter>() {
			@Override
			public Adapter caseIrAnnotable(IrAnnotable object) {
				return createIrAnnotableAdapter();
			}
			@Override
			public Adapter caseIrAnnotation(IrAnnotation object) {
				return createIrAnnotationAdapter();
			}
			@Override
			public Adapter caseIrModule(IrModule object) {
				return createIrModuleAdapter();
			}
			@Override
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseScalarVariable(ScalarVariable object) {
				return createScalarVariableAdapter();
			}
			@Override
			public Adapter caseArrayVariable(ArrayVariable object) {
				return createArrayVariableAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseReduction(Reduction object) {
				return createReductionAdapter();
			}
			@Override
			public Adapter caseConnectivity(Connectivity object) {
				return createConnectivityAdapter();
			}
			@Override
			public Adapter caseItemArgType(ItemArgType object) {
				return createItemArgTypeAdapter();
			}
			@Override
			public Adapter caseJob(Job object) {
				return createJobAdapter();
			}
			@Override
			public Adapter caseInstructionJob(InstructionJob object) {
				return createInstructionJobAdapter();
			}
			@Override
			public Adapter caseTimeIterationCopyJob(TimeIterationCopyJob object) {
				return createTimeIterationCopyJobAdapter();
			}
			@Override
			public Adapter caseReductionCall(ReductionCall object) {
				return createReductionCallAdapter();
			}
			@Override
			public Adapter caseInstruction(Instruction object) {
				return createInstructionAdapter();
			}
			@Override
			public Adapter caseReductionInstruction(ReductionInstruction object) {
				return createReductionInstructionAdapter();
			}
			@Override
			public Adapter caseScalarVarDefinition(ScalarVarDefinition object) {
				return createScalarVarDefinitionAdapter();
			}
			@Override
			public Adapter caseInstructionBlock(InstructionBlock object) {
				return createInstructionBlockAdapter();
			}
			@Override
			public Adapter caseAffectation(Affectation object) {
				return createAffectationAdapter();
			}
			@Override
			public Adapter caseLoop(Loop object) {
				return createLoopAdapter();
			}
			@Override
			public Adapter caseIf(If object) {
				return createIfAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseExpressionType(ExpressionType object) {
				return createExpressionTypeAdapter();
			}
			@Override
			public Adapter caseBinaryExpression(BinaryExpression object) {
				return createBinaryExpressionAdapter();
			}
			@Override
			public Adapter caseUnaryExpression(UnaryExpression object) {
				return createUnaryExpressionAdapter();
			}
			@Override
			public Adapter caseParenthesis(Parenthesis object) {
				return createParenthesisAdapter();
			}
			@Override
			public Adapter caseIntConstant(IntConstant object) {
				return createIntConstantAdapter();
			}
			@Override
			public Adapter caseRealConstant(RealConstant object) {
				return createRealConstantAdapter();
			}
			@Override
			public Adapter caseReal2Constant(Real2Constant object) {
				return createReal2ConstantAdapter();
			}
			@Override
			public Adapter caseReal3Constant(Real3Constant object) {
				return createReal3ConstantAdapter();
			}
			@Override
			public Adapter caseReal2x2Constant(Real2x2Constant object) {
				return createReal2x2ConstantAdapter();
			}
			@Override
			public Adapter caseReal3x3Constant(Real3x3Constant object) {
				return createReal3x3ConstantAdapter();
			}
			@Override
			public Adapter caseMaxConstant(MaxConstant object) {
				return createMaxConstantAdapter();
			}
			@Override
			public Adapter caseMinConstant(MinConstant object) {
				return createMinConstantAdapter();
			}
			@Override
			public Adapter caseBoolConstant(BoolConstant object) {
				return createBoolConstantAdapter();
			}
			@Override
			public Adapter caseFunctionCall(FunctionCall object) {
				return createFunctionCallAdapter();
			}
			@Override
			public Adapter caseVarRef(VarRef object) {
				return createVarRefAdapter();
			}
			@Override
			public Adapter caseIterator(Iterator object) {
				return createIteratorAdapter();
			}
			@Override
			public Adapter caseIteratorRangeOrRef(IteratorRangeOrRef object) {
				return createIteratorRangeOrRefAdapter();
			}
			@Override
			public Adapter caseIteratorRange(IteratorRange object) {
				return createIteratorRangeAdapter();
			}
			@Override
			public Adapter caseIteratorRef(IteratorRef object) {
				return createIteratorRefAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.IrAnnotable <em>Annotable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.IrAnnotable
	 * @generated
	 */
	public Adapter createIrAnnotableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.IrAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.IrAnnotation
	 * @generated
	 */
	public Adapter createIrAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.IrModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.IrModule
	 * @generated
	 */
	public Adapter createIrModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.ScalarVariable <em>Scalar Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.ScalarVariable
	 * @generated
	 */
	public Adapter createScalarVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.ArrayVariable <em>Array Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.ArrayVariable
	 * @generated
	 */
	public Adapter createArrayVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.Reduction <em>Reduction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.Reduction
	 * @generated
	 */
	public Adapter createReductionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.Connectivity <em>Connectivity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.Connectivity
	 * @generated
	 */
	public Adapter createConnectivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.ItemArgType <em>Item Arg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.ItemArgType
	 * @generated
	 */
	public Adapter createItemArgTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.Job
	 * @generated
	 */
	public Adapter createJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.InstructionJob <em>Instruction Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.InstructionJob
	 * @generated
	 */
	public Adapter createInstructionJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.TimeIterationCopyJob <em>Time Iteration Copy Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.TimeIterationCopyJob
	 * @generated
	 */
	public Adapter createTimeIterationCopyJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.ReductionCall <em>Reduction Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.ReductionCall
	 * @generated
	 */
	public Adapter createReductionCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.Instruction
	 * @generated
	 */
	public Adapter createInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.ReductionInstruction <em>Reduction Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.ReductionInstruction
	 * @generated
	 */
	public Adapter createReductionInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.ScalarVarDefinition <em>Scalar Var Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.ScalarVarDefinition
	 * @generated
	 */
	public Adapter createScalarVarDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.InstructionBlock <em>Instruction Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.InstructionBlock
	 * @generated
	 */
	public Adapter createInstructionBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.Affectation <em>Affectation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.Affectation
	 * @generated
	 */
	public Adapter createAffectationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.Loop
	 * @generated
	 */
	public Adapter createLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.If
	 * @generated
	 */
	public Adapter createIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.ExpressionType <em>Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.ExpressionType
	 * @generated
	 */
	public Adapter createExpressionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.BinaryExpression
	 * @generated
	 */
	public Adapter createBinaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.UnaryExpression
	 * @generated
	 */
	public Adapter createUnaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.Parenthesis <em>Parenthesis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.Parenthesis
	 * @generated
	 */
	public Adapter createParenthesisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.IntConstant <em>Int Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.IntConstant
	 * @generated
	 */
	public Adapter createIntConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.RealConstant <em>Real Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.RealConstant
	 * @generated
	 */
	public Adapter createRealConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.Real2Constant <em>Real2 Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.Real2Constant
	 * @generated
	 */
	public Adapter createReal2ConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.Real3Constant <em>Real3 Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.Real3Constant
	 * @generated
	 */
	public Adapter createReal3ConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.Real2x2Constant <em>Real2x2 Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.Real2x2Constant
	 * @generated
	 */
	public Adapter createReal2x2ConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.Real3x3Constant <em>Real3x3 Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.Real3x3Constant
	 * @generated
	 */
	public Adapter createReal3x3ConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.MaxConstant <em>Max Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.MaxConstant
	 * @generated
	 */
	public Adapter createMaxConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.MinConstant <em>Min Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.MinConstant
	 * @generated
	 */
	public Adapter createMinConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.BoolConstant <em>Bool Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.BoolConstant
	 * @generated
	 */
	public Adapter createBoolConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.FunctionCall
	 * @generated
	 */
	public Adapter createFunctionCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.VarRef <em>Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.VarRef
	 * @generated
	 */
	public Adapter createVarRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.Iterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.Iterator
	 * @generated
	 */
	public Adapter createIteratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.IteratorRangeOrRef <em>Iterator Range Or Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.IteratorRangeOrRef
	 * @generated
	 */
	public Adapter createIteratorRangeOrRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.IteratorRange <em>Iterator Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.IteratorRange
	 * @generated
	 */
	public Adapter createIteratorRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nabla.ir.ir.IteratorRef <em>Iterator Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nabla.ir.ir.IteratorRef
	 * @generated
	 */
	public Adapter createIteratorRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IrAdapterFactory

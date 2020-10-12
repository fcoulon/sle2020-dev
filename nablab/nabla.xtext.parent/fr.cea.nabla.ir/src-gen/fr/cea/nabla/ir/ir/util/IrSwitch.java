/**
 */
package fr.cea.nabla.ir.ir.util;

import fr.cea.nabla.ir.ir.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.cea.nabla.ir.ir.IrPackage
 * @generated
 */
public class IrSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IrPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IrSwitch() {
		if (modelPackage == null) {
			modelPackage = IrPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IrPackage.IR_ANNOTABLE: {
				IrAnnotable irAnnotable = (IrAnnotable)theEObject;
				T result = caseIrAnnotable(irAnnotable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.IR_ANNOTATION: {
				IrAnnotation irAnnotation = (IrAnnotation)theEObject;
				T result = caseIrAnnotation(irAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.IR_MODULE: {
				IrModule irModule = (IrModule)theEObject;
				T result = caseIrModule(irModule);
				if (result == null) result = caseIrAnnotable(irModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = caseIrAnnotable(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseIrAnnotable(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.SCALAR_VARIABLE: {
				ScalarVariable scalarVariable = (ScalarVariable)theEObject;
				T result = caseScalarVariable(scalarVariable);
				if (result == null) result = caseVariable(scalarVariable);
				if (result == null) result = caseIrAnnotable(scalarVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.ARRAY_VARIABLE: {
				ArrayVariable arrayVariable = (ArrayVariable)theEObject;
				T result = caseArrayVariable(arrayVariable);
				if (result == null) result = caseVariable(arrayVariable);
				if (result == null) result = caseIrAnnotable(arrayVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = caseIrAnnotable(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.REDUCTION: {
				Reduction reduction = (Reduction)theEObject;
				T result = caseReduction(reduction);
				if (result == null) result = caseIrAnnotable(reduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.CONNECTIVITY: {
				Connectivity connectivity = (Connectivity)theEObject;
				T result = caseConnectivity(connectivity);
				if (result == null) result = caseIrAnnotable(connectivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.ITEM_ARG_TYPE: {
				ItemArgType itemArgType = (ItemArgType)theEObject;
				T result = caseItemArgType(itemArgType);
				if (result == null) result = caseIrAnnotable(itemArgType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.JOB: {
				Job job = (Job)theEObject;
				T result = caseJob(job);
				if (result == null) result = caseIrAnnotable(job);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.INSTRUCTION_JOB: {
				InstructionJob instructionJob = (InstructionJob)theEObject;
				T result = caseInstructionJob(instructionJob);
				if (result == null) result = caseJob(instructionJob);
				if (result == null) result = caseIrAnnotable(instructionJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.TIME_ITERATION_COPY_JOB: {
				TimeIterationCopyJob timeIterationCopyJob = (TimeIterationCopyJob)theEObject;
				T result = caseTimeIterationCopyJob(timeIterationCopyJob);
				if (result == null) result = caseJob(timeIterationCopyJob);
				if (result == null) result = caseIrAnnotable(timeIterationCopyJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.REDUCTION_CALL: {
				ReductionCall reductionCall = (ReductionCall)theEObject;
				T result = caseReductionCall(reductionCall);
				if (result == null) result = caseIrAnnotable(reductionCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.INSTRUCTION: {
				Instruction instruction = (Instruction)theEObject;
				T result = caseInstruction(instruction);
				if (result == null) result = caseIrAnnotable(instruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.REDUCTION_INSTRUCTION: {
				ReductionInstruction reductionInstruction = (ReductionInstruction)theEObject;
				T result = caseReductionInstruction(reductionInstruction);
				if (result == null) result = caseInstruction(reductionInstruction);
				if (result == null) result = caseIrAnnotable(reductionInstruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.SCALAR_VAR_DEFINITION: {
				ScalarVarDefinition scalarVarDefinition = (ScalarVarDefinition)theEObject;
				T result = caseScalarVarDefinition(scalarVarDefinition);
				if (result == null) result = caseInstruction(scalarVarDefinition);
				if (result == null) result = caseIrAnnotable(scalarVarDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.INSTRUCTION_BLOCK: {
				InstructionBlock instructionBlock = (InstructionBlock)theEObject;
				T result = caseInstructionBlock(instructionBlock);
				if (result == null) result = caseInstruction(instructionBlock);
				if (result == null) result = caseIrAnnotable(instructionBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.AFFECTATION: {
				Affectation affectation = (Affectation)theEObject;
				T result = caseAffectation(affectation);
				if (result == null) result = caseInstruction(affectation);
				if (result == null) result = caseIrAnnotable(affectation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.LOOP: {
				Loop loop = (Loop)theEObject;
				T result = caseLoop(loop);
				if (result == null) result = caseInstruction(loop);
				if (result == null) result = caseIrAnnotable(loop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.IF: {
				If if_ = (If)theEObject;
				T result = caseIf(if_);
				if (result == null) result = caseInstruction(if_);
				if (result == null) result = caseIrAnnotable(if_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseIrAnnotable(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.EXPRESSION_TYPE: {
				ExpressionType expressionType = (ExpressionType)theEObject;
				T result = caseExpressionType(expressionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.BINARY_EXPRESSION: {
				BinaryExpression binaryExpression = (BinaryExpression)theEObject;
				T result = caseBinaryExpression(binaryExpression);
				if (result == null) result = caseExpression(binaryExpression);
				if (result == null) result = caseIrAnnotable(binaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.UNARY_EXPRESSION: {
				UnaryExpression unaryExpression = (UnaryExpression)theEObject;
				T result = caseUnaryExpression(unaryExpression);
				if (result == null) result = caseExpression(unaryExpression);
				if (result == null) result = caseIrAnnotable(unaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.PARENTHESIS: {
				Parenthesis parenthesis = (Parenthesis)theEObject;
				T result = caseParenthesis(parenthesis);
				if (result == null) result = caseExpression(parenthesis);
				if (result == null) result = caseIrAnnotable(parenthesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.INT_CONSTANT: {
				IntConstant intConstant = (IntConstant)theEObject;
				T result = caseIntConstant(intConstant);
				if (result == null) result = caseExpression(intConstant);
				if (result == null) result = caseIrAnnotable(intConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.REAL_CONSTANT: {
				RealConstant realConstant = (RealConstant)theEObject;
				T result = caseRealConstant(realConstant);
				if (result == null) result = caseExpression(realConstant);
				if (result == null) result = caseIrAnnotable(realConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.REAL2_CONSTANT: {
				Real2Constant real2Constant = (Real2Constant)theEObject;
				T result = caseReal2Constant(real2Constant);
				if (result == null) result = caseExpression(real2Constant);
				if (result == null) result = caseIrAnnotable(real2Constant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.REAL3_CONSTANT: {
				Real3Constant real3Constant = (Real3Constant)theEObject;
				T result = caseReal3Constant(real3Constant);
				if (result == null) result = caseExpression(real3Constant);
				if (result == null) result = caseIrAnnotable(real3Constant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.REAL2X2_CONSTANT: {
				Real2x2Constant real2x2Constant = (Real2x2Constant)theEObject;
				T result = caseReal2x2Constant(real2x2Constant);
				if (result == null) result = caseExpression(real2x2Constant);
				if (result == null) result = caseIrAnnotable(real2x2Constant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.REAL3X3_CONSTANT: {
				Real3x3Constant real3x3Constant = (Real3x3Constant)theEObject;
				T result = caseReal3x3Constant(real3x3Constant);
				if (result == null) result = caseExpression(real3x3Constant);
				if (result == null) result = caseIrAnnotable(real3x3Constant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.MAX_CONSTANT: {
				MaxConstant maxConstant = (MaxConstant)theEObject;
				T result = caseMaxConstant(maxConstant);
				if (result == null) result = caseExpression(maxConstant);
				if (result == null) result = caseIrAnnotable(maxConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.MIN_CONSTANT: {
				MinConstant minConstant = (MinConstant)theEObject;
				T result = caseMinConstant(minConstant);
				if (result == null) result = caseExpression(minConstant);
				if (result == null) result = caseIrAnnotable(minConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.BOOL_CONSTANT: {
				BoolConstant boolConstant = (BoolConstant)theEObject;
				T result = caseBoolConstant(boolConstant);
				if (result == null) result = caseExpression(boolConstant);
				if (result == null) result = caseIrAnnotable(boolConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.FUNCTION_CALL: {
				FunctionCall functionCall = (FunctionCall)theEObject;
				T result = caseFunctionCall(functionCall);
				if (result == null) result = caseExpression(functionCall);
				if (result == null) result = caseIrAnnotable(functionCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.VAR_REF: {
				VarRef varRef = (VarRef)theEObject;
				T result = caseVarRef(varRef);
				if (result == null) result = caseExpression(varRef);
				if (result == null) result = caseIrAnnotable(varRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.ITERATOR: {
				Iterator iterator = (Iterator)theEObject;
				T result = caseIterator(iterator);
				if (result == null) result = caseIrAnnotable(iterator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.ITERATOR_RANGE_OR_REF: {
				IteratorRangeOrRef iteratorRangeOrRef = (IteratorRangeOrRef)theEObject;
				T result = caseIteratorRangeOrRef(iteratorRangeOrRef);
				if (result == null) result = caseIrAnnotable(iteratorRangeOrRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.ITERATOR_RANGE: {
				IteratorRange iteratorRange = (IteratorRange)theEObject;
				T result = caseIteratorRange(iteratorRange);
				if (result == null) result = caseIteratorRangeOrRef(iteratorRange);
				if (result == null) result = caseIrAnnotable(iteratorRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IrPackage.ITERATOR_REF: {
				IteratorRef iteratorRef = (IteratorRef)theEObject;
				T result = caseIteratorRef(iteratorRef);
				if (result == null) result = caseIteratorRangeOrRef(iteratorRef);
				if (result == null) result = caseIrAnnotable(iteratorRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIrAnnotable(IrAnnotable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIrAnnotation(IrAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIrModule(IrModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scalar Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scalar Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalarVariable(ScalarVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayVariable(ArrayVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reduction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reduction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReduction(Reduction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectivity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectivity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectivity(Connectivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Arg Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Arg Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemArgType(ItemArgType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJob(Job object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstructionJob(InstructionJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Iteration Copy Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Iteration Copy Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeIterationCopyJob(TimeIterationCopyJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reduction Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reduction Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReductionCall(ReductionCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstruction(Instruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reduction Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reduction Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReductionInstruction(ReductionInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scalar Var Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scalar Var Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalarVarDefinition(ScalarVarDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstructionBlock(InstructionBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Affectation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Affectation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAffectation(Affectation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoop(Loop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIf(If object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionType(ExpressionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryExpression(BinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryExpression(UnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parenthesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parenthesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParenthesis(Parenthesis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntConstant(IntConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealConstant(RealConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real2 Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real2 Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReal2Constant(Real2Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real3 Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real3 Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReal3Constant(Real3Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real2x2 Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real2x2 Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReal2x2Constant(Real2x2Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real3x3 Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real3x3 Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReal3x3Constant(Real3x3Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxConstant(MaxConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinConstant(MinConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolConstant(BoolConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionCall(FunctionCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarRef(VarRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iterator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIterator(Iterator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iterator Range Or Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iterator Range Or Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIteratorRangeOrRef(IteratorRangeOrRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iterator Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iterator Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIteratorRange(IteratorRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iterator Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iterator Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIteratorRef(IteratorRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //IrSwitch

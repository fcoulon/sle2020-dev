/**
 */
package fr.cea.nabla.ir.ir;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.cea.nabla.ir.ir.IrFactory
 * @model kind="package"
 * @generated
 */
public interface IrPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ir";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cea.fr/nabla/ir";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ir";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IrPackage eINSTANCE = fr.cea.nabla.ir.ir.impl.IrPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.IrAnnotableImpl <em>Annotable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.IrAnnotableImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getIrAnnotable()
	 * @generated
	 */
	int IR_ANNOTABLE = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IR_ANNOTABLE__ANNOTATIONS = 0;

	/**
	 * The number of structural features of the '<em>Annotable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IR_ANNOTABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Annotable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IR_ANNOTABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.IrAnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.IrAnnotationImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getIrAnnotation()
	 * @generated
	 */
	int IR_ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IR_ANNOTATION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IR_ANNOTATION__DETAILS = 1;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IR_ANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IR_ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.IrModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.IrModuleImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getIrModule()
	 * @generated
	 */
	int IR_MODULE = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IR_MODULE__ANNOTATIONS = IR_ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IR_MODULE__NAME = IR_ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IR_MODULE__IMPORTS = IR_ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IR_MODULE__FUNCTIONS = IR_ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reductions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IR_MODULE__REDUCTIONS = IR_ANNOTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connectivities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IR_MODULE__CONNECTIVITIES = IR_ANNOTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IR_MODULE__VARIABLES = IR_ANNOTABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IR_MODULE__JOBS = IR_ANNOTABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IR_MODULE_FEATURE_COUNT = IR_ANNOTABLE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IR_MODULE_OPERATION_COUNT = IR_ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.ImportImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__ANNOTATIONS = IR_ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORTED_NAMESPACE = IR_ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = IR_ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = IR_ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.VariableImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ANNOTATIONS = IR_ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = IR_ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = IR_ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Persist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__PERSIST = IR_ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Persistence Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__PERSISTENCE_NAME = IR_ANNOTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = IR_ANNOTABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = IR_ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.ScalarVariableImpl <em>Scalar Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.ScalarVariableImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getScalarVariable()
	 * @generated
	 */
	int SCALAR_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_VARIABLE__ANNOTATIONS = VARIABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_VARIABLE__TYPE = VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Persist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_VARIABLE__PERSIST = VARIABLE__PERSIST;

	/**
	 * The feature id for the '<em><b>Persistence Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_VARIABLE__PERSISTENCE_NAME = VARIABLE__PERSISTENCE_NAME;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_VARIABLE__DEFAULT_VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_VARIABLE__CONST = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scalar Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Scalar Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.ArrayVariableImpl <em>Array Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.ArrayVariableImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getArrayVariable()
	 * @generated
	 */
	int ARRAY_VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VARIABLE__ANNOTATIONS = VARIABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VARIABLE__TYPE = VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Persist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VARIABLE__PERSIST = VARIABLE__PERSIST;

	/**
	 * The feature id for the '<em><b>Persistence Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VARIABLE__PERSISTENCE_NAME = VARIABLE__PERSISTENCE_NAME;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VARIABLE__DIMENSIONS = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.FunctionImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 7;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ANNOTATIONS = IR_ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = IR_ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__IN_TYPES = IR_ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__RETURN_TYPE = IR_ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PROVIDER = IR_ANNOTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = IR_ANNOTABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = IR_ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.ReductionImpl <em>Reduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.ReductionImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getReduction()
	 * @generated
	 */
	int REDUCTION = 8;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION__ANNOTATIONS = IR_ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION__NAME = IR_ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION__COLLECTION_TYPE = IR_ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION__RETURN_TYPE = IR_ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION__PROVIDER = IR_ANNOTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Reduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_FEATURE_COUNT = IR_ANNOTABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Reduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_OPERATION_COUNT = IR_ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.ConnectivityImpl <em>Connectivity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.ConnectivityImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getConnectivity()
	 * @generated
	 */
	int CONNECTIVITY = 9;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY__ANNOTATIONS = IR_ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY__NAME = IR_ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY__IN_TYPES = IR_ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY__RETURN_TYPE = IR_ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Index Equal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY__INDEX_EQUAL_ID = IR_ANNOTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Connectivity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_FEATURE_COUNT = IR_ANNOTABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Connectivity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_OPERATION_COUNT = IR_ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.ItemArgTypeImpl <em>Item Arg Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.ItemArgTypeImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getItemArgType()
	 * @generated
	 */
	int ITEM_ARG_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ARG_TYPE__ANNOTATIONS = IR_ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ARG_TYPE__MULTIPLE = IR_ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ARG_TYPE__TYPE = IR_ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Item Arg Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ARG_TYPE_FEATURE_COUNT = IR_ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Item Arg Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ARG_TYPE_OPERATION_COUNT = IR_ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.JobImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getJob()
	 * @generated
	 */
	int JOB = 11;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ANNOTATIONS = IR_ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__NAME = IR_ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__AT = IR_ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ON_CYCLE = IR_ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = IR_ANNOTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_OPERATION_COUNT = IR_ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.InstructionJobImpl <em>Instruction Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.InstructionJobImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getInstructionJob()
	 * @generated
	 */
	int INSTRUCTION_JOB = 12;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_JOB__ANNOTATIONS = JOB__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_JOB__NAME = JOB__NAME;

	/**
	 * The feature id for the '<em><b>At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_JOB__AT = JOB__AT;

	/**
	 * The feature id for the '<em><b>On Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_JOB__ON_CYCLE = JOB__ON_CYCLE;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_JOB__INSTRUCTION = JOB_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instruction Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_JOB_FEATURE_COUNT = JOB_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instruction Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_JOB_OPERATION_COUNT = JOB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.TimeIterationCopyJobImpl <em>Time Iteration Copy Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.TimeIterationCopyJobImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getTimeIterationCopyJob()
	 * @generated
	 */
	int TIME_ITERATION_COPY_JOB = 13;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ITERATION_COPY_JOB__ANNOTATIONS = JOB__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ITERATION_COPY_JOB__NAME = JOB__NAME;

	/**
	 * The feature id for the '<em><b>At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ITERATION_COPY_JOB__AT = JOB__AT;

	/**
	 * The feature id for the '<em><b>On Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ITERATION_COPY_JOB__ON_CYCLE = JOB__ON_CYCLE;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ITERATION_COPY_JOB__LEFT = JOB_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ITERATION_COPY_JOB__RIGHT = JOB_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Iterator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ITERATION_COPY_JOB__TIME_ITERATOR_NAME = JOB_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Time Iteration Copy Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ITERATION_COPY_JOB_FEATURE_COUNT = JOB_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Time Iteration Copy Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ITERATION_COPY_JOB_OPERATION_COUNT = JOB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.ReductionCallImpl <em>Reduction Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.ReductionCallImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getReductionCall()
	 * @generated
	 */
	int REDUCTION_CALL = 14;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CALL__ANNOTATIONS = IR_ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Reduction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CALL__REDUCTION = IR_ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CALL__ITERATOR = IR_ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CALL__ARG = IR_ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reduction Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CALL_FEATURE_COUNT = IR_ANNOTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Reduction Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CALL_OPERATION_COUNT = IR_ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.InstructionImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 15;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__ANNOTATIONS = IR_ANNOTABLE__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = IR_ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = IR_ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.ReductionInstructionImpl <em>Reduction Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.ReductionInstructionImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getReductionInstruction()
	 * @generated
	 */
	int REDUCTION_INSTRUCTION = 16;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_INSTRUCTION__ANNOTATIONS = INSTRUCTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_INSTRUCTION__VARIABLE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reduction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_INSTRUCTION__REDUCTION = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reduction Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_INSTRUCTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reduction Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_INSTRUCTION_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.ScalarVarDefinitionImpl <em>Scalar Var Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.ScalarVarDefinitionImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getScalarVarDefinition()
	 * @generated
	 */
	int SCALAR_VAR_DEFINITION = 17;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_VAR_DEFINITION__ANNOTATIONS = INSTRUCTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_VAR_DEFINITION__VARIABLES = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scalar Var Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_VAR_DEFINITION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Scalar Var Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_VAR_DEFINITION_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.InstructionBlockImpl <em>Instruction Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.InstructionBlockImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getInstructionBlock()
	 * @generated
	 */
	int INSTRUCTION_BLOCK = 18;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_BLOCK__ANNOTATIONS = INSTRUCTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_BLOCK__INSTRUCTIONS = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instruction Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_BLOCK_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instruction Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_BLOCK_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.AffectationImpl <em>Affectation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.AffectationImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getAffectation()
	 * @generated
	 */
	int AFFECTATION = 19;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION__ANNOTATIONS = INSTRUCTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION__LEFT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION__OPERATOR = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION__RIGHT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Affectation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Affectation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.LoopImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 20;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__ANNOTATIONS = INSTRUCTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__ITERATOR = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__BODY = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.IfImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getIf()
	 * @generated
	 */
	int IF = 21;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ANNOTATIONS = INSTRUCTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__THEN_INSTRUCTION = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE_INSTRUCTION = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.ExpressionImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 22;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ANNOTATIONS = IR_ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__TYPE = IR_ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = IR_ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = IR_ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.ExpressionTypeImpl <em>Expression Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.ExpressionTypeImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getExpressionType()
	 * @generated
	 */
	int EXPRESSION_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Basic Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TYPE__BASIC_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TYPE__DIMENSION = 1;

	/**
	 * The number of structural features of the '<em>Expression Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Expression Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.BinaryExpressionImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 24;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.UnaryExpressionImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 25;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.ParenthesisImpl <em>Parenthesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.ParenthesisImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getParenthesis()
	 * @generated
	 */
	int PARENTHESIS = 26;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIS__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIS__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIS__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parenthesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parenthesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.IntConstantImpl <em>Int Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.IntConstantImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getIntConstant()
	 * @generated
	 */
	int INT_CONSTANT = 27;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONSTANT__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONSTANT__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONSTANT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONSTANT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.RealConstantImpl <em>Real Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.RealConstantImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getRealConstant()
	 * @generated
	 */
	int REAL_CONSTANT = 28;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CONSTANT__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CONSTANT__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CONSTANT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Real Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CONSTANT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.Real2ConstantImpl <em>Real2 Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.Real2ConstantImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getReal2Constant()
	 * @generated
	 */
	int REAL2_CONSTANT = 29;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL2_CONSTANT__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL2_CONSTANT__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL2_CONSTANT__X = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL2_CONSTANT__Y = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Real2 Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL2_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Real2 Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL2_CONSTANT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.Real3ConstantImpl <em>Real3 Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.Real3ConstantImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getReal3Constant()
	 * @generated
	 */
	int REAL3_CONSTANT = 30;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL3_CONSTANT__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL3_CONSTANT__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL3_CONSTANT__X = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL3_CONSTANT__Y = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL3_CONSTANT__Z = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Real3 Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL3_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Real3 Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL3_CONSTANT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.Real2x2ConstantImpl <em>Real2x2 Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.Real2x2ConstantImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getReal2x2Constant()
	 * @generated
	 */
	int REAL2X2_CONSTANT = 31;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL2X2_CONSTANT__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL2X2_CONSTANT__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL2X2_CONSTANT__X = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL2X2_CONSTANT__Y = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Real2x2 Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL2X2_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Real2x2 Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL2X2_CONSTANT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.Real3x3ConstantImpl <em>Real3x3 Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.Real3x3ConstantImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getReal3x3Constant()
	 * @generated
	 */
	int REAL3X3_CONSTANT = 32;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL3X3_CONSTANT__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL3X3_CONSTANT__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL3X3_CONSTANT__X = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL3X3_CONSTANT__Y = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL3X3_CONSTANT__Z = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Real3x3 Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL3X3_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Real3x3 Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL3X3_CONSTANT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.MaxConstantImpl <em>Max Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.MaxConstantImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getMaxConstant()
	 * @generated
	 */
	int MAX_CONSTANT = 33;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CONSTANT__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CONSTANT__TYPE = EXPRESSION__TYPE;

	/**
	 * The number of structural features of the '<em>Max Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Max Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CONSTANT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.MinConstantImpl <em>Min Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.MinConstantImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getMinConstant()
	 * @generated
	 */
	int MIN_CONSTANT = 34;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CONSTANT__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CONSTANT__TYPE = EXPRESSION__TYPE;

	/**
	 * The number of structural features of the '<em>Min Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Min Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CONSTANT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.BoolConstantImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getBoolConstant()
	 * @generated
	 */
	int BOOL_CONSTANT = 35;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_CONSTANT__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_CONSTANT__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_CONSTANT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bool Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bool Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_CONSTANT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.FunctionCallImpl <em>Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.FunctionCallImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getFunctionCall()
	 * @generated
	 */
	int FUNCTION_CALL = 36;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__FUNCTION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__ARGS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.VarRefImpl <em>Var Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.VarRefImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getVarRef()
	 * @generated
	 */
	int VAR_REF = 37;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iterators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF__ITERATORS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF__FIELDS = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Var Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Var Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.IteratorImpl <em>Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.IteratorImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getIterator()
	 * @generated
	 */
	int ITERATOR = 38;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__ANNOTATIONS = IR_ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__NAME = IR_ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__RANGE = IR_ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_FEATURE_COUNT = IR_ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_OPERATION_COUNT = IR_ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.IteratorRangeOrRefImpl <em>Iterator Range Or Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.IteratorRangeOrRefImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getIteratorRangeOrRef()
	 * @generated
	 */
	int ITERATOR_RANGE_OR_REF = 39;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_RANGE_OR_REF__ANNOTATIONS = IR_ANNOTABLE__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Iterator Range Or Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_RANGE_OR_REF_FEATURE_COUNT = IR_ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iterator Range Or Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_RANGE_OR_REF_OPERATION_COUNT = IR_ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.IteratorRangeImpl <em>Iterator Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.IteratorRangeImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getIteratorRange()
	 * @generated
	 */
	int ITERATOR_RANGE = 40;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_RANGE__ANNOTATIONS = ITERATOR_RANGE_OR_REF__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Connectivity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_RANGE__CONNECTIVITY = ITERATOR_RANGE_OR_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_RANGE__ARGS = ITERATOR_RANGE_OR_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Iterator Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_RANGE_FEATURE_COUNT = ITERATOR_RANGE_OR_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Iterator Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_RANGE_OPERATION_COUNT = ITERATOR_RANGE_OR_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.impl.IteratorRefImpl <em>Iterator Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.impl.IteratorRefImpl
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getIteratorRef()
	 * @generated
	 */
	int ITERATOR_REF = 41;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_REF__ANNOTATIONS = ITERATOR_RANGE_OR_REF__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_REF__ITERATOR = ITERATOR_RANGE_OR_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_REF__PREV = ITERATOR_RANGE_OR_REF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_REF__NEXT = ITERATOR_RANGE_OR_REF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Iterator Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_REF_FEATURE_COUNT = ITERATOR_RANGE_OR_REF_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Iterator Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_REF_OPERATION_COUNT = ITERATOR_RANGE_OR_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.ItemType <em>Item Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.ItemType
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getItemType()
	 * @generated
	 */
	int ITEM_TYPE = 42;

	/**
	 * The meta object id for the '{@link fr.cea.nabla.ir.ir.BasicType <em>Basic Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nabla.ir.ir.BasicType
	 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getBasicType()
	 * @generated
	 */
	int BASIC_TYPE = 43;


	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.IrAnnotable <em>Annotable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotable</em>'.
	 * @see fr.cea.nabla.ir.ir.IrAnnotable
	 * @generated
	 */
	EClass getIrAnnotable();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nabla.ir.ir.IrAnnotable#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see fr.cea.nabla.ir.ir.IrAnnotable#getAnnotations()
	 * @see #getIrAnnotable()
	 * @generated
	 */
	EReference getIrAnnotable_Annotations();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.IrAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see fr.cea.nabla.ir.ir.IrAnnotation
	 * @generated
	 */
	EClass getIrAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.IrAnnotation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see fr.cea.nabla.ir.ir.IrAnnotation#getSource()
	 * @see #getIrAnnotation()
	 * @generated
	 */
	EAttribute getIrAnnotation_Source();

	/**
	 * Returns the meta object for the map '{@link fr.cea.nabla.ir.ir.IrAnnotation#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Details</em>'.
	 * @see fr.cea.nabla.ir.ir.IrAnnotation#getDetails()
	 * @see #getIrAnnotation()
	 * @generated
	 */
	EReference getIrAnnotation_Details();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.IrModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see fr.cea.nabla.ir.ir.IrModule
	 * @generated
	 */
	EClass getIrModule();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.IrModule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.cea.nabla.ir.ir.IrModule#getName()
	 * @see #getIrModule()
	 * @generated
	 */
	EAttribute getIrModule_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nabla.ir.ir.IrModule#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see fr.cea.nabla.ir.ir.IrModule#getImports()
	 * @see #getIrModule()
	 * @generated
	 */
	EReference getIrModule_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nabla.ir.ir.IrModule#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see fr.cea.nabla.ir.ir.IrModule#getFunctions()
	 * @see #getIrModule()
	 * @generated
	 */
	EReference getIrModule_Functions();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nabla.ir.ir.IrModule#getReductions <em>Reductions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reductions</em>'.
	 * @see fr.cea.nabla.ir.ir.IrModule#getReductions()
	 * @see #getIrModule()
	 * @generated
	 */
	EReference getIrModule_Reductions();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nabla.ir.ir.IrModule#getConnectivities <em>Connectivities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectivities</em>'.
	 * @see fr.cea.nabla.ir.ir.IrModule#getConnectivities()
	 * @see #getIrModule()
	 * @generated
	 */
	EReference getIrModule_Connectivities();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nabla.ir.ir.IrModule#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see fr.cea.nabla.ir.ir.IrModule#getVariables()
	 * @see #getIrModule()
	 * @generated
	 */
	EReference getIrModule_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nabla.ir.ir.IrModule#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobs</em>'.
	 * @see fr.cea.nabla.ir.ir.IrModule#getJobs()
	 * @see #getIrModule()
	 * @generated
	 */
	EReference getIrModule_Jobs();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see fr.cea.nabla.ir.ir.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.Import#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see fr.cea.nabla.ir.ir.Import#getImportedNamespace()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see fr.cea.nabla.ir.ir.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.cea.nabla.ir.ir.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.cea.nabla.ir.ir.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.Variable#isPersist <em>Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persist</em>'.
	 * @see fr.cea.nabla.ir.ir.Variable#isPersist()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Persist();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.Variable#getPersistenceName <em>Persistence Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistence Name</em>'.
	 * @see fr.cea.nabla.ir.ir.Variable#getPersistenceName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_PersistenceName();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.ScalarVariable <em>Scalar Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scalar Variable</em>'.
	 * @see fr.cea.nabla.ir.ir.ScalarVariable
	 * @generated
	 */
	EClass getScalarVariable();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nabla.ir.ir.ScalarVariable#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see fr.cea.nabla.ir.ir.ScalarVariable#getDefaultValue()
	 * @see #getScalarVariable()
	 * @generated
	 */
	EReference getScalarVariable_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.ScalarVariable#isConst <em>Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Const</em>'.
	 * @see fr.cea.nabla.ir.ir.ScalarVariable#isConst()
	 * @see #getScalarVariable()
	 * @generated
	 */
	EAttribute getScalarVariable_Const();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.ArrayVariable <em>Array Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Variable</em>'.
	 * @see fr.cea.nabla.ir.ir.ArrayVariable
	 * @generated
	 */
	EClass getArrayVariable();

	/**
	 * Returns the meta object for the reference list '{@link fr.cea.nabla.ir.ir.ArrayVariable#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dimensions</em>'.
	 * @see fr.cea.nabla.ir.ir.ArrayVariable#getDimensions()
	 * @see #getArrayVariable()
	 * @generated
	 */
	EReference getArrayVariable_Dimensions();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see fr.cea.nabla.ir.ir.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.cea.nabla.ir.ir.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the attribute list '{@link fr.cea.nabla.ir.ir.Function#getInTypes <em>In Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>In Types</em>'.
	 * @see fr.cea.nabla.ir.ir.Function#getInTypes()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_InTypes();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.Function#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see fr.cea.nabla.ir.ir.Function#getReturnType()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.Function#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see fr.cea.nabla.ir.ir.Function#getProvider()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Provider();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.Reduction <em>Reduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reduction</em>'.
	 * @see fr.cea.nabla.ir.ir.Reduction
	 * @generated
	 */
	EClass getReduction();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.Reduction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.cea.nabla.ir.ir.Reduction#getName()
	 * @see #getReduction()
	 * @generated
	 */
	EAttribute getReduction_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.Reduction#getCollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Type</em>'.
	 * @see fr.cea.nabla.ir.ir.Reduction#getCollectionType()
	 * @see #getReduction()
	 * @generated
	 */
	EAttribute getReduction_CollectionType();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.Reduction#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see fr.cea.nabla.ir.ir.Reduction#getReturnType()
	 * @see #getReduction()
	 * @generated
	 */
	EAttribute getReduction_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.Reduction#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see fr.cea.nabla.ir.ir.Reduction#getProvider()
	 * @see #getReduction()
	 * @generated
	 */
	EAttribute getReduction_Provider();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.Connectivity <em>Connectivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connectivity</em>'.
	 * @see fr.cea.nabla.ir.ir.Connectivity
	 * @generated
	 */
	EClass getConnectivity();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.Connectivity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.cea.nabla.ir.ir.Connectivity#getName()
	 * @see #getConnectivity()
	 * @generated
	 */
	EAttribute getConnectivity_Name();

	/**
	 * Returns the meta object for the attribute list '{@link fr.cea.nabla.ir.ir.Connectivity#getInTypes <em>In Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>In Types</em>'.
	 * @see fr.cea.nabla.ir.ir.Connectivity#getInTypes()
	 * @see #getConnectivity()
	 * @generated
	 */
	EAttribute getConnectivity_InTypes();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nabla.ir.ir.Connectivity#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see fr.cea.nabla.ir.ir.Connectivity#getReturnType()
	 * @see #getConnectivity()
	 * @generated
	 */
	EReference getConnectivity_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.Connectivity#isIndexEqualId <em>Index Equal Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index Equal Id</em>'.
	 * @see fr.cea.nabla.ir.ir.Connectivity#isIndexEqualId()
	 * @see #getConnectivity()
	 * @generated
	 */
	EAttribute getConnectivity_IndexEqualId();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.ItemArgType <em>Item Arg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Arg Type</em>'.
	 * @see fr.cea.nabla.ir.ir.ItemArgType
	 * @generated
	 */
	EClass getItemArgType();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.ItemArgType#isMultiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple</em>'.
	 * @see fr.cea.nabla.ir.ir.ItemArgType#isMultiple()
	 * @see #getItemArgType()
	 * @generated
	 */
	EAttribute getItemArgType_Multiple();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.ItemArgType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.cea.nabla.ir.ir.ItemArgType#getType()
	 * @see #getItemArgType()
	 * @generated
	 */
	EAttribute getItemArgType_Type();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job</em>'.
	 * @see fr.cea.nabla.ir.ir.Job
	 * @generated
	 */
	EClass getJob();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.Job#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.cea.nabla.ir.ir.Job#getName()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.Job#getAt <em>At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>At</em>'.
	 * @see fr.cea.nabla.ir.ir.Job#getAt()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_At();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.Job#isOnCycle <em>On Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Cycle</em>'.
	 * @see fr.cea.nabla.ir.ir.Job#isOnCycle()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_OnCycle();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.InstructionJob <em>Instruction Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Job</em>'.
	 * @see fr.cea.nabla.ir.ir.InstructionJob
	 * @generated
	 */
	EClass getInstructionJob();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nabla.ir.ir.InstructionJob#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instruction</em>'.
	 * @see fr.cea.nabla.ir.ir.InstructionJob#getInstruction()
	 * @see #getInstructionJob()
	 * @generated
	 */
	EReference getInstructionJob_Instruction();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.TimeIterationCopyJob <em>Time Iteration Copy Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Iteration Copy Job</em>'.
	 * @see fr.cea.nabla.ir.ir.TimeIterationCopyJob
	 * @generated
	 */
	EClass getTimeIterationCopyJob();

	/**
	 * Returns the meta object for the reference '{@link fr.cea.nabla.ir.ir.TimeIterationCopyJob#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see fr.cea.nabla.ir.ir.TimeIterationCopyJob#getLeft()
	 * @see #getTimeIterationCopyJob()
	 * @generated
	 */
	EReference getTimeIterationCopyJob_Left();

	/**
	 * Returns the meta object for the reference '{@link fr.cea.nabla.ir.ir.TimeIterationCopyJob#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see fr.cea.nabla.ir.ir.TimeIterationCopyJob#getRight()
	 * @see #getTimeIterationCopyJob()
	 * @generated
	 */
	EReference getTimeIterationCopyJob_Right();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.TimeIterationCopyJob#getTimeIteratorName <em>Time Iterator Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Iterator Name</em>'.
	 * @see fr.cea.nabla.ir.ir.TimeIterationCopyJob#getTimeIteratorName()
	 * @see #getTimeIterationCopyJob()
	 * @generated
	 */
	EAttribute getTimeIterationCopyJob_TimeIteratorName();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.ReductionCall <em>Reduction Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reduction Call</em>'.
	 * @see fr.cea.nabla.ir.ir.ReductionCall
	 * @generated
	 */
	EClass getReductionCall();

	/**
	 * Returns the meta object for the reference '{@link fr.cea.nabla.ir.ir.ReductionCall#getReduction <em>Reduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reduction</em>'.
	 * @see fr.cea.nabla.ir.ir.ReductionCall#getReduction()
	 * @see #getReductionCall()
	 * @generated
	 */
	EReference getReductionCall_Reduction();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nabla.ir.ir.ReductionCall#getIterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iterator</em>'.
	 * @see fr.cea.nabla.ir.ir.ReductionCall#getIterator()
	 * @see #getReductionCall()
	 * @generated
	 */
	EReference getReductionCall_Iterator();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nabla.ir.ir.ReductionCall#getArg <em>Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arg</em>'.
	 * @see fr.cea.nabla.ir.ir.ReductionCall#getArg()
	 * @see #getReductionCall()
	 * @generated
	 */
	EReference getReductionCall_Arg();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see fr.cea.nabla.ir.ir.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.ReductionInstruction <em>Reduction Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reduction Instruction</em>'.
	 * @see fr.cea.nabla.ir.ir.ReductionInstruction
	 * @generated
	 */
	EClass getReductionInstruction();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nabla.ir.ir.ReductionInstruction#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see fr.cea.nabla.ir.ir.ReductionInstruction#getVariable()
	 * @see #getReductionInstruction()
	 * @generated
	 */
	EReference getReductionInstruction_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nabla.ir.ir.ReductionInstruction#getReduction <em>Reduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reduction</em>'.
	 * @see fr.cea.nabla.ir.ir.ReductionInstruction#getReduction()
	 * @see #getReductionInstruction()
	 * @generated
	 */
	EReference getReductionInstruction_Reduction();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.ScalarVarDefinition <em>Scalar Var Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scalar Var Definition</em>'.
	 * @see fr.cea.nabla.ir.ir.ScalarVarDefinition
	 * @generated
	 */
	EClass getScalarVarDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nabla.ir.ir.ScalarVarDefinition#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see fr.cea.nabla.ir.ir.ScalarVarDefinition#getVariables()
	 * @see #getScalarVarDefinition()
	 * @generated
	 */
	EReference getScalarVarDefinition_Variables();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.InstructionBlock <em>Instruction Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Block</em>'.
	 * @see fr.cea.nabla.ir.ir.InstructionBlock
	 * @generated
	 */
	EClass getInstructionBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nabla.ir.ir.InstructionBlock#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see fr.cea.nabla.ir.ir.InstructionBlock#getInstructions()
	 * @see #getInstructionBlock()
	 * @generated
	 */
	EReference getInstructionBlock_Instructions();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.Affectation <em>Affectation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Affectation</em>'.
	 * @see fr.cea.nabla.ir.ir.Affectation
	 * @generated
	 */
	EClass getAffectation();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nabla.ir.ir.Affectation#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.cea.nabla.ir.ir.Affectation#getLeft()
	 * @see #getAffectation()
	 * @generated
	 */
	EReference getAffectation_Left();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.Affectation#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see fr.cea.nabla.ir.ir.Affectation#getOperator()
	 * @see #getAffectation()
	 * @generated
	 */
	EAttribute getAffectation_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nabla.ir.ir.Affectation#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.cea.nabla.ir.ir.Affectation#getRight()
	 * @see #getAffectation()
	 * @generated
	 */
	EReference getAffectation_Right();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see fr.cea.nabla.ir.ir.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nabla.ir.ir.Loop#getIterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iterator</em>'.
	 * @see fr.cea.nabla.ir.ir.Loop#getIterator()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Iterator();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nabla.ir.ir.Loop#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see fr.cea.nabla.ir.ir.Loop#getBody()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Body();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see fr.cea.nabla.ir.ir.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nabla.ir.ir.If#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see fr.cea.nabla.ir.ir.If#getCondition()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nabla.ir.ir.If#getThenInstruction <em>Then Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Instruction</em>'.
	 * @see fr.cea.nabla.ir.ir.If#getThenInstruction()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_ThenInstruction();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nabla.ir.ir.If#getElseInstruction <em>Else Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Instruction</em>'.
	 * @see fr.cea.nabla.ir.ir.If#getElseInstruction()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_ElseInstruction();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see fr.cea.nabla.ir.ir.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nabla.ir.ir.Expression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see fr.cea.nabla.ir.ir.Expression#getType()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Type();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.ExpressionType <em>Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Type</em>'.
	 * @see fr.cea.nabla.ir.ir.ExpressionType
	 * @generated
	 */
	EClass getExpressionType();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.ExpressionType#getBasicType <em>Basic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Basic Type</em>'.
	 * @see fr.cea.nabla.ir.ir.ExpressionType#getBasicType()
	 * @see #getExpressionType()
	 * @generated
	 */
	EAttribute getExpressionType_BasicType();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.ExpressionType#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension</em>'.
	 * @see fr.cea.nabla.ir.ir.ExpressionType#getDimension()
	 * @see #getExpressionType()
	 * @generated
	 */
	EAttribute getExpressionType_Dimension();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see fr.cea.nabla.ir.ir.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.BinaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see fr.cea.nabla.ir.ir.BinaryExpression#getOperator()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EAttribute getBinaryExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nabla.ir.ir.BinaryExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.cea.nabla.ir.ir.BinaryExpression#getLeft()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nabla.ir.ir.BinaryExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.cea.nabla.ir.ir.BinaryExpression#getRight()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Right();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see fr.cea.nabla.ir.ir.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.UnaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see fr.cea.nabla.ir.ir.UnaryExpression#getOperator()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EAttribute getUnaryExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nabla.ir.ir.UnaryExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see fr.cea.nabla.ir.ir.UnaryExpression#getExpression()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Expression();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.Parenthesis <em>Parenthesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parenthesis</em>'.
	 * @see fr.cea.nabla.ir.ir.Parenthesis
	 * @generated
	 */
	EClass getParenthesis();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nabla.ir.ir.Parenthesis#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see fr.cea.nabla.ir.ir.Parenthesis#getExpression()
	 * @see #getParenthesis()
	 * @generated
	 */
	EReference getParenthesis_Expression();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.IntConstant <em>Int Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Constant</em>'.
	 * @see fr.cea.nabla.ir.ir.IntConstant
	 * @generated
	 */
	EClass getIntConstant();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.IntConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.cea.nabla.ir.ir.IntConstant#getValue()
	 * @see #getIntConstant()
	 * @generated
	 */
	EAttribute getIntConstant_Value();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.RealConstant <em>Real Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Constant</em>'.
	 * @see fr.cea.nabla.ir.ir.RealConstant
	 * @generated
	 */
	EClass getRealConstant();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.RealConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.cea.nabla.ir.ir.RealConstant#getValue()
	 * @see #getRealConstant()
	 * @generated
	 */
	EAttribute getRealConstant_Value();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.Real2Constant <em>Real2 Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real2 Constant</em>'.
	 * @see fr.cea.nabla.ir.ir.Real2Constant
	 * @generated
	 */
	EClass getReal2Constant();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.Real2Constant#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see fr.cea.nabla.ir.ir.Real2Constant#getX()
	 * @see #getReal2Constant()
	 * @generated
	 */
	EAttribute getReal2Constant_X();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.Real2Constant#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see fr.cea.nabla.ir.ir.Real2Constant#getY()
	 * @see #getReal2Constant()
	 * @generated
	 */
	EAttribute getReal2Constant_Y();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.Real3Constant <em>Real3 Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real3 Constant</em>'.
	 * @see fr.cea.nabla.ir.ir.Real3Constant
	 * @generated
	 */
	EClass getReal3Constant();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.Real3Constant#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see fr.cea.nabla.ir.ir.Real3Constant#getX()
	 * @see #getReal3Constant()
	 * @generated
	 */
	EAttribute getReal3Constant_X();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.Real3Constant#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see fr.cea.nabla.ir.ir.Real3Constant#getY()
	 * @see #getReal3Constant()
	 * @generated
	 */
	EAttribute getReal3Constant_Y();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.Real3Constant#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see fr.cea.nabla.ir.ir.Real3Constant#getZ()
	 * @see #getReal3Constant()
	 * @generated
	 */
	EAttribute getReal3Constant_Z();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.Real2x2Constant <em>Real2x2 Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real2x2 Constant</em>'.
	 * @see fr.cea.nabla.ir.ir.Real2x2Constant
	 * @generated
	 */
	EClass getReal2x2Constant();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nabla.ir.ir.Real2x2Constant#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>X</em>'.
	 * @see fr.cea.nabla.ir.ir.Real2x2Constant#getX()
	 * @see #getReal2x2Constant()
	 * @generated
	 */
	EReference getReal2x2Constant_X();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nabla.ir.ir.Real2x2Constant#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Y</em>'.
	 * @see fr.cea.nabla.ir.ir.Real2x2Constant#getY()
	 * @see #getReal2x2Constant()
	 * @generated
	 */
	EReference getReal2x2Constant_Y();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.Real3x3Constant <em>Real3x3 Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real3x3 Constant</em>'.
	 * @see fr.cea.nabla.ir.ir.Real3x3Constant
	 * @generated
	 */
	EClass getReal3x3Constant();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nabla.ir.ir.Real3x3Constant#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>X</em>'.
	 * @see fr.cea.nabla.ir.ir.Real3x3Constant#getX()
	 * @see #getReal3x3Constant()
	 * @generated
	 */
	EReference getReal3x3Constant_X();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nabla.ir.ir.Real3x3Constant#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Y</em>'.
	 * @see fr.cea.nabla.ir.ir.Real3x3Constant#getY()
	 * @see #getReal3x3Constant()
	 * @generated
	 */
	EReference getReal3x3Constant_Y();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nabla.ir.ir.Real3x3Constant#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Z</em>'.
	 * @see fr.cea.nabla.ir.ir.Real3x3Constant#getZ()
	 * @see #getReal3x3Constant()
	 * @generated
	 */
	EReference getReal3x3Constant_Z();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.MaxConstant <em>Max Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Constant</em>'.
	 * @see fr.cea.nabla.ir.ir.MaxConstant
	 * @generated
	 */
	EClass getMaxConstant();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.MinConstant <em>Min Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Constant</em>'.
	 * @see fr.cea.nabla.ir.ir.MinConstant
	 * @generated
	 */
	EClass getMinConstant();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.BoolConstant <em>Bool Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Constant</em>'.
	 * @see fr.cea.nabla.ir.ir.BoolConstant
	 * @generated
	 */
	EClass getBoolConstant();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.BoolConstant#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.cea.nabla.ir.ir.BoolConstant#isValue()
	 * @see #getBoolConstant()
	 * @generated
	 */
	EAttribute getBoolConstant_Value();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call</em>'.
	 * @see fr.cea.nabla.ir.ir.FunctionCall
	 * @generated
	 */
	EClass getFunctionCall();

	/**
	 * Returns the meta object for the reference '{@link fr.cea.nabla.ir.ir.FunctionCall#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see fr.cea.nabla.ir.ir.FunctionCall#getFunction()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EReference getFunctionCall_Function();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nabla.ir.ir.FunctionCall#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see fr.cea.nabla.ir.ir.FunctionCall#getArgs()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EReference getFunctionCall_Args();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.VarRef <em>Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Ref</em>'.
	 * @see fr.cea.nabla.ir.ir.VarRef
	 * @generated
	 */
	EClass getVarRef();

	/**
	 * Returns the meta object for the reference '{@link fr.cea.nabla.ir.ir.VarRef#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see fr.cea.nabla.ir.ir.VarRef#getVariable()
	 * @see #getVarRef()
	 * @generated
	 */
	EReference getVarRef_Variable();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nabla.ir.ir.VarRef#getIterators <em>Iterators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iterators</em>'.
	 * @see fr.cea.nabla.ir.ir.VarRef#getIterators()
	 * @see #getVarRef()
	 * @generated
	 */
	EReference getVarRef_Iterators();

	/**
	 * Returns the meta object for the attribute list '{@link fr.cea.nabla.ir.ir.VarRef#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Fields</em>'.
	 * @see fr.cea.nabla.ir.ir.VarRef#getFields()
	 * @see #getVarRef()
	 * @generated
	 */
	EAttribute getVarRef_Fields();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.Iterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator</em>'.
	 * @see fr.cea.nabla.ir.ir.Iterator
	 * @generated
	 */
	EClass getIterator();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.Iterator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.cea.nabla.ir.ir.Iterator#getName()
	 * @see #getIterator()
	 * @generated
	 */
	EAttribute getIterator_Name();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nabla.ir.ir.Iterator#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see fr.cea.nabla.ir.ir.Iterator#getRange()
	 * @see #getIterator()
	 * @generated
	 */
	EReference getIterator_Range();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.IteratorRangeOrRef <em>Iterator Range Or Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator Range Or Ref</em>'.
	 * @see fr.cea.nabla.ir.ir.IteratorRangeOrRef
	 * @generated
	 */
	EClass getIteratorRangeOrRef();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.IteratorRange <em>Iterator Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator Range</em>'.
	 * @see fr.cea.nabla.ir.ir.IteratorRange
	 * @generated
	 */
	EClass getIteratorRange();

	/**
	 * Returns the meta object for the reference '{@link fr.cea.nabla.ir.ir.IteratorRange#getConnectivity <em>Connectivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connectivity</em>'.
	 * @see fr.cea.nabla.ir.ir.IteratorRange#getConnectivity()
	 * @see #getIteratorRange()
	 * @generated
	 */
	EReference getIteratorRange_Connectivity();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nabla.ir.ir.IteratorRange#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see fr.cea.nabla.ir.ir.IteratorRange#getArgs()
	 * @see #getIteratorRange()
	 * @generated
	 */
	EReference getIteratorRange_Args();

	/**
	 * Returns the meta object for class '{@link fr.cea.nabla.ir.ir.IteratorRef <em>Iterator Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator Ref</em>'.
	 * @see fr.cea.nabla.ir.ir.IteratorRef
	 * @generated
	 */
	EClass getIteratorRef();

	/**
	 * Returns the meta object for the reference '{@link fr.cea.nabla.ir.ir.IteratorRef#getIterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Iterator</em>'.
	 * @see fr.cea.nabla.ir.ir.IteratorRef#getIterator()
	 * @see #getIteratorRef()
	 * @generated
	 */
	EReference getIteratorRef_Iterator();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.IteratorRef#isPrev <em>Prev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prev</em>'.
	 * @see fr.cea.nabla.ir.ir.IteratorRef#isPrev()
	 * @see #getIteratorRef()
	 * @generated
	 */
	EAttribute getIteratorRef_Prev();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nabla.ir.ir.IteratorRef#isNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next</em>'.
	 * @see fr.cea.nabla.ir.ir.IteratorRef#isNext()
	 * @see #getIteratorRef()
	 * @generated
	 */
	EAttribute getIteratorRef_Next();

	/**
	 * Returns the meta object for enum '{@link fr.cea.nabla.ir.ir.ItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Item Type</em>'.
	 * @see fr.cea.nabla.ir.ir.ItemType
	 * @generated
	 */
	EEnum getItemType();

	/**
	 * Returns the meta object for enum '{@link fr.cea.nabla.ir.ir.BasicType <em>Basic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Basic Type</em>'.
	 * @see fr.cea.nabla.ir.ir.BasicType
	 * @generated
	 */
	EEnum getBasicType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IrFactory getIrFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.IrAnnotableImpl <em>Annotable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.IrAnnotableImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getIrAnnotable()
		 * @generated
		 */
		EClass IR_ANNOTABLE = eINSTANCE.getIrAnnotable();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IR_ANNOTABLE__ANNOTATIONS = eINSTANCE.getIrAnnotable_Annotations();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.IrAnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.IrAnnotationImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getIrAnnotation()
		 * @generated
		 */
		EClass IR_ANNOTATION = eINSTANCE.getIrAnnotation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IR_ANNOTATION__SOURCE = eINSTANCE.getIrAnnotation_Source();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IR_ANNOTATION__DETAILS = eINSTANCE.getIrAnnotation_Details();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.IrModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.IrModuleImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getIrModule()
		 * @generated
		 */
		EClass IR_MODULE = eINSTANCE.getIrModule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IR_MODULE__NAME = eINSTANCE.getIrModule_Name();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IR_MODULE__IMPORTS = eINSTANCE.getIrModule_Imports();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IR_MODULE__FUNCTIONS = eINSTANCE.getIrModule_Functions();

		/**
		 * The meta object literal for the '<em><b>Reductions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IR_MODULE__REDUCTIONS = eINSTANCE.getIrModule_Reductions();

		/**
		 * The meta object literal for the '<em><b>Connectivities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IR_MODULE__CONNECTIVITIES = eINSTANCE.getIrModule_Connectivities();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IR_MODULE__VARIABLES = eINSTANCE.getIrModule_Variables();

		/**
		 * The meta object literal for the '<em><b>Jobs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IR_MODULE__JOBS = eINSTANCE.getIrModule_Jobs();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.ImportImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.VariableImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Persist</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__PERSIST = eINSTANCE.getVariable_Persist();

		/**
		 * The meta object literal for the '<em><b>Persistence Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__PERSISTENCE_NAME = eINSTANCE.getVariable_PersistenceName();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.ScalarVariableImpl <em>Scalar Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.ScalarVariableImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getScalarVariable()
		 * @generated
		 */
		EClass SCALAR_VARIABLE = eINSTANCE.getScalarVariable();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALAR_VARIABLE__DEFAULT_VALUE = eINSTANCE.getScalarVariable_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Const</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALAR_VARIABLE__CONST = eINSTANCE.getScalarVariable_Const();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.ArrayVariableImpl <em>Array Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.ArrayVariableImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getArrayVariable()
		 * @generated
		 */
		EClass ARRAY_VARIABLE = eINSTANCE.getArrayVariable();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_VARIABLE__DIMENSIONS = eINSTANCE.getArrayVariable_Dimensions();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.FunctionImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '<em><b>In Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__IN_TYPES = eINSTANCE.getFunction_InTypes();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__RETURN_TYPE = eINSTANCE.getFunction_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__PROVIDER = eINSTANCE.getFunction_Provider();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.ReductionImpl <em>Reduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.ReductionImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getReduction()
		 * @generated
		 */
		EClass REDUCTION = eINSTANCE.getReduction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDUCTION__NAME = eINSTANCE.getReduction_Name();

		/**
		 * The meta object literal for the '<em><b>Collection Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDUCTION__COLLECTION_TYPE = eINSTANCE.getReduction_CollectionType();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDUCTION__RETURN_TYPE = eINSTANCE.getReduction_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDUCTION__PROVIDER = eINSTANCE.getReduction_Provider();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.ConnectivityImpl <em>Connectivity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.ConnectivityImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getConnectivity()
		 * @generated
		 */
		EClass CONNECTIVITY = eINSTANCE.getConnectivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTIVITY__NAME = eINSTANCE.getConnectivity_Name();

		/**
		 * The meta object literal for the '<em><b>In Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTIVITY__IN_TYPES = eINSTANCE.getConnectivity_InTypes();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTIVITY__RETURN_TYPE = eINSTANCE.getConnectivity_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Index Equal Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTIVITY__INDEX_EQUAL_ID = eINSTANCE.getConnectivity_IndexEqualId();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.ItemArgTypeImpl <em>Item Arg Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.ItemArgTypeImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getItemArgType()
		 * @generated
		 */
		EClass ITEM_ARG_TYPE = eINSTANCE.getItemArgType();

		/**
		 * The meta object literal for the '<em><b>Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_ARG_TYPE__MULTIPLE = eINSTANCE.getItemArgType_Multiple();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_ARG_TYPE__TYPE = eINSTANCE.getItemArgType_Type();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.JobImpl <em>Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.JobImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getJob()
		 * @generated
		 */
		EClass JOB = eINSTANCE.getJob();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__NAME = eINSTANCE.getJob_Name();

		/**
		 * The meta object literal for the '<em><b>At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__AT = eINSTANCE.getJob_At();

		/**
		 * The meta object literal for the '<em><b>On Cycle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__ON_CYCLE = eINSTANCE.getJob_OnCycle();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.InstructionJobImpl <em>Instruction Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.InstructionJobImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getInstructionJob()
		 * @generated
		 */
		EClass INSTRUCTION_JOB = eINSTANCE.getInstructionJob();

		/**
		 * The meta object literal for the '<em><b>Instruction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_JOB__INSTRUCTION = eINSTANCE.getInstructionJob_Instruction();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.TimeIterationCopyJobImpl <em>Time Iteration Copy Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.TimeIterationCopyJobImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getTimeIterationCopyJob()
		 * @generated
		 */
		EClass TIME_ITERATION_COPY_JOB = eINSTANCE.getTimeIterationCopyJob();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_ITERATION_COPY_JOB__LEFT = eINSTANCE.getTimeIterationCopyJob_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_ITERATION_COPY_JOB__RIGHT = eINSTANCE.getTimeIterationCopyJob_Right();

		/**
		 * The meta object literal for the '<em><b>Time Iterator Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ITERATION_COPY_JOB__TIME_ITERATOR_NAME = eINSTANCE.getTimeIterationCopyJob_TimeIteratorName();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.ReductionCallImpl <em>Reduction Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.ReductionCallImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getReductionCall()
		 * @generated
		 */
		EClass REDUCTION_CALL = eINSTANCE.getReductionCall();

		/**
		 * The meta object literal for the '<em><b>Reduction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCTION_CALL__REDUCTION = eINSTANCE.getReductionCall_Reduction();

		/**
		 * The meta object literal for the '<em><b>Iterator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCTION_CALL__ITERATOR = eINSTANCE.getReductionCall_Iterator();

		/**
		 * The meta object literal for the '<em><b>Arg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCTION_CALL__ARG = eINSTANCE.getReductionCall_Arg();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.InstructionImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.ReductionInstructionImpl <em>Reduction Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.ReductionInstructionImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getReductionInstruction()
		 * @generated
		 */
		EClass REDUCTION_INSTRUCTION = eINSTANCE.getReductionInstruction();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCTION_INSTRUCTION__VARIABLE = eINSTANCE.getReductionInstruction_Variable();

		/**
		 * The meta object literal for the '<em><b>Reduction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCTION_INSTRUCTION__REDUCTION = eINSTANCE.getReductionInstruction_Reduction();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.ScalarVarDefinitionImpl <em>Scalar Var Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.ScalarVarDefinitionImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getScalarVarDefinition()
		 * @generated
		 */
		EClass SCALAR_VAR_DEFINITION = eINSTANCE.getScalarVarDefinition();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALAR_VAR_DEFINITION__VARIABLES = eINSTANCE.getScalarVarDefinition_Variables();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.InstructionBlockImpl <em>Instruction Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.InstructionBlockImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getInstructionBlock()
		 * @generated
		 */
		EClass INSTRUCTION_BLOCK = eINSTANCE.getInstructionBlock();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_BLOCK__INSTRUCTIONS = eINSTANCE.getInstructionBlock_Instructions();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.AffectationImpl <em>Affectation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.AffectationImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getAffectation()
		 * @generated
		 */
		EClass AFFECTATION = eINSTANCE.getAffectation();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFFECTATION__LEFT = eINSTANCE.getAffectation_Left();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFECTATION__OPERATOR = eINSTANCE.getAffectation_Operator();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFFECTATION__RIGHT = eINSTANCE.getAffectation_Right();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.LoopImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Iterator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__ITERATOR = eINSTANCE.getLoop_Iterator();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__BODY = eINSTANCE.getLoop_Body();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.IfImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__CONDITION = eINSTANCE.getIf_Condition();

		/**
		 * The meta object literal for the '<em><b>Then Instruction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__THEN_INSTRUCTION = eINSTANCE.getIf_ThenInstruction();

		/**
		 * The meta object literal for the '<em><b>Else Instruction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSE_INSTRUCTION = eINSTANCE.getIf_ElseInstruction();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.ExpressionImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__TYPE = eINSTANCE.getExpression_Type();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.ExpressionTypeImpl <em>Expression Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.ExpressionTypeImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getExpressionType()
		 * @generated
		 */
		EClass EXPRESSION_TYPE = eINSTANCE.getExpressionType();

		/**
		 * The meta object literal for the '<em><b>Basic Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_TYPE__BASIC_TYPE = eINSTANCE.getExpressionType_BasicType();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_TYPE__DIMENSION = eINSTANCE.getExpressionType_Dimension();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.BinaryExpressionImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EXPRESSION__OPERATOR = eINSTANCE.getBinaryExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LEFT = eINSTANCE.getBinaryExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RIGHT = eINSTANCE.getBinaryExpression_Right();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.UnaryExpressionImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_EXPRESSION__OPERATOR = eINSTANCE.getUnaryExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__EXPRESSION = eINSTANCE.getUnaryExpression_Expression();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.ParenthesisImpl <em>Parenthesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.ParenthesisImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getParenthesis()
		 * @generated
		 */
		EClass PARENTHESIS = eINSTANCE.getParenthesis();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENTHESIS__EXPRESSION = eINSTANCE.getParenthesis_Expression();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.IntConstantImpl <em>Int Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.IntConstantImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getIntConstant()
		 * @generated
		 */
		EClass INT_CONSTANT = eINSTANCE.getIntConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_CONSTANT__VALUE = eINSTANCE.getIntConstant_Value();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.RealConstantImpl <em>Real Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.RealConstantImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getRealConstant()
		 * @generated
		 */
		EClass REAL_CONSTANT = eINSTANCE.getRealConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_CONSTANT__VALUE = eINSTANCE.getRealConstant_Value();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.Real2ConstantImpl <em>Real2 Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.Real2ConstantImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getReal2Constant()
		 * @generated
		 */
		EClass REAL2_CONSTANT = eINSTANCE.getReal2Constant();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL2_CONSTANT__X = eINSTANCE.getReal2Constant_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL2_CONSTANT__Y = eINSTANCE.getReal2Constant_Y();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.Real3ConstantImpl <em>Real3 Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.Real3ConstantImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getReal3Constant()
		 * @generated
		 */
		EClass REAL3_CONSTANT = eINSTANCE.getReal3Constant();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL3_CONSTANT__X = eINSTANCE.getReal3Constant_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL3_CONSTANT__Y = eINSTANCE.getReal3Constant_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL3_CONSTANT__Z = eINSTANCE.getReal3Constant_Z();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.Real2x2ConstantImpl <em>Real2x2 Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.Real2x2ConstantImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getReal2x2Constant()
		 * @generated
		 */
		EClass REAL2X2_CONSTANT = eINSTANCE.getReal2x2Constant();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REAL2X2_CONSTANT__X = eINSTANCE.getReal2x2Constant_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REAL2X2_CONSTANT__Y = eINSTANCE.getReal2x2Constant_Y();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.Real3x3ConstantImpl <em>Real3x3 Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.Real3x3ConstantImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getReal3x3Constant()
		 * @generated
		 */
		EClass REAL3X3_CONSTANT = eINSTANCE.getReal3x3Constant();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REAL3X3_CONSTANT__X = eINSTANCE.getReal3x3Constant_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REAL3X3_CONSTANT__Y = eINSTANCE.getReal3x3Constant_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REAL3X3_CONSTANT__Z = eINSTANCE.getReal3x3Constant_Z();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.MaxConstantImpl <em>Max Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.MaxConstantImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getMaxConstant()
		 * @generated
		 */
		EClass MAX_CONSTANT = eINSTANCE.getMaxConstant();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.MinConstantImpl <em>Min Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.MinConstantImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getMinConstant()
		 * @generated
		 */
		EClass MIN_CONSTANT = eINSTANCE.getMinConstant();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.BoolConstantImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getBoolConstant()
		 * @generated
		 */
		EClass BOOL_CONSTANT = eINSTANCE.getBoolConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL_CONSTANT__VALUE = eINSTANCE.getBoolConstant_Value();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.FunctionCallImpl <em>Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.FunctionCallImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getFunctionCall()
		 * @generated
		 */
		EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL__FUNCTION = eINSTANCE.getFunctionCall_Function();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL__ARGS = eINSTANCE.getFunctionCall_Args();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.VarRefImpl <em>Var Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.VarRefImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getVarRef()
		 * @generated
		 */
		EClass VAR_REF = eINSTANCE.getVarRef();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_REF__VARIABLE = eINSTANCE.getVarRef_Variable();

		/**
		 * The meta object literal for the '<em><b>Iterators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_REF__ITERATORS = eINSTANCE.getVarRef_Iterators();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_REF__FIELDS = eINSTANCE.getVarRef_Fields();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.IteratorImpl <em>Iterator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.IteratorImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getIterator()
		 * @generated
		 */
		EClass ITERATOR = eINSTANCE.getIterator();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATOR__NAME = eINSTANCE.getIterator_Name();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATOR__RANGE = eINSTANCE.getIterator_Range();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.IteratorRangeOrRefImpl <em>Iterator Range Or Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.IteratorRangeOrRefImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getIteratorRangeOrRef()
		 * @generated
		 */
		EClass ITERATOR_RANGE_OR_REF = eINSTANCE.getIteratorRangeOrRef();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.IteratorRangeImpl <em>Iterator Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.IteratorRangeImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getIteratorRange()
		 * @generated
		 */
		EClass ITERATOR_RANGE = eINSTANCE.getIteratorRange();

		/**
		 * The meta object literal for the '<em><b>Connectivity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATOR_RANGE__CONNECTIVITY = eINSTANCE.getIteratorRange_Connectivity();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATOR_RANGE__ARGS = eINSTANCE.getIteratorRange_Args();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.impl.IteratorRefImpl <em>Iterator Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.impl.IteratorRefImpl
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getIteratorRef()
		 * @generated
		 */
		EClass ITERATOR_REF = eINSTANCE.getIteratorRef();

		/**
		 * The meta object literal for the '<em><b>Iterator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATOR_REF__ITERATOR = eINSTANCE.getIteratorRef_Iterator();

		/**
		 * The meta object literal for the '<em><b>Prev</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATOR_REF__PREV = eINSTANCE.getIteratorRef_Prev();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATOR_REF__NEXT = eINSTANCE.getIteratorRef_Next();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.ItemType <em>Item Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.ItemType
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getItemType()
		 * @generated
		 */
		EEnum ITEM_TYPE = eINSTANCE.getItemType();

		/**
		 * The meta object literal for the '{@link fr.cea.nabla.ir.ir.BasicType <em>Basic Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nabla.ir.ir.BasicType
		 * @see fr.cea.nabla.ir.ir.impl.IrPackageImpl#getBasicType()
		 * @generated
		 */
		EEnum BASIC_TYPE = eINSTANCE.getBasicType();

	}

} //IrPackage

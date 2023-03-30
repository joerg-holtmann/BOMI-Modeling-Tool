/**
 */
package se.gu.cse.idxse.bomi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>BO Super Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see se.gu.cse.idxse.bomi.BomiPackage#getBOSuperTypes()
 * @model
 * @generated
 */
public enum BOSuperTypes implements Enumerator {
	/**
	 * The '<em><b>NOT SET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_SET_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_SET(0, "NOT_SET", "NOT_SET"),
	/**
	 * The '<em><b>Standard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #STANDARD_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD(1, "Standard", "Standard"),

	/**
	 * The '<em><b>Technology</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECHNOLOGY_VALUE
	 * @generated
	 * @ordered
	 */
	TECHNOLOGY(2, "Technology", "Technology"),

	/**
	 * The '<em><b>Task</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TASK_VALUE
	 * @generated
	 * @ordered
	 */
	TASK(3, "Task", "Task"),

	/**
	 * The '<em><b>Planning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLANNING_VALUE
	 * @generated
	 * @ordered
	 */
	PLANNING(4, "Planning", "Planning"),

	/**
	 * The '<em><b>Value</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	VALUE(5, "Value", "Value"),

	/**
	 * The '<em><b>Product</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRODUCT_VALUE
	 * @generated
	 * @ordered
	 */
	PRODUCT(6, "Product", "Product"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(7, "Other", "Other");

	/**
	 * The '<em><b>NOT SET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_SET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_SET_VALUE = 0;

	/**
	 * The '<em><b>Standard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD
	 * @model name="Standard"
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD_VALUE = 1;

	/**
	 * The '<em><b>Technology</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECHNOLOGY
	 * @model name="Technology"
	 * @generated
	 * @ordered
	 */
	public static final int TECHNOLOGY_VALUE = 2;

	/**
	 * The '<em><b>Task</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TASK
	 * @model name="Task"
	 * @generated
	 * @ordered
	 */
	public static final int TASK_VALUE = 3;

	/**
	 * The '<em><b>Planning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLANNING
	 * @model name="Planning"
	 * @generated
	 * @ordered
	 */
	public static final int PLANNING_VALUE = 4;

	/**
	 * The '<em><b>Value</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE
	 * @model name="Value"
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_VALUE = 5;

	/**
	 * The '<em><b>Product</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRODUCT
	 * @model name="Product"
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCT_VALUE = 6;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 7;

	/**
	 * An array of all the '<em><b>BO Super Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BOSuperTypes[] VALUES_ARRAY = new BOSuperTypes[] {
			NOT_SET,
			STANDARD,
			TECHNOLOGY,
			TASK,
			PLANNING,
			VALUE,
			PRODUCT,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>BO Super Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BOSuperTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>BO Super Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BOSuperTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BOSuperTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>BO Super Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BOSuperTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BOSuperTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>BO Super Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BOSuperTypes get(int value) {
		switch (value) {
			case NOT_SET_VALUE: return NOT_SET;
			case STANDARD_VALUE: return STANDARD;
			case TECHNOLOGY_VALUE: return TECHNOLOGY;
			case TASK_VALUE: return TASK;
			case PLANNING_VALUE: return PLANNING;
			case VALUE_VALUE: return VALUE;
			case PRODUCT_VALUE: return PRODUCT;
			case OTHER_VALUE: return OTHER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BOSuperTypes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //BOSuperTypes

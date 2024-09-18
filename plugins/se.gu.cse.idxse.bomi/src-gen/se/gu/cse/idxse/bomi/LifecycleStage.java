/**
 */
package se.gu.cse.idxse.bomi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Lifecycle Stage</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see se.gu.cse.idxse.bomi.BomiPackage#getLifecycleStage()
 * @model
 * @generated
 */
public enum LifecycleStage implements Enumerator {
	/**
	 * The '<em><b>Planning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #PLANNING_VALUE
	 * @generated
	 * @ordered
	 */
	PLANNING(0, "Planning", "Planning"),

	/**
	 * The '<em><b>Operation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATION(1, "Operation", "Operation"),

	/**
	 * The '<em><b>Deprecate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPRECATE_VALUE
	 * @generated
	 * @ordered
	 */
	DEPRECATE(2, "Deprecate", "Deprecate"),

	/**
	 * The '<em><b>Retire</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETIRE_VALUE
	 * @generated
	 * @ordered
	 */
	RETIRE(3, "Retire", "Retire");

	/**
	 * The '<em><b>Planning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLANNING
	 * @model name="Planning"
	 * @generated
	 * @ordered
	 */
	public static final int PLANNING_VALUE = 0;

	/**
	 * The '<em><b>Operation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION
	 * @model name="Operation"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_VALUE = 1;

	/**
	 * The '<em><b>Deprecate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPRECATE
	 * @model name="Deprecate"
	 * @generated
	 * @ordered
	 */
	public static final int DEPRECATE_VALUE = 2;

	/**
	 * The '<em><b>Retire</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETIRE
	 * @model name="Retire"
	 * @generated
	 * @ordered
	 */
	public static final int RETIRE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Lifecycle Stage</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LifecycleStage[] VALUES_ARRAY = new LifecycleStage[] {
			PLANNING,
			OPERATION,
			DEPRECATE,
			RETIRE,
		};

	/**
	 * A public read-only list of all the '<em><b>Lifecycle Stage</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LifecycleStage> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Lifecycle Stage</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LifecycleStage get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LifecycleStage result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Lifecycle Stage</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LifecycleStage getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LifecycleStage result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Lifecycle Stage</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LifecycleStage get(int value) {
		switch (value) {
			case PLANNING_VALUE: return PLANNING;
			case OPERATION_VALUE: return OPERATION;
			case DEPRECATE_VALUE: return DEPRECATE;
			case RETIRE_VALUE: return RETIRE;
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
	private LifecycleStage(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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

} //LifecycleStage

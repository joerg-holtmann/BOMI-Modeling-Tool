/**
 */
package se.gu.cse.idxse.bomi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>MI Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see se.gu.cse.idxse.bomi.BomiPackage#getMIType()
 * @model
 * @generated
 */
public enum MIType implements Enumerator {
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
	 * The '<em><b>Teams</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #TEAMS_VALUE
	 * @generated
	 * @ordered
	 */
	TEAMS(1, "Teams", "Teams"),

	/**
	 * The '<em><b>Silos</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Silos (Release Trains)
	 * <!-- end-model-doc -->
	 * @see #SILOS_VALUE
	 * @generated
	 * @ordered
	 */
	SILOS(2, "Silos", "Silos"),

	/**
	 * The '<em><b>Departments</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPARTMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	DEPARTMENTS(3, "Departments", "Departments"),

	/**
	 * The '<em><b>Organizations</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORGANIZATIONS_VALUE
	 * @generated
	 * @ordered
	 */
	ORGANIZATIONS(4, "Organizations", "Organizations");

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
	 * The '<em><b>Teams</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEAMS
	 * @model name="Teams"
	 * @generated
	 * @ordered
	 */
	public static final int TEAMS_VALUE = 1;

	/**
	 * The '<em><b>Silos</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Silos (Release Trains)
	 * <!-- end-model-doc -->
	 * @see #SILOS
	 * @model name="Silos"
	 * @generated
	 * @ordered
	 */
	public static final int SILOS_VALUE = 2;

	/**
	 * The '<em><b>Departments</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPARTMENTS
	 * @model name="Departments"
	 * @generated
	 * @ordered
	 */
	public static final int DEPARTMENTS_VALUE = 3;

	/**
	 * The '<em><b>Organizations</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORGANIZATIONS
	 * @model name="Organizations"
	 * @generated
	 * @ordered
	 */
	public static final int ORGANIZATIONS_VALUE = 4;

	/**
	 * An array of all the '<em><b>MI Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MIType[] VALUES_ARRAY = new MIType[] {
			NOT_SET,
			TEAMS,
			SILOS,
			DEPARTMENTS,
			ORGANIZATIONS,
		};

	/**
	 * A public read-only list of all the '<em><b>MI Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MIType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>MI Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MIType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MIType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MI Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MIType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MIType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MI Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MIType get(int value) {
		switch (value) {
			case NOT_SET_VALUE: return NOT_SET;
			case TEAMS_VALUE: return TEAMS;
			case SILOS_VALUE: return SILOS;
			case DEPARTMENTS_VALUE: return DEPARTMENTS;
			case ORGANIZATIONS_VALUE: return ORGANIZATIONS;
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
	private MIType(int value, String name, String literal) {
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

} //MIType

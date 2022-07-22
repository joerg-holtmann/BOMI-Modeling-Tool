/**
 */
package se.gu.cse.idxse.bomi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Distance Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see se.gu.cse.idxse.bomi.BomiPackage#getDistanceTypes()
 * @model
 * @generated
 */
public enum DistanceTypes implements Enumerator {
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
	 * The '<em><b>Cultural</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #CULTURAL_VALUE
	 * @generated
	 * @ordered
	 */
	CULTURAL(1, "Cultural", "Cultural"),

	/**
	 * The '<em><b>Geographical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GEOGRAPHICAL_VALUE
	 * @generated
	 * @ordered
	 */
	GEOGRAPHICAL(2, "Geographical", "Geographical"),

	/**
	 * The '<em><b>Organizational</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORGANIZATIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	ORGANIZATIONAL(3, "Organizational", "Organizational");

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
	 * The '<em><b>Cultural</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CULTURAL
	 * @model name="Cultural"
	 * @generated
	 * @ordered
	 */
	public static final int CULTURAL_VALUE = 1;

	/**
	 * The '<em><b>Geographical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GEOGRAPHICAL
	 * @model name="Geographical"
	 * @generated
	 * @ordered
	 */
	public static final int GEOGRAPHICAL_VALUE = 2;

	/**
	 * The '<em><b>Organizational</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORGANIZATIONAL
	 * @model name="Organizational"
	 * @generated
	 * @ordered
	 */
	public static final int ORGANIZATIONAL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Distance Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DistanceTypes[] VALUES_ARRAY = new DistanceTypes[] { NOT_SET, CULTURAL, GEOGRAPHICAL,
			ORGANIZATIONAL, };

	/**
	 * A public read-only list of all the '<em><b>Distance Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DistanceTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Distance Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DistanceTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DistanceTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Distance Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DistanceTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DistanceTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Distance Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DistanceTypes get(int value) {
		switch (value) {
		case NOT_SET_VALUE:
			return NOT_SET;
		case CULTURAL_VALUE:
			return CULTURAL;
		case GEOGRAPHICAL_VALUE:
			return GEOGRAPHICAL;
		case ORGANIZATIONAL_VALUE:
			return ORGANIZATIONAL;
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
	private DistanceTypes(int value, String name, String literal) {
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

} //DistanceTypes

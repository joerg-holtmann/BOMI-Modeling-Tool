/**
 */
package se.gu.cse.idxse.bomi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Interaction Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see se.gu.cse.idxse.bomi.BomiPackage#getInteractionKind()
 * @model
 * @generated
 */
public enum InteractionKind implements Enumerator {
	/**
	 * The '<em><b>Is Responsible For</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_RESPONSIBLE_FOR_VALUE
	 * @generated
	 * @ordered
	 */
	IS_RESPONSIBLE_FOR(0, "IsResponsibleFor", "IsResponsibleFor"),

	/**
	 * The '<em><b>Creates</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATES_VALUE
	 * @generated
	 * @ordered
	 */
	CREATES(1, "Creates", "Creates"),

	/**
	 * The '<em><b>Reads</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READS_VALUE
	 * @generated
	 * @ordered
	 */
	READS(2, "Reads", "Reads"),

	/**
	 * The '<em><b>Updates</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATES_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATES(3, "Updates", "Updates"),

	/**
	 * The '<em><b>Deletes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETES_VALUE
	 * @generated
	 * @ordered
	 */
	DELETES(4, "Deletes", "Deletes");

	/**
	 * The '<em><b>Is Responsible For</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_RESPONSIBLE_FOR
	 * @model name="IsResponsibleFor"
	 * @generated
	 * @ordered
	 */
	public static final int IS_RESPONSIBLE_FOR_VALUE = 0;

	/**
	 * The '<em><b>Creates</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATES
	 * @model name="Creates"
	 * @generated
	 * @ordered
	 */
	public static final int CREATES_VALUE = 1;

	/**
	 * The '<em><b>Reads</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READS
	 * @model name="Reads"
	 * @generated
	 * @ordered
	 */
	public static final int READS_VALUE = 2;

	/**
	 * The '<em><b>Updates</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATES
	 * @model name="Updates"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATES_VALUE = 3;

	/**
	 * The '<em><b>Deletes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETES
	 * @model name="Deletes"
	 * @generated
	 * @ordered
	 */
	public static final int DELETES_VALUE = 4;

	/**
	 * An array of all the '<em><b>Interaction Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InteractionKind[] VALUES_ARRAY =
		new InteractionKind[] {
			IS_RESPONSIBLE_FOR,
			CREATES,
			READS,
			UPDATES,
			DELETES,
		};

	/**
	 * A public read-only list of all the '<em><b>Interaction Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InteractionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Interaction Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InteractionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InteractionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interaction Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InteractionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InteractionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interaction Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InteractionKind get(int value) {
		switch (value) {
			case IS_RESPONSIBLE_FOR_VALUE: return IS_RESPONSIBLE_FOR;
			case CREATES_VALUE: return CREATES;
			case READS_VALUE: return READS;
			case UPDATES_VALUE: return UPDATES;
			case DELETES_VALUE: return DELETES;
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
	private InteractionKind(int value, String name, String literal) {
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
	
} //InteractionKind

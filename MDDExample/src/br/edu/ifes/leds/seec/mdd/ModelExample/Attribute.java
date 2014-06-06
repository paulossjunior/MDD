/**
 */
package br.edu.ifes.leds.seec.mdd.ModelExample;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.edu.ifes.leds.seec.mdd.ModelExample.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link br.edu.ifes.leds.seec.mdd.ModelExample.Attribute#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.edu.ifes.leds.seec.mdd.ModelExample.ModelExamplePackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see br.edu.ifes.leds.seec.mdd.ModelExample.ModelExamplePackage#getAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.edu.ifes.leds.seec.mdd.ModelExample.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link br.edu.ifes.leds.seec.mdd.ModelExample.EType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see br.edu.ifes.leds.seec.mdd.ModelExample.EType
	 * @see #setType(EType)
	 * @see br.edu.ifes.leds.seec.mdd.ModelExample.ModelExamplePackage#getAttribute_Type()
	 * @model
	 * @generated
	 */
	EType getType();

	/**
	 * Sets the value of the '{@link br.edu.ifes.leds.seec.mdd.ModelExample.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see br.edu.ifes.leds.seec.mdd.ModelExample.EType
	 * @see #getType()
	 * @generated
	 */
	void setType(EType value);

} // Attribute

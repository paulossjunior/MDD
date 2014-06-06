/**
 */
package br.edu.ifes.leds.seec.mdd.ModelExample;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.edu.ifes.leds.seec.mdd.ModelExample.Entity#getName <em>Name</em>}</li>
 *   <li>{@link br.edu.ifes.leds.seec.mdd.ModelExample.Entity#getHas <em>Has</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.edu.ifes.leds.seec.mdd.ModelExample.ModelExamplePackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject {
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
	 * @see br.edu.ifes.leds.seec.mdd.ModelExample.ModelExamplePackage#getEntity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.edu.ifes.leds.seec.mdd.ModelExample.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has</b></em>' containment reference list.
	 * The list contents are of type {@link br.edu.ifes.leds.seec.mdd.ModelExample.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has</em>' containment reference list.
	 * @see br.edu.ifes.leds.seec.mdd.ModelExample.ModelExamplePackage#getEntity_Has()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getHas();

} // Entity

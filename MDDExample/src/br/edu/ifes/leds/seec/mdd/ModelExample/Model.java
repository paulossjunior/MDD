/**
 */
package br.edu.ifes.leds.seec.mdd.ModelExample;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.edu.ifes.leds.seec.mdd.ModelExample.Model#getName <em>Name</em>}</li>
 *   <li>{@link br.edu.ifes.leds.seec.mdd.ModelExample.Model#getComposedof <em>Composedof</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.edu.ifes.leds.seec.mdd.ModelExample.ModelExamplePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
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
	 * @see br.edu.ifes.leds.seec.mdd.ModelExample.ModelExamplePackage#getModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.edu.ifes.leds.seec.mdd.ModelExample.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Composedof</b></em>' containment reference list.
	 * The list contents are of type {@link br.edu.ifes.leds.seec.mdd.ModelExample.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composedof</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composedof</em>' containment reference list.
	 * @see br.edu.ifes.leds.seec.mdd.ModelExample.ModelExamplePackage#getModel_Composedof()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getComposedof();

} // Model

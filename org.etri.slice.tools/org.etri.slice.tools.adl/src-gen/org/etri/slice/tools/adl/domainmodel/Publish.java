/**
 * generated by Xtext
 */
package org.etri.slice.tools.adl.domainmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publish</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.etri.slice.tools.adl.domainmodel.Publish#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see org.etri.slice.tools.adl.domainmodel.DomainmodelPackage#getPublish()
 * @model
 * @generated
 */
public interface Publish extends Action
{
  /**
   * Returns the value of the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' reference.
   * @see #setEvent(Event)
   * @see org.etri.slice.tools.adl.domainmodel.DomainmodelPackage#getPublish_Event()
   * @model
   * @generated
   */
  Event getEvent();

  /**
   * Sets the value of the '{@link org.etri.slice.tools.adl.domainmodel.Publish#getEvent <em>Event</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(Event value);

} // Publish
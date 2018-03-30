/**
 * generated by Xtext
 */
package org.etri.slice.tools.adl.domainmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.etri.slice.tools.adl.domainmodel.Agency;
import org.etri.slice.tools.adl.domainmodel.AgentDeclaration;
import org.etri.slice.tools.adl.domainmodel.BehaviorSet;
import org.etri.slice.tools.adl.domainmodel.CommandSet;
import org.etri.slice.tools.adl.domainmodel.DomainmodelPackage;
import org.etri.slice.tools.adl.domainmodel.RuleSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.etri.slice.tools.adl.domainmodel.impl.AgentDeclarationImpl#getAgency <em>Agency</em>}</li>
 *   <li>{@link org.etri.slice.tools.adl.domainmodel.impl.AgentDeclarationImpl#getRuleSet <em>Rule Set</em>}</li>
 *   <li>{@link org.etri.slice.tools.adl.domainmodel.impl.AgentDeclarationImpl#getBehaviorSet <em>Behavior Set</em>}</li>
 *   <li>{@link org.etri.slice.tools.adl.domainmodel.impl.AgentDeclarationImpl#getCommandSets <em>Command Sets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgentDeclarationImpl extends AbstractElementImpl implements AgentDeclaration
{
  /**
   * The cached value of the '{@link #getAgency() <em>Agency</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgency()
   * @generated
   * @ordered
   */
  protected Agency agency;

  /**
   * The cached value of the '{@link #getRuleSet() <em>Rule Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuleSet()
   * @generated
   * @ordered
   */
  protected RuleSet ruleSet;

  /**
   * The cached value of the '{@link #getBehaviorSet() <em>Behavior Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehaviorSet()
   * @generated
   * @ordered
   */
  protected BehaviorSet behaviorSet;

  /**
   * The cached value of the '{@link #getCommandSets() <em>Command Sets</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommandSets()
   * @generated
   * @ordered
   */
  protected EList<CommandSet> commandSets;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AgentDeclarationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DomainmodelPackage.Literals.AGENT_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Agency getAgency()
  {
    return agency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAgency(Agency newAgency, NotificationChain msgs)
  {
    Agency oldAgency = agency;
    agency = newAgency;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.AGENT_DECLARATION__AGENCY, oldAgency, newAgency);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAgency(Agency newAgency)
  {
    if (newAgency != agency)
    {
      NotificationChain msgs = null;
      if (agency != null)
        msgs = ((InternalEObject)agency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.AGENT_DECLARATION__AGENCY, null, msgs);
      if (newAgency != null)
        msgs = ((InternalEObject)newAgency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.AGENT_DECLARATION__AGENCY, null, msgs);
      msgs = basicSetAgency(newAgency, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.AGENT_DECLARATION__AGENCY, newAgency, newAgency));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleSet getRuleSet()
  {
    return ruleSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRuleSet(RuleSet newRuleSet, NotificationChain msgs)
  {
    RuleSet oldRuleSet = ruleSet;
    ruleSet = newRuleSet;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.AGENT_DECLARATION__RULE_SET, oldRuleSet, newRuleSet);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRuleSet(RuleSet newRuleSet)
  {
    if (newRuleSet != ruleSet)
    {
      NotificationChain msgs = null;
      if (ruleSet != null)
        msgs = ((InternalEObject)ruleSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.AGENT_DECLARATION__RULE_SET, null, msgs);
      if (newRuleSet != null)
        msgs = ((InternalEObject)newRuleSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.AGENT_DECLARATION__RULE_SET, null, msgs);
      msgs = basicSetRuleSet(newRuleSet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.AGENT_DECLARATION__RULE_SET, newRuleSet, newRuleSet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorSet getBehaviorSet()
  {
    return behaviorSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBehaviorSet(BehaviorSet newBehaviorSet, NotificationChain msgs)
  {
    BehaviorSet oldBehaviorSet = behaviorSet;
    behaviorSet = newBehaviorSet;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.AGENT_DECLARATION__BEHAVIOR_SET, oldBehaviorSet, newBehaviorSet);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBehaviorSet(BehaviorSet newBehaviorSet)
  {
    if (newBehaviorSet != behaviorSet)
    {
      NotificationChain msgs = null;
      if (behaviorSet != null)
        msgs = ((InternalEObject)behaviorSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.AGENT_DECLARATION__BEHAVIOR_SET, null, msgs);
      if (newBehaviorSet != null)
        msgs = ((InternalEObject)newBehaviorSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.AGENT_DECLARATION__BEHAVIOR_SET, null, msgs);
      msgs = basicSetBehaviorSet(newBehaviorSet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.AGENT_DECLARATION__BEHAVIOR_SET, newBehaviorSet, newBehaviorSet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CommandSet> getCommandSets()
  {
    if (commandSets == null)
    {
      commandSets = new EObjectContainmentEList<CommandSet>(CommandSet.class, this, DomainmodelPackage.AGENT_DECLARATION__COMMAND_SETS);
    }
    return commandSets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DomainmodelPackage.AGENT_DECLARATION__AGENCY:
        return basicSetAgency(null, msgs);
      case DomainmodelPackage.AGENT_DECLARATION__RULE_SET:
        return basicSetRuleSet(null, msgs);
      case DomainmodelPackage.AGENT_DECLARATION__BEHAVIOR_SET:
        return basicSetBehaviorSet(null, msgs);
      case DomainmodelPackage.AGENT_DECLARATION__COMMAND_SETS:
        return ((InternalEList<?>)getCommandSets()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DomainmodelPackage.AGENT_DECLARATION__AGENCY:
        return getAgency();
      case DomainmodelPackage.AGENT_DECLARATION__RULE_SET:
        return getRuleSet();
      case DomainmodelPackage.AGENT_DECLARATION__BEHAVIOR_SET:
        return getBehaviorSet();
      case DomainmodelPackage.AGENT_DECLARATION__COMMAND_SETS:
        return getCommandSets();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DomainmodelPackage.AGENT_DECLARATION__AGENCY:
        setAgency((Agency)newValue);
        return;
      case DomainmodelPackage.AGENT_DECLARATION__RULE_SET:
        setRuleSet((RuleSet)newValue);
        return;
      case DomainmodelPackage.AGENT_DECLARATION__BEHAVIOR_SET:
        setBehaviorSet((BehaviorSet)newValue);
        return;
      case DomainmodelPackage.AGENT_DECLARATION__COMMAND_SETS:
        getCommandSets().clear();
        getCommandSets().addAll((Collection<? extends CommandSet>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DomainmodelPackage.AGENT_DECLARATION__AGENCY:
        setAgency((Agency)null);
        return;
      case DomainmodelPackage.AGENT_DECLARATION__RULE_SET:
        setRuleSet((RuleSet)null);
        return;
      case DomainmodelPackage.AGENT_DECLARATION__BEHAVIOR_SET:
        setBehaviorSet((BehaviorSet)null);
        return;
      case DomainmodelPackage.AGENT_DECLARATION__COMMAND_SETS:
        getCommandSets().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DomainmodelPackage.AGENT_DECLARATION__AGENCY:
        return agency != null;
      case DomainmodelPackage.AGENT_DECLARATION__RULE_SET:
        return ruleSet != null;
      case DomainmodelPackage.AGENT_DECLARATION__BEHAVIOR_SET:
        return behaviorSet != null;
      case DomainmodelPackage.AGENT_DECLARATION__COMMAND_SETS:
        return commandSets != null && !commandSets.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AgentDeclarationImpl
/**
 */
package de.tu_bs.cs.isf.cbc.cbcmodel.provider;


import de.tu_bs.cs.isf.cbc.cbcmodel.CbCProblem;
import de.tu_bs.cs.isf.cbc.cbcmodel.CbcmodelFactory;
import de.tu_bs.cs.isf.cbc.cbcmodel.CbcmodelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.tu_bs.cs.isf.cbc.cbcmodel.CbCProblem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CbCProblemItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CbCProblemItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CbcmodelPackage.Literals.CB_CPROBLEM__METHOD);
			childrenFeatures.add(CbcmodelPackage.Literals.CB_CPROBLEM__GLOBALCONDITION);
			childrenFeatures.add(CbcmodelPackage.Literals.CB_CPROBLEM__CBCFORMULA);
			childrenFeatures.add(CbcmodelPackage.Literals.CB_CPROBLEM__JAVA_VARIABLE);
			childrenFeatures.add(CbcmodelPackage.Literals.CB_CPROBLEM__RENAMING);
			childrenFeatures.add(CbcmodelPackage.Literals.CB_CPROBLEM__REFINEMENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns CbCProblem.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CbCProblem"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_CbCProblem_type");
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(CbCProblem.class)) {
			case CbcmodelPackage.CB_CPROBLEM__METHOD:
			case CbcmodelPackage.CB_CPROBLEM__GLOBALCONDITION:
			case CbcmodelPackage.CB_CPROBLEM__CBCFORMULA:
			case CbcmodelPackage.CB_CPROBLEM__JAVA_VARIABLE:
			case CbcmodelPackage.CB_CPROBLEM__RENAMING:
			case CbcmodelPackage.CB_CPROBLEM__REFINEMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(CbcmodelPackage.Literals.CB_CPROBLEM__METHOD,
				 CbcmodelFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(CbcmodelPackage.Literals.CB_CPROBLEM__GLOBALCONDITION,
				 CbcmodelFactory.eINSTANCE.createGlobalConditions()));

		newChildDescriptors.add
			(createChildParameter
				(CbcmodelPackage.Literals.CB_CPROBLEM__CBCFORMULA,
				 CbcmodelFactory.eINSTANCE.createCbCFormula()));

		newChildDescriptors.add
			(createChildParameter
				(CbcmodelPackage.Literals.CB_CPROBLEM__JAVA_VARIABLE,
				 CbcmodelFactory.eINSTANCE.createJavaVariables()));

		newChildDescriptors.add
			(createChildParameter
				(CbcmodelPackage.Literals.CB_CPROBLEM__RENAMING,
				 CbcmodelFactory.eINSTANCE.createRenaming()));

		newChildDescriptors.add
			(createChildParameter
				(CbcmodelPackage.Literals.CB_CPROBLEM__REFINEMENTS,
				 CbcmodelFactory.eINSTANCE.createMethodRefinements()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CbcmodelEditPlugin.INSTANCE;
	}

}

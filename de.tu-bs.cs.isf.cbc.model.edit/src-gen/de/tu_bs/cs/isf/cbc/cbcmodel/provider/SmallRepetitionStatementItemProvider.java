/**
 */
package de.tu_bs.cs.isf.cbc.cbcmodel.provider;


import de.tu_bs.cs.isf.cbc.cbcmodel.CbcmodelFactory;
import de.tu_bs.cs.isf.cbc.cbcmodel.CbcmodelPackage;
import de.tu_bs.cs.isf.cbc.cbcmodel.SmallRepetitionStatement;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.tu_bs.cs.isf.cbc.cbcmodel.SmallRepetitionStatement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SmallRepetitionStatementItemProvider extends AbstractStatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallRepetitionStatementItemProvider(AdapterFactory adapterFactory) {
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

			addVariantProvenPropertyDescriptor(object);
			addPreProvenPropertyDescriptor(object);
			addPostProvenPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Variant Proven feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariantProvenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SmallRepetitionStatement_variantProven_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SmallRepetitionStatement_variantProven_feature", "_UI_SmallRepetitionStatement_type"),
				 CbcmodelPackage.Literals.SMALL_REPETITION_STATEMENT__VARIANT_PROVEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pre Proven feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreProvenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SmallRepetitionStatement_preProven_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SmallRepetitionStatement_preProven_feature", "_UI_SmallRepetitionStatement_type"),
				 CbcmodelPackage.Literals.SMALL_REPETITION_STATEMENT__PRE_PROVEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Post Proven feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPostProvenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SmallRepetitionStatement_postProven_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SmallRepetitionStatement_postProven_feature", "_UI_SmallRepetitionStatement_type"),
				 CbcmodelPackage.Literals.SMALL_REPETITION_STATEMENT__POST_PROVEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(CbcmodelPackage.Literals.SMALL_REPETITION_STATEMENT__LOOP_STATEMENT);
			childrenFeatures.add(CbcmodelPackage.Literals.SMALL_REPETITION_STATEMENT__VARIANT);
			childrenFeatures.add(CbcmodelPackage.Literals.SMALL_REPETITION_STATEMENT__INVARIANT);
			childrenFeatures.add(CbcmodelPackage.Literals.SMALL_REPETITION_STATEMENT__GUARD);
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
	 * This returns SmallRepetitionStatement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SmallRepetitionStatement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SmallRepetitionStatement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SmallRepetitionStatement_type") :
			getString("_UI_SmallRepetitionStatement_type") + " " + label;
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

		switch (notification.getFeatureID(SmallRepetitionStatement.class)) {
			case CbcmodelPackage.SMALL_REPETITION_STATEMENT__VARIANT_PROVEN:
			case CbcmodelPackage.SMALL_REPETITION_STATEMENT__PRE_PROVEN:
			case CbcmodelPackage.SMALL_REPETITION_STATEMENT__POST_PROVEN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CbcmodelPackage.SMALL_REPETITION_STATEMENT__LOOP_STATEMENT:
			case CbcmodelPackage.SMALL_REPETITION_STATEMENT__VARIANT:
			case CbcmodelPackage.SMALL_REPETITION_STATEMENT__INVARIANT:
			case CbcmodelPackage.SMALL_REPETITION_STATEMENT__GUARD:
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
				(CbcmodelPackage.Literals.SMALL_REPETITION_STATEMENT__LOOP_STATEMENT,
				 CbcmodelFactory.eINSTANCE.createAbstractStatement()));

		newChildDescriptors.add
			(createChildParameter
				(CbcmodelPackage.Literals.SMALL_REPETITION_STATEMENT__LOOP_STATEMENT,
				 CbcmodelFactory.eINSTANCE.createSkipStatement()));

		newChildDescriptors.add
			(createChildParameter
				(CbcmodelPackage.Literals.SMALL_REPETITION_STATEMENT__LOOP_STATEMENT,
				 CbcmodelFactory.eINSTANCE.createCompositionStatement()));

		newChildDescriptors.add
			(createChildParameter
				(CbcmodelPackage.Literals.SMALL_REPETITION_STATEMENT__LOOP_STATEMENT,
				 CbcmodelFactory.eINSTANCE.createSelectionStatement()));

		newChildDescriptors.add
			(createChildParameter
				(CbcmodelPackage.Literals.SMALL_REPETITION_STATEMENT__LOOP_STATEMENT,
				 CbcmodelFactory.eINSTANCE.createRepetitionStatement()));

		newChildDescriptors.add
			(createChildParameter
				(CbcmodelPackage.Literals.SMALL_REPETITION_STATEMENT__LOOP_STATEMENT,
				 CbcmodelFactory.eINSTANCE.createMethodStatement()));

		newChildDescriptors.add
			(createChildParameter
				(CbcmodelPackage.Literals.SMALL_REPETITION_STATEMENT__LOOP_STATEMENT,
				 CbcmodelFactory.eINSTANCE.createReturnStatement()));

		newChildDescriptors.add
			(createChildParameter
				(CbcmodelPackage.Literals.SMALL_REPETITION_STATEMENT__LOOP_STATEMENT,
				 CbcmodelFactory.eINSTANCE.createComposition3Statement()));

		newChildDescriptors.add
			(createChildParameter
				(CbcmodelPackage.Literals.SMALL_REPETITION_STATEMENT__LOOP_STATEMENT,
				 CbcmodelFactory.eINSTANCE.createSmallRepetitionStatement()));

		newChildDescriptors.add
			(createChildParameter
				(CbcmodelPackage.Literals.SMALL_REPETITION_STATEMENT__LOOP_STATEMENT,
				 CbcmodelFactory.eINSTANCE.createStrengthWeakStatement()));

		newChildDescriptors.add
			(createChildParameter
				(CbcmodelPackage.Literals.SMALL_REPETITION_STATEMENT__LOOP_STATEMENT,
				 CbcmodelFactory.eINSTANCE.createOriginalStatement()));

		newChildDescriptors.add
			(createChildParameter
				(CbcmodelPackage.Literals.SMALL_REPETITION_STATEMENT__VARIANT,
				 CbcmodelFactory.eINSTANCE.createVariant()));

		newChildDescriptors.add
			(createChildParameter
				(CbcmodelPackage.Literals.SMALL_REPETITION_STATEMENT__INVARIANT,
				 CbcmodelFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(CbcmodelPackage.Literals.SMALL_REPETITION_STATEMENT__GUARD,
				 CbcmodelFactory.eINSTANCE.createCondition()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == CbcmodelPackage.Literals.ABSTRACT_STATEMENT__REFINEMENT ||
			childFeature == CbcmodelPackage.Literals.SMALL_REPETITION_STATEMENT__LOOP_STATEMENT ||
			childFeature == CbcmodelPackage.Literals.ABSTRACT_STATEMENT__POST_CONDITION ||
			childFeature == CbcmodelPackage.Literals.ABSTRACT_STATEMENT__PRE_CONDITION ||
			childFeature == CbcmodelPackage.Literals.SMALL_REPETITION_STATEMENT__INVARIANT ||
			childFeature == CbcmodelPackage.Literals.SMALL_REPETITION_STATEMENT__GUARD;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

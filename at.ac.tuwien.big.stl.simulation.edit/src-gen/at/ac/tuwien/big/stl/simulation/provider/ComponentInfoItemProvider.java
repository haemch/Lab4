/**
 */
package at.ac.tuwien.big.stl.simulation.provider;

import at.ac.tuwien.big.stl.simulation.ComponentInfo;
import at.ac.tuwien.big.stl.simulation.STLSimulationPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link at.ac.tuwien.big.stl.simulation.ComponentInfo} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentInfoItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInfoItemProvider(AdapterFactory adapterFactory) {
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

			addIsBusyPropertyDescriptor(object);
			addCreationTimePropertyDescriptor(object);
			addUseTimePropertyDescriptor(object);
			addUtilizationPropertyDescriptor(object);
			addComponentPropertyDescriptor(object);
			addProcessingTimePropertyDescriptor(object);
			addReliabilityPropertyDescriptor(object);
			addOutputConnectorsPropertyDescriptor(object);
			addInputConnectorsPropertyDescriptor(object);
			addMinInputPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Busy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsBusyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentInfo_isBusy_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentInfo_isBusy_feature",
								"_UI_ComponentInfo_type"),
						STLSimulationPackage.Literals.COMPONENT_INFO__IS_BUSY, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Creation Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreationTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentInfo_creationTime_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentInfo_creationTime_feature",
								"_UI_ComponentInfo_type"),
						STLSimulationPackage.Literals.COMPONENT_INFO__CREATION_TIME, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Use Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentInfo_useTime_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentInfo_useTime_feature",
								"_UI_ComponentInfo_type"),
						STLSimulationPackage.Literals.COMPONENT_INFO__USE_TIME, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Utilization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUtilizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentInfo_utilization_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentInfo_utilization_feature",
								"_UI_ComponentInfo_type"),
						STLSimulationPackage.Literals.COMPONENT_INFO__UTILIZATION, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentInfo_component_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentInfo_component_feature",
								"_UI_ComponentInfo_type"),
						STLSimulationPackage.Literals.COMPONENT_INFO__COMPONENT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Processing Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessingTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComponentInfo_processingTime_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ComponentInfo_processingTime_feature",
						"_UI_ComponentInfo_type"),
				STLSimulationPackage.Literals.COMPONENT_INFO__PROCESSING_TIME, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Reliability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReliabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentInfo_reliability_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentInfo_reliability_feature",
								"_UI_ComponentInfo_type"),
						STLSimulationPackage.Literals.COMPONENT_INFO__RELIABILITY, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Output Connectors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputConnectorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComponentInfo_outputConnectors_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ComponentInfo_outputConnectors_feature",
						"_UI_ComponentInfo_type"),
				STLSimulationPackage.Literals.COMPONENT_INFO__OUTPUT_CONNECTORS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Input Connectors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputConnectorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComponentInfo_inputConnectors_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ComponentInfo_inputConnectors_feature",
						"_UI_ComponentInfo_type"),
				STLSimulationPackage.Literals.COMPONENT_INFO__INPUT_CONNECTORS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Min Input feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinInputPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentInfo_minInput_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentInfo_minInput_feature",
								"_UI_ComponentInfo_type"),
						STLSimulationPackage.Literals.COMPONENT_INFO__MIN_INPUT, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ComponentInfo.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentInfo"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ComponentInfo componentInfo = (ComponentInfo) object;
		return getString("_UI_ComponentInfo_type") + " " + componentInfo.isIsBusy();
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

		switch (notification.getFeatureID(ComponentInfo.class)) {
		case STLSimulationPackage.COMPONENT_INFO__IS_BUSY:
		case STLSimulationPackage.COMPONENT_INFO__CREATION_TIME:
		case STLSimulationPackage.COMPONENT_INFO__USE_TIME:
		case STLSimulationPackage.COMPONENT_INFO__UTILIZATION:
		case STLSimulationPackage.COMPONENT_INFO__PROCESSING_TIME:
		case STLSimulationPackage.COMPONENT_INFO__RELIABILITY:
		case STLSimulationPackage.COMPONENT_INFO__MIN_INPUT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SimulationEditPlugin.INSTANCE;
	}

}

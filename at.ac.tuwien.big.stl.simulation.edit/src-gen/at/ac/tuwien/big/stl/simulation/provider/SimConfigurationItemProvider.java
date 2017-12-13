/**
 */
package at.ac.tuwien.big.stl.simulation.provider;

import at.ac.tuwien.big.stl.simulation.STLSimulationPackage;
import at.ac.tuwien.big.stl.simulation.SimConfiguration;

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
 * This is the item provider adapter for a {@link at.ac.tuwien.big.stl.simulation.SimConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SimConfigurationItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimConfigurationItemProvider(AdapterFactory adapterFactory) {
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

			addSimulationTimePropertyDescriptor(object);
			addBudgetPropertyDescriptor(object);
			addRemainingBudgetPropertyDescriptor(object);
			addItemThroughputPropertyDescriptor(object);
			addAverageLatencyPropertyDescriptor(object);
			addAverageQualityPropertyDescriptor(object);
			addSimSpeedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Simulation Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSimulationTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_SimConfiguration_simulationTime_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_SimConfiguration_simulationTime_feature",
						"_UI_SimConfiguration_type"),
				STLSimulationPackage.Literals.SIM_CONFIGURATION__SIMULATION_TIME, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Budget feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBudgetPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SimConfiguration_budget_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SimConfiguration_budget_feature",
								"_UI_SimConfiguration_type"),
						STLSimulationPackage.Literals.SIM_CONFIGURATION__BUDGET, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Remaining Budget feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemainingBudgetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_SimConfiguration_remainingBudget_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_SimConfiguration_remainingBudget_feature",
						"_UI_SimConfiguration_type"),
				STLSimulationPackage.Literals.SIM_CONFIGURATION__REMAINING_BUDGET, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Item Throughput feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addItemThroughputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_SimConfiguration_itemThroughput_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_SimConfiguration_itemThroughput_feature",
						"_UI_SimConfiguration_type"),
				STLSimulationPackage.Literals.SIM_CONFIGURATION__ITEM_THROUGHPUT, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Average Latency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAverageLatencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_SimConfiguration_averageLatency_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_SimConfiguration_averageLatency_feature",
						"_UI_SimConfiguration_type"),
				STLSimulationPackage.Literals.SIM_CONFIGURATION__AVERAGE_LATENCY, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Average Quality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAverageQualityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_SimConfiguration_averageQuality_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_SimConfiguration_averageQuality_feature",
						"_UI_SimConfiguration_type"),
				STLSimulationPackage.Literals.SIM_CONFIGURATION__AVERAGE_QUALITY, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Sim Speed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSimSpeedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_SimConfiguration_simSpeed_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_SimConfiguration_simSpeed_feature",
						"_UI_SimConfiguration_type"),
				STLSimulationPackage.Literals.SIM_CONFIGURATION__SIM_SPEED, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns SimConfiguration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SimConfiguration"));
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
		SimConfiguration simConfiguration = (SimConfiguration) object;
		return getString("_UI_SimConfiguration_type") + " " + simConfiguration.getSimulationTime();
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

		switch (notification.getFeatureID(SimConfiguration.class)) {
		case STLSimulationPackage.SIM_CONFIGURATION__SIMULATION_TIME:
		case STLSimulationPackage.SIM_CONFIGURATION__BUDGET:
		case STLSimulationPackage.SIM_CONFIGURATION__REMAINING_BUDGET:
		case STLSimulationPackage.SIM_CONFIGURATION__ITEM_THROUGHPUT:
		case STLSimulationPackage.SIM_CONFIGURATION__AVERAGE_LATENCY:
		case STLSimulationPackage.SIM_CONFIGURATION__AVERAGE_QUALITY:
		case STLSimulationPackage.SIM_CONFIGURATION__SIM_SPEED:
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

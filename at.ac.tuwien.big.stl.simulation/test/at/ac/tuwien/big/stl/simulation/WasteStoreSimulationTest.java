package at.ac.tuwien.big.stl.simulation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import at.ac.tuwien.big.stl.STLFactory;
import at.ac.tuwien.big.stl.Store;
import at.ac.tuwien.big.stl.WasteStore;

public class WasteStoreSimulationTest {

	private static final STLFactory STL_FACTORY = STLFactory.eINSTANCE;
	private static final STLSimulationFactory STL_SIMULATION_FACTORY = STLSimulationFactory.eINSTANCE;
	
	private static final int PROCESSING_TIME = 5;

	@Test
	public void testProcessingOfOneIncomingItem() {
		// create partial STL model and STL simulation model
		WasteStore wasteStore = createWasteStore("Waste Store (testProcessingOfOneIncomingItem)", 2);
		StoreInfo wasteStoreInfo = createStoreInfo(wasteStore, 0);
		ConnectorInfo connectorInfo = createConnectorInfo(null, wasteStoreInfo, true);
		
		// trigger simulation step for waste store
		boolean processed = wasteStoreInfo.process();
		
		// return value should be true
		assertTrue(processed);
		
		// after simulation step, one item should be stored in waste store
		assertEquals(1, wasteStoreInfo.getStoredItems().size());
		
		// after simulation step, no item should be provided by connector
		assertNull(connectorInfo.getItem());
		
		// after simulation step, usage time of waste store should be 0 + 5 = starting time + processing time
		assertEquals(5, wasteStoreInfo.getUseTime());
	}
	
	@Test
	public void testProcessingOfTwoIncomingItems() {
		// create partial STL model and STL simulation model
		WasteStore wasteStore = createWasteStore("Waste Store (testProcessingOfTwoIncomingItems)", 2);
		StoreInfo wasteStoreInfo = createStoreInfo(wasteStore, 0);
		ConnectorInfo connectorInfo1 = createConnectorInfo(null, wasteStoreInfo, true);
		ConnectorInfo connectorInfo2 = createConnectorInfo(null, wasteStoreInfo, true);
		
		// trigger simulation step for waste store
		boolean processed = wasteStoreInfo.process();
		
		// return value should be true
		assertTrue(processed);
		
		// after simulation step, two items should be stored in waste store
		assertEquals(2, wasteStoreInfo.getStoredItems().size());
		
		// after simulation step, no item should be provided by connectors
		assertNull(connectorInfo1.getItem());
		assertNull(connectorInfo2.getItem());
		
		// after simulation step, usage time of waste store should be 0 + ( 5 x 2) = starting time + ( processing time x 2)
		assertEquals(10, wasteStoreInfo.getUseTime());
	}
	
	@Test
	public void testProcessingOfZeroIncomingItem() {
		// create partial STL model and STL simulation model
		WasteStore wasteStore = createWasteStore("Waste Store (testProcessingOfZeroIncomingItem)", 2);
		StoreInfo wasteStoreInfo = createStoreInfo(wasteStore, 0);
		createConnectorInfo(null, wasteStoreInfo, false);
		
		// trigger simulation step for waste store
		boolean processed = wasteStoreInfo.process();
		
		// return value should be true
		assertTrue(processed);
		
		// after simulation step, zero items should be stored in waste store since no item was provided
		assertEquals(0, wasteStoreInfo.getStoredItems().size());
		
		// after simulation step, usage time is still 0 = starting time since no item was provided
		assertEquals(0, wasteStoreInfo.getUseTime());
	}
	
	@Test
	public void testProcessingForStoreWithNoIncomingConnectors() {
		// create partial STL model and STL simulation model
		WasteStore wasteStore = createWasteStore("Waste Store (testProcessingForStoreWithNoIncomingConnectors)", 2);
		StoreInfo wasteStoreInfo = createStoreInfo(wasteStore, 0);
		
		// trigger simulation step for waste store
		boolean processed = wasteStoreInfo.process();
		
		// return value should be true
		assertTrue(processed);
		
		// after simulation step, zero items should be stored in waste store since no item was provided
		assertEquals(0, wasteStoreInfo.getStoredItems().size());
		
		// after simulation step, usage time is still 0 = starting time since no item was provided
		assertEquals(0, wasteStoreInfo.getUseTime());
	}
	
	@Test
	public void testProcessingForFullStore() {
		// create partial STL model and STL simulation model
		WasteStore wasteStore = createWasteStore("Waste Store (testProcessingForFullStore)", 1);
		StoreInfo wasteStoreInfo = createStoreInfo(wasteStore, 1);
		ConnectorInfo connectorInfo = createConnectorInfo(null, wasteStoreInfo, true);
		
		// trigger simulation step for waste store
		boolean processed = wasteStoreInfo.process();
		
		// return value should be true
		assertTrue(processed);
		
		// after simulation step, one item should be stored in waste store (the one that was already stored); the second item provided via the input connector is not added, since the capacity of the store is 1
		assertEquals(1, wasteStoreInfo.getStoredItems().size());
		
		// after simulation step, the item should be still provided by the connector
		assertNotNull(connectorInfo.getItem());
		
		// after simulation step, usage time of waste store should be 0 = starting time, since no item was stored
		assertEquals(0, wasteStoreInfo.getUseTime());
	}
	
	private WasteStore createWasteStore(String name, int capacity) {
		WasteStore wasteStore = STL_FACTORY.createWasteStore();
		wasteStore.setName(name);
		wasteStore.setCapacity(capacity);
		return wasteStore;
	}
	
	private StoreInfo createStoreInfo(Store store, int storedItems) {
		StoreInfo storeInfo = STL_SIMULATION_FACTORY.createStoreInfo();
		storeInfo.setComponent(store);
		storeInfo.setUseTime(0);
		storeInfo.setProcessingTime(PROCESSING_TIME);
		for (int i=0;i<storedItems;++i) {
			ItemInfo itemInfo = STL_SIMULATION_FACTORY.createItemInfo();
			storeInfo.getStoredItems().add(itemInfo);
		}
		return storeInfo;
	}
	
	private ConnectorInfo createConnectorInfo(ComponentInfo source, ComponentInfo target, boolean isItemProvided) {
		ConnectorInfo connectorInfo = STL_SIMULATION_FACTORY.createConnectorInfo();
		if (source != null) {
			source.getOutputConnectors().add(connectorInfo);
		}
		if (target != null) {
			target.getInputConnectors().add(connectorInfo);
		}
		if(isItemProvided) {
			ItemInfo itemInfo = STL_SIMULATION_FACTORY.createItemInfo();
			connectorInfo.setItem(itemInfo);
		}
		return connectorInfo;
	}

}

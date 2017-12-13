package at.ac.tuwien.big.stl.design;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import at.ac.tuwien.big.stl.ItemType;

/**
 * The services class used by VSM.
 */
public class Services {

	public ItemType getDefaultItemType(EObject object) {
		EObject parent = getParent(object);
		if (parent instanceof at.ac.tuwien.big.stl.System) {
			EList<ItemType> items = ((at.ac.tuwien.big.stl.System) parent).getItemTypes();
			if (!items.isEmpty()) {
				return items.get(0);
			}
		}
		return null;
	}

	private EObject getParent(EObject object) {
		if (object != null && object.eContainer() != null) {
			return getParent(object.eContainer());
		}
		return object;
	}
}

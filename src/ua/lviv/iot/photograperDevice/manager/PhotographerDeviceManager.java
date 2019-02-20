package ua.lviv.iot.photograperDevice.manager;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ua.lviv.iot.photographerDevice.model.PhotographerDevice;

public class PhotographerDeviceManager implements lPhotographerDeviceManager {

	@Override
	public void sortBySize(List<PhotographerDevice> device, boolean reverse) {
		if (reverse) {
			Collections.sort(device, Comparator.comparing(PhotographerDevice::getSize).reversed());
		} else {
			Collections.sort(device, Comparator.comparing(PhotographerDevice::getSize));
		}
	}

	@Override
	public void sortByWeight(List<PhotographerDevice> device, boolean reverse) {
		if (reverse) {
			Collections.sort(device, Comparator.comparing(PhotographerDevice::getWeight).reversed());
		} else {
			Collections.sort(device, Comparator.comparing(PhotographerDevice::getWeight));
		}
	}

}

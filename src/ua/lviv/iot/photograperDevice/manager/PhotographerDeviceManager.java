package ua.lviv.iot.photograperDevice.manager;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ua.lviv.iot.photographerDevice.model.PhotographerDevice;

public class PhotographerDeviceManager implements lPhotographerDeviceManager {

	@Override
	public List<PhotographerDevice> sortBySize(List<PhotographerDevice> device, boolean reverse) {
		Comparator<PhotographerDevice> comparator = 
				((PhotographerDevice d1, PhotographerDevice d2) -> d1.getSize() - d2.getSize());
		        device.sort(comparator);
		        if(reverse) {
		        	Collections.reverse(device);
		        }
		return device;
	}

	
	@Override
	public List<PhotographerDevice> sortByWeight(List<PhotographerDevice> device, boolean reverse) {
		Comparator<PhotographerDevice> comparator = 
				((PhotographerDevice d1, PhotographerDevice d2) -> d1.getWeight() - d2.getWeight());
		        device.sort(comparator);
		        if(reverse) {
		        	Collections.reverse(device);
		        }
		return device;
		  
	}

}

package ua.lviv.iot.photograperDevice.manager;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import ua.lviv.iot.photographerDevice.model.*;

import ua.lviv.iot.photographerDevice.model.PhotographerDevice;

public class PhotographerDeviceManager implements lPhotographerDeviceManager {

private List<PhotographerDevice> devices;


public PhotographerDeviceManager() {
	}


	public PhotographerDeviceManager(List<PhotographerDevice> devices) {
	this.devices = devices;
}

	public List<PhotographerDevice> getDevices() {
		return devices;
	}


	public void setDevices(List<PhotographerDevice> devices) {
		this.devices = devices;
	}


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

	public List<PhotographerDevice> findEssentialDevicesForNatureByTarget(Target target) { 
		 
		  List<PhotographerDevice> devicesList = devices; 
		 
		  List<PhotographerDevice> findPhotographerDeviceList = devicesList.stream() 
		 
		    .filter(devices -> devices.getTarget() == target) 
		 
		    .collect(Collectors.toList()); 
		 
		  return findPhotographerDeviceList; 
		 
		 }

}

package ua.lviv.iot.photograperDevice.manager;

import java.util.List;

import ua.lviv.iot.photographerDevice.model.PhotographerDevice;

public interface lPhotographerDeviceManager {

	public void sortBySize(List<PhotographerDevice> device, boolean reverse);
	
	public void sortByWeight(List<PhotographerDevice> device,boolean reverse);
}

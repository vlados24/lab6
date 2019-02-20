package ua.lviv.iot.photograperDevice.manager;

import java.util.List;

import ua.lviv.iot.photographerDevice.model.PhotographerDevice;

public interface lPhotographerDeviceManager {

	public List<PhotographerDevice> sortBySize(List<PhotographerDevice> device, boolean reverse);
	
	public List<PhotographerDevice> sortByWeight(List<PhotographerDevice> device,boolean reverse);
}

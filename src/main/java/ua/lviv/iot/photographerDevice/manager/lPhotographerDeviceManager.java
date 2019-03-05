package main.java.ua.lviv.iot.photographerDevice.manager;

import java.util.List;


import main.java.ua.lviv.iot.photographerDevice.model.PhotographerDevice;

public interface lPhotographerDeviceManager {

	public void sortBySize(List<PhotographerDevice> device, boolean reverse);
	
	public void sortByWeight(List<PhotographerDevice> device,boolean reverse);
}

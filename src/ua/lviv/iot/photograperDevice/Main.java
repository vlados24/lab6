package ua.lviv.iot.photograperDevice;


import java.util.ArrayList;
import java.util.List;

import ua.lviv.iot.photograperDevice.manager.PhotographerDeviceManager;
import ua.lviv.iot.photographerDevice.model.Camera;
import ua.lviv.iot.photographerDevice.model.Lantern;
import ua.lviv.iot.photographerDevice.model.PhotographerDevice;
import ua.lviv.iot.photographerDevice.model.Quadcopter;
import ua.lviv.iot.photographerDevice.model.StudioStand;
import ua.lviv.iot.photographerDevice.model.Target;

public class Main {

	public static void main(String[] args) {
		
		
		PhotographerDeviceManager manager = new  PhotographerDeviceManager();
		
		
		Camera camera = new Camera(100, 22, Target.LANDSCAPE, "Sony", "Yes", 7, "Intel Core");
		Lantern lantern = new Lantern(200, 30, Target.CLASSIC_EVENT, 3, "Powerfull");
		StudioStand studioStand = new StudioStand(17, 25, Target.CLASSIC_EVENT, "Yes", 3, 1);
		Quadcopter quadcopter = new Quadcopter(5, 8, Target.SPORT_EVENT, 1000, 250, 800 );
		
		List<PhotographerDevice> listDevice = new ArrayList();
		listDevice.add(camera);
		listDevice.add(lantern);
		listDevice.add(studioStand);
		listDevice.add(quadcopter);
		
		System.out.println(manager.sortBySize(listDevice, true));
		System.out.println(manager.sortByWeight(listDevice, true));
	}

}

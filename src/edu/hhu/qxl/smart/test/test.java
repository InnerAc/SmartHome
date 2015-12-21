package edu.hhu.qxl.smart.test;

import org.junit.Test;

import edu.hhu.qxl.smart.bundle.Air;
import edu.hhu.qxl.smart.bundle.AirPurifier;
import edu.hhu.qxl.smart.bundle.ControllerOfAirPurifier;
import edu.hhu.qxl.smart.bundle.ControllerOfWindows;
import edu.hhu.qxl.smart.bundle.SensorOfPM25;
import edu.hhu.qxl.smart.bundle.SmartHome;
import edu.hhu.qxl.smart.bundle.User;
import edu.hhu.qxl.smart.bundle.Windows;

public class test {

	@Test
	public void start() throws InterruptedException {

		double threshold1 = 30;
		double threshold2 = 60;

		User user = new User();
		Air air = new Air();
		SensorOfPM25 sensorOfPM25 = new SensorOfPM25(threshold1, threshold2);
		ControllerOfWindows controllerOfWindows = new ControllerOfWindows();
		Windows windows = new Windows();
		ControllerOfAirPurifier controllerOfAirPurifier = new ControllerOfAirPurifier();
		AirPurifier airPurifier = new AirPurifier();

		SmartHome smartHome = new SmartHome();

		smartHome.user = user;
		smartHome.air = air;
		smartHome.sensorOfPM25 = sensorOfPM25;
		smartHome.controllerOfWindows = controllerOfWindows;
		smartHome.windows = windows;
		smartHome.controllerOfAirPurifier = controllerOfAirPurifier;
		smartHome.airPurifier = airPurifier;

		user.setSmartHome(smartHome);
		air.setSmartHome(smartHome);
		sensorOfPM25.setSmartHome(smartHome);
		controllerOfWindows.setSmartHome(smartHome);
		windows.setSmartHome(smartHome);
		controllerOfAirPurifier.setSmartHome(smartHome);
		airPurifier.setSmartHome(smartHome);

		while (true) {
			air.setPM25Value(Math.random() * 100);
			Thread.sleep(1000);
		}
	}
}

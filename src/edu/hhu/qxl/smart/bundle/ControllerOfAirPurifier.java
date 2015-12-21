package edu.hhu.qxl.smart.bundle;

public class ControllerOfAirPurifier {

	public SmartHome smartHome;

	public void setSmartHome(SmartHome smartHome) {
		this.smartHome = smartHome;
	}

	public void openAirPurifier() {
		System.out.println("Will open air purifier");
		boolean isOpen = smartHome.airPurifier.open();
		if (isOpen) {
			System.out.println("Open air purifier Successfully");
		} else {
			System.out.println("Open air purifier failly");
			signalUserOpenAirPurifiers();
		}
	}

	public void signalUserOpenAirPurifiers() {
		System.out.println("signal user to open air purifier!!");
		smartHome.user.userCloseWindows();
	}
}

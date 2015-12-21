package edu.hhu.qxl.smart.bundle;

public class User {
	
	public SmartHome smartHome;
	public void setSmartHome(SmartHome smartHome){
		this.smartHome = smartHome;
	}
	public void userCloseWindows(){
		smartHome.windows.close();
	}
	public void userOpenAirPurifiers(){
		smartHome.airPurifier.open();
	}
}

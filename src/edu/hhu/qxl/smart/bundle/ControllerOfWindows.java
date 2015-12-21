package edu.hhu.qxl.smart.bundle;

public class ControllerOfWindows {

	public SmartHome smartHome;
	public void setSmartHome(SmartHome smartHome){
		this.smartHome = smartHome;
	}
	public void closeWindows(){
		
		System.out.println("Will close windows");
		boolean isClosed = smartHome.windows.close();
		if(isClosed){
			System.out.println("Close windows Successfully");
		}else{
			System.out.println("Close windows failly");
			signalUserCloseWindows();
		}
	}
	
	public void signalUserCloseWindows(){
		System.out.println("signal user to close windows!!");
		smartHome.user.userCloseWindows();
	}
}

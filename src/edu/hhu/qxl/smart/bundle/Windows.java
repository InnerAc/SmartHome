package edu.hhu.qxl.smart.bundle;

import edu.hhu.qxl.smart.pro.StaticValue;


public class Windows {
	
	public int status = StaticValue.WINDOWS_CLOSE;
	public SmartHome smartHome;
	public void setSmartHome(SmartHome smartHome){
		this.smartHome = smartHome;
	}
	public boolean close(){
		
		System.out.println("windows is closeing");
		boolean isSuccess = Math.random() > 0.3;
		if(isSuccess){
			status = StaticValue.WINDOWS_CLOSE;
		}
		return isSuccess;
	}
}

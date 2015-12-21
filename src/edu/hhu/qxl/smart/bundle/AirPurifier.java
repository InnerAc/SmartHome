package edu.hhu.qxl.smart.bundle;

import edu.hhu.qxl.smart.pro.StaticValue;

public class AirPurifier {

	public SmartHome smartHome;
	public void setSmartHome(SmartHome smartHome){
		this.smartHome = smartHome;
	}
	public int status = StaticValue.AIRPURIFIER_CLOSE;
	public boolean open(){
		
		System.out.println("air purifier is opening");
		boolean isSuccess = Math.random() > 0.3;
		if(isSuccess){
			status = StaticValue.AIRPURIFIER_OPEN;
		}
		return isSuccess;
	}
}

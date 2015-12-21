package edu.hhu.qxl.smart.bundle;

public class SensorOfPM25 {

	private double threshold1;
	private double threshold2;
	public SmartHome smartHome;
	private double pm25Value = 0;
	public SensorOfPM25(double threshold1,double threshold2){
		this.threshold1 = threshold1;
		this.threshold2 = threshold2;
	}
	public void setSmartHome(SmartHome smartHome){
		this.smartHome = smartHome;
	}
	public void getPM25Value(double value){
		this.pm25Value = value;
		judge();
	}
	
	public void judge(){
		if(pm25Value > threshold1){
			
			System.out.println("PM2.5 exceeds the threshold");
			pm25Warning();
		}
	}
	
	public void pm25Warning() {
		if(pm25Value < threshold2){
			System.out.println("Warning!!!");
			smartHome.controllerOfWindows.closeWindows();
		}else{
			System.out.println("Warning!!!!!!");
			smartHome.controllerOfAirPurifier.openAirPurifier();
		}
	}
}

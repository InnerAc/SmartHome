package edu.hhu.qxl.smart.bundle;

public class Air {

	public double pm25Value;
	public SmartHome smartHome;

	public void setSmartHome(SmartHome smartHome) {
		this.smartHome = smartHome;
	}

	public Air() {
		this.pm25Value = 0;
	}

	public void setPM25Value(double value) {
		this.pm25Value = value;
		smartHome.sensorOfPM25.getPM25Value(value);
	}
}

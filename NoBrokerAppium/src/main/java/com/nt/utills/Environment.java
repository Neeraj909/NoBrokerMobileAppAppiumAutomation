package com.nt.utills;

public class Environment {
	private String platformName;
	private String platformVersion;
	private String appPackage;
	private String automationName;
	private String appActivity;
	private String URL;
	private String deviceName;
    public String getUdid() {
		return udid;
	}

	public void setUdid(String udid) {
		this.udid = udid;
	}

	private String udid;
	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getPlatformName() {
		return platformName;
	}

	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

	public String getPlatformVersion() {
		return platformVersion;
	}

	public void setPlatformVersion(String platformVersion) {
		this.platformVersion = platformVersion;
	}

	public String getAppPackage() {
		return appPackage;
	}

	public void setAppPackage(String appPackage) {
		this.appPackage = appPackage;
	}

	public String getAutomationName() {
		return automationName;
	}

	public void setAutomationName(String automationName) {
		this.automationName = automationName;
	}

	public String getAppActivity() {
		return appActivity;
	}

	public void setAppActivity(String appActivity) {
		this.appActivity = appActivity;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	@Override
	public String toString() {
		return "Environment [platformName=" + platformName + ", platformVersion=" + platformVersion + ", appPackage="
				+ appPackage + ", automationName=" + automationName + ", appActivity=" + appActivity + ", URL=" + URL
				+ ", deviceName=" + deviceName + "]";
	}

}

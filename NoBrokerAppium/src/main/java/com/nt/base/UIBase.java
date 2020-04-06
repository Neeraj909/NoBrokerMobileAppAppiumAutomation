package com.nt.base;


import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nt.utills.CommonUtills;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;



public class UIBase {
 // public static DesiredCapabilities cap ;
	public static WebDriverWait webDriverWait;
	public static AppiumDriverLocalService service;
	public static DesiredCapabilities cap ;
	public static AppiumDriverLocalService getService() {
		return service;
	}

	public static void setService(AppiumDriverLocalService service) {
		UIBase.service = service;
	}

	public static AppiumServiceBuilder getBuilder() {
		return builder;
	}

	public static void setBuilder(AppiumServiceBuilder builder) {
		UIBase.builder = builder;
	}

	private static AppiumServiceBuilder builder;

	public WebDriverWait getWebDriverWait() {
		if (webDriverWait == null) {
		}
		webDriverWait = new WebDriverWait(getAppiumDriver(), 10);
		return webDriverWait;
	}


	@SuppressWarnings("rawtypes")
	public static AndroidDriver androidDriver;

	public static AndroidDriver getAndroidDriver() {
		return androidDriver;
	}

	public static void setAndroidDriver(AndroidDriver androidDriver) {
		UIBase.androidDriver = androidDriver;
	}

	public static AppiumDriver getAppiumDriver() {
		return appiumDriver;
	}



	public static AppiumDriver appiumDriver;

	

	public static void setAppiumDriver(AppiumDriver appiumDriver) {
		UIBase.appiumDriver = appiumDriver;
	}

	public static void setDesiredCapabilities() throws Exception {
		
			startAppiumServer();
		
		cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,
				CommonUtills.getEnv().getConfig().getEnvironment().getDeviceName());
		//cap.setCapability(MobileCapabilityType.UDID, CommonUtills.getEnv().getConfig().getEnvironment().getUdid());
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,
				CommonUtills.getEnv().getConfig().getEnvironment().getPlatformName());
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,
				CommonUtills.getEnv().getConfig().getEnvironment().getPlatformVersion());
		cap.setCapability("appPackage", CommonUtills.getEnv().getConfig().getEnvironment().getAppPackage());
		cap.setCapability("appActivity", CommonUtills.getEnv().getConfig().getEnvironment().getAppActivity());
		// cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		URL url = new URL(CommonUtills.getEnv().getConfig().getEnvironment().getURL());
		setAppiumDriver(new AppiumDriver(url, cap));
		cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
		cap.setCapability("autoAcceptAlerts", true);
		getAppiumDriver().context("NATIVE_APP");

	}
	public static void startAppiumServer() {
		 setService(AppiumDriverLocalService.buildDefaultService());
	        getService().start();
	}

	
	public void jsClick(MobileElement element) {
		JavascriptExecutor js = (JavascriptExecutor) getAppiumDriver();
		String query = "var evObj = document.createEvent('Events'); evObj.initEvent('click', true, false); arguments[0].dispatchEvent(evObj);";
		js.executeScript(query, element);
	}

	public static void jsScrollIntoView(MobileElement element) {
		JavascriptExecutor js = (JavascriptExecutor) getAppiumDriver();
		String scrollToViewScript = "arguments[0].scrollIntoView(true);";
		js.executeScript(scrollToViewScript, element);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

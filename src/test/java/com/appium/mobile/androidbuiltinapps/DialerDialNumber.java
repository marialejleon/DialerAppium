package com.appium.mobile.androidbuiltinapps;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class DialerDialNumber {
	@Test
	public void testDialNumber() throws Exception{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "6.0");
		cap.setCapability("deviceName", "Android Emulator");
		cap.setCapability("app", "C:\\Users\\Marialej\\Downloads\\MultiTouch Test_v1.1_apkpure.com.apk");
		
		cap.setCapability("appPackage", "com.android.dialer");
		cap.setCapability("appActivity", "DialtactsActivity");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap );
		
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("new UiSelector()."
				+ "resourceId(\"com.android.dialer:id/floating_action_button\")").click();
		
		driver.findElementByAndroidUIAutomator("new UiSelector()."
				+ "resourceId(\"com.android.dialer:id/digits\")").click();
		
		driver.findElementByAndroidUIAutomator
		("new UiSelector().resourceId(\"com.android.dialer:id/digits\")").sendKeys("627170351");
		
		driver.findElementByAndroidUIAutomator("new UiSelector()."
				+ "resourceId(\"com.android.dialer:id/dialpad_floating_action_button\")").click();
		
	}

}

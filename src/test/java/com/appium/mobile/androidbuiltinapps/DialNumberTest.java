package com.appium.mobile.androidbuiltinapps;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.LinkedList;
import java.util.Scanner;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class DialNumberTest {
	
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
		
		//Phone Number
		Scanner input = new Scanner(System.in);
		System.out.println("Intrduce numero de telefono");
		int phonenumber = input.nextInt();
		
		
		
		//Los numeros se guardan al reves so...
		
		LinkedList<Integer> stack = new LinkedList<Integer>();
		
		while(phonenumber>0){
			stack.push(phonenumber%10);
			phonenumber=phonenumber/10;
			
		}
		
		while(!stack.isEmpty()){
			switch (stack.pop()){
			case 1:
				driver.findElementByAndroidUIAutomator("new UiSelector()."
						+ "resourceId(\"com.android.dialer:id/one\")").click();
				break;
			case 2:
				driver.findElementByAndroidUIAutomator("new UiSelector()."
						+ "resourceId(\"com.android.dialer:id/two\")").click();
				break;
			case 3:
				driver.findElementByAndroidUIAutomator("new UiSelector()."
						+ "resourceId(\"com.android.dialer:id/three\")").click();
				break;
			case 4:
				driver.findElementByAndroidUIAutomator("new UiSelector()."
						+ "resourceId(\"com.android.dialer:id/four\")").click();
				break;
			case 5:
				driver.findElementByAndroidUIAutomator("new UiSelector()."
						+ "resourceId(\"com.android.dialer:id/five\")").click();
				break;
			case 6:
				driver.findElementByAndroidUIAutomator("new UiSelector()."
						+ "resourceId(\"com.android.dialer:id/six\")").click();
				break;
			case 7:
				driver.findElementByAndroidUIAutomator("new UiSelector()."
						+ "resourceId(\"com.android.dialer:id/seven\")").click();
				break;
			case 8:
				driver.findElementByAndroidUIAutomator("new UiSelector()."
						+ "resourceId(\"com.android.dialer:id/eight\")").click();
				break;
			case 9:
				driver.findElementByAndroidUIAutomator("new UiSelector()."
						+ "resourceId(\"com.android.dialer:id/nine\")").click();
				break;
			case 0:
				driver.findElementByAndroidUIAutomator("new UiSelector()."
						+ "resourceId(\"com.android.dialer:id/zero\")").click();
				break;
			
			
			}
						
		}
		
		driver.findElementByAndroidUIAutomator("new UiSelector()."
				+ "resourceId(\"com.android.dialer:id/dialpad_floating_action_button\")").click();
		
	}

}

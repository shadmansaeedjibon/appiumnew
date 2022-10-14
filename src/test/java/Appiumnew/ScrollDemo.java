package Appiumnew;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class ScrollDemo extends BaseTest{
	
	@Test
	public void ScrollDemoTest() throws MalformedURLException, InterruptedException
	
	{
	
      driver.findElement(AppiumBy.accessibilityId("Views")).click(); //click views
      
      driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"ImageSwitcher\"));")); //scroll into expected area
      
	 Thread.sleep(2000);
		
	}
	
	
	
	

}

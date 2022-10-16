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

public class SwipeDemo extends BaseTest{
	
	@Test
	public void SwipeDemoTest() throws MalformedURLException, InterruptedException
	
	{
	
      driver.findElement(AppiumBy.accessibilityId("Views")).click(); //click views
      
      driver.findElement(AppiumBy.accessibilityId("Gallery")).click(); //click Gallery
      
      driver.findElement(By.xpath("//android.widget.TextView[@text='1. Photos']")).click();
      
      WebElement firstImage = driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
      
      Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"),"true");

      //swipe
      
      swipeAction(firstImage,"left");
      
     // ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
    		  
    	//	  "elementId",((RemoteWebElement)firstImage).getId(),	  
  		   
  		 //   "direction", "left",
  		 //   "percent", 0.75
     // ));
      
      Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"),"false");
      
      Thread.sleep(2500);
      
      
	
		
	}
	
	
	
	

}

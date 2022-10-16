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

public class DragDropDemo extends BaseTest{
	
	@Test
	public void DragDropTest() throws MalformedURLException, InterruptedException
	
	{
	
      driver.findElement(AppiumBy.accessibilityId("Views")).click(); //click views
      
      driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click(); //click Drag and Drop
      
      WebElement source =driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
      
      
      ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
       		  
       		  "elementId",((RemoteWebElement)source).getId(),	  
     		   
     		    "endX", 622,
     		    "endY", 555
         ));
     
      Thread.sleep(500);
      
     String result= driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
	 Assert.assertEquals(result, "Dropped!");
	 
	 Thread.sleep(2000);
		
	}
	
	
	
	

}

package Appiumnew;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class MiscelaniousAppliumActions extends BaseTest{
	
	@Test
	public void Miscellanous() throws MalformedURLException, InterruptedException
	
	{
	
	//ConfigureAppium();// this is not needed because BaseTest has BeforeClass anotation
	driver.findElement(AppiumBy.accessibilityId("Preference")).click();
	
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
	
	driver.findElement(By.id("android:id/checkbox")).click(); //click on checkbox
	
	//devicerotation class
	
	DeviceRotation landScape = new DeviceRotation(0, 0, 90);
	driver.rotate(landScape);
	
	
	driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click(); //click on wifi settings
	
	String alertTitle =driver.findElement(By.id("android:id/alertTitle")).getText(); //get text
	Assert.assertEquals(alertTitle, "WiFi settings"); //assetion check
	
	//copy paste
	// copy to clipboard- paste to clipboard
	
	driver.setClipboardText("shadman wifi"); //copy to clipboard
	
	driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());  //paste
	
	driver.pressKey(new KeyEvent(AndroidKey.ENTER)); //androod enter
	
	driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click(); //click ok button
	
	Thread.sleep(2000);
	driver.pressKey(new KeyEvent(AndroidKey.BACK)); //androod back
	driver.pressKey(new KeyEvent(AndroidKey.HOME)); //androod home
	
	//tearDown();//this is not needed because BaseTest has AfterClass annotation
	
	//tagName[@attribute='value']
		
		
	}
	
	
	
	

}

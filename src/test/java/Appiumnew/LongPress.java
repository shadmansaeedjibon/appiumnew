package Appiumnew;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class LongPress extends BaseTest {
    @Test
    public void LongPressGesture() throws MalformedURLException, InterruptedException {

        driver.findElement(AppiumBy.accessibilityId("Views")).click(); //click views

        driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click(); //click Expandable Lists

        driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click(); //1. Custom Adapter

        WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']")); //longpress

        longPressAction(ele); //this come from baseTest

        //((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),"duration",4000)); //longpress...its use in base

        String menuText = driver.findElement(By.id("android:id/title")).getText(); //to record the visible text after longpress
        Assert.assertEquals(menuText, "Sample menu"); //assetion check
        Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed()); //another method of assertion...u can use any of them
        Thread.sleep(2000);
    }
}

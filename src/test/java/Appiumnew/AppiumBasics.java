package Appiumnew;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class AppiumBasics extends BaseTest {
    @Test
    public void AppiumTest() throws MalformedURLException {
        //ConfigureAppium();// this is not needed because BaseTest has BeforeClass anotation
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();

        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();

        driver.findElement(By.id("android:id/checkbox")).click(); //click on checkbox

        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click(); //click on wifi settings

        String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText(); //get text
        Assert.assertEquals(alertTitle, "WiFi settings"); //assetion check

        driver.findElement(By.id("android:id/edit")).sendKeys("shadman wifi"); //sendkeys "shadman wifi"

        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click(); //click ok button

        //tearDown();//this is not needed because BaseTest has AfterClass annotation

        //tagName[@attribute='value']
    }
}

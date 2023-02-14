package Appiumnew;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class eCommerce_tc_toastmessage extends BaseTest {
    @Test
    public void toastmessage_validation() throws InterruptedException {

        //driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Shadman Saeed"); //fill namefield

        //Thread.sleep(2000);

        driver.hideKeyboard();

        //Thread.sleep(3000);

        //driver.findElementByAndroidUIAutomator("text(\"Female\")").click(); // click select branch
        driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
        //driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female'")).click(); //click on radiobutton


        driver.findElement(By.id("android:id/text1")).click(); //click on country

        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));")); //scroll into expected area


        //driver.findElement(MobileBy.AndroidUIAutomator("")).click();

        //driver.findElement(MobileBy.AndroidUIAutomator("Bangladesh")).click();

        Thread.sleep(2000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("text(\"Argentina\")")).click();// for click Argentina

        //driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina'")).click();

        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click(); //click lets shop

        //Thread.sleep(3000);

        String toastMessage = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
        Assert.assertEquals(toastMessage, "Please enter your name");

        Thread.sleep(3000);
        //driver.findElement(AppiumBy.androidUIAutomator("text(\"Female\")").
    }
}

package Appiumnew;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class eCommerce_tc_2 extends BaseTest {

    @Test
    public void add_to_cart() throws InterruptedException {

        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Shadman Saeed"); //fill namefield

        Thread.sleep(2000);

        driver.hideKeyboard();

        //Thread.sleep(3000);

        //driver.findElementByAndroidUIAutomator("text(\"Female\")").click(); // click select branch
        driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
        //driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female'")).click(); //click on radiobutton


        driver.findElement(By.id("android:id/text1")).click(); //click on country

        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));")); //scroll into expected area


        //driver.findElement(MobileBy.AndroidUIAutomator("")).click();

        //driver.findElement(MobileBy.AndroidUIAutomator("Bangladesh")).click();
        //driver.findElement(MobileBy.AndroidUIAutomator("Bangladesh")).click();

        Thread.sleep(2000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("text(\"Argentina\")")).click();// for click Argentina

        //driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina'")).click();

        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click(); //click lets shop

        Thread.sleep(3000);


        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));")); //scroll to jordan 6 rings


        // eksathe same page e 2 ta add to cart thakle evabei kaj korte hobe
        int productCount = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();

        for (int i = 0; i < productCount; i++) {

            String productName = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();

            if (productName.equalsIgnoreCase("Jordan 6 Rings")) {

                driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click(); //add to cart
            }

        }
        //driver.findElement(AppiumBy.androidUIAutomator("text(\"Female\")").
        Thread.sleep(2000);
        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click(); //click on cart
        Thread.sleep(1500);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); //explicit wait..cart page loading ses na howa porjonto 5 seconds wait korbe//cause product r cart page er id same

        wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")), "text", "Cart"));

        String lastPageProduct = driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();

        Assert.assertEquals(lastPageProduct, "Jordan 6 Rings");
    }

}

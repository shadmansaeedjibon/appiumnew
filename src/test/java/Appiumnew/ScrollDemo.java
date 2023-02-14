package Appiumnew;

import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class ScrollDemo extends BaseTest {
    @Test
    public void ScrollDemoTest() throws MalformedURLException, InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click(); //click views
//----------------------------------------------------------------      
        //where to scroll is known prior

        //driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"ImageSwitcher\"));")); //scroll into expected area

        //---------------------------------------------------------------
        //scroll to the last

        scrollToEndAction();


        //boolean canScrollMore;
        //do {
        //	canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap
        //				.of("left", 100, "top", 100, "width", 200, "height", 200, "direction", "down", "percent", 3.0));
        //} while (canScrollMore);
    }
}

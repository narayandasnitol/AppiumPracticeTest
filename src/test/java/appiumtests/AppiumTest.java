package appiumtests;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.PointOption;


public class AppiumTest {
	
	static AppiumDriver driver;

	public static void main(String[] args) throws InterruptedException {
		try {
			NopStationCart();
		} catch (MalformedURLException e) {
			e.getCause();
			e.getMessage();
			e.printStackTrace();
		}
	}
	
	public static void NopStationCart() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Realme c25s");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\Lenovo B40\\Downloads\\nopstationCart_4.40.apk");
		cap.setCapability("appPackage", "com.nopstation.nopcommerce.nopstationcart");
		cap.setCapability("appActivity", "com.bs.ecommerce.main.SplashScreenActivity");
		
//		 TouchAction ac;
//		 ac = new TouchAction((PerformsTouchActions) driver)
//         .longPress(LongPressOptions.longPressOptions().withPosition(PointOption.point(184, 233)))
//         .moveTo(PointOption.point(200, 200))
//         .moveTo(PointOption.point(250, 250))
//         .release()
//         .perform();
//        
//         Thread.sleep(5000);
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		System.out.println("Application started...");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnAccept")).click();
		
		// Mike click "electronics" from our categories list from home page
		driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\\\"Placeholder\\\"])[5]")).click();
		// Mike click to "Nokia Lumia 1020" product details page
		driver.findElement(By.xpath("driver.findElement(By.xpath(\"(//android.widget.ImageView[@content-desc=\\\"Placeholder\\\"])[3]\")).click();")).click();
		// Open Size section
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.view.ViewGroup[1]/android.widget.TextView[3]")).click();
		// Mike select size "Large" from product details page
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[2]")).click();
		// close size selection
		driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/tvDone")).click();
		// Mike click plus button to increase Qty by "2"
		driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnPlus")).click();
		// Mike click add to cart button to add the product in his cart
		driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnAddToCart")).click();
		System.out.println("Nokia Lumia 1020 successfully added to cart...");
		
		System.out.println("---Scenario: 01---");
		
		//  Mike go to shopping cart by clicking top cart icon
		driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/counterIcon")).click();
		// Mike click checkout button from shopping cart page
		driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnCheckOut")).click();
		//  Mike select checkout as guest from shopping cart page
		driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnGuestCheckout")).click();
		
		//Mike input all the details in checkout billing details page and click continue
		driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etFirstName")).sendKeys("Narayan Das");
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etLastName")).sendKeys("Nitol");
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etEmail")).sendKeys("nitol.aust.cse@gmail.com");
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etCompanyName")).sendKeys("Yo Tech Limited");
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etCity")).sendKeys("Sylhet");
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress")).sendKeys("Mohana-B 5/11, Ponitula");
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etZipCode")).sendKeys("3100");
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etPhone")).sendKeys("01753458871");
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/countrySpinner")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")).click();
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnContinue")).click();
        
        
       // Mike select "Next Day Air" as shipping method and click continue
        driver.findElement(By.className("android.widget.RelativeLayout[4]")).click();
        driver.findElement(By.className("android.widget.Button")).click();
        // Mike select "Check/Money Order" as payment method and click continue
        driver.findElement(By.className("android.widget.RelativeLayout[2]")).click();
        driver.findElement(By.className("android.widget.Button")).click();
        // Mike click next button on payment information page
        driver.findElement(By.className("android.widget.Button")).click();
        //  Mike click confirm button to place the order
        driver.findElement(By.className("android.widget.Button")).click();
        //  Verify order place successfully with popup message "Your order has been successfully processed!"
        System.out.println((driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/md_text_message")).getText()));
        
        System.out.println("---Scenario: 02---");
	}

}

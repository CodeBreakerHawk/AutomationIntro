package apiumlearning.agr;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
//import java.net.URL;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBasics extends BaseClass {
	
	@Test
	
	public void SetWifiName() throws MalformedURLException, URISyntaxException {
		
		
		// This script is to open App and navigate to Wi-fi and set the Wi-fi name to "Mission Success" 
		
		//To automatically start server use below commented code 
		//AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\abhis\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
		//service.start();
		
//		UiAutomator2Options options = new UiAutomator2Options();
//		options.setDeviceName("Pixel8");
//		options.setApp("E:\\Projects\\Automation\\Android\\agr\\src\\test\\java\\resources\\ApiDemos-debug.apk");
//		
//		AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(alertTitle, "WiFi settings");
		driver.findElement(By.id("android:id/edit")).sendKeys("Hello! ");
		driver.findElement(By.id("android:id/button1")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		driver.findElement(By.id("android:id/edit")).clear();
		driver.findElement(By.id("android:id/edit")).sendKeys(" Changed the name ! ");
		driver.findElement(By.id("android:id/button1")).click();
		
		
		
		
		
		
		//driver.quit();
		//service.stop(); moved to separate method in different class file 
	
	}
	
}

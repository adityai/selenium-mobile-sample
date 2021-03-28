package com.selenium_testng.sample1.testscripts;

import static org.assertj.core.api.Assertions.assertThat;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

@Test
public class AndroidAppTest {

//	@BeforeClass
//	public void setup(String browser) throws MalformedURLException {
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability("platformName", "Android");
//		capabilities.setCapability("deviceName", "Google Pixel 2");
//		capabilities.setCapability("platformVersion", "11");
//		capabilities.setCapability("app", "storage:filename=app-release.apk");
//		capabilities.setCapability("deviceOrientation", "portrait");
//		driver = new AndroidDriver<WebElement>(new URL(System.getenv("GRID_URL")), capabilities);
//	}

//	@AfterClass
//	public void teardown() {
//		driver.quit();
//	}

	public void simpleAndroidAppTest() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", System.getenv("PLATFORM_NAME"));
		capabilities.setCapability("deviceName", System.getenv("DEVICE_NAME"));
		capabilities.setCapability("platformVersion", System.getenv("PLATFORM_VERSION"));
		capabilities.setCapability("app", System.getenv("APP_LOCATION"));
		capabilities.setCapability("deviceOrientation", "portrait");
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL(System.getenv("GRID_URL")), capabilities);

		MobileElement loginButton = (MobileElement) driver.findElementById("com.blueshieldca.npe:id/btnLogin");
		loginButton.click();
		MobileElement el2 = (MobileElement) driver.findElementById("com.blueshieldca.npe:id/login_username_txt");
		el2.sendKeys("tester");
		MobileElement el3 = (MobileElement) driver.findElementById("com.blueshieldca.npe:id/login_password_txt");
		el3.sendKeys("tester");
		driver.quit();
	}
}

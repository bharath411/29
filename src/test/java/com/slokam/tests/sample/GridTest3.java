package com.slokam.tests.sample;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Timestamp;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTest3 {

	@Test
	public void testFirefox() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println("Start testFirefox - GridTest3 :" + timestamp);
		System.setProperty("webdriver.gecko.driver", "D:\\jars\\geckodriver.exe");
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		WebDriver driver = null;
		URL hub = null;
		try {
			hub = new URL("http://localhost:4444/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver  = new RemoteWebDriver(hub,dc);
		driver.get("https://localhost:448/opencart/admin");
		driver.quit();
		timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println("Stopped testfierfox at :" + timestamp);

	}

	@Test
	public void testchrome() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println("Start testchrome - GridTest3 :" + timestamp);
		System.setProperty("webdriver.chrome.driver", "D:\\jars\\chromedriver.exe");
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		WebDriver driver = null;
		URL hub = null;
		try {
			hub = new URL("http://localhost:4444/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver  = new RemoteWebDriver(hub,dc);
		driver.get("https://localhost:448/opencart/admin");
		driver.quit();
		timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println("Stopped testchrome at :" + timestamp);
	}
}

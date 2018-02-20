package com.slokam.tests.pom;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestOpencart {
	public static WebDriver driver = null;

	@BeforeClass
	public void init() {
		System.setProperty("webdriver.gecko.driver", "D:\\jars\\geckodriver.exe");
		DesiredCapabilities dc = DesiredCapabilities.firefox();

		URL hub = null;
		try {
			hub = new URL("http://localhost:4444/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver = new RemoteWebDriver(hub, dc);
		driver.get("https://localhost:448/opencart/admin");
	}

	@Test
	public void verifyTest() {
		/*LoginPage_PF lp = new LoginPage_PF();
		PageFactory.initElements(driver, lp);*/
		LoginPage_PF lp = PageFactory.initElements(driver,LoginPage_PF.class);
		lp.login("user", "user123");
		DashBoardPage dp = new DashBoardPage();
		dp.clickCatalog();
		dp.clickProducts();
	}

	

	
}

package com.slokam.tests.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.slokam.common.By;

public class DashBoardPage {

WebDriver driver = TestOpencart.driver;
	public void clickCatalog() {
		WebElement catalog = driver.findElement(By.xpath("//li[@id='menu-catalog']/a"));
		String value = catalog.getAttribute("aria-expanded");
		if (value == null || value.equals("false")) {
			catalog.click();
		}
	}

	public void clickProducts() {
		driver.findElement(By.xpath("//a[contains(text(),'Products')]")).click();
	}
}

package com.slokam.tests.pom;

import org.openqa.selenium.WebDriver;

import com.slokam.common.By;

public class LoginPage {

	WebDriver driver = TestOpencart.driver;
	public void login(String username, String password) {
		driver.findElement(By.id("input-username")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//button[contains(@class,'btn-primary')]")).click();
	}
}

package com.slokam.tests.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_PF {

	@FindBy(id="input-username")
	WebElement userEle;
	
	@FindBy(id="input-password")
	WebElement passEle;
	
	@FindBy(xpath="//button[contains(@class,'btn-primary')]")
	WebElement submitEle;
	
	
	public void login(String username,String password) {
		userEle.sendKeys(username);
		passEle.sendKeys(password);
		submitEle.click();
	}
}

package com.slokam.pages.common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.slokam.pages.BasePage;

public class AdminLoginPage extends BasePage{

	@FindBy(id="input-username")
	WebElement userName ;
	
	@FindBy(id="input-password")
	WebElement password;
	
	@FindBy(xpath="//button[contains(@class,'btn-primary')]")
	WebElement login;
	
	@FindBy(xpath="//span[@class='help-block']/a")
	WebElement forgotPassword;
	
	
	public void login(String user, String pass) {
		userName.sendKeys(user);
		password.sendKeys(pass);
		login.click();
	}
	
}

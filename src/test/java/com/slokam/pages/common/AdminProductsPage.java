package com.slokam.pages.common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.slokam.pages.BasePage;

public class AdminProductsPage extends BasePage {

	@FindBy(xpath="//tr[1]//a[@data-original-title='Edit']")
	public WebElement firstProductEditButton;
	
	@FindBy(name="product_description[1][name]")
	public WebElement productEditName;
	
	@FindBy(xpath="//button[@data-original-title='Save']")
	public WebElement saveButton;
	
	@FindBy(xpath="//div[contains(@class,'alert')]")
	public WebElement alertMessage;
	
	public void editFirstProduct(String newName) {
		productEditName.clear();
		productEditName.sendKeys(newName);
		saveButton.click();
	}
	
	public String getAlertMessage() {
		return alertMessage.getText().trim();
	}
}

package com.slokam.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.slokam.pages.BasePage;

public class ApplicationProductPage extends BasePage {
	
	
	
	@FindBy(xpath = "//input[@name='search']")
	public WebElement searchBoxEle; 
	
	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	public WebElement searchButtonEle;	
	
	@FindBy(xpath = "//div[@class='product-thumb']/div/a")
	public WebElement firstProductEle;
	
	@FindBy(xpath = "//div[@class='col-sm-4']//ul[2]//li[1]")
	public WebElement priceEle;
	
		
	public void searchProduct(String productName) {
		searchBoxEle.sendKeys(productName);
		searchButtonEle.click();
		//m_driver.findElement(By.xpath("//img[@alt='"+productName+"']")).click();
		firstProductEle.click();
		
	}
	
	public String getPrice() {
		return priceEle.getText().substring(1);
	}
	

}

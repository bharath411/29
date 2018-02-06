package com.slokam.pages.common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.slokam.common.dto.ProductDTO;
import com.slokam.pages.BasePage;

public class AdminProductsPage extends BasePage {

	@FindBy(xpath = "//tr[1]//a[@data-original-title='Edit']")
	public WebElement firstProductEditButton;

	@FindBy(name = "product_description[1][name]")
	public WebElement productEditName;

	@FindBy(xpath = "//button[@data-original-title='Save']")
	public WebElement saveButton;

	@FindBy(xpath = "//div[contains(@class,'alert')]")
	public WebElement alertMessage;

	@FindBy(xpath = "//input[@id='input-name1']")
	public WebElement productNameEle;

	@FindBy(xpath = "//div[@class='note-editable panel-body']")
	public WebElement descriptionEle;

	@FindBy(xpath = "//input[@id='input-meta-title1']")
	public WebElement metaTagTitleEle;
	
	@FindBy(xpath = "//input[@id='input-tag1']")
	public WebElement productTagsEle;

	@FindBy(xpath = "//a[text()='Data']")
	public WebElement dataEle;

	@FindBy(xpath = "//input[@id='input-model']")
	public WebElement modelEle;
	
	@FindBy(xpath = "//a[text()='Image']")
	public WebElement imageEle;
	
	@FindBy(xpath = "//button[@data-original-title='Add Image']")
	public WebElement addImageEle;
	
	@FindBy(xpath = "//img[@src='https://localhost:443/opencart/image/cache/no_image-100x100.png']")
	public WebElement addImageEle1;
	
	@FindBy(xpath = "//button[@id='button-image']")
	public WebElement addImageEle2;
	
	@FindBy(xpath = "//button[@data-original-title='Upload']")
	public WebElement uploadImageEle;
	

	@FindBy(xpath = "//a[@data-original-title='Add New']")
	public WebElement addNewProductButton;

	@FindBy(xpath = "//button[@data-original-title='Save']")
	public WebElement productSaveButton;

	public void editFirstProduct(String newName) {
		productEditName.clear();
		productEditName.sendKeys(newName);
		saveButton.click();
	}

	public String getAlertMessage() {
		return alertMessage.getText().trim();
	}
    
	public void uploadProductImage() {
		imageEle.click();
		addImageEle.click();
		addImageEle1.click();
		addImageEle2.click();
		uploadImageEle.click();
		
		
	}

	public void addProduct(ProductDTO dto) {
		addNewProductButton.click();
		productNameEle.sendKeys(dto.getProductName());
		descriptionEle.sendKeys(dto.getDescription());
		metaTagTitleEle.sendKeys(dto.getMetaTagTitle());
		productTagsEle.sendKeys(dto.getProductTags());
		dataEle.click();
		modelEle.sendKeys(dto.getModel());
		productSaveButton.click();
	}
}

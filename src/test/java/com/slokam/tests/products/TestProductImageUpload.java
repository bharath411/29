package com.slokam.tests.products;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.slokam.common.By;
import com.slokam.common.utils.AutomationUtils;
import com.slokam.pages.common.AdminDashboardPage;
import com.slokam.pages.common.AdminLoginPage;
import com.slokam.pages.common.AdminProductsPage;
import com.slokam.tests.BaseTestCase;



public class TestProductImageUpload extends BaseTestCase {

	protected static final Logger logger = LogManager.getLogger(TestProductImageUpload.class);

	/**
	 * @step 1.Launch opencart admin url
	 * @step 2.Login
	 * @step 3.Click on Categories and product
	 * @step 4.Edit a product
	 * @step 5.Uploap image
	 * @step 6.Save
	 * @step 7.Verify the message.
	 * @author gowtham
	 */
	@Test
	public void verifyProductImageUploaded() {
		logger.info("1.Launch opencart admin url");
		m_driver.get(appProperties.getAdminUrl());
		String adminUser = appProperties.getAdminUser();
		String adminPass = appProperties.getAdminPass();
		AdminLoginPage adminLoginPage = PageFactory.initElements(m_driver, AdminLoginPage.class);
		// AdminLoginPage adminLoginPage
		// =CustomPageFactory.initElements(AdminLoginPage.class);
		adminLoginPage.login(adminUser, adminPass);
		
		AdminDashboardPage adminDashboardPage  = new AdminDashboardPage();
		PageFactory.initElements(m_driver, adminDashboardPage);
		
		adminDashboardPage.clickCatalog();
		adminDashboardPage.clickProducts();
		
		AdminProductsPage adminProductsPage = new AdminProductsPage();
		 PageFactory.initElements(m_driver, adminProductsPage);
		
		adminProductsPage.firstProductEditButton.click();
		adminProductsPage.uploadProductImage();
				
	}
	
	
}

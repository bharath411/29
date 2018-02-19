package com.slokam.tests.products;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.slokam.common.dto.ProductDTO;
import com.slokam.common.utils.AutomationUtils;
import com.slokam.pages.common.AdminDashboardPage;
import com.slokam.pages.common.AdminLoginPage;
import com.slokam.pages.common.AdminProductsPage;
import com.slokam.pages.common.ApplicationProductPage;
import com.slokam.tests.BaseTestCase;

public class TestProductValidation extends BaseTestCase{
	
	protected static final Logger logger = LogManager.getLogger(TestProductValidation.class);
	
	/**
	 * @step 1.Launch opencart admin url
	 * @step 2.Login
	 * @step 3.Click on Categories and product
	 * @step 4.Add a product (with quantity & Price)
	 * @step 5.Save
	 * @step 6.Launch opencart application url
	 * @step 7.search for the added product
	 * @step 8.Verify the Price.
	 * @author Gowtham 
	 */
	
	@Test
	public void verifyProcuctPriceinApp() {
		logger.info("Launch opencart admin url");
		m_driver.get(appProperties.getAdminUrl());
		String adminUser = appProperties.getAdminUser();
		String adminPass = appProperties.getAdminPass();
		AdminLoginPage adminLoginPage = PageFactory.initElements(m_driver, AdminLoginPage.class);
		logger.info("Login");
		adminLoginPage.login(adminUser, adminPass);
		
		AdminDashboardPage adminDashboardPage = new AdminDashboardPage();
		PageFactory.initElements(m_driver, adminDashboardPage);
		logger.info("3.Click on Categories and product");
		adminDashboardPage.clickCatalog();
		adminDashboardPage.clickProducts();
		
		AdminProductsPage adminProductsPage = new AdminProductsPage();
		PageFactory.initElements(m_driver, adminProductsPage);
		
		String productName = "Adidas_" + AutomationUtils.getInputString(5);
		 String description = "Description_"+ AutomationUtils.getInputString(10);
		 String metaTagTitle = "T_"+ AutomationUtils.getInputString(5);
		 String model = "M_"+ AutomationUtils.getInputString(5);
		 String price = ""+129.99;
		 
		 ProductDTO dto = new ProductDTO();
		 
		 dto.setProductName(productName);
		 dto.setDescription(description);
		 dto.setMetaTagTitle(metaTagTitle);
		 dto.setModel(model);
		 dto.setPrice(price);
		
		 logger.info("4.Add a product (with quantity & Price)");
		adminProductsPage.addProduct(dto);
		
		logger.info("6.Launch opencart application url");
		m_driver.navigate().to(appProperties.getAppUrl());
		ApplicationProductPage applicationProductPage = new ApplicationProductPage();
		PageFactory.initElements(m_driver, applicationProductPage);
		logger.info("7.search for the added product");
		applicationProductPage.searchProduct(productName);
		
		String actualPrice = applicationProductPage.getPrice();
		logger.debug("Actual Price : " + actualPrice);
		String expectedPrice = "129.99";
		Assert.assertTrue(actualPrice.contains(expectedPrice));
		

		
	}
	
	/**
	 * @step 1.Launch opencart admin url
	 * @step 2.Login
	 * @step 3.Click on Categories and product
	 * @step 4.Add a product (with quantity & Price)
	 * @step 5.Save
	 * @step 6.Launch opencart application url
	 * @step 7.search for the added product
	 * @step 8.Verify the Price.
	 * @author Gowtham 
	 */
	
	@Test
	public void verifyProcuctPriceinApp1() {
		logger.info("Launch opencart admin url");
		m_driver.get(appProperties.getAdminUrl());
		String adminUser = appProperties.getAdminUser();
		String adminPass = appProperties.getAdminPass();
		AdminLoginPage adminLoginPage = PageFactory.initElements(m_driver, AdminLoginPage.class);
		logger.info("Login");
		adminLoginPage.login(adminUser, adminPass);
		
		AdminDashboardPage adminDashboardPage = new AdminDashboardPage();
		PageFactory.initElements(m_driver, adminDashboardPage);
		logger.info("3.Click on Categories and product");
		adminDashboardPage.clickCatalog();
		adminDashboardPage.clickProducts();
		
		AdminProductsPage adminProductsPage = new AdminProductsPage();
		PageFactory.initElements(m_driver, adminProductsPage);
		
		String productName = "Adidas_" + AutomationUtils.getInputString(5);
		 String description = "Description_"+ AutomationUtils.getInputString(10);
		 String metaTagTitle = "T_"+ AutomationUtils.getInputString(5);
		 String model = "M_"+ AutomationUtils.getInputString(5);
		 String price = ""+129.99;
		 
		 ProductDTO dto = new ProductDTO();
		 
		 dto.setProductName(productName);
		 dto.setDescription(description);
		 dto.setMetaTagTitle(metaTagTitle);
		 dto.setModel(model);
		 dto.setPrice(price);
		
		 logger.info("4.Add a product (with quantity & Price)");
		adminProductsPage.addProduct(dto);
		
		logger.info("6.Launch opencart application url");
		m_driver.navigate().to(appProperties.getAppUrl());
		ApplicationProductPage applicationProductPage = new ApplicationProductPage();
		PageFactory.initElements(m_driver, applicationProductPage);
		logger.info("7.search for the added product");
		applicationProductPage.searchProduct(productName);
		
		String actualPrice = applicationProductPage.getPrice();
		logger.debug("Actual Price : " + actualPrice);
		String expectedPrice = "129.99";
		Assert.assertTrue(actualPrice.contains(expectedPrice));
		

		
	}
}

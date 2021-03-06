package com.slokam.tests.products;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.slokam.common.dto.ProductDTO;
import com.slokam.common.utils.AutomationUtils;
import com.slokam.common.utils.data.ExcelManager;
import com.slokam.pages.common.AdminDashboardPage;
import com.slokam.pages.common.AdminLoginPage;
import com.slokam.pages.common.AdminProductsPage;
import com.slokam.tests.BaseTestCase;

public class TestAddNewProduct  extends BaseTestCase {

	protected static final Logger logger = LogManager.getLogger(TestAddNewProduct.class);

	/**
	 * @step 1.Launch opencart admin url
	 * @step 2.Login
	 * @step 3.Click on Categories and product
	 * @step 4.Edit a product
	 * @step 5.Update the name
	 * @step 6.Save
	 * @step 7.Verify the message.
	 * @author bharath
	 */
	@Test
	public void verifyAddProductSuccess() {
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
		
		 String productName = "Product_" + AutomationUtils.getInputString(5);
		 String description = "Description_"+ AutomationUtils.getInputString(10);
		 String metaTagTitle = "T_"+ AutomationUtils.getInputString(5);
		 String model = "M_"+ AutomationUtils.getInputString(5);
		 
		 ProductDTO dto = new ProductDTO();
		 
		 dto.setProductName(productName);
		 dto.setDescription(description);
		 dto.setMetaTagTitle(metaTagTitle);
		 dto.setModel(model);
		 
		 adminProductsPage.addProduct(dto);
		String actualMessage =  adminProductsPage.getAlertMessage();
		logger.debug("Actual Message : " + actualMessage);
		String expectedMessage = "Success: You have modified products! ";
		Assert.assertTrue(actualMessage.contains(expectedMessage));
	}
	
	
	/**
	 * @step 1.Launch opencart admin url
	 * @step 2.Login
	 * @step 3.Click on Categories and product
	 * @step 4.Edit a product
	 * @step 5.Update the name
	 * @step 6.Save
	 * @step 7.Verify the message.
	 * @author bharath
	 */
	@Test
	public void verifyAddProductSuccess_Excel() {
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
		
		ExcelManager manager = new ExcelManager();
		ProductDTO dto = manager.getProductDTO(3);
		 		
		 adminProductsPage.addProduct(dto);
		String actualMessage =  adminProductsPage.getAlertMessage();
		logger.debug("Actual Message : " + actualMessage);
		String expectedMessage = "Success: You have modified products! ";
		Assert.assertTrue(actualMessage.contains(expectedMessage));
	}
}

package com.usbank.etm_abdd_omniui_page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.usbank.etm_abdd_omniui_utilities.BaseClass;
import com.usbank.etm_abdd_omniui_utilities.TestUtil;

public class CustomerSearchPage extends BaseClass {

	public CustomerSearchPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='btnCreate']")
	WebElement createNewCustomer;

	public String getPageTitle() {
		// driver.manage().timeouts().pageLoadTimeout(TestUtil.PATIENT_TIME,
		// TimeUnit.SECONDS);
		return driver.getTitle();
	}

	public void createCustomerclick() {
		// waitForElementToBeClickable(createNewCustomer,
		// TestUtil.PAGE_LOAD_TIMEOUT);
		waitforElementtobeclickable(createNewCustomer, TestUtil.PAGE_LOAD_WAIT);
		createNewCustomer.click();
		// return new CustomerCreationPage();
	}
}

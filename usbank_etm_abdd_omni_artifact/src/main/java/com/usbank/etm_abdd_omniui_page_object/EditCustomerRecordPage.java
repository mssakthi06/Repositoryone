package com.usbank.etm_abdd_omniui_page_object;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.usbank.etm_abdd_omniui_utilities.BaseClass;
import com.usbank.etm_abdd_omniui_utilities.TestUtil;


public class EditCustomerRecordPage extends BaseClass {

	public EditCustomerRecordPage() {
		
		PageFactory.initElements(driver, this);
		//driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	}

	@FindBy(how = How.XPATH, using ="//*//div[@class='padLeft10 wholeNameText']//span[contains(.,'')]")
	WebElement CustomerName;

public String verifyPageTitle() throws Exception{
	waitforElementtobevisible(CustomerName, TestUtil.PAGE_LOAD_WAIT);
	return driver.getTitle();
}

public boolean verifyProfileName(){
	
	return CustomerName.isDisplayed();
}

}

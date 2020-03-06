package com.usbank.etm_abdd_omniui_page_object;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.usbank.etm_abdd_omniui_utilities.BaseClass;
import com.usbank.etm_abdd_omniui_utilities.TestUtil;;

public class CreateCustomerProfile extends BaseClass {
	public CreateCustomerProfile(){
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='lastname']" )
	WebElement lastName;
	@FindBy(how = How.XPATH, using = "//select[@id='state']/option[contains(.,'OH')]" )
	WebElement stateSelect;
	@FindBy(how = How.XPATH, using = "//select[@id='state']" )
	WebElement statedropdown;
	@FindBy(how = How.XPATH, using = "//input[@id='zipcode']" )
	WebElement zipCode;
	@FindBy(how = How.ID, using = "Continue" )
	WebElement contBtton;
	@FindBy(how = How.XPATH, using ="//*[@class='padLeft20 padTop20 padBot20 padRight10 kyc-search-popup']//*[@class='model-primary'][@value ='OK']")
	WebElement modalkycsrchpopup;
	@FindBy(how = How.XPATH, using ="//*[@class='submit-primary on-continue']")
	WebElement contCrteNewRecd;
	@FindBy(how = How.XPATH, using = "//*[@class='kyc-search-title']//*[contains(.,'Create Customer Profile')]" )
	WebElement kycSearchTitle;

	public boolean displaySearchTitle(){
		waitforElementtobevisible(kycSearchTitle, TestUtil.PATIENT_TIME);
		return kycSearchTitle.isDisplayed();
	}

	public IndividualCreateCustomerProfile enterMandatoryfields(String lName,String zCode,String st){

		waitforElementtobevisible(statedropdown, TestUtil.PATIENT_TIME);
		lastName.sendKeys(lName);
		//stateSelect.click();
		//statedropdown.click();
		//driver.findElement(By.xpath("//select[@id='state']/option[contains(.,'"+st+"')]")).click();
		Select s = new Select(statedropdown);
		s.selectByVisibleText(st);
		zipCode.sendKeys(zCode);
		contBtton.click();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		try {
			//driver.switchTo().alert();
			modalkycsrchpopup.click();
			driver.manage().timeouts().implicitlyWait(TestUtil.SHORT_TIME, TimeUnit.SECONDS);
			contCrteNewRecd.click();
		} catch (NoAlertPresentException E) {
			log.debug("Couldn't find the alert:" +E.getMessage());
			contBtton.click();
		}
		
		/*lastName.sendKeys("Kungu");
		stateSelect.click();;
		zipCode.sendKeys("45202");
		contBtton.click();*/

		return new IndividualCreateCustomerProfile();
	}
}

package com.usbank.etm_abdd_omniui_page_object;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.usbank.etm_abdd_omniui_utilities.BaseClass;
import com.usbank.etm_abdd_omniui_utilities.TestUtil;

public class IndividualCreateCustomerProfile extends BaseClass{
	
	public IndividualCreateCustomerProfile(){
		PageFactory.initElements(driver, this);
	}
	//Officer and Branch Setup
	@FindBy(how = How.CSS, using = "#accordionHeaderr_kycsetup .expandIcon")
	WebElement kycsetupexpandicon;

	@FindBy(how = How.ID, using = "KSR_00")
	WebElement ofcCode;

	@FindBy(how = How.ID, using = "KSR_01")
	WebElement brnNum;
	// driver.findElement(By.id("KSR_00")).sendKeys("MDI04");

	@FindBy(how = How.XPATH, using = "//*[@id='KSR_03']/option[contains(.,'Community Banking and Branch Delivery')]")
	WebElement buslnAssign;
	// driver.findElement(By.id("KSR_01")).sendKeys("00002");
	
	//Customer Information
	@FindBy(how = How.CSS, using = "#accordionHeaderr_custinfo .expandIcon")
	WebElement custinfoexpandicon;
	//Name and DOB
	@FindBy(how = How.ID, using = "NAM_04")
	WebElement custinfofName;

	@FindBy(how = How.ID, using = "NAM_06")
	WebElement custinfolName;

	@FindBy(how = How.ID, using = "NAM_09")
	WebElement dob;
	//Physical Address
	@FindBy(how = How.XPATH, using = "//select[@id='ADD_01']/option[contains(.,'US - United')]")
	WebElement country;

	@FindBy(how = How.ID, using = "ADD_02")
	WebElement addr1;

	@FindBy(how = How.ID, using = "ADD_05")
	WebElement city;

	@FindBy(how = How.ID, using = "ADD_08")
	WebElement zpCode;

	@FindBy(how = How.ID, using = "ADD_06")
	WebElement custinfostate;
	//Mailing Address
	@FindBy(how = How.ID, using = "ADDO_01")
	WebElement mailAddrckbox;
	//Citizenship / Tax ID / Foreign ID
	@FindBy(how = How.ID, using = "TAX_000")
	WebElement usyesRdBttn;

	@FindBy(how = How.ID, using = "TAX_001")
	WebElement usnoRdBttn;

	@FindBy(how = How.ID, using = "TAX_01")
	WebElement ctryCtznship;

	@FindBy(how = How.ID, using = "TAX_020")
	WebElement taxIDavlable;

	@FindBy(how = How.XPATH, using = "//*[@id='TAX_03']/*[contains(.,'SSN')]")
	WebElement ssnID;

	@FindBy(how = How.ID, using = "TAX_05")
	WebElement ssnIDNbr;
	//CIP Notification & ID Verification
	@FindBy(how = How.XPATH, using = "//*[@id='accordionHeaderr_cip']")
	WebElement cipexpandicon;
	//CIP Notification
	@FindBy(how = How.ID, using = "CIPN_02")
	WebElement cipNotedt;
	
	@FindBy(how = How.XPATH, using = "//*[@id='CIPN_03']/*[2]")
	WebElement cipTyp;

	@FindBy(how = How.ID, using = "ID_000")
	WebElement idMthddoc;
	//Documentary Identification
	@FindBy(how = How.XPATH, using = "//div[@id='subsectionr_subdoc']")
	WebElement cipDocIDtab;

	@FindBy(how = How.XPATH, using = "//*[@id='PDI_00']/*[contains(.,'U.S. Pas')]")
	WebElement idTyp;

	@FindBy(how = How.ID, using = "PDI_02")
	WebElement issAgncy;

	@FindBy(how = How.ID, using = "PDI_06")
	WebElement issCntry;

	@FindBy(how = How.ID, using = "PDI_08")
	WebElement idNbr;

	@FindBy(how = How.ID, using = "PDI_09")
	WebElement issDte;

	@FindBy(how = How.ID, using = "PDI_10")
	WebElement expDte;
	//Customer Due Diligence
	@FindBy(how = How.XPATH, using = "//div[@id='accordionGroupr_cdd']//span[@class='expandIcon']")
	WebElement cddexpandicon;

	@FindBy(how = How.XPATH, using = "//*[@id='EM_00']/*[contains(.,'Homemaker')]")
	WebElement occptnSts;

	@FindBy(how = How.ID, using = "EM_04")
	WebElement annIncAmt;

	@FindBy(how = How.ID, using = "EM_05")
	WebElement curncyTyp;

	@FindBy(how = How.ID, using = "EM_070")
	WebElement srcofInc;

	//Wealth Customer (as defined by KYC policy)
	@FindBy(how = How.ID, using = "WM_001")
	WebElement hveDolrAstNo;

	@FindBy(how = How.ID, using = "WM_011")
	WebElement rltnshpMgrNo;
	
	@FindBy(how = How.ID, using = "WM_021")
	WebElement wlthcustno;
	//Activity
	@FindBy(how = How.XPATH, using = "//*[@id='accordionGroupr_activity']//span[@class='expandIcon']")
	WebElement actvtyexpandicon;

	@FindBy(how = How.ID, using = "CTZ_002")
	WebElement purpofAccMnthExp;

	@FindBy(how = How.ID, using = "CTZ_003")
	WebElement purpofAccsav;

	@FindBy(how = How.XPATH, using = "//*[@id='CTZ_02']/*[contains(.,'$1-$500')]")
	WebElement ancptMnthlyCsh;

	@FindBy(how = How.XPATH, using = "//*[@id='CTZ_03']/*[contains(.,'$15,001- $25,000')]")
	WebElement exptValCrsBdr;
	//Politically Exposed Person (PEP)
	@FindBy(how = How.XPATH, using = "//div[@id='accordionHeaderr_pep']//span[@class='expandIcon']")
	WebElement pepexpandicon;

	@FindBy(how = How.ID, using = "PEP_001")
	WebElement pepNo;

	@FindBy(how = How.XPATH, using = "//input[@class='cp-button--primary']")
	WebElement custSavebtn;


	public void kycSetup(String officerCode,String branchNumber ) {
		waitforElementtobeclickable(kycsetupexpandicon, TestUtil.PATIENT_TIME);
		kycsetupexpandicon.click();
		ofcCode.sendKeys(officerCode);
		brnNum.sendKeys(branchNumber);
		buslnAssign.click();
	}

	public void CustInformation(String firstName, String DOB, String address, String City,
			String SSN) {
		waitforElementtobeclickable(custinfoexpandicon, TestUtil.SHORT_TIME);
		custinfoexpandicon.click();
		custinfofName.sendKeys(firstName);
		//custinfolName.sendKeys(LastName);
		custinfolName.sendKeys(Keys.TAB);
		dob.sendKeys(DOB);
		addr1.sendKeys(address);
		city.sendKeys(City);
		zpCode.sendKeys(Keys.TAB);
		mailAddrckbox.click();
		usyesRdBttn.click();
		taxIDavlable.click();
		ssnID.click();
		ssnIDNbr.sendKeys(SSN);
	}

	public void cipNotification_IDVerification(String date, String idNumber) {
		waitforElementtobeclickable(cipexpandicon, TestUtil.SHORT_TIME);
		cipexpandicon.click();
		cipNotedt.sendKeys(date);
		cipTyp.click();
		idMthddoc.click();
		waitforElementtobevisible(cipDocIDtab, TestUtil.SHORT_TIME);
		cipDocIDtab.click();
		idTyp.click();
		idNbr.sendKeys(idNumber);
		issDte.sendKeys("01/01/2010");
		expDte.sendKeys("12/12/2020");

	}

	public void customerDueDiligence() {
		waitforElementtobeclickable(cddexpandicon, TestUtil.SHORT_TIME);
		cddexpandicon.click();
		occptnSts.click();
		annIncAmt.sendKeys("70,000");
		srcofInc.click();
		hveDolrAstNo.click();
		rltnshpMgrNo.click();
		wlthcustno.click();
	}

	public void activity() {
		waitforElementtobeclickable(actvtyexpandicon, TestUtil.SHORT_TIME);
		actvtyexpandicon.click();
		purpofAccMnthExp.click();
		purpofAccsav.click();
		ancptMnthlyCsh.click();
		exptValCrsBdr.click();
	}
	
	public void PEP() {
		waitforElementtobeclickable(pepexpandicon, TestUtil.SHORT_TIME);
		pepexpandicon.click();
		pepNo.click();
		custSavebtn.click();
	}

}

package com.usbank.etm_abdd_omniui_step_definitions;

import com.usbank.etm_abdd_omniui_page_object.EditCustomerRecordPage;
import com.usbank.etm_abdd_omniui_page_object.CreateCustomerProfile;
import com.usbank.etm_abdd_omniui_page_object.CustomerSearchPage;
import com.usbank.etm_abdd_omniui_page_object.IndividualCreateCustomerProfile;
import com.usbank.etm_abdd_omniui_utilities.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class IndividualCustomerCreation extends BaseClass {
	CreateCustomerProfile crtecustprofile;
	CustomerSearchPage custsrchpge;
	IndividualCreateCustomerProfile indcrtecustprofile;
	EditCustomerRecordPage editcustrecd;
	public IndividualCustomerCreation() {
		super();
	}

	@Given("^user should be on OMNI UAT UI page$")
	public void user_should_be_on_OMNI_UAT_UI_page() {
		
		initialization();
	}

	@Then("^Click on the Create Customer Button$")
	public void click_on_the_Create_Customer_Button() {
		
		custsrchpge = new CustomerSearchPage();
		custsrchpge.createCustomerclick();
	}

	@Then("^Provide mandatory fields \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"on the customer creation page$")
	public void provide_mandatory_fields_and_and_on_the_customer_creation_page(String arg1, String arg2, String arg3)
			 {
		crtecustprofile = new CreateCustomerProfile();
		crtecustprofile.enterMandatoryfields(arg1, arg2, arg3);
	}

	@Then("^Provide kycset mandatory fields \"([^\"]*)\" and \"([^\"]*)\"$")
	public void provide_kycset_mandatory_fields_and(String arg1, String arg2)  {
		
		indcrtecustprofile = new IndividualCreateCustomerProfile();
		indcrtecustprofile.kycSetup(arg1, arg2);
	}

	@Then("^Provide CustInformation mandatory fields \"([^\"]*)\" and \"([^\"]*)\" and Provide the following \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void provide_CustInformation_mandatory_fields_and_and_Provide_the_following_and_and(String arg1, String arg2,
			String arg3, String arg4, String arg5) {
		indcrtecustprofile = new IndividualCreateCustomerProfile();
		indcrtecustprofile.CustInformation(arg1, arg2, arg3, arg4, arg5);
		
	}

	@Then("^Provide cipNotification_IDVerification \"([^\"]*)\" and \"([^\"]*)\"$")
	public void provide_cipNotification_IDVerification_and(String arg1, String arg2) {
		indcrtecustprofile = new IndividualCreateCustomerProfile();
		indcrtecustprofile.cipNotification_IDVerification(arg1, arg2);
		
	}

	@Then("^Provide customerDueDiligence mandatory fields$")
	public void provide_customerDueDiligence_mandatory_fields() {
		// Write code here that turns the phrase above into concrete actions
		indcrtecustprofile = new IndividualCreateCustomerProfile();
		indcrtecustprofile.customerDueDiligence();
	}

	@Then("^Provide activity mandatory fields$")
	public void provide_activity_mandatory_fields() {
		// Write code here that turns the phrase above into concrete actions
		indcrtecustprofile = new IndividualCreateCustomerProfile();
		indcrtecustprofile.activity();
	}

	@Then("^Provide PEP mandatory fields and click Save button$")
	public void provide_PEP_mandatory_fields_and_click_Save_button() {
		// Write code here that turns the phrase above into concrete actions
		indcrtecustprofile = new IndividualCreateCustomerProfile();
		indcrtecustprofile.PEP();
	}

	@Then("^User will be getting the Customer Profile Page and verify the customer details$")
	public void user_will_be_getting_the_Customer_Profile_Page_and_verify_the_customer_details() {
		// Write code here that turns the phrase above into concrete actions
		editcustrecd = new EditCustomerRecordPage();
		String title = null;
		try {
			title = editcustrecd.verifyPageTitle();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.getTitle();
		Assert.assertEquals("Page Title Matched", "Edit Customer Record", title);
		Assert.assertTrue(editcustrecd.verifyProfileName());
	}

}

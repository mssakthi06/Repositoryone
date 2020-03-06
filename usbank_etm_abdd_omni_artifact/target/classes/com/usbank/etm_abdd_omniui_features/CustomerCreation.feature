Feature: OMNI Customer Creation 

Scenario Outline: Personal Customer Creation 
	Given user should be on OMNI UAT UI page 
	Then Click on the Create Customer Button 
	Then Provide mandatory fields "<LastName>" and "<zipcode>" and "<state>"on the customer creation page 
	Then Provide kycset mandatory fields "<officerCode>" and "<branchNumber>" 
	Then Provide CustInformation mandatory fields "<firstName>" and "<DOB>" and Provide the following "<address>" and "<city>" and "<SSN>" 
	Then Provide cipNotification_IDVerification "<date>" and "<idNumber>" 
	Then Provide customerDueDiligence mandatory fields 
	Then Provide activity mandatory fields 
	Then Provide PEP mandatory fields and click Save button
	Then User will be getting the Customer Profile Page and verify the customer details
	
	#Examples: 
	#|LastName|zipcode|state|
	#|kun|45202|MA - Massachusetts|
	
	Examples: 
	|LastName|zipcode|state|officerCode|branchNumber|firstName|DOB|address|city|SSN|date|idNumber|
	|AutomationOMNIFive|45202|OH - Ohio|MDI04|00002|OMNIUIAutoOne|11/10/1970|111 Garfield Pl|Cincinnati|234-23-4321|08/22/2019|UQ089984|
	
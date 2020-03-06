$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resource/com/usbank/etm_abdd_omniui_features/CustomerCreation.feature");
formatter.feature({
  "line": 1,
  "name": "OMNI Customer Creation",
  "description": "",
  "id": "omni-customer-creation",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Personal Customer Creation",
  "description": "",
  "id": "omni-customer-creation;personal-customer-creation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user should be on OMNI UAT UI page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click on the Create Customer Button",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Provide mandatory fields \"\u003cLastName\u003e\" and \"\u003czipcode\u003e\" and \"\u003cstate\u003e\"on the customer creation page",
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 7,
      "value": "#Then Provide kycset mandatory fields \"\u003cofficerCode\u003e\" and \"\u003cbranchNumber\u003e\""
    },
    {
      "line": 8,
      "value": "#Then Provide CustInformation mandatory fields \"\u003cfirstName\u003e\" and \"\u003cDOB\u003e\" and Provide the following \"\u003caddress\u003e\" and \"\u003ccity\u003e\" and \"\u003cSSN\u003e\""
    },
    {
      "line": 9,
      "value": "#Then Provide cipNotification_IDVerification \"\u003cdate\u003e\" and \"\u003cidNumber\u003e\""
    },
    {
      "line": 10,
      "value": "#Then Provide customerDueDiligence mandatory fields"
    },
    {
      "line": 11,
      "value": "#Then Provide activity mandatory fields"
    },
    {
      "line": 12,
      "value": "#Then Provide PEP mandatory fields and click Save button"
    },
    {
      "line": 13,
      "value": "#Then User will be getting the Customer Profile Page and verify the customer details"
    }
  ],
  "line": 15,
  "name": "",
  "description": "",
  "id": "omni-customer-creation;personal-customer-creation;",
  "rows": [
    {
      "cells": [
        "lastName",
        "zipcode",
        "state"
      ],
      "line": 16,
      "id": "omni-customer-creation;personal-customer-creation;;1"
    },
    {
      "cells": [
        "kun",
        "45202",
        "MA"
      ],
      "line": 17,
      "id": "omni-customer-creation;personal-customer-creation;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "Personal Customer Creation",
  "description": "",
  "id": "omni-customer-creation;personal-customer-creation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user should be on OMNI UAT UI page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click on the Create Customer Button",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Provide mandatory fields \"\u003cLastName\u003e\" and \"45202\" and \"MA\"on the customer creation page",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "IndividualCustomerCreation.user_should_be_on_OMNI_UAT_UI_page()"
});
formatter.result({
  "duration": 14359339287,
  "status": "passed"
});
formatter.match({
  "location": "IndividualCustomerCreation.click_on_the_Create_Customer_Button()"
});
formatter.result({
  "duration": 1098120482,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cLastName\u003e",
      "offset": 26
    },
    {
      "val": "45202",
      "offset": 43
    },
    {
      "val": "MA",
      "offset": 55
    }
  ],
  "location": "IndividualCustomerCreation.provide_mandatory_fields_and_and_on_the_customer_creation_page(String,String,String)"
});
formatter.result({
  "duration": 10904551630,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate element with text: MA\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027WN-OHA00SA4L897\u0027, ip: \u002710.139.66.23\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.selectByVisibleText(Select.java:147)\r\n\tat com.usbank.etm_abdd_omniui_page_object.CreateCustomerProfile.enterMandatoryfields(CreateCustomerProfile.java:45)\r\n\tat com.usbank.etm_abdd_omniui_step_definitions.IndividualCustomerCreation.provide_mandatory_fields_and_and_on_the_customer_creation_page(IndividualCustomerCreation.java:37)\r\n\tat ✽.Then Provide mandatory fields \"\u003cLastName\u003e\" and \"45202\" and \"MA\"on the customer creation page(src/main/resource/com/usbank/etm_abdd_omniui_features/CustomerCreation.feature:6)\r\n",
  "status": "failed"
});
});
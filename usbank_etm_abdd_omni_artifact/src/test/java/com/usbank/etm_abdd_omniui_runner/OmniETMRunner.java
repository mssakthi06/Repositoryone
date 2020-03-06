	package com.usbank.etm_abdd_omniui_runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resource/com/usbank/etm_abdd_omniui_features/CustomerCreation.feature", //the path of the feature files
		glue={"com/usbank/etm_abdd_omniui_step_definitions"}, //the path of the step definition files
		//plugin= {"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
		plugin ={"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, 
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false //to check the mapping is proper between feature file and step definition file
		//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"} //to run only particular set of scenarios, no need to run all the scenarios (like 100 scenarios) in each run			
		)

public class OmniETMRunner {
	@AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("output_report/report.xml"));
    
    }
}

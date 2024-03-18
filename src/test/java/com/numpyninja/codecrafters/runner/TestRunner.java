package com.numpyninja.codecrafters.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.DataProvider;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = {
		"com.numpyninja.codecrafters.steps", "com.numpyninja.codecrafters.hooks" }, plugin = { "pretty",
				"html:target/cucumber-reports/report.html", "json:target/cucumber-reports/report.json",
				"junit:target/cucumber-reports/report.xml","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, 
				monochrome = true, publish = true)

public class TestRunner extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
package com.numpyninja.codecrafters.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features", glue = {
		"com.numpyninja.codecrafters.steps", "com.numpyninja.codecrafters.hooks" }, plugin = { "pretty",
				"html:target/cucumber-reports/report.html", "json:target/cucumber-reports/report.json",
				"junit:target/cucumber-reports/report.xml" }, monochrome = true, publish = true)

public class TestRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
	}



	

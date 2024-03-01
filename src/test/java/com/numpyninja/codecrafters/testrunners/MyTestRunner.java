package com.numpyninja.codecrafters.testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Java\\DSALGO\\src\\test\\resources\\Features\\GetStarted.feature"},
		glue = {"com.numpyninja.codecrafters.steps","com.numpyninja.codecrafters.hooks"},
		plugin = {"json:target/cucumber.json"})

				
public class MyTestRunner {

}

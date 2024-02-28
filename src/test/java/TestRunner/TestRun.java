package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ritik\\DSALGO\\src\\test\\resources\\Features",
         glue={"stepDefinition","hooks"},
         dryRun=false,
         monochrome=true,
         plugin={"pretty","html:test-output"}
         		)


public class TestRun {

}



	

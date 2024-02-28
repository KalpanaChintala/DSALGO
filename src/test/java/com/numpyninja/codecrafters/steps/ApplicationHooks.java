package com.numpyninja.codecrafters.steps;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.numpyninja.codecrafters.factory.DriverFactory;
import com.numpyninja.codecrafters.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {

	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;

	@Before(order = 0)
	public void initProperty() { //getProperty() method called in the below method launchBrowser()
		//System.out.println("initProperty");
		configReader = new ConfigReader();
		prop = configReader.init_prop(); //init_prop() is the function call where method defined in ConfigReader class
	}

	@Before(order = 1)
	public void launchBrowser() {
		//System.out.println("launchBrowser");
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);//init_driver() method defined in DriverFactory class which takes the browser name read from the property file and return the corresponding driver of it
		
	}

	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			// take screenshot:
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);

		}
	}

}

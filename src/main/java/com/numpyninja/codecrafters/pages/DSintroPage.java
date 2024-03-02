package com.numpyninja.codecrafters.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;

public class DSintroPage {

	private static WebDriver driver;

	// 1.By Locators: OR

	private By timecomplexitylink = By.xpath("//a[text()='Time Complexity']");
	private By tryHereButton = By.xpath("//a[text()='Try here>>>']");

	// 2. Constructor of the page class:
	public DSintroPage(WebDriver driver) {
		DSintroPage.driver = driver;
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void clickOnTimeComplexityLink() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(timecomplexitylink).click();
	}

	public EditorPage navigateToEditorPage() {
		driver.findElement(tryHereButton).click();
		return new EditorPage(driver);

	}
}

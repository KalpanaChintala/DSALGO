package com.numpyninja.codecrafters.pages;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EditorPage {

	private WebDriver driver;

	private By runButton = By.xpath("//button[text()='Run']");

	private By tryEditorInput = By.xpath("//*[@class=' CodeMirror-line ']");
	private By tryEditorOutput = By.xpath("//pre[@id='output']");

	public EditorPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getPageTitle() {
		return driver.getTitle();

	}

	public void enterCodeToEditor(String code) {
		// driver.findElement(tryEditorInput).click();
		// driver.findElement(tryEditorInput).sendKeys(code);

		new Actions(driver).sendKeys(driver.findElement(tryEditorInput), code).build().perform();

	}

	public void clickOnRunButton() {

		driver.findElement(runButton).click();
	}

	public void verifyOutputInEditor() {

		String actualOutput = driver.findElement(tryEditorOutput).getText();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Editor output is  : " + actualOutput);
	}

}

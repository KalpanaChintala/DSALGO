package com.numpyninja.codecrafters.pages;

import java.io.IOException;
import java.util.Collections;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EditorPage {

	private WebDriver driver;

	private By runButton = By.xpath("//button[text()='Run']");

	private By tryEditorInput = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	private By tryEditorOutput = By.xpath("//pre[@id='output']");

	public EditorPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getPageTitle() {
		addDelay();
		return driver.getTitle();

	}

	public void enterCodeToEditor(String code) {
		addDelay();
		WebElement  tryEditorInputElement= driver.findElement(tryEditorInput);
		
		new Actions(driver)
        .keyDown(Keys.CONTROL)
        .sendKeys("a")
        .sendKeys(Keys.DELETE)
        .keyUp(Keys.CONTROL)
        .perform();

String[] lines = code.split("\n");
int indentationLevel = 0;

for (String line : lines) {
    if (line.trim().isEmpty()) {
        // Skip empty lines
        continue;
    }

    // Calculate the indentation level
    int leadingSpaces = line.length() - line.trim().length();
    int currentIndentationLevel = leadingSpaces / 2; // Assuming 2 spaces per indentation level

    // Adjust indentation level if necessary
    if (currentIndentationLevel > indentationLevel) {
        tryEditorInputElement.sendKeys(String.join("", Collections.nCopies(currentIndentationLevel - indentationLevel, "  ")));
        indentationLevel = currentIndentationLevel;
    } else if (currentIndentationLevel < indentationLevel) {
        tryEditorInputElement.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE);
        indentationLevel = currentIndentationLevel;
    }

    // Enter the line
    tryEditorInputElement.sendKeys(line.trim());
    tryEditorInputElement.sendKeys(Keys.RETURN);
}
	
	}
	public void clickOnRunButton() {
		driver.findElement(runButton).click();
	}

	public String verifyOutputInEditor() {
		
		String actualOutput = driver.findElement(tryEditorOutput).getText();
		return actualOutput;
	}

	private void addDelay() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

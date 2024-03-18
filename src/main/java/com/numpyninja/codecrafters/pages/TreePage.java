package com.numpyninja.codecrafters.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TreePage {

	private WebDriver driver;

	// 1. By Locators:
	private By overviewOfTreesLink = By.xpath("//*[@href='overview-of-trees']");
	private By terminologiesLink = By.xpath("//*[@href='terminologies']");
	private By typesOfTreesLink = By.xpath("//*[@href='types-of-trees'] ");
	private By treeTraversalsLink = By.xpath(" //*[@href='tree-traversals']");
	private By traversalsIllustrationLink = By.xpath("//*[@href='traversals-illustration'] ");
	private By binaryTreesLink = By.xpath("//*[@href='binary-trees']");
	private By typesOfBinaryTreesLink = By.xpath("//*[@href='types-of-binary-trees'] ");

	private By implementationInPythonLink = By.xpath("//a[@href='implementation-in-python']");
	private By binaryTreeTraversalsLink = By.xpath("//a[@href='binary-tree-traversals']");

	private By implementationOfBinaryTreesLink = By.xpath("//a[@href='implementation-of-binary-trees']");

	private By applicationsOfBinaryTreesLink = By.xpath("//a[@href='applications-of-binary-trees']");

	private By binarySearchTreesLink = By.xpath("//a[@href='binary-search-trees']");
	private By implementationOfBstLink = By.xpath("//a[@href='implementation-of-bst']");
	private By practiceQuestionLink = By.xpath("//a[@href='/tree/practice']");
	private By tryHereButton = By.xpath("//a[text()='Try here>>>']");

	// 2. Constructor of the page class:
	public TreePage(WebDriver driver) {
		this.driver = driver;
	}

	public String getPageTitle() {
		
		return driver.getTitle();
	}

	public void clickOnOverviewOfTreesLink() {
		
		driver.findElement(overviewOfTreesLink).click();
	}

	public void clickOnTerminologiesLink() {
		
		driver.findElement(terminologiesLink).click();
	}

	public void clickOnTypesOfTreesLink() {
		
		driver.findElement(typesOfTreesLink).click();
	}

	public EditorPage navigateToEditorPage() {
		
		driver.findElement(tryHereButton).click();
		 
		return new EditorPage(driver);
	}

	public void clickOnTreeTraversalsLink() {
		 
		driver.findElement(treeTraversalsLink).click();
	}

	public void clickOnTraversalsIllustrationLink() {
		 
		driver.findElement(traversalsIllustrationLink).click();
	}

	public void clickOnBinaryTreesLink() {
		 
		driver.findElement(binaryTreesLink).click();
	}

	public void clickOnTypesOfBinaryTreesLink() {
		 
		driver.findElement(typesOfBinaryTreesLink).click();
	}

	public void clickOnImplementationInPythonLink() {
		 
		driver.findElement(implementationInPythonLink).click();
	}

	public void clickOnBinaryTreeTraversalsLink() {
		 
		driver.findElement(binaryTreeTraversalsLink).click();
	}

	public void clickOnImplementationOfBinaryTreesLink() {
		 
		driver.findElement(implementationOfBinaryTreesLink).click();
	}

	public void clickOnApplicationOfBinaryTreesLink() {
		 
		driver.findElement(applicationsOfBinaryTreesLink).click();
	}

	public void clickOnBinarySearchTreesLink() {
		 
		driver.findElement(binarySearchTreesLink).click();
	}

	public void clickOnImplementaionOfBSTLink() {
		 
		driver.findElement(implementationOfBstLink).click();
	}
	
	

}

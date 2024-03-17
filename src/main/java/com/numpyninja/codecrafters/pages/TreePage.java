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
		addDelay() ;
		return driver.getTitle();
	}

	public void clickOnOverviewOfTreesLink() {
		addDelay() ;
		driver.findElement(overviewOfTreesLink).click();
	}

	public void clickOnTerminologiesLink() {
		addDelay() ;;
		driver.findElement(terminologiesLink).click();
	}

	public void clickOnTypesOfTreesLink() {
		addDelay() ;;
		driver.findElement(typesOfTreesLink).click();
	}

	public EditorPage navigateToEditorPage() {
		addDelay() ;
		driver.findElement(tryHereButton).click();
		 
		return new EditorPage(driver);
	}

	public void clickOnTreeTraversalsLink() {
		 addDelay() ;
		driver.findElement(treeTraversalsLink).click();
	}

	public void clickOnTraversalsIllustrationLink() {
		 addDelay() ;
		driver.findElement(traversalsIllustrationLink).click();
	}

	public void clickOnBinaryTreesLink() {
		 addDelay() ;
		driver.findElement(binaryTreesLink).click();
	}

	public void clickOnTypesOfBinaryTreesLink() {
		 addDelay() ;
		driver.findElement(typesOfBinaryTreesLink).click();
	}

	public void clickOnImplementationInPythonLink() {
		 addDelay() ;
		driver.findElement(implementationInPythonLink).click();
	}

	public void clickOnBinaryTreeTraversalsLink() {
		 addDelay() ;
		driver.findElement(binaryTreeTraversalsLink).click();
	}

	public void clickOnImplementationOfBinaryTreesLink() {
		 addDelay() ;
		driver.findElement(implementationOfBinaryTreesLink).click();
	}

	public void clickOnApplicationOfBinaryTreesLink() {
		 addDelay() ;
		driver.findElement(applicationsOfBinaryTreesLink).click();
	}

	public void clickOnBinarySearchTreesLink() {
		 addDelay() ;
		driver.findElement(binarySearchTreesLink).click();
	}

	public void clickOnImplementaionOfBSTLink() {
		 addDelay() ;
		driver.findElement(implementationOfBstLink).click();
	}
	
	private void addDelay() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

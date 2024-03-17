package com.numpyninja.codecrafters.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.numpyninja.codecrafters.util.ElementUtil;
public class HomePage {

	private WebDriver driver;

	// ElementUtil elementUtil = new ElementUtil(driver);

	// webelements for modules
	@FindBy(xpath = "//a[@href='data-structures-introduction']")
	WebElement getStartedDSIntroductionButton;
	@FindBy(xpath = "//a[@href='array']")
	WebElement getStartedArrayButton;
	@FindBy(xpath = "//a[@href='linked-list']")
	WebElement getStartedLinkedlistButton;
	@FindBy(xpath = "//a[@href='stack']")
	WebElement getStartedStackButton;
	@FindBy(xpath = "//a[@href='queue']")
	WebElement getStartedQueueButton;
	@FindBy(xpath = "//a[@href='tree']")
	WebElement getStartedTreeButton;
	@FindBy(xpath = "//a[@href='graph']")
	WebElement getStartedGraphButton;
	
	@FindBy(xpath="//*[text()=\"Data Structures\"]")
	private WebElement dataStructuredropdown;
	
	@FindBy(xpath="//*[text()=\"Arrays\"]")
	private WebElement Arraysoptions;
	
	@FindBy(xpath="//*[text()=\"Graph\"]")
	private WebElement Graphoptions;


// webelement for user not logged in alert msg
	@FindBy(xpath = "//div[@class='alert alert-primary']")
	WebElement alertmsg;

// webelements for dropdown
	@FindBy(xpath = "//a[text()='Data Structures']")
	WebElement dropdown_DS;
	@FindBy(xpath = "//a[text()='Arrays']")
	WebElement dropdown_array;
	@FindBy(xpath = "//a[text()='Linked List']")
	WebElement dropdown_linkedlist;
	@FindBy(xpath = "//a[text()='Stack']")
	WebElement dropdown_stack;
	@FindBy(xpath = "//a[text()='Queue']")
	WebElement dropdown_queue;
	@FindBy(xpath = "//a[text()='Tree']")
	WebElement dropdown_tree;
	@FindBy(xpath = "//a[text()='Graph']")
	WebElement dropdown_graph;

// Webelement for register and login links
	@FindBy(xpath = "//a[@href='/register']")
	WebElement register;
	@FindBy(xpath = "//a[@href='/login']")
	WebElement login;

// 2. Constructor of the page class:
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	String URL = "https://dsportalapp.herokuapp.com/";

	public StaticWebPage clickOnLinkedListButton() {
		addDelay();
		getStartedLinkedlistButton.click();
		return new StaticWebPage(driver);
	}

	public StaticWebPage clickOnStackButton() {
		addDelay();
		getStartedStackButton.click();
		return new StaticWebPage(driver);
	}

	public QueuePage navigateToQueuePage() {
		addDelay();
		getStartedQueueButton.click();
		addDelay();
		return new QueuePage(driver);
	}

	public TreePage navigateToTreePage() {
		addDelay();
		getStartedTreeButton.click();
		addDelay();
		return new TreePage(driver);
	}
	
	public ArrayPage navigateToArrayPage()
	{
		addDelay();
		dataStructuredropdown.click();
		addDelay();
		Arraysoptions.click();
		return new ArrayPage(driver);
	}
	
	public GraphPage navigateToGraphPage()
	{
		addDelay();
		dataStructuredropdown.click();
		addDelay();
		Graphoptions.click();
		return new GraphPage(driver);
	}

	public void getStartedForModules(String string) {
		switch (string) {
		case "Datastructures":
			addDelay();
			getStartedDSIntroductionButton.click();
			break;
		case "Arrays":
			addDelay();
			getStartedArrayButton.click();
			break;
		case "Linkedlist":
			addDelay();
			getStartedLinkedlistButton.click();
			break;
		case "Stack":
			addDelay();
			getStartedStackButton.click();
			break;
		case "Queue":
			addDelay();
			getStartedQueueButton.click();
			break;
		case "Tree":
			addDelay();
			getStartedTreeButton.click();
			break;
		case "Graph":
			addDelay();
			getStartedGraphButton.click();
			break;
		}
	}

	public String alertmsg() {
		// elementUtil.waitForElement(alertmsg);

		String msg = alertmsg.getText();
		System.out.println("Alert message is:" + msg);
		return msg;
	}

	// dropdown options
	public void clickOnDropdown(String string) {
		addDelay();
		dropdown_DS.click();
		
		switch (string) {

		case "Arrays":
			addDelay();
			dropdown_array.click();
			break;

		case "Linkedlist":
			addDelay();
			dropdown_linkedlist.click();

			break;

		case "Stack":
			addDelay();
			dropdown_stack.click();
			break;

		case "Queue":
			addDelay();
			dropdown_queue.click();
			break;

		case "Tree":
			addDelay();
			dropdown_tree.click();
			break;

		case "Graph":
			addDelay();
			dropdown_graph.click();
			break;
		}

	}

	public void click_register() {
		addDelay();
		register.click();
	}

	public String getPageTitle() {
		String title = driver.getTitle();
		return title;

	}

	public void clickOnSignIn() {
		addDelay();
		login.click();
	}

	public boolean displaySiginLink() {
		addDelay();
		return (login.isDisplayed());
	}

	public boolean displayRegisterLink() {
		addDelay();
		return (register.isDisplayed());

	}
	public DSintroPage navigateTodataintroductionPage() {
		addDelay();
		getStartedDSIntroductionButton.click();
		return new DSintroPage(driver);
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

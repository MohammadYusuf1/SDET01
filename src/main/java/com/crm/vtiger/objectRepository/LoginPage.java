package com.crm.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

//Step-1 : Create separate Java class for every web Page in Application
public class LoginPage {


	// Step-2: Provide a single argument constructor to initialize the current element
	public LoginPage(WebDriver driver)  
	{
		PageFactory.initElements(driver, this);
	}

	// Step-3: Identify all the web elements corresponding to that web page 
	@FindBys({@FindBy(name="user_name"), @FindBy(xpath="//input[@type='text']")})  //Rule-2: Go to every page in an app. & identify all elements using @findBy, @findBys & @findAll annotations & store them in specific java class in POM
	private WebElement usernameEdt;

	@FindBy(name="user_password")
	private WebElement passwordEdt;

	@FindBy(id="submitButton")
	private WebElement loginbtn;

	/**
	 * @return the usernameEdt
	 */
	// Provide the getters method to access the private web elements
	public WebElement getUsernameEdt() {  //Rule-3: As per POM, Declare all element as Private & provide public getters methods to give read access to test scripts.
		return usernameEdt;
	}

	/**
	 * @return the passwordEdt
	 */
	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	/**
	 * @return the loginbtn
	 */
	public WebElement getLoginbtn() {
		return loginbtn;
	}

	// Step-5: Provide a business logic to utilize these web elements
	public void login(String username, String password) throws InterruptedException // Rule-5: In all testscripts Utilize the element using getter(), Business method.
	{
		usernameEdt.sendKeys(username);
		passwordEdt.sendKeys(password);
		Thread.sleep(4000);
		loginbtn.click();
	}

}

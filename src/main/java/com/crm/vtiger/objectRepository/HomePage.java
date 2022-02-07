package com.crm.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.genericFileUtilities.WebDriverUtilities;

public class HomePage extends WebDriverUtilities {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[text()='User Name']/following::input[1]")
	private WebElement un;
	
	@FindBy(xpath = "//div[text()='User Name']/following::input[2]")
	private WebElement pwd;

	@FindBy(id = "submitButton")
	private WebElement loginbutton;

	@FindBy(xpath = "//span[@class=\"userName\"]/following::img[1]")
	private WebElement houver;

	@FindBy(xpath = "//a[text()=\"Sign Out\"]")
	private WebElement sout;
	
	public WebElement getLoginButton() {
		return loginbutton;
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUn() {
		return un;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getHouver() {
		return houver;
	}

	public WebElement getSout() {
		return sout;
	}

	public void login(String Un, String Pwd) {
		HomePage pg = new HomePage(driver);
		pg.getUn().sendKeys(Un);
		pg.pwd.sendKeys(Pwd);
		pg.loginbutton.click();
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

}

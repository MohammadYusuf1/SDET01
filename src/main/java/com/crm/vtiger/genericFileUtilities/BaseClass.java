package com.crm.vtiger.genericFileUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.crm.vtiger.objectRepository.LoginPage;

public class BaseClass {
	WebDriver driver;
	static WebDriver statDriver;
	DataBaseUtility dbLib = new DataBaseUtility();
	ExcelFileUtility exlLib = new ExcelFileUtility();
	JsonFileUtility jsonLib = new JsonFileUtility();
	PropertyFileUtility pLib = new PropertyFileUtility();
	JavaUtilities javaLib = new JavaUtilities();
	WebDriverUtilities wbLib = new WebDriverUtilities();

	@BeforeSuite
	public void configBS() throws Throwable
	{
		System.out.println("-------DB connection is established--------");
	}
	@BeforeClass
	public void configBC() throws Exception
	{
		System.out.println("------Browser is launched and maximized-----");
		driver = new ChromeDriver();
		wbLib.waitUntilPageLoads(driver);
		driver.manage().window().maximize();
		String url = jsonLib.readFromJsonFile("url");
		driver.get(url);
		statDriver = driver;
	}
	@BeforeMethod
	public void configBM() throws Exception
	{
		System.out.println("********** Sign In *************");
		LoginPage lp = new LoginPage(driver);
		String usn = jsonLib.readFromJsonFile("un");
		String pw = jsonLib.readFromJsonFile("pwd");
		//lp.login(usn, pw);
		/*
		try {


			//jsonLib.readFromJsonFile("browser");
			jsonLib.readFromJsonFile("un");
			jsonLib.readFromJsonFile("pwd");
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	}	
	@AfterMethod
	public void signOut() {
		System.out.println("*********** Sign Out ***************");
		/*
		 * HomePage hp = new HomePage(driver); hp.getHouver().click();
		 * hp.getSout().click();
		 */
	}
	@AfterClass
	public void configAC()
	{
		statDriver.close();
	}
	@AfterSuite
	public void configAS()
	{
		System.out.println("************ DB connection closed ************");
	}
}

package com.crm.vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.crm.vtiger.genericFileUtilities.BaseClass;
import com.crm.vtiger.genericFileUtilities.JsonFileUtility;
import com.crm.vtiger.genericFileUtilities.PropertyFileUtility;

public class LoginToVtigerTest extends BaseClass{
	@Test
	public void ReadLoginDetailsFromPropertyFile() throws Exception
	{
		PropertyFileUtility pf = new PropertyFileUtility();
		JsonFileUtility jUtil = new JsonFileUtility();
		WebDriver driver = null;
		String URL = jUtil.readFromJsonFile("url");
		System.out.println(URL);
		String brw = pf.readDataFromProperty("Browser");
		String un = pf.readDataFromProperty("Username");
		String pwd = pf.readDataFromProperty("Password");
		String url = pf.readDataFromProperty("Url");
		if (brw.equals("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(brw.equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys(un);
		driver.findElement(By.name("user_password")).sendKeys(pwd);
		WebElement login = driver.findElement(By.id("submitButton"));
		login.click();
		driver.close();
	}
}

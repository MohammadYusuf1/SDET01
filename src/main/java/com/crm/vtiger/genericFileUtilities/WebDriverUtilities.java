	package com.crm.vtiger.genericFileUtilities;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

/**
 * In this class all the webdriver utilities are present
 * @author Mohammad Yusuf
 *
 */
public class WebDriverUtilities {
	
	/**
	 * This method is used for implicitly wait
	 * @param driver
	 */
	public void waitUntilPageLoads(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void waitForElementVisibility(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
	}
	
	public String takeScreenshot(WebDriver driver, String screenshotName) throws Throwable {
    	TakesScreenshot ts = (TakesScreenshot)driver;
    	File src = ts.getScreenshotAs(OutputType.FILE);
    	String path = "./screenshot/"+screenshotName+".PNG";
    	File dest=new File(path);
    	Files.copy(src, dest);
    	return path;
    }
	
}

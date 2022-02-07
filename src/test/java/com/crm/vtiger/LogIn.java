package com.crm.vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LogIn {
WebDriver driver;
@Test
public void clickOrg() {
	driver.findElement(By.xpath("//a[text()=\"Organizations\"]"));
}
}

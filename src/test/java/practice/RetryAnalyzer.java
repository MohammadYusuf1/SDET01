package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzer {

	@Test (retryAnalyzer = com.crm.vtiger.genericFileUtilities.RetryAnalyzerImp.class)
	public void retryAnalyzerMethod()
	{
		System.out.println("Retry & Retry untill you get passed");
		Assert.assertTrue(false);
	}
}
package com.crm.vtiger.genericFileUtilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerImp implements IRetryAnalyzer {

	int count = 0;
	int retryCount = 3;
	
	public boolean retry(ITestResult result) 
	{
		while (count < retryCount)
		{
			count++;
			return true;
		}
		return false;
	}
}
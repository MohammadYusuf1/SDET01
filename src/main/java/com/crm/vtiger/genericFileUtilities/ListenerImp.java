package com.crm.vtiger.genericFileUtilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImp extends BaseClass implements ITestListener {

	ExtentReports reports;
	ExtentTest test;
	public void onTestStart(ITestResult result) {
		// Behaves like @Test method here we will get the name of the method
		test = reports.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		//write a log for passed method
		test.log(Status.PASS, result.getMethod().getMethodName()+ " is Passed");
	}


	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getMethod().getMethodName()+" is Failed");
		test.log(Status.FAIL, result.getThrowable());
		try {
			String path = wbLib.takeScreenshot(BaseClass.statDriver, result.getMethod().getMethodName()+javaLib.getSystemDate());
			test.addScreenCaptureFromPath(path);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}


	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getMethod().getMethodName()+" is Skipped");
		test.log(Status.SKIP, result.getThrowable());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		//This acts as BeforeSuite: Configuration steps for SparkReporter and extent reporter
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("./ExtentReport.html"+javaLib.getSystemDate());

		//Title of the page
		htmlReporter.config().setDocumentTitle("VTiger CRM Project");

		//Set report name
		htmlReporter.config().setReportName("Smoke Test Report");

		//Set a theme color
		htmlReporter.config().setTheme(Theme.DARK);

		//Create an object of extent reports to attach above configurations
		reports = new ExtentReports();

		//To attach the above spark configuration settings to the Extent report
		reports.attachReporter(htmlReporter);

		//write some system info
		reports.setSystemInfo("OS", "Windows");
		reports.setSystemInfo("Platform", "Windows 10");
		reports.setSystemInfo("Test URL", "https://qa.vtiger.crm.com");
		try 
		{
			reports.setSystemInfo("Browser", "Chrome");
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
	}

	public void onFinish(ITestContext context) {
		reports.flush();
	}

}

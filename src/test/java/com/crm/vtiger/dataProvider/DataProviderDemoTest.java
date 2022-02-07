package com.crm.vtiger.dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemoTest {
	@Test (dataProvider = "bookTicketDataProvider" , groups = {"RegressionTest"})
	public void ticketBooking(String src, String dest)
	{
		System.out.println("Ticket booking confirmed from "+src+" to "+dest);
		System.out.println("Have a safe journey");
	}
	@DataProvider Object[][] bookTicketDataProvider()
	{
		Object[][] objArr = new Object[5][2];
		objArr[0][0] = "Chennai";
		objArr[0][1] = "Bangalore";
		
		objArr[1][0] = "Chennai";
		objArr[1][1] = "Mysore";
		
		objArr[2][0] = "Chennai";
		objArr[2][1] = "Mumbai";
		
		objArr[3][0] = "Chennai";
		objArr[3][1] = "Pune";
		
		objArr[4][0] = "Chennai";
		objArr[4][1] = "Kerala";
		
		return objArr;
	}
}

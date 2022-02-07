package com.crm.vtiger.dataProvider;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateOrgTest {
	
	@Test (groups = {"SmokeTest","RegressionTest"})
	public void createOrg()
	{
		System.out.println("Navigate to create org");
		System.out.println("Create organization");
		//Assert.assertTrue(false);
		System.out.println("Verify the same with assertion");
	}
	
	@Test (groups = {"SmokeTest","RegressionTest"})
	public void createOrgWithIndustry()
	{
		System.out.println("Navigate to create org");
		System.out.println("Create organization with Industry");
		System.out.println("Verify the same with assertion");
	}
	
	@Test (groups = {"SmokeTest","RegressionTest"})
	public void createOrgWithRating()
	{
		System.out.println("Navigate to create org");
		System.out.println("Create organization with rating");
		System.out.println("Verify the same with assertion");
	}
	
}

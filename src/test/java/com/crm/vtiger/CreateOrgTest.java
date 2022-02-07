package com.crm.vtiger;

import org.testng.annotations.Test;

import com.crm.vtiger.genericFileUtilities.BaseClass;

public class CreateOrgTest extends BaseClass{
	
	@Test
	public void createOrg()
	{
		System.out.println("Navigate to create org");
		System.out.println("Create organization");
		System.out.println("Verify the same with assertion");
	}
	
	@Test
	public void createOrgWithIndustry()
	{
		System.out.println("Navigate to create org");
		System.out.println("Create organization with Industry");
		System.out.println("Verify the same with assertion");
	}
	
	@Test
	public void createOrgWithRating()
	{
		System.out.println("Navigate to create org");
		System.out.println("Create organization with rating");
		System.out.println("Verify the same with assertion");
	}
	
}

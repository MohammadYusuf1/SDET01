package com.crm.vtiger.genericFileUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DBUtility {
	
	Connection con=null;
	public void connectToDataBase() throws SQLException
	{
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		con = DriverManager.getConnection(IPathConstants.JDBCurl, IPathConstants.DBun, IPathConstants.DBpwd);
	}
	
	public String executeQueryToFetchData(String query, int clmIndex, String expData) throws SQLException
	{
		boolean flag = false;
		ResultSet result = con.createStatement().executeQuery(query);
		while (result.next())
		{
			String actualData = result.getString(clmIndex);
			if (actualData.equalsIgnoreCase(expData))
			{
				flag = true;
				break;
			}
		}
		if (flag==true)
		{
			System.out.println("Data is successfully verified in the database or Valid user");
			return expData;
		}
		else
		{
			System.out.println("Data is not verifed in the database or Not a valid user");
			return expData;
		}
	}
	
	public void closeDbConnection() throws SQLException
	{
		con.close();
	}
}

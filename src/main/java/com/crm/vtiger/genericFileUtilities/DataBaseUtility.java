package com.crm.vtiger.genericFileUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.jdbc.Driver;
/**
 * This is DataBase utility class
 * @author Mohammad Yusuf
 *
 */
public class DataBaseUtility {
	ResultSet result = null;
	Connection conn = null;
	/**
	 * This method is used to connect to the Database
	 * @throws Throwable
	 */
	public void connectToDB() throws Throwable
	{
		Driver driverRef = new Driver();
		
		DriverManager.registerDriver(driverRef);
		conn =DriverManager.getConnection(IPathConstants.JDBCurl, IPathConstants.DBun, IPathConstants.DBpwd);
		
	}
	
	/**
	 * This method is used to close the Database connection
	 * @throws Throwable
	 */
	public void closeDB() throws Throwable
	{
		conn.close();
	}
	/**
	 * This method is to execute the query and return the result
	 * @param query
	 * @param columnIndex
	 * @param expData
	 * @return result
	 * @throws Throwable
	 */
	public String executeQueryandGetData(String query, int columnIndex, String expData) throws Throwable
	{
		boolean flag = false;
		result=conn.createStatement().executeQuery(query);
		while(result.next())
		{
			String data = result.getString(columnIndex);
			if(data.equalsIgnoreCase(expData))
			{
				flag=true;
				break;
				
			}
		}
		
		if(flag)
		{
			System.out.println(expData +"the data is verified");
			return expData;
		}
		else
		{
			System.out.println(expData +"the data is not verified");
			return expData;
		}
		
	}

}
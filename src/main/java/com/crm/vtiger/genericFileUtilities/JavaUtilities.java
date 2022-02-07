package com.crm.vtiger.genericFileUtilities;

import java.util.Date;
import java.util.Random;

/**
 * This class is to used for java utilities
 * @author Mohammad Yusuf
 *
 */
public class JavaUtilities {
	
	/**
	 * This method will generate a random number and return it
	 * @return random number
	 */
	public int getRandomNumber()
	{
		Random rdm = new Random();
		
		int Rnum = rdm.nextInt(1000);
		return Rnum;
	}
	
	/**
	 * This method will return the system date
	 * @return system date
	 */
	public String getSystemDate()
	{
		Date date = new Date();
		String systemDate = date.toString().replace(" ", "_").replace(":", "_");
		return systemDate;
	}
	
}

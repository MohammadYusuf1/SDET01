package com.crm.vtiger.genericFileUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * This class is to 
 * @author Mohammad Yusuf
 *
 */
public class PropertyFileUtility {
	public String readDataFromProperty(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(IPathConstants.PropertyPath);
		Properties pFile = new Properties();
		pFile.load(fis);
		String value = pFile.getProperty(key);
		return value;
	}
}

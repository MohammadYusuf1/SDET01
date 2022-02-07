package com.crm.vtiger.genericFileUtilities;

import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
/**
 * This class is used for Json file utility
 * @author Mohammad Yusuf
 *
 */
public class JsonFileUtility {
/**
 * This method will read the value for the key and return the same
 * @param key
 * @return value
 * @throws Exception
 */
	public String readFromJsonFile(String key) throws Exception 
	{
		FileReader fr = new FileReader(IPathConstants.JsonPath);
		JSONParser jp = new JSONParser();
		Object jObj = jp.parse(fr);
		HashMap map = (HashMap) jObj;
		String value = map.get(key).toString();
		return value;
	}

}

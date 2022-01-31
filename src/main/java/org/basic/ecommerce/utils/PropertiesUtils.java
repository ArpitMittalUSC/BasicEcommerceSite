package org.basic.ecommerce.utils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtils {
	public static final String FILEPATH = "/config.properties";

	public static String readPropertiesFromFile(String property) {
		Properties config = new Properties();
		BufferedInputStream is = null;
		String value = "";
		try {
			is = (BufferedInputStream) PropertiesUtils.class.getResourceAsStream(FILEPATH);
			config.load(is);
			value = config.getProperty(property);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return value;
	}
}

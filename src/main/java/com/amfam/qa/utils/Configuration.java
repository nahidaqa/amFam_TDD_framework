package com.amfam.qa.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {

	private static Properties properties;
	private static String defaultPath = "configuration/config.properties";

	public Configuration(String path) { // Parameterized constructor, will pass the path
		if (path == null || path.length() < 11) {
			loadProperty(defaultPath);
		} else {
			loadProperty(path);
		}

	}

	private void loadProperty(String path) {
		// TODO Auto-generated method stub
		properties = new Properties();
		try {
			InputStream inputStream = new FileInputStream(path);
			properties.load(inputStream);
			// inputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getConfiguration(String key) {
		if (key != null) {
			return properties.getProperty(key);
		} else {
			return null;
		}

	}

}

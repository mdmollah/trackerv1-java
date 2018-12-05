package com.swift.gpi.trackerv1.helper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Properties;

public class UtilHelper {

	Properties properties;
	public HashMap<String, String> mymap;

	private static UtilHelper single_instance = null;

	private UtilHelper() {

	}

	public static UtilHelper getInstance() {
		if (single_instance == null) {
			single_instance = new UtilHelper();
			single_instance.loadProperties();
		}
		return single_instance;
	}

	public void loadProperties() {
		String filename = "UtilHelper.properties";
		InputStream st = this.getClass().getResourceAsStream("/" + filename);
		properties = new Properties();
		try {
			properties.load(st);
		} catch (IOException e) {
			System.out.println("error 2");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mymap = new HashMap<String, String>();
		for (String key : properties.stringPropertyNames()) {
			String value = properties.getProperty(key);
			mymap.put(key, value);
			// System.out.println(key + " " + value);
		}
	}

}
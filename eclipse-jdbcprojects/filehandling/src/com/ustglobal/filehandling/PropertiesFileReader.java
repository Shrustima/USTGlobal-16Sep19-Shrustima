package com.ustglobal.filehandling;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesFileReader {
	public static void main(String[] args) {
		
		String path = "text.properties";
		FileReader reader = null;
		
		try {
			
			reader = new FileReader(path);
			Properties prop =  new Properties();
			prop.load(reader);
			
			String url = prop.getProperty("url");
			String user = prop.getProperty("user");
			String password = prop.getProperty("password");
			
			System.out.println("url :"+url);
			System.out.println("user : "+user);
			System.out.println("password : "+password);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

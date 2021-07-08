package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseConfig {
public static String getConfigValue(String value){
	File file=new File("./Config.properties");
	FileInputStream fis = null;
	try {
		fis = new FileInputStream(file);
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	Properties pro= new Properties();
	try {
		pro.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println(pro.getProperty(value));
	return pro.getProperty(value);
}
//public static void main(String[] args) {
//	BaseConfig .getConfigValue("URL");
	
//}
}

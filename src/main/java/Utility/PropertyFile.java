package Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile {
	public static String readPropertyFile(String value) throws Exception {
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("F:\\eclipse-workspace\\Java\\PD\\TestData\\config.properties");
		prop.load(file);
		return prop.getProperty(value);
	}
}

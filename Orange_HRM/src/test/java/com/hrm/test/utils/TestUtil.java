package com.hrm.test.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestUtil {

	public Properties getData() throws IOException {
		Properties prop=null;
		try {
			
			FileInputStream fis = new FileInputStream("src/test/resources/comfig.properties");
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
	}
}

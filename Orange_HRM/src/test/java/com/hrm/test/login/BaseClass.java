package com.hrm.test.login;

import java.io.IOException;
import java.util.Properties;

import javax.management.MXBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.hrm.test.utils.TestUtil;

public class BaseClass {
	
	WebDriver driver;
	TestUtil test = new TestUtil();
	Properties prop = null;
	
	@BeforeSuite
	public void setUp() throws IOException {
		System.setProperty("webdriver.chrome.driver", "G:/Java + Selenium (Tanaji)/softwares/drivers/chromedriver_v.91.exe");
		prop = test.getData();
		driver = new ChromeDriver();
		driver.get(prop.getProperty("siteURL"));
		driver.manage().window().maximize();
	}
	
	@AfterSuite
	public void tearDown() {
		driver.close();
	}
}

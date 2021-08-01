package com.hrm.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

class LoginTest extends BaseClass {

	WebElement email;
	WebElement password;
	WebElement signin;
	
	@BeforeMethod
	public void getXpath() {
		email = driver.findElement(By.id("txtUsername"));
		password = driver.findElement(By.id("txtPassword"));
		signin = driver.findElement(By.id("btnLogin"));
	}
	
	@Test
	public void login() {
		email.sendKeys("admin");
		password.sendKeys("admin123");
		signin.click();	
	}
	
	@Test
	
	
	@AfterMethod
	public void doLogout() {
		
		System.out.println("Login Successfully..");
	}
	
	
}

package com.ass_TestNG;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo 
{
	WebDriver driver=null;
	@BeforeTest
	public void beforeTest() throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win32\\chromedriver.exe");
	      driver=new ChromeDriver();
 	      driver.get("https://www.facebook.com/");
 	      Thread.sleep(2000);    
	}
	@Test
	@Parameters({"username","password"})
	public void logintest(String username,String password) throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(1000);
		
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(1000);
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		
				driver.close();
		    
	         }
	
  }


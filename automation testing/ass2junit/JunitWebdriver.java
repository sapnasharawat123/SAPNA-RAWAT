package com.ass2junit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
	    
		
		public class JunitWebdriver
		{
		  WebDriver driver=null;
		  @BeforeMethod
		  public void beforeLogin() throws InterruptedException
		  {
			  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win32\\chromedriver.exe");
		      driver=new ChromeDriver();
			  driver.get("https://www.facebook.com/");
			  Thread.sleep(2000);
		  }
		  
		    @Test
			public void loginTest() throws InterruptedException
			{
				driver.findElement(By.id("email")).sendKeys("sapnarawat@gmail.com");
				Thread.sleep(1000);
				driver.findElement(By.id("pass")).sendKeys("sapna1999");
				Thread.sleep(1000);
				driver.findElement(By.name("login")).click();
				Thread.sleep(2000);
				
		       driver.close();
		    }
	}



package com.ass2junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Junit_GmailLogin 
{
	 WebDriver driver=null;
	  @BeforeMethod
	  public void beforeLogin() throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win32\\chromedriver.exe");
	      driver=new ChromeDriver();
		  driver.get("https://www.google.com/");
		  Thread.sleep(5000);
	  }
	  
	    @Test
		public void loginTest() throws InterruptedException
		{
	    	
	    	driver.findElement(By.linkText("Gmail")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.linkText("Sign in")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.id("identifierId")).sendKeys("sapnarawat@gmail.com");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			Thread.sleep(2000);
			
			
	        driver.close();
	    }

}



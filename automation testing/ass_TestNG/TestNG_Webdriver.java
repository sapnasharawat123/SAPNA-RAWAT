package com.ass_TestNG;

    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
    import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class TestNG_Webdriver 
	{
	    WebDriver driver=null;
	    @BeforeTest
	    public void beforeTest() throws InterruptedException
	    {
	      System.setProperty("webdriver.chrome.driver","D:\\Selenium10am\\chromedriver-win32\\chromedriver.exe");
	  	  driver=new ChromeDriver();
	  	  driver.get("https://www.facebook.com/");
	  	  Thread.sleep(2000);
	    }
		@Test (priority=0)
	    public void checkUsername() throws InterruptedException
	    {
			driver.findElement(By.id("email")).sendKeys("sapnasharawat@gmail.com");
			Thread.sleep(1000);
	    }
		@Test (priority=1)
	    public void checkPassword() throws InterruptedException
	    {
			driver.findElement(By.id("pass")).sendKeys("sapna1999");
			Thread.sleep(1000);
	    }
		@Test (priority=2)
	    public void checkLogin() throws InterruptedException
	    {
			driver.findElement(By.name("login")).click();
			Thread.sleep(2000);
			
				driver.close();
		    }
	    }

	
	



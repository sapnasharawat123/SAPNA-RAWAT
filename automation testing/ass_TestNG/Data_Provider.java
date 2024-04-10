package com.ass_TestNG;


	import static org.testng.Assert.fail;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class Data_Provider
	{
		WebDriver driver=null;
	    @DataProvider(name="Rahul Sharma")
		public Object[][] input()
		{
			return new Object[][] {{"standard_user","secret_sauce"},{"problem_user","secret_sauce"},{"performance_glitch_user","secret_sauce"}};
			
		}
		@Test(dataProvider="Rahul Sharma")
		public void beforeTest(String username,String password) throws InterruptedException
		{

			  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win32\\chromedriver.exe");
		      driver=new ChromeDriver();
		  	  driver.get("https://www.saucedemo.com/");
		  	  Thread.sleep(2000);
		  	
			
				driver.findElement(By.id("user-name")).sendKeys(username);
				Thread.sleep(1000);
				
				driver.findElement(By.id("password")).sendKeys(password);
				Thread.sleep(1000);
				
				driver.findElement(By.id("login-button")).click();
				Thread.sleep(2000);
				if(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html"))
				{
					System.out.println("Your Login Test Has Been Passed...");
				}
				else
				{
					fail("Invalid Username or Password.....");
				}
			
					
				driver.findElement(By.id("react-burger-menu-btn")).click();
						Thread.sleep(2000);
						driver.findElement(By.id("logout_sidebar_link")).click();
						Thread.sleep(3000);
						driver.close();
						
						
				    
		     }
		

  }
	

	
	

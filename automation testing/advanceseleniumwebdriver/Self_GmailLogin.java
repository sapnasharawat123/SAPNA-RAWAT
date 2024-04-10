package advanceseleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Self_GmailLogin
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
	    Thread.sleep(3000);
	
	
    	
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



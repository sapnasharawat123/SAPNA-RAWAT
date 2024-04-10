package advanceseleniumwebdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_PopUps
{
	public static void main(String[] args) throws InterruptedException
	   {
		   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();//to open blank browser
		   driver.get("https://demo.guru99.com/test/delete_customer.php");
		   Thread.sleep(3000);
		   
		   
	     	      	
	        driver.findElement(By.name("cusid")).sendKeys("123");
	        Thread.sleep(1000);
	        driver.findElement(By.name("submit")).submit();	
	        Thread.sleep(1000);
	        		
	            
	        Alert alert = driver.switchTo().alert();		
	        String alertMessage= driver.switchTo().alert().getText();		
	        System.out.println(alertMessage);	
	        Thread.sleep(5000);
	        alert.accept();		
	    }	

	}
			
	
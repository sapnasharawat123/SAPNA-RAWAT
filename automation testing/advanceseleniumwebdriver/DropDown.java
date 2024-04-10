package advanceseleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {

	public static void main(String[] args) throws InterruptedException
	   {
		   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();//to open blank browser
		   driver.get("https://demo.guru99.com/test/newtours/register.php");
		   Thread.sleep(3000);
		   
		   Select s1=new Select(driver.findElement(By.name("country")));
		   s1.selectByIndex(1);
		   Thread.sleep(2000);	  
		   s1.selectByValue("ARGENTINA");
		   Thread.sleep(2000);
		   s1.selectByVisibleText("INDIA");
		
		   for(int i=0; i<=50; i++)
		   
		   {
			   s1.selectByIndex(i);
			   Thread.sleep(50);
		 }
		   driver.close();
	}

}

	
	
      



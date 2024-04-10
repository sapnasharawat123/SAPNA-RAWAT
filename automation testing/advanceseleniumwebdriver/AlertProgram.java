package advanceseleniumwebdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertProgram 
{
	public static void main(String[] args) throws InterruptedException
	   {
		   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();//to open blank browser
		   driver.get("https://demo.guru99.com/test/delete_customer.php");
		   Thread.sleep(3000);
		   
		   driver.findElement(By.name("cusid")).sendKeys("123");
		   Thread.sleep(1000);
		   driver.findElement(By.className("submit")).click();
		   Thread.sleep(2000);
		   
		   Alert a1=driver.switchTo().alert();
		   a1.dismiss();
		   a1.accept();
		   Thread.sleep(2000);
		   
		   Alert a2=driver.switchTo().alert();
		   a2.accept();
		   Thread.sleep(2000);
		   driver.close();
		   
	   }


	
}



package advanceseleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_ItemsDropDown 
{
	public static void main(String[] args) throws InterruptedException
	   {
		   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();//to open blank browser
		   driver.get("https://output.jsbin.com/osebed/2");
		   Thread.sleep(3000);
		   
		   Select s1=new Select(driver.findElement(By.id("fruits")));
		   s1.selectByIndex(0);
		   Thread.sleep(1000);
		   s1.selectByValue("banana");
		   Thread.sleep(1000);
		   s1.selectByValue("orange");
		   Thread.sleep(1000);
		   s1.selectByVisibleText("Grape");
		   
		   Thread.sleep(2000);
		   
		   Select s2=new Select(driver.findElement(By.id("fruits")));
		   s2.selectByIndex(0);
		   Thread.sleep(1000);
		   s2.deselectByValue("banana");
		   Thread.sleep(1000);
		   s2.deselectByValue("orange");
		   Thread.sleep(1000);
		   s2.deselectByVisibleText("Grape");
		   Thread.sleep(2000);
		   driver.close();
	  }

}



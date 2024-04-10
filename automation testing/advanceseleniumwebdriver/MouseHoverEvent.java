package advanceseleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.webdriver.Action;

public class MouseHoverEvent 
{
	public static void main(String[] args) throws InterruptedException
	   {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/newtours/support.php");
		 Thread.sleep(1000);
		   
		   WebElement home=driver.findElement(By.linkText("Home"));
		   WebElement hotels=driver.findElement(By.linkText("Hotels"));
		   WebElement flights=driver.findElement(By.linkText("Flights"));
		   
		   Actions actions=new Actions(driver);
		   Action a1=(Action) actions.moveToElement(home).build();
		   a1.perform();
		   Thread.sleep(2000);
		   Action a2=(Action) actions.moveToElement(hotels).build();
		   a2.perform();
		   Thread.sleep(2000);
		   Action a3=(Action) actions.moveToElement(flights).build();
		   a3.perform();
		   Thread.sleep(2000);
		   driver.close();
       }
}



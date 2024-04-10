package advanceseleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.webdriver.Action;

public class KeyboardEvent 
{
	public static void main(String[] args) throws InterruptedException
	   {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(1000);
		 WebElement email=driver.findElement(By.id("email"));
		   Actions actions=new Actions(driver);
		   Action a1=(Action) actions.moveToElement(email)
				   .click()
				   .keyDown(email,Keys.SHIFT)
				   .sendKeys(email,"SapnaRawat")
				   .keyUp(email,Keys.SHIFT)
				   .doubleClick()
				   .contextClick()
				   .build();
		   a1.perform();
		}
}
	
	



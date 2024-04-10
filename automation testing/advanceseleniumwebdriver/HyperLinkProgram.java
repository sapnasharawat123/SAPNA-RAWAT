package advanceseleniumwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinkProgram 
{
	public static void main(String[] args) throws InterruptedException
	  {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:https://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(3000);
		
		String Thname=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th[1]")).getText();
		  System.out.println("Th name is"+Thname);
		  
		  List<WebElement> Th=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		  System.out.println("Total th is.."+ Th.size());
		  
		  List<WebElement> Tr=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th[1]"));
		  System.out.println("Total TR is.."+Tr.size());
		  
		  for(int i=1;i<=Tr.size();i++)
		  {
			  for(int j=1;j<=Th.size();j++)
			  {
				  String value=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				  System.out.println(value+"    ");
				  Thread.sleep(250);
			  }
			  System.out.println();
			 }
	         Thread.sleep(250);
	         driver.close();
	   }
}

	




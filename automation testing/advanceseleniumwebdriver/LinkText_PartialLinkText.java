package advanceseleniumwebdriver;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class LinkText_PartialLinkText 
	 {
		public static void main(String[] args) throws InterruptedException 
		{
			
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:\\Users\\LENOVO\\eclipse-workspace\\Selenium10am\\src\\com\\html\\index.html");
		Thread.sleep(3000);
		
		
	   
	    driver.findElement(By.partialLinkText("Here")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/a[2]")).click();
		Thread.sleep(2000);
		 driver.findElement(By.linkText("Forgotten password?")).click();
		 Thread.sleep(2000);
		
		driver.close();
		
		}
	 }

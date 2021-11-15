package TestNGTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test004 {
public WebDriver driver;
	
	@Test 
	public void Test2() throws InterruptedException
	{
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//input[@type='submit'])[4]")).click();		
		Thread.sleep(4000);	
	}
	@BeforeTest
	public void setUP1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00004725\\Downloads\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@AfterTest
	public void tearDown1()
	{
		driver.close();
	}
	

}

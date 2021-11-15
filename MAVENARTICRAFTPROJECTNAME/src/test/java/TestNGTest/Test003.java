package TestNGTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test003 {
public WebDriver driver;
	
	@Test
	public void Test1() throws InterruptedException
	{
		driver.get("https://www.amazon.in");
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Mobiles")).click();
		Thread.sleep(4000);
	
	}
@BeforeTest
public void setUP()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\00004725\\Downloads\\chromedriver\\chromedriver.exe");
    driver=new ChromeDriver();
    
}

@AfterTest
public void tearDown()
{
	driver.close();
}


}


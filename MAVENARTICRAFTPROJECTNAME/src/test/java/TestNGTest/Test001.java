package TestNGTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test001 {
	
public WebDriver driver;
	
	@Test
	public void Test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00004725\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Mobiles")).click();
		Thread.sleep(4000);
		driver.close();
	
	}



}

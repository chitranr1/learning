package TestNGTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test002 {
	@Test
	public void Test1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00004725\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String Vtitle=driver.getTitle();
		System.out.println("My title is"+Vtitle);
		driver.close();
		
	}



}

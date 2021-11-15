package Maventest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MAV02 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004725\\driver\\chromedriver.exe");
			//initialize the webdriver with the appropriate browser
			WebDriver driver= new ChromeDriver();
		    // to launch amazon .com
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		driver.switchTo().alert().sendKeys("Aris");
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		driver.close();


	}

}

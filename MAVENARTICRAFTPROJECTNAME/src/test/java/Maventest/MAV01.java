package Maventest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MAV01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004725\\driver\\chromedriver.exe");
		//initialize the webdriver with the appropriate browser
		WebDriver driver= new ChromeDriver();
	    // to launch amazon .com
		driver.get("https://www.amazon.com");
		//to get title
		String titleamaxon=driver.getTitle();//put it in string to print
		//to print the title
		System.out.println("amazon title is: " +titleamaxon);
		//to close the bowser
		driver.close();
		

	}

}

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SEL2 {

	public static void main(String[] args) {
		//browser setup
		//1.Install browser driver
		Scanner obj1= new Scanner(System.in);//create a scanner object,to take user input
		System.out.println("Enter browser");
		String browser = obj1.nextLine();//Read user input
		System.out.println("Entered name is : " +browser);
		if(browser.equalsIgnoreCase("Edge")) 
		{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\00004725\\driver\\msedgedriver.exe");
		//initialize the webdriver with the appropriate browser
		WebDriver driver= new EdgeDriver();
	    // to launch amazon .com
		driver.get("https://www.amazon.com");
		//to get title
		String titleamaxon=driver.getTitle();//put it in string to print
		//to print the title
		System.out.println("amazon title is: " +titleamaxon);
		//to close the bowser
		driver.close();
		}
		else if(browser.equalsIgnoreCase("chrome")) 
		{
			
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
		else {
			System.out.println("Not a valid browser");
		}
	}
}

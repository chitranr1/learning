import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo2 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter browse");
 
        String Vbrowser = myObj.nextLine();
        if(Vbrowser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00004725\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//String baseURL = "https//www.chrome.com";
		driver.get("https://www.selenium.dev/downloads/");
		String Vtitle=driver.getTitle();
		System.out.println("My title is"+Vtitle);
		driver.close();
        }
        else if(Vbrowser.equalsIgnoreCase("edge")) {
        	System.setProperty("webdriver.edge.driver","C:\\Users\\00004725\\Downloads\\Edgedriver\\msedgedriver.exe");
    		WebDriver driver=new EdgeDriver();
    		//String baseURL = "https//www.chrome.com";
    		driver.get("https://www.selenium.dev/downloads/");
    		String Vtitle=driver.getTitle();
    		System.out.println("My title is"+Vtitle);
    		driver.close();
        }
        else {
        	System.out.println("Invalid browser");
        }

	}

}

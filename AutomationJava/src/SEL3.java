import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SEL3 {

	public static void main(String[] args) {
		//browser setup
		//1.Install browser driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004725\\driver\\chromedriver.exe");
		//initialize the webdriver with the appropriate browser
		WebDriver driver= new ChromeDriver();
	    // to launch amazon .com
		driver.get("https://www.gmail.com");
		String titleamaxon=driver.getTitle();
		System.out.println("amazon title is: " +titleamaxon);
		driver.findElement(By.linkText("Help")).click();
		System.out.println("amazon title is: " +titleamaxon);
		driver.close();
	}
}

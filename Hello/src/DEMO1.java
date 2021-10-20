import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEMO1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00004725\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//String baseURL = "https//www.chrome.com";
		driver.get("https://www.selenium.dev/downloads/");
		String Vtitle=driver.getTitle();
		System.out.println("My title is"+Vtitle);
		driver.close();
		
		}

}

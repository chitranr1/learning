import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo10 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\00004725\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//String baseURL = "https//www.chrome.com";
		driver.get("https://www.amazon.in");
		System.out.println(driver.getTitle());
		Select SPD= new Select(driver.findElement(By.id("searchDropdownBox")));
		SPD.selectByIndex(1);
		SPD.selectByValue("search-alias=todays-deals");
		SPD.selectByVisibleText("Amazon Devices");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Moblies");
		driver.findElement(By.id("nav-search-submit-button")).click();
	    driver.findElement(By.xpath("//input[@type='checkbox']")).click();

	}

}

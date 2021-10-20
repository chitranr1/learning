import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEMO7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00004725\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//String baseURL = "https//www.chrome.com";
		driver.get("https://www.linkedin.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.className("nav__button-secondary")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("username")).sendKeys("chitra@gmail.com");
		driver.findElement(By.name("session_password")).sendKeys("122");
		//driver.findElement(By.xpath("//button[@aria-label='Sign in']")).click();
		//driver.findElement(By.xpath("//*[@class='btn__primary--large from__button--floating']")).click();
		//driver.findElement(By.xpath("//div[@id='organic-div']/form[@action='/checkpoint/lg/login-submit']//button[@class='btn__primary--large from__button--floating']")).click();
		//driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.xpath("//button[@type='submit' and @aria-label='Sign in']")).click();
		String verror=driver.findElement(By.id("error-for-username")).getText();
		System.out.println(verror);
		Thread.sleep(4000);
		driver.close();

	}

}

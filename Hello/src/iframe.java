import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00004725\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.mortgagecalculator.org/");
		driver.findElement(By.id("homeval")).sendKeys("30000");
		driver.findElement(By.id("downpayment")).sendKeys("3000");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='calcu-block']/div[2]/span/label[2]/input")).click();
		driver.findElement(By.id("loanterm")).sendKeys("20");
		Select SPD= new Select(driver.findElement(By.name("param[milserve]")));
		SPD.selectByVisibleText("VA");
		driver.findElement(By.name("cal")).click();
		String value1=driver.findElement(By.xpath("//div[@class='repayment-block']/div[1]/div[1]/h3")).getAttribute(name)
		System.out.println(value1);
		
		////*[@id="calc"]/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[2]/div/div[1]/div[1]/h3
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEMO5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00004725\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
        driver.findElement(By.id("food")).sendKeys("1000");
        driver.findElement(By.id("clothing")).sendKeys("2000");
        driver.findElement(By.id("shelter")).sendKeys("3000");
        driver.findElement(By.id("monthlyPay")).sendKeys("10000");
        driver.findElement(By.id("monthlyOther")).sendKeys("30");
        String TME = driver.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
        String TMI = driver.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
       System.out.println("The value of Total Monthly expenses: " +TME);
       System.out.println("The value of Total Monthly Income: " +TMI);
       driver.close();
        
      
        //totalMonthlyIncome
        
        

	}

}

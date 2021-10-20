import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Study1 {
	
	public static String vText;


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00004725\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//String baseURL = "https//www.chrome.com";
		driver.manage().window().maximize();
		
		
		driver.get("https://jqueryui.com/droppable/");
		vText=driver.findElement(By.className("entry-title")).getText();
		System.out.println("Text from Main Section : "+vText);
		
		int fSize=driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total No of Frames :"+fSize);
		
		driver.switchTo().frame(0);
		//myD.switchTo().frame("name or ID");
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		vText=driver.findElement(By.id("draggable")).getText();
		System.out.println("Text from Draggable Object : "+vText);
		
		WebElement dragEl=driver.findElement(By.id("draggable"));
		WebElement DropEl=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(dragEl, DropEl).build().perform();
		
		driver.switchTo().defaultContent();
		
		vText=driver.findElement(By.className("entry-title")).getText();
		System.out.println("Text from Main Section : "+vText);
		
		Thread.sleep(4000);
		
		driver.close();	
		
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEMO9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00004725\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//String baseURL = "https//www.chrome.com";
		driver.get("https://www.google.com");
		int vSize=driver.findElements(By.tagName("a")).size();
        System.out.println("Total Links :"+vSize);
        for (int i=0;i<vSize;i++)
        {
            //String vLink=myD.findElements(By.tagName("a")).get(i).getAttribute("href");
            String vLinkText=driver.findElements(By.tagName("a")).get(i).getText();
            System.out.println(vLinkText);

            if(vLinkText.contains("Gmail"))
            {
                driver.findElements(By.tagName("a")).get(i).click();
                break;
            }

        }           
        Thread.sleep(4000);
        driver.close();

	}

}

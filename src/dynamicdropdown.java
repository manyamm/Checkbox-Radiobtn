import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Webbrowser\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000L);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value='BLR'])")).click();
		driver.findElement(By.xpath("//a[@value='BOM'])[2]")).click();
		
		
	}

}

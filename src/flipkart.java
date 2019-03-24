import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Webbrowser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("deepthistar25@gmail.com");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).sendKeys("Deepthi_reddy");
		driver.findElement(By.xpath("//div[@class='_1avdGP']//button[@type='submit']")).click();
		
		
		

	}

}

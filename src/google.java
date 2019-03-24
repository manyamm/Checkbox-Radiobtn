import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Webbrowser\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com.au/");
		driver.findElement(By.xpath("//a[@class='gb_P']")).click();

	}

}

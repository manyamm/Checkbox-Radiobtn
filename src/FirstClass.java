import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//invoke .exe file first
        
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Webbrowser\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.get("https://www.google.com.au/");
		  System.out.println(driver.getCurrentUrl());
	}

}

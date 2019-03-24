import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestYash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Webbrowser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.udemy.com/");
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
	WebElement login=	driver.findElement(By.cssSelector("a[class='btn btn-quaternary']"));
	login.click();
	 driver.findElement(By.xpath("//input[@id='id_email']")).sendKeys("aggd");
	//email.sendKeys("asddfg@gmail.com");
	//WebElement password=driver.findElement(By.name("password"));
	//password.sendKeys("cvbcvb");
		
		
	}

}

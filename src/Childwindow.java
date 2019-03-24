import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Webbrowser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com/SignUp?hl=en");
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
		System.out.println(driver.getTitle());
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String Parentid=it.next();
		String Childid=it.next();
		driver.switchTo().window(Childid);
		System.out.println(driver.getTitle());
		while(it.hasNext()) {
			String win  = it.next();
		}

	}

}

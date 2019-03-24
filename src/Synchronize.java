import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Webbrowser\\chromedriver.exe");
	       WebDriver  driver=  new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	       driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels");
	       driver.findElement(By.id("H-destination")).sendKeys("nyc");
	       driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
	       driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);
	 //      WebDriverWait d=new WebDriverWait(driver,20);
    //       d.until(ExpectedConditions.visibilityOfElementLocated("//a[contains@href,'https://alaskatrips.poweredbygps.com/New-York-Hotels-Shelburne-NYC-An-Affinia-Hotel.')]"))
	 //      driver.findElement(By.xpath("//a[contains@href,'https://alaskatrips.poweredbygps.com/New-York-Hotels-Shelburne-NYC-An-Affinia-Hotel.')]")).click();
	         
	}

}

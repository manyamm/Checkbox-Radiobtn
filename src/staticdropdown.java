import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticdropdown {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.driver.chrome", "C:\\Program Files\\Webbrowser\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
        driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
        Thread.sleep(2000L);
        
        for(int i=0;i<5;i++)
        {
        	driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(" driver.findElement(By.id(\"ctl00_mainContent_DropDownListCurrency\")).gettext()");
		

	}

}

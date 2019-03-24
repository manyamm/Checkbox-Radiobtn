
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Webbrowser\\chromedriver.exe");
	       WebDriver  driver=  new ChromeDriver();
	       driver.get("https://www.makemytrip.com/");
	       System.out.println("Before clicking multicity");
	       System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed());
	       driver.findElement(By.xpath("//*[@id='multicity']/label")).click();
	       System.out.println("After clicking multicity");
	       System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed());
	       System.out.println(driver.findElement(By.xpath("//*[@id=\'js-hp-widgetSection\']/div[1]/h1")).getText());
	       //if you want to validate  the object present in webpage or code base use size()
	       
	     /*  int count=driver.findElement(By.xpath("//input[@id='hp-widget__return']")). size();
	       if(count==0)
	       {
	    	   System.out.println("Verified");
	       }*/
	       
	}

}

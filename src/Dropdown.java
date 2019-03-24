import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args)/* throws InterruptedException*/ {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Webbrowser\\chromedriver.exe");
       WebDriver  driver=  new ChromeDriver();
     driver.get("http://spicejet.com/");
     Select s= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
     s.selectByValue("2");
     s.selectByIndex(5);
     Select i= new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Child")));
     i.selectByValue("1");
    // Thread.sleep(1000);
   //  driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
    // driver.findElement(By.xpath("//a[@value='STV']")).click();
     //driver.findElement(By.xpath("//a[@value='CCU'][2]")).click();
     System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).isSelected());
driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).click();
System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).isSelected());

   // driver.close();
	}

}


/*public class dropdown1{
	public static void main(String args[] args)
	System.setProperties("webdriver.chrome.driver","C:\\program..exe)");
	Webdriver driver= new chrome driver();
	driver.get(http://flipkart.com);
		Select s= new Select(driver.findelement(By.id("123456")));
	s.selectbyvalue(2);
	Select i= new Select(driver.findelement(By.name("asda")));
	i.selectbyvalue(1);
	System.out.println(driver.findelemen())*/
	


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Webbrowser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com.au/");
		//count of links in a page
		System.out.println("Total links in the page");
        System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footer=driver.findElement(By.id("glbfooter"));
        System.out.println("count of links in footer");
       System.out.println(footer.findElements(By.tagName("a")).size());
       WebElement Col=driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));

   	WebElement col=driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
   	//System.out.println("Links in the 2nd coloumn of the section");
   	//System.out.println(col.findElements(By.tagName("a")).size());
   	String Beforeclicking = null;
   	String Afterclicking;
   	for(int i=0;i<col.findElements(By.tagName("a")).size();i++)
   	{
   	
   		
   		if(col.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
   		{
   			Beforeclicking = driver.getTitle();
   		
   			col.findElements(By.tagName("a")).get(i).click();
   			break;
   			}
   	}
   	Afterclicking =driver.getTitle();
   	if(Beforeclicking!=Afterclicking)
   	{
   		if(driver.getPageSource().contains("sitemap"))
   	
   			System.out.println("PASS");
   	}
   	else
   	{
   		System.out.println("FAIL");
   	}
   		
   }
   	                   
   	}






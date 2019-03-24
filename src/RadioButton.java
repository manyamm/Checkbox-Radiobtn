import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Webbrowser\\chromedriver.exe");
	       WebDriver  driver=  new ChromeDriver();
	     driver.get("http://www.echoecho.com/htmlforms10.htm");
	   //  driver.findElement(By.xpath( "//input[@value='Milk']")).click();
	     int count=driver.findElements(By.xpath("//input[@name='group1']")).size();
	     String exceldata = "Homestay,Hostel";
	     String[] checkboxItems = exceldata.split(",");
	     for(int i=0; i<checkboxItems.length;i++) {
	    	 String checkbox = checkboxItems[i];
	    	 driver.findElement(By.xpath("//label[contains(@for,'hc_f_filter_propertyType_')]/span[text()='"+checkbox+"']/../input")).click();
	     }
	     
	     for(int i=0;i<=count;i++)
	     {
	    	// driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
	    	//System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
	    	String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
	    	 if(text.equals("Cheese"))
	    		 
	    	 {
	    		 driver.findElements(By.xpath("//input[@name='group1']")).get(i).click(); 
	    	 }
	    	 
	     
	     }

	}

}

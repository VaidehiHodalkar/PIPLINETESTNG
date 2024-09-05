package TestVagrant.Pushpa_The_Rise;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.net.MalformedURLException;
import java.net.URL;
public class withoutpom {
	WebDriver driver;
	@Test
	public void config()
	{
	
	 System.setProperty("webdriver.chrome.driver", "D:\\course download\\chromedriver_win32\\chromedriver-win64\\chromedriver.exe");  
     
     // Instantiate a ChromeDriver class.     

	 ChromeOptions options = new ChromeOptions();
	 options.addArguments("--remote-allow-origins=*");
	 ChromeDriver driver = new ChromeDriver(options);  

driver.navigate().to("http://www.javatpoint.com/");  
  
 //Maximize the browser  
  driver.manage().window().maximize();  
System.out.println(driver.getTitle());
}
}
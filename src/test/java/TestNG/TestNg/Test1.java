package TestNG.TestNg;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Test1 {

	@Test
	public static void test() throws IOException
	{
		System.out.println("hello");
	

	

	 Properties prop = new Properties();
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
			+ "\\src\\main\\java\\TestNG\\TestNg\\GlobalData.properties");
	prop.load(fis);
	
	String browserName = System.getProperty("browser")!=null ? System.getProperty("browser") :prop.getProperty("browser");
	//prop.getProperty("browser");

	if (browserName.contains("chrome")) {
		System.out.println("hello chrome");
	} else if(browserName.equalsIgnoreCase("firefox")) {
		

	
		System.out.println("hello firefox");
}
	}
}

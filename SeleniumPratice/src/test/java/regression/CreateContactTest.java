package regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactTest {
	@Test
	public void contactTest() 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.close();
		
	}

}

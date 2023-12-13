package smoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenEdgeTest {
	
	@Test
	public void edgeTest() 
	{

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.in/");
		
		driver.close();
		
	}

}

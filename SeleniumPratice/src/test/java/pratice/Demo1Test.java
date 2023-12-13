package pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1Test {
	
	public void openBrowserTest() 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://amazon.in/");
		//Made this Change to PULL
		driver.close();
		
	}

}

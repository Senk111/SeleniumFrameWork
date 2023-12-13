package pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputFromCommandPromptTest {
	
	public void fetchDataFromCmdTest() 
	{
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		WebDriver driver;
		if (BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (BROWSER.equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(URL);
		System.out.println("Success");
		driver.close();
	}

}

package pratice;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.Tesseract;

public class CaptchaHandling {

	public static void main(String[] args) throws Throwable 
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.findElement(By.xpath("//a[.=' LOGIN ']")).click();
		
		Thread.sleep(3000);
		WebElement captcha = driver.findElement(By.xpath("//img[@class='captcha-img']"));
		
		TakesScreenshot tss = (TakesScreenshot) captcha;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dest = new File("./CaptchaScreenShot/Captcha1.png");
		FileUtils.copyFile(src, dest);
		
		Tesseract ts = new Tesseract();
		
		ts.setDatapath("C:\\Users\\Spoint\\Documents\\Selenium\\AdvanceSeleniumFiles\\Captcha\\Tess4J-3.4.8-src\\Tess4J\\tessdata");
		String path = ts.doOCR(dest);
		String img = path.replaceAll(" ", "");
		
		System.out.println(img);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Captcha']")).sendKeys(img);
		
		Thread.sleep(2000);
		driver.close();
		

	}

}

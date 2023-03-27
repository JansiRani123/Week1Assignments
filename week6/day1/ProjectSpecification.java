package week6.day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecification {

	ChromeDriver driver;
	@BeforeMethod
	public void openBrowser()
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable--notifications--");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://dev62925.service-now.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	 @AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	}


package week6.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import marathon.day3.ReadExcel;

public class BaseClass {
		
		public RemoteWebDriver driver;
		public String excelName;
		@Parameters({ "url", "browser" })
		@BeforeMethod
		public void openBrowser(String url, String browser) {
			switch (browser) {
			case "chrome":
				ChromeOptions option = new ChromeOptions();
				option.addArguments("--remote-allow-origins=*");
				option.addArguments("--disable--notifications--");
				driver = new ChromeDriver(option);
				break;
			case "edge":
				driver = new EdgeDriver();
				break;
			default:
				break;
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}

		@AfterMethod
		public void closeBrowser() {
			driver.close();
		}

		@DataProvider
		public String[][] sendData() throws IOException {
			String[][] data = ReadExcel.getData(excelName);
			return data;

		}
		
		
	}


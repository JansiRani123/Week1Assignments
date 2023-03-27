package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.sukgu.Shadow;

public class ServiceNowAssign {

public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable--notifications--");
		ChromeDriver driver=new ChromeDriver(option);
		Shadow dom=new Shadow(driver);
		driver.get("https://dev62925.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("GAhMak34tH-^");
		driver.findElement(By.id("sysverb_login")).click();
		dom.setImplicitWait(25);
		WebElement allEle = dom.findElementByXPath("//div[contains(text(),'All')]");
		allEle.click();
		dom.setImplicitWait(10);
		WebElement filter = dom.findElementByXPath("//*[@id='filter']");
		filter.sendKeys("incidents");
		WebElement filtermatch = dom.findElementByXPath("//mark[text()='Incidents']");
		driver.executeScript("arguments[0].click();", filtermatch);
		
}

		
}

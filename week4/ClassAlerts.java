package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassAlerts {
public static void main(String[] args) {
	
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt1");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	
	WebElement frameEle = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
	driver.switchTo().frame(frameEle);
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	
	Alert alertName = driver.switchTo().alert();
	String textInAlertPop = alertName.getText();
	System.out.println(textInAlertPop);
	alertName.sendKeys("Pepsi");
	alertName.accept();
	
}
}

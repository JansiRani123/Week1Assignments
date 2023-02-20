package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumDay1 {

public static void main(String[] args) {
	
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://login.salesforce.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	driver.findElement(By.id("password")).sendKeys("Leaf@123");
	driver.findElement(By.id("Login")).click();
	String title=driver.getTitle();
	System.out.println(title);
}


	
}

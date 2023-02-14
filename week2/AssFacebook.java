package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssFacebook {

	public static void main(String[] args) {
		
		 ChromeDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://en-gb.facebook.com/");
		 driver.findElement(By.xpath("//input[@name='login_source']/following::a[2]")).click();
		 driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("janu");
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("rani");
		 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8095706575");
         //driver.findElement(By.xpath("//div[contains(text(),'Mobile number or email address')]/following::input[@name='reg_email__'])]"))
         //.sendKeys("8095706575");
		 driver.findElement(By.id("password_step_input")).sendKeys("Pawan@123");
		 
		 WebElement dayPicker = driver.findElement(By.id("day"));
		 Select day=new Select(dayPicker);
		 day.selectByVisibleText("30");
		 
		 WebElement monthPicker = driver.findElement(By.id("month"));
		 Select month=new Select(monthPicker);
		 month.selectByIndex(2);
		 
		 WebElement yearPicker = driver.findElement(By.id("year"));
		 Select year=new Select(yearPicker);
		 year.selectByValue("2016");
		 
		 driver.findElement(By.xpath("//label[contains(text(),'Female')]/following::input")).click();
		 System.out.println("I entered all details");
		 
		 driver.close();
		 

	}

}

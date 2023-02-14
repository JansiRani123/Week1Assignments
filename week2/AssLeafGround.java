package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AssLeafGround {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		 driver.get("https://www.leafground.com/input.xhtml");
		 driver.findElement(By.xpath("//div[@class='grid formgrid']//input")).sendKeys("Jansi Rani");
		 driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[2]")).clear();
		 driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[2]")).sendKeys("Bangalore");
		 WebElement ele = driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[3]"));
		 System.out.println(ele.isEnabled());
		 if(ele.isEnabled())
		 {
			 System.out.println("the text box is displayed");
		 }
		 else 
		 {
			 System.out.println("the text box is not displayed to interact");
		 }
		 
         driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();
         String text = driver.findElement(By.xpath("//input[@value='My learning is superb so far.']")).getAttribute("value");
		 System.out.println(text);
		 
		 driver.findElement(By.xpath("//input[@placeholder='Your email and tab']")).sendKeys("abc@gmail.com",Keys.TAB);
		 driver.findElement(By.xpath("//h5[contains(text(),'Type about yourself')]/following::textarea")).sendKeys("I am ready to learn Selenium");
		 
		 driver.findElement(By.className("ql-bold")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@class='ql-container ql-snow']/div")).sendKeys("faster");
		 
		 WebElement errEle = driver.findElement(By.xpath("//h5[contains(text(),'confirm error message')]/following::input[2]"));
		 
		 errEle.sendKeys(Keys.ENTER);
		 
		 Thread.sleep(3000);
		 String errorMsg=driver.findElement(By.xpath("//span[@class='ui-message-error-detail']")).getText();
		 System.out.println(errorMsg);
		 
		 driver.findElement(By.xpath("//h5[contains(text(),'Label Position')]/following::input[1]")).click();
		 WebElement ele1=driver.findElement(By.xpath("//h5[contains(text(),'choose the third option')]/following::input[1]"));
		 ele1.sendKeys("jansi");
		 driver.findElement(By.xpath("(//span[@role='listbox']//li)[3]")).click();
		 driver.findElement(By.xpath("//h5[contains(text(),'Confirm Keyboard')]/following::input")).click();
		 
		 Thread.sleep(2000);
		 
		 WebElement cusToolBar=driver.findElement(By.xpath("//h5[contains(text(),'Custom Toolbar')]/following::div[4]"));
		 cusToolBar.click();
		 cusToolBar.sendKeys("I entered in the tool bar");
		 
		 
		 
		 
		 }

	}



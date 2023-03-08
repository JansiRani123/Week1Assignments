package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssDeleteLead {

	public static void main(String[] args) throws InterruptedException {
		

		 ChromeDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://leaftaps.com/opentaps/control/login");
			
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
			driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1 8095706575");
			driver.findElement(By.linkText("Find Leads")).click();
			
			WebElement firstLead=driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
			String leadNumber=firstLead.getText();
			
			System.out.println(leadNumber);
			
			firstLead.click();
			driver.findElement(By.className("subMenuButtonDangerous")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			
			driver.findElement(By.xpath("(//label[contains(text(),'Lead ID:')]/following::input)[1]")).sendKeys(leadNumber);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
			
			
			WebElement element=driver.findElement(By.xpath("//div[text()='No records to display']"));
			String consoleMessage=element.getText();
			
			System.out.println(consoleMessage);
			
			driver.close();
			
			
			
	}
}

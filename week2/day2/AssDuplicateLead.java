package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssDuplicateLead {

	public static void main(String[] args) {
		
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
		 driver.findElement(By.xpath("//span[contains(text(),'Email')]")).click();
		 driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("abc@gmail.com");
		 driver.findElement(By.linkText("Find Leads")).click();
		 
		 WebElement firstLeadEmail=driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		 firstLeadEmail.click();
		 String companyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
			
		 System.out.println(companyName);
		 driver.findElement(By.linkText("Duplicate Lead")).click();
		 String currentPageTitle = driver.getTitle();
	     System.out.println(currentPageTitle);
			 
			
		 driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		 String dupcompanyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		 
		 System.out.println(dupcompanyName);
		 
		 if(companyName==dupcompanyName)
		 {
			 System.out.println("Both Company Names are matching");
		 }
		 else
		 {
			 System.out.println("Both Company Names are not matched");
		 }
 }
}



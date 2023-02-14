package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Narmadha");
		 
		 driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		 Thread.sleep(2000);
		 WebElement firstLeadFname=driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		 firstLeadFname.click();
		 
		 String currentPageTitle = driver.getTitle();
	     System.out.println(currentPageTitle);
	     
	     String companyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	     System.out.println(companyName);
	     
	     driver.findElement(By.linkText("Edit")).click();
	     driver.findElement(By.id("updateLeadForm_companyName")).clear();
	     driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("seleniumEditted");
	     driver.findElement(By.xpath("//input[@value='Update']")).click();
	     
	     String text1 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	     System.out.println(text1);
	     
	     if(companyName!=text1)
	     {
	    	 System.out.println("The Editted Chnges is Reflecting");
	     }
	     
	     }
	     
}


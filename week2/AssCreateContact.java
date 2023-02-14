package week2.day2;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class AssCreateContact {

	 public static void main(String[] args) throws InterruptedException {
		
		 ChromeDriver driver =new ChromeDriver();
		 
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
			driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
			driver.findElement(By.xpath("//div[@class='x-panel-header']/a[text()='Contacts']")).click();
			driver.findElement(By.linkText("Create Contact")).click();
			driver.findElement(By.id("firstNameField")).sendKeys("Jansi");
			driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Janu");
			driver.findElement(By.id("lastNameField")).sendKeys("Rani");
			driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Elango");
			driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Finance");
			driver.findElement(By.id("createContactForm_description")).sendKeys("Need to verify the accounts");
			
			driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("bcd@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.className("smallSubmit")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[1]")).click();
			driver.findElement(By.id("updateContactForm_description")).clear();
			driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("modified notes");
			driver.findElement(By.xpath("//input[@value='Update']")).click();
			
			String pageTitle= driver.getTitle();
			System.out.println(pageTitle);
	}
}

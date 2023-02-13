package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDuplicateLead {

public static void main(String[] args) {
	
	ChromeDriver driver =new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jansi");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rani");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Janu");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT-Departement");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Fast Learner to learn new things");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
	
	
	driver.findElement(By.className("smallSubmit")).click();
	
	String titleOfPage=driver.getTitle();
	System.out.println(titleOfPage);
	
	driver.findElement(By.linkText("Duplicate Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).clear();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Azus Company");
	driver.findElement(By.id("createLeadForm_firstName")).clear();
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Joshna");

	driver.findElement(By.className("smallSubmit")).click();
	
	String titleOfDupPage=driver.getTitle();
	System.out.println(titleOfDupPage);
	
	
	
}
}

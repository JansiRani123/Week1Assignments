package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentCreateLead {
	
public static void main(String[] args) throws InterruptedException {
	
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
	driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Fast Learner to learn new things");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
	

	WebElement stateElement=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	//stateElement.click();
	Select state=new Select(stateElement);
	state.selectByVisibleText("Georgia");
	//Thread.sleep(2000);
	
	driver.findElement(By.className("smallSubmit")).click();
	
	String titleOfPage=driver.getTitle();
	System.out.println(titleOfPage);
	
}
}

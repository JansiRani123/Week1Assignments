package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassAssXpaths {
	

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Lead')])[2]")).click();
		
		driver.findElement(By.xpath("//input[contains(@id,'createLead')]")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Jansi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Rani");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Janu");
		driver.findElement(By.xpath("//input[contains(@name,'department')]")).sendKeys("IT-Departement");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Fast Learner to learn new things");

		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		String titleOfPage=driver.getTitle();
		System.out.println(titleOfPage);
		
	}
	
}

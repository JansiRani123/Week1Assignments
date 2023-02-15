package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssCheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[contains(text(),'Basic')]/parent::div")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Ajax')]/parent::div")).click();
		
		driver.findElement(By.xpath("//div[@class='ui-chkbox ui-widget']")).click();

		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[2]")).click();
		
		driver.findElement(By.xpath("//h5[contains(text(),'Tri State Checkbox')]/following::div[3]")).click();
		driver.findElement(By.xpath("//h5[contains(text(),'Toggle Switch')]/following::div[1]")).click();
		
				
				////h5[contains(text(),'disabled')]/following::div
		
		boolean  statusOfBox = driver.findElement(By.xpath("(//div[@class='grid formgrid'])[5]")).isSelected();
        System.out.println(statusOfBox);
		
		WebElement multiplteOptions = driver.findElement(By.xpath("//h5[contains(text(),'Select Multiple')]/following::div[1]"));
		multiplteOptions.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Berlin'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Rome'])[2]")).click();
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
		
	}

}

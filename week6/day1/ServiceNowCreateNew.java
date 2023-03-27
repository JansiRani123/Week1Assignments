package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class ServiceNowCreateNew extends ProjectSpecification {

		@Test
		public void create()
		{
		Shadow dom=new Shadow(driver);
		
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("GAhMak34tH-^");
		driver.findElement(By.id("sysverb_login")).click();
		dom.setImplicitWait(40);
		WebElement allEle = dom.findElementByXPath("//div[contains(text(),'All')]");
        
		allEle.click();
		dom.setImplicitWait(10);
		WebElement filter = dom.findElementByXPath("//*[@id='filter']");
	
		filter.sendKeys("incidents");
		WebElement filtermatch = dom.findElementByXPath("//mark[text()='Incidents']");
		driver.executeScript("arguments[0].click();", filtermatch);
		WebElement newEle = dom.findElementByXPath(("//*[@id='gsft_main']"));
		driver.switchTo().frame(newEle);
		
		driver.findElement(By.id("sysverb_new")).click();
		WebElement numberEle = driver.findElement(By.id("incident.number"));
		String number = numberEle.getAttribute("value");
		System.out.println(number);
		driver.findElement(By.id("sys_display.incident.caller_id")).click();
		
		driver.findElement(By.id("incident.short_description")).sendKeys("verify the s/m is working properly");
		driver.findElement(By.id("sysverb_insert_bottom")).click();
		WebElement searchBar = driver.findElement(By.xpath("//*[contains(text(),'Search')]/following::input"));
		searchBar.click();
		searchBar.sendKeys(number,Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@class='list2_body']/tr/td[3]/a")).click();
		WebElement incidentNumber = driver.findElement(By.xpath("//*[@class='navbar-title-display-value']"));
		String incNum = incidentNumber.getText();
		System.out.println(incNum);
		if(number.contains(incNum))
		{
			System.out.println("The incidentnum is created for new one : "+ incNum);
		}
		else
		{
			System.out.println("not created");
		}
			
		}
	}


package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class ServiceNowDeleteIncident extends ProjectSpecification {
		
		@Test
		public void delete()
		{
			Shadow dom=new Shadow(driver);
			
			driver.findElement(By.id("user_name")).sendKeys("admin");
			driver.findElement(By.id("user_password")).sendKeys("GAhMak34tH-^");
			driver.findElement(By.id("sysverb_login")).click();
			dom.setImplicitWait(25);
			WebElement allEle = dom.findElementByXPath("//div[contains(text(),'All')]");
			allEle.click();
			dom.setImplicitWait(10);
			WebElement filter = dom.findElementByXPath("//*[@id='filter']");
			filter.sendKeys("incidents");
			WebElement filtermatch = dom.findElementByXPath("//mark[text()='Incidents']");
			driver.executeScript("arguments[0].click();", filtermatch);
		
			WebElement newEle = dom.findElementByXPath(("//*[@id='gsft_main']"));
			driver.switchTo().frame(newEle);

			driver.findElement(By.xpath("//*[@class='list2_body']/tr/td[3]/a")).click();
			WebElement numberEle = driver.findElement(By.id("incident.number"));
			String number = numberEle.getAttribute("value");
			System.out.println(number);
			
			driver.findElement(By.id("sysverb_delete")).click();
			driver.findElement(By.id("ok_button")).click();
			
			driver.findElement(By.xpath("//span[contains(text(),'within the input to submit the search.')]/following::input")).sendKeys(number,Keys.ENTER);
			WebElement msg = driver.findElement(By.xpath("//*[@class='list2_empty-state-list']"));
			String text = msg.getText();
			System.out.println(text);
}
}

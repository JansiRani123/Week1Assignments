package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class ServiceNowUpdate extends ProjectSpecification{

@Test
public void update()
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
		WebElement urgencyEle = driver.findElement(By.id("incident.urgency"));
		Select urgency=new Select(urgencyEle);
		urgency.selectByIndex(0);
		WebElement stateEle = driver.findElement(By.id("incident.state"));
		Select state=new Select(stateEle);
		state.selectByIndex(1);
		driver.findElement(By.id("sysverb_update")).click();
		driver.findElement(By.xpath("//*[@class='list2_body']/tr/td[3]/a")).click();
		WebElement priorityEle = driver.findElement(By.id("sys_original.incident.urgency"));
		String text = priorityEle.getAttribute("value");
		System.out.println(text);
		if(text.matches("1"))
		{
			System.out.println("priority is updated to high");
		}
		else
		{
			System.out.println("priority is not updated");
		}
		WebElement stateEle1 = driver.findElement(By.id("sys_original.incident.state"));
		String text1 = stateEle1.getAttribute("value");
		System.out.println(text1);
		if(text1.matches("2"))
		{
			System.out.println("state is updated to In progress");
		}
		else
		{
			System.out.println("state is not updated");
		}
	
		
}		
		
}

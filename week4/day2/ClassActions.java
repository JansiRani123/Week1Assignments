package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClassActions {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		WebElement dragEle = driver.findElement(By.xpath("(//div[@class='card']/div)[2]"));
		
		WebElement target = driver.findElement(By.xpath("(//div[@class='card']/div)[1]"));
		Point axis = target.getLocation();
		int x = axis.getX();
		int y = axis.getY();
		Actions a=new Actions(driver);
		a.dragAndDropBy(dragEle, x+200, y+200).perform();
		
		//2 one
		WebElement sourceEle = driver.findElement(By.id("form:drag"));
		WebElement targetEle = driver.findElement(By.id("form:drop"));
		a.dragAndDrop(sourceEle, targetEle).perform();
		
		//3rd one
		WebElement sourceEle1 = driver.findElement(By.xpath("//span[contains(text(),'Name')]/preceding::th"));
		Point location = sourceEle1.getLocation();
		int x1=location.getX();
		int y1=location.getY();
		WebElement targetEle1 = driver.findElement(By.xpath("//span[contains(text(),'Category')]/preceding::th"));
		Point location2 = targetEle1.getLocation();
		int x2 = location2.getX();
		int y2 = location2.getY();
		
		
		a.dragAndDropBy(sourceEle1, x2, y2).perform();
		
		
	}
}

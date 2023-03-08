package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class AssNykaa {
	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver();
		Shadow dom=new Shadow(driver);
		driver.get(" https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement mouseHover = driver.findElement(By.xpath("//a[contains(text(),'brands')]"));
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(1000);
		
		Actions a=new Actions(driver);
		a.moveToElement(mouseHover).perform();
		Thread.sleep(1000);
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		WebElement lorealEle = driver.findElement(By.xpath("//div[@id='list_topbrands']/following::a"));
		
		a.moveToElement(lorealEle).perform();
		a.click().perform();
		String title1 = driver.getTitle();
		System.out.println(title1);
		WebElement arrow = driver.findElement(By.xpath("//div//span[contains(text(),'Sort By : popularity')]"));
		driver.executeScript("arguments[0].click()",arrow);
		
		driver.findElement(By.xpath("(//div[@class='control-value']/span)[4]")).click();
		
		WebElement categoryArrow = driver.findElement(By.xpath("//div//span[contains(text(),'Category')]"));
		driver.executeScript("arguments[0].click()",categoryArrow);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[contains(text(),'Hair')])[3]")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'Hair Care')])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Shampoo')]/following::div")).click();
		
		WebElement concernEle = driver.findElement(By.xpath("//span[contains(text(),'Concern')]"));
		driver.executeScript("arguments[0].click()",concernEle);
		
		driver.findElement(By.xpath("//span[contains(text(),'Color Protection')]")).click();
		WebElement product = driver.findElement(By.xpath("//div[contains(text(),'Paris Colour Protect Shampoo')]"));
		driver.executeScript("arguments[0].click()",product);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list1=new ArrayList<String>(windowHandles);
		String parentWin = list1.get(0);
		String childWin = list1.get(1);
		
		driver.switchTo().window(childWin);
		
		driver.findElement(By.xpath("//div[@id='product-offers-section']//following::span")).click();
		WebElement price = driver.findElement(By.xpath("//span[contains(text(),'MRP')]/following::span"));
		String mrp = price.getText();
	    System.out.println("The MRP of the product is : "+mrp);
	    
	    driver.findElement(By.xpath("//span[contains(text(),'Add to Bag')]/parent::button")).click();
	    
	    driver.findElement(By.xpath("//button[contains(text(),'Sign in')]/following::button")).click();
	    driver.switchTo().frame(0);
	    WebElement total = driver.findElement(By.xpath("//div[@data-test-id='footer']//span"));
	    String grandTotal = total.getText();
	    System.out.println(grandTotal);
	   
	    driver.findElement(By.xpath("(//div[@data-test-id='footer']//span)[4]")).click();
	    
	    driver.findElement(By.xpath("//button[contains(text(),'Continue as guest')]")).click();
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div[2]/div[2]/div/div[1]/span/img")).click();
	    WebElement priceDetails = driver.findElement(By.xpath("//p[contains(text(),'Price Details')]/following::p"));
	    String price2 = priceDetails.getText();
	    System.out.println(price2);
	    if(grandTotal.contains(price2))
	    {
	    	System.out.println("Both prices are matching");
	    }
	    else
	    {
	    	System.out.println("not matching");
	    }
	    //driver.quit();
	    
	    
	    
	    
	    
	
	}

}

package week4.day1;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssAmazon {

	private static String title;

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBox.sendKeys("One plus 9 pro");
		searchBox.sendKeys(Keys.ENTER);
		
		WebElement priceOne = driver.findElement(By.xpath("//span[@class='a-price-whole']"));
		String price = priceOne.getText();
		System.out.println(price);
		
		driver.findElement(By.xpath("//span[contains(text(),'(Renewed) OnePlus 9 Pro 5G ')]")).click();
		Set<String> handles = driver.getWindowHandles();
		
		List<String> list1=new ArrayList<String>(handles);
		String parentWin = list1.get(0);
		String childWin=list1.get(1);
		
		driver.switchTo().window(childWin);
		WebElement rating = driver.findElement(By.xpath("//a[@id='acrCustomerReviewLink']/span"));
		String text = rating.getText();
		System.out.println(text);
		driver.findElement(By.id("add-to-cart-button")).click();
		
		WebElement subTotalEle = driver.findElement(By.xpath("//span[@class='a-price-whole']"));
		String subTotal = subTotalEle.getText();
		System.out.println(subTotal);
		
		if(price.equals(subTotal))
		{
			System.out.println("the prices are same and verified");
		}
		else
		{
			System.out.println("The prices are diferent");
		}
		
		//driver.close();
		driver.switchTo().window(parentWin);
		title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	
	}
}

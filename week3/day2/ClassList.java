 package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassList {
	
	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles",Keys.ENTER);
		List<WebElement> allPrices = driver.findElements(By.className("a-price-whole"));
		int total = allPrices.size();
		System.out.println(total);
		List<Integer> listOfMobPrice=new ArrayList<Integer>();
		for(WebElement ele :allPrices)
		{
			String priceOfEachMobile = ele.getText();
			String replacedOne = priceOfEachMobile.replaceAll(",","");
			System.out.println(replacedOne);
			if(!replacedOne.isEmpty())
			{
			  int parseInt = Integer.parseInt(replacedOne);
			  listOfMobPrice.add(parseInt);
			}
		}
			
		     Collections.sort(listOfMobPrice);
		     System.out.println(listOfMobPrice);
		     System.out.println(listOfMobPrice.get(0));
		
	
	}

}

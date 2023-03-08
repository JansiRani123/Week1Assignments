package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassRailway {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement fromEle = driver.findElement(By.id("txtStationFrom"));
		fromEle.clear();
		fromEle.sendKeys("MAS",Keys.ENTER);
		
		WebElement toEle = driver.findElement(By.id("txtStationTo"));
		toEle.clear();
		toEle.sendKeys("SBC",Keys.ENTER);
		
		List<WebElement> row = driver.findElements(By.xpath("//table[contains(@class, 'TrainListHeader stickyTrainListHeader')]//tr"));
		
		List<String> breforeSort = new ArrayList<String>();
		
		for (int i = 2; i < 10; i++) 
		{	
			String trainName = driver.findElement(By.xpath("//table[contains(@class, 'TrainListHeader stickyTrainListHeader')]//tr["+i+"]//td[2]")).getText();
			
			System.out.println(trainName);
			
			breforeSort.add(trainName);	
		}
		System.out.println(breforeSort.size());
		
		driver.findElement(By.xpath("//a[text()='Train Name']")).click();
		
        List<String> afterSort = new ArrayList<String>();
		
		for (int i = 2; i < 10; i++)
		{	
			String trainName = driver.findElement(By.xpath("//table[contains(@class, 'TrainListHeader stickyTrainListHeader')]//tr["+i+"]//td[2]")).getText();
			
			System.out.println(trainName);
			
			afterSort.add(trainName);	
		}
		
		System.out.println(afterSort.size());
		
		if (breforeSort.size()==afterSort.size()) 
		{
			System.out.println("Both Size are same");
			
		}
		else {
			
			System.out.println("Both Size Not Same");
		}
	}

}

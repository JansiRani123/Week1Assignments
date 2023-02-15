package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AssButton {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		String titleOfCurrent = driver.getTitle();
		
		driver.findElement(By.xpath("//span[contains(text(),'Click')]")).click();
		String titleOfClickedPage = driver.getTitle();
		
		if(titleOfClickedPage!=titleOfCurrent)
		{
			System.out.println("The Page Title is different");
			
		}
		driver.navigate().back();
		
		//2
		boolean statusOfButton = driver.findElement(By.xpath("//h5[contains(text(),'button is disabled')]/following::button[1]")).isEnabled();
        System.out.println(statusOfButton);
        Thread.sleep(2000);
        
        //3
        Point location = driver.findElement(By.xpath("//h5[contains(text(),'Submit')]/following::span[2]")).getLocation();
        System.out.println(location);
        
        //4
        String color = driver.findElement(By.xpath("//h5[contains(text(),'Save button color')]/following::button")).getCssValue("background-color");
        System.out.println(color);
        
        //5
        int height = driver.findElement(By.xpath("(//span[contains(text(),'Submit')])[2]")).getSize().getHeight();
        int width = driver.findElement(By.xpath("(//span[contains(text(),'Submit')])[2]")).getSize().getWidth();
        System.out.println(height +","+ width);
        
        //6
        String mouseBeforeColor = driver.findElement(By.xpath("//h5[contains(text(),'confirm the color')]/following::button[1]")).getCssValue("background-color");
        System.out.println(mouseBeforeColor);
        
        //7didn't teach
        
       /*WebElement mouseOverEle = driver.findElement(By.xpath("//h5[contains(text(),'confirm the color')]/following::button[1]"));
        Actions a=new Actions(driver);
        a.moveToElement(mouseOverEle);
        String colorAfter = mouseOverEle.getCssValue("background-color");
        System.out.println(colorAfter);
        */
        
        //8
        List<WebElement> roundElements = driver.findElements(By.xpath("//h5[contains(text(),'How many rounded buttons are there?')]/following::button"));
        int size = roundElements.size();
        
        System.out.println(size);
        
        
        
	}

}

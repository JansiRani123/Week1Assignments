package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import io.github.sukgu.Shadow;

public class AssSnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--Disable-Notification");
		ChromeDriver driver=new ChromeDriver();
		Shadow dom=new Shadow(driver);
		driver.get(" https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		//driver.switchTo().frame("loginIframe");
		WebElement mensEle = driver.findElement(By.xpath("//div[@class='leftNavWrapperRevamp']//span[2]"));
		Actions a=new Actions(driver);
		a.moveToElement(mensEle).perform();
		
		WebElement element = driver.findElement(By.xpath("//div[@class='colDataInnerBlk']//span[contains(text(),'Sports Shoes')]"));
		driver.executeScript("arguments[0].click()", element);
		
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='product-desc-rating ']//a"));
		int size = products.size();
		System.out.println(size);
		
		WebElement count = driver.findElement(By.xpath("//h1[contains(text(),'Sports Shoes for Men')]/following::span"));
		String text = count.getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("(//div[@class='child-cat-name '])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='sort-selected'])")).click();
		WebElement lowEle = driver.findElement(By.xpath("(//span[@class='arrow hidden'])[1]"));
		driver.executeScript("arguments[0].click()", lowEle);
		
		WebElement price = driver.findElement(By.xpath("//div[@class='price-text-box']/input[1]"));
		price.clear();
		price.sendKeys("600");
		
		WebElement priceTo = driver.findElement(By.xpath("(//div[@class='price-text-box'])[2]/input[1]"));
		priceTo.clear();
		priceTo.sendKeys("1000");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='price-input']/following::div[3]")).click();
		Thread.sleep(2000);
		WebElement color = driver.findElement(By.xpath("(//div[@class='sdCheckbox filters-list '])[1]"));
		Thread.sleep(2000);
		WebElement prod1 = driver.findElement(By.xpath("//input[@id='sortVal']/following::div"));
		a.moveToElement(prod1).perform();
		driver.findElement(By.xpath("//div[@class='clearfix row-disc']/div")).click();
		WebElement priceDetails = driver.findElement(By.xpath("//span[@class='strikee ']/following::span[1]"));
		String text1 = priceDetails.getText();
		System.out.println(text1);
		WebElement priceDetail = driver.findElement(By.xpath("//span[@class='strikee ']/following::span[2]"));
		String text2 = priceDetail.getText();
		System.out.println(text2);
		
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("E:\\screenshots1.jpg");
		FileUtils.copyFile(SrcFile, DestFile);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"sidebar_modal_right\"]/div[2]/div[2]/i")).click();
		driver.close();
		
		
		
		
		
		
	}
}

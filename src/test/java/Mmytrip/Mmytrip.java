package Mmytrip;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Mmytrip extends util {

	public static String url = "https://www.makemytrip.com/";
	WebDriver Driver;
	@BeforeTest
	 public void BT  () throws InterruptedException
	 {
		WebDriverManager.chromedriver().setup();
		Driver = new ChromeDriver();
		Driver.get(url);
		Driver.manage().window().maximize();	
		Thread.sleep(3000);
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 }
	@Test
	public void test1 ()  throws InterruptedException{
		Thread.sleep(8000);
		
		Thread.sleep(6000);
		Driver.findElement(By.linkText("Holiday Packages")).click();
		Thread.sleep(6000);
		Driver.findElement(By.xpath("//*[@id='fromCity']")).click();
		Thread.sleep(6000);
		Driver.findElement(By.xpath("//*[text()='Bangalore']")).click();
		Thread.sleep(6000);
		Driver.findElement(By.id("toCity")).click();
		Thread.sleep(6000);
		Driver.findElement(By.xpath("//*[@class='dest-search-input']")).sendKeys("singapore");
		Thread.sleep(6000);
		Driver.findElement(By.xpath("//div[text()='Singapore']")).click();
		Thread.sleep(6000);
		Driver.findElement(By.xpath("//button[@data-cy='submit']")).click();
		Thread.sleep(9000);
		Driver.findElement(By.xpath("//*[@id='departure_date']")).click();
		Thread.sleep(9000);
		Driver.findElement(By.xpath("//div[@aria-label='Thu Nov 17 2022']")).click();
		Thread.sleep(6000);
		Driver.findElement(By.xpath("//*[@class='primaryBtn big fill btn btn-top-nav btn-lg']")).click();
		Thread.sleep(6000);
		
		WebElement slider=Driver.findElement(By.xpath("//*[@class='flexOne makeFlex']/div[3]//div/div//div/div[5]"));
		Thread.sleep(6000);
		Actions ac=new Actions(Driver);
		Thread.sleep(6000);
		ac.dragAndDropBy(slider,-170,0).build().perform();
		Thread.sleep(5000);
		JavascriptExecutor Dipak= ((JavascriptExecutor)Driver);
		Dipak.executeScript("window.scroll(0,1000)");
		Thread.sleep(5000);
		Driver.findElement(By.xpath("//*[@class='Container']/div/div[4]/div/div[2]/div/div/div/div/div")).click();
		Thread.sleep(5000);
		System.out.println(Driver.getTitle());
		
		ArrayList<String> tabs = new ArrayList<String> (Driver.getWindowHandles());
		int s=tabs.size();
		System.out.println(s);
		Driver.switchTo().window(tabs.get(1));	
		Thread.sleep(5000);
		
		WebElement ele=Driver.findElement(By.xpath("//*[@class='hotel-row-wrapper ']/div/div/div/span"));
		ele.click();
		util.scrollIntoView(ele, Driver);
	
		Thread.sleep(5000);
		
		WebElement ele1 =Driver.findElement(By.xpath("//*[@class='sidePanelBody']/div[2]/div[2]/div[7]/span"));
		ele1.click();
		Thread.sleep(5000);
		Driver.findElement(By.xpath("//*[@class='makeFlex column packageUpdate']/div/p")).click();
		Thread.sleep(5000);
		
		WebElement ele2=Driver.findElement(By.xpath("//*[@class='add-activity-container']/div[2]"));
		ele2.click();
		util.scrollIntoView(ele2, Driver);
		Thread.sleep(5000);
		
		WebElement ele3=Driver.findElement(By.xpath("//*[@class='sidePanelBody']/div[2]/div[2]/div[3]/span"));
		ele3.click();
		util.scrollIntoView(ele3, Driver);
		Thread.sleep(8000);
		
		Driver.findElement(By.xpath("//*[@class='makeFlex column packageUpdate']/div/p")).click();
		Thread.sleep(7000);
		Driver.findElement(By.xpath("//*[@class='initerary-nav']/li[2]")).click();
		Thread.sleep(5000);
		Driver.findElement(By.xpath("//*[@class='initerary-nav']/li[3]")).click();
		Thread.sleep(5000);
		Driver.findElement(By.xpath("//*[@class='initerary-nav']/li[4]")).click();
		Thread.sleep(5000);
		Driver.findElement(By.xpath("//*[@class='initerary-nav']/li[5]")).click();
		Thread.sleep(5000);
		Driver.quit();
	
	}
}
	





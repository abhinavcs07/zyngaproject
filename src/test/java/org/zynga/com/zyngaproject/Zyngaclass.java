package org.zynga.com.zyngaproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Zyngaclass {
	
	private static final String Priority = null;
	public static String URL= "https://zynga.com";
	WebDriver driver;
	
	 // WebDriver driver = new FirefoxDriver();
	
	
	@BeforeTest
	public void browser (){
	driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get(URL);
	}
	
	@Test
	public void dropdown() throws InterruptedException{
	Actions action= new Actions (driver);
	System.out.println("Test 1 is running");
	
	WebElement Games= driver.findElement(By.xpath(".//*[@id='mean-games-menu']/a"));
	WebElement Casino= driver.findElement(By.xpath(".//*[@id='mean-casino-menu']/a"));
	WebElement Company= driver.findElement(By.xpath(".//*[@id='mean-company-menu']/a"));
	WebElement Jobs= driver.findElement(By.xpath(".//*[@id='main-menu']/div[1]/ul/li[5]/a"));
	//WebElement Support= driver.findElement(By.xpath(".//*[@id='main-menu']/div[1]/ul/li[6]/a"));
	
	action.moveToElement(Games).perform();
	Thread.sleep(2000);
	action.moveToElement(Casino).perform();
	Thread.sleep(2000);
	action.moveToElement(Company).perform();
	Thread.sleep(2000);
	action.moveToElement(Jobs).click().perform();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(500);
	WebElement Support= driver.findElement(By.xpath(".//*[@id='main-menu']/div[1]/ul/li[6]/a"));
	action.moveToElement(Support).click().perform();
	Thread.sleep(3000);
	driver.navigate().back();
	
	}
	
	/*@Test
	public void belt()
	{
	Actions belt= new Actions (driver);
	System.out.println("Test 2 is running");
	
	WebElement FVTE= driver.findElement(By.xpath(".//*[@id='slick-views-heromini1-1-slider']/div/div/div[6]/div/div/div/a/img"));
	belt.moveToElement(FVTE).click().perform();
	//driver.navigate().back();
	
	WebElement WWF= driver.findElement(By.xpath(".//*[@id='slick-views-heromini1-1-slider']/div/div/div[7]/div/div/div/a/img"));
	belt.click().perform();
	
	WebElement CWF= driver.findElement(By.xpath(".//*[@id='slick-views-heromini1-1-slider']/div/div/div[8]/div/div/div/a/img"));
	belt.moveToElement(CWF).click().perform();
	}
	*/
/*	public void games(){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath(".//*[@id='mean-games-menu']/a")).click();	*/
		  

	
		
	}
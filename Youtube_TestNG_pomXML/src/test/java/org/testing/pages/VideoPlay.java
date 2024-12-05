package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VideoPlay {
	ChromeDriver driver;
	Properties pr;
	public VideoPlay (ChromeDriver driver , Properties pr)
	{
		this.driver = driver;
		this.pr = pr;
	}
	
	public void play () throws InterruptedException
	{
		Thread.sleep(1000);
    	WebElement search = driver.findElement(By.xpath(pr.getProperty("search")));
    	search.click();
		
		Thread.sleep(1000);
    	WebElement search1 = driver.findElement(By.xpath(pr.getProperty("search1")));
    	search1.sendKeys("Hanuman Chalisa by Hari om Sharan");
    	
    	
    	Thread.sleep(1000);
    	WebElement search2 = driver.findElement(By.xpath(pr.getProperty("search2")));
    	Actions ac = new Actions(driver);
    	for (int i =0; i<=4; i++)
    	{
    		ac.sendKeys(Keys.DOWN).perform();
    		Thread.sleep(1000);
    	}
    	
    	Thread.sleep(1000);
    	WebElement search3 = driver.findElement(By.xpath(pr.getProperty("search3")));
    	Actions ac1 = new Actions(driver);
    	ac.sendKeys(Keys.ENTER).perform();
    	
    	Thread.sleep(1000);
    	WebElement play = driver.findElement(By.linkText(pr.getProperty("play")));
    	play.click();}
    	
    	public void like () throws InterruptedException 
	
    	{Thread.sleep(2000);
    	WebElement like = driver.findElement(By.xpath(pr.getProperty("like")));
    	like.click();
    	
    	Thread.sleep(2000);
    	WebElement like1 = driver.findElement(By.xpath(pr.getProperty("like1")));
    	like1.click();
    	}
    	
    	public void subscription () throws InterruptedException
    	{
    		Thread.sleep(2000);
	    	WebElement subscribe = driver.findElement(By.id(pr.getProperty("subscribe")));
	    	subscribe.click();
    	}
    	
    	public void comment () throws InterruptedException
    	{
    		Thread.sleep(2000);
	    	WebElement page = driver.findElement(By.xpath(pr.getProperty("page")));
	    	Actions ac4 = new Actions (driver);
	    	ac4.sendKeys(Keys.PAGE_DOWN).perform();
	    	
	    	
	    	
	    	Thread.sleep(3000);
	    	WebElement comment = driver.findElement(By.xpath(pr.getProperty("comment")));
	    	comment.click();
	    	
	    	
	    	Thread.sleep(3000);
	    	WebElement comment1 = driver.findElement(By.xpath(pr.getProperty("comment1")));
	    	comment1.sendKeys("Jai Shri Ram");
    		
    	}
	
    	
    	
	

}

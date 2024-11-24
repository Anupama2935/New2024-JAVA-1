package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	
	ChromeDriver driver;
	Properties pr;
	public HomePage (ChromeDriver driver , Properties pr)
	{
		this.driver = driver;
		this.pr = pr;
	}
	public void trending () throws InterruptedException
	{
		 Thread.sleep(1000);
			WebElement trending = driver.findElement(By.xpath(pr.getProperty("trending")));
			trending.click();
	}
	public void history () throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement history = driver.findElement(By.xpath(pr.getProperty("history")));
		history.click();
	}
	public void subscription () throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement history = driver.findElement(By.xpath(pr.getProperty("subscription")));
		history.click();
	}
	
	public void watchLater () throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement watchlater = driver.findElement(By.xpath(pr.getProperty("watchlater")));
		watchlater.click ();
	}
	
	public void playList () throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement playlist = driver.findElement(By.xpath(pr.getProperty("playlist")));
		playlist.click();
	}
	
	

}

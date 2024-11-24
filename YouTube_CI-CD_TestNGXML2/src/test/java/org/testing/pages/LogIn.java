package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LogIn {
	
	ChromeDriver driver;
	Properties pr;
	public LogIn (ChromeDriver driver , Properties pr)
	{
		this.driver = driver;
		this.pr = pr;
	}
	public void signin (String Username , String Password) throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.linkText(pr.getProperty("login")));
		login.click();
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.xpath(pr.getProperty("email")));
		email.sendKeys(Username);
		Thread.sleep(3000);
		WebElement next = driver.findElement(By.xpath(pr.getProperty("next")));
		next.click();
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.xpath(pr.getProperty("password")));
		password.sendKeys(Password);
		Thread.sleep(3000);
		WebElement next1 = driver.findElement(By.xpath(pr.getProperty("next1")));
		next1.click();
	}
	public void signout () throws InterruptedException
	{
		Thread.sleep(1000);
    	WebElement outIcon = driver.findElement(By.id(pr.getProperty("outIcon")));
    	outIcon.click();
    	
    	Thread.sleep(1000);
    	WebElement outIcon1 = driver.findElement(By.id(pr.getProperty("outIcon")));
    	Actions ac2 = new Actions(driver);
    	for (int i=0; i<=3;i++)
    	{ac2.sendKeys(Keys.TAB).perform();
    	 Thread.sleep(1000);
    	}
    	Thread.sleep(1000);
    	WebElement outIcon2 = driver.findElement(By.id(pr.getProperty("outIcon2")));
    	Actions ac3 = new Actions(driver);
    	ac3.sendKeys(Keys.ENTER).perform();
    	}
    
    	
	}
		
	


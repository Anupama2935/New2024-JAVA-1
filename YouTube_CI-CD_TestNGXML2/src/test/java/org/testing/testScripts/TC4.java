package org.testing.testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testing.Base.Base;
import org.testing.pages.LogIn;
import org.testing.pages.VideoPlay;
import org.testing.utilities.log_Capture;
import org.testing.utilities.screenshot_Capture;
import org.testng.annotations.Test;

public class TC4 extends Base{
	 @Test
	    public void like () throws InterruptedException, IOException
	    {
		     LogIn in = new LogIn (driver, pr);
		     in.signin("tritu3981@gmail.com", "Barra284");
		     
		     VideoPlay v = new VideoPlay (driver, pr);
		     v.play();
		     v.like();
		     
             screenshot_Capture.screenshot("C:\\screenshots//fivth.png", driver);
			 
			 log_Capture.takeLog("Like Successful", "TC4");
		     
		     in.signout();

		     
 
 
	  /*
	  ***********************************************************************************************
	    	  Thread.sleep(3000);
			WebElement login = driver.findElement(By.linkText("Sign in"));
			login.click();
				
			Thread.sleep(3000);
			WebElement email = driver.findElement(By.xpath("//input[@type = 'email']"));
			email.sendKeys("annuutriupa@gmail.com");
			
			Thread.sleep(3000);
			WebElement next = driver.findElement(By.xpath("//span[text() = 'Next']"));
			next.click();
			
			Thread.sleep(3000);
			WebElement password = driver.findElement(By.xpath("//input[@name = 'Passwd']"));
			password.sendKeys("Barra284");
			
			Thread.sleep(3000);
			WebElement next1 = driver.findElement(By.xpath("//span[text() = 'Next']"));
			next1.click();
				
	    	Thread.sleep(1000);
	    	WebElement search = driver.findElement(By.xpath("//input[@id = 'search']"));
	    	search.click();
	    	
	    	Thread.sleep(1000);
	    	WebElement search1 = driver.findElement(By.xpath("//input[@id = 'search']"));
	    	search1.sendKeys("Hanuman Chalisa by Hari om Sharan");
	    	
	    	
	    	Thread.sleep(1000);
	    	WebElement search2 = driver.findElement(By.xpath("//input[@id = 'search']"));
	    	Actions ac = new Actions(driver);
	    	for (int i =0; i<=4; i++)
	    	{
	    		ac.sendKeys(Keys.DOWN).perform();
	    		Thread.sleep(1000);
	    	}
	    	
	    	Thread.sleep(1000);
	    	WebElement search3 = driver.findElement(By.xpath("//input[@id = 'search']"));
	    	Actions ac1 = new Actions(driver);
	    	ac.sendKeys(Keys.ENTER).perform();
	    	
	    	Thread.sleep(1000);
	    	WebElement play = driver.findElement(By.linkText("Shri Hanuman Chalisa | Hari Om Sharan | हनुमान चालीसा | Hanuman Bhajans | Hanuman Jayanti 2023"));
	    	play.click();
	    	
	    	
	    	Thread.sleep(2000);
	    	WebElement like = driver.findElement(By.xpath("(//like-button-view-model [@class = 'YtLikeButtonViewModelHost']) [1]"));
	    	like.click();
	    	
	    	Thread.sleep(2000);
	    	WebElement like1 = driver.findElement(By.xpath("(//like-button-view-model [@class = 'YtLikeButtonViewModelHost']) [1]"));
	    	like1.click();
	    	
	    	
	        Thread.sleep(1000);
	    	WebElement outIcon = driver.findElement(By.id("avatar-btn"));
	    	outIcon.click();
	    	
	    	Thread.sleep(1000);
	    	WebElement outIcon1 = driver.findElement(By.id("avatar-btn"));
	    	Actions ac2 = new Actions(driver);
	    	for (int i=0; i<=3;i++)
	    	{ac2.sendKeys(Keys.TAB).perform();
	    	 Thread.sleep(1000);
	    	}
	    	Thread.sleep(1000);
	    	WebElement outIcon2 = driver.findElement(By.id("avatar-btn"));
	    	Actions ac3 = new Actions(driver);
	    	ac3.sendKeys(Keys.ENTER).perform();*/
	    	}
	    

}

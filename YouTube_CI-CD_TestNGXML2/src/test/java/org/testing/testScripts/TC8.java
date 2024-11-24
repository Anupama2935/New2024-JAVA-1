package org.testing.testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testing.Base.Base;
import org.testing.pages.HomePage;
import org.testing.pages.LogIn;
import org.testing.utilities.log_Capture;
import org.testing.utilities.screenshot_Capture;
import org.testng.annotations.Test;

public class TC8 extends Base{
	 @Test
	    public void library () throws InterruptedException, IOException
	    {
		 
		 LogIn in = new LogIn (driver, pr);
		 in.signin("tritu3981@gmail.com", "Barra284");
		 
		 HomePage home = new HomePage (driver, pr);
		 home.playList();
		 
		 screenshot_Capture.screenshot("C:\\screenshots//nine.png", driver);
		 
		 log_Capture.takeLog("playlist Successful", "TC8");
	     
		 
		 in.signout();
		 /*
		 ************************************************************************************************
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
			
			Thread.sleep(3000);
			WebElement playlist = driver.findElement(By.xpath("(//yt-formatted-string[text() = 'Playlists']) [1]"));
			playlist.click();
			

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
	    	ac3.sendKeys(Keys.ENTER).perform();
	    	*/
	    	}
	    

}

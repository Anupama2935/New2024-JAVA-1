package org.testing.testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.assertion.assertion;
import org.testing.pages.HomePage;
import org.testing.pages.LogIn;
import org.testing.utilities.log_Capture;
import org.testing.utilities.screenshot_Capture;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1 extends Base

{
	@Test
	  public void trending () throws InterruptedException, IOException
		{
		   /* Thread.sleep(1000);
			WebElement trending = driver.findElement(By.xpath(pr.getProperty("trending")));
			trending.click();*/
		LogIn in = new LogIn (driver, pr);
		in.signin("tritu3981@gmail.com", "Barra284");
		
		log_Capture.takeLog("Login Successful", "TC1" );
		
	
		
		screenshot_Capture.screenshot("C:\\screenshots//first.png", driver);
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.youtube.com/");
		
		assertion.assert1("https://www.youtube.com/", driver.getCurrentUrl());
		
		
		
		 HomePage home = new HomePage (driver, pr);
		 home.trending();
		 
		 log_Capture.takeLog("Trending Successful", "TC1" );
		 
		 screenshot_Capture.screenshot("C:\\screenshots//second.png", driver);
		 in.signout();
		}
		
		
			
		
	
	

}

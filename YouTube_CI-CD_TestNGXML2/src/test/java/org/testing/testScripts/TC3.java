package org.testing.testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.pages.HomePage;
import org.testing.pages.LogIn;
import org.testing.utilities.log_Capture;
import org.testing.utilities.screenshot_Capture;
import org.testng.annotations.Test;

public class TC3 extends Base
{
	 @Test
	    public void subscription () throws InterruptedException, IOException
	    {
		    /*Thread.sleep(2000);
	    	WebElement subscription = driver.findElement(By.xpath(pr.getProperty("subscription")));
	    	subscription.click();*/
		 LogIn in = new LogIn (driver, pr);
			in.signin("tritu3981@gmail.com", "Barra284");
			
			 HomePage home = new HomePage (driver, pr);
			 home.subscription();
			 
			 screenshot_Capture.screenshot("C:\\screenshots//fourth.png", driver);
			 
			 log_Capture.takeLog("Subscription Successful", "TC3");
			 
			 in.signout();
	    	
	    }
	    

}

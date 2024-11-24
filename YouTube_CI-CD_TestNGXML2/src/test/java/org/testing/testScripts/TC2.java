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

public class TC2 extends Base
    { 
	@Test
	public void history () throws InterruptedException, IOException
	{
		/*Thread.sleep(2000);
		WebElement history = driver.findElement(By.xpath(pr.getProperty("history")));
		history.click();*/
		
		LogIn in = new LogIn (driver, pr);
		in.signin("tritu3981@gmail.com", "Barra284");
		
		
		
		 HomePage home = new HomePage (driver, pr);
		 home.history();
		 
		 screenshot_Capture.screenshot("C:\\screenshots//third.png", driver);
		 
		 log_Capture.takeLog("History Successful", "TC2");
		 
		 in.signout();
		 
	}

}

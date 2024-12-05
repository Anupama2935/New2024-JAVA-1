package org.testing.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class screenshot_Capture {
	
	public static void screenshot (String filepath , ChromeDriver driver) throws IOException
	{
     File f =	driver.getScreenshotAs(OutputType.FILE);
     FileUtils.copyFile(f, new File (filepath));
     
		
	}

}

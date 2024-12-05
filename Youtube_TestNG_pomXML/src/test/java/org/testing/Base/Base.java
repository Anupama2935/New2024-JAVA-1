package org.testing.Base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	
  public ChromeDriver driver = new ChromeDriver ();
   public Properties pr;  
	
	@BeforeMethod
	public void browserlaunch () throws IOException, InterruptedException
	{
		Thread.sleep(2000);
		File f = new File ("../Youtube_TestNG_pomXML/object.properties");
		FileReader fr = new FileReader (f);
		 pr = new Properties ();
		pr.load(fr);
		
		
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void bowserclose () throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}}



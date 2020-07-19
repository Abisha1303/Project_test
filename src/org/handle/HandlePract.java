package org.handle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePract {
	public static void main(String[] args) throws InterruptedException
	{
	 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ja enterprises\\eclipse-workspace\\AmazonWindows\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://toolsqa.com/automation-practice-switch-windows/");
	String parentWindowHandle = driver.getWindowHandle();
	
	 
	Set<String> allWindowHandles = driver.getWindowHandles();
	 
	for(String handle : allWindowHandles)
	{
	System.out.println("Window handle - > " + handle);
	}
	 
	}
	 
}

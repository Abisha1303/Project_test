package org.handle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;

public class AmazonHandle {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ja enterprises\\eclipse-workspace\\AmazonWindows\\driver\\chromedriver.exe");
	
	System.setProperty((ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY), "true");
	
	WebDriver drivr =new ChromeDriver();
	
	drivr.get("");

	drivr.manage().window().maximize();
	
	
	

	
} 
	
}



package org.frame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class Frame2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ja enterprises\\eclipse-workspace\\AmazonWindows\\driver\\chromedriver.exe");
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		WebDriver driver = new ChromeDriver();
					
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

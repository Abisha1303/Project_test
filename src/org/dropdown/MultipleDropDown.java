package org.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.io.ssl.SslClientConnectionFactory;

public class MultipleDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ja enterprises\\eclipse-workspace\\AmazonWindows\\driver\\chromedriver.exe");
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		
		
		WebElement fruits =driver.findElement(By.id("fruits"));
		
		Select s = new Select(fruits);
		
		boolean b = s.isMultiple();
		
		System.out.println(b);
		
		s.selectByIndex(2);
		s.selectByVisibleText("Apple");
		
		s.selectByValue("banana");
		
	
		
		
		

	}

}

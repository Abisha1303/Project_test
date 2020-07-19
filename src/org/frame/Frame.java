package org.frame;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Frame {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ja enterprises\\eclipse-workspace\\AmazonWindows\\driver\\chromedriver.exe");
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI\r\n");
		driver.manage().window().maximize();
		
		//driver.switchTo().frame(0);
		
		driver.findElement(By.id("DUMMY1")).click();
		
		
		driver.findElement(By.xpath("//input[@title='User Id']")).sendKeys("12334");
		
	
		driver.findElement(By.xpath("//input[@title='Password']")).sendKeys("tuygjhfd");
		
		Thread.sleep(3000);
		
		
		
	
		 WebElement drop = driver.findElement(By.xpath("(//div[@class='newListSelected'])[1]"));
		 
		 Actions a=new Actions(driver);
		 
		 a.click();
//		
//		driver.findElement(By.xpath("//a[text()='Bank Account']")).click();
//		
//		 Robot r=new Robot();
//			
//			r.keyPress(KeyEvent.);
		 
		// driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

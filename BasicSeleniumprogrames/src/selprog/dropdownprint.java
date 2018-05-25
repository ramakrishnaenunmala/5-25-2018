package selprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dropdownprint {
	@Test
	public void login() throws Exception{
		
	WebDriver driver= new ChromeDriver();
	driver.get("https://mail.google.com/mail/u/0/#inbox");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("swathireddy.v12@gmail.com");
	WebElement ObjNext = driver.findElement(By.xpath("//div[@class='qhFLie']/div/content/span"));
	ObjNext.click();
	driver.findElement(By.name("password")).sendKeys("s");
	ObjNext.click();
	}

	
}

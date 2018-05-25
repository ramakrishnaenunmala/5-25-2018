package selprog;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Multiplebrowsers 

{
	@Test
	public void m1() throws Exception{
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Demp\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://qaplanet.in");
	driver.findElement(By.xpath("//div[@id='section-tophat']/div[1]/div/div[2]/ul/li/a")).click();
	driver.findElement(By.xpath("//div[@id='section-tophat']/div[1]/div/div[2]/ul/li[2]/a")).click();
	driver.findElement(By.xpath("//div[@id='section-tophat']/div[1]/div/div[2]/ul/li[3]/a")).click();
	
	Thread.sleep(4000);
	
	Set<String> IDS=driver.getWindowHandles();
	Iterator<String> itr=IDS.iterator();
	String first_id=itr.next();
	
		System.out.println("First window id is:"+ first_id);
	
	String second_id=itr.next();
	
	System.out.println("second window id is"+ second_id);
	
	String third_id=itr.next();
	
	System.out.println("third window id is"+third_id);
	
	String four_id=itr.next();
	
	System.out.println("fourth window id is"+ four_id);
	
	String parentWindow =driver.getWindowHandle().toString();
	
		System.out.println( "parent Window id is"+ parentWindow);
		String currWindow=driver.getWindowHandle().toString();
		
		System.out.println("current window id is"+ currWindow);
		driver.findElement(By.linkText("ABOUT US")).click();
		System.out.println("window title: "+driver.getTitle());
		
		
	driver.switchTo().window(third_id);
	System.out.println("currWindow:"+driver.getCurrentUrl());
	driver.close();
	driver.switchTo().window(first_id);
	System.out.println("currWindow:"+driver.getCurrentUrl());
	driver.quit();
	/*driver.findElement(By.xpath("//div[@class='pull-right nav-extras']/ul[2]/li/a]")).click();
	
	
	driver.findElement(By.name("session[username_or_email]")).sendKeys("swathireddy.v18@gmail.com");
	driver.switchTo().window(first_id);
	*/
	
	
	}

}

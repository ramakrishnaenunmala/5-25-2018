package selprog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallelexecutiontestng1 {
	WebDriver driver;
	@Test
	@Parameters("browserName")
	public void verifypagetitle(String browserName)
	{
		if(browserName.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
					}
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("ie"))
		{
			driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.seleniumhq.org");
	}
	

	
	
}

package org.automation.testing.sampletestcaseforjenkinsautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_003_SampleTestCase3 {

	@Test
	public void fblogin()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("uname1");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.quit();
	}
}

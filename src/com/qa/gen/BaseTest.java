package com.qa.gen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	public WebDriver driver;
	@BeforeMethod
	public void baseopp() {
		System.setProperty("webdriver.gecko.driver","D:/JavaPrg/SimpleProj/exef/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.seleniumhq.org/");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

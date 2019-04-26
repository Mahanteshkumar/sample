package com.jen;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qa.gen.BaseTest;

public class Demo1 extends BaseTest{
	@Test
	public void testcase1() throws InterruptedException{
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//li[@id='menu_download']")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[.='Projects']")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.findElement(By.id("q")).sendKeys("chrome");
		driver.findElement(By.id("submit"));
		
	}
}
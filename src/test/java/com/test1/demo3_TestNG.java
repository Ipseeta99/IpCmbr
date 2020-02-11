package com.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class demo3_TestNG {
  
	WebDriver driver=null;
	@Test
  public void f() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a07208trng_b4b.04.25\\Desktop\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email") ).sendKeys("wanderingkesh@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Test$123");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();;
		
  }
}

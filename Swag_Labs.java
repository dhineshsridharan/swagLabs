package com.project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swag_Labs {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sridharan\\eclipse-workspace\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement idname = driver.findElement(By.xpath("//input[@id='user-name']"));
		idname.sendKeys("standard_user");
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("secret_sauce");
		System.out.println("Standard user login successfully");
		TakesScreenshot tc = (TakesScreenshot) driver;
		File src = tc.getScreenshotAs(OutputType.FILE);
		File ds = new File("C:\\Users\\Sridharan\\eclipse-workspace\\Selenium\\ScreenShot\\standard_user.png");
		FileUtils.copyFile(src, ds);
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
		Thread.sleep(2000);
	    driver.navigate().back();
		
		
		WebElement idname1 = driver.findElement(By.xpath("//input[@id='user-name']"));
		idname1.sendKeys("problem_user");
		Thread.sleep(2000);
		WebElement password1 = driver.findElement(By.xpath("//input[@name='password']"));
		password1.sendKeys("secret_sauce");
		System.out.println("Problem user login sucessfully");
		TakesScreenshot tc1 = (TakesScreenshot) driver;
		File src1 = tc1.getScreenshotAs(OutputType.FILE);
		File ds1 = new File("C:\\Users\\Sridharan\\eclipse-workspace\\Selenium\\ScreenShot\\problem_user.png");
		FileUtils.copyFile(src1, ds1);
		WebElement login1 = driver.findElement(By.xpath("//input[@type='submit']"));
		login1.click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		WebElement idname2 = driver.findElement(By.xpath("//input[@id='user-name']"));
		idname2.sendKeys("performance_glitch_user");
		Thread.sleep(2000);
		WebElement password2 = driver.findElement(By.xpath("//input[@name='password']"));
		password2.sendKeys("secret_sauce");
		System.out.println("Performance user login sucessfully");
		TakesScreenshot tc2 = (TakesScreenshot) driver;
		File src2 = tc2.getScreenshotAs(OutputType.FILE);
		File ds2 = new File("C:\\Users\\Sridharan\\eclipse-workspace\\Selenium\\ScreenShot\\performance_glitch_user.png");
		FileUtils.copyFile(src2, ds2);
		WebElement login2 = driver.findElement(By.xpath("//input[@type='submit']"));
		login2.click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		WebElement idname3 = driver.findElement(By.xpath("//input[@id='user-name']"));
		idname3.sendKeys("locked_out_user");
		Thread.sleep(2000);
		WebElement password3 = driver.findElement(By.xpath("//input[@name='password']"));
		password3.sendKeys("secret_sauce");
		System.out.println("locked user should not login");
		WebElement login3 = driver.findElement(By.xpath("//input[@type='submit']"));
		login3.click();
		Thread.sleep(2000);
		TakesScreenshot tc3 = (TakesScreenshot) driver;
		File src3 = tc3.getScreenshotAs(OutputType.FILE);
		File ds3 = new File("C:\\Users\\Sridharan\\eclipse-workspace\\Selenium\\ScreenShot\\locked_out_user.png");
		FileUtils.copyFile(src3, ds3);
		driver.quit();
		
		
		
		
		
		
       
		
		
	}

}

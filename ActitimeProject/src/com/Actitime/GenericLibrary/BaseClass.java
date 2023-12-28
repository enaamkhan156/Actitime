package com.Actitime.GenericLibrary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public  WebDriver driver;
	@BeforeSuite
	public void connectDatabase()
	{
		Reporter.log("database connected",true);
	}
	@BeforeClass
	public void launchBrowser()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://online.actitime.com/student54");
		Reporter.log("browser launched",true);
	}
	@BeforeMethod
	public void login()
	{
		driver.findElement(By.id("username")).sendKeys("enamullah522@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("%45zn@9u");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Reporter.log("logged in successfully",true);
	}
	@AfterMethod
		public void logout()
		{
			driver.findElement(By.id("logoutLink")).click();
			Reporter.log("logged out successfully",true);
		}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
		Reporter.log("browser sucessfully closed",true);
				
	}
	@AfterSuite
	public void DisconnectDatabase()
	{
		Reporter.log("database disconnected sucessfully",true);
	}

}




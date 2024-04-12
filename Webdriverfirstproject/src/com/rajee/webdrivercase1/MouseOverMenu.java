package com.rajee.webdrivercase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverMenu {

	
	public static void main(String[] args) {
		// for launching the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1768114\\eclipse-workspace\\Webdriverfirstproject\\chromedriver-win32\\chromedriver.exe");
		//just open the chrome engine
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions builder=new Actions(driver);
		WebElement mouseelement=driver.findElement(By.id("nav_cs_5"));
		builder.moveToElement(mouseelement).build().perform();

	}
}

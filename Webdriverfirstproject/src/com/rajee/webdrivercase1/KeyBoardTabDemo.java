package com.rajee.webdrivercase1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardTabDemo {
	
	public static void main(String[] args) {
		// for launching the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1768114\\eclipse-workspace\\Webdriverfirstproject\\chromedriver-win32\\chromedriver.exe");
		//just open the chrome engine
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/advanced_search");
		//TAB OPERATION
		driver.findElement(By.id("xX4UFf")).sendKeys(Keys.TAB);
		// 
		driver.findElement(By.id("mSoczb")).sendKeys(Keys.TAB);
		

}
}
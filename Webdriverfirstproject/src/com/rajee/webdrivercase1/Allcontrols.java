package com.rajee.webdrivercase1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Allcontrols {
	
	public static void main(String[] args) {
		//launch the chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1768114\\eclipse-workspace\\Webdriverfirstproject\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// to open an URL
		driver.get("https://softwaretesting-guru.blogspot.com/p/main-page.html?_sm_au_=iVVMVK0WQsVK0WWPM7BKNK07qH22M");
		// to handle the hyper link inside the page 
		driver.manage().window().maximize();
		WebElement a=driver.findElement(By.linkText("Selenium Practice page"));
		a.click();
		// to find the text box
		WebElement b=driver.findElement(By.name("Name"));
		b.sendKeys("selenium");
		
		// to find check box
		WebElement c=driver.findElement(By.name("subscribe"));
		c.click();
		// to handle text area
		WebElement d=driver.findElement(By.name("comments"));
		d.sendKeys("hello welcome");
		// to handle drop down we need to use select constructor
		WebElement e=driver.findElement(By.name("countries"));
		//new Select(driver.findElement(By.name("countries")).selectByVisibleText("Argentina"));
		Select s=new Select(e);
		s.selectByVisibleText("Argentina");
		// to handel pswd
		WebElement f=driver.findElement(By.name("pwd"));
		f.sendKeys("rajeevi");
		driver.quit();
		
		
		
	}

}

package com.rajee.webdrivercase1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Extractobject {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\1768114\\eclipse-workspace\\Webdriverfirstproject\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	/*driver.get("https://www.w3schools.com/html/html_tables.asp");
	// to get TEXT by using Xpath
	String Text=driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[4]/td[2]")).getText();
	System.out.println(Text);*/
	// to get TOOLTIP TEXT
	driver.get("https://www.google.com");
	//b.sendKeys("advance search");
	driver.findElement(By.name("q")).sendKeys("advancesearch");
	String Tool=driver.findElement(By.name("q")).getAttribute("title");
	System.out.println(Tool);
	
	
	
}
}

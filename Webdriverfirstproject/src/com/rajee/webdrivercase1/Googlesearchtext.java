package com.rajee.webdrivercase1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearchtext {
	public static void main(String[] args) {
		// for launching the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1768114\\eclipse-workspace\\Webdriverfirstproject\\chromedriver-win32\\chromedriver.exe");
		//just open the chrome engine
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//can open any link present in the quotes
		driver.get("https://www.google.com");
		WebElement b=driver.findElement(By.name("q"));
		b.sendKeys("selenium");
		b.submit();
		//List<WebElement> a=driver.findElements(By.cssSelector(".webstoreToast"));
		//a.sendKeys("selenium");
		/*if (a.size()>=2) {
			a.get(1).click();
			
		}
		else {
			System.out.println("No");
		}
		
		//a.sendKeys(Keys.ENTER);
		//driver.quit();
		//driver.find_element_by_name("q");
		
		//driver.submit();*/
		
		
		
	}
}

package org.pomtsk;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Utility {
	
	static WebDriver driver;
	public static void launchApp(String s)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Mavenproject\\io\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(s);
		
	}
	public static void loginFill(WebElement w, String s) {
		
		w.sendKeys(s);
		
	}
	public static void lgnbtnClic(WebElement w) {
		
		w.click();
				
	}
	public static void drpDown(WebElement w,int i) {
		
		Select s = new Select(w);
		s.selectByIndex(i);
		
	}
	public static void radBtn(WebElement w) {
		
		w.click();
	}
	
	public static void webTable(WebElement w) {
		List<WebElement> row = driver.findElements(By.tagName("tr"));
		for(WebElement x:row){
			
			List<WebElement> data = x.findElements(By.tagName("td"));
			for(WebElement y:data) {
				
				String name = y.getText();
				
				System.out.println(name);
			
				}
			
		}
		
		
		
		
	}
}

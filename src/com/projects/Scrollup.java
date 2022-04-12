package com.projects;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scrollup{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Vignesh\\\\eclipse-workspace\\\\Selenium_projects\\\\Driver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement book = driver.findElement(By.xpath("//a[text()='Books:']"));
		js.executeScript("arguments[0].scrollIntoView();", book);
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-3000)");
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,2000)");
		
	}

}


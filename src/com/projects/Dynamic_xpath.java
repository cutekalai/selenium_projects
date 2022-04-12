package com.projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamic_xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vignesh\\eclipse-workspace\\Selenium_projects\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		/*WebElement email = driver.findElement(By.xpath("//div[@class='_6lux']//child::input[@id='email']"));
		email.sendKeys("cutekalai@gmail.com");
		WebElement password = driver.findElement(By.xpath("//div[@class='_6lux']//descendant::input[@id='pass']"));
		password.sendKeys("kalai@123");
		WebElement login = driver.findElement(By.xpath("//div[@class='_8icz']//preceding::button"));
		login.click();*/
		
		WebElement email = driver.findElement(By.xpath("//input[@id='pass']//preceding::input[@id='email']"));
		email.sendKeys("kalai@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@id='email']//following::input"));
		pass.sendKeys("kalai@123");
		
	}

}

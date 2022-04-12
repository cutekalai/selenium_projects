package com.projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
						"C:\\Users\\Vignesh\\eclipse-workspace\\Selenium_projects\\Driver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				 driver.get("https://www.google.com/");
				 
				 driver.manage().window().maximize();
				  String title = driver.getTitle();
				  System.out.println( title);
				  
				  String currentUrl = driver.getCurrentUrl();
				  System.out.println(currentUrl);
						
				  driver.navigate().to("https://twitter.com");
				  Thread.sleep(3000);
				  driver.navigate().back();
				  Thread.sleep(3000);
				  driver.navigate().forward();
				  Thread.sleep(3000);
				 driver.navigate().refresh();
				  
				  driver.close();
				  
				  driver.get("https://www.instagram.com");
				  driver.findElement(By.name("username")).sendKeys("123@gmail.com");
				  
				  
			}

		

	

}

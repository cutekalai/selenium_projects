package com.projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxdriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Vignesh\\eclipse-workspace\\Selenium_projects\\Firefox\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

	}
}

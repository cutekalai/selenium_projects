package com.projects;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_concepts {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vignesh\\eclipse-workspace\\Selenium_projects\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("singleframe");
		WebElement single = driver.findElement(By.xpath("//input[@type='text']"));
		single.sendKeys("cute");
		
		driver.switchTo().defaultContent();
		
		WebElement multi = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		multi.click();
		
		WebElement outer = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outer);
		
		WebElement inner = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(inner);
		
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("kalai");
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
	}
}


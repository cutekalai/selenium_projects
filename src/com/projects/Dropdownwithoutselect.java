package com.projects;


import java.awt.AWTException;
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
public class Dropdownwithoutselect {
     
     
    public static void main(String[] args) throws InterruptedException  {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vignesh\\eclipse-workspace\\Selenium_projects\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
         
        Thread.sleep(3000);
        //scroll down the page
         
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
         
        //Click on Country Dropdown
  
        driver.findElement(By.name("country")).click();
         
        List<WebElement> allOptions = driver.findElements(By.xpath("//select[@name='country']//option"));
        System.out.println(allOptions.size());
         
                 
                 
        for(int i = 0; i<=allOptions.size()-1; i++) {
             
             
            if(allOptions.get(i).getText().contains("ANGOLA")) {
                 
                allOptions.get(i).click();
                break;
                 
            }
        }
         
}
 
}


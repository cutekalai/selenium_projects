package com.projects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automationproject_kalai {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Vignesh\\eclipse-workspace\\Selenium_projects\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement signin = driver.findElement(By.xpath("//a[@class=	'login']"));
		signin.click();
		
		WebElement emailid = driver.findElement(By.id("email"));
		emailid.sendKeys("k.kalaiselvi.sep4@mail.com");
		
		WebElement password = driver.findElement(By.name("passwd"));
		password.sendKeys("123456");
		
		WebElement submit = driver.findElement(By.id("SubmitLogin"));
		submit.click();
		
		WebElement women = driver.findElement(By.xpath("(//a[@title='Women'])[1]"));
		women.click();
		
		WebElement list = driver.findElement(By.xpath("//a[@title='List']"));
		list.click();
		
		WebElement fadeddress = driver.findElement(By.xpath("(//a[@class='product-name'])[1]"));
		fadeddress.click();
		
		WebElement quantity = driver.findElement(By.id("quantity_wanted"));
		quantity.clear();
		quantity.sendKeys("2");
		
		WebElement size = driver.findElement(By.id("group_1"));
		Select s=new Select(size);
		s.selectByIndex(1);
		
		WebElement addcart = driver.findElement(By.xpath("//*[text()='Add to cart']"));
		addcart.click();
		
		WebElement signout = driver.findElement(By.xpath("//a[@class='logout']"));
		signout.click();
		
		WebElement signin2 = driver.findElement(By.xpath("//a[@class=	'login']"));
		signin2.click();
		
		WebElement emailid2 = driver.findElement(By.id("email"));
		emailid2.sendKeys("k.kalaiselvi.sep4@mail.com");
		
		WebElement password2 = driver.findElement(By.name("passwd"));
		password2.sendKeys("123456");
		
		WebElement submit2 = driver.findElement(By.id("SubmitLogin"));
		submit2.click();
		
		WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		dresses.click();
		
		WebElement list2 = driver.findElement(By.xpath("//a[@title='List']"));
		list2.click();
		
		WebElement purchasedress = driver.findElement(By.xpath("(//a[@class='product-name'])[3]"));
		purchasedress.click();
		
		WebElement addcart2 = driver.findElement(By.xpath("//*[text()='Add to cart']"));
		addcart2.click();
		
		WebElement signout2 = driver.findElement(By.xpath("//a[@class='logout']"));
		signout2.click();
		
		WebElement signin3 = driver.findElement(By.xpath("//a[@class=	'login']"));
		signin3.click();
		
		WebElement emailid3 = driver.findElement(By.id("email"));
		emailid3.sendKeys("k.kalaiselvi.sep4@mail.com");
		
		WebElement password3 = driver.findElement(By.name("passwd"));
		password3.sendKeys("123456");
		
		WebElement submit3 = driver.findElement(By.id("SubmitLogin"));
		submit3.click();
		
		WebElement tshirts = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		tshirts.click();
		
		WebElement list3 = driver.findElement(By.xpath("//a[@title='List']"));
		list3.click();
		
		WebElement tshirtsorder = driver.findElement(By.xpath("(//a[@title='Faded Short Sleeve T-shirts'])[2]"));
		tshirtsorder.click();
		
		WebElement addcart3 = driver.findElement(By.xpath("//*[text()='Add to cart']"));
		addcart3.click();
		
		WebElement proccedcheck = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		proccedcheck.click();
		
		WebElement proceedcheck2 = driver.findElement(By.xpath("//*[text()='Proceed to checkout']"));
		proceedcheck2.click();
		
		WebElement signin4 = driver.findElement(By.xpath("//a[@class=	'login']"));
		signin4.click();
		
		WebElement emailid4 = driver.findElement(By.id("email"));
		emailid4.sendKeys("k.kalaiselvi.sep4@mail.com");
		
		WebElement password4 = driver.findElement(By.name("passwd"));
		password4.sendKeys("123456");
		
		WebElement submit4 = driver.findElement(By.id("SubmitLogin"));
		submit4.click();
		
		WebElement proceedcheck3 = driver.findElement(By.xpath("//*[text()='Proceed to checkout']"));
		proceedcheck3.click();
		
		WebElement termsodconditions = driver.findElement(By.id("cgv"));
		termsodconditions.click();
		
		WebElement proceedcheck4 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		proceedcheck4.click();
		
		WebElement paybycheck = driver.findElement(By.xpath("//a[@title='Pay by check.']"));
		paybycheck.click();
		
		WebElement confirm = driver.findElement(By.xpath("//*[text()='I confirm my order']"));
		confirm.click();
		
		WebElement signout3 = driver.findElement(By.xpath("//a[@class='logout']"));
		signout3.click();
		
		
		
		
		
		
		
		
	}

}

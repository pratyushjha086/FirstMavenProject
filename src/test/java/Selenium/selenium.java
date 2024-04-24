package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class selenium {
	String driverPath = "C:\\Users\\Asus\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromeDriver.exe";
	
	 WebDriver  driver = new ChromeDriver();
	 @BeforeTest
	void login() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromeDriver.exe");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		 WebElement uname = driver.findElement(By.xpath("//input[@name= 'username']"));
         uname.sendKeys("Admin");
         WebElement pwd = driver.findElement(By.xpath("//input[@name= 'password']"));
         pwd.sendKeys("admin123");
         WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
         login.click();
         Thread.sleep(2000);
         WebElement buzz = driver.findElement(By.xpath("//a[@href='/web/index.php/buzz/viewBuzz']"));
         buzz.click();
        Thread.sleep(1000);
        WebElement post = driver.findElement(By.xpath("//textarea[@class='oxd-buzz-post-input']"));
        post.sendKeys("Pratyush kumar");
        TakesScreenshot TS = (TakesScreenshot)driver;
        Thread.sleep(2000);
        File src = TS.getScreenshotAs(OutputType.FILE);
        File DS = new File ("D:\\Out7.png");  
        Thread.sleep(2000);
        FileUtils.copyFile(src, DS);
        System.out.println("Screenshot is Captured");

        
        WebElement po = driver.findElement(By.xpath("//button[@type='submit']"));
        po.click();

	}
			
	
}

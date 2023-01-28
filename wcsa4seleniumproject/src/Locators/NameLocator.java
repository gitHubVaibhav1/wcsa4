package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         Thread.sleep(2000);
         driver.findElement(By.name("username")).sendKeys("abcd");
         Thread.sleep(2000);
         driver.findElement(By.name("password")).sendKeys("12345");
         Thread.sleep(2000);
         driver.findElement(By.tagName("button")).click();
	}

}

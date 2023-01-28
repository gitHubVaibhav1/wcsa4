package Xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByUniqueAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://demo.actitime.com/login.do");
 Thread.sleep(2000);
 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
 Thread.sleep(2000);
 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
 Thread.sleep(2000);
 driver.findElement(By.xpath("//a[@id='loginButton']")).click();
 Thread.sleep(2000);
	}

}

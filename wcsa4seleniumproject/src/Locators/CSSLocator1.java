package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocator1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("td[class$='SelectorButton']"));
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class^='content s']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class^='userProfile']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[id^='closeUser']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id^='logout']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[id^='container_re']")).click();
		Thread.sleep(2000);
	}

}

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class='initial']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[href^='/user/view']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[href^='/user/lock']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[href$='approve_tt.do']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[id='container_tasks']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[id='container_users']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[id='container_reports']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[id='container_tt']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class='productSwitcher']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class^='content corpo']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[id^='sortByUserButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[id='sortByUserGroupLink']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("td[class^='middle-left-cell']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id^='ext-gen10']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class^='content my']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[id^='ext-gen20']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id^='ext-gen32']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id^='ext-gen67']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id^='ext-gen83']")).click();
		Thread.sleep(2000);

		
	}

}

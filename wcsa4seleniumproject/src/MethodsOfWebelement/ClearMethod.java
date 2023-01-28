package MethodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	      System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	       driver.get("https://demo.actitime.com/login.do");
	       Thread.sleep(2000);
	       WebElement UsernameTextBox = driver.findElement(By.name("username"));
	       UsernameTextBox.sendKeys("admin");
	       
	       WebElement PasswordTextBox = driver.findElement(By.name("pwd"));
	       PasswordTextBox.sendKeys("manager");
	       Thread.sleep(2000);
	       UsernameTextBox.clear();
	       PasswordTextBox.clear();
	}

}

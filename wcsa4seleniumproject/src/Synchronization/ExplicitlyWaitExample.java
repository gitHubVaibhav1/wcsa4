package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("https://demo.actitime.com/login.do");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        Boolean check = wait.until(ExpectedConditions.titleContains("Login"));
        System.out.println(check);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();

        Boolean check1 = wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
        System.out.println(check1);
		
	}

}

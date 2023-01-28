package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkDisabledAndEnabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/abc/Desktop/web%20elements/Disabled&enabled.html");
		WebElement username = driver.findElement(By.id("i1"));
		boolean check = username.isEnabled();
		if (check == true) {
			username.sendKeys("manager");
		} else {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('i1').value='manager'");
		}
		WebElement username1 = driver.findElement(By.id("i2"));
		boolean check1 = username1.isEnabled();
		if (check1 == true) {
			username1.sendKeys("admin");
		} else {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('i1').value='admin'");
		}
	}

}

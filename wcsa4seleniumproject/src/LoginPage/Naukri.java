package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/nlogin/login");
        Thread.sleep(2000);
        driver.findElement(By.id("usernameField")).sendKeys("abcdef");
        Thread.sleep(2000);
        driver.findElement(By.id("passwordField")).sendKeys("12345");
        Thread.sleep(2000);
        driver.findElement(By.tagName("button")).click();
	}
}

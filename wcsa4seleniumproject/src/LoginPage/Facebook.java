package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login/");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("abcdef");
        Thread.sleep(2000);
        driver.findElement(By.id("pass")).sendKeys("12345");
        Thread.sleep(2000);
        driver.findElement(By.tagName("button")).click();
	}

}

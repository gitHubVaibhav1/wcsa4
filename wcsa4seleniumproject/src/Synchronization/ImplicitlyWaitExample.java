package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[.='✕']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[.='Cart']")).click();
        driver.findElement(By.xpath("//span[.='Login']")).click();
        
	}

}

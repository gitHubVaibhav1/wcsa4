package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.findElement(By.xpath("//button[.='✕']")).click();
      // WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
       
       driver.findElement(By.xpath("//a[@class='_3-PJz-']")).click();
       WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(30));
       Boolean check1 = wait1.until(ExpectedConditions.titleContains("Sell Online - Become a Online Seller in India | Flipkart Seller Hub"));
       System.out.println(check1);
        
        
	}

}

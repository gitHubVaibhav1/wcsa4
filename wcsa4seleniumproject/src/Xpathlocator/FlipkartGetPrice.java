package Xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartGetPrice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='✕']")).click();
        driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("laptop");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
        Thread.sleep(2000);
        String price= driver.findElement(By.xpath("//div[.='Lenovo IdeaPad 1 Ryzen 3 Dual Core 3250U - (8 GB/512 GB SSD/Windows 11 Home) 15ADA7 Thin and Light Lap...']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
        System.out.println(price);
        driver.quit();
        
	}

}

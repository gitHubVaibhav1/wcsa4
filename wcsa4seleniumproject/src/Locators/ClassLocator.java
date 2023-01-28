package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login/");
        Thread.sleep(2000);
        driver.findElement(By.className("inputtext _55r1 inputtext _1kbt inputtext _1kbt")).sendKeys("abcdef");
        Thread.sleep(2000);
        driver.findElement(By.className("inputtext _55r1 inputtext _9npi inputtext _9npi")).sendKeys("12345");
        Thread.sleep(2000);
        driver.findElement(By.tagName("button")).click();
	}

}

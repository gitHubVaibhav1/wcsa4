package Xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByLogicalOperator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://in.puma.com/in/en");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='cookie-banner-close-btn']")).click();
        Thread.sleep(2000);
        driver.findElements(By.xpath("//h3[@class='tw-8216tu' and (contains(.,'Softride Pro Coast Training Shoes'))]"));
        Thread.sleep(2000);
	}

}

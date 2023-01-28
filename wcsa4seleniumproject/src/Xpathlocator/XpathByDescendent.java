package Xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByDescendent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/downloads/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='About']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='dropdown-menu show']/descendant::a[.='Events']"));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Events']/ancestor::a[.='About']")).click();
	}

}

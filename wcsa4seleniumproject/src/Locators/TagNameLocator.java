package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("file:///C:/Users/abc/Desktop/web%20elements/textbox.html");
          Thread.sleep(2000);
          driver.findElement(By.tagName("input")).sendKeys("automation");
          
          
	}

}

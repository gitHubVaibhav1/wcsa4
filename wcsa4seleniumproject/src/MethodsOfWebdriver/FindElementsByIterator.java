package MethodsOfWebdriver;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsByIterator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        driver.switchTo().activeElement().sendKeys("Poha");
        Thread.sleep(4000);
        List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
         Iterator<WebElement> i = suggestions.iterator();
        while(i.hasNext())
        {
        	WebElement suggest = i.next();
        	Thread.sleep(2000);
        	System.out.println(suggest.getText());
        }
	}

}

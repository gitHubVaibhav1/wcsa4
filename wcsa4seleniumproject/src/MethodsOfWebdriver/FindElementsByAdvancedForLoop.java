package MethodsOfWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsByAdvancedForLoop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        driver.switchTo().activeElement().sendKeys("Poha");
        Thread.sleep(4000);
        List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
        for(WebElement suggestion:suggestions)
        {
        	System.out.println(suggestion.getText());
        }
	}

}

package MethodsOfWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.google.co.in/");
         driver.switchTo().activeElement().sendKeys("Poha");
         Thread.sleep(4000);
         List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
         for(int i=0;i<suggestions.size();i++)
         {
        	 WebElement element1 = suggestions.get(i);
        	 Thread.sleep(2000);
        	 String nameofelement = element1.getText();
        	 Thread.sleep(2000);
        	 System.out.println(nameofelement);
         }
         driver.quit();
	}

}

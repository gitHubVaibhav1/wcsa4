package MethodsOfWebdriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.navigate().to("https://www.google.co.in/");
     Thread.sleep(2000);
     driver.switchTo().activeElement().sendKeys("Java",Keys.ENTER);
	}

}

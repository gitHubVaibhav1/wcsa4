package MethodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://demo.actitime.com/login.do");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      WebElement element = driver.findElement(By.xpath("//input[@type='checkbox']"));
	      boolean status = element.isSelected();
	      System.out.println(status);
	      element.click();
	      boolean status1 = element.isSelected();
	      System.out.println(status1);
	}

}

package MethodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.instagram.com/accounts/login/");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  /*    WebElement element = driver.findElement(By.cssSelector("button[class='_acan _aiit _acap _aijb _acas _aj1-']"));
	      boolean status = element.isEnabled();
	      System.out.println(status);*/
	      driver.findElement(By.cssSelector("input[name=username]")).sendKeys("kumbharvr1@gmail.com");
	      driver.findElement(By.cssSelector("input[name=password]")).sendKeys("V@ibhav1");
	      WebElement element1 = driver.findElement(By.xpath("//button[@class='_acan _aiit _acap _aijb _acas _aj1-']"));
	      boolean status1 = element1.isEnabled();
	      System.out.println(status1); 
	}

}

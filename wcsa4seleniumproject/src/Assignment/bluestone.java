package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bluestone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    driver.get("https://www.bluestone.com/");
	  driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
	 // WebElement element = driver.findElement(By.id("chat-icon"));
	  driver.switchTo().frame("fc_widget");
	  Thread.sleep(2000);
	  driver.findElement(By.id("chat-icon")).click();
	  driver.switchTo().parentFrame();
	 driver.findElement(By.id("chat-fc-name")).sendKeys("admin");
	}

}

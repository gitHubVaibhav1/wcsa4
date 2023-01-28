package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class usernameframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    driver.get("file:///C:/Users/abc/Desktop/web%20elements/frame.html");
	    driver.switchTo().frame("frid");
	    driver.findElement(By.id("i1")).sendKeys("admin");
	    driver.switchTo().parentFrame();
	    driver.findElement(By.id("id1")).sendKeys("manager");
	}

}

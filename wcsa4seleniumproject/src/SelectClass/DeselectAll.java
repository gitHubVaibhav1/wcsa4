package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectAll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	      System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	       driver.get("file:///C:/Users/abc/Desktop/web%20elements/MultiDropdown&Link.html");
	       WebElement dropdown = driver.findElement(By.name("menu"));
	       Select sel = new Select(dropdown);
	       for (int i=0;i<=3;i++)
	       {
		       sel.selectByIndex(i);
		       Thread.sleep(4000);
	       }
	       sel.deselectAll();
	}

}

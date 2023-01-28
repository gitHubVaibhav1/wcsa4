package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class robotAssignment {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=CjwKCAiAqaWdBhAvEiwAGAQltlGKVtHChvAI2Y_ZNZ13OvNVUxcs-bS3wDyslYCIDYRC98zaVXprRRoCGEwQAvD_BwE");
        driver.findElement(By.xpath("//span[.='Allow']")).click();
        WebElement target = driver.findElement(By.xpath("//a[.='Watch Jewellery ']"));
        Actions act = new Actions(driver);
        act.moveToElement(target).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Band']")).click();
        WebElement target1 = driver.findElement(By.xpath("//div[.='Filter by']"));
        for(int i=0;i<=2;i++)
        {
        act.clickAndHold(target1).perform();
        }
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_C);
        WebElement searchbar = driver.findElement(By.xpath("//input[@name='search_query']"));
        searchbar.click();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_ENTER);
        
	}

}

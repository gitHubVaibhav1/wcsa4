package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        WebElement src = driver.findElement(By.xpath("//a[.=' BANK ']"));
        WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
        Actions act = new Actions(driver);
        act.dragAndDrop(src, target);
	}

}

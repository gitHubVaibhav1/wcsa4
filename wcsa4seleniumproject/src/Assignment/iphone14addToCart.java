package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iphone14addToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[.='✕']")).click();
        driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone 14");
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
        String parentHandle = driver.getWindowHandle();
        System.out.println(parentHandle);
        driver.findElement(By.xpath("//div[.='APPLE iPhone 14 ((PRODUCT)RED, 512 GB)']")).click();
        Set<String> allHandles = driver.getWindowHandles();
        for (String wh:allHandles)
        {
        	if(!parentHandle.equals(wh))
        	{
           driver.switchTo().window(wh);
        	}
        }
        driver.findElement(By.xpath("(//div[@class='_2C41yO'])[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='_36yFo0']")).sendKeys("411062");
        driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='_3dsJAO' and .='Remove']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ' and .='Remove']")).click();
        Thread.sleep(2000);
        driver.quit();
	}

}

package Assignment;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hplaptop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));

        driver.findElement(By.xpath("//button[.='✕']")).click();
        driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("laptop");
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
        driver.findElement(By.xpath("(//div[.='Core i5'])[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[.='Brand' and @class='_2gmUFU _3V8rao']")).click();
        driver.findElement(By.xpath("//div[.='HP']/preceding-sibling::div[@class='_24_Dny']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[.='Operating System' and @class='_2gmUFU _3V8rao']")).click();
        driver.findElement(By.xpath("(//div[.='Windows 10'])[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[.='4★ & above'])[3]")).click();
        String price= driver.findElement(By.xpath("//div[.='HP Pavilion Gaming Core i5 11th Gen - (8 GB/1 TB HDD/256 GB SSD/Windows 10 Home/4 GB Graphics/NVIDIA G...']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
        System.out.println(price);
        driver.quit();        
        
	}

}

package Mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class hpLaptop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//button[.='✕']")).click();
	    driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("laptop");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[.='Core i7']/preceding-sibling::div[@class='_24_Dny']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[.='Brand'and @class='_2gmUFU _3V8rao']")).click();
	    driver.findElement(By.xpath("//div[.='HP'and @class='_3879cV']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[.='Operating System'and @class='_2gmUFU _3V8rao']")).click();
	    driver.findElement(By.xpath("//div[.='Windows 10'and @class='_3879cV']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[.='4★ & above'and @class='_3879cV']")).click();
	    Thread.sleep(2000);
	    String price = driver.findElement(By.xpath("//div[.='HP Chromebook Intel Core i7 11th Gen - (16 GB/1 TB SSD/Windows 10 Home) 14-dv0058TU Thin and Light Lap...']/ancestor::div[@class='_3pLy-c row']//div[@class='_30jeq3 _1_WHN1']")).getText();
	    System.out.println(price);
	}

}

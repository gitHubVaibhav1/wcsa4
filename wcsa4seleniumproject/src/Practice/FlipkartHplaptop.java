package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartHplaptop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Laptop");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//div[.='Core i5']/preceding-sibling::div[@class='_24_Dny']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[.='Brand' and @class='_213eRC _2ssEMF']")).click();
		driver.findElement(By.xpath("//div[.='HP' and @class='_3879cV']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[.='4★ & above' and @class='_3879cV']")).click();
	   String price = driver.findElement(By.xpath("//div[.='HP Victus Intel Core i5 12th Gen - (8 GB/512 GB SSD/Windows 11 Home/4 GB Graphics/NVIDIA GeForce GTX 1...']/ancestor::div[@class='_3pLy-c row']//div[@class='_30jeq3 _1_WHN1']")).getText();
		System.out.println(price);
		
	}

}

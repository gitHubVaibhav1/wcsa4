package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    driver.get("https://www.ebay.com/");
	    driver.findElement(By.xpath("//button[@id='gh-shop-a']")).click();
	    driver.findElement(By.xpath("//a[.='Jewelry & watches']")).click();
	    driver.findElement(By.xpath("//button[.='Watches, Parts & Accessories']")).click();
	    driver.findElement(By.xpath("//a[.='Watches']")).click();
	    driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Apple watches");
	    driver.findElement(By.xpath("//input[@class='btn btn-prim gh-spr']")).click();
	    List<WebElement> productList = driver.findElements(By.xpath("//div[@class='s-item__title']"));
	    for(WebElement Product:productList)
	    {
	    	System.out.println(Product.getText());
	    	Thread.sleep(2000);
	    }
	    
	    
	    
	}

}

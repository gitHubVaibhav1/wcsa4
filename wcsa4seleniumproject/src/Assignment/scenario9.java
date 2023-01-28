package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/s?k=camera&crid=1NGUEM1PS83QD&sprefix=camera%2Caps%2C360&ref=nb_sb_noss_1");
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
      driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Camera");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
      driver.findElement(By.xpath("//span[.='Canon']")).click();
      driver.findElement(By.xpath("//span[.='₹10,000 - ₹20,000']")).click();
      driver.findElement(By.xpath("//i[@class='a-icon a-icon-star-medium a-star-medium-4']")).click();
      driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
      driver.findElement(By.xpath("//a[.='Price: High to Low']")).click();
      List<WebElement> Options = driver.findElements(By.xpath("//div[@class='sg-row']"));
      for(int i=1;i<Options.size();i++)
      {
    	  String option = Options.get(i).getText();
    	  System.out.println(option);
    	 /* if(option.contains("Canon EOS 700D"))
    	  {
    		  String my = option;
    		  System.out.println(my);
    	  }*/
      }
      
      }
	}



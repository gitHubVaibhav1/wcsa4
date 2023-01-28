package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scenario5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=EAIaIQobChMI947Qivig_AIVSp1LBR2mHQXhEAAYASAAEgLvxfD_BwE");
	  driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
	    WebElement target = driver.findElement(By.xpath("//a[.='Rings' and @title='Rings']"));
	    Actions act=new Actions(driver);
	    act.moveToElement(target);
	    driver.findElement(By.xpath("//a[.='Diamond' and @title='Diamond Rings']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='view-by-wrap title style-outline i-right']")).click();
	    driver.findElement(By.xpath("//a[.='Price Low to High ']")).click();
	    List<WebElement> list = driver.findElements(By.xpath("//li[@class='col-xs-4 three-column-browse with-discount with-discount rings-small']"));
	    for(int i=0;i<list.size();i++)
	    {
	    String option = list.get(i).getText();
	    System.out.println(option);
	    Thread.sleep(2000);
	    }
	    
	    
	    
	}

}

package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginActiTime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
         driver.get("http://127.0.0.1/login.do;jsessionid=339h6lpcmf2d0");
         WebElement usernameTextbox = driver.findElement(By.name("username"));
         WebElement passwordTextbox = driver.findElement(By.name("pwd"));
         //boolean checkusername =usernameTextbox.isDisplayed();
       //boolean checkpassord=passwordTextbox.isDisplayed();
        if(usernameTextbox.isDisplayed() && passwordTextbox.isDisplayed())
         {
        		 usernameTextbox.sendKeys("admin");
        		 passwordTextbox.sendKeys("manager");
         }
        Thread.sleep(2000);
         usernameTextbox.clear();
         Thread.sleep(2000);
         passwordTextbox.clear();
         Thread.sleep(2000);
		 usernameTextbox.sendKeys("admin");
		 Thread.sleep(2000);
		 passwordTextbox.sendKeys("manager");
		 driver.findElement(By.xpath("//a[.='Login']")).click();
		 Actions act=new Actions(driver);
		 WebElement target = driver.findElement(By.xpath("(//div[@class='label'])[4]"));
		 act.doubleClick(target).perform();
		 //driver.findElement(By.xpath("//a[.='Create new tasks']")).click();
		 
	}

}

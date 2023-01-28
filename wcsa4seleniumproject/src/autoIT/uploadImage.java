package autoIT;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class uploadImage {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("http://127.0.0.1/login.do;jsessionid=12wtrcxwx0r6x");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
        driver.findElement(By.xpath("//a[@id='loginButton']")).click();
        Thread.sleep(2000);
       WebElement   target1 = driver.findElement(By.xpath("//div[.='Settings']"));
        Actions act = new Actions(driver);
      act.doubleClick(  target1).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
       WebElement target =driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logoOption' and @value='2']"));
        act.doubleClick(target).perform();
         WebElement target2 = driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));
         act.doubleClick(target2).perform();
        File file=new File("./autoIT/Auto1.exe");
        String abs=file.getAbsolutePath();
        Thread.sleep(2000);
        Runtime.getRuntime().exec(abs);
        Thread.sleep(2000);
	}

}

package autoIT;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class uploadImage2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//a[@class='content administration']")).click();
		driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
        driver.findElement(By.xpath("//input[@id='uploadNewReportLogoOption']")).click();
        WebElement target = driver.findElement(By.xpath("//input[@name='formCustomReportLogo.logo']"));
        Actions act=new Actions(driver);
        act.doubleClick(target).perform();
        File file=new File("./autoIT/Auto2.exe");
        String abs = file.getAbsolutePath();
        Runtime.getRuntime().exec(abs);
        Thread.sleep(2000);
       // Runtime.getRuntime().exec(abs);
	}

}

package MethodsOfWebdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindelementMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.actitime.com/login.do");
        Thread.sleep(2000);
        WebElement usernameTextbox = driver.findElement(By.name("username"));
        usernameTextbox.sendKeys("admin");
        System.out.println(usernameTextbox);
	}

}

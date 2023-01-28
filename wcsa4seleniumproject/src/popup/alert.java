package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/abc/Desktop/web%20elements/Alert.html");
		driver.findElement(By.xpath("//button[.='Click me! ']")).click();
		Alert a1 = driver.switchTo().alert();
		Thread.sleep(4000);
		//a1.accept();
		//a1.dismiss();
		//System.out.println(a1.getText());
		
		a1.sendKeys("admin");
	}

}

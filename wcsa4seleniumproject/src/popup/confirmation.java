package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/abc/Desktop/web%20elements/ConfirmationPopup.html");
		driver.findElement(By.xpath("//button[.='Click me! ']")).click();
		Alert a1 = driver.switchTo().alert();
		Thread.sleep(4000);
		//a1.dismiss();
		String textOfConfirm = a1.getText();
		System.out.println(textOfConfirm);
	}

}

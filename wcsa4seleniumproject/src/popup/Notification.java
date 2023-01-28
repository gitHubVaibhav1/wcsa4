package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("-start-maximized");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.olx.in/");
		Thread.sleep(2000);
		co.addArguments("--disable-notifications");
	}
}

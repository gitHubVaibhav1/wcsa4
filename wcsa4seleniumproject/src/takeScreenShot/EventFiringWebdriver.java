package takeScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

@SuppressWarnings("deprecation")
public class EventFiringWebdriver {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		EventFiringWebDriver efw = new EventFiringWebDriver(driver);
		driver.get("https://www.selenium.dev/");
		Thread.sleep(4000);
		File src = efw.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/selenium.png");
		Files.copy(src, dest);
	}
}

package PageObjectModel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseTest implements IAutoConstant {
	static WebDriver driver;

	public void openBrowser() throws IOException {
		Flib flib = new Flib();
		String browserValue = flib.readPropertyData(PROP_PATH, "Browser");

		if (browserValue.equals("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			String url = flib.readPropertyData(PROP_PATH, "Url");
			driver.get(url);
		}

		else if (browserValue.equals("firefox")) {
          System.setProperty(GECKO_KEY, GECKO_VALUE);
          driver=new FirefoxDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
          String url=flib.readPropertyData(PROP_PATH, "Url");
          driver.get(url);
		}
	}
	public void closeBrowser()
	{
	driver.quit();
	}
}

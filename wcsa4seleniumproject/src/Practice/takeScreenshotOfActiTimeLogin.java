package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

//import takeScreenShot.takeScreenshotInterface;

public class takeScreenshotOfActiTimeLogin {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("http://127.0.0.1/login.do;jsessionid=1hg5fye0cgwjm");
   TakesScreenshot ts=(TakesScreenshot)driver;
   File src = ts.getScreenshotAs(OutputType.FILE);
   File dest=new File("./Screenshots/actiTime.png");
   Files.copy(src, dest);
	}

}

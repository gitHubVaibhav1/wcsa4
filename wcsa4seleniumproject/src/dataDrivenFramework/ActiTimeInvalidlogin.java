package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeInvalidlogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do;jsessionid=3qc0opjgnn44b");
		Flib flib = new Flib();
		int lastRow = flib.rowCount("./data/actiTimeTestData.xlsx", "invalidcreds");
		System.out.println(lastRow);
		for (int i = 1; i <= lastRow; i++) {
			 String username = flib.readExcelData("./data/actiTimeTestData.xlsx", "invalidcreds",i, 0);
			WebElement usn = driver.findElement(By.name("username"));
			Thread.sleep(2000);
			String password = flib.readExcelData("./data/actiTimeTestData.xlsx", "invalidcreds", i, 1);
			WebElement pwd = driver.findElement(By.name("pwd"));
			Thread.sleep(2000);
			usn.sendKeys(username);
			Thread.sleep(2000);
			pwd.sendKeys(password);
			Thread.sleep(2000);
			driver.findElement(By.id("loginButton")).click();
			driver.findElement(By.name("username")).clear();
		}
		driver.close();
	}

}

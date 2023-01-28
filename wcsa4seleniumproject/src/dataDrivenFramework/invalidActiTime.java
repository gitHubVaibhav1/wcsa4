package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class invalidActiTime {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do;jsessionid=2hhdwrrdipr1a");
		Flib fls = new Flib();
		int rc = fls.rowCount("./data/actiTimeTestData.xlsx", "invalidcreds");
		System.out.println(rc);
		for (int i = 1; i <= rc; i++) {
         WebElement usn = driver.findElement(By.name("username"));
         WebElement pwd = driver.findElement(By.name("pwd"));
         String username = fls.readExcelData("./data/actiTimeTestData.xlsx", "invalidcreds", i, 0);
         String password = fls.readExcelData("./data/actiTimeTestData.xlsx","invalidcreds", i, 1);
			usn.sendKeys(username);
			pwd.sendKeys(password);
			Thread.sleep(2000);
			driver.findElement(By.id("LoginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
		}

	}

}

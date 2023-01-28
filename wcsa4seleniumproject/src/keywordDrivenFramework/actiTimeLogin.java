package keywordDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTimeLogin extends baseTest{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	   baseTest bt=new baseTest();
	   bt.OpenBrowser();
		Flib flib=new Flib();
		String username = flib.readPropertyData(PROP_PATH, "Username");
		String password = flib.readPropertyData(PROP_PATH, "Password");
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
       bt.closeBrowser();
	}

}

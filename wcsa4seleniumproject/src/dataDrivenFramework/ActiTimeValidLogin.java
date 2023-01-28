package dataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import ReadExcelData.ReadExcelData;

public class ActiTimeValidLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://127.0.0.1/login.do");
       Flib fl=new Flib();
       String username = fl.readExcelData("./data/actiTimeTestData.xlsx", "validcreds",1, 0);
       driver.findElement(By.name("username")).sendKeys(username);
       String password = fl.readExcelData("./data/actiTimeTestData.xlsx","validcreds", 1, 1);
       driver.findElement(By.name("pwd")).sendKeys(password);
       driver.findElement(By.id("loginButton")).click();
	}

}

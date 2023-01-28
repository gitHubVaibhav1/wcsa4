package keywordDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

public class actiTimeInvalidLogin extends baseTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		baseTest bt = new baseTest();
		bt.OpenBrowser();
		Flib flib = new Flib();
		int rc = flib.LastRowCount(EXCEL_PATH, "invalidcreds");
		for (int i = 1; i <= rc; i++) {
			String username = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0);
			driver.findElement(By.name("username")).sendKeys(username);
			String password = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("LoginButton")).click();
			driver.findElement(By.name("username")).clear();
			
		}
	}

}

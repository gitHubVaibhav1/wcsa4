package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import junit.framework.Assert;
import pagePackage.LoginPage;

public class ActiTimeTestInValidlogin extends BaseTest{
  @Test
  public void invalidLogin() throws EncryptedDocumentException, InterruptedException, IOException
  {
	  Flib flib=new Flib();
	  LoginPage lp=new LoginPage(driver);
	  lp.actiTimeInValidLogin(flib.readExcelData(EXCEL_PATH, "invalidcreds", 1, 0), flib.readExcelData(EXCEL_PATH, "invalidcreds", 1, 1));
	  
  }
  
}

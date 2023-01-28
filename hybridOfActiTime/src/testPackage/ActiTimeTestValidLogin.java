package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomListener;
import genericPackage.Flib;
import pagePackage.LoginPage;
@Listeners(CustomListener.class)

public class ActiTimeTestValidLogin extends BaseTest{
  
@Test
   public void validTest() throws IOException, InterruptedException
   {
	   Flib flib=new Flib();
	   LoginPage lp = new LoginPage(driver);
	   lp.actiTimeValidLogin(flib.readPropertyData(PROP_PATH, "Username"), flib.readPropertyData(PROP_PATH, "Password"));

   }
  
}

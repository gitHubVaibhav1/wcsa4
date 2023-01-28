package PageObjectModel;

import java.io.IOException;

public class ActiTimeLogout extends baseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
      baseTest bt=new baseTest();
      bt.openBrowser();
      LoginPage lp=new LoginPage(driver);
      Flib flib=new Flib();
      lp.actiTimeValidLogin(flib.readPropertyData(PROP_PATH, "Username"), flib.readPropertyData(PROP_PATH, "Password"));
      HomePage hp=new HomePage(driver);
      hp.Logout();
	}

}

package PageObjectModel;

import java.io.IOException;

public class actiTimeValidLogin extends baseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
          baseTest bt=new baseTest();
        		  bt.openBrowser();
        		  Flib flib=new Flib();
        		  LoginPage lp=new LoginPage(driver);
        		  lp.actiTimeValidLogin(flib.readPropertyData(PROP_PATH, "Username"), flib.readPropertyData(PROP_PATH, "Password"));
        		  
        		  
	}

}

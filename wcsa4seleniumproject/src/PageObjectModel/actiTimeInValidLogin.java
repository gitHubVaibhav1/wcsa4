package PageObjectModel;

import java.io.IOException;

public class actiTimeInValidLogin extends baseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
       baseTest bt=new baseTest();
       bt.openBrowser();
       LoginPage lp=new LoginPage(driver);
       Flib flib=new Flib();
       int rc = flib.lastRowCount(EXCEL_PATH, "invalidcreds");
       for(int i=0;i<rc;i++)
       {
       String username = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0);
       String password = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1);
    		lp.actiTimeInValidLogin(username, password);  
       }
	}

}

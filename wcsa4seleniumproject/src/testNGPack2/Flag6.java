package testNGPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
  @Test(groups = "FUNCTIONAL")
  public void ft() {
	  Reporter.log("functional testing1",true);
  }

  @Test(groups = "INTEGRATION")
  public void it() {
	  Reporter.log("integration testing1",true);
  }

  
  @Test(groups = "SYSTEM")
  public void st() {
	  Reporter.log("system testing1",true);
  }
  //------------------------------------------------
  @Test(groups = "FUNCTIONAL")
  public void ft2() {
	  Reporter.log("functional testing2",true);
  }

  @Test(groups = "INTEGRATION")
  public void it2() {
	  Reporter.log("integration testing2",true);
  }

  @Test(groups = "SYSTEM")
  public void st2() {
	  Reporter.log("system testing2",true);
  }
  //-----------------------------------------------
  @Test(groups = "FUNCTIONAL")
  public void ft3() {
	  Reporter.log("functional testing3",true);
  }

  @Test(groups = "INTEGRATION")
  public void it3() {
	  Reporter.log("integration testing3",true);
  }

  @Test(groups = "SYSTEM")
  public void st3() {
	  Reporter.log("system testing3",true);
  }
  //---------------------------------------------
  @Test(groups = "FUNCTIONAL")
  public void ft4() {
	  Reporter.log("functional testing4",true);
  }

  @Test(groups = "INTEGRATION")
  public void it4() {
	  Reporter.log("integration testing4",true);
  }

  @Test(groups = "SYSTEM")
  public void st4() {
	  Reporter.log("system testing4",true);
  }
  //--------------------------------------------
  @Test(groups = "FUNCTIONAL")
  public void ft5() {
	  Reporter.log("functional testing5",true);
  }

  @Test(groups = "INTEGRATION")
  public void it5() {
	  Reporter.log("integration testing5",true);
  }

  @Test(groups = "SYSTEM")
  public void st5() {
	  Reporter.log("system testing5",true);
  }
}
  

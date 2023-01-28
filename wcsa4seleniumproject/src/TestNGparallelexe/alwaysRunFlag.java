package TestNGparallelexe;

import static org.testng.Assert.fail;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class alwaysRunFlag {
  @Test
  public void m1() {
	  Assert.fail();
	  Reporter.log("m1",true);
  }
  @Test(dependsOnMethods = "m1",alwaysRun = true)
  public void m2()
  {
	  Reporter.log("m2",true);
  }
}

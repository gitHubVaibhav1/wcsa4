package TestNGparallelexe;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG2 {
  @Test
  public void m2() {
	  Reporter.log("method 2",true);
  }
}

package testNGPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
  @Test(priority = 1)
  public void a() {
	  Reporter.log("a",true);
  }
  @Test(priority = 4)
   public void b()
   {
	  Reporter.log("b",true);
   }
  @Test(priority = 3)
  public void c()
  {
	  Reporter.log("c",true);
  }
  @Test
  public void d()
  {
	  Reporter.log("d",true);
  }
  @Test(priority = 4)
  public void k()
  {
	  Reporter.log("k",true);
  }
}

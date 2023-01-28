package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void demo() {
	//System.out.println("This is demo method".true);
	Reporter.log("This is demo method");
  }
  @Test
  public void demo1()
  {
	 // System.out.println("This is demo1 method",true);
	  Reporter.log("This is demo1 method");
  }
  @Test
  public void demo2()
  {
	  int a=10;
	  int b=0;
	  //int c=a/b;
	  //System.out.println(c);
  }
}

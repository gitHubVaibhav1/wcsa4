package testNGPack4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationMethods {
  @Test
  public void test() {
	  Reporter.log("This is test annotation",true);
  }
  @Test
  public void test1()
  {
	  Reporter.log("This is test1 annotation",true);
  }
  @BeforeSuite
  public void beforesuite() {
	  Reporter.log("This is before suite annotation",true);
  }
  @AfterSuite
  public void aftersuite() {
	  Reporter.log("This is after suite annotation",true);
  }
  @BeforeClass
  public void beforeclass() {
	  Reporter.log("This is before class annotation",true);
  }
  @AfterClass
  public void afterclass() {
	  Reporter.log("This is after class annotation",true);
  }
  @BeforeMethod
  public void beforemethod() {
	  Reporter.log("This is before method annotation",true);
  }
  @AfterMethod
  public void aftermethod() {
	  Reporter.log("This is after method annotation",true);
  }
  @BeforeTest
  public void beforetest() {
	  Reporter.log("This is before test annotation",true);
  }
  @AfterTest
  public void aftertest() {
	  Reporter.log("This is after test annotation",true);
  }
}

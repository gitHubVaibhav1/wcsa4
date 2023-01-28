package testNGpack3;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountFlag {
  @Test(invocationCount = 10)
  public void Login() {
	  Reporter.log("This login method");
  }
  @Test(dependsOnMethods = "Login")
  public void createUser()
  {
	  Reporter.log("This is create user");
  }
  @Test (dependsOnMethods = "createUser")
  public void logout()
  {
	  Reporter.log("This is logout method");
  }
}

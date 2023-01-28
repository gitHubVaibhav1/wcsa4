package testNGPack;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ValidLogin extends BaseTest{
  @Test
  @Parameters({"usn","pwd"})
  public void login(String username,String password) {
	  driver.findElement(By.name("username")).sendKeys(username);
	  driver.findElement(By.name("pwd")).sendKeys(password);
	  driver.findElement(By.id("loginButton")).click();
  }
}

package dynamicScreenshot;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(CustomListener.class)

public class ActiTimeTestNGLogin extends baseTest{
  @BeforeMethod
  public void setUp() {
	  initialisation();
  }
  @Test
  public void loginPage()
  {
	  SoftAssert sa = new SoftAssert();
	  String actualLoginPage=driver.getTitle();
	  sa.assertEquals(actualLoginPage, "actiTIME - Login");
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
  }
  @Test(priority = 1)
  public void homePage() throws InterruptedException
  {
	  SoftAssert sa = new SoftAssert();
	  String actualLoginPage = driver.getTitle();
	  sa.assertEquals(actualLoginPage, "actiTIME - Login");
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
	  Thread.sleep(2000);
	  String actualHomePage = driver.getTitle();
	  Assert.assertEquals(actualHomePage, "actiTIME - nterTime-Track");
  }
  @AfterMethod
  public void close()
  {
	  closeBrowser();
  }
}

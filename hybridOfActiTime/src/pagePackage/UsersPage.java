package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	@FindBy(xpath="//a[@class='content users']") private WebElement UsersTB;
    @FindBy(xpath="//input[@value='Create New User']") private WebElement CreateUserButton;
    @FindBy(xpath="//input[@name='username']") private WebElement UsernameTB;
    @FindBy(xpath="//input[@name='passwordText']") private WebElement passwordTB;
    @FindBy(xpath="//input[@name='passwordTextRetype']") private WebElement RetypePasswordTB;
    @FindBy(xpath="//input[@name='firstName']") private WebElement FirstNameTB;
    @FindBy(xpath="//input[@name='lastName']") private WebElement LastNameTB;
    @FindBy(xpath="//input[@type='submit']") private WebElement CreateUser;
    @FindBy(xpath="//input[@type='button' and @value='      Cancel      ']") private WebElement CancelButton;

    public UsersPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }

	public WebElement getUsersTB() {
		return UsersTB;
	}

	public WebElement getCreateUserButton() {
		return CreateUserButton;
	}

	public WebElement getUsernameTB() {
		return UsernameTB;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	public WebElement getRetypePasswordTB() {
		return RetypePasswordTB;
	}

	public WebElement getFirstNameTB() {
		return FirstNameTB;
	}

	public WebElement getLastNameTB() {
		return LastNameTB;
	}

	public WebElement getCreateUser() {
		return CreateUser;
	}

	public WebElement getCancelButton() {
		return CancelButton;
	}
	
	//Operational Method
	public void userdetail(String validUser,String validPass,String firstName,String lastName) throws InterruptedException
	{
		UsersTB.click();
		Thread.sleep(2000);
		CreateUserButton.click();
		UsernameTB.sendKeys(validUser);
		Thread.sleep(2000);
		passwordTB.sendKeys(validPass);
		Thread.sleep(2000);
		RetypePasswordTB.sendKeys(validPass);
		Thread.sleep(2000);
		FirstNameTB.sendKeys(firstName);
		Thread.sleep(2000);
		LastNameTB.sendKeys(lastName);
		Thread.sleep(2000);
		CreateUser.click();
		Thread.sleep(2000);
		
	}
    
    
}

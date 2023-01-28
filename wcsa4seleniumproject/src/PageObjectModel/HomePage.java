package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//a[@class='content tasks']") private WebElement TasksTab; 
    @FindBy(xpath="//select[@name='usersSelector.selectedUser']") private WebElement DropDown;
    @FindBy(xpath="//a[.='Create new tasks']") private WebElement NewTaskLink;
    @FindBy(xpath="//a[.='Logout']") private WebElement LogoutLink;
    @FindBy(id="SubmitTTButton") private WebElement SubmitButton;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTasksTab() {
		return TasksTab;
	}

	public WebElement getDropDown() {
		return DropDown;
	}

	public WebElement getNewTaskLink() {
		return NewTaskLink;
	}

	public WebElement getLogoutLink() {
		return LogoutLink;
	}

	public WebElement getSubmitButton() {
		return SubmitButton;
	}
    //Operational Methods
	public void Logout()
	{
	LogoutLink.click();
	}
	
    
}

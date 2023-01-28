package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/abc/Desktop/web%20elements/MultiDropdown&Link.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        WebElement dropdown = driver.findElement(By.id("menu"));
        Select sel = new Select(dropdown);
        WebElement WrappedOption = sel.getWrappedElement();
        System.out.println(WrappedOption.getText());
	}

}

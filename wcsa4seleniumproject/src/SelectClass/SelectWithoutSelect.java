package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectWithoutSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/abc/Desktop/web%20elements/MultiDropdown&Link.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        WebElement dropdown = driver.findElement(By.id("menu"));
        Select sel = new Select(dropdown);
        List<WebElement> options = sel.getOptions();
        for (int i=0;i<4;i++)
        {
        	WebElement opt = options.get(i);
        	  Thread.sleep(2000);
        	if (opt.getText().equals("Chakali"))
        	{
        	   opt.click();
        	   break;
        	}
        }
	}

}

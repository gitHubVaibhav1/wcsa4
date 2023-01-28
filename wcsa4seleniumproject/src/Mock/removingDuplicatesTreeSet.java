package Mock;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class removingDuplicatesTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    driver.get("file:///C:/Users/abc/Desktop/web%20elements/MultiSelectDropdown.html");
	    WebElement dropdown = driver.findElement(By.name("menu"));
	    Select se=new Select(dropdown);
	    List<WebElement> allOptions = se.getOptions();
	    TreeSet<String> tr = new TreeSet<String>();
	    for(WebElement options:allOptions)
	    {
	    	String opt = options.getText();
	    	tr.add(opt);
	    }
	    System.out.println(tr);
	}
}

package windowHandles;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitleOfAllWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		String parentTitle = driver.getTitle();
		System.out.println(parentTitle);
		System.out.println("---------------------------------------");
		Set<String> allHandles = driver.getWindowHandles();
		for(String wh:allHandles)
		{
		String title = driver.switchTo().window(wh).getTitle();
		if(!parentTitle.equals(title))
		{
			System.out.println(title);
		}
		}
	}

}

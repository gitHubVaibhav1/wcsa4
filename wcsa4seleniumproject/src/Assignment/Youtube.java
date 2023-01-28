package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
        driver.findElement(By.xpath("(//span[.='Shorts'])[2]"));
        Thread.sleep(2000);
        List<WebElement> options = driver.findElements(By.xpath("//span[@class='style-scope ytd-rich-grid-slim-media']"));
        Thread.sleep(2000); 
        for(WebElement option:options)
        {
        	System.out.println(option.getText());
        	Thread.sleep(6000);
        }
        List<WebElement> suggestions = driver.findElements(By.xpath("//span[@class='style-scope ytd-rich-grid-slim-media']/ancestor::a[@class='yt-simple-endpoint focus-on-expand style-scope ytd-rich-grid-slim-media']//span[@class='inline-metadata-item style-scope ytd-video-meta-block']"));
        for(WebElement suggestion:suggestions)
        {
        	System.out.println(suggestion.getText());
        	Thread.sleep(6000);
        }
        driver.quit();
    }
	}



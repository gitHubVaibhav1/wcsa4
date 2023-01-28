package Xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByMultipleAttriute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/downloads/");
        //driver.findElement(By.xpath("//p[.='Ruby' or (.='Java')]")).click();
        driver.findElement(By.xpath("//p[.='Ruby' and (@class='card-title font-weight-bold h6')]")).click();
	}

}

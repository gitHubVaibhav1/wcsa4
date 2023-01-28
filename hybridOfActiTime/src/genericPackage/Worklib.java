package genericPackage;

import org.openqa.selenium.WebElement;

public class Worklib extends BaseTest{
 public void handleFrameByIndex(int index)
 {
	 driver.switchTo().frame(index);
 }
 public void handleFrameByFrameElement(WebElement FrameElement)
 {
	 driver.switchTo().frame(FrameElement);
 }
 public void handleframeBynameOrId(String name)
 {
	 driver.switchTo().frame(name);
 }
}

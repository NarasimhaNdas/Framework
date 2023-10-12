package Genericlibraries;



import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Webdriverutilities {
	
	

	//Handling dropdowns
	public void dropDowns(WebElement Ele,String Text) {
		Select s =new Select(Ele);
		s.selectByVisibleText(Text);
	}
	
	public void RightClick(WebDriver driver,WebElement Ele) {
		Actions a=new Actions(driver);
		a.contextClick(Ele).perform();
	}
	
	public void DoubleClicking(WebDriver driver,WebElement Ele) {
		Actions a=new Actions(driver);
		a.doubleClick(Ele).perform();
	}
	
	public void mouseOvering(WebDriver driver,WebElement Ele) {
		Actions a=new Actions(driver);
		a.moveToElement(Ele).perform();
	}
	
	//drag and drop
	public void dragAnddropping(WebDriver driver, WebElement ele1, WebElement ele2) {
		Actions a = new Actions(driver);
		a.dragAndDrop(ele1,ele2).perform();
	}
	
	public void alterPopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void childBrowser(WebDriver driver) {
		
		Set<String> child = driver.getWindowHandles();
		for(String b : child){
			driver.switchTo().window(b);
		}
	}
		
	 public void scrollBar(WebDriver driver, int x, int y) {
		 JavascriptExecutor Js = (JavascriptExecutor) driver;
		 Js.executeScript("window.scrollBy(" + x + "," + y + ")"); 
	 }
	 
	// public void scrollBar(WebDriver driver, WebElement ele) {
	//	 JavascriptExecutor Js = (JavascriptExecutor) driver;
	//	 Js.executeScript("window.scrollIntoview();",ele); 
	// }
	 
	 public void clicking(WebDriver driver, WebElement ele) {
		 JavascriptExecutor Js = (JavascriptExecutor) driver;
		 Js.executeScript("window.click();",ele); 
	 }
	 
	 //scrolling with webelement 
	 public void scrollBar(WebDriver driver, WebElement ele) {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", ele);
		 }
	 
	
}

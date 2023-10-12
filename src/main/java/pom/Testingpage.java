package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testingpage {
	
	@FindBy(xpath="(//i[@class= 'fa fa-facebook'])[2]")
	private WebElement fbicon;
	
	public Testingpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void fbiconWebElement() {
		fbicon.click();
	}

	public WebElement getFbicon() {
		return fbicon;
	}


}

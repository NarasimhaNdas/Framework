package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demoskillraryapp {
	
	@FindBy(id="course")
	private WebElement Coursebtn;
	

	@FindBy(xpath="//a[text()='FEEDBACK']")
	private WebElement Feedbackbtn;
	
	@FindBy(name="addresstype")
	private WebElement selectDd;
	
	public Demoskillraryapp(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getCoursebtn() {
		return Coursebtn;
	}


	public WebElement getSelectDd() {
		return selectDd;
	}
	
    public void feedbackbutton() {
    	Feedbackbtn.click();
    }
	
	}
	
	
	
	



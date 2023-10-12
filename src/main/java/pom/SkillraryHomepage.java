package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomepage {
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement SKILLRaryDemoapp;
	
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchtf;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchicon;
	
	@FindBy(xpath="//a[@class='close_cookies']")
	private WebElement coockies;
	
	public SkillraryHomepage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	
	public void gearsbutton() {
		gearsbtn.click();
	}
	
	public void SKILLRaryDemoapplink() {
		SKILLRaryDemoapp.click();
	}
	
	public void Searchicon() {
		searchicon.click();
	}
	
	public void coockiesicon() {
		coockies.click();
	}
	
	public void searchTextfield(String data) {
		searchtf.sendKeys(data);
	}
}

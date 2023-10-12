package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocartpage {
	
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement plusicon;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private WebElement addtocart;
	
	public Addtocartpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getPlusicon()
	{
		return plusicon;
	}
	
	public void addToCart() {
		addtocart.click();
	}
	

}

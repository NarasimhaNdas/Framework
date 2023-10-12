package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Invoicepage {
	
	@FindBy(xpath="//input[@name='downloadInvoice']")
	private WebElement InvoiceBtn;
	
	public Invoicepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void InvoiceButton() {
		InvoiceBtn.click();

	}

	//public WebElement getInvoiceBtn() {
	//	return InvoiceBtn;
	//}
}

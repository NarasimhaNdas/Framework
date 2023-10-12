package Scipts;

import org.testng.annotations.Test;

import Genericlibraries.Baseclass;
import pom.Demoskillraryapp;
import pom.Invoicepage;
import pom.SkillraryHomepage;

public class TestCase2 extends Baseclass {
	
	@Test
	
	public void tc2() {
	
	SkillraryHomepage s=new SkillraryHomepage(driver);
	s.gearsbutton();
	s.SKILLRaryDemoapplink();
	
	utilities.childBrowser(driver);
	Demoskillraryapp Ds=new Demoskillraryapp(driver);
	Ds.feedbackbutton();
	
	Invoicepage DI=new Invoicepage(driver);
	DI.InvoiceButton();

}
	
	
}


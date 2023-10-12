package Scipts;

import org.testng.annotations.Test;

import Genericlibraries.Baseclass;
import pom.Demoskillraryapp;
import pom.SkillraryHomepage;
import pom.Testingpage;

public class TestCase1 extends Baseclass {
	@Test
	public void tc1() throws Throwable{
		SkillraryHomepage s=new SkillraryHomepage(driver);
		s.gearsbutton();
		s.SKILLRaryDemoapplink();
		
		utilities.childBrowser(driver);
		Demoskillraryapp Ds=new Demoskillraryapp(driver);
		
		utilities.dropDowns(Ds.getSelectDd(),pdata.getPropertyData("coursedd"));
		
		Testingpage tP=new Testingpage(driver);
		 
		utilities.scrollBar(driver,tP.getFbicon());
		
		tP.fbiconWebElement();
		
		
	}
	

}

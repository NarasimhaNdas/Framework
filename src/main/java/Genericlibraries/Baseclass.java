package Genericlibraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public Propertyfiles pdata=new Propertyfiles();
	public Webdriverutilities utilities=new Webdriverutilities();
	public WebDriver driver;
	
	@BeforeMethod
	public void openApp() throws Throwable {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(pdata.getPropertyData("url"));
	}
	@AfterMethod
	public void closeApp(ITestResult res)throws Throwable{
		int status=res.getStatus();
		String name=res.getName();
		if(status==2){
			Photo p=new Photo();
			p.getPhoto(driver,name);
			
		}else
		driver.quit();
	}
	
	
	
	

}

package Genericlibraries;

import java.io.FileInputStream;
import java.util.Properties;

public class Propertyfiles {
	
	public String getPropertyData(String key) throws Throwable{
		Properties p=new Properties();
		FileInputStream Fis=new FileInputStream(ipathconstant.propertyfilepath);
		p.load(Fis);
		return p.getProperty(key);
		
	}
}

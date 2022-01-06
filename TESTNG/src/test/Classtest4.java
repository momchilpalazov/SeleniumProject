package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Classtest4 {
	
	
	@Parameters({"URL"})
	@Test
	public void WebloginCarLoan(String personalname)
	{
		//selenium
		System.out.println("WebLogin4");
		System.out.println(personalname);
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLiginCarLoan()
	{
		//Appium
		System.out.println("MobileLogin4");
		//hi
	}
	
	@Test
	public void LoginAPIcarLoan()
	{
		//RestAPI automation
		System.out.println("RestApi4");
	}


}

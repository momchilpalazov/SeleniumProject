package test;

import org.testng.annotations.Test;

public class Classtest4 {
	
	@Test
	public void WebloginCarLoan()
	{
		//selenium
		System.out.println("WebLogin4");
		
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

package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Classtest2 {
	@Test
	public void WebloginCarLoan()
	{
		//selenium
		System.out.println("WebLogin4");
		
	}
	
	@BeforeTest
	public void MobileLiginCarLoan()
	{
		//Appium
		System.out.println("I am execute firts!");
		//hi
	}
	
	@Test
	public void LoginAPIcarLoan()
	{
		//RestAPI automation
		System.out.println("RestApi4");
	}

}

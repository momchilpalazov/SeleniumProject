package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Classtest3 {
	
	@Test
	public void WebloginCarLoan()
	{
		//selenium
		System.out.println("WebLogin4");
		
	}
	
	@Test
	public void MobileLiginCarLoan()
	{
		//Appium
		System.out.println("MobileLogin3");
		//hi
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		//Appium
		System.out.println("i will execute before every test method in classtest3");
		//hi
	}
	public void MobileLigin()
	{
		//Appium
		System.out.println("MobileLoginnew");
		//hi
	}
	public void Mobiledata()
	{
		//Appium
		System.out.println("Mobiledata");
		//hi
	}
	
	@AfterMethod
	public void aftermethod()
	{
		//Appium
		System.out.println("i will execute after every test method in classtest3");
		//hi
	}
	
	@BeforeSuite
	public void aftersuties()
	{
		//Appium
		System.out.println("i am no 1");
		//hi
	}
	
	@Test
	public void LoginAPIcarLoan()
	{
		//RestAPI automation
		System.out.println("RestApi4");
	}


}
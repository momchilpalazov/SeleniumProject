package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Classtest3 {
	
	@BeforeClass
	public void beforeclass()
	{
		//Appium
		System.out.println("i will execute before every  method in classtest3");
		//hi
	}
	
	@Parameters({"URL"})
	@Test
	public void WebloginCarLoan(String urlname)
	{
		//selenium
		System.out.println("WebLogin4");
		System.out.println(urlname);
		
	}
	
	@Test
	public void MobileLiginCarLoan()
	{
		//Appium
		System.out.println("MobileLogin3");
		//hi
	}
	
	@AfterClass
	public void afterclass()
	{
		//Appium
		System.out.println("i will execute after every  method in classtest3");
		//hi
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		//Appium
		System.out.println("i will execute before every test method in classtest3");
		//hi
	}
	
	@Test
	public void MobileLigin()
	{
		//Appium
		System.out.println("MobileLoginnew");
		//hi
	}
	@Test(enabled=false)
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
	
	@Test(timeOut=4000)
	public void LoginAPIcarLoan()
	{
		//RestAPI automation
		System.out.println("Error");
	}
	
	//@Test(dependsOnMethods= {"MobileLigin","LoginAPIcarLoan"})
	public void APIcarLoan()
	{
		//RestAPI automation
		System.out.println("Depends");
	}


}
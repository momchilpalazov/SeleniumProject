package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
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
	
	@Parameters({"URL","APIKey/username"})
	@Test
	public void WebloginCarLoan(String urlname,String key)
	{
		//selenium
		System.out.println("WebLogin3");
		System.out.println(urlname);
		System.out.println(key);
		
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
	
	@Test(dataProvider="getData")
	public void LoginAPIcarLoan(String username,String password)
	{
		//RestAPI automation
		System.out.println("Error");
		System.out.println(username);
		System.out.println(password);
		
	}
	
	//@Test(dependsOnMethods= {"MobileLigin","LoginAPIcarLoan"})
	public void APIcarLoan()
	{
		//RestAPI automation
		System.out.println("Depends");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination-username,password-good credit histrory
		Object[][]data= new Object[3][2];
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		//couloumns in the row are nothing but values for that particular combination()row
		//2nd username password-no credit history
		 data[1][0]="secondsetusername";
		 data[1][1]="secondpassowrd";
		
		//3rd fraudelent credit history
		 data[2][0]="thirdsetusername";
		 data[2][1]="thirdpassword";
		
	   return data;
		
	}


}
package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Classtest1 {
	
	
	@Test
	public void Demo()
	{
		System.out.println("Hello World");
		Assert.assertTrue(false);
		
	}
	
	@AfterTest
	public void lastexecute()
	{
		System.out.println("I will execute last!");
	}

@Test

public void SecondTest()
{
	
	System.out.println(" Ineed Learn");
}

}

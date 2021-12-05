import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Chekcbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();			
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Assert
				
		Assert.assertFalse(driver.findElement(By.cssSelector("label[for='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
	
		
		//System.out.println(	driver.findElement(By.cssSelector("label[for='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("label[for='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
	    //System.out.println(	driver.findElement(By.cssSelector("label[for='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
	    //Assert.assertTrue(driver.findElement(By.cssSelector("label[for='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());   
	        
	    
	    
	     System.out.println( driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());	
	     System.out.println( driver.findElement(By.id("Div1")).getAttribute("style"));
	    driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	    System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
	    System.out.println( driver.findElement(By.id("Div1")).getAttribute("style"));
	    if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
	    {
	    	System.out.println("is Enabled");
	    	Assert.assertTrue(true);
	    	
	    }
	    else
	    {
	    	
	    	Assert.assertFalse(false);
	    }
	    
	  
	    
	    
	    //Count the number of check
	   System.out.println( driver.findElement(By.cssSelector("input[type='checkbox']")).getSize());
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
			
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

}

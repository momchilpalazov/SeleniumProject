import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chekcbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();			
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		System.out.println(	driver.findElement(By.cssSelector("label[for='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("label[for='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
	    System.out.println(	driver.findElement(By.cssSelector("label[for='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
	    
	    //Count the number of checkbox
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
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

}

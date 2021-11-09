import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selintroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Invoking Browser
		
		//chromedriver.exe->Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");		
		//webdriver.chrome.driver->value path(key)
		WebDriver driver = new ChromeDriver();	
		
		//FireFoxDriver
		//System.setProperty("webdriver.gecko.driver", "C:\\Chromedriver\\geckodriver.exe");
		//WebDriver driver1 = new FirefoxDriver();	
		
		//implicit wait -2 seconds time out
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://github.com/login");
		driver.findElement(By.id("login_field")).sendKeys("mompalazov");
		driver.findElement(By.id("password")).sendKeys("hello123");
		driver.findElement(By.name("commit")).click();
		
		
		//class name and css Selector locators to identify elements	
		//print error in console with xpath
		System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/main[1]/div[1]/div[2]/div[1]/div[1]")).getText());
		
		
		//Find with LinkText and Xpath
		driver.findElement(By.linkText("Forgot password?")).click();
		//tagname[@attribute='value']
		// //input[@placeholder='Enter your email address']
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("momchil.palazov@gmail.com");
		//driver.findElement(By.cssSelector("input [placeholder='Enter your email address']")).clear();
		
		
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//driver.close();
		//driver.quit();
	

	}

}

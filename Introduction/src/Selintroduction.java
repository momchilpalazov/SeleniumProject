import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selintroduction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Invoking Browser
		
		//chromedriver.exe->Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");		
		//webdriver.chrome.driver->value path(key)
		WebDriver driver = new ChromeDriver();	
		
		//FireFoxDriver
		//System.setProperty("webdriver.gecko.driver", "C:\\Chromedriver\\geckodriver.exe");
		//WebDriver driver1 = new FirefoxDriver();	
		
		//TEST 1
		
		//implicit wait -2 seconds time out
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//driver.get("https://github.com/login");
		//driver.findElement(By.id("login_field")).sendKeys("mompalazov");
		//driver.findElement(By.id("password")).sendKeys("hello123");
		//driver.findElement(By.name("commit")).click();
		
		
		//class name and css Selector locators to identify elements	
		//print error in console with xpath
		//System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/main[1]/div[1]/div[2]/div[1]/div[1]")).getText());
		
		
		//Find with LinkText and Xpath
		//driver.findElement(By.linkText("Forgot password?")).click();
		//tagname[@attribute='value']
		// //input[@placeholder='Enter your email address']
		
		//driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("momchil.palazov@gmail.com");
		
		//clear method
		//driver.findElement(By.xpath("(//input[@id='email_field'])[1]")).clear();
		
		
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//driver.close();
		//driver.quit();
		
		
		//Another websait
		//TEST2
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys("rahul");

		driver.findElement(By.name("inputPassword")).sendKeys("hello123");

		driver.findElement(By.className("signInBtn")).click();

		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

		driver.findElement(By.linkText("Forgot your password?")).click();

		Thread.sleep(1000);//

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");

		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");

		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");

		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");

		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

		System.out.println(driver.findElement(By.cssSelector("form p")).getText());

		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

		Thread.sleep(1000);

		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");

		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

		driver.findElement(By.id("chkboxOne")).click();

		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

		



		


	

	}

}

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
		
		
		
		
		driver.get("https://github.com/login");
		driver.findElement(By.id("login_field")).sendKeys("mompalazov");
		driver.findElement(By.id("password")).sendKeys("hello123");
		driver.findElement(By.name("commit")).click();
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//driver.close();
		//driver.quit();
	

	}

}

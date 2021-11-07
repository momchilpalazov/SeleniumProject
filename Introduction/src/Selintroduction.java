import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selintroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Invoking Browser
		
		//chromedriver.exe->Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		
		//webdriver.chrome.driver->value path(key)
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freelancer.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		//driver.close();
		//driver.quit();
	

	}

}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selintroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Invoking Browser
		
		//chromedriver.exe->Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Palazov\\Desktop\\All Doks\\QA Testing Selenium\\chromedriver_win32.exe");
		
		//webdriver.chrome.driver->value path(key)
		WebDriver driver = new ChromeDriver();
	

	}

}

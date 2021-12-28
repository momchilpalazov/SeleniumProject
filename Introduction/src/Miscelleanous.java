import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelleanous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();		
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("sessionKey");
	
				
		driver.get("https://www.google.com/");
		
		//ScreenshotMetod
		File src=  (File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Download//https://commons.apache.org/proper/commons-io/download_io.cgi
		FileUtils.copyFile(src,new File("C:\\Users\\Palazov\\Pictures\\Scanscreenshot.png"));
		
		

	}

}

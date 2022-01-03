import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class remotedtest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		//Local : Webdriver driver= new ChromeDriver();
		
		//Remote
		
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.183:4444/ui/index.html#/"),dc); 
		driver.get("https://www.google.de/");
		
		
		
		

	}

}

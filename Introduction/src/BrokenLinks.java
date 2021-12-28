import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//broken URL
		//Step 1-Is to get all urls tied up the links using selenium
		
		String url=driver.findElement(By.cssSelector("a[href='https://www.soapui.org/']")).getAttribute("href");
		
		//Java methods will URL's and gets you the status code
		 URLConnection conn= (HttpURLConnection)new URL(url).openConnection();
		 ((HttpURLConnection) conn).setRequestMethod("HEAD");
		 conn.connect();
		 int respCode=((HttpURLConnection) conn).getResponseCode();
		 System.out.println(respCode);
		 //if status code is >400 then the url is not working ->link which is tied to url is broken

	}

}

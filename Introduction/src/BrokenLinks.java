import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> testLink=  driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		SoftAssert a=new SoftAssert();
		
		for (WebElement testLinks: testLink) {
			
			String url=testLinks.getAttribute("href");
			
			//Java methods will URL's and gets you the status code
			 URLConnection conn= (HttpURLConnection)new URL(url).openConnection();
			 ((HttpURLConnection) conn).setRequestMethod("HEAD");
			 conn.connect();
			 int respCode=((HttpURLConnection) conn).getResponseCode();
			 System.out.println(respCode);
			 a.assertTrue(respCode<400, "The link With Text " + testLinks.getText() + "is broken with code" + respCode);
			 
			// if (respCode>400) {
				
				 //System.out.println("The link With Text " + testLinks.getText() + "is broken with code" + respCode);
				// Assert.assertTrue(false);
			//}
			 
		}
		
		a.assertAll();
		
		//broken URL
		//Step 1-Is to get all urls tied up the links using selenium
		
		//String url=driver.findElement(By.cssSelector("a[href='https://www.soapui.org/']")).getAttribute("href");
		//String url=driver.findElement(By.cssSelector("a[href='https://rahulshettyacademy.com/brokenlink']")).getAttribute("href");
		
		//Java methods will URL's and gets you the status code
		 //URLConnection conn= (HttpURLConnection)new URL(url).openConnection();
		 //((HttpURLConnection) conn).setRequestMethod("HEAD");
		 //conn.connect();
		 //int respCode=((HttpURLConnection) conn).getResponseCode();
		 //System.out.println(respCode);
		 //if status code is >400 then the url is not working ->link which is tied to url is broken

	}

}

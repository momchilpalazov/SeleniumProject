import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php/");
		driver.manage().window().maximize();
		//Give me the count of links on the page
		
		 System.out.println( driver.findElements(By.tagName("a")).size());
		 
		 //Give me the count of links on the footer page
		 
		 WebElement footerwebelement=driver.findElement(By.cssSelector("#gf-BIG"));
		 
		 System.out.println( footerwebelement.findElements(By.tagName("a")).size());
		 
		 //3.Find coloumn size
		 
		WebElement coloumndriver= footerwebelement.findElement(By.xpath("//body[1]/div[6]/table[1]/tbody[1]/tr[1]/td[1]"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		
		//4.Click on each link in the coloumn and check if the pages are openig
		
		for (int i = 0; i < coloumndriver.findElements(By.tagName("a")).size(); i++) {
			
			String clickOnLinkTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			
			Thread.sleep(5000L);
		}//open all the tabs
			
			Set<String> abc= driver.getWindowHandles();
		    Iterator<String> it= abc.iterator();
			
			while(it.hasNext())
			
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
				
				
			}
		

	}

}

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.id("ez-accept-all")).click();
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
	    //driver.findElement(By.className("datepicker-switch")).getText().contains("January 2022");
		
		while (!driver.findElement(By.cssSelector("table[class=' table-condensed'] th[class='datepicker-switch']")).getText().contains("January 2022"))
		{
			driver.findElement(By.cssSelector("table[class=' table-condensed'] th[class='next']")).click();
		}
		
		
		
		List<WebElement> day=driver.findElements(By.className("day"));
		int count=driver.findElements(By.className("day")).size();
		
		for (int i = 0; i < count ; i++) {
			
			String text=driver.findElements(By.className("day")).get(i).getText();
			
			if (text.equalsIgnoreCase("24")) {
				driver.findElements(By.className("day")).get(i).click();
				
			}
			
		}
		
	}

}



import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//click on column
		driver.findElement(By.cssSelector("th:nth-child(1)")).click();
		//capture all webelement into list
		
		List<WebElement> elementList= driver.findElements(By.xpath("//tr/td[1]"));
		//capture text of all webelememnts int newlist(original list)
		List<String>originalList=elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		//sort on the original  list  of step 3 (sorted list)
		List<String>sortedList=originalList.stream().sorted().collect(Collectors.toList());

		//compare original list  vs sorted list
		  Assert.assertTrue(originalList.equals(sortedList));
		

	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class relativeloc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();		
		//driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement name=	driver.findElement(By.cssSelector("[name='name']"));
	    System.out.println( driver.findElement(with(By.tagName("label")).above(name)).getText());
	    
	   WebElement dateName= driver.findElement(By.cssSelector("[for='dateofBirth']"));
	   driver.findElement(with(By.tagName("input")).below(dateName)).click();
	   
	 WebElement iceCream=  driver.findElement(By.xpath("//label[normalize-space()='Check me out if you Love IceCreams!']"));
	 driver.findElement(with(By.tagName("input")).toLeftOf(iceCream)).click();
	 
	   WebElement statusElement= driver.findElement(By.id("inlineRadio1"));
	   System.out.println( driver.findElement(with(By.tagName("label")).toRightOf(statusElement)).getText());

	}

}

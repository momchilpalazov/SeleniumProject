import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frametest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		System.out.println( driver.findElement(By.tagName("iframe")).getSize());
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));		
		//driver.findElement(By.id("draggable")).click();
		Actions a= new Actions(driver);
		WebElement null1= driver.findElement(By.id("draggable"));
		WebElement null2= driver.findElement(By.id("droppable"));
		
		
		a.dragAndDrop(null1, null2).build().perform();
		driver.switchTo().defaultContent();
		

	}

}

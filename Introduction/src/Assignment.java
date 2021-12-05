import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.util.internal.SystemPropertyUtil;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text="Palazov";
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();			
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		//grab the text
		 System.out.println(driver.switchTo().alert().getText()); 				
		//method allert accept
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println( driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		
		

	}

}

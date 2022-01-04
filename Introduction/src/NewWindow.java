import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//Switching WindowTab
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String>handles=	driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentWindowsId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		driver.get("https://rahulshettyacademy.com/");
		String courseName= driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		driver.switchTo().window(parentWindowsId);
		WebElement name=driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(courseName);
		
		//screenschot
		File file=name.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file,new File("logo.png"));
		
		//driver.quit();

	}

}

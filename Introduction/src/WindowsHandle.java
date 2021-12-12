import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("body:nth-child(2) > a.blinkingText:nth-child(1)")).click();
		
		//[parentid,chilledid,subchiledid]
		 Set<String> windows=driver.getWindowHandles();
		 Iterator<String>it= windows.iterator();
		 String parentId=it.next();
		 String chilledId=it.next();
		 
		 driver.switchTo().window(chilledId);
		 
		System.out.println( driver.findElement(By.cssSelector("div.page-wrapper app-interview-material:nth-child(4) div.container div.row div.col-md-8:nth-child(2) > p.im-para.red:nth-child(2)")).getText());
		
		String mail= driver.findElement(By.cssSelector("div.page-wrapper app-interview-material:nth-child(4) div.container div.row div.col-md-8:nth-child(2) > p.im-para.red:nth-child(2)"))
				.getText().split("at")[1].trim().split(" ")[0];
		
		driver.switchTo().window(parentId);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(mail);
		

	}

}

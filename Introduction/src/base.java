import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot","Tomato" };
		

		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver,5);
		//implecit wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		
		
		
		addItemsMethod(driver, itemsNeeded);
		//base b=new base();
		//b.addItemsMethod(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		//Thread.sleep(3000);
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoCode")));
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[normalize-space()='Apply']")).click();
		
		//explecit wait
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		System.out.println( driver.findElement(By.cssSelector(".promoInfo")).getText());
		
	}

	
	
	public static void addItemsMethod(WebDriver driver,String [] itemsNeeded)
	
	{
		
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		int j=0;

		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formattedname = name[0].trim();

			// convert array list to easy search
			// check whether name you extracted is present in arrayList or not

			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedname)) {
				
				j++;
				//click on Add
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if (j==itemsNeeded.length) {
					break;
				}

			}

		}

	}

}
	
	



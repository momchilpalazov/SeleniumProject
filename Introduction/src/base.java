import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };
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
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				
				if (j==3) {
					break;
				}

			}

		}

	}

}

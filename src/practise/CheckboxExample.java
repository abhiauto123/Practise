package practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckboxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/mens-clothing/tshirts/pr?sid=2oq,s9b,j9y&otracker=nmenu_sub_Men_0_T-Shirts");
		List<WebElement> we = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count = we.size();
		System.out.println(count);
		for(int i=0;i<=count-1;i++)
		{
			we.get(i).click();
		}

	}

}

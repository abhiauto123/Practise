package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.fatcow.com");
		
		Actions act = new Actions(driver);
		WebElement we = driver.findElement(By.cssSelector("a.mainnav"));
		act.moveToElement(we).perform();
	    

	}

}

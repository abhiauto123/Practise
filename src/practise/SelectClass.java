package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/ce512/Desktop/html_pages/selectDropDown.html");
		WebElement we = driver.findElement(By.name("country"));
		Select sel = new Select(we);
		sel.selectByIndex(2);
		sel.selectByValue("AUD");
		sel.selectByVisibleText("United Kigndom");

	}

}

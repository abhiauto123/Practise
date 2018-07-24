package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserNamePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement we = driver.findElement(By.name("username"));
		if(we.isDisplayed())
		{
			System.out.println("Username Field is displayed..");
		}
		else
		{
			System.out.println("Username Field is not displayed..");
		}
	}

}

package practise;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		//driver.findElement(By.name("username")).sendKeys(Keys.CONTROL,"a");
		//driver.findElement(By.name("username")).sendKeys(Keys.CONTROL,"c");
		String s = driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(s);
		Thread.sleep(2000);
		//driver.findElement(By.name("pwd")).sendKeys(Keys.CONTROL,"v");
		driver.findElement(By.name("pwd")).sendKeys(s);
		

	}

}

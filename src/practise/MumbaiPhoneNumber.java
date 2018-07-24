package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MumbaiPhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.irctc.com/displayServlet");
		String s = driver.findElement(By.xpath("//label[text()='Mumbai']/../label[2]")).getText();
        System.out.println(s);
		
	}

}

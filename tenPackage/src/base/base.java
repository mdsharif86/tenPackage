package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	static WebDriver driver;
	public static void SetUpDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\Chromedrive\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		//driver.get("https://www.bestbuy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	public static void NavigateUrl(String url) {
		driver.get(url);
	}
	public static void click(By by) {
		driver.findElement(by).click();
	}
	public static void sendKeys(By by, String value) {
		driver.findElement(by).sendKeys(value);
	}
	public static void click() {
		click();
	}

}

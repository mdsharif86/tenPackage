package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class BestBuy extends base {

	public static void main(String[] args) throws InterruptedException {
		SetUpDriver();
		NavigateUrl("https://www.bestbuy.com/");
		Thread.sleep(4000);
		click(By.xpath("//button[@class='c-close-icon c-modal-close-icon']"));
		Thread.sleep(2000);
		sendKeys(By.xpath("//input[@id='gh-search-input']"), "camera");
		click(By.xpath("//button[@type='submit'][@class='header-search-button']"));
		List<WebElement> camera = driver.findElements(By.xpath("//div[@class='sku-title']/h4"));
		System.out.println("length : " + camera.size());

		Thread.sleep(2000);
		for (WebElement e : camera) {
			String name = e.findElement(By.xpath(".//a")).getText();
			// String price = e.findElement(By.xpath(".//div[@class='priceView-hero-price
			// priceView-customer-price']")).getText();
			System.out.println("name : " + name);

		}
		List<WebElement> prices = driver
				.findElements(By.xpath("//div[@class='priceView-hero-price priceView-customer-price']"));
		System.out.println("length : " + prices.size());
		for (WebElement x : prices) {
			String price = x.findElement(By.xpath(".//span")).getText();
			System.out.println("price : " + price);
		}

	}
}

package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BestBuyFormatting extends base {
	public static void main(String[] args) throws InterruptedException {
		SetUpDriver();
		NavigateUrl("https://www.bestbuy.com/");
		Thread.sleep(4000);
		click(By.xpath("//button[@class='c-close-icon c-modal-close-icon']"));
		Thread.sleep(2000);
		sendKeys(By.xpath("//input[@id='gh-search-input']"), "camera");
		click(By.xpath("//button[@type='submit'][@class='header-search-button']"));
		
		List<WebElement> itemList = driver.findElements(By.xpath("//li[@class='sku-item']"));
		System.out.println("Item List Size : " + itemList.size());
		
		int index = 1;
		for(WebElement item : itemList) {
			String itemTitle = item.findElement(By.xpath(".//h4[@class='sku-header']/a")).getText();
			System.out.println("Title [" + index + "] : " + itemTitle);
			
			String itemPrice = item.findElement(By.xpath(".//div[@class='pricing-price pricing-lib-price-8-2121-10 priceView-price ']/div[2]/div/div/div/span[1]")).getText();
			System.out.println("Price [" + index + "] : " + itemPrice);
			
			index++;
		}
	}
}

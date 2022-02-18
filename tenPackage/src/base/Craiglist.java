package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Craiglist extends base {

	public static void main(String[] args) throws InterruptedException {
		SetUpDriver();
		NavigateUrl("https://oklahomacity.craigslist.org/");
		Thread.sleep(4000);
		sendKeys(By.xpath("//input[@id='query']"), "car" + Keys.ENTER);
		
		List<WebElement> itemList = driver.findElements(By.xpath(".//ul[@id='search-results']/li"));
		System.out.println("Item list size : " + itemList.size());
		
		int index = 1;
		for (WebElement item : itemList) {
			String itemtitle = item.findElement(By.xpath(".//h3/a")).getText();
			System.out.println("Title [" + index + "] : " + itemtitle);

			String itemPrice = item.findElement(By.xpath(".//span/span[@class='result-price']")).getText();
			System.out.println("price [" + index + "] : " + itemPrice);
			
			index++;
		}
	}// main

}// class

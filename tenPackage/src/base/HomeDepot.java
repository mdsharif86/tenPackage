package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class HomeDepot extends base{

	public static void main(String[] args) throws InterruptedException {
		 SetUpDriver();
		 NavigateUrl("https://www.homedepot.com/");
		 Thread.sleep(2000);
		 sendKeys(By.xpath("//input[@id='headerSearch']"), "Fridge" + Keys.ENTER);
		
		 List<WebElement> itemList = driver.findElements(By.xpath("//div[@class=\"browse-search__pod col__6-12 col__6-12--xs col__4-12--sm col__4-12--md col__3-12--lg\"]"));
		 System.out.println("Item list size : " + itemList.size());
		 
		 int index = 1;
		 for (WebElement item: itemList) {
			 String itemTitle = item.findElement(By.xpath("class=\"product-pod__title__product\"")).getText();
			 System.out.println("Title [" + index + "] : " + itemTitle);
		 
		 }
		 
	}

}

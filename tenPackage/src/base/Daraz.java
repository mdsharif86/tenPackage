package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Daraz extends base {

	public static void main(String[] args) {
		SetUpDriver();
		NavigateUrl("https://www.daraz.com.bd/");
		sendKeys(By.xpath("//input[@id='q']"), "cellphone" + Keys.ENTER);
		List<WebElement> cellphone = driver.findElements(By.xpath("//div[@class='c3e8SH']"));
		System.out.println("Length" + cellphone.size());

		int index = 1;
		for (WebElement item : cellphone) {
			String itemTitle = item.findElement(By.xpath(".//div[@class='c16H9d']")).getText();
			System.out.println("Title [" + index + "] : " + itemTitle);

			String itemPrice = item.findElement(By.xpath(".//span[@class='c13VH6']")).getText();
			System.out.println("Title [" + index + "] : " + itemPrice);
			
			index++;
		}
	}// main

}// class

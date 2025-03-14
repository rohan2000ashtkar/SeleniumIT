package day9;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class MultipleWindowHandle {
	//public static void main (String[] args) {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.myntra.com/ethnic-tops");
			Thread.sleep(2000);
			List<WebElement> dress=driver.findElements(By.xpath("//ul[@class='results-base']/child::li/child::a"));
			Thread.sleep(2000);
			for (int i=0;i<2;i++)
			{
				dress.get(i).click();
				Thread.sleep(2000);
			}
			Set<String>wins=driver.getWindowHandles();
			Iterator <String>it=wins.iterator();
			String parentID=it.next();
			String ChildID=it.next();
			//String ChildID1=it.next();
			//String ChildID2=it.next();
			driver.switchTo().window(ChildID);
			System.out.println(driver.getCurrentUrl());
	}

}

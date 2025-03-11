package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraShoping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebElement Women=driver.findElement(By.xpath("//div[@class='desktop-navLinks']/child::div[2]"));
		Actions Act=new Actions(driver);
		Act.moveToElement(Women).build().perform();
		

	}

}

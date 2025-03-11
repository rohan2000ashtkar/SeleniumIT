package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		WebElement jobs=driver.findElement(By.xpath("//ul[@class='nI-gNb-menus']/child::li[1]"));
		Actions Act=new Actions(driver);
		Act.moveToElement(jobs).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='nI-gNb-log-reg']/child::a[2]")).click();

	}

}

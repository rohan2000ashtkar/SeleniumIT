package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbReg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Rohan");
		driver.findElement(By.name("lastname")).sendKeys("Asthkar");
		WebElement date=driver.findElement(By.id("day"));
		Select day=new Select(date);
		day.selectByIndex(10);
		WebElement Month= driver.findElement(By.id("month"));
		 Select Mon=new Select(Month);
		 Mon.selectByValue("2");
		 WebElement Year=driver.findElement(By.id("year"));
		 Select yar=new Select(Year);
		 yar.selectByContainsVisibleText("2000");//(//input[@id='sex'])[2]
		 driver.findElement(By.xpath("//input[@value=-1]")).click();
		 driver.findElement(By.name("reg_email__")).sendKeys("9141200011");
		 driver.findElement(By.name("reg_passwd__")).sendKeys("Admin@123");
		// driver.findElement(By.name("websubmit")).click();
		

	}

}

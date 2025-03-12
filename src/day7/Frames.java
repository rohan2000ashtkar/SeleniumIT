package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://ui.vision/demo/webtest/frames/");
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Bahadur");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().frame(2);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Varsha");
		driver.findElement(By.className("AB7Lab Id5V1")).click();

	}

}

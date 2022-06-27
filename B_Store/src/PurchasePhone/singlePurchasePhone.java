package PurchasePhone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class singlePurchasePhone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wahyu\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//link web
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(5000);
		//select samsung
		driver.findElement(By.linkText("Samsung galaxy s6")).click();
		//add chart
		driver.findElement(By.xpath("//a[@class=\"btn btn-success btn-lg\"]")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		//open chart
		driver.findElement(By.linkText("Cart")).click();
		Thread.sleep(10000);
		//click place order
		driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
		//insert into form
		driver.findElement(By.id("name")).sendKeys("a");
		driver.findElement(By.id("country")).sendKeys("a");
		driver.findElement(By.id("city")).sendKeys("a");
		driver.findElement(By.id("card")).sendKeys("a");
		driver.findElement(By.id("month")).sendKeys("a");
		driver.findElement(By.id("year")).sendKeys("a");
		//click purchase
		driver.findElement(By.xpath("//button[normalize-space()='Purchase']")).click();
	}

}

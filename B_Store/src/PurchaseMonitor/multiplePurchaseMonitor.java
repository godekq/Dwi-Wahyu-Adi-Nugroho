package PurchaseMonitor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplePurchaseMonitor {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wahyu\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//link web
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//select menu monitors
		driver.findElement(By.linkText("Monitors")).click();
		Thread.sleep(5000);
		//select first laptop
		driver.findElement(By.linkText("Apple monitor 24")).click();
		//add chart
		driver.findElement(By.xpath("//a[@class=\"btn btn-success btn-lg\"]")).click();
		//delay
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
				
		
		
		//back to home 
		driver.findElement(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']")).click();
		//select menu laptops
		driver.findElement(By.linkText("Laptops")).click();
		//select second laptop
		driver.findElement(By.linkText("MacBook air")).click();
		//add chart
		driver.findElement(By.xpath("//a[@class=\"btn btn-success btn-lg\"]")).click();
		
		//delay
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		//open chart
		driver.findElement(By.linkText("Cart")).click();
		Thread.sleep(10000);
		//click place order
		driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
		//insert into form
		driver.findElement(By.id("name")).sendKeys("Dwi");
		driver.findElement(By.id("country")).sendKeys("Indonesia");
		driver.findElement(By.id("city")).sendKeys("Salatiga");
		driver.findElement(By.id("card")).sendKeys("BCA");
		driver.findElement(By.id("month")).sendKeys("12");
		driver.findElement(By.id("year")).sendKeys("2022");
		//click purchase
		driver.findElement(By.xpath("//button[normalize-space()='Purchase']")).click();
	}

}

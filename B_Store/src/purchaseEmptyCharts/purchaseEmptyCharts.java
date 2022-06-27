package purchaseEmptyCharts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class purchaseEmptyCharts {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wahyu\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//link web
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//go to cart
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

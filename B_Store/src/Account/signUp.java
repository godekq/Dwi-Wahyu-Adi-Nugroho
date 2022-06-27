package Account;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wahyu\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//link web
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Sign up
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.id("sign-username")).sendKeys("@");
		driver.findElement(By.id("sign-password")).sendKeys("12");
		driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).click();
		
		//delay
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		}

}

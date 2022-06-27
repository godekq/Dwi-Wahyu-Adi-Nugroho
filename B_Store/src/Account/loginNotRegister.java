package Account;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginNotRegister {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wahyu\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//link web
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Log in
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("loginusername")).sendKeys("Dwi");
		driver.findElement(By.id("loginpassword")).sendKeys("1234");
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

	}
}

package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginCloud {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://stage-bwa.3rdeyecam.com/tem/awti/login");

		driver.findElement(By.id("username")).sendKeys("mayurdhvajsinh.sodha@einfochips.com");

		driver.findElement(By.id("password")).sendKeys("Automation@123");

		driver.findElement(By.className("buttonText")).click();
			
		driver.close();

	}

}

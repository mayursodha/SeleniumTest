package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowsers {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Jars\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stage-bwa.3rdeyecam.com/tem/awti/login");
		String title = driver.getTitle();
		System.out.println(title.length());
		System.out.println(title);
		
		
		
		driver.close();
	}

}

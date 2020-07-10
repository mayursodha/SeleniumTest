package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://timesofindia.indiatimes.com/poll.cms");	
		String captcha = driver.findElement(By.id("mathq2")).getText();			
		System.out.println("captcha : "+ captcha);	
		WebElement ct = driver.findElement(By.id("mathuserans2"));	
		
//		String[] arrsplit = captcha.split("\\s");
//		
//		for (int i=0;i<= arrsplit.length;i++)
//			{
//			System.out.println(arrsplit[i]);
//			}
		if (captcha.charAt(2)== '+')
		{
			int sum = Character.getNumericValue(captcha.charAt(0)) + Character.getNumericValue(captcha.charAt(4));
			System.out.println("Totalsum : " + sum);
			ct.sendKeys(Integer.toString(sum));
			
		}else if(captcha.charAt(2)=='-'){
			int sub = Character.getNumericValue(captcha.charAt(0)) - Character.getNumericValue(captcha.charAt(4));
			System.out.println("Totalsub : " + sub);
			ct.sendKeys(Integer.toString(sub));
						
		}else if (captcha.charAt(2)=='X') {
			
			int multi = Character.getNumericValue(captcha.charAt(0)) * Character.getNumericValue(captcha.charAt(4));
			System.out.println("Totalmulti : " + multi);
			ct.sendKeys(Integer.toString(multi));
		}
		
		driver.findElement(By.xpath("//div[@class='homesprite vot']")).click();
	}

}

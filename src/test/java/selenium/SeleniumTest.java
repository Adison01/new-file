package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		try {
			Thread.sleep(3000);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		WebElement textbox = driver.findElement(By.name("q"));
		textbox.sendKeys("Automation Step by Step");
		//to press enter on search box
		textbox.sendKeys(Keys.RETURN);
		
		//driver.close();
		
		
		
		
		
		
		
	}
	
	
	
	
}

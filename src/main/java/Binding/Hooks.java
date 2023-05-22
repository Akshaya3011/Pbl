package Binding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	
	public static String URL = "https://www.nykaa.com";
	public static WebDriver driver;
	
	//@Before
	public void Start() {
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		driver.get(URL);
		
		System.out.println("From hooks Start****");
	}
	
	//@After
	public void End() {
		driver.quit();
	}

}

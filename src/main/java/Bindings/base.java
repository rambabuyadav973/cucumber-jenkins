package Bindings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	

	public static String URL = "https://petstore.octoperf.com/";
	public static WebDriver driver;
	
	
	@BeforeAll
	public static void start() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	
	@AfterAll
	public static void teardown() {
		driver.quit();
	}
	
}

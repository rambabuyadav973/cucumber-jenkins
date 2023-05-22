package signinpage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import Bindings.base;
import baseaction.pageaction;

public class signinpage{
	
	
	static By firstlink = By.tagName("a");
	static By signin = By.xpath("//a[text()='Sign In']");
	static By username = By.xpath("//input[@name =\"username\"]");
	static By password = By.xpath("//input[@name=\"password\"]");
	static By loginbtn =By.xpath("//input[@name=\"signon\"]");
	
	
	
	public static void launching() {
		pageaction.launch();
	}
	
	public static void clickonlink() {
		pageaction.clicking(firstlink);
	}
	
	public static void clickonsignin() {
		pageaction.clicking(signin);
	}
	
	public static void enterusername(String text) {
		pageaction.entervalues(username ,text);
	}
	
	public static void enterpassword(String text) {
		pageaction.entervalues(password, text);
	}
	
	public static void login() {
		pageaction.clicking(loginbtn);
	}
	
	public static void verifying() {
		assertEquals(base.driver.getCurrentUrl(), "https://petstore.octoperf.com/actions/Catalog.action");
	}
	
	
	
}

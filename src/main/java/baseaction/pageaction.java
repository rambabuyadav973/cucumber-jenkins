package baseaction;

import org.openqa.selenium.By;

import Bindings.base;

public class pageaction {

	public static String URL = "https://petstore.octoperf.com/";
	
	public static void launch() {
		base.driver.get(URL);
	}
	
	public static void clicking(By ele) {
		base.driver.findElement(ele).click();
	}
	
	public static void entervalues(By ele,String data) {
		base.driver.findElement(ele).clear();
		base.driver.findElement(ele).sendKeys(data);
	}	
	
}

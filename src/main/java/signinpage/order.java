package signinpage;

import org.openqa.selenium.By;

import baseaction.pageaction;

public class order {

	public static void item(String item) {
		By fishlink = By.xpath("//a[contains(@href,\"" + item + "\")]");
		pageaction.clicking(fishlink);
		
	}

	public static void clickonproductid(String id) {
		By productid = By.xpath("//a[contains(@href,'"+ id +"')]");
		pageaction.clicking(productid);

	}

	public static void clickonitemid(String id) {
		By itemid = By.linkText(id);
		pageaction.clicking(itemid);

	}
	
	public static void clickonaddtocart() {
		By addtocart = By.linkText("Add to Cart");
		pageaction.clicking(addtocart);
	}
	
	public static void clickonproceedtopay() {
		By proceedtopay = By.linkText("Proceed to Checkout");
		pageaction.clicking(proceedtopay);
	}
	
	public static void clickoncontinue() {
		By continuebtn = By.name("newOrder");
		pageaction.clicking(continuebtn);
	}
	
	public static void clickonconfirm() {
		By confirmbtn =  By.linkText("Confirm");
		pageaction.clicking(confirmbtn);
	}

}

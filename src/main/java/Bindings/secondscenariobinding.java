package Bindings;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import signinpage.order;

public class secondscenariobinding {

	@Given("^I click on Fish$")
	public void i_click_on_fish(DataTable dt) {
		System.out.println("fish clicked");
		List<List<String>> data = dt.asLists(String.class);
		order.item(data.get(0).get(0));
		
		
		System.out.println("#####" + data.get(0).get(0));
	}

	@And("^I click on second$")
	public void i_click_on_f1sw01(DataTable dt) {
		System.out.println("F1");
		List<List<String>> data = dt.asLists(String.class);
		order.clickonproductid(data.get(0).get(0));
		System.out.println("#####" + data.get(0).get(0));
	}

	@And("^I click on third$")
	public void i_click_on_est1(DataTable dt) {
		System.out.println("EST");
		List<List<String>> data = dt.asLists(String.class);
		order.clickonitemid(data.get(0).get(0));
		System.out.println("#####" + data.get(0).get(0));
		
	}

	@And("^I click add to cart$")
	public void i_click_add_to_cart() {
		System.out.println("clicked on cart");
		order.clickonaddtocart();
	}

	@And("^I click proceed to checkout$")
	public void i_click_proceed_to_checkout() {
		System.out.println("i cliked on proceed");
		order.clickonproceedtopay();
	}

	@And("^I click on continue$")
	public void i_click_on_continue() {
		System.out.println("i clicked on continue");
		order.clickoncontinue();
	}

	@And("^I click on confirm$")
	public void i_click_on_confirm() {
		System.out.println("i cliked on confirm");
		order.clickonconfirm();
	}

	@Then("^I validate fish order is placed$")
	public void i_validate_fish_order_is_placed() {
		System.out.println("i validate the user");
	}

}
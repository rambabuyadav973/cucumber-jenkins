package Bindings;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import signinpage.signinpage;


public class signinbinding {

	@Given("I want to launch the browser")
	public void i_want_to_launch_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("launched");
	    signinpage.launching();
	}

    @And("^I click on the link$")
    public void i_click_on_the_link()  {
    	System.out.println("i clicked on link");
    	signinpage.clickonlink();
    }
    
    @When("^I click on sign in$")
    public void i_click_on_sign_in()  {
    	System.out.println("i click on sign in");
    	signinpage.clickonsignin();
    }

    @And("^I enter username (.+)$")
    public void i_enter_username(String name)  {
      System.out.println("i enter username "+name);
      signinpage.enterusername(name);
    }

    @And("^I enter password (.+)$")
    public void i_enter_password(String password)  {
      System.out.println("i enter password "+password);
      signinpage.enterpassword(password);
    }

    @And("^I click on login$")
    public void i_click_on_login()  {
      System.out.println("i clicked on login");
      signinpage.login();
    }
    
    @Then("^I validate the outcomes$")
    public void i_validate_the_outcomes()  {
      System.out.println("verified");
      signinpage.verifying();
    }


}
//package Bindings;
//
//import org.junit.runner.RunWith;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.cucumber.junit.Cucumber;
//import signinpage.signinpage;
//
//@RunWith(Cucumber.class)
//public class signinbinding {
//
//    @Given("^I want to launch the browser $")
//    public void i_want_to_launch_the_browser()  {
//    	signinpage.launching();
//    }
//
//    @Given("^I click on Fish$")
//    public void i_click_on_fish()  {
//   
//    }
//
//    @When("^I click on sign in$")
//    public void i_click_on_sign_in()  {
//    	signinpage.clickonsignin();
//   
//    }
//
//    @Then("^I validate fish order is placed$")
//    public void i_validate_fish_order_is_placed()  {
//   
//    }
//
//    @And("^I click on the link$")
//    public void i_click_on_the_link()  {
//    	signinpage.clickonlink();
//   
//    }
//
//    @And("^I enter username (.+)$")
//    public void i_enter_username(String name)  {
//    	signinpage.enterusername(name);
//   
//    }
//
//    @And("^I enter password (.+)$")
//    public void i_enter_password(String password)  {
//    	signinpage.enterpassword(password);
//   
//    }
//
//    @And("^I click on login$")
//    public void i_click_on_login()  {
//    	 signinpage.login();
//   
//    }
//
//    @And("^I click on second$")
//    public void i_click_on_second()  {
//   
//    }
//
//    @And("^I click on third $")
//    public void i_click_on_third()  {
//   
//    }
//
//    @And("^I click add to cart$")
//    public void i_click_add_to_cart()  {
//   
//    }
//
//    @And("^I click proceed to checkout$")
//    public void i_click_proceed_to_checkout()  {
//   
//    }
//
//    @And("^I click on continue$")
//    public void i_click_on_continue()  {
//   
//    }
//
//    @And("^I click on confirm$")
//    public void i_click_on_confirm()  {
//   
//    }
//    
//    @Then("^I validate the outcomes$")
//	public void i_validate_the_outcomes() {
//		System.out.println("verified");
//		signinpage.verifying();
//	}
//
//}
//
//
//
//











































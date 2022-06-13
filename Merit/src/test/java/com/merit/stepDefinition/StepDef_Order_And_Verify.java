package com.merit.stepDefinition;

import com.merit.pages.Order_And_Verify;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef_Order_And_Verify {
	
	@Given("^user is on login page$")
	public void user_is_on_login_page()   {
	   
		Order_And_Verify.url();
		
	}

	@When("^the user enters the \"([^\"]*)\"and \"([^\"]*)\" credentials$")
	public void the_user_enters_the_and_credentials(String arg1, String arg2)   {
	   
		
		Order_And_Verify.email();
		Order_And_Verify.password();
		
		
	}

	@When("^clicks on the login button$")
	public void clicks_on_the_login_button()  {
	   
		Order_And_Verify.signin();
		
		
	}

	@Then("^the user should be navigate to home page$")
	public void the_user_should_be_navigate_to_home_page()  {
	   
		Order_And_Verify.home();
		System.out.println("User is on Home Page");
	}

	//To Place a Order 
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page()  {
	   
		Order_And_Verify.url();
		Order_And_Verify.email();
		Order_And_Verify.password();
		Order_And_Verify.signin();
		System.out.println("User is on Home Page");
	}

	@When("^the user click \"([^\"]*)\"$")
	public void the_user_click(String arg1)  {
		
		Order_And_Verify.selectproduct();
		//System.out.println("Hi");
		
	   
	}

	@When("^clicks on the product \"([^\"]*)\"$")
	public void clicks_on_the_product(String arg1)   {
	   
		Order_And_Verify.addkart();
		
	}

	@When("^open Cart and click \"([^\"]*)\"$")
	public void open_Cart_and_click(String arg1)  {
	   
		Order_And_Verify.kart();
		
	}

	@When("^click \"([^\"]*)\"$")
	public void click(String arg1)  {
		
		Order_And_Verify.order();
	  
	}

	@Then("^the user should be navigate to invoice copy$")
	public void the_user_should_be_navigate_to_invoice_copy()  {
	   
	Order_And_Verify.output();
	Order_And_Verify.home();
	
	}
	
	/////////////////////////////////
	
	@Given("^user is on user login page$")
	public void user_is_on_user_login_page()  {
	   Order_And_Verify.url();
	}

	@When("^the user enter username and password and click the submilt button$")
	public void the_user_enter_username_and_password_and_click_the_submilt_button() throws Throwable {
		Order_And_Verify.email();
		Order_And_Verify.password();
		Order_And_Verify.signin();
		
	}

	@When("^click the product$")
	public void click_the_product()  {
		Order_And_Verify.chooseproduct();
	   
	}

	@Then("^user give the seller information$")
	public void user_give_the_seller_information()  {
		Order_And_Verify.billigdetails();
	   Order_And_Verify.home();
	}
	
	
}



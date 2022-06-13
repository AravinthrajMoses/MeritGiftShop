package com.merit.stepDefinition;

import com.merit.pages.Order_Verify_StatusChange;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDef_Order_Verify_StatusChange  {

	@Given("^admin logged in with valid credentials$")
	public void admin_logged_in_with_valid_credentials() {

		try {
			Order_Verify_StatusChange.driverAndUrl();

		}
		catch(Exception e) {
			System.err.println("Exception is: "+e);
		}
		Order_Verify_StatusChange.meritUsername();
		Order_Verify_StatusChange.meritPassword();
		Order_Verify_StatusChange.loginButton();
	}

	@Then("^select pending orders from orders$")
	public void select_pending_orders_from_orders() {
		Order_Verify_StatusChange.ordersMenu();
		Order_Verify_StatusChange.pendingOrderPage();

	}

	@Then("^search order id to add track order$")
	public void search_order_id_to_add_track_order() throws Throwable {
		Order_Verify_StatusChange.searchBoxInPending();
		Order_Verify_StatusChange.confirmAfterSearchInPending();
		Order_Verify_StatusChange.actionButton();
		Order_Verify_StatusChange.trackOrderOption();
		Order_Verify_StatusChange.addingTitleInTrackOrder();
		Order_Verify_StatusChange.addingDetailsInTrackOrder();
		Order_Verify_StatusChange.addButtonOfTrackOrder();
		Order_Verify_StatusChange.addTrackOrderConfirmation();
		Order_Verify_StatusChange.closeTrackOrder();

	}

	@Then("^change delivery status to processing$")
	public void change_delivery_status_to_processing() throws Throwable {
		Order_Verify_StatusChange.actionButton();
		Order_Verify_StatusChange.deliveryStatusOption();
		Order_Verify_StatusChange.paymentStatusSelection();
		Order_Verify_StatusChange.deliveryStatusSelection();
		Order_Verify_StatusChange.trackNoteAddition();
		Order_Verify_StatusChange.savingOrderStatus();	
	}

	@Then("^confirm the status change$")
	public void confirm_the_status_change() {
		Order_Verify_StatusChange.confirmationOfDeliveryStatus();
		Order_Verify_StatusChange.home1();
	}

	@Then("^select processing orders from orders$")
	public void select_processing_orders_from_orders() {
		Order_Verify_StatusChange.ordersMenu();
		Order_Verify_StatusChange.processingOrdersPage();
	}

	@Then("^search order id to update track order$")
	public void search_order_id_to_update_track_order() {
		Order_Verify_StatusChange.searchBoxInPending();
		Order_Verify_StatusChange.confirmAfterSearchInPending();
		Order_Verify_StatusChange.actionButton();
		Order_Verify_StatusChange.trackOrderOption();
		Order_Verify_StatusChange.editTrackOrder();
		Order_Verify_StatusChange.updatingTitleInTrackOrder();
		Order_Verify_StatusChange.updatingDeatilsInTrackOrder();
		Order_Verify_StatusChange.updateButtonOfTrackOrder();
		Order_Verify_StatusChange.updateTrackOrderConfirmation();
		Order_Verify_StatusChange.closeTrackOrder();
	}

	@Then("^change delivery status to completed$")
	public void change_delivery_status_to_completed() {
		Order_Verify_StatusChange.actionButton();
		Order_Verify_StatusChange.deliveryStatusOption();
		Order_Verify_StatusChange.statusUpdationToComplete();
		Order_Verify_StatusChange.trackNotesInProcessing();
		Order_Verify_StatusChange.savingOrderStatus();
	}

	@Then("^confirm the status update$")
	public void confirm_the_status_update() {
		Order_Verify_StatusChange.confirmationOfDeliveryStatus();
		Order_Verify_StatusChange.home1();
	}

	@Then("^select completed orders from orders$")
	public void select_completed_orders_from_orders() {
		Order_Verify_StatusChange.ordersMenu();
		Order_Verify_StatusChange.completedOrderPage();
	}

	@Then("^search order id to delete track order$")
	public void search_order_id_to_delete_track_order() {
		Order_Verify_StatusChange.searchBoxInPending();
		Order_Verify_StatusChange.confirmAfterSearchInPending();
		Order_Verify_StatusChange.actionButton();
		Order_Verify_StatusChange.trackOrderOption();
		Order_Verify_StatusChange.deleteTrackOrder();
	}

	@Then("^confirm the delete order status$")
	public void confirm_the_delete_order_status() {
		Order_Verify_StatusChange.deleteTrackOrderConfirmation();
		Order_Verify_StatusChange.closeTrackOrder();
		Order_Verify_StatusChange.home1();
	}

	//////////////////////////////////////////////////////////////////////
	@Given("^user is on admin login page$")
	public void user_is_on_admin_login_page()  {
		Order_Verify_StatusChange.driverAndUrl();
		Order_Verify_StatusChange.meritUsername();
		Order_Verify_StatusChange.meritPassword();
		Order_Verify_StatusChange.loginButton();

	}


	@When("^user enter orderid in pending order searchbox$")
	public void user_enter_orderid_in_pending_order_searchbox()  {
		Order_Verify_StatusChange.order();
	}

	@When("^click the delivery satus option in action$")
	public void click_the_delivery_satus_option_in_action()  {
		Order_Verify_StatusChange.actionfield();

	}

	@When("^Enter the delivery status and save the page$")
	public void enter_the_delivery_status_and_save_the_page()  {
		Order_Verify_StatusChange.deliverystaus();

	}

	@Then("^check the declined id in declined order$")
	public void check_the_declined_id_in_declined_order()  {
		Order_Verify_StatusChange.checkdeclinedfield();
		Order_Verify_StatusChange.home1();
	}}

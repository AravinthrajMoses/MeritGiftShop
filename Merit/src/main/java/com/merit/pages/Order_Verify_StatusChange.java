package com.merit.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.merit.base.Base;

public class Order_Verify_StatusChange extends Base  {//WebElements To Login Admin page of Merit Gift Shop(Scenario 1)
	@FindBy(xpath = "//*[@id='details-button']")
	public static WebElement advanceButton;
	@FindBy(id = "proceed-link")
	public static WebElement proceedLink;
	@FindBy(xpath = "//*[@class='User Name']")
	public static WebElement usernameField;
	@FindBy(xpath = "//*[@class='Password']")
	public static WebElement passwordField;
	@FindBy(xpath = "//*[@class='submit-btn']")
	public static WebElement loginButton;

	//WebElements To check Track Order function in Pending Orders(Scenario 2)
	@FindBy(xpath = "//*[@id='accordion']/li[2]")
	public static WebElement OrdersButton;

	@FindBy(xpath = "//*[@id='order']/li[2]")
	public static WebElement pendingOrders;

	@FindBy(xpath = "//*[@class='form-control form-control-sm']")
	public static WebElement searchInPendingOrders;

	//static String orderId=or.out;//orderID


	@FindBy(xpath = "//*[@id='geniustable_info'][contains (text(),'filtered')]")
	public static WebElement visibleOfText;
	@FindBy(xpath = "//*[@class='go-dropdown-toggle']")
	public static WebElement actionsInPendingOrders1;
	@FindBy(xpath = "//*[@class='track']")
	public static WebElement trackOrderInPending;
	@FindBy(xpath = "//*[@id='track-title']")
	public static WebElement titleInTrackOrder;
	@FindBy(xpath = "//*[@id='track-details']")
	public static WebElement detailsInTrackOrder;
	@FindBy(xpath = "//*[@id='track-btn']")
	public static WebElement addButtonInTrackOrder;
	@FindBy(xpath = "//*[text()='New Data Added Successfully.']")
	public static WebElement addconfirmationOfTrackOrderInPending;
	@FindBy(xpath = "(//span[@aria-hidden='true'])[3]")//*[@class='btn btn-secondary']
	public static WebElement closeIcon;

	//Pending to Processing status change
	@FindBy(xpath = "//*[@class='delivery']")
	public static WebElement deliveryStatus1;
	@FindBy(name = "payment_status")
	public static WebElement paymentStatusDropDown;
	@FindBy(name = "status")
	public static WebElement deliveryStatusDropDown;
	@FindBy(name = "track_text")
	public static WebElement trackNoteText;
	@FindBy(xpath = "//*[@class='addProductSubmit-btn']")
	public static WebElement saveButton;
	@FindBy(xpath = "//*[text()='Status Updated Successfully.']")
	public static WebElement processingUpdateStatus;

	//Track Order Update In Processing Orders  
	@FindBy(xpath = "//*[@id='order']/li[3]")
	public static WebElement processingOrders;
	@FindBy(xpath = "//*[text()='For Testing Purpose']/following::*[@class='track-edit'][1]")
	public static WebElement editTrackOrderInProcessing;
	@FindBy(xpath = "//*[@id='track-title']")
	public static WebElement updateTrackOrderTitleInProcessing;
	@FindBy(xpath = "//*[@id='track-details']")
	public static WebElement updateInTrackOrderDetailsInProcessing;
	@FindBy(xpath = "//*[@id='track-btn']")
	public static WebElement updateButtonOfTrackOrderInProcessing;
	@FindBy(xpath = "//*[text()='Data Updated Successfully.']")
	public static WebElement updateConfirmationOfTrackOrderInProcessing;

	//Processing to Completed Status Change
	//Same Elements used as present above(Pending to Processing status change)
	@FindBy(xpath = "//*[@name='track_text']")
	public static WebElement trackNoteTextInProcess;

	//Track Order Deletion in Completed Orders
	@FindBy(xpath = "//*[@id='order']/li[4]")
	public static WebElement completedOrders;
	@FindBy(xpath = "//*[text()='Update Check Test']/following::*[@class='track-delete'][1]")
	public static WebElement deleteTrackOrderInCompleted;
	@FindBy(xpath = "//*[text()='Data Deleted Successfully.']")
	public static WebElement deleteConfirmationOfTrackOrderInCompleted;
	
	
	///////////Siman////////////////////////////
	
	@FindBy(xpath = "//*[@id='details-button']")
	public static WebElement advancebutton;
	
	@FindBy(xpath = "//*[@id='proceed-link']")
	public static WebElement proceedbutton;
	
	@FindBy(xpath="//*[@class='User Name']")
	public static WebElement adminusername;
	
	@FindBy(xpath="//*[@class='Password']")
	public static WebElement adminpassword;
	
	@FindBy(xpath="//*[@class='submit-btn']")
	public static WebElement loginbutton;
	
	//product order webElement
	
	@FindBy(xpath="(//*[@class='accordion-toggle wave-effect waves-effect waves-button'])[1]")
	public static WebElement orderbutton;
	
	@FindBy(xpath="//*[text()=' Pending Orders']")
	public static WebElement pendingorderbutton;
	
	@FindBy(xpath="//*[@class='form-control form-control-sm']")
	public static WebElement pendingordersearchbox;
	
	//actionfield  webElement
	
	@FindBy(xpath="//*[@id='geniustable_info'][contains (text(),'filtered')]")
	public static WebElement fillterlist;
	
	@FindBy(xpath="//*[@class='go-dropdown-toggle']")
	public static WebElement actionbutton;
	
	@FindBy(xpath="//*[@class='delivery']")
	public static WebElement deliverystatusbutton;
	
	@FindBy(xpath="//*[@name='payment_status']")
	public static WebElement paymentstatus;
	
	@FindBy(xpath="//*[@name='status']")
	public static WebElement deliverystaus;
	
	@FindBy(xpath="(//*[@class='input-field'])[2]")
	public static WebElement tracknotes;
	
	@FindBy(xpath="//*[@class='addProductSubmit-btn']")
	public static WebElement savebutton;
	
	//declined webelement
	
	@FindBy(xpath = "//*[@id='order']/li[5]")
	public static WebElement declinedfield;
	
	@FindBy(xpath = "//*[@type='search']")
	public static WebElement declinedsearchbox;
	
	@FindBy(xpath="//*[text()='Status Updated Successfully.']")
	public static WebElement confirmation;
	


	//Scenario-1
	public static void driverAndUrl() 
	{
		Base.objectcreation();
		Base.adminUrl();
		PageFactory.initElements(driver,Order_Verify_StatusChange.class );
		advanceButton.click();
		proceedLink.click();

	}
	public static void meritUsername()
	{
		usernameField.sendKeys(prop.getProperty("username"));
	}
	public static void meritPassword()
	{
		passwordField.sendKeys(prop.getProperty("password"));
	}
	public static void loginButton() {
		loginButton.click();
	}

	//Scenario-2
	public static void ordersMenu() {
		wait.until(ExpectedConditions.elementToBeClickable(OrdersButton)).click();;
	}
	public static void pendingOrderPage() {
		wait.until(ExpectedConditions.elementToBeClickable(pendingOrders)).click();
	}

	public static void searchBoxInPending() {
		System.out.println(Order_And_Verify.getOrderId);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOf(searchInPendingOrders)).sendKeys(Order_And_Verify.getOrderId);

	}
	public static void confirmAfterSearchInPending() {
		wait.until(ExpectedConditions.textToBePresentInElement(visibleOfText, prop.getProperty("visibleText")));	
	}
	public static void actionButton() {
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		wait.until(ExpectedConditions.elementToBeClickable(actionsInPendingOrders1)).click();	
	}
	public static void trackOrderOption() {
		wait.until(ExpectedConditions.elementToBeClickable(trackOrderInPending)).click();
	}
	public static void addingTitleInTrackOrder() {
		wait.until(ExpectedConditions.elementToBeClickable(titleInTrackOrder)).sendKeys(prop.getProperty("trackOrderTitleInPending"));
	}
	public static void addingDetailsInTrackOrder() {
		wait.until(ExpectedConditions.elementToBeClickable(detailsInTrackOrder)).sendKeys(prop.getProperty("trackOrderDetailsInPending"));	

	}
	public static void addButtonOfTrackOrder() {
		wait.until(ExpectedConditions.elementToBeClickable(addButtonInTrackOrder)).click();
	}
	public static void closeTrackOrder() {
		wait.until(ExpectedConditions.elementToBeClickable(closeIcon)).click();
	}
	public static void addTrackOrderConfirmation() {
		wait.until(ExpectedConditions.textToBePresentInElement(addconfirmationOfTrackOrderInPending, prop.getProperty("confirmationOfTrackOrderInPending")));
		String confirmInPending = addconfirmationOfTrackOrderInPending.getText();
		System.out.println("Track Order Status in Pending Orders : "+confirmInPending);
	}

	//Pending to Processing
	public static void deliveryStatusOption() {
		wait.until(ExpectedConditions.elementToBeClickable(deliveryStatus1)).click();
	}
	public static void paymentStatusSelection(){
		select = new Select(wait.until(ExpectedConditions.visibilityOf(paymentStatusDropDown)));
		select.selectByValue(prop.getProperty("paymentStatusDropDownInPending"));
	}
	public static void deliveryStatusSelection(){
		select = new Select(wait.until(ExpectedConditions.visibilityOf(deliveryStatusDropDown)));
		select.selectByValue(prop.getProperty("deliveryStatusDropDownInPending"));
	}
	public static void trackNoteAddition(){
		wait.until(ExpectedConditions.elementToBeClickable(trackNoteText)).sendKeys(prop.getProperty("trackNoteInPending"));
	}
	public static void savingOrderStatus(){
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}
	public static void confirmationOfDeliveryStatus(){
		wait.until(ExpectedConditions.textToBePresentInElement(processingUpdateStatus,prop.getProperty("pendingToProcessUpdate")));
		String processingStatusInPending = processingUpdateStatus.getText();
		System.out.println("Pending To Processing Status : "+processingStatusInPending);
	}

	//Track Order Update in Processing Orders
	public static void processingOrdersPage() {
		wait.until(ExpectedConditions.elementToBeClickable(processingOrders)).click();
	}
	public static void editTrackOrder() {
		wait.until(ExpectedConditions.elementToBeClickable(editTrackOrderInProcessing)).click();
	}
	public static void updatingTitleInTrackOrder() {
		wait.until(ExpectedConditions.elementToBeClickable(updateTrackOrderTitleInProcessing)).clear();
		wait.until(ExpectedConditions.elementToBeClickable(updateTrackOrderTitleInProcessing)).sendKeys(prop.getProperty("updateTrackOrderTitle"));
	}
	public static void updatingDeatilsInTrackOrder() {
		wait.until(ExpectedConditions.elementToBeClickable(updateInTrackOrderDetailsInProcessing)).clear();
		wait.until(ExpectedConditions.elementToBeClickable(updateInTrackOrderDetailsInProcessing)).sendKeys(prop.getProperty("updateTrackOrderDetail"));
	}
	public static void updateButtonOfTrackOrder() {
		wait.until(ExpectedConditions.elementToBeClickable(updateButtonOfTrackOrderInProcessing)).click();
	}
	public static void updateTrackOrderConfirmation() {
		wait.until(ExpectedConditions.textToBePresentInElement(updateConfirmationOfTrackOrderInProcessing, prop.getProperty("updateConfirmationOfTrackOrderInProcess")));
		String trackOrderUpdate = updateConfirmationOfTrackOrderInProcessing.getText();
		System.out.println("Track Order Status in Processing Orders : "+trackOrderUpdate);
	}

	//Processing To Completed
	//Same methods have been used in Step Definition as present above in Pending to Processing
	public static void trackNotesInProcessing() {
		wait.until(ExpectedConditions.elementToBeClickable(trackNoteTextInProcess)).sendKeys(prop.getProperty("trackNoteInProcessing"));
	}	
	public static void statusUpdationToComplete() {
		wait.until(ExpectedConditions.visibilityOf(deliveryStatusDropDown));
		select = new Select(deliveryStatusDropDown);
		select.selectByValue(prop.getProperty("deliveryStatusDropDownInProcessing"));
	}

	//Track Order Deletion in Completed Orders
	public static void completedOrderPage () {
		wait.until(ExpectedConditions.elementToBeClickable(completedOrders)).click();
	}
	public static void deleteTrackOrder() {
		wait.until(ExpectedConditions.elementToBeClickable(deleteTrackOrderInCompleted)).click();
	}
	public static void deleteTrackOrderConfirmation() {
		wait.until(ExpectedConditions.textToBePresentInElement(deleteConfirmationOfTrackOrderInCompleted, prop.getProperty("deleteConfirmationOfTrackOrderInCompleted")));
		String deletetrackOrderUpdate = deleteConfirmationOfTrackOrderInCompleted.getText();              
		System.out.println("Track Order Status in Completed Orders : "+deletetrackOrderUpdate);
		//driver.quit();
	}
	
	public static void order() {
		wait.until(ExpectedConditions.elementToBeClickable(orderbutton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(pendingorderbutton)).click();
		//wait.until(ExpectedConditions.elementToBeClickable(pendingordersearchbox)).click();
	}
	
	public static void actionfield() {
		pendingordersearchbox.sendKeys(Order_And_Verify.OrderNo);
		wait.until(ExpectedConditions.textToBePresentInElement(fillterlist, prop.getProperty("filter")));
		wait.until(ExpectedConditions.elementToBeClickable(actionbutton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deliverystatusbutton)).click();
		
	}
	
	public static void deliverystaus() {
		
		Select payment=new Select(wait.until(ExpectedConditions.visibilityOf(paymentstatus)));
		payment.selectByIndex(0);
		Select delivery=new Select(wait.until(ExpectedConditions.visibilityOf(deliverystaus)));	
		delivery.selectByIndex(4);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		tracknotes.sendKeys(prop.getProperty("tracknote"));
		wait.until(ExpectedConditions.elementToBeClickable(savebutton)).click();
		wait.until(ExpectedConditions.textToBePresentInElement(confirmation, prop.getProperty("conformtext")));
		String conformationmsg=confirmation.getText();
		System.out.println(conformationmsg);
		
		
	}
	
	public static void  checkdeclinedfield() {
		
		//wait.until(ExpectedConditions.elementToBeClickable(orderbutton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(declinedfield)).click();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		declinedsearchbox.sendKeys(Order_And_Verify.OrderNo);
		
	}
	public static void home1() {
		
		driver.quit();
	}}

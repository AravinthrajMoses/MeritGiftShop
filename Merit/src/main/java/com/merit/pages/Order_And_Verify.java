package com.merit.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.merit.base.Base;



public class Order_And_Verify extends Base {

	public static String OrderNo;
	public static String  getOrderId ;


	@FindBy(xpath = "//*[@id='details-button']")
	public static WebElement advance;

	@FindBy(xpath = "//*[@id='proceed-link']")
	public static WebElement unsafe;

	@FindBy(xpath = "//*[@class='icon-user']")
	public static WebElement log;

	@FindBy(xpath = "(//*[@class='form-control'])[3]")
	public static WebElement mail;

	@FindBy(xpath = "(//*[@id='login_pass'])[1]")
	public static WebElement pass;

	@FindBy(xpath = "(//*[@class='icon-long-arrow-right'])[13]")
	public static WebElement sign;

	@FindBy(xpath = "(//*[@class='product-media'])[1]")
	public static WebElement select;

	//@FindBy(xpath = "(//*[@class='btn-product btn-cart add-to-cart'])[1]")
	//public static WebElement select1;

	@FindBy(xpath = "(//*[@class='product-action'])[1]")
	public static WebElement select1;

	@FindBy(xpath = "//*[@id='cart-count']")
	public static WebElement cart;

	@FindBy (xpath = "(//*[@class='btn btn-outline-primary-2'])[1]")
	public static WebElement checkout1;

	@FindBy(xpath = "(//*[@class='btn btn-outline-primary-2 btn-order btn-block'])[1]")
	public static WebElement place;

	@FindBy (xpath = "//*[@class='col-lg-12']/following::div[@class='product-header-title']")
	public static WebElement track;

	/////////////////////////////////////

	//WebElement to login user page of MeritGiftShop

	@FindBy(xpath = "//*[@id='details-button']")
	public static WebElement advancebutton;
	@FindBy(xpath = "//*[@id='proceed-link']")
	public static WebElement proceedbutton;
	@FindBy(xpath = "//*[@class='icon-user']")
	public static WebElement usersigninbutton;
	@FindBy(xpath = "(//*[@id='login_email'])[1]")
	public static WebElement loginemailbutton;
	@FindBy(xpath = "(//*[@id='login_pass'])[1]")
	public static WebElement loginpassword;
	@FindBy(xpath = "(//*[@type='submit'])[3]")
	public static WebElement submitbutton;

	// webElement to choose product and check out

	@FindBy(xpath = "(//*[@class='product-media'])[2]")
	public static WebElement chooseproduct;

	@FindBy(xpath = "(//*[@class='product-action'])[2]")
	public static WebElement addtocart;

	@FindBy(xpath = "//*[@id='cart-count']")
	public static WebElement shopingcart;

	@FindBy(xpath = "(//*[@class='btn btn-outline-primary-2'])[1]")
	public static WebElement checkout;

	// WebElement to buyer information

	@FindBy(xpath = "(//*[@class='form-control'])[3]")
	public static WebElement name;
	@FindBy(xpath = "(//*[@class='form-control'])[4]")
	public static WebElement phone;
	@FindBy(xpath = "(//*[@class='form-control'])[5]")
	public static WebElement email;
	@FindBy(xpath = "(//*[@class='form-control'])[6]")
	public static WebElement address;
	@FindBy(xpath = "(//*[@class='form-control'])[7]")
	public static WebElement country;
	@FindBy(xpath = "(//*[@class='form-control'])[8]")
	public static WebElement city;
	@FindBy(xpath = "(//*[@class='form-control'])[9]")
	public static WebElement postcode;
	@FindBy(xpath = "//*[@class='btn-text']")
	public static WebElement placeorder;
	@FindBy(xpath="//*[@class='product-header-title']")
	public static WebElement producttitle;


	public static void url()  {

		Base.objectcreation();
		Base.usrurl();
		PageFactory.initElements(driver, Order_And_Verify.class);
		//		advance.click();
		//		unsafe.click();
		//		log.click();
		wait.until(ExpectedConditions.elementToBeClickable(advance)).click();
		wait.until(ExpectedConditions.elementToBeClickable(unsafe)).click();
		wait.until(ExpectedConditions.elementToBeClickable(log)).click();


	}
	public static void email()  {

		//mail.sendKeys(reverse.getProperty("id")); // Enter id

		wait.until(ExpectedConditions.visibilityOf(mail)).sendKeys(prop.getProperty("id"));


	}

	public static void password() {

		//pass.sendKeys(reverse.getProperty("pass1"));// Enter Email id

		wait.until(ExpectedConditions.visibilityOf(pass)).sendKeys(prop.getProperty("pass1"));

	}


	public static void signin() {

		sign.click(); // Click Sign up

	}

	public static void selectproduct()  {


		//wait.until(ExpectedConditions.elementToBeClickable(select)).click();
		try {
			Thread.sleep(3000);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("window.scroll(0,1500)", "");
			Thread.sleep(3000);
			Actions action =new Actions(driver);
			action.moveToElement(select).build().perform();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void addkart()  {

		wait.until(ExpectedConditions.elementToBeClickable(select1)).click();
	}

	public static void kart() {

		wait.until(ExpectedConditions.elementToBeClickable(cart)).click();
		wait.until(ExpectedConditions.elementToBeClickable(checkout1)).click();
	}				

	public static void order() {

		wait.until(ExpectedConditions.elementToBeClickable(place)).click();
	}

	public static  void output() {

		String out=	track.getText();

		System.out.println(out);

		getOrderId = out.substring(7);

		System.out.println(getOrderId);
		//return out;
	}

	public static void home() {

		driver.quit();

	}



	public static void chooseproduct()  {

		try {
			Thread.sleep(3000);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("window.scroll(0,1500)", "");

			Thread.sleep(3000);
			Actions action =new Actions(driver);
			action.moveToElement(chooseproduct).build().perform();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		//wait.until(ExpectedConditions.elementToBeClickable(chooseproduct)).click();
		wait.until(ExpectedConditions.elementToBeClickable(addtocart)).click();
		wait.until(ExpectedConditions.elementToBeClickable(shopingcart)).click();
		wait.until(ExpectedConditions.elementToBeClickable(checkout)).click();

	}

	public static void billigdetails() {


		name.clear();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		name.sendKeys(prop.getProperty("name"));

		wait.until(ExpectedConditions.elementToBeClickable(placeorder)).click();
		String title=producttitle.getText();
		OrderNo=title.substring(7);
		System.out.println("PURCHASE SUCESSFULLY AND YOUR ORDER NO:"+OrderNo);
		driver.quit();

	}

}

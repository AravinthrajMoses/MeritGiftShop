package com.merit.base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.merit.pages.Order_And_Verify;
import com.merit.pages.Order_Verify_StatusChange;

public class Base 
{
	public static WebDriver driver;
	public static FileInputStream fis;
	public static Properties prop;
	public static WebDriverWait wait;
	public static Select select;
	//public static Order_And_Verify or; 

	public static void objectcreation() {

		System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("https://meritgiftshop.com/");
		driver.manage().window().maximize();
		wait=new WebDriverWait(driver, 60);
		//PageFactory.initElements(driver, Order_And_Verify.class);
		//PageFactory.initElements(driver,Order_Verify_StatusChange.class );
		//or=new Order_And_Verify();

		try {
			fis = new FileInputStream("C:\\Users\\ARAVINTH\\OneDrive\\Desktop\\Project\\Updated\\Final\\Merit\\src\\main\\java\\com\\merit\\testData\\Orders.properties");
			prop = new Properties();
			prop.load(fis);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void adminUrl() {
		driver.get(prop.getProperty("url"));
	}
	
	public static void usrurl() {
		
		driver.get(prop.getProperty("userurl"));
	}
	
	
	
	
	
//	public static WebDriver driver;
//	public static WebDriverWait wait;
//	public static FileInputStream fis;
//	public static Properties prop;
//	public static Select select;
//
//	
//	public static void objectCreation()
//	{
//		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromeDriver102\\chromedriver.exe");
//		driver = new ChromeDriver(); 
//		//driver.get("https://meritgiftshop.com/");///////////
//		driver.manage().window().maximize();
//		wait = new WebDriverWait(driver, 60);
//		//PageFactory.initElements(driver, Order_And_Verify.class);//////////
//		
//		try {
//			fis = new FileInputStream("C:\\Users\\Manoj\\git\\MeritGiftShop\\Merit\\src\\main\\java\\com\\merit\\testData\\OrdersTestData.properties");
//			prop = new Properties();
//			prop.load(fis);
//		} 
//		catch (Exception e) {
//			System.out.println(e);
//			e.printStackTrace();
//		}
//	}
//	public static void adminUrl() {
//		driver.get(prop.getProperty("url"));
//	}


}

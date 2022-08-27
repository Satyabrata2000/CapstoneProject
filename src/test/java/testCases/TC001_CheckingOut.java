package testCases;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
//import com.aventstack.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;

import pages.LoginAsUser;

public class TC001_CheckingOut extends BaseClass {
	
	
	@Test
	public void LoginTest() throws InterruptedException {
		
		test = reports.createTest("LoginLink Test", "Login link clicked successfully");

		LoginAsUser login = new LoginAsUser();
		login.LoginFunction("kn@gmail.com", "12345");
		Thread.sleep(5000);
		test = reports.createTest("Login Test", "Logged into the account successfully");
		
		
		LoginAsUser Antipyretics = new LoginAsUser();
		Antipyretics.CategoriesFunction();
		Thread.sleep(5000);
		test = reports.createTest("Categories Test", "Antipyretics product selected successfully");
		
		
		LoginAsUser Cart = new LoginAsUser();
		Cart.CartFunction();
		Thread.sleep(5000);
		test = reports.createTest("Cart Test", "Product added to cart successfully");
		
		
		LoginAsUser CheckOut = new LoginAsUser();
		CheckOut.CheckOutFunction();
		Thread.sleep(5000);
		test = reports.createTest("CheckOut Test", "Product checked out successfully");
		
		
		LoginAsUser SelectAddress = new LoginAsUser();
		SelectAddress.SelectAddressFunction();
		Thread.sleep(5000);
		test = reports.createTest("Select Address", "Address Selected successfully");
		
		LoginAsUser Payment = new LoginAsUser();
		Payment.PaymentFunction("1234 5678 1234 5678", "09", "24", "123");
		Thread.sleep(5000);
		test = reports.createTest("Payment Test", "Payment made successfully");
		
		LoginAsUser Pay = new LoginAsUser();
		Pay.PayFunction();
		Thread.sleep(5000);
		test = reports.createTest("Payment Test", "Payment made successfully");
		
		LoginAsUser Continue = new LoginAsUser();
		Continue.ContinueFunction();
		Thread.sleep(5000);
		test = reports.createTest("Payment Test", "Payment made successfully");
		
		LoginAsUser logout = new LoginAsUser();
		logout.LogoutFunction();
		Thread.sleep(5000);
		test = reports.createTest("LogOut Test", "Logged out of the account successfully");

	}

}

package testCases;

import org.testng.annotations.Test;

import pages.LoginAsAdmin;
import pages.LoginAsUser;

public class TC002_ManageProducts extends BaseClass {

	@Test

	public void LoginTest() throws InterruptedException {

		test = reports.createTest("LoginLink Test", "Login link clicked successfully");

		LoginAsAdmin login = new LoginAsAdmin();
		login.LoginFunction("vk@gmail.com", "admin");
		Thread.sleep(5000);
		test = reports.createTest("Login Test", "Logged into the Admin account successfully");

		LoginAsAdmin ManageProduct = new LoginAsAdmin();
		ManageProduct.ManageProductFunction();
		Thread.sleep(5000);
		test = reports.createTest("Manage Product Test", "Manage Product Selected successfully");

		LoginAsAdmin EnterDetails = new LoginAsAdmin();
		EnterDetails.PMNameFunction("FName LName", "BName", "This is a test", "50.00", "1");
		Thread.sleep(5000);
		test = reports.createTest("Product Management Test", "Name, Brand, Description, Unit Price and Quantity entered successfully");
		
		LoginAsAdmin SaveProduct = new LoginAsAdmin();
		SaveProduct.ManageProductSaveFunction();
		Thread.sleep(5000);
		test = reports.createTest("Product Save Test", "A New Product Saved successfully");

		LoginAsAdmin logout = new LoginAsAdmin();
		logout.LogoutAdminFunction();
		Thread.sleep(5000);
		test = reports.createTest("LogOut Test", "Logged out of the account successfully");
	}
}
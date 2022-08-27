package testCases;

import org.testng.annotations.Test;
import pages.SignUp;

public class TC003_SignUp extends BaseClass {
	
	@Test
	
	public void SignUpTest() throws InterruptedException{
		
		test = reports.createTest("SignUp Test", "SignUp option clicked successfully");
		
		SignUp signup = new SignUp();
		signup.SignUpFunction();
		Thread.sleep(3000);
		
		SignUp SignUpPersonal = new SignUp();
		SignUpPersonal.SignUpPersonalFunction("FName", "LName", "a@ab.com", "9009009009", "WhatIsPassword", "WhatIsPassword");
		Thread.sleep(5000);
		test = reports.createTest("SignUp-Personal Details Test", "All details entered successfully");
		
		SignUp NextBilling = new SignUp();
		NextBilling.BillingFunction();
		Thread.sleep(3000);
		test = reports.createTest("Next Billing Test", "Next Billing Clicked successfully");
		
		SignUp SignUpAddress = new SignUp();
		SignUpAddress.SignUpAddressFunction("House No-123", "ABC Street", "City1", "123456", "State A", "Country A");
		Thread.sleep(5000);
		test = reports.createTest("SignUp-Personal Details Test", "All details entered successfully");
		
		SignUp NextConfirm = new SignUp();
		NextConfirm.ConfirmFunction();
		Thread.sleep(3000);
		test = reports.createTest("Next Confirm Test", "Next Confirm Clicked successfully");
		
		SignUp FinalConfirm = new SignUp();
		FinalConfirm.FinalConfirmFunction();
		Thread.sleep(3000);
		test = reports.createTest("Final Confirm Test", "Final Confirm Clicked successfully");
		
		SignUp LoginHere = new SignUp();
		LoginHere.LoginHereFunction();
		Thread.sleep(3000);
		test = reports.createTest("LoginHere Test", "Able to re-login successfully");
	}

}

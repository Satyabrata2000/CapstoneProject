package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import com.aventstack.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;
import testCases.BaseClass;
//import com.aventstack.extentreports.model.Log;
//import com.relevantcodes.extentreports.LogStatus;

public class LoginAsUser {

	WebDriver driver = BaseClass.driver;

	@FindBy(id = "login")
	WebElement LoginLink;

	@FindBy(name = "username")
	WebElement Email;

	@FindBy(id = "password")
	WebElement Password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement Submit;

	@FindBy(id = "a_Antipyretics")
	WebElement Antipyretics;
	
	@FindBy(xpath = "//a[@href='/medicare/cart/add/1/product']")
	WebElement Cart;
	
	@FindBy(xpath = "//a[@href='/medicare/cart/validate']")
	WebElement CheckOut;

	@FindBy(xpath = "//a[@href='/medicare/cart/checkout?execution=e1s1&_eventId_addressSelection&shippingId=1']")
	WebElement SelectAddress;
	
	@FindBy(id = "cardNumber")
	WebElement CardNumber;
	
	@FindBy(id = "expityMonth")
	WebElement ExpMM;
	
	@FindBy(id = "expityYear")
	WebElement ExpYY;
	
	@FindBy(id = "cvCode")
	WebElement CVV;
	
	@FindBy(xpath = "//a[text()='Pay']")
	WebElement Pay;
	
	@FindBy(xpath = "//a[@href='/medicare/show/all/products']")
	WebElement Continue;
	
	@FindBy(id = "dropdownMenu1")
	WebElement PrepareToLogout;

	@FindBy(id = "logout")
	WebElement Logout;

	public LoginAsUser() {
		PageFactory.initElements(driver, this);
	}

	public void LoginFunction(String UserNameVal, String PasswordVal) {
		LoginLink.click();
		Email.sendKeys(UserNameVal);
		Password.sendKeys(PasswordVal);
		Submit.click();
	}

	public void CategoriesFunction() {
		Antipyretics.click();
	}
	
	public void CartFunction() {
		Cart.click();
	}
	
	public void CheckOutFunction() {
		CheckOut.click();
	}

	public void SelectAddressFunction() {
		SelectAddress.click();
	}
	
	public void PaymentFunction(String CardNo, String ExpDateMM, String ExpDateYY, String CvvCode) {
		CardNumber.sendKeys(CardNo);
		ExpMM.sendKeys(ExpDateMM);
		ExpYY.sendKeys(ExpDateYY);
		CVV.sendKeys(CvvCode);
	}
	
	public void PayFunction() {
		Pay.click();
	}
	
	public void ContinueFunction() {
		Continue.click();
	}
	
	public void LogoutFunction() {
		PrepareToLogout.click();
		Logout.click();
	}
	
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testCases.BaseClass;

public class SignUp {

	WebDriver driver = BaseClass.driver;

	@FindBy(xpath = "//a[@href='/medicare/membership']")
	WebElement SignUp;

	@FindBy(id = "firstName")
	WebElement FName;
	
	@FindBy(id = "lastName")
	WebElement LName;
	
	@FindBy(id = "email")
	WebElement Email;
	
	@FindBy(id = "contactNumber")
	WebElement ContactNo;
	
	@FindBy(id = "password")
	WebElement Password;
	
	@FindBy(id = "confirmPassword")
	WebElement ConfirmPass;
	
	@FindBy(id = "addressLineOne")
	WebElement AddressLine1;
	
	@FindBy(id = "addressLineTwo")
	WebElement AddressLine2;
	
	@FindBy(id = "city")
	WebElement City;
	
	@FindBy(id = "postalCode")
	WebElement PostalCode;
	
	@FindBy(id = "state")
	WebElement State;
	
	@FindBy(id = "country")
	WebElement Country;
	
	@FindBy(xpath = "//a[@href='/medicare/membership?execution=e1s3&_eventId_submit']")
	WebElement Confirm;
	
	@FindBy(xpath = "//a[@href='/medicare/login']")
	WebElement LoginHere;
	
	public SignUp() {
		PageFactory.initElements(driver, this);
	}

	public void SignUpFunction() {
		SignUp.click();
	}
	
	public void SignUpPersonalFunction(String FirstName, String LastName, String EmailId, String ContactNumber, String PassWord, String ConfPassword) {
		FName.sendKeys(FirstName);
		LName.sendKeys(LastName);
		Email.sendKeys(EmailId);
		ContactNo.sendKeys(ContactNumber);
		Password.sendKeys(PassWord);
		ConfirmPass.sendKeys(ConfPassword);
	}
	
	public void BillingFunction() {
		WebElement Billing = driver.findElement(By.name("_eventId_billing"));
		Billing.click();
	}
	
	public void SignUpAddressFunction(String ALine1, String ALine2, String CityName, String Postalcode, String StateName, String CountryName) {
		AddressLine1.sendKeys(ALine1);
		AddressLine2.sendKeys(ALine2);
		City.sendKeys(CityName);
		PostalCode.sendKeys(Postalcode);
		State.sendKeys(StateName);
		Country.sendKeys(CountryName);
	}
	
	public void ConfirmFunction() {
		WebElement Confirm = driver.findElement(By.name("_eventId_confirm"));
		Confirm.click();
	}
	
	public void FinalConfirmFunction() {
		Confirm.click();
	}
	
	public void LoginHereFunction() {
		LoginHere.click();
	}
}

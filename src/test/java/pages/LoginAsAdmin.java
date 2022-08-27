package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testCases.BaseClass;

public class LoginAsAdmin {

	WebDriver driver = BaseClass.driver;

	@FindBy(id = "login")
	WebElement LoginLink;

	@FindBy(name = "username")
	WebElement Email;

	@FindBy(id = "password")
	WebElement Password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement Submit;

	@FindBy(xpath = "//a[@href='/medicare/manage/product']")
	WebElement ManageProduct;

	@FindBy(id = "name")
	WebElement PMName;

	@FindBy(id = "brand")
	WebElement PMBrand;

	@FindBy(id = "description")
	WebElement PMDescription;

	@FindBy(id = "unitPrice")
	WebElement PMUnitPrice;

	@FindBy(id = "quantity")
	WebElement PMQuantity;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement PMSave;
	
	@FindBy(id = "dropdownMenu1")
	WebElement PrepareToLogout;

	@FindBy(id = "logout")
	WebElement LogoutAdmin;

	public LoginAsAdmin() {
		PageFactory.initElements(driver, this);
	}

	public void LoginFunction(String UserNameVal, String PasswordVal) {
		LoginLink.click();
		Email.sendKeys(UserNameVal);
		Password.sendKeys(PasswordVal);
		Submit.click();
	}

	public void ManageProductFunction() {
		ManageProduct.click();
	}

	public void PMNameFunction(String Name, String Brand, String Description, String UPrice, String PQuantity) {
		PMName.sendKeys(Name);
		PMBrand.sendKeys(Brand);
		PMDescription.sendKeys(Description);
		driver.findElement(By.id("unitPrice")).clear();
		PMUnitPrice.sendKeys(UPrice);
		driver.findElement(By.id("quantity")).clear();
		PMQuantity.sendKeys(PQuantity);
	}
	
	public void ManageProductSaveFunction() {
		PMSave.click();
	}

	public void LogoutAdminFunction() {
		PrepareToLogout.click();
		LogoutAdmin.click();
	}
}

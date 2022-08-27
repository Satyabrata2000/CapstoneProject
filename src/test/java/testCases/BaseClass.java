package testCases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
//import org.testng.reporters.TestHTMLReporter;
import com.aventstack.extentreports.ExtentTest;
import com.relevantcodes.extentreports.ExtentManager;
import com.aventstack.extentreports.ExtentReports;

public class BaseClass {

	public static WebDriver driver;
	public static ExtentTest test;
	public static ExtentManager extents;
	public static ExtentReports reports;

	@BeforeTest
	public void DataSetUp() throws IOException {

		extents = new ExtentManager();
		reports = ExtentManager.createExtentReports();
	}

	@AfterTest
	public void DataTearDown() throws IOException {

		reports.flush();

	}

	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (J)\\CapstoneProject\\com\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8090/medicare/home");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void TearDown() {
		driver.quit();

	}

}

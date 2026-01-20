package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.nio.file.Files;

public class BaseTest {

	protected WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void tearDown(ITestResult result) {

		// Take screenshot if test fails
		if (ITestResult.FAILURE == result.getStatus()) {
			takeScreenshot(result.getName());
		}
		driver.quit();
	}

	private void takeScreenshot(String testName) {
		try {

			// Take screenshot
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			// Create folder if not exists
			File folder = new File("screenshots");
			if (!folder.exists())
				folder.mkdir();

			// Save screenshot with test name
			File dest = new File(folder, testName + ".png");
			src.renameTo(dest); // simpler than Files.copy

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

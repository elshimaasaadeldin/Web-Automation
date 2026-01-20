package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void userCanLoginSuccessfully() {

		// 1. Open the website in browser

		driver.get("https://www.automationexercise.com");

		// 2. Create object of HomePage to access its actions

		HomePage homePage = new HomePage(driver);

		// 3. Click on "Signup / Login" button on home page
		
		homePage.clickSignupLogin();

		// 4. Create object of LoginPage to access login actions
		
		LoginPage loginPage = new LoginPage(driver);
		
		// 5. Enter email and password, then click login
		loginPage.login("elshimaasaad95@gmail.com", "shimaa95");
		
		// 6. Verify user is logged in successfully

		Assert.assertTrue(loginPage.isUserLoggedIn(), "User is NOT logged in");
	}
}

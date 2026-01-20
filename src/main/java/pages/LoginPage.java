package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	
	// WebDriver instance
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Login Page locators
	
	private By emailInput = By.name("email");
	private By passwordInput = By.name("password");
	private By loginBtn = By.xpath("//button[text()='Login']");
	private By loggedInUser = By.xpath("//a[contains(text(),'Logged in as')]");

	public void login(String email, String password) {
		driver.findElement(emailInput).sendKeys(email);
		driver.findElement(passwordInput).sendKeys(password);
		driver.findElement(loginBtn).click();
	}
	
	// Login Page actions

	public boolean isUserLoggedIn() {
		return driver.findElement(loggedInUser).isDisplayed();
	}
}

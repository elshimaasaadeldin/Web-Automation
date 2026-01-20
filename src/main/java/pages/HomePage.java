package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	// WebDriver instance
	
	private WebDriver driver;

	// Home page locators

	private By signupLoginBtn = By.linkText("Signup / Login");

	public HomePage(WebDriver driver) {
		this.driver = driver;

	}

	// Home Page actions

	public void clickSignupLogin() {
		driver.findElement(signupLoginBtn).click();
	}
}

package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage{
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	//Defining the WebElements:
	//1- Username
	@FindBy(how = How.XPATH, using = "//input[@id='user_name']") WebElement userNameElement;
	//2- Password
	@FindBy(how = How.XPATH, using = "//input[@id='password']") WebElement passwordElement;
	//3- signinButton:
	@FindBy(how = How.XPATH, using = "//*[@id=\"login_submit\"]") WebElement signingButtonElement;
	//Intractable methods
	
	public void insertUsername(String userName) {
		userNameElement.sendKeys(userName);
	}
	public void insertPassword(String password) {
		passwordElement.sendKeys(password);
	}
	public void clickOnSigninButton() {
		signingButtonElement.click();
	}
	public String getPageTitle() {
		return driver.getTitle();
	}

}

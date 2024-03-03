package steps;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DatabasePage;
import pages.LoginPage;
import pages.TestBase;

public class StepDefinition extends TestBase {
	LoginPage loginPage;
	DatabasePage databasePage;

	@Before
	public void beforeRun() {
		init();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		databasePage = new DatabasePage();

	}

	@Given("User is on the codefios login page")
	public void user_is_on_the_codefios_login_page() {
		driver.get("https://codefios.com/ebilling/login");
	}

	@When("User enters the username as {string}")
	public void User_enters_the_username_as(String username) {
		loginPage.insertUsername(username);
	}

	@When("User enters the password as {string}")
	public void User_enters_the_password_as(String password) {
		loginPage.insertPassword(password);
	}

	@And("User clicks on sign in button")
	public void user_clicks_on_the_signin_button() {
		// Write code here that turns the phrase above into concrete actions
		loginPage.clickOnSigninButton();
	}

	@Then("User should be able to land on dashboard page")
	public void user_should_be_able_to_land_on_dashboard_page() {
		takeScreenshot(driver);
		String expectedTitle = "Codefios QA";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals("Page not landed on Dashboard page", expectedTitle, actualTitle);
	}
	
	
	
	
	
	
	@When("User enters {string} from mysql database")
	public void user_enters_from_mysql_database(String loginData) {
		switch(loginData) {
		case "username":
			loginPage.insertUsername(databasePage.getDataFromDatabase("user_name"));
			System.out.println("Username from DB: " + databasePage.getDataFromDatabase("username"));
			break;
		case "password":
			loginPage.insertPassword(databasePage.getDataFromDatabase("user_password"));
			System.out.println("Password from DB: " + databasePage.getDataFromDatabase("password"));

			break;
			default:
				System.out.println("Unable to find Login Data" + loginData);
		}
	}
	

	@After
	public void afterRun() {
		driver.close();
		driver.quit();
	}

}

package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudydefination {
	WebDriver driver;
	@Given("shoping site is launched")
	public void shoping_site_is_launched() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PDC3B-Training.PDC3B\\eclipse-workspace\\cucumber\\target\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com/");
	    //throw new cucumber.api.PendingException();
	}

	@When("user enter valid data")
	public void user_enter_valid_data() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user click on registratiin button")
	public void user_click_on_registratiin_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("existing user clicks on sign in button")
	public void existing_user_clicks_on_sign_in_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("user enters valid data")
	public void user_enters_valid_data() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user clicks on log in buttn")
	public void user_clicks_on_log_in_buttn() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("user enter the desired product name")
	public void user_enter_the_desired_product_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user click search button")
	public void user_click_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user click on add_to_cart button")
	public void user_click_on_add_to_cart_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("user cross check the cart product")
	public void user_cross_check_the_cart_product() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user click on confirm button")
	public void user_click_on_confirm_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}
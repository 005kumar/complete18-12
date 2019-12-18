package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class casestudy2 {
	WebDriver driver;
	@Given("user is given AWS site access b")
	public void user_is_given_AWS_site_access_b() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		
		System.getProperty("webdriver.chrome.driver","C:\\Users\\PDC3B-Training.PDC3B\\eclipse-workspace\\cucumber\\target\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.get("http://demowebshop.tricentis.com/");

	}

	@Then("user enters valid data for registration b")
	public void user_enters_valid_data_for_registration_b() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"gender-male\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Bhupen");
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("kumar");
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("kumar@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Kumar123");
		driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("Kumar123");
		Thread.sleep(2000);

	}

	@Then("user clicks on signup button b")
	public void user_clicks_on_signup_button_b() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();


	}

	@Given("Application is launched and user have access to login site b")
	public void application_is_launched_and_user_have_access_to_login_site_b() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("site is launched");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	}

	@Then("user enters valid credentials {string }")
	public void user_enters_valid_credentials(String userID) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(userID);
		Thread.sleep(1000);


	}

	@Then("user enter the password {string}")
	public void user_enter_the_password(String passW) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(passW);
		Thread.sleep(1000);

	}

	@Then("user clicks on login button b")
	public void user_clicks_on_login_button_b() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();

		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();


	}


}

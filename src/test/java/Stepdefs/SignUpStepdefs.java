package Stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpStepdefs {

	WebDriver driver = Hooks.driver;

	@Given("I have launced the FlyAway application")
	public void i_have_launced_the_FlyAway_application() {
		// Write code here that turns the phrase above into concrete actions
		driver.get("http://localhost:8081/FlyAway");
	}

	@Given("I have clicked on signup button")
	public void i_have_clicked_on_signup_button() {
		// Write code here that turns the phrase above into concrete actions
		WebElement signUpBtn = driver.findElement(By.xpath("//a[text()='Login/Signup']"));
		signUpBtn.click();
	}

	@Given("I have clicked on Signup if we are not a member")
	public void i_have_clicked_on_Signup_if_we_are_not_a_member() {
		// Write code here that turns the phrase above into concrete actions
		WebElement SignUpLink = driver.findElement(By.xpath("//a[text()='Not a member? Signup']"));
		SignUpLink.click();
	}

	@When("I have enter emailId as {string}")
	public void i_have_enter_emailId_as(String emaildid) {
		// Write code here that turns the phrase above into concrete actions
		WebElement EmailId = driver.findElement(By.name("email_id"));
		EmailId.sendKeys(emaildid);
	}

	@When("I have enter password as {string}")
	public void i_have_enter_password_as(String Password) {
		// Write code here that turns the phrase above into concrete actions
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys(Password);
	}

	@When("I have reenter password as {string}")
	public void i_have_reenter_password_as(String repass) {
		// Write code here that turns the phrase above into concrete actions
		WebElement Repwd = driver.findElement(By.name("pwd2"));
		Repwd.sendKeys(repass);
	}

	@When("I have enter Name as {string}")
	public void i_have_enter_Name_as(String name) {
		// Write code here that turns the phrase above into concrete actions
		WebElement Name = driver.findElement(By.name("name"));
		Name.sendKeys(name);
	}

	@When("I have enter Address as {string}")
	public void i_have_enter_Address_as(String address) {
		// Write code here that turns the phrase above into concrete actions
		WebElement Address = driver.findElement(By.name("address"));
		Address.sendKeys(address);
	}

	@When("I have enter city as {string}")
	public void i_have_enter_city_as(String city) {
		// Write code here that turns the phrase above into concrete actions
		WebElement City = driver.findElement(By.name("city"));
		City.sendKeys(city);
	}

	@When("I enter signup button")
	public void i_enter_signup_button() {
		// Write code here that turns the phrase above into concrete actions
		WebElement SignUpclick = driver.findElement(By.xpath("//button[text()='Signup']"));
		SignUpclick.click();
	}

	@Then("I should be able to create the user")
	public void i_should_be_able_to_create_the_user() {
		// Write code here that turns the phrase above into concrete actions
		WebElement loginToContBtn = driver.findElement(By.xpath("//a[text()='Login to continue checking flights']"));
		loginToContBtn.click();
	}

}

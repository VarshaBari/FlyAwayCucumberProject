package Stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginStepdefs {
	
	WebDriver driver=Hooks.driver;
	
	
	@Given("I have launched the application")
	public void i_have_launched_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("http://localhost:8081/FlyAway");
	}

	@Given("I have click on login button to enter user details")
	public void i_have_click_on_login_button_to_enter_user_details() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement loginBtn = driver.findElement(By.xpath("//a[text()='Login/Signup']"));
		loginBtn.click();
	}

	@When("I have entered emailId {string}")
	public void i_have_entered_emailId(String emailID) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement emailId=driver.findElement(By.name("email_id"));	 
		emailId.sendKeys(emailID);
	}

	@When("I have entered password {string}")
	public void i_have_entered_password(String Pass) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement password=driver.findElement(By.name("pwd"));
		password.sendKeys(Pass);
		
	    
	}
	
	@When("I clicked on Login")
	public void i_clicked_on_Login() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement LoginBtn=driver.findElement(By.xpath("//button"));
		LoginBtn.click();
	}


	@Then("I should be sccessfully login to application and should be on dashboard page {string}")
	public void i_should_be_sccessfully_login_to_application_and_should_be_on_dashboard_page(String dashMassa) {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement message=driver.findElement(By.xpath("//h3"));
		String ActualText=message.getText();
		Assert.assertEquals(ActualText,dashMassa );
		
		
		
		
	   
	}





}

package Stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FlightBookingStepdefs {
	
	WebDriver driver=Hooks.driver;
	
	

	

	
	

	
	@When("I clicked on Home tab")
	public void i_clicked_on_Home_tab() {
	    // Write code here that turns the phrase above into concrete actions
	  WebElement home=  driver.findElement(By.xpath("//h3/following-sibling::a[1]"));
	    home.click();
	}

	@When("I select source place {string} and Destination {string}")
	public void i_select_source_place_and_Destination(String Source, String Destination) {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement source=driver.findElement(By.xpath("//tbody/tr/td/select[@name='source']"));
	    Select fromDropdown=new Select(source);
	    fromDropdown.selectByValue(Source);
	    
	    WebElement destination=driver.findElement(By.xpath("//tbody/tr/td/select[@name='destination']"));
	    Select toDropdown=new Select(destination);
	    fromDropdown.selectByValue(Destination);
	    
	    
	}

	@When("I clicked on Submit")
	public void i_clicked_on_Submit() {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement submitBtn=driver.findElement(By.xpath("//button[text()='Submit']"));
	    submitBtn.click();
	}

	@When("I clicked on flight book")
	public void i_clicked_on_flight_book() {
	    // Write code here that turns the phrase above into concrete actions
	  WebElement bookFlight= driver.findElement(By.xpath("//a[text()='Book Flight']"));
	  bookFlight.click();
	}

	@When("I clicked on Complete Booking")
	public void i_clicked_on_Complete_Booking() {
	    // Write code here that turns the phrase above into concrete actions
	   WebElement compBooking= driver.findElement(By.xpath("//a[text()='Click to complete booking']"));
	   compBooking.click();
	}

	@Then("I should be able to see booking confirmation message")
	public void i_should_be_able_to_see_booking_confirmation_message() {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement confMessage=driver.findElement(By.xpath("//h3"));
	 String ActualText=  confMessage.getText();
	 Assert.assertEquals(ActualText, "FLYAWAY - BOOKING CONFIRMATION");
	}




	

}

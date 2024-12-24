package Stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Then;


public class FlyAwayLoginFailureStepdefs {
	
	WebDriver driver =Hooks.driver;
	
	@Then("I should not able to login and getting a error message as Login failed {string}")
	public void i_should_not_able_to_login_and_getting_a_error_message_as_Login_failed(String Error) {
	    // Write code here that turns the phrase above into concrete actions
		// WebElement error = driver.findElement(By.xpath("//br/following-sibling::text()[1]"));
	    
/*		WebElement bodyElement = driver.findElement(By.tagName("body")); // Locate the <body> tag
		String fullText = bodyElement.getText(); // Extract the text content of the body
		System.out.println("Full body text: " + fullText);

		// Validate the presence of "Login failed"
		Assert.assertTrue(fullText.contains("Login failed"), Error); */
		
	/*	WebElement bodyElement = driver.findElement(By.xpath("//body"));
		String fullText = bodyElement.getText().trim(); // Get all the text in the <body>
		System.out.println("Full body text: " + fullText);

		// Split the text by line breaks or parse it
		String[] lines = fullText.split("\n");
		String actualMessage = lines[lines.length - 1].trim(); // Get the last line of text
		System.out.println("Extracted message: " + actualMessage);

		// Validate the message
		Assert.assertEquals(actualMessage, Error ); */
		
		WebElement bodyElement = driver.findElement(By.xpath("//body"));
		String fullText = bodyElement.getText();
		System.out.println("Body text: " + fullText);

		// Handle multiple <br> tags by splitting text
		String[] lines = fullText.split("\n");
		for (String line : lines) {
		    if (line.trim().equals("Login failed")) {
		        System.out.println("Error message found: " + line.trim());
		        Assert.assertEquals(line.trim(), Error );
		        break;
		    }
		}
		
	   
	   
	   
	}



}

Feature: This feature file will validate login to flyaway application

  Scenario Outline: Validate successful login to flyaway application
    Given I have launched the application
    Given I have click on login button to enter user details
    When I have entered emailId "<EmailId>"
    When I have entered password "<Password>"
    When I clicked on Login
    Then I should not able to login and getting a error message as Login failed "<ErrorMessage>"

    Examples: 
      | EmailId      | Password  | ErrorMessage   |
      | abcd@yz.com | Admin@123 | Login failed |
      
      

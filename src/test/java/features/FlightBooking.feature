Feature: This feature file will validate flight booking between Banglore to Chennai

  Scenario Outline: Validate flight booking between Banglore to Chennai
    Given I have launched the application
    Given I have click on login button to enter user details
    When I have entered emailId "<EmailId>"
    When I have entered password "<Password>"
    When I clicked on Login
    When I clicked on Home tab
    When I select source place "<Source>" and Destination "<Destination>"
    When I clicked on Submit
    When I clicked on flight book
    When I clicked on Complete Booking
    Then I should be able to see booking confirmation message

    Examples: 
      | EmailId      | Password  | Source | Destination |
      | abcd@xyz.com | Admin@123 |      4 |           1 |

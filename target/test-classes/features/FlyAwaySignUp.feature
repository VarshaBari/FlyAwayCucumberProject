Feature: This feature will validate SignUp scenario for FlyAway

  Scenario Outline: Validate the signup scenario
    Given I have launced the FlyAway application
    Given I have clicked on signup button
    And I have clicked on Signup if we are not a member
    When I have enter emailId as "<emailId>"
    And I have enter password as "<password>"
    And I have reenter password as "<repassword>"
    And I have enter Name as "<Name>"
    And I have enter Address as "<Address>"
    And I have enter city as "<City>"
    And I enter signup button
    Then I should be able to create the user

    Examples: 
      | emailId       | password  | repassword | Name | Address | City   |
      | hello@xyz.com | Admin@123 | Admin@123  | Tom  | Lane    | Pune   |
      | abcde@xyz.com | Admin@123 | Admin@123  | Sam  | Lane2   | Canada |

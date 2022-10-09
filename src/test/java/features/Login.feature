Feature: Login Feature Scenario

  Background: 
    Given I have launched the application
    And i clciked on Login Link

  Scenario: This scenario is to define the login happy path
    Given I have launched the application
    And i clciked on Login Link
    When I enter the correct username and password
    And i clcik on Login Button
    Then I should land on the home page

  @Regression
  Scenario: This scenario is to define the failure path
    When I enter the incorrect username and password
    And i clcik on Login Button
    Then I should get the error message "The email or password you have entered is invalid."

  @sanity
  Scenario: This scenario is to define the failure path
    # 1 and 2 scenario in 3rd step below
    When I enter the  username as "abc@xyz.com" and password as "Abc@1243"
    And i clcik on Login Button
    Then I should get the error message "The email or password you have entered is invalid."

  Scenario Outline: This sceanrio is to define the failure path
    When I enter the  username as "<UserName>" and password as "<Password>"
    And i clcik on Login Button
    Then I should get the error message "The email or password you have entered is invalid."

    Examples: 
      | UserName    | Password |
      | abc@xyz.com | Abc@1234 |
      | pqr@xyz.com | Ert@1234 |

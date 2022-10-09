Feature: This feature would be creating a calculator for Add and Subtract

  @sanity
  Scenario: To Add two numbers
    Given I have a calculator
    When I add 4 and 5
    Then I should get the result as 9

  Scenario: To mul two numbers
    Given I have a calculator
    When I mul 4 and 5
    Then I should get the result as 20

  Scenario: To div two numbers
    Given I have a calculator
    When I div 20 and 5
    Then I should get the result as 4

    Scenario Outline:To mul two numbers
    Given I have a calculator
    When I mul "<int1>" and "<int2>"
    Then I should get the result as "<result>"
    
    Examples: 
    |int1||int2||result|
    |23|  |34|  |57|
    |2|   |3|   |5|
    
    #datatable:all data in one table
    Scenario: To Add two numbers
    Given I have a calculator
    When I add below numbers
      | 3 |
      | 2 |
      | 5 |
      | 4 |
      | 3 |
    Then I should get the result as 17
    
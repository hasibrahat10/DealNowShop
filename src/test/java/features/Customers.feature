Feature: DealNow shop customers

  Background:
    Given I am on dashboard panel
    Then I click on customers menu

  Scenario: Add a customer
    Then I click on customers menu
    Then I click on Add Customer button
    Then I enter the customer details info
    And I click on save customer button

  Scenario: Add a customer group
    Then I click on groups sub category
    Then  I click on Add Group button
    Then I enter group info
    And  I click on save group button




Feature: DealNow shop sales

  Background:
    Given I am on dashboard panel
    Then I click on sales menu

  Scenario: Complete a sales order
    Then I click on action icon order list
    Then I have enter a comment and checked customer notify
    And I click on submit comment button
    Then I click on invoice button and save invoice


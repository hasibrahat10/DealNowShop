Feature: DealNow shop admin search activities

  Background:
    Given  I am on dashboard panel
    Then I click on catalog menu

  Scenario: Search a product by name
    Then I have enter search text
    When I click on search item
    Then I should find the search item in the table


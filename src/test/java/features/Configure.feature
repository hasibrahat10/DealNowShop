Feature: DealNow Shop configure panel

  Background:
    Given I am on dashboard panel
    Then  I click on configure menu

  Scenario: Set the general configuration
    Then  I have set the unit options
    Then I have enter the email settings
    And I click on save button

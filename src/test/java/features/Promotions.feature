Feature: DealNow shop promotions

  Background:
    Given I am on dashboard panel
    Then I click on promotions menu

  Scenario: Add a catalog rule
    Then  I click on add category rule button
    Then I have enter the rule information
    Then I have select the channels info
    Then I have set the conditions and rules actions
    And I click on save catalog rules button




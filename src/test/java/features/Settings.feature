Feature: DealNow shop settings

  Background:
    Given  I am on dashboard panel
    Then I click on settings menu

  Scenario: Add a locale in the locales
    Then I click on add locale button
    Then I enter the add locale general info
    And I click on save locale button

  Scenario: Add a currency
    Then I click on currency sub category
    Then I click on add currency
    Then I have enter the currency info and click on save currency button

  Scenario: Add a currency for exchange
    Then I click on exchange rates
    Then  I click on add exchange rate
    Then I have enter the currency rate info
    And  I click on save exchange rate

  Scenario: Add a inventory sources
    Then I click on inventory sources submenu
    Then I click on add inventory source
    Then I have enter general info
    Then I enter the contact information
    Then I enter the source address
    And I click on save inventory source

  Scenario: Add an user role
    Then I click on user sub menu and click on add user
    Then I have enter general info and password
    Then I have choose status and role
    And I click on save user








      

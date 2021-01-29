Feature: DealNow shop admin dashboard

  Background:
    Given I am on dashboard panel


  Scenario: User add a simple type product
    Then I click on catalog menu
    And I click on Add Product
    Then I fill the general info of Product
    And I click on save product
    Then I have edit product info in details and click save


  Scenario: Add new product categories
    Then I click on catalog menu
    Then I click on categories sub menu
    Then I click on add categories
    Then I have enter the category details
    And  I click on save category button


  Scenario: Tenant Profile update
    Then I click on Tenant menu item
    And Enter the tenant profile info and click update button




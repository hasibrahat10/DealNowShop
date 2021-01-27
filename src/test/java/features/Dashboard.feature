Feature: DealNow shop admin dashboard

  Scenario: User add a simple type product
    Given I am on dashboard panel
    Then I click on catalog menu
    Then I click on products catalog
    And I click on Add Product
    Then I fill the general info of Product
    And I click on save product
    Then I have edit product info in details and click save
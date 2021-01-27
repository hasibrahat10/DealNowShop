Feature: Login DealNow Shop

  Background:
    Given I am on admin login screen

  Scenario Outline: User can login with valid credentials
    Then I enter user email as "<email>" and password as "<password>"
    And I click on sign in button
    Examples:
      | email                      | password  |
      | buynoirtest@mailinator.com | test12345 |

  Scenario: I wan to login with invalid credentials
    Then I have enter user info
    And I click on sign in button
    Then An error message will be displayed "Please check your credentials and try again."


  Scenario: Invalid message displayed while login
    When I click on sign in button
    Then I get an error message from the email and password field

  Scenario: User add a simple type product
    Then I click on catalog menu
    Then I click on products catalog
    And I click on Add Product
    Then I fill the general info of Product
    And I click on save product
    Then I have edit product info in details and click save









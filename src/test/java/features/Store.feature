Feature: DealNow shop storefront feature

  Background:
    Given I hover mouse on sign in icon
    Then I click on store sign in button

  @test-customerLogin
  Scenario: Login with valid credentials as customer
    Given I hover mouse on sign in icon
    Then I click on store sign in button
    Then  I have enter login details for customer
    When I click on login button


  Scenario: Checkout an order from the store
    Then I am on customer profile panel
    When I click on Men categories menu
    Then I have select a product
    Then I click on add to cart button
    Then I click on shopping bag icon
    And I click on view shopping cart
    Then I click on proceed to checkout
    Then I have checked the billing address and checked free shipping
    Then I have choose the payment method and click on place order
    And Text displayed as "Thank you for your order!"






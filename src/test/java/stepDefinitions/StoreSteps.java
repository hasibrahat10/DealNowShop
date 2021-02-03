package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.StorePage;

public class StoreSteps extends BasePage {
    @Given("I hover mouse on sign in icon")
    public void i_hover_mouse_on_sign_in_icon() {

        new StorePage().setSignInBtn();
    }

    @Then("I click on store sign in button")
    public void i_click_on_store_sign_in_button() {
        new StorePage().clickSignIn();

    }

    @Then("I have enter login details for customer")
    public void i_have_enter_login_details_for_customer() {
        new StorePage().customerLoginInfo();

    }

    @When("I click on login button")
    public void i_click_on_login_button() {

        new StorePage().setLoginBtn();

    }


    @Then("I am on customer profile panel")
    public void i_am_on_customer_profile_panel() {
        StorePage storePage = new StorePage();
        storePage.setSignInBtn();
        storePage.clickSignIn();
        storePage.customerLoginInfo();
        storePage.setLoginBtn();

    }

    @When("I click on Men categories menu")
    public void i_click_on_Men_categories_menu() {
        new StorePage().setMenuCatMen();

    }

    @Then("I have select a product")
    public void i_have_select_a_product() {
        new StorePage().setChooseProduct();
    }

    @Then("I click on add to cart button")
    public void i_click_on_add_to_cart_button() {
        new StorePage().setAddToCartBtn();

    }

    @Then("I click on shopping bag icon")
    public void i_click_on_shopping_bag_icon() {
        new StorePage().setShoppingBag();

    }

    @Then("I click on view shopping cart")
    public void i_click_on_view_shopping_cart() {
        new StorePage().setViewCart();

    }

    @Then("I click on proceed to checkout")
    public void i_click_on_proceed_to_checkout() {
        new StorePage().setProceedToCheckout();

    }

    @Then("I have checked the billing address and checked free shipping")
    public void i_have_checked_the_billing_address_and_checked_free_shipping() {

        new StorePage().setCheckedBillAdd();
    }

    @Then("I have choose the payment method and click on place order")
    public void i_have_choose_the_payment_method_and_click_on_place_order() {
        new StorePage().paymentAndPlaceOrder();

    }

    @Then("Text displayed as {string}")
    public void text_displayed_as() {
        Assert.assertEquals(new StorePage().displayedThankText(), true);
    }

}

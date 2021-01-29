package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.DashboardPage;
import pages.LoginPage;

public class DashboardSteps extends BasePage {


    @Given("I am on dashboard panel")
    public void iAmOnDashboardPanel() {
        LoginPage loginPage = new LoginPage();
        loginPage.setSignIn("buynoirtest@mailinator.com", "test12345");
        loginPage.clickSignIn();
    }

    @Then("I click on catalog menu")
    public void i_click_on_catalog_menu() {
        new DashboardPage().clickCatalogMenu();

    }


    @Then("I click on Add Product")
    public void i_click_on_Add_Product() {
        new DashboardPage().clickAddProduct();

    }

    @Then("I fill the general info of Product")
    public void i_fill_the_general_info_of_Product() {
        new DashboardPage().enterProductGeneralInfo();

    }

    @Then("I click on save product")
    public void i_click_on_save_product() {
        new DashboardPage().clickOnSaveProduct();


    }

    @Then("I have edit product info in details and click save")
    public void i_have_edit_product_info_in_details_and_click_save() {
        new DashboardPage().editProductInfo();

    }


    @Then("I click on Tenant menu item")
    public void iClickOnTenantMenuItem() {
        new DashboardPage().clickTenantMenu();

    }

    @And("Enter the tenant profile info and click update button")
    public void enterTheTenantProfileInfoAndClickUpdateButton() {

        new DashboardPage().enterTenantInfo();
        new DashboardPage().clickOnUpdateProfileButton();
    }


}

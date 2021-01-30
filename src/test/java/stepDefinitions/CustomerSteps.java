package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CustomerPage;

public class CustomerSteps extends BasePage {
    @Then("I click on customers menu")
    public void iClickOnCustomersMenu() {
        new CustomerPage().clickCustomerMenu();
    }

    @Then("I click on Add Customer button")
    public void iClickOnAddCustomerButton() {
        new CustomerPage().clickAddCustomer();
    }

    @Then("I enter the customer details info")
    public void iEnterTheCustomerDetailsInfo() {
        new CustomerPage().enterCustomerInfo();
    }

    @And("I click on save customer button")
    public void iClickOnSaveCustomerButton() {

        new CustomerPage().clickSaveCustomer();
    }

    @Then("I click on groups sub category")
    public void iClickOnGroupsSubCategory() {
        new CustomerPage().clickSubCategoryGroups();
    }

    @Then("I click on Add Group button")
    public void iClickOnAddGroupButton() {
        new CustomerPage().clickAddGroup();
    }

    @Then("I enter group info")
    public void iEnterGroupInfo() {
        new CustomerPage().enterGroupInfo();
    }

    @And("I click on save group button")
    public void iClickOnSaveGroupButton() {
        new CustomerPage().clickSaveGroup();
    }
}

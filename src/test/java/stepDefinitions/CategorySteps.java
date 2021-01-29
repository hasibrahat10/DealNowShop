package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CategoryPage;

public class CategorySteps extends BasePage {

    @Then("I click on categories sub menu")
    public void iClickOnCategoriesSubMenu() {
        new CategoryPage().clickSubCategories();
    }

    @Then("I click on add categories")
    public void iClickOnAddCategories() {
        new CategoryPage().clickAddCategories();
    }


    @Then("I have enter the category details")
    public void iHaveEnterTheCategoryDetails() {
        new CategoryPage().enterCategoriesDetailsInfo();
    }

    @And("I click on save category button")
    public void iClickOnSaveCategoryButton() {
        new CategoryPage().clickSaveCategoryBtn();
    }


}

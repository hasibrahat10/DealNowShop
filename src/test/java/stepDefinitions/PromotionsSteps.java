package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.PromotionsPage;

public class PromotionsSteps extends BasePage {
    @Then("I click on promotions menu")
    public void iClickOnPromotionsMenu() {
        new PromotionsPage().setMenuPromotions();
    }

    @Then("I click on add category rule button")
    public void iClickOnAddCategoryRuleButton() {
        new PromotionsPage().setAddCatalogRule();
    }

    @Then("I have enter the rule information")
    public void iHaveEnterTheRuleInformation() {
        new PromotionsPage().setRulesInfo();
    }

    @Then("I have select the channels info")
    public void iHaveSelectTheChannelsInfo() {
        new PromotionsPage().setChannels();
    }

    @Then("I have set the conditions and rules actions")
    public void iHaveSetTheConditionsAndRulesActions() {
        new PromotionsPage().rulesAndConditions();
    }

    @And("I click on save catalog rules button")
    public void iClickOnSaveCatalogRulesButton() {
        new PromotionsPage().setSaveCatalogRule();
    }
}

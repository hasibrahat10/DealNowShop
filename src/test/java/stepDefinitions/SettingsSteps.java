package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.SettingsPage;

public class SettingsSteps extends BasePage {


    @Then("I click on settings menu")
    public void iClickOnSettingsMenu() {
        new SettingsPage().clickSettingMenu();
    }

    @Then("I click on add locale button")
    public void iClickOnAddLocaleButton() {
        new SettingsPage().clickAddLocaleButton();
    }

    @Then("I enter the add locale general info")
    public void iEnterTheAddLocaleGeneralInfo() {
        new SettingsPage().enterGeneralLocalInfo();
    }

    @And("I click on save locale button")
    public void iClickOnSaveLocaleButton() {
        new SettingsPage().clickSaveLocale();
    }

    @Then("I should see the success message")
    public void iShouldSeeTheSuccessMessage() {
        Assert.assertEquals(new SettingsPage().setSuccessAlert(), true);
    }

    @Then("I click on currency sub category")
    public void iClickOnCurrencySubCategory() {
        new SettingsPage().clickCurrencyMenu();
    }

    @Then("I click on add currency")
    public void iClickOnAddCurrency() {
        new SettingsPage().clickOnAddCurrency();
    }

    @Then("I have enter the currency info and click on save currency button")
    public void iHaveEnterTheCurrencyInfoAndClickOnSaveCurrencyButton() {
        SettingsPage settingsPage = new SettingsPage();
        settingsPage.enterCurrencyInfo();
        settingsPage.clickOnSaveCurrency();
    }

    @Then("I click on exchange rates")
    public void iClickOnExchangeRates() {
        new SettingsPage().clickOnExchangeRates();
    }

    @Then("I click on add exchange rate")
    public void iClickOnAddExchangeRate() {
        new SettingsPage().clickAddExchangeRate();
    }

    @Then("I have enter the currency rate info")
    public void iHaveEnterTheCurrencyRateInfo() {
        new SettingsPage().enterCurrencyRateInfo();
    }

    @And("I click on save exchange rate")
    public void iClickOnSaveExchangeRate() {
        new SettingsPage().clickOnSaveExchangeRate();
    }


    @Then("I click on inventory sources submenu")
    public void iClickOnInventorySourcesSubmenu() {
        new SettingsPage().clickSubInventorySrc();
    }

    @Then("I click on add inventory source")
    public void iClickOnAddInventorySource() {

        new SettingsPage().clickOnAddInventorySrc();
    }

    @Then("I have enter general info")
    public void iHaveEnterGeneralInfo() {
        new SettingsPage().enterGeneralInfo();
    }

    @Then("I enter the contact information")
    public void iEnterTheContactInformation() {
        new SettingsPage().enterContactInformation();
    }

    @Then("I enter the source address")
    public void iEnterTheSourceAddress() {
        SettingsPage settingsPage = new SettingsPage();
        settingsPage.SelectSourceCountry("Bangladesh");
        settingsPage.enterSourceAddress();
    }

    @And("I click on save inventory source")
    public void iClickOnSaveInventorySource() {
        new SettingsPage().clickOnSaveInventorySrc();
    }

    @Then("I click on user sub menu and click on add user")
    public void iClickOnUserSubMenuAndClickOnAddUser() {

        new SettingsPage().userSubMenuAddBtn();
    }

    @Then("I have enter general info and password")
    public void iHaveEnterGeneralInfoAndPassword() {
        new SettingsPage().generalInfoPass();
    }

    @Then("I have choose status and role")
    public void iHaveChooseStatusAndRole() {
        new SettingsPage().statusRole();
    }

    @And("I click on save user")
    public void iClickOnSaveUser() {
        new SettingsPage().clickOnSaveUser();
    }



}



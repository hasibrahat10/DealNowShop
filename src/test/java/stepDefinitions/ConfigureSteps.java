package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ConfigurePage;


public class ConfigureSteps extends BasePage {

    @Then("I click on configure menu")
    public void iClickOnConfigureMenu() {
        new ConfigurePage().setMenuConfigure();
    }

    @Then("I have set the unit options")
    public void iHaveSetTheUnitOptions() {
        new ConfigurePage().setUnit();
    }

    @Then("I have enter the email settings")
    public void iHaveEnterTheEmailSettings() {
        new ConfigurePage().emailSettings();
    }

    @And("I click on save button")
    public void iClickOnSaveButton() {
        new ConfigurePage().setSaveGeneralSet();
    }
}

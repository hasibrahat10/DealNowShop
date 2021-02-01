package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SearchPage;

public class SearchSteps extends BasePage {
    @Then("I have enter search text")
    public void iHaveEnterSearchText() {
        new SearchPage().enterSearchText();
    }

    @When("I click on search item")
    public void iClickOnSearchItem() {
        new SearchPage().setSearchIcon();
    }

    @Then("I should find the search item in the table")
    public void iShouldFindTheSearchItemInTheTable() {
        Assert.assertEquals( new SearchPage().getResultDisplayed(), true);
        sleepFor(3);
    }
}

package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;

public class LoginSteps extends BasePage {

    @Then("I am on admin login screen")
    public void i_am_on_admin_login_screen() {
        sleepFor(5);
    }


    @Then("I enter user email as {string} and password as {string}")
    public void iEnterUserEmailAsAndPasswordAs(String email, String pass) {
        new LoginPage().setSignIn(email, pass);

    }

    @And("I click on sign in button")
    public void iClickOnSignInButton() {
        new LoginPage().clickSignIn();
    }

    @Then("I have enter user info")
    public void iHaveEnterUserInfo() {
        new LoginPage().invalidInfo();
    }



    @Then("An error message will be displayed {string}")
    public void anErrorMessageWillBeDisplayed(String expectedText) {
        Assert.assertEquals(expectedText, new LoginPage().checkTextDisplayed());
    }
}

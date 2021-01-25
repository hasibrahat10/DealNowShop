package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;

public class LoginSteps extends BasePage {

    @Then("I am on admin login screen")
    public void i_am_on_admin_login_screen() {
       sleepFor(5);
    }


}

package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.SalesPage;

public class SalesSteps extends BasePage {

    @Then("I click on sales menu")
    public void iClickOnSalesMenu() {
        new SalesPage().setMenuSales();

    }

    @Then("I click on action icon order list")
    public void iClickOnActionIconOrderList() {
        new SalesPage().setOrderNo();
    }

    @Then("I have enter a comment and checked customer notify")
    public void iHaveEnterACommentAndCheckedCustomerNotify() {
        new SalesPage().setCommentNotify();
    }

    @And("I click on submit comment button")
    public void iClickOnSubmitCommentButton() {
        new SalesPage().setSubmitComment();
    }

    @Then("I click on invoice button and save invoice")
    public void iClickOnInvoiceButtonAndSaveInvoice() {
        new SalesPage().setSaveInvoice();
    }
}

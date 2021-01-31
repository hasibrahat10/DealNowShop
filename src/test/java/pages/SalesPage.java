package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.BasePage;

public class SalesPage extends BasePage {


    // ====================== Sales order elements ============================
    @FindBy(xpath = "//span[text()='Sales']")
    WebElement menuSales;
    @FindBy(id = "20")
    WebElement orderNo;
    @FindBy(id = "comment")
    WebElement comment;
    @FindBy(id = "customer-notified")
    WebElement commentNotify;
    @FindBy(xpath = "//button[contains(text(),'Submit Comment')]")
    WebElement submitComment;
    @FindBy(xpath = "//a[contains(text(),'Invoice') and @class='btn btn-lg btn-primary']")
    WebElement invoice;
    @FindBy(xpath = "//button[contains(text(),'Save Invoice')]")
    WebElement saveInvoice;

    public SalesPage() {
        PageFactory.initElements(driver, this);
    }

    //==================== Custom method declare to sales steps =============================

    public void setMenuSales() {
        menuSales.click();
        scrollDown(6);
    }

    public void setOrderNo() {
        orderNo.click();
    }

    public void setCommentNotify() {
        comment.sendKeys("Product ready to ship");
        commentNotify.click();
    }

    public void setSubmitComment() {
        submitComment.click();
        sleepFor(2);
    }

    public void setSaveInvoice() {
        invoice.click();
        saveInvoice.click();
        sleepFor(4);
    }


}

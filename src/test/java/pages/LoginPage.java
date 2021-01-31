package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.BasePage;

public class LoginPage extends BasePage {


    // ==================  To Find the Elements for the Login Page ========================
    @FindBy(id = "email")
    WebElement emailID;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(xpath = "//button[text()='Sign In']")
    WebElement signIn;

    @FindBy(xpath = "//div[text()='Please check your credentials and try again.' and @class='alert-wrapper']")
    WebElement alertError;

    @FindBy(xpath = "//span[text()='The \"Email\" field is required']")
    WebElement emailError;

    @FindBy(xpath = "//span[text()='The \"Password\" field is required']")
    WebElement passwordError;


    //====================  constructor define ========================
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    //======================  Custom method declare for the Login steps =============================

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void setSignIn(String email, String pass) {
        emailID.clear();
        emailID.sendKeys(email);

        password.clear();
        password.sendKeys(pass);

        sleepFor(3);
    }

    public void clickSignIn() {
        signIn.click();
        sleepFor(3);

    }

    public void invalidInfo() {
        emailID.clear();
        emailID.sendKeys("hasib@gmail.com");

        password.clear();
        password.sendKeys("test12345");

    }

    public String checkTextDisplayed() {
        String textError = alertError.getText();
        return textError;
    }

    public boolean verifyErrorMessageIsDisplayed() {
        return emailError.isDisplayed() && passwordError.isDisplayed();
    }


}

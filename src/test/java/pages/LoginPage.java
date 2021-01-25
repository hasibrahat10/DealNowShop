package pages;

import helper.WaitHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.BasePage;

public class LoginPage extends BasePage {


    // To Find the Elements for the Login Page




    //constructor define
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    //Custom method declare for the Login steps

    public String getPageTitle (){
        return driver.getTitle();
    }




}

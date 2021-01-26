package pages;

import org.openqa.selenium.support.PageFactory;
import stepDefinitions.BasePage;

public class RegistrationPage extends BasePage {

    //To Find the Elements for the Registration Page


    //constructor define
    public RegistrationPage() {
        PageFactory.initElements(driver, this);
    }

    //Custom Method declare for the steps


}

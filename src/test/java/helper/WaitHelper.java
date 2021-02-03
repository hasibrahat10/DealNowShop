package helper;


import org.openqa.selenium.support.PageFactory;
import stepDefinitions.BasePage;

public class WaitHelper extends BasePage {


    public WaitHelper() {
        PageFactory.initElements(driver, this);
    }

}

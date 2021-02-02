package helper;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import stepDefinitions.BasePage;

import java.time.Duration;

public class WaitHelper extends BasePage {


    public WaitHelper() {
        PageFactory.initElements(driver, this);
    }

}

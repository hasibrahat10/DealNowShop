package helper;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefinitions.BasePage;

public class WaitHelper extends BasePage {
    public WaitHelper() {
        PageFactory.initElements(driver, this);
    }

    public void WaitForElement(WebElement element, long timeOutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}

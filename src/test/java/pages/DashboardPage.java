package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.BasePage;

public class DashboardPage extends BasePage {


    //Define constructor
    public DashboardPage() {

        PageFactory.initElements(driver, this);
    }


    //Custom method declare for dashboard steps



}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.BasePage;

import java.util.List;

public class SearchPage extends BasePage {
    // ===================  Find elements for the search ===========================
    @FindBy(id = "search-field")
    WebElement searchText;
    @FindBy(xpath = "//span[@class='icon search-icon search-btn']")
    WebElement searchIcon;

    @FindBy(xpath = "//table[@class='table']")
    WebElement productTable;

    @FindBy(xpath = "//table[@class='table']//tbody/tr")
    List<WebElement> tableRows;

    @FindBy(xpath = "//table[@class='table']//tbody/tr/td[text()='booking a event']")
    WebElement searchResText;


    public SearchPage() {
        PageFactory.initElements(driver, this);
    }

    //================= Custom method declare for the Search steps =============================

    public void enterSearchText() {
        searchText.clear();
        searchText.sendKeys("booking a event");

    }

    public void setSearchIcon() {
        searchIcon.click();
    }

    public int getNoOfRows() {
        return (tableRows.size());
    }

 public boolean getResultDisplayed(){
        return searchResText.isDisplayed();

 }



}

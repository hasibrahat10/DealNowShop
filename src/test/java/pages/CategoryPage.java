package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import stepDefinitions.BasePage;

public class CategoryPage extends BasePage {
    @FindBy(xpath = "//div[@class='aside-nav buynoir-aside']/ul/li/a[contains(text(),'Categories')]")
    WebElement subMenuCategories;

    // ============================= Add Categories =============================
    @FindBy(xpath = "//div[@class='page-action']/a")
    WebElement addCategory;
    @FindBy(id = "name")
    WebElement categoryName;
    @FindBy(id = "status")
    WebElement visibleMenu;
    @FindBy(id = "position")
    WebElement categoryPosition;
    @FindBy(id = "display_mode")
    WebElement displayMode;
    @FindBy(id = "tinymce")
    WebElement shortDescri;
//    @FindBy(xpath = "//input[@id='44' and @type='radio']")
    @FindBy(id = "44")
    WebElement categoryRoot;
    @FindBy(xpath = "//select[@name='attributes[]']/option[1]")
    WebElement selectAttributes;
    @FindBy(id = "slug")
    WebElement categorySlug;
    @FindBy(xpath = "//button[contains(text(),'Save Category')]")
    WebElement saveCategory;

    public CategoryPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickSubCategories() {
        sleepFor(1);
        subMenuCategories.click();

    }

    public void clickAddCategories() {
        addCategory.click();
    }

    public void enterCategoriesDetailsInfo() {
        categoryName.clear();
        categoryName.sendKeys("NewCat");

        Select visibleM = new Select(visibleMenu);
        visibleM.selectByVisibleText("Yes");

        categoryPosition.sendKeys("5");
        sleepFor(5);
        scrollDown(2);

        Select displayM = new Select(displayMode);
        displayM.selectByVisibleText("Products and Description");
        scrollDown(1);
        new DashboardPage().enterIframeDescription();
        shortDescri.clear();
        shortDescri.sendKeys("Normal description for the category");
        new DashboardPage().exitIframe();

        sleepFor(2);
        scrollDown(5);
//        categoryRoot.click();
        js.executeScript("document.getElementById('44').click();");
        sleepFor(2);
        scrollDown(2);
        selectAttributes.click();
        scrollDown(2);

        categorySlug.clear();
        categorySlug.sendKeys("slug" + new Faker().number().digits(2));
        sleepFor(5);


    }

    public void clickSaveCategoryBtn() {
        saveCategory.click();
    }

}

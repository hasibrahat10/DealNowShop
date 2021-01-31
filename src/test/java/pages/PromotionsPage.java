package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import stepDefinitions.BasePage;

public class PromotionsPage extends BasePage {

    // =============== Elements for add category rule ============================
    @FindBy(xpath = "//span[text()='Promotions']")
    WebElement menuPromotions;
    @FindBy(xpath = "//div[@class='page-action']/a")
    WebElement addCatalogRule;
    @FindBy(id = "name")
    WebElement ruleName;
    @FindBy(id = "description")
    WebElement ruleDescription;
    @FindBy(id = "status")
    WebElement ruleStatus;
    @FindBy(id = "channels")
    WebElement channels;
    @FindBy(id = "customer_groups")
    WebElement customerGroup;
    @FindBy(name = "starts_from")
    WebElement dateFrom;
    @FindBy(name = "ends_till")
    WebElement endTill;
    @FindBy(id = "sort_order")
    WebElement priority;
    @FindBy(xpath = "//div[@class='accordian-header' and contains(text(),'Conditions')]")
    WebElement accordionConditions;
    @FindBy(id = "condition_type")
    WebElement conditionType;
    @FindBy(xpath = "//div[@class='accordian-header' and contains(text(),'Actions')]")
    WebElement accordionActions;
    @FindBy(id = "action_type")
    WebElement actionType;
    @FindBy(id = "discount_amount")
    WebElement discountAmount;
    @FindBy(id = "end_other_rules")
    WebElement endOtherRules;
    @FindBy(xpath = "//button[contains(text(),'Save Catalog Rule')]")
    WebElement saveCatalogRule;

    public PromotionsPage() {
        PageFactory.initElements(driver, this);
    }

    //================== Custom method Promotions steps ===========================

    public void setMenuPromotions() {
        menuPromotions.click();
    }

    public void setAddCatalogRule() {
        addCatalogRule.click();
    }

    public void setRulesInfo() {
        ruleName.sendKeys("Demo Gift" + new Faker().number().digits(2));
        ruleDescription.sendKeys("Demo promotions sales");
        scrollDown(2);
        js.executeScript("var status = document.querySelector('input[id=status]'); status.click();");

    }

    public void setChannels() {
        Select channel = new Select(channels);
        channel.selectByVisibleText("Hasib Shop");
        scrollDown(2);
        Select cusGroup = new Select(customerGroup);
        cusGroup.selectByVisibleText("General");

        scrollDown(2);

        priority.sendKeys("1");
        accordionConditions.click();
    }

    public void rulesAndConditions() {
        Select allConditions = new Select(conditionType);
        allConditions.selectByVisibleText("All Conditions are True");
        scrollDown(3);
        sleepFor(2);
        accordionActions.click();

        Select actType = new Select(actionType);
        actType.selectByVisibleText("Fixed Amount");
        scrollDown(2);
        discountAmount.sendKeys("2");
        Select endRule = new Select(endOtherRules);
        endRule.selectByVisibleText("No");
    }

    public void setSaveCatalogRule() {
        saveCatalogRule.click();
        sleepFor(2);
    }


}

package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import stepDefinitions.BasePage;

public class ConfigurePage extends BasePage {
    // =================  Find element for the general settings ===================
    @FindBy(xpath = "//span[text()='Configure']")
    WebElement menuConfigure;
    @FindBy(id = "general[general][locale_options][weight_unit]")
    WebElement unit;
    @FindBy(id = "general[general][email_settings][sender_name]")
    WebElement senderName;
    @FindBy(id = "general[general][email_settings][shop_email_from]")
    WebElement shopSendingEmail;
    @FindBy(id = "general[general][email_settings][admin_name]")
    WebElement adminName;
    @FindBy(id = "general[general][email_settings][admin_email]")
    WebElement adminEmail;
    @FindBy(xpath = "//button[contains(text(),'Save')]")
    WebElement saveGeneralSet;

    public ConfigurePage() {
        PageFactory.initElements(driver, this);
    }

    //================ Custom method declare for Configure steps =========================

    public void setMenuConfigure() {
        menuConfigure.click();
    }

    public void setUnit() {
        Select prodUnit = new Select(unit);
        prodUnit.selectByVisibleText("kgs");
        scrollDown(1);
    }

    public void emailSettings() {
        senderName.clear();
        senderName.sendKeys("Hasib" + new Faker().number().digits(2));
        shopSendingEmail.clear();
        shopSendingEmail.sendKeys("demo" + new Faker().number().digits(1) + "@yopmail.com");
        scrollDown(1);
        adminName.clear();
        adminName.sendKeys("admin" + new Faker().name().lastName());
        adminEmail.clear();
        adminEmail.sendKeys("dealnow" + new Faker().number().digits(2) + "@yopmail.com");
    }

    public void setSaveGeneralSet() {
        saveGeneralSet.click();
        sleepFor(3);
    }


}

package pages;

import com.github.javafaker.Faker;
import helper.WaitHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import stepDefinitions.BasePage;

public class SettingsPage extends BasePage {
    // ==========================  Element for the locales =============================

    @FindBy(xpath = "//span[text()='Settings']")
    WebElement menuSettings;
    @FindBy(xpath = "//div[@class='page-action']/a")
    WebElement addLocale;
    @FindBy(id = "code")
    WebElement localeCode;
    @FindBy(id = "name")
    WebElement localeName;
    @FindBy(id = "direction")
    WebElement localeDirection;
    @FindBy(id = "7")
    WebElement acceptImage;
    @FindBy(xpath = "//button[contains(text(),'Save Locale')]")
    WebElement saveLocale;

    @FindBy(xpath = "//p[text()='Locale created successfully.']")
    WebElement successAlert;

    //===========================  Add a new currency ==================================
    @FindBy(xpath = "//div[@class='aside-nav buynoir-aside']/ul/li/a[contains(text(),'Currencies')]")
    WebElement subMenuCurrencies;
    @FindBy(xpath = "//div[@class='page-action']/a")
    WebElement addCurrency;
    @FindBy(id = "code")
    WebElement currencyCode;
    @FindBy(id = "name")
    WebElement currencyName;
    @FindBy(xpath = "//button[contains(text(),'Save Currency')]")
    WebElement saveCurrency;


    // ====================  Add a exchange rates =================================

    @FindBy(xpath = "//div[@class='aside-nav buynoir-aside']/ul/li/a[contains(text(),'Exchange Rates')]")
    WebElement subMenuExCurrency;

    @FindBy(xpath = "//a[contains(text(),'Add Exchange Rate')]")
    WebElement addExchangeRate;

    @FindBy(xpath = "//*[@name='target_currency']")
    WebElement targetCurrency;

    @FindBy(id = "rate")
    WebElement currencyRate;

    @FindBy(xpath = "//button[contains(text(),'Save Exchange Rate')]")
    WebElement saveExchangeRate;

    //============================== Add an inventory source ================================
    @FindBy(xpath = "//div[@class='aside-nav buynoir-aside']/ul/li/a[contains(text(),'Inventory Sources')]")
    WebElement subMenuInventorySources;

    @FindBy(xpath = "//div[@class='page-action']/a")
    WebElement addInventorySource;

    @FindBy(id = "code")
    WebElement inventoryCode;

    @FindBy(id = "name")
    WebElement inventoryName;

    @FindBy(id = "description")
    WebElement inventoryDesc;

    @FindBy(id = "priority")
    WebElement inventoryPriority;

    @FindBy(id = "status")
    WebElement inventoryStatus;

    @FindBy(id = "contact_name")
    WebElement inventoryContactName;

    @FindBy(id = "contact_email")
    WebElement inventoryContactEmail;

    @FindBy(id = "contact_number")
    WebElement inventoryContactNumber;

    @FindBy(xpath = "//select[@id='country']")
    WebElement sourceCountry; // select Bangladesh

    @FindBy(id = "state")
    WebElement sourceState;

    @FindBy(id = "city")
    WebElement sourceCity;

    @FindBy(id = "street")
    WebElement sourceStreet;

    @FindBy(id = "postcode")
    WebElement sourcePostcode;

    @FindBy(xpath = "//button[contains(text(),'Save Inventory Source')]")
    WebElement saveInventorySrc;

    // ===================  Add User role ============================

    @FindBy(xpath = "//div[@class='aside-nav buynoir-aside']/ul/li/a[contains(text(),'Users')]")
    WebElement subMenuUsers;

    @FindBy(xpath = "//div[@class='page-action']/a")
    WebElement addUser;

    @FindBy(id = "name")
    WebElement userName;

    @FindBy(id = "email")
    WebElement userEmail;

    @FindBy(id = "password")
    WebElement userPassword;

    @FindBy(id = "password_confirmation")
    WebElement userPassConfirm;

    @FindBy(name = "role_id")
    WebElement userRole;

    @FindBy(name = "status")
    WebElement userStatus; // Direct javascript entry

    @FindBy(xpath = "//button[contains(text(),'Save User')]")
    WebElement saveUser;


    // ============== Define Constructor to run driver ========================

    public SettingsPage() {
        PageFactory.initElements(driver, this);
    }


    //=====================  Custom method declare to setting steps =============================

    public void clickSettingMenu() {
        menuSettings.click();
    }

    public void clickAddLocaleButton() {
        addLocale.click();
    }

    public void enterGeneralLocalInfo() {
        localeCode.sendKeys("en_GB");

        localeName.sendKeys("United Kingdom");

        Select direction = new Select(localeDirection);
        direction.selectByVisibleText("LTR");
        scrollDown(2);
//        acceptImage.sendKeys("G:\\Browser Download\\bdflag");
    }

    public void clickSaveLocale() {
        waitForVisibility(saveLocale);
        saveLocale.click();

    }

    public boolean setSuccessAlert(){
        return waitForVisibility(successAlert);
    }

    public void clickCurrencyMenu() {
        subMenuCurrencies.click();
    }

    public void clickOnAddCurrency() {
        addCurrency.click();
    }

    public void enterCurrencyInfo() {
        currencyCode.clear();
        currencyCode.sendKeys("BGD");

        currencyName.clear();
        currencyName.sendKeys("Bangla");

    }

    public void clickOnSaveCurrency() {
        saveCurrency.click();
        sleepFor(4);
    }

    public void clickOnExchangeRates() {
        subMenuExCurrency.click();
    }

    public void clickAddExchangeRate() {
        addExchangeRate.click();
    }

    public void enterCurrencyRateInfo() {
        Select targetCur = new Select(targetCurrency);
        sleepFor(2);
        System.out.println(targetCur.getOptions().size());
        targetCur.selectByVisibleText("Bangla"); // problem to select it

        sleepFor(2);

        currencyRate.clear();
        currencyRate.sendKeys("85");
    }

    public void clickOnSaveExchangeRate() {
        saveExchangeRate.click();
        sleepFor(3);
    }

    public void clickSubInventorySrc() {
        subMenuInventorySources.click();
    }

    public void clickOnAddInventorySrc() {
        addInventorySource.click();
    }

    public void enterGeneralInfo() {
        inventoryCode.clear();
        inventoryCode.sendKeys("DHK");

        inventoryName.clear();
        inventoryName.sendKeys("DhakaInventory");

        inventoryDesc.sendKeys("Another stock for products");

        scrollDown(3);
        inventoryPriority.clear();
        inventoryPriority.sendKeys("2");

        js.executeScript("var status = document.querySelector('input[id=status]'); status.click();");

        scrollDown(2);

    }

    public void enterContactInformation() {
        inventoryContactName.clear();
        inventoryContactName.sendKeys("Hasib");
        inventoryContactEmail.clear();
        inventoryContactEmail.sendKeys("hasib90@yopmail.com");
        scrollDown(1);
        inventoryContactNumber.clear();
        inventoryContactNumber.sendKeys("123456");
        scrollDown(2);
    }

    // Problem to select country
    public void SelectSourceCountry(String value) {
        Select chooseCountry = new Select(sourceCountry);
        chooseCountry.selectByVisibleText(value);
    }

    public void enterSourceAddress() {
        sourceState.clear();
        sourceState.sendKeys("BD");
        scrollDown(2);
        sourceCity.clear();
        sourceCity.sendKeys("Dhaka");
        sourceStreet.clear();
        sourceStreet.sendKeys("1697,RBG");
        scrollDown(1);
        sourcePostcode.clear();
        sourcePostcode.sendKeys("1236");

    }

    public void clickOnSaveInventorySrc() {
        saveInventorySrc.click();
        sleepFor(3);
    }

    public void userSubMenuAddBtn() {
        subMenuUsers.click();
        sleepFor(1);
        addUser.click();

    }

    public void generalInfoPass() {
        userName.sendKeys("Demo User");
        userEmail.sendKeys("hasib" + new Faker().number().digits(2) + "@yopmail.com");
        scrollDown(2);

        userPassword.sendKeys("test12345");
        userPassConfirm.sendKeys("test12345");
        scrollDown(2);
    }

    public void statusRole() {
        Select stsRole = new Select(userRole);
        stsRole.selectByVisibleText("Moderator");

        js.executeScript("var status = document.querySelector('input[id=status]'); status.click();");
    }

    public void clickOnSaveUser() {
        saveUser.click();
        sleepFor(3);
    }



}

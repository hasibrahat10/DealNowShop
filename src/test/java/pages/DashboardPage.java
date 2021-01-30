package pages;


import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import stepDefinitions.BasePage;

public class DashboardPage extends BasePage {


    @FindBy(xpath = "//span[text()='Dashboard']")
    WebElement menuDashboard;


    //Custom method declare for dashboard steps
    // ======================== Add a new Product Simple Type Start  =========================
    @FindBy(xpath = "//div/i[@class='icon remove-icon']")
    WebElement skipSubscription;

    @FindBy(xpath = "//span[text()='Catalog']")
    WebElement menuCatalog;

    @FindBy(xpath = "//div[@class='aside-nav buynoir-aside']/ul/li/a[contains(text(),'Products')]")
    WebElement subMenuProducts;

    @FindBy(xpath = "//div[@class='page-action']/a")
    WebElement addProduct;

    @FindBy(id = "type") // select "Simple" type product
            WebElement productType;

    @FindBy(id = "attribute_family_id") // select "Default"
            WebElement attributeFamily;
    @FindBy(id = "sku")
    WebElement stockUnit;
    @FindBy(xpath = "//button[@type='submit' and @class='btn btn-lg btn-primary']")
    WebElement saveProductBtn;
    @FindBy(id = "name")

    WebElement productName;
    @FindBy(id = "url_key")

    WebElement productUrlKey;
    //    @FindBy(xpath = "(//span[@class='slider round'])[3]")
    @FindBy(css = "input[id=visible_individually]")
    WebElement productVisible;
    @FindBy(xpath = "(//span[@class='slider round'])[4]")//Status
            WebElement productStatus;
    @FindBy(xpath = "(//span[@class='slider round'])[5]")//Guest Checkout
            WebElement guestCheckOut;
    @FindBy(xpath = "(//div[@class='accordian-header'])[2]")
    WebElement clickAccordionHeader;
    @FindBy(id = "tinymce")
    WebElement shortDescription;
    @FindBy(id = "price")
    WebElement productPrice;
    @FindBy(id = "weight")
    WebElement shippingWeight;
    @FindBy(xpath = "(//div[@class='control-group']/input)[1]")
    WebElement productInventories;
    @FindBy(xpath = "(//i[@class='icon accordian-down-icon'])[5]")
    WebElement clickImageAccordionIcon;

    @FindBy(xpath = "//div[@class='accordian-header' and contains(text(),'Images')]")
    WebElement accordionImageText;

    @FindBy(xpath = "//label[contains(text(),'Add Image')]")
    WebElement clickAddImage;
    @FindBy(name = "images[]")
    WebElement acceptImage;
    @FindBy(id = "49")
    WebElement categoriesProduct;
    @FindBy(xpath = "//select[@name='channels[]']") // Hasib Shop
            WebElement productChannel;


    // ============================= Tenant Profile Update =============================

    @FindBy(xpath = "//span[text()='Tenant']")
    WebElement menuTenant;

    @FindBy(xpath = "//input[@name='first_name']")
    WebElement tenantFirstName;
    @FindBy(xpath = "//input[@name='last_name']")
    WebElement tenantLastName;

    @FindBy(xpath = "//input[@name='email']")
    WebElement tenantEmail;

    @FindBy(xpath = "//input[@name='phone']")
    WebElement tenantPhone;

    @FindBy(xpath = "//button[contains(text(),'Update Profile')]")
    WebElement updateProfileBtn;


    //Define constructor
    public DashboardPage() {

        PageFactory.initElements(driver, this);
    }

//Declare custom method

//    public  void dismissSubscriptionPlan(){
//        skipSubscription.click();
//        sleepFor(2);
//    }

    public void clickCatalogMenu() {
        menuCatalog.click();
        sleepFor(2);
    }

    public void clickProductCatalog() {
        subMenuProducts.click();
        sleepFor(7);
    }

    public void clickAddProduct() {
        addProduct.click();
    }

    public void enterProductGeneralInfo() {
        Select prodType = new Select(productType);
        prodType.selectByVisibleText("Simple");

        Select attributeType = new Select(attributeFamily);
        attributeType.selectByVisibleText("Default");

        stockUnit.clear();
        stockUnit.sendKeys("test" + new Faker().number().digits(3));

    }

    public void clickOnSaveProduct() {
        saveProductBtn.click();
        sleepFor(5);
    }

    public void editProductInfo() {

        productName.clear();
        productName.sendKeys("Men winter" + new Faker().number().digits(3));
        System.out.println("Wait for element");
        scrollDown(4);
//        productVisible.click();
        js.executeScript("var elm = document.querySelector('input[id=visible_individually]'); elm.click();");

        productStatus.click();
        scrollDown(3);

//        guestCheckOut.click();
        js.executeScript("var elm = document.querySelector('input[id=guest_checkout]'); elm.click();");


        iframeShortDescription();
        shortDescription.clear();
        shortDescription.sendKeys("Product short description - Mend");
        exitIframe();

        enterIframeDescription();
        scrollDown(2);
        shortDescription.clear();
        shortDescription.sendKeys("Normal description for the product");
        exitIframe();

        scrollDown(6);
        //productPrice.sendKeys(String.valueOf(10));
        js.executeScript("document.getElementById('price').value = 10");
        js.executeScript("document.getElementById('weight').value = 0.10");

        js.executeScript("document.querySelector(\"input[name='inventories[29]']\").value = 45");
        scrollDown(3);
        accordionImageText.click();
        scrollDown(1);

        clickAddImage.click();
        scrollDown(1);
        sleepFor(2);

        acceptImage.sendKeys("C:\\Users\\rootnext\\Downloads\\denm.jpg");

        scrollDown(1);
        //categoriesProduct.click();
        js.executeScript("document.getElementById('49').click();");

        Select prodChannel = new Select(productChannel);
        prodChannel.selectByVisibleText("Hasib Shop");

        sleepFor(4);
        saveProductBtn.click();

    }


    public void iframeShortDescription() {
        driver.switchTo().frame("short_description_ifr"); //short description
    }

    public void enterIframeDescription() {
        driver.switchTo().frame("description_ifr"); // Normal description part

    }

    public void exitIframe() {
        driver.switchTo().defaultContent();
    }

    public void clickTenantMenu() {
        menuTenant.click();
    }

    public void enterTenantInfo() {
        sleepFor(3);
        tenantFirstName.clear();
        tenantFirstName.sendKeys("Hasib" + new Faker().number().digits(2));
        tenantLastName.clear();
        tenantLastName.sendKeys("rahat");
        tenantEmail.clear();
        tenantEmail.sendKeys("buynoirtest@yopmail.com");
        tenantPhone.clear();
        tenantPhone.sendKeys("123456" + new Faker().number().digits(2));


    }

    public void clickOnUpdateProfileButton() {
        sleepFor(3);
        updateProfileBtn.click();
    }


}

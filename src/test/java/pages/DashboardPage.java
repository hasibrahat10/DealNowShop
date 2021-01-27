package pages;


import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import stepDefinitions.BasePage;

public class DashboardPage extends BasePage {


    @FindBy(xpath = "//span[text()='Dashboard']")
    WebElement menuDashboard;


    //Custom method declare for dashboard steps
    @FindBy(xpath = "//span[text()='Catalog']")
    @CacheLookup
    WebElement menuCatalog;
    @FindBy(xpath = "//div[@class='aside-nav buynoir-aside']/ul/li/a[contains(text(),'Products')]")
    @CacheLookup
    WebElement subMenuProducts;
    @FindBy(xpath = "//div[@class='page-action']/a")
    @CacheLookup
    WebElement addProduct;
    @FindBy(id = "type") // select "Simple" type product
    @CacheLookup
    WebElement productType;
    @FindBy(id = "attribute_family_id") // select "Default"
    @CacheLookup
    WebElement attributeFamily;
    @FindBy(id = "sku")
    @CacheLookup
    WebElement stockUnit;
    @FindBy(xpath = "//button[@type='submit' and @class='btn btn-lg btn-primary']")
    @CacheLookup
    WebElement saveProductBtn;
    @FindBy(id = "name")
    @CacheLookup
    WebElement productName;
    @FindBy(id = "url_key")
    @CacheLookup
    WebElement productUrlKey;
    @FindBy(id = "visible_individually")
    WebElement productVisible;
    @FindBy(id = "status")
    WebElement productStatus;
    @FindBy(id = "guest_checkout")
    WebElement guestCheckOut;
    @FindBy(id = "tinymce")
    WebElement shortDescription;
    @FindBy(id = "price")
    WebElement productPrice;
    @FindBy(id = "weight")
    WebElement shippingWeight;
    @FindBy(xpath = "(//div[@class='control-group']/input)[1]")
    WebElement productInventories;
    @FindBy(xpath = "//label[contains(text(),'Add Image')]")
    WebElement addImage;
    @FindBy(id = "49")
    WebElement categoriesProduct;
    @FindBy(xpath = "//select[@name='channels[]']") // Hasib Shop
            WebElement productChannel;

    //Define constructor
    public DashboardPage() {

        PageFactory.initElements(driver, this);
    }

//Declare custom method

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
        sleepFor(2);
    }

    public void editProductInfo() {
        sleepFor(10);
        productName.clear();
        productName.sendKeys("Men winter" + new Faker().number().digits(3));

        sleepFor(4);

//        productUrlKey.clear();
//        productUrlKey.sendKeys("men");
        scrollDown(1);
        sleepFor(3);
        scrollDownToElement(productVisible);
        productVisible.click();

        productStatus.click();

        guestCheckOut.click();
        sleepFor(4);
        scrollDown(1);

        iframeShortDescription();
        shortDescription.clear();
        shortDescription.sendKeys("Product short description - Mend");
        exitIframe();

        sleepFor(4);
        enterIframeDescription();
        scrollDown(1);
        shortDescription.clear();
        shortDescription.sendKeys("Normal description for the product");
        exitIframe();
        sleepFor(5);
        scrollDown(1);
        productPrice.clear();
        productPrice.sendKeys("10");
        shippingWeight.clear();
        shippingWeight.sendKeys("0.020");
        scrollDown(1);
        productInventories.clear();
        productInventories.sendKeys("25");

        addImage.sendKeys("C:\\Users\\rootnext\\Downloads\\denm.jpg");
        sleepFor(4);
        scrollDown(1);
        categoriesProduct.click();

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


}

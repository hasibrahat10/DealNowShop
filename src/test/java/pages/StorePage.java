package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.BasePage;

public class StorePage extends BasePage {
    //============= Element for Store Front || Log In ==========================
    @FindBy(xpath = "//span[text()='Sign In']")
    WebElement hoverIcon;
    @FindBy(xpath = "//a[text()='Sign In']")
    WebElement signInBtn;
    @FindBy(name = "email")
    WebElement customerEmail;
    @FindBy(name = "password")
    WebElement customerPass;
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginBtn;
    //==================== Checkout an order from Shop ============================
    @FindBy(xpath = "//span[text()='Men']")
    WebElement menuCatMen;
    @FindBy(xpath = "(//a[@class='product-image-container'])[1]")
    WebElement chooseProduct;
    @FindBy(xpath = "//button[contains(text(),'Add To Cart')]")
    WebElement addToCartBtn;
    @FindBy(xpath = "//p[text()='Success! Item was successfully added to cart..']")
    WebElement successAlert;
    @FindBy(xpath = "//span[text()='Shopping Bag']")
    WebElement shoppingBag;
    @FindBy(xpath = "//a[text()='View Shopping Cart']")
    WebElement viewCart;
    @FindBy(xpath = "//a[contains(text(),'Proceed to checkout')]")
    WebElement proceedToCheckout;
    @FindBy(xpath = "//input[@name='billing[address_id]']")
    WebElement checkedBillAdd;
    @FindBy(id = "free_free")
    WebElement freeShipping;
    @FindBy(id = "cashondelivery")
    WebElement cashOnDelivery;
    @FindBy(id = "checkout-place-order-button")
    WebElement placeOrder;
    @FindBy(xpath = "//h1[text()='Thank you for your order!']")
    WebElement thanksText;

    public StorePage() {
        PageFactory.initElements(driver, this);
    }


    // =============== Custom method declare for store steps =================

    public void setSignInBtn() {
        //Instantiate Action Class
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverIcon).perform();


    }

    public void clickSignIn() {
        waitForVisibility(signInBtn);
        signInBtn.click();
    }

    public void customerLoginInfo() {
        customerEmail.clear();
        customerEmail.sendKeys("rahat009@mailinator.com");
        customerPass.clear();
        customerPass.sendKeys("test12345");

    }

    public void setLoginBtn() {
        loginBtn.click();
    }

    public void setMenuCatMen() {
        sleepFor(2);
        menuCatMen.click();
    }

    public void setChooseProduct() {
        chooseProduct.click();
    }

    public void setAddToCartBtn() {
        addToCartBtn.click();
        sleepFor(8);
    }

    public void setShoppingBag() {
        waitForVisibility(shoppingBag);
        shoppingBag.click();
    }

    public void setViewCart() {
        waitForVisibility(viewCart);
        viewCart.click();
    }

    public void setProceedToCheckout() {
        proceedToCheckout.click();
    }

    public void setCheckedBillAdd() {
        checkedBillAdd.click();
        scrollDown(2);
        waitForVisibility(freeShipping);
        freeShipping.click();
    }

    public void paymentAndPlaceOrder() {
        scrollDown(2);
        waitForVisibility(cashOnDelivery);
        cashOnDelivery.click();
        sleepFor(5);
        scrollDown(10);
        waitForVisibility(placeOrder);
        placeOrder.click();
    }

    public boolean displayedThankText() {
        sleepFor(4);
        return thanksText.isDisplayed();
    }

}

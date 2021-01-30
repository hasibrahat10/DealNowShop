package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import stepDefinitions.BasePage;

public class CustomerPage extends BasePage {


    // Elements find for the add customer
    @FindBy(xpath = "//span[text()='Customers']")
    WebElement menuCustomers;
    @FindBy(xpath = "//div[@class='page-action']/a")
    WebElement addCustomer;
    @FindBy(name = "first_name")
    WebElement firstName;
    @FindBy(name = "last_name")
    WebElement lastName;
    @FindBy(name = "email")
    WebElement customerEmail;
    @FindBy(name = "gender")
    WebElement selectGender;
    @FindBy(name = "date_of_birth")
    WebElement selectDOB;
    @FindBy(name = "phone")
    WebElement customerPhone;
    @FindBy(name = "customer_group_id")
    WebElement customerGroupSelect;
    @FindBy(xpath = "//button[contains(text(),'Save Customer')]")
    WebElement saveCustomer;


    // Add groups

    @FindBy(xpath = "//div[@class='aside-nav buynoir-aside']/ul/li/a[contains(text(),'Groups')]")
    WebElement subMenuGroups;

    @FindBy(xpath = "//div[@class='page-action']/a")
    WebElement addGroups;

    @FindBy(id = "code")
    WebElement groupCode;

    @FindBy(name = "name")
    WebElement groupName;

    @FindBy(xpath = "//button[contains(text(),'Save Group')]")
    WebElement saveGroup;



    public CustomerPage() {
        PageFactory.initElements(driver, this);
    }

    //Custom method declare for the customer steps

    public void clickCustomerMenu() {
        menuCustomers.click();
    }

    public void clickAddCustomer() {
        addCustomer.click();
    }

    public void enterCustomerInfo() {
        firstName.clear();
        firstName.sendKeys("Hasib" + new Faker().number().digits(2));

        lastName.clear();
        lastName.sendKeys("Rahat");

        customerEmail.clear();
        customerEmail.sendKeys("hasib" + new Faker().number().digits(2) + "@yopmail.com");

        Select gender = new Select(selectGender);
        gender.selectByVisibleText("Female");
        scrollDown(2);
        sleepFor(2);

        customerPhone.clear();
        customerPhone.sendKeys("2345" + new Faker().number().digits(4));

        Select customerGrp = new Select(customerGroupSelect);
        customerGrp.selectByVisibleText("General");
        sleepFor(3);
    }

    public void clickSaveCustomer() {
        saveCustomer.click();
        sleepFor(5);
    }

    public void clickSubCategoryGroups(){
        subMenuGroups.click();
    }

    public void clickAddGroup(){
        addGroups.click();
    }

    public void enterGroupInfo(){
        groupCode.clear();
        groupCode.sendKeys("Special");

        groupName.clear();
        groupName.sendKeys("Special");
    }

    public void clickSaveGroup(){
        saveGroup.click();
        sleepFor(4);
    }
}

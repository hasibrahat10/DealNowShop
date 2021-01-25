package stepDefinitions;

import com.github.javafaker.Faker;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BasePage {
    public static WebDriver driver;

    public void startDriver() {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--ignore-certificate-errors");
        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir") + "/drivers/chromedriver_win32/chromedriver.exe");
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
        Logger.getLogger("").setLevel(Level.OFF);
        driver = new ChromeDriver(chromeOptions);

    }


    public void stopDriver() {
        if (driver != null) {
            driver.quit();
        }
    }


    public void sleepFor(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Created for generating random string for unique email
    public static String randomString(){
        String generatedString = RandomStringUtils.randomAlphabetic(5);
        return (generatedString);
    }

    public static String randomEmail(){
        String emailID = "hasib"+new Faker().number().digits(3)+"@yopmail.com";
        return (emailID);
    }


}

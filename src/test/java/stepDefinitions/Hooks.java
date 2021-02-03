package stepDefinitions;


import helper.FileHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage {
    @Before
    public void setUpDriver(Scenario scenario) {
        scenarioName = scenario.getName();
        startDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        driver.get("http://dealnow.buynoir.co/admin/login");
        driver.get("http://dealnow.buynoir.co/");
    }

    @After
    public void tearDown() {
        FileHelper.take_screenshot();
        stopDriver();
    }

}

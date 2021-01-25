package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage {
    @Before
    public void setUpDriver() {
        startDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://dealnow.buynoir.co/admin/login");
    }

    @After
    public void tearDown() {
        stopDriver();
    }

}

package com.centrilli.StepDefinitions;

import com.centrilli.pages.CentrilliLoginPage;
import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.FindBy;

public class LoginStepDefinitions {


    CentrilliLoginPage centrilliLoginPage = new CentrilliLoginPage();

    @Given("User logged in as posmanager")
    public void user_logged_in_as_posmanager() throws InterruptedException {
        BrowserUtils.waitFor(3);
        centrilliLoginPage.email.sendKeys("posmanager10@info.com");
        centrilliLoginPage.password.sendKeys("posmanager");
        BrowserUtils.waitFor(3);
        centrilliLoginPage.loginButton.click();
    }

    @And("user selects {string} module from the navigation bar")
    public void user_selects_module_from_the_navigation_bar(String string) throws InterruptedException {

        Thread.sleep(5000);

        if (centrilliLoginPage.moreButton.isDisplayed()) {

            centrilliLoginPage.moreButton.click();
            Thread.sleep(5000);
            centrilliLoginPage.fleetButton.click();
            BrowserUtils.waitFor(3);

        } else {

            centrilliLoginPage.fleetButton.click();
            BrowserUtils.waitFor(3);

        }
    }

    @And("user selects {string} module button to land on the page")
    public void user_selects_module_button_to_land_on_the_page(String string) throws InterruptedException {
        BrowserUtils.waitFor(3);
        centrilliLoginPage.vehiclesContractsButton.click();
        BrowserUtils.waitFor(3);


    }




}

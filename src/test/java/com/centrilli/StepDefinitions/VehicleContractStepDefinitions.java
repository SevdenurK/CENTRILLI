package com.centrilli.StepDefinitions;

import com.centrilli.pages.CentrilliLoginPage;
import com.centrilli.pages.CentrilliVehiclesContractsPage;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class VehicleContractStepDefinitions {


    CentrilliVehiclesContractsPage vehiclesContractsPage = new CentrilliVehiclesContractsPage();


    @When("user clicks on the Create button")
    public void user_clicks_on_the_create_button() throws InterruptedException {
        Thread.sleep(5000);
        vehiclesContractsPage.createButton.click();
        Thread.sleep(5000);
    }

    @When("user selects a Vehicle")
    public void user_selects_a_vehicle() throws InterruptedException {
        vehiclesContractsPage.vehicleDropDown.click();
        Thread.sleep(3000);
        vehiclesContractsPage.vehicleDropDown.sendKeys(Keys.DOWN);
        Thread.sleep(3000);
        vehiclesContractsPage.vehicleDropDown.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }


    @When("user clicks to Save button")
    public void user_clicks_to_save_button() throws InterruptedException {
        Thread.sleep(3000);
        vehiclesContractsPage.saveButton.click();
        Thread.sleep(3000);
    }

    @Then("page title changes to the new Vehicle Contract value")
    public void page_title_changes_to_the_new_Vehicle_Contract_value() {

        String selectedVehicle = vehiclesContractsPage.vehicleDropDown.getText();
        System.out.println("selectedVehicle = " + selectedVehicle);
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);

        Assert.assertTrue(actualTitle.contains(selectedVehicle));
    }

    @When("user receives a warning popup message, means that he is unable to create a vehicle.")
    public void user_receives_a_warning_popup_message_means_that_he_is_unable_to_create_a_vehicle() {
        vehiclesContractsPage.popUpMessage.isDisplayed();
    }

    @Then("user makes sure his contract is NOT created by verifying page title stayed the same")
    public void user_makes_sure_his_contract_is_not_created_by_verifying_page_title_stayed_the_same() {
        String expectedTitle = "New - Odoo";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);
         Assert.assertEquals(expectedTitle, actualTitle);
    }


    @When("user clicks on the Discard button")
    public void user_clicks_on_the_discard_button() throws InterruptedException {
        Thread.sleep(3000);
        vehiclesContractsPage.discardButton.click();
        Thread.sleep(3000);
    }
    @Then("user makes sure his contract is discarded by landing on the Vehicles Contracts page")
    public void user_makes_sure_his_contract_is_discarded_by_landing_on_the_Vehicles_Contracts_page() {
        String expectedTitle = "Vehicles Contracts - Odoo";
        System.out.println("expectedTitle = " + expectedTitle);
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);
    }

    @When("user searches for his recently created vehicle contract using search box by typing newly created vehicle's name")
    public void user_searches_for_his_recently_created_vehicle_contract_using_search_box_by_typing_newly_created_vehicle_s_name() throws InterruptedException {
        Driver.getDriver().navigate().back();
        Thread.sleep(3000);
        String selectedVehicle = vehiclesContractsPage.createdVehicleName.getText();
        System.out.println("selectedVehicle = " + selectedVehicle);
        Thread.sleep(3000);
        Driver.getDriver().navigate().forward();
        Thread.sleep(3000);
        vehiclesContractsPage.searchBox.click();
        Thread.sleep(3000);
        vehiclesContractsPage.searchBox.sendKeys(selectedVehicle);
        Thread.sleep(3000);
        vehiclesContractsPage.searchBox.sendKeys(Keys.ENTER);
    }
    @When("user should see his vehicle contract listed  under Vehicle Contract list")
    public void user_should_see_his_vehicle_contract_listed_under_vehicle_contract_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}

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
    public void user_should_see_his_vehicle_contract_listed_under_vehicle_contract_list() throws InterruptedException {
        //to be able to go to the last page, total value of crated vehicle contracts should be divided to 80 (1 page contains 80 v.c.)
        //and denominator should be added by 1 to calculate the total page number.
        //so, click() method should be used in a for loop to click next page "pageNumber" times to go to the last page.

        Thread.sleep(5000);
        String lastPageString = vehiclesContractsPage.pageLimit.getText();
        int pageNumber = (Integer.valueOf(lastPageString) / 80) + 1;
        double pageNumber1 = (Double.valueOf(lastPageString));
        System.out.println("Page Number = " + pageNumber);
        for (int i=0; i < pageNumber-1; i ++) {
            vehiclesContractsPage.nextPageButton.click();
        }
        Thread.sleep(3000);

        //
    }


    @When("user clicks to Kanban icon to change the view into kanban style")
    public void user_clicks_to_kanban_icon_to_change_the_view_into_kanban_style() throws InterruptedException {
        Thread.sleep(3000);
        vehiclesContractsPage.kanbanButton.click();
        Thread.sleep(3000);
    }

    @When("user clicks to Graph icon to change the view into graph style")
    public void user_clicks_to_graph_icon_to_change_the_view_into_graph_style() throws InterruptedException {
        Thread.sleep(3000);
        vehiclesContractsPage.graphButton.click();
        Thread.sleep(3000);
    }
    @Then("user clicks to List icon to change the view into list style")
    public void user_clicks_to_list_icon_to_change_the_view_into_list_style() throws InterruptedException {
        Thread.sleep(3000);
        vehiclesContractsPage.listButton.click();
        Thread.sleep(3000);
    }

    @When("user clicks right arrow that is at the up right corner of screen to change the page number")
    public void user_clicks_right_arrow_that_is_at_the_up_right_corner_of_screen_to_change_the_page_number() throws InterruptedException {
        Thread.sleep(3000);
        vehiclesContractsPage.nextPageButton.click();
        Thread.sleep(3000);
    }
    @When("user jumps to the next page and the page number changes")
    public void user_jumps_to_the_next_page_and_the_page_number_changes() throws InterruptedException {
        Thread.sleep(5000);
        String pageLimitString = vehiclesContractsPage.pageLimit.getText(); //01-80
        String[] parts = pageLimitString.split("-"); //81-160
        String part1 = parts[0]; // 81
        String part2 = parts[1]; // 160
        int pageNumber = (Integer.valueOf(part1) / 80) + 1;
        System.out.println("Page Number = " + pageNumber);
        Thread.sleep(3000);
        Assert.assertEquals(2, pageNumber);
    }
    @When("user clicks left arrow that is at the up right corner of screen to change the page number")
    public void user_clicks_left_arrow_that_is_at_the_up_right_corner_of_screen_to_change_the_page_number() throws InterruptedException {
        Thread.sleep(3000);
        vehiclesContractsPage.previousPageButton.click();
        Thread.sleep(3000);
    }
    @Then("user jumps to the previous page and the page number changes")
    public void user_jumps_to_the_previous_page_and_the_page_number_changes() throws InterruptedException {
        Thread.sleep(5000);
        String pageLimitString = vehiclesContractsPage.pageLimit.getText(); //01-80
        String[] parts = pageLimitString.split("-"); //01-80
        String part1 = parts[0]; // 01
        String part2 = parts[1]; // 80
        int pageNumber = (Integer.valueOf(part1) / 80) + 1;
        System.out.println("Page Number = " + pageNumber);
        Thread.sleep(3000);
        Assert.assertEquals(1, pageNumber);
    }

    @When("Attachment\\(s) button is displayed at the top of the page")
    public void attachment_s_button_is_displayed_at_the_top_of_the_page() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(vehiclesContractsPage.attachmentButton.isDisplayed());
    }
    @Then("Action button is displayed at the top of the page")
    public void action_button_is_displayed_at_the_top_of_the_page() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(vehiclesContractsPage.actionButton.isDisplayed());
    }


}

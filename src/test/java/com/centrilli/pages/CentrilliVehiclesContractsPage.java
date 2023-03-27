package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Given;
import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CentrilliVehiclesContractsPage {


    public CentrilliVehiclesContractsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement createButton;

    @FindBy (xpath = "//*[@id=\"o_field_input_529\"]")
    public WebElement vehicleDropDown;

    @FindBy (xpath = "//div/button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;

    @FindBy (xpath = "/html/body/div[2]/div")
    public WebElement popUpMessage;

    @FindBy (xpath = "//button[@accesskey='j']")
    public WebElement discardButton;

    @FindBy (xpath = "//div/input[@class='o_searchview_input']")
    public WebElement searchBox;

    @FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr[last()]")
    public WebElement lastRow;

    //@FindBy (xpath = "//*[@id=\"o_field_input_814\"]")
    @FindBy (xpath = "//*[@name=\"vehicle_id\"]")
    //*[@name="vehicle_id"]
    public WebElement createdVehicleName;

    @FindBy (xpath = "//button[@accesskey='k']")
    public WebElement kanbanButton;

    @FindBy (xpath = "//button[@accesskey='l']")
    public WebElement listButton;

    @FindBy (xpath = "//div/button[@class='btn btn-icon fa fa-lg fa-bar-chart o_cp_switch_graph']")
    public WebElement graphButton;

    @FindBy (xpath = "//button[@class='fa fa-chevron-right btn btn-icon o_pager_next']")
    public WebElement nextPageButton;

    @FindBy (xpath = "//button[@class='fa fa-chevron-left btn btn-icon o_pager_previous']")
    public WebElement previousPageButton;

    @FindBy (xpath = "//span[@class='o_pager_value']")
    public WebElement pageLimit;

    @FindBy (xpath = "//div/button[contains(text(),\"Attachment(s)\")]")
    public WebElement attachmentButton;

    @FindBy (xpath = "//div/button[contains(text(),\"Action\")]")
    public WebElement actionButton;

    @FindBy (xpath = "//span[@class='o_pager_limit']")
    public WebElement lastPageValue;

    @FindBy (xpath = "//input[@name='amount']")
    public WebElement activationCostButton;

    @FindBy (xpath = "//span[@name='amount']")
    public WebElement savedActivationCostValue;

    @FindBy (xpath = "//td[@class='o_data_cell o_list_number'][1]")
    public WebElement activationCostColumn;
}

package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Given;
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

    @FindBy (xpath = "//div/button[@class='fa fa-chevron-right btn btn-icon o_pager_next']")
    public WebElement nextPageButton;

    @FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr[last()]")
    public WebElement lastRow;

    @FindBy (xpath = "//*[@id=\"o_field_input_814\"]")
    public WebElement createdVehicleName;



}

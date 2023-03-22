package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CentrilliLoginPage {

    public CentrilliLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
        Driver.getDriver().get("https://qa.centrilli.com/");
    }

    @FindBy(name = "login")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//div/button[@class=\"btn btn-primary\"]")
    public WebElement loginButton;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[21]/ul[1]/li[4]/a/span")
    public WebElement vehiclesContractsButton;

    @FindBy(xpath = "//*[@id=\"menu_more_container\"]/a")
    public WebElement moreButton;

    @FindBy(xpath = "/html/body/nav/div[2]/ul[1]/li[19]/ul/li[3]/a/span")
    public WebElement fleetButton;


}

package com.hotelbooking.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RemoveReservationPageObjects {

    private final RemoteWebDriver driver;
    @FindBy(how = How.XPATH, using = "//input[@value='Delete']")
    public WebElement btnDelete;

    public RemoveReservationPageObjects(RemoteWebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickDeleteButton() {
        btnDelete.click();
    }

    public void deleteUserFromSystem(){
        clickDeleteButton();
    }
}

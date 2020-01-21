package com.hotelbooking.pages;

import com.hotelbooking.common.GenerateData;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelBookingPageObjects {

    private final RemoteWebDriver driver;

    @FindBy(how = How.CSS, using = "h1")
    public WebElement titleText;
    @FindBy(how = How.ID_OR_NAME, using = "firstname")
    public WebElement firstNameField;
    @FindBy(how = How.ID_OR_NAME, using = "lastname")
    public WebElement lastNameField;
    @FindBy(how = How.ID_OR_NAME, using = "totalprice")
    public WebElement priceField;
    @FindBy(how = How.CSS, using = "select#depositpaid")
    public WebElement depositPaidDropdown;
    @FindBy(how = How.XPATH, using = "(//input[contains(@class,'datepicker input')])[1]")
    public WebElement checkinDateField;
    @FindBy(how = How.XPATH, using = "(//input[contains(@class,'datepicker input')])[2]")
    public WebElement checkoutDateField;
    @FindBy(how = How.XPATH, using = "//input[@type='button']")
    public WebElement btnSave;
    @FindBy(how = How.XPATH, using = "//p[text()='ValidFirstname']")
    public WebElement getUserFirstNameText;


    public HotelBookingPageObjects(RemoteWebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setFirstName(String firstName){
        firstNameField.sendKeys(firstName);
    }

    public void setLastName(String lastName){
        lastNameField.sendKeys(lastName);
    }

    public void setPrice(String price){
        priceField.sendKeys(price);
    }

    public void selectDepositPaidOrNot(String paidDeposit){
        Select depositPaid = new Select(depositPaidDropdown);
        depositPaid.selectByVisibleText(paidDeposit);
    }

    public void selectCheckinDate() {
        checkinDateField.click();
        checkinDateField.sendKeys(GenerateData.getCurrentDate());
    }

    public void selectCheckoutDate() {
        checkoutDateField.click();
        checkoutDateField.sendKeys(GenerateData.getNextDate());
    }

    public void clickSaveBtn() {
        btnSave.click();
    }

    public String verifyUserAdded() {
        return getUserFirstNameText.getText();
    }

    public String getBookingFormTitle(){
        return titleText.getText();
    }

    public void validHotelReservation(String strFirstname, String strLastName, String strPrice, String strDeposit) { ;
        setFirstName(strFirstname);
        setLastName(strLastName);
        setPrice(strPrice);
        selectDepositPaidOrNot(strDeposit);
        selectCheckinDate();
        selectCheckoutDate();
        clickSaveBtn();
    }
}
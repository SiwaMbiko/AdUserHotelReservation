package com.careersilab.pages;

import com.careersilab.common.BasePage;
import com.careersilab.common.GenerateData;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ApplyOnlinePageObjects extends BasePage {

    @FindBy(how = How.XPATH, using = "//a[contains(@class,'wpjb-button wpjb-form-toggle')]")
    public WebElement btnApplyOnline;
    @FindBy(how = How.ID_OR_NAME, using = "applicant_name")
    public WebElement firstNameField;
    @FindBy(how = How.ID_OR_NAME, using = "email")
    public WebElement emailField;
    @FindBy(how = How.ID_OR_NAME, using = "phone")
    public WebElement phoneField;
    @FindBy(how = How.XPATH, using = "//input[@value='Send Application']")
    public WebElement sendButton;
    @FindBy(how = How.LINK_TEXT, using = "//li[text()='You need to upload at least one file.']")
    public WebElement validateUploadText;

    public ApplyOnlinePageObjects(RemoteWebDriver driver) {
        super(driver);
    }

    public void clickBtnApplyOnline() {
        btnApplyOnline.click();
    }

    public void setFirstName(String firstName){
        firstNameField.sendKeys(firstName);
    }

    public void setLastName(String email){
        emailField.sendKeys(email);
    }

    public void clickSendButton(){
        sendButton.click();
    }

    public void setPhoneNumber(){
        phoneField.sendKeys(GenerateData.PhoneNumber());
    }

    public String getValidateUploadText(){
        return validateUploadText.getText();
    }

    public void fillInDetails(String strFirstName, String emailAddress) {
        clickBtnApplyOnline();
        setFirstName(strFirstName);
        setLastName(emailAddress);
        setPhoneNumber();
        clickSendButton();
    }
}

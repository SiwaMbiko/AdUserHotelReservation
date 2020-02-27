package com.careersilab.pages;

import com.careersilab.common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CareersModulePageObjects extends BasePage {

    @FindBy(how = How.XPATH, using = "(//a[@href='https://www.ilabquality.com/careers/'])[1]")
    public WebElement careersLink;
    @FindBy(how = How.LINK_TEXT, using = "South Africa")
    public WebElement countryHyperlink;
    @FindBy(how = How.XPATH, using = "(//span[@class='wpjb-line-major']//a)[1]")
    public WebElement firstJobHyperlink;

    public CareersModulePageObjects(RemoteWebDriver driver) {
        super(driver);
    }

    public void clickCareersLink() {
        careersLink.click();
    }

    public void clickCountryLink() {
        countryHyperlink.click();
    }

    public void clickFirstJobHyperlink() {
        firstJobHyperlink.click();
    }

    public void testCareers() { ;
        clickCareersLink();
        clickCountryLink();
        clickFirstJobHyperlink();
    }
}

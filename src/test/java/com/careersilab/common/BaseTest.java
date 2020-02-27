package com.careersilab.common;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    public static RemoteWebDriver driver;

    protected static RemoteWebDriver getDriver() {
        return driver;
    }

    @BeforeSuite
    public void setup(){
        navigateToURL();
    }

    public void navigateToURL(){
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.ilabquality.com/");
    }

    @AfterSuite(alwaysRun = true)
    public void closeApplication()
    {
        driver.close();
        driver.quit();
    }
}
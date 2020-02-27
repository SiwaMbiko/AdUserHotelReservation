package com.careersilab.tests;

import com.careersilab.common.BaseTest;
import com.careersilab.pages.ApplyOnlinePageObjects;
import com.careersilab.pages.CareersModulePageObjects;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.careersilab.common.TestData.*;

public class CareersModuleTests extends BaseTest {
    CareersModulePageObjects careersModulePageObjects;
    ApplyOnlinePageObjects applyOnlinePageObjects;

    @Test(priority = 1, description = "")
    public void testCareersModule() {
        careersModulePageObjects = new CareersModulePageObjects(getDriver());
        applyOnlinePageObjects = new ApplyOnlinePageObjects(getDriver());
        careersModulePageObjects.testCareers();
        applyOnlinePageObjects.fillInDetails(FIRST_NAME,EMAIL);
        Assert.assertEquals(applyOnlinePageObjects.getValidateUploadText(), UPLOAD_DOCUMENT);
    }
}

package com.hotelbooking.tests;

import com.hotelbooking.common.BaseTest;
import com.hotelbooking.pages.HotelBookingPageObjects;
import com.hotelbooking.pages.RemoveReservationPageObjects;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.hotelbooking.common.TestData.*;

public class VerifyValidUserTest extends BaseTest {

    HotelBookingPageObjects pageObjects;
    RemoveReservationPageObjects removeReservationPageObjects;

    @Test(priority = 1)
    public void testHotelBookingFormLandingPage() {
        pageObjects = new HotelBookingPageObjects(getDriver());
        pageObjects.validHotelReservation(VALID_FIRST_NAME, VALID_SURNAME, VALID_PRICE, DEPOSIT_TRUE);
        Assert.assertEquals(pageObjects.getBookingFormTitle(), "Hotel booking form");
        Assert.assertEquals(pageObjects.verifyUserAdded(),VALID_FIRST_NAME);
    }

    @Test(priority = 2)
    public void deleteUserReservation() {
        removeReservationPageObjects = new RemoveReservationPageObjects(getDriver());
        removeReservationPageObjects.deleteUserFromSystem();
        Assert.assertTrue(true);
    }
}

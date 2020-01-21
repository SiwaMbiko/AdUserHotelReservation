package com.hotelbooking.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GenerateData {

    public static String getCurrentDate (){
        SimpleDateFormat currentDate = new SimpleDateFormat("YYYY-MM-DD");
        Date retrievedDate = new Date();
        String date = currentDate.format(retrievedDate);
        return date;
    }

    public static String getNextDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, 3);
        String newDate = sdf.format(cal.getTime());
        return newDate;
    }
}

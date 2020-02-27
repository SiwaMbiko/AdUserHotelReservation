package com.careersilab.common;

import java.util.Random;

public class GenerateData {

    public  static String PhoneNumber()
    {
        Random random=new Random();
        String code="076";
        int number1 = random.nextInt(999);
        int number2 = random.nextInt(10000);
        String phone = code +" "+number1+" "+number2;
        return phone;
    }
}

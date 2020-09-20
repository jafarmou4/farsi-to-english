package com.example;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String farsi = "٠٠٠١١٠١١۴۵٠٠٨٧۶١۴۵٠٠٨٧۶";
//        String farsi = "101211012154555455";
        String english = new BigDecimal("9" + farsi).toString().replaceFirst("9", "");
//        int num = Integer.parseInt(farsi);
        System.out.println("9" + farsi);
        System.out.println(english);
//        System.out.println(num);
//        System.out.println(getUSNumber(farsi));

        String body = "{\\\"karshenasiID\\\": " + 4376 + "}";
        System.out.println(body);
    }

    private static String getUSNumber(String Numtoconvert){

        NumberFormat formatter = NumberFormat.getInstance(Locale.US);
        try {
            if(Numtoconvert.contains("٫"))
                Numtoconvert=formatter.parse(Numtoconvert.split("٫")[0].trim())+"."+formatter.parse(Numtoconvert.split("٫")[1].trim());
            else
                Numtoconvert=formatter.parse(Numtoconvert).toString();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return Numtoconvert;
    }
}

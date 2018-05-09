package com.mxl.order;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderNo {

    public static synchronized String generateBusinessNo() {
        String currentDateTime = currentDateString("yyyyMMddHHmmssSSS");
        System.out.println(currentDateTime);
        String no =  currentDateTime +(int)(Math.random()*100);
//        System.out.println(OrderNumberUtil.class, "getFixLenthString orderNo="+no);
        return no;
    }

    public static String currentDateString(String pattern) {
        if (pattern == null){
            pattern = "yyyyMMddHHmmss";
        }
        return (new SimpleDateFormat(pattern).format(new Date()));
    }



}


package com.myright.infra.common;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static String formatDate(){
        return formatDate(new Date(), "yyyy-MM-dd HH:mm:ss");
    }
    public static String formatDate(String pattern){
        return formatDate(new Date(), pattern);
    }

    public static String formatDate(Date date, String pattern){
        return new SimpleDateFormat(pattern).format(date);
    }


}


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

    /**
     * 格式化日期 company111 - home111 - company222 - home222 - comopany333 - home333 - company444 - company555
     * @param date 日期
     * @param pattern 格式
     * @return s
     *
     *
     * master----------
     */
    public static String formatDate(Date date, String pattern){
        return new SimpleDateFormat(pattern).format(date);
    }


}

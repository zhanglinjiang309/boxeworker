package com.example.boxeworker.tool;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetSystemDateUtil {
    /**
     * 获取系统当前时间（年月日）
     * @return
     */
    public static String getDate(){
        Date date = new Date();
        SimpleDateFormat  format = new SimpleDateFormat("yyyyMMdd");
        return format.format(date);
    }

    /**
     * 获取系统当前时间（年-月-日）
     * @return
     */
    public static String getDateForTen(){
        Date date = new Date();
        SimpleDateFormat  format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(date);
    }

    /**
     * 获取系统当前时间（年月日时分秒）
     * @return
     */
    public static String getTime(){
        Date date = new Date();
        SimpleDateFormat  format = new SimpleDateFormat("yyyyMMddHHmmss");
        return format.format(date);
    }

    /**
     * 获取系统当前时间（年-月-日  时:分:秒）
     * @return
     */
    public static String getDateTime(){
        Date date = new Date();
        SimpleDateFormat  format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(date);
    }

    /**
     * 获取当前时间点 年度、月份、日、时、分
     *
     * @return
     */
    public static int getTiming(int timeFlag) { //Calendar.YEAR
        //添加年度  当前年度
        Calendar now = Calendar.getInstance();
        return now.get(timeFlag);
    }

    /**
     * 时间格式转换（年月日时分秒）
     * @return
     */
    public static String getFormatTime(Timestamp timestamp){
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        return format.format(timestamp);
    }
}

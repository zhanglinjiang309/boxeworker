package com.example.boxeworker.tool;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderCodeUtil {

    /**
     * 纸箱code
     * @return
     */
    public static String zxOrderCode(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMmm");
        String zxCode = "ZX" + date.getTime() + sdf.format(date);
        return zxCode;
    }
    /**
     * 平板code
     * @return
     */
    public static String pbOrderCode(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMmm");
        String pbCode = "PB" + date.getTime() + sdf.format(date);
        return pbCode;
    }
    /**
     * 辅料code
     * @return
     */
    public static String flOrderCode(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMmm");
        String flCode = "FL" + date.getTime() + sdf.format(date);
        return flCode;
    }
    /**
     * 耗材code
     * @return
     */
    public static String hcOrderCode(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMmm");
        String hcCode = "HC" + date.getTime() + sdf.format(date);
        return hcCode;
    }
    /**
     * 设计code
     * @return
     */
    public static String szOrderCode(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMmm");
        String szCode = "SZ" + date.getTime() + sdf.format(date);
        return szCode;
    }

    /**
     * 纸箱团卖
     * @return
     */
    public static String zxtOrderCode(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMmm");
        String szCode = "ZXT" + date.getTime() + sdf.format(date);
        return szCode;
    }

    /**
     * 纸板团卖
     * @return
     */
    public static String pbtOrderCode(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMmm");
        String szCode = "PBT" + date.getTime() + sdf.format(date);
        return szCode;
    }

    /**
     * 辅料团卖
     * @return
     */
    public static String fltOrderCode(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMmm");
        String szCode = "FLT" + date.getTime() + sdf.format(date);
        return szCode;
    }

    /**
     * 耗材团卖
     * @return
     */
    public static String hctOrderCode(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMmm");
        String szCode = "HCT" + date.getTime() + sdf.format(date);
        return szCode;
    }

    /**
     * 子单code
     * @return
     */
    public static String groupOrderCode(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMmm");
        String sonCode = "SON" + date.getTime() + sdf.format(date);
        return sonCode;
    }
}

package com.xiyo.selfhelp.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderUtil {
    /**
     * 获取新的订单号（hash值+时间）
     */
    public static String getNewOrderId(String diviceno){
        String result="",devicehash="",time="";
        String hash=String.valueOf(diviceno.hashCode());
        if (hash.length()<10){
            int line=(10-hash.length());
            for (int i=0;i<line;i++){
                hash=hash+"0";
            }
        }

        time=getTimeExpend();
        if (time.length()<10){
            int length=(10-time.length());
            for (int t=0;t<length;t++){
                time="0"+time;
            }
        }

        result=hash+time;

        return result;
    }
    /**
     * 将字符串转成hash值
     */
    public static String getTimeExpend(){
        //传入字串类型 2016/06/28 08:30
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm");
        String date=sdf.format(new java.util.Date());
        long longStart = getTimeMillis("2018/01/01 00:00"); //获取开始时间毫秒数
        long longEnd = getTimeMillis(date);  //获取结束时间毫秒数
        long longExpend = longEnd - longStart;  //获取时间差

        long longHours = longExpend / (10 * 1000); //根据时间差来计算小时数
//        long longMinutes = (longExpend - longHours * (60 * 60 * 1000)) / (60 * 1000);   //根据时间差来计算分钟数
        String min=String.valueOf(longHours);
        return min;
    }

    /**
     * 根据时间字符串获取毫秒数
     * @param strTime
     * @return
     */
    private static long getTimeMillis(String strTime) {
        long returnMillis = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        Date d = null;
        try {
            d = sdf.parse(strTime);
            returnMillis = d.getTime();
        } catch (ParseException e) {

        }
        return returnMillis;
    }
}

package com.iot.rashome.commons.util;

import java.text.ParseException;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

public class DateUtil {
    
    /**
     * 解析全部可能的日期格式
     * @param stringDate
     * @return
     * @throws ParseException
     */
    public static Date parseInAllPossiableFormat(String stringDate) throws ParseException {
        return DateUtils.parseDate(stringDate, 
        "yyyy-MM-dd HH:mm:ss", 
        "yyyy-MM-dd HH:mm",
        "yyyy-MM-dd HH",
        "yyyy-MM-dd",
        "yyyy-MM",
        "yyyy");
    }

    /**
     * 计算当前日期和目标日期在 秒 上面的差别, 正值代表当前日期较新, 反之同理
     * @param targetDate
     * @return 秒数差别
     */
    public static int dateDiffInSecond(Date targetDate) {
        return Math.round((new Date().getTime() - targetDate.getTime()) / 1000);
    }
}

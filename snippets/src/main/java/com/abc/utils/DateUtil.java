package com.abc.utils;

import java.util.Date;

/**
 * @author: liubo
 * @date: 2019-01-12 11:26
 * @description:
 **/
public final class DateUtil {
    /**
     * 被检测日期是否between(star,end)
     *
     * @param date  被检测日期
     * @param start 开始日期
     * @param end   结束日期
     * @return
     */
    public static boolean isDateInBetweenIncludingEndPoints(final Date date, final Date start, final Date end) {
        return date.compareTo(start) >= 0 && date.compareTo(end) <= 0;
//         return !(date.before(start) || date.after(end));
    }
}

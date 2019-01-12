package com.abc.utils;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class DateUtilTest {

    @Test
    public void isDateInBetweenIncludingEndPoints() throws ParseException {
        Date date = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateInString = "2019-01-11";

        Date start = formatter.parse(dateInString);

        String endInString = "2019-01-14";
        Date end = formatter.parse(endInString);

        String dateString = "2019-01-12";
        date = formatter.parse(dateString);


        boolean isBetween = DateUtil.isDateInBetweenIncludingEndPoints(date, start, end);


        System.out.println(isBetween);


    }
}
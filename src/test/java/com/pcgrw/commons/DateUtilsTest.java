package com.pcgrw.commons;

import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.*;

public class DateUtilsTest {

    @Test
    public void testGetDefaultFormatCurrentServerDate() {
        System.out.println(DateUtils.getDefaultFormatCurrentServerDate());
    }

    @Test
    public void testGetCurrentMonthFirstDay() throws ParseException {
        System.out.println(DateUtils.getCurrentMonthFirstDay("2018-06-20"));
    }

    @Test
    public void testGetNextMonthFirstDay() throws ParseException {
        System.out.println(DateUtils.getNextMonthFirstDay("2018-06-20"));
    }

    @Test
    public void testGetLastMonthFirstDay() throws ParseException {
        System.out.println(DateUtils.getLastMonthFirstDay("2018-06-20"));
    }

    @Test
    public void testGetCurrentMonthEndDay() throws ParseException {
        System.out.println(DateUtils.getCurrentMonthEndDay("2018-06-20"));
    }

    @Test
    public void testGetLastMonthEndDay() throws ParseException {
        System.out.println(DateUtils.getLastMonthEndDay("2018-06-20"));
    }

    @Test
    public void testGetNextMonthEndDay() throws ParseException {
        System.out.println(DateUtils.getNextMonthEndDay("2018-06-20"));
    }
}
package com.itheima.jdk8_time;

import java.time.LocalDate;

public class Test1_localDate {
    public static void main(String[] args) {
        // 0 获取本地日期对象(不可变对象)
        LocalDate ld = LocalDate.now();// 年 月 日
        System.out.println(ld);// 2024-07-30

        // 1. 获取日期对象中的信息
        int year = ld.getYear();// 年
        int month = ld.getMonthValue(); // 月 1-12
        int day = ld.getDayOfMonth();// 日
        int day0fYear = ld.getDayOfYear();// 一年中的第几天
        int day0fWeek = ld.getDayOfWeek().getValue();// 星期几
        System.out.println(year);
        System.out.println(day);
        System.out.println(day0fWeek);

        // 2.直接修改某个信息
        LocalDate ld2 = ld.withYear(2099);
        LocalDate ld3 = ld.withMonth(12);
        System.out.println(ld2);
        System.out.println(ld3);
        System.out.println(ld);

        // 3.把某个信息加多少
        LocalDate ld4 = ld.plusYears(2);
        LocalDate ld5 = ld.plusMonths(2);

        // 4.把某个信息减多少
        LocalDate ld6 = ld.minusYears(2);
        LocalDate ld7 = ld.minusMonths(2);

        // 5.获取指定日期的LocalDate对象
        LocalDate ld8 = LocalDate.of(2099,12,12);
        LocalDate ld9 = LocalDate.of(2099,12,12);

        // 6.判断2个日期对象，是否相等，在前还是在后
        System.out.println(ld8.equals(ld9));// true
        System.out.println(ld8.isAfter(ld));// true
        System.out.println(ld8.isBefore(ld));// false
    }
}

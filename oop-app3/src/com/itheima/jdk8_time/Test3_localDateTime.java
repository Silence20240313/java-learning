package com.itheima.jdk8_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test3_localDateTime {
    public static void main(String[] args) {
        // 0 获取本地日期和时间对象
        LocalDateTime ldt = LocalDateTime.now();// 年 月 日 时 分 秒 纳秒
        System.out.println(ldt);

        // 1. 可以获取日期和时间的全部信息
        int year = ldt.getYear();// 年
        int month = ldt.getMonthValue(); // 月
        int day = ldt.getDayOfMonth();// 日
        int day0fYear = ldt.getDayOfYear();// 一年中的第几天
        int day0fWeek = ldt.getDayOfWeek().getValue();// 星期几
        int hour = ldt.getHour();// 时
        int minute = ldt.getMinute();// 分
        int second = ldt.getSecond();// 秒
        int nano = ldt.getNano();// 纳秒

        // 2.修改时间信息
        LocalDateTime ldt2 = ldt.withYear(2029);
        LocalDateTime ldt3 = ldt.withMinute(59);

        // 3.加多少
        LocalDateTime ldt4 = ldt.plusYears(2);
        LocalDateTime ldt5 = ldt.plusMinutes(3);

        // 4.减多少
        LocalDateTime ldt6 = ldt.minusYears(2);
        LocalDateTime ldt7 = ldt.minusMinutes(3);

        // 5.获取指定日期和时间的LocalDateTime对象
        LocalDateTime ldt8 = LocalDateTime.of(2029,12,12,12,12,12,12);
        LocalDateTime ldt9 = LocalDateTime.of(2029,12,12,12,12,12,12);

        // 6.判断2个日期，时间对象，是否相等，在前还是在后
        System.out.println(ldt9.equals(ldt8));
        System.out.println(ldt9.isAfter(ldt));
        System.out.println(ldt9.isBefore(ldt));

        // 7.可以把LocalDateTime转换成LocalDate和LocalTime
        LocalDate ld =  ldt.toLocalDate();
        LocalTime lt =  ldt.toLocalTime();
        LocalDateTime ldt10 = LocalDateTime.of(ld,lt);
    }
}

package com.itheima.jdk8_time;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test2_LocalTime {
    public static void main(String[] args) {
        // 0 获取本地时间对象
        LocalTime lt = LocalTime.now();// 时 分 秒 纳秒 不可变的
        System.out.println(lt);// 17:53:46.119306900

        // 1. 获取时间中的信息
        int hour = lt.getHour();
        int minute = lt.getMinute();
        int second = lt.getSecond();
        int nano = lt.getNano();

        // 2.修改时间
        LocalTime lt3 = lt.withHour(10);
        LocalTime lt4 = lt.withMinute(10);
        LocalTime lt5 = lt.withSecond(10);
        LocalTime lt6 = lt.withNano(10);

        // 3.加多少
        LocalTime lt7 = lt.plusHours(10);
        LocalTime lt8 = lt.plusMinutes(10);
        LocalTime lt9 = lt.plusSeconds(10);
        LocalTime lt10 = lt.plusNanos(10);


        // 4.减多少
        LocalTime lt11 = lt.minusHours(10);
        LocalTime lt12 = lt.minusMinutes(10);
        LocalTime lt13 = lt.minusSeconds(10);
        LocalTime lt14 = lt.minusNanos(10);

        // 5.获取指定时间的LocalTime对象
        LocalTime lt15 = LocalTime.of(12,12,12);
        LocalTime lt16 = LocalTime.of(12,12,12);


        // 6.判断2个时间对象，是否相等，在前还是在后
        System.out.println(lt15.equals(lt16));
        System.out.println(lt15.isAfter(lt));
        System.out.println(lt15.isBefore(lt));
    }
}

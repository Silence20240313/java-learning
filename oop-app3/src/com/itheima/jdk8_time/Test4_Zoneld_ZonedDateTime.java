package com.itheima.jdk8_time;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.TimeZone;

public class Test4_Zoneld_ZonedDateTime {
    public static void main(String[] args) {
        // TODO 时区和带时区的时间
        // 1.常见方法
        // 获取系统默认的时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId.getId());
        System.out.println(zoneId);

        // 获取java支持的全部时区ID
        System.out.println(ZoneId.getAvailableZoneIds());

        // 把某个时区ID封装成ZoneId对象
        ZoneId zoneId1 = ZoneId.of("Asia/Aden");

        // 2.带时区的时间
        // 获取某个时区的ZonedDateTime对象
        ZonedDateTime now = ZonedDateTime.now(zoneId1);
        System.out.println(now);

        ZonedDateTime now1 = ZonedDateTime.now(Clock.systemUTC());
        System.out.println(now1);

        // 获取系统默认时区的ZonedDateTime对象
        ZonedDateTime now2 = ZonedDateTime.now();
        System.out.println(now2);

        // Calendar instance = Calendar.getInstance(TimeZone.getTimeZone(zoneId));
    }
}
